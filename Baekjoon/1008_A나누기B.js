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
// #1008  A / B

// https://www.acmicpc.net/problem/1008


const AB = input().split(' ')
const res = Number(AB[0]) / Number(AB[1])

console.log(res)