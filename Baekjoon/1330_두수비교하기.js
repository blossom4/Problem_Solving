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
// #1330  두 수 비교하기

// https://www.acmicpc.net/problem/1330


const AB = input().split(' ')

if (Number(AB[0]) > Number(AB[1])) {
  console.log('>')
} else if (Number(AB[0]) < Number(AB[1])) {
  console.log('<')
} else {
  console.log('==')
}