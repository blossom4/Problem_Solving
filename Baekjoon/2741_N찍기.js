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
// #2741  N 찍기

// https://www.acmicpc.net/problem/2741


const N = Number(input())
const answer = []

for (let i = 1; i < N + 1; i++) answer.push(i)
console.log(answer.join('\n'))