var globalVar = "var (global)";
let globalLet = "let (global)";
const globalConst = "const (global)";

console.log("Global Scope:");
console.log(globalVar);
console.log(globalLet);
console.log(globalConst);

function testScope() {

  if (true) {
    var functionVar = "var inside block";
    let blockLet = "let inside block";
    const blockConst = "const inside block";

    console.log("\nInside if block:");
    console.log(functionVar);
    console.log(blockLet);
    console.log(blockConst); 
  }

  console.log("\nInside function after if block:");
  console.log(functionVar);
}

testScope();

console.log("\nReassignment Test:");

var a = 10;
var a = 20;
console.log("var a:", a);

let b = 30;
b = 35;
console.log("let b:", b);

const c = 50;
console.log("const c:", c);
