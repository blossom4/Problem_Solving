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
// #10952  A+B - 5

// https://www.acmicpc.net/problem/10952


const answer = []

while (1) {
  const [A, B] = input().split(' ').map(Number)
  if (A == 0 && B == 0) break
  answer.push(A + B)
}

console.log(answer.join('\n'))