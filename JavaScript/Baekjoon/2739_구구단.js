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
// #2739  구구단

// https://www.acmicpc.net/problem/2739


const N = Number(input())
const timesTable = []
for (let i = 1; i < 10; i++) {
  console.log(N + ' ' + '*' + ' ' + i + ' ' + '=' + ' ' + N * i)
}