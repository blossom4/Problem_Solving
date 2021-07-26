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
// #2908  상수

// https://www.acmicpc.net/problem/2908


const nums = input().split(' ')
// 뒤집은 숫자를 nums 배열에 다시 저장한다.
nums[0] = nums[0].split('').reverse().join('')
nums[1] = nums[1].split('').reverse().join('')

// 뒤집은 숫자중 더 큰 수를 출력한다.
if (Number(nums[0]) > Number(nums[1])) console.log(nums[0])
else console.log(nums[1])