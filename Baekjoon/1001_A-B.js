////////////////////////////////////////////////////////////

// Input and Output
const fs = require("fs");
const stdin = (
  process.platform === "linux"
    ? fs.readFileSync("/dev/stdin").toString()
    : ``
).split("\n");

const input = (() => {
  let line = 0;
  return () => stdin[line++];
})();

////////////////////////////////////////////////////////////


// Baekjoon JavaScript 
// #1001  A - B

// https://www.acmicpc.net/problem/1001


const AB = input().split(' ')
const res = Number(AB[0]) - Number(AB[1])

console.log(res)