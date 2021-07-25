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
// #2475  검증수

// https://www.acmicpc.net/problem/2475


const N = input().split(' ').map(Number)
let total = 0

for (let i = 0; i < 5; i++) {
  total += N[i] ** 2
}

console.log(total % 10)