function sayHello() {
                alert("you are stupid");
            }

function func() {
    alert("say bye and goodbye");
}

document.write("who are You");
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