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
// #11720  숫자의 합

// https://www.acmicpc.net/problem/11720


const N = Number(input())
const numArray = input().split('').map(Number)
let sum = 0

for (let i = 0; i < numArray.length; i++) {
  sum += numArray[i]
}

console.log(sum)