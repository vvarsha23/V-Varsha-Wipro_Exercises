var Calculator = /** @class */ (function () {
    function Calculator() {
    }
    Calculator.prototype.add = function (a, b) {
        return a + b;
    };
    Calculator.prototype.subtract = function (a, b) {
        return a - b;
    };
    return Calculator;
}());
var calc = new Calculator();
console.log("Add 10 + 5 =", calc.add(10, 5));
console.log("Subtract 10 - 5 =", calc.subtract(10, 5));
