////////////////////////////////////////////////////////////

// Input Templete
const fs = require("fs");
const stdin = (
  process.platform === "linux"
    ? fs.readFileSync("/dev/stdin").toString()
    // Test-Case Input Between Backticks(``)
    : ``
).split("\n");

const input = (() => {
  let line = 0;
  return () => stdin[line++];
})();

////////////////////////////////////////////////////////////


// Baekjoon JavaScript 
// ##2577  숫자의 개수

// https://www.acmicpc.net/problem/2577


const A = Number(input())
const B = Number(input())
const C = Number(input())
const multipliedNumber = String(A * B * C)
const numbers = new Array(10).fill(0)

for (let i = 0; i < multipliedNumber.length; i++) {
  numbers[Number(multipliedNumber[i])]++
}

console.log(numbers.join('\n'))