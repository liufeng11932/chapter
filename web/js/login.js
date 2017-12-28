//用户名验证
function chkusername() {
    var o = document.getElementById("nametips");
    var input = document.getElementById("username");

    //patt.test(input) --> true  /^[0-9]{4,8}$/
    if (input.value != "" && input.value != "abc") {
        o.innerHTML = "用户名已占用"
    }
}

function clearnametips() {
    var o = document.getElementById("nametips");
    o.innerHTML = ""
}

//密码验证
function chkpassword() {
    var o = document.getElementById("passwordtips");
    var input = document.getElementById("password");

    //patt.test(input) --> true  /^[0-9]{4,8}$/
    if (input.value != "" && input.value != "123") {
        o.innerHTML = "密码格式错误"
    }
}

function clearpsdtips() {
    var o = document.getElementById("passwordtips");
    o.innerHTML = ""
}

//验证码验证
function chkpassword() {
    var o = document.getElementById("yzmtips");
    var input = document.getElementById("captcha");

    //patt.test(input) --> true  /^[0-9]{4,8}$/
    if (input.value != "" && input.value != "nk6p") {
        o.innerHTML = "验证码错误"
    }
}

function clearpsdtips() {
    var o = document.getElementById("yzmtips");
    o.innerHTML = ""
}

//检验输入内容是否有错误，如果有错误就不提交表单
function login() {
    var n = document.getElementById("nametips").innerHTML;
    var p = document.getElementById("passwordtips").innerHTML;
    var y = document.getElementById("yzmtips").innerHTML;

    if (n == "" && p == "" && y == "") {
        return true;
    }

    return false;

}

function clearErrInfo() {
    var o = document.getElementById("h2");
    o.innerHTML = "";
}







