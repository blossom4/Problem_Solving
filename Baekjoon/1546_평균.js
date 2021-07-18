////////////////////////////////////////////////////////////

// Input and Output
const fs = require("fs");
const stdin = (
  process.platform === "linux"
    ? fs.readFileSync("/dev/stdin").toString()
    : `4
1 100 100 100`
).split("\n");

const input = (() => {
  let line = 0;
  return () => stdin[line++];
})();

////////////////////////////////////////////////////////////


// Baekjoon JavaScript 
// #1546 평균

// https://www.acmicpc.net/problem/1546


const N = Number(input())
// .map(Number)을 뒤에 붙이면 문자열 숫자배열이 정수 숫자배열로 바뀌어서 들어간다.
const scores = input().split(' ').map(Number)
// reduce함수로 최대점수가 몇점인지 계산한다.
const maxScore = scores.reduce(function max(a, b) {
  return Math.max(a, b)
})

let total = 0
for (let i = 0; i < N; i++) {
  total += (scores[i] / maxScore) * 100
}

console.log((total / N), typeof(total / N))