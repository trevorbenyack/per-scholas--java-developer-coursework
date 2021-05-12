var fruits = ["banana", "orange", "apple", "Mango"];
console.log(fruits);

fruits.splice(2, 0, "lemon", "kiwi");
console.log(fruits);

// wtf?
var numbers = [1, 2, 3, 4];
var squares = [];
// for(let i = 0; i < numbers.length; i++) {
//     squares[i] = numbers[i]**2;
// }

for(fruit of fruits) {
    console.log("in the for/in loop: " + fruit);
}

// for/of uses values
for(n of numbers) {
    console.log(`n is ${n}`);
    squares.push(n**2);
}

// squares.push(numbers[0]**2);
// squares.push(numbers[1]**2);
// squares.push(numbers[2]**2);
// squares.push(numbers[3]**2);
console.log(numbers);
console.log(squares);

var person = {fname:"John", lname:"Doe", age:25};

// for/in uses property names/index
for (x in person) {
  console.log(x);
}


// console.log(input);

// console.log(prompt("Enter an integer"));

// if (input > 0 && input < 100) {
//     console.log("that's right!");
// }

// let input = prompt("Enter an integer");
// let exit = true;
// while (exit) {
    
//     if(input < 0 || input > 100) {
//         input = prompt("Please re-enter");
//     } else {
//         exit = false;
//     }


// } 
// console.log("good job!");

var a = [1, 2, 3];

// .join() concats array elements into a string
// x is a string
var x = a.join(" xxx ");

var y = "";
y = y + a[0];
y = y + " xxx "


console.log(x);
var i = 8;
console.log(`x at ${i} is ${x[i]}`);

var z = x.split(" xxx ");
console.log(x);
console.log(z);

z.reverse();
console.log(z);

console.log(a.reverse().join(" "));
console.log(a);

var b = new Array("banana", "cherry", "apple");
console.log(b);
b.sort();
console.log(b);
console.log(b.join(" "));

var c = [1, 2, 3, 4, 5];
console.log(c.slice(0, 4));
console.log(c.slice(0, -2));
console.log(c.slice(-3, -2));
