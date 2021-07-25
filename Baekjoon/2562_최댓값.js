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
// #2562  최댓값

// https://www.acmicpc.net/problem/2562

let maxNumber = -1
let maxNumberIndex = -1
for (let i = 1; i < 10; i++) {
  let number = Number(input())
  if (number > maxNumber) {
    maxNumber = number
    maxNumberIndex = i
  }
}

console.log(maxNumber)
console.log(maxNumberIndex)