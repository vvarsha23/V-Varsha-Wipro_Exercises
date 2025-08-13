const people = [
  { name: "Alice", age: 25, city: "New York" },
  { name: "Bob", age: 16, city: "Chicago" },
  { name: "Charlie", age: 30, city: "Los Angeles" },
  { name: "Daisy", age: 17, city: "Houston" },
  { name: "Ethan", age: 20, city: "Miami" }
];
const eligibleVoters = people.filter(person => person.age >= 18);
console.log("Original People List:", people);
console.log("Eligible Voters:", eligibleVoters);
