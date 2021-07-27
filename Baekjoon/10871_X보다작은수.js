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
// #10871  X보다 작은 수

// https://www.acmicpc.net/problem/10871


const num_NX = input().split(' ').map(Number)
const arr_A = input().split(' ').map(Number)
let N = num_NX[0]
let X = num_NX[1]
const answer = []

for (let i = 0; i < N; i++) {
  if (arr_A[i] < X) answer.push(arr_A[i])
}

console.log(answer.join(' '))