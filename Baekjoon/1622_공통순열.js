////////////////////////////////////////////////////////////

// Input and Output
const fs = require("fs");
const stdin = (
  process.platform === "linux"
    ? fs.readFileSync("/dev/stdin").toString()
    : ``
).split("\n");

const input = (() => {
  let line = 0;
  return () => stdin[line++];
})();

////////////////////////////////////////////////////////////


// Baekjoon JavaScript
// #1622  공통순열

// https://www.acmicpc.net/problem/1622


const a = input().split('')
const b = input().split('')
const arr = []

// b와 a를 이중for문을 돌며 중복되지 않도록 같은 알파벳들을 arr에 추가한다.
for (let i = 0; i < b.length; i++) {
  for (let j = 0; j < a.length; j++) {
    if (b[i] == a[j]) {
      arr.push(a[j])
      a.splice(j, 1)
      break
    }
  }
}

console.log(arr.sort().join(''))