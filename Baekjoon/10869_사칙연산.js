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
// #10869  사칙연산

// https://www.acmicpc.net/problem/10869


const numberAB = input().split(' ').map(Number)
let answer = []

answer.push(numberAB[0] + numberAB[1])
answer.push(numberAB[0] - numberAB[1])
answer.push(numberAB[0] * numberAB[1])
answer.push(parseInt(numberAB[0] / numberAB[1]))
answer.push(numberAB[0] % numberAB[1])

console.log(answer.join('\n'))