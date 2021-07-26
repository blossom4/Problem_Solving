////////////////////////////////////////////////////////////

// Input Templete
const fs = require("fs");
const stdin = (
  process.platform === "linux"
    ? fs.readFileSync("/dev/stdin").toString()
    // Test-Case Input Between Backticks(``)
    : `1
2
3
4
5
6
7
8
9
10`
).split("\n");

const input = (() => {
  let line = 0;
  return () => stdin[line++];
})();

////////////////////////////////////////////////////////////


// Baekjoon JavaScript 
// #3052  나머지

// https://www.acmicpc.net/problem/3052


const remains = []
for (let i = 0; i < 10; i++) {
  let number = Number(input())
  remains.push(number % 42)
}

// Set는 길이를 length가 아니라 size로 구한다.
const answer = new Set(remains).size
console.log(answer)