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
// #10172  개

// https://www.acmicpc.net/problem/10172


const answer = []
answer.push('|\\_/|')
answer.push('|q p|   /}')
answer.push('( 0 )"""\\')
answer.push('|"^"`    |')
answer.push('||_/=\\\\__|')

console.log(answer.join('\n'))