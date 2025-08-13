const names = ["Alice", "Jonathan", "Bob", "Christine", "Eva", "Michael", "Sam"];
const filteredUpperNames = names
  .filter(name => name.length > 5)
  .map(name => name.toUpperCase());
console.log("Original Names:", names);
console.log("Filtered & Uppercased Names:", filteredUpperNames);
