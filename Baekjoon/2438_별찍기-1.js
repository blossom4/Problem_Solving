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
// #2438  별 찍기 - 1

// https://www.acmicpc.net/problem/2438


const N = Number(input())
let temp = ''
let ans = ''
for (let i = 0; i < N; i++) {
  temp += '*'
  ans += temp
  if (i != N) ans += '\n'
}

console.log(ans)