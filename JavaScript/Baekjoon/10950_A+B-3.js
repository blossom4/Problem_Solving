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
// #10950  A+B - 3

// https://www.acmicpc.net/problem/10950


const T = Number(input())
const answer = []
for (let t = 1; t < T + 1; t++) {
  let AB = input().split(' ').map(Number)
  answer.push(AB[0] + AB[1])
}

console.log(answer.join('\n'))