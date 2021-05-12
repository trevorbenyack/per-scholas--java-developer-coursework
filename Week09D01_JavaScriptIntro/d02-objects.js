let person01 = {}; // This is an empty object
console.log(typeof Person);

let person02 = "ABC";
console.log(typeof person);

// Object literal
// firstName is called a property
const person03 = {
    firstName: "Louisa",
    lastName: "Molin",
    age: 16
}

// Slide09:
let empty = {};
let point = { x: 0, y: 0 };
let point2 = { x: point.x, y: point.y+1 };
let book = {
    "main title": "JavaScript",
    'sub-title': "The definitive Guide",
    "for": "all audiences",
    author: {
        firstName: "David",
        "surname": "Flanagan"
    },
    "location": {
        "city": "Pittsburgh",
        state: "Pennsylvania"
    }
};
console.log(point2);
console.log(book);
console.log(book.author.firstName);
console.log(book["location"].state);
console.log(book.author["surname"]);

// this keyword
function Car(model, make, color, year) {
    this.model = model;
    this.make = make;
    this.color = color;
    this.year = year;
}

// prototypes
var simpleObj = function(c) {
    this.city = c;
}

var live1 = new simpleObj("Brooklyn");
var live2 = new simpleObj("Bronx");
simpleObj.prototype.state = "New York";
console.log(live1);
console.log(live2);
simpleObj.prototype.country = undefined;
console.log(live1);
live2.country = "France";
console.log(live2);

// arrays
var mix_of_types = [{key1: "value1"}, {key2: "value2"}];
console.log(mix_of_types[0]["key1"]);

