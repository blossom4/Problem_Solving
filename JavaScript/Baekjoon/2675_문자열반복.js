////////////////////////////////////////////////////////////

// Input Templete
const fs = require("fs");
const stdin = (
  process.platform === "linux"
    ? fs.readFileSync("/dev/stdin").toString()
    // Test-Case Input Between Backticks(``)
    : `2
3 ABC
5 /HTP`
).split("\n");

const input = (() => {
  let line = 0;
  return () => stdin[line++];
})();

////////////////////////////////////////////////////////////


// Baekjoon JavaScript 
// #2675  문자열 반복

// https://www.acmicpc.net/problem/2675


const testCase = Number(input())
const answer = []
let result = ''

for (let t = 1; t < testCase + 1; t++) {
  let inputInfo = input().split(' ')
  let repeatNumber = Number(inputInfo[0])
  let repeatString = inputInfo[1]

  // 문자열 내의 각 문자를 반복횟수만큼 result에 더해주고 answer 배열에 추가한다.
  for (let s = 0; s < repeatString.length; s++) {
    for (let n = 1; n < repeatNumber + 1; n++) {
      result += repeatString[s]
    }
  }
  answer.push(result)
  result = ''
}

console.log(answer.join('\n'))