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
// #2920  음계

// https://www.acmicpc.net/problem/2920


const scale = input()

if (scale == '1 2 3 4 5 6 7 8') console.log('ascending')
else if (scale == '8 7 6 5 4 3 2 1') console.log('descending')
else console.log('mixed')