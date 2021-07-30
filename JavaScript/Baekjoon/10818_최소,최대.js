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
// #10818  최소, 최대

// https://www.acmicpc.net/problem/10818


const number = Number(input())
const numbers = input().split(' ').map(Number)
let maxNumber = -1000000
let minNumber = 1000000
const answer = []
for (let i = 0; i < number; i++) {
  if (numbers[i] > maxNumber) maxNumber = numbers[i]
  if (numbers[i] < minNumber) minNumber = numbers[i]
}
answer.push(minNumber)
answer.push(maxNumber)

console.log(answer.join(' '))