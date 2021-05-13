// DATE
var d = new Date(2011, 11, 24);
console.log(d);

var input = prompt("Enter a range (in the form 23 34)");
var range = input.split(" ");
var guess = (Math.floor(Math.floor() * (Number(range[1]) - Number(range[0])) + Number(range[0])));
console.log(guess);
var stopper = 0;
var userGuess = prompt(`Guess a number between ${range[0]} and ${range[1]}`);
while (stopper <= 10 ) {
    if (guess == userGuess) {
        alert("You got it: " + userGuess);
        break;
    }
    userGuess = prompt(`Keep guessing a number between ${range[0]} and ${range[1]}`);
}

if (guess != userGuess) {
    alert("Sorry, the answer was " + guess);
}

