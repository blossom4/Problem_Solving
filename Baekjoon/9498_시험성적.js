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
// #9498  시험 성적

// https://www.acmicpc.net/problem/9498


const score = Number(input())
if (score >= 90) console.log('A')
else if (score >= 80) console.log('B')
else if (score >= 70) console.log('C')
else if (score >= 60) console.log('D')
else console.log('F')