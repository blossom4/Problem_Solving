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
// #10171  고양이

// https://www.acmicpc.net/problem/10171


let answer = []
answer.push('\\    /\\')
answer.push(' )  ( \')')
answer.push('(  /  )')
answer.push(' \\(__)|')

console.log(answer.join('\n'))