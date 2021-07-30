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
// #8958  OX퀴즈

// https://www.acmicpc.net/problem/8958


const testCase = Number(input())
let answer = []
for (let t = 1; t < testCase + 1; t++) {
  let totalScore = 0
  let currentScore = 1
  let correct = input()
  for (let i = 0; i < correct.length; i++) {
    // 정답을 맞추면 현재 얻을수 있는 점수를 더하고 현재 얻을수 있는 점수를 1씩 누적해준다.
    if (correct[i] == 'O') {
      totalScore += currentScore
      currentScore++
    } else {
      currentScore = 1
    }
  }
  answer.push(totalScore)
}

console.log(answer.join('\n'))