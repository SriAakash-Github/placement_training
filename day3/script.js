function sayHello() {
                alert("you are stupid");
            }

function func() {
    alert("say bye and goodbye");
}

// document.write("who am I");
function myName() {
    alert("my name is aakash");
}
function getValue() {
    var name = prompt("enter your name , Your name is:");
    document.write("your name is " + name);
}

function getValue2() {
    var name = prompt("enter your name , Your name is:");
    document.getElementById("demo").innerHTML = "your name is " + name;
}

function getColor() {
    var color = document.getElementById("mycolor").value;
    alert(color);
}

function getDate() {
    var date = document.getElementById("mydate").value;
    alert(date);
}

function getDateTime() {
    var datetime = document.getElementById("mydatetime").value;
    alert(datetime);
}

function getEmail() {
    var email = document.getElementById("myemail").value;
    alert(email);
}

function getMonth() {
    var month = document.getElementById("mymonth").value;
    alert(month);
}
function getRange() {
    var range = document.getElementById("myrange").value;
    alert(range);
}

function getTime() {
    var time = document.getElementById("mytime").value;
    alert(time);
}

function getsearch() {
    var search = document.getElementById("mysearch").value;
    alert(search);
}   

function getTel() {
    var tel = document.getElementById("mytel").value;
    alert(tel);
}

function getUrl() {
    var url = document.getElementById("myurl").value;
    alert(url);
}

function getWeek() {
    var week = document.getElementById("myweek").value;
    alert(week);
}