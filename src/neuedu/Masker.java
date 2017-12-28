package neuedu;

import java.util.Date;

/**
 * Created by ttc on 17-12-27.
 */
public class Masker
{
    private Integer masker_id;
    private String masker_name;
    private String masker_password;
    private String masker_x1;
    private String masker_x2;
    private String masker_x3;
    private String masker_x4;
    private String masker_x5;
    private String masker_x6;
    private String masker_x7;
    private String masker_x8;

    public Masker()
    {
    }

    public Integer getMasker_id()
    {
        return masker_id;
    }

    public void setMasker_id(Integer masker_id)
    {
        this.masker_id = masker_id;
    }

    public String getMasker_name()
    {
        return masker_name;
    }

    public void setMasker_name(String masker_name)
    {
        this.masker_name = masker_name;
    }

    public String getMasker_password()
    {
        return masker_password;
    }

    public void setMasker_password(String masker_password)
    {
        this.masker_password = masker_password;
    }

    public String getMasker_x1()
    {
        return masker_x1;
    }

    public void setMasker_x1(String masker_x1)
    {
        this.masker_x1 = masker_x1;
    }

    public String getMasker_x2()
    {
        return masker_x2;
    }

    public void setMasker_x2(String masker_x2)
    {
        this.masker_x2 = masker_x2;
    }

    public String getMasker_x3()
    {
        return masker_x3;
    }

    public void setMasker_x3(String masker_x3)
    {
        this.masker_x3 = masker_x3;
    }

    public String getMasker_x4()
    {
        return masker_x4;
    }

    public void setMasker_x4(String masker_x4)
    {
        this.masker_x4 = masker_x4;
    }

    public String getMasker_x5()
    {
        return masker_x5;
    }

    public void setMasker_x5(String masker_x5)
    {
        this.masker_x5 = masker_x5;
    }

    public String getMasker_x6()
    {
        return masker_x6;
    }

    public void setMasker_x6(String masker_x6)
    {
        this.masker_x6 = masker_x6;
    }

    public String getMasker_x7()
    {
        return masker_x7;
    }

    public void setMasker_x7(String masker_x7)
    {
        this.masker_x7 = masker_x7;
    }

    public String getMasker_x8()
    {
        return masker_x8;
    }

    public void setMasker_x8(String masker_x8)
    {
        this.masker_x8 = masker_x8;
    }

    @Override
    public String toString()
    {
        return "[" + this.masker_id + "," + this.masker_name + "," + this.masker_password +
                "," + this.masker_x1+"," + this.masker_x2+ "," + this.masker_x3 +
                "," + this.masker_x4 +"," + this.masker_x5+"," + this.masker_x6 +
                "," + this.masker_x7 +"]";
    }
}
