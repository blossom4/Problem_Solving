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


// #1152 Baekjoon JavaScript 
const words = input().trim().split(' ')

// ' '을 기준으로 나눴으므로, 공백은 배열에 넣으면 ' '가 아니라 ''로 들어간다.
if (words == '') {
  console.log(0)
} else {
  console.log(words.length)
}