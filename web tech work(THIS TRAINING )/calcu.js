const firstTextBox = document.getElementById('first');
const secondTextBox = document.getElementById('second');
var nam=prompt("Enter your good name please :) ");
var flag;

function add() {

    let a = Number(firstTextBox.value);
    let b = Number(secondTextBox.value);

    var c = a + b;
    alert("Hey " + nam+  " RESULT of " + a + "+" + b + " = " + c  + "\n  thank you :) ")
}
function sub() {

    let a = Number(firstTextBox.value);
    let b = Number(secondTextBox.value);

    var c = a - b;
    alert("RESULT of " + a + "-" + b + " = " + c)
}
function mul() {

    let a = Number(firstTextBox.value);
    let b = Number(secondTextBox.value);

    var c = a * b;
    alert("RESULT of " + a + "*" + b + " = " + c)
}
function div() {
    let a = Number(firstTextBox.value);
    let b = Number(secondTextBox.value);

    var c = a / b;
    alert("RESULT of " + a + "/" + b + " = " + c)
}
function pow() {

    let a = Number(firstTextBox.value);
    let b = Number(secondTextBox.value);

    var c = a ** b;
    alert("RESULT of " + a + "**" + b + " = " + c)
}

function firstInputSelected() {
    flag = 'first';
}

function secondInputSelected() {
    flag = 'second';
}

function clearAll() {
    firstTextBox.value = '';
    secondTextBox.value = '';
}

function onPressDigitButton(val) {

    if (flag == 'first') {
        firstTextBox.value = firstTextBox.value + val;
    }

    if (flag == 'second') {
        secondTextBox.value = secondTextBox.value + val;
    }


}