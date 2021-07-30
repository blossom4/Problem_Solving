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
// #2439  별 찍기 - 2

// https://www.acmicpc.net/problem/2438


const N = Number(input())
let space = ' '
let star = '*'
let ans = ''

// N줄에 걸쳐 별찍기 반복
for (let i = 0; i < N; i++) {
  // 공백부터 찍고 줄마다 반복횟수 -1
  for (let j = 0; j < N - i - 1; j++) {
    ans += space
  }
  // 공백 이후 별찍고 별 +1
  ans += star
  star += '*'
  if (i != N) ans += '\n'
}

console.log(ans)