console.log("This will display in the console");

let num = 1;
console.log(++num);

// While loop example, JavaScript slides 01pg32
let balance = 10000;
let year = 0;
const interestRate = 0.05

while(balance <= 20000) {

    year++;
    console.log(`year is ${year}`);
    const oldBalance = balance;
    const interest = oldBalance * interestRate;
    balance = oldBalance + interest;

}

console.log(`It will take ${year} year(s) to reach a balance of $20,000`);