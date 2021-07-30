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
// #10809  알파벳 찾기

// https://www.acmicpc.net/problem/10809


const word = input()
const alphabet = new Array(26).fill(-1)

for (let i = 0; i< word.length; i++) {
  let index = word[i].charCodeAt() - 97
  // -1이 아니면 이미 더 빠른 index가 들어가 있기 때문에 지나친다.
  if (alphabet[index] == -1) {
    alphabet[word[i].charCodeAt() - 97] = i
  }
}

console.log(alphabet.join(' '))