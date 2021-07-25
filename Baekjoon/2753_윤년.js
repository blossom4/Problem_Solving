////////////////////////////////////////////////////////////

// Input Templete
const fs = require("fs");
const stdin = (
  process.platform === "linux"
    ? fs.readFileSync("/dev/stdin").toString()
    // Test-Case Input Between Backticks(``)
    : `2100`
).split("\n");

const input = (() => {
  let line = 0;
  return () => stdin[line++];
})();

////////////////////////////////////////////////////////////


// Baekjoon JavaScript 
// #2753  윤년

// https://www.acmicpc.net/problem/2753


const year = Number(input())

const isLeapYear = function (year) {
  if (year % 400 == 0) return 1
  else if (year % 100 == 0) return 0
  else if (year % 4 == 0) return 1
  return 0
}

console.log(isLeapYear(year))