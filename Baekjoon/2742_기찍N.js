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
// #2742  기찍 N

// https://www.acmicpc.net/problem/2742


const N = Number(input())
const answer = []

for (let i = N; i > 0; i--) answer.push(i)
console.log(answer.join('\n'))