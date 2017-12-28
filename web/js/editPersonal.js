//处理修改按钮
function modify() {
    var o = document.getElementsByClassName("fildtext");

    for (var i = 0; i < o.length; i++) {
        o[i].removeAttribute("disabled");
        o[i].removeAttribute("readonly");

        //为可修改的内容加上边框
        //在更改class属性时，使用className来更改，注意新增的类名前要有空格
        o[i].className += " add-border"; //class="select fildtext add-border"
    }
}

//省、市二级联动
function shengshi() {
    var sheng = document.getElementById("province");

    if (sheng.value == "辽宁省") {
        var shi = document.getElementById("city");

        shi.innerHTML = ""; //清空内容

        var t = ["沈阳市", "大连市", "鞍山市", "本溪市"];

        for (var i = 0; i < t.length; i++) {
            shi.innerHTML += "<option value='" + t[i] + "'>" + t[i] + "</option>";
        }
    }

    if (sheng.value == "吉林省") {
        var shi = document.getElementById("city");

        shi.innerHTML = ""; //清空内容

        var t = ["长春市", "四平市", "吉林市"];

        for (var i = 0; i < t.length; i++) {
            shi.innerHTML += "<option value='" + t[i] + "'>" + t[i] + "</option>";
        }
    }
}













