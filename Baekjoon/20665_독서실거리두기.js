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
// #20665  독서실 거리두기

// https://www.acmicpc.net/problem/20665

const N = 5
const seat = new Array(N - 1).fill(0)

seat[0] = 1
seat[N - 1] = 1

for (let i = 0; i < N - 2; i++) {
  let next_index = parseInt(N / 2)
  seat[next_index]++
}

console.log(seat)