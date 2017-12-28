package neuedu;

import com.alibaba.fastjson.JSON;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import static neuedu.DBUtil.conn;
import static neuedu.DBUtil.connedDB;

/**
 * Created by ttc on 17-12-27.
 */
@WebServlet("/ServletDemo3")
public class ServletDemo3 extends HttpServlet
{
//    private Masker masker = new Masker();


    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {
        HttpSession hs = request.getSession();
        try
        {


            String name = request.getParameter("name"); //获得页面登陆是用户名
            String password = request.getParameter("password"); //获得页面登陆是密码；

            Connection conn = connedDB();
            String sql = "select * from USER_ACCOUNT where user_name = ? AND user_password= ?";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, name);
            ps.setString(2, password);
            ResultSet rs = ps.executeQuery();
            if (rs.next())
            {
//                masker.setMasker_id(rs.getInt("masker_id"));
//                masker.setMasker_name(rs.getString("masker_name"));
//                masker.setMasker_password(rs.getString("masker_password"));
//                masker.setMasker_x1(rs.getString("masker_x1")) ;
//                masker.setMasker_x2(rs.getString("masker_x2")) ;
//                masker.setMasker_x3(rs.getString("masker_x3")) ;
//                masker.setMasker_x4(rs.getString("masker_x4")) ;
//                masker.setMasker_x5(rs.getString("masker_x5")) ;
//                masker.setMasker_x6(rs.getString("masker_x6")) ;
//                masker.setMasker_x7(rs.getString("masker_x7")) ;

                Masker masker = new Masker();
                masker.setMasker_id(1);
                masker.setMasker_name("gaga");
                masker.setMasker_password("123456");

                String json = JSON.toJSONString(masker);


                hs.setAttribute("JSON", json);
                response.sendRedirect("../page/h.jsp");

            } else
            {
                hs.setAttribute("diss","用户不存在！");
                response.sendRedirect("../page/login2.jsp");
            }
        } catch (ClassNotFoundException e)
        {
            e.printStackTrace();
        } catch (SQLException e)
        {
            e.printStackTrace();
        }
    }


    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {
        doPost(request, response);
    }
}
