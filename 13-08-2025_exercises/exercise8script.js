const employees = [
  { name: "Alice", role: "Manager", empId: 101, salary: 80000 },
  { name: "Bob", role: "Developer", empId: 102, salary: 60000 },
  { name: "Charlie", role: "Manager", empId: 103, salary: 90000 },
  { name: "Daisy", role: "QA", empId: 104, salary: 55000 },
  { name: "Ethan", role: "Manager", empId: 105, salary: 85000 }
];
const managers = employees.filter(emp => emp.role === "Manager");
const totalManagerSalary = managers.reduce((total, emp) => total + emp.salary, 0);
console.log("Employees:", employees);
console.log("Managers:", managers);
console.log("Total Salary of Managers:", totalManagerSalary);