////////////////////////////////////////////////////////////

// Input and Output
const fs = require("fs");
const stdin = (
  process.platform === "linux"
    ? fs.readFileSync("/dev/stdin").toString()
    : `Tthtere is no cow level
5
1 0 2 0 4 3 0 1 2 0 0 3 0 2 2 0 4 1 1 2 0 1 1 0 0 0`
).split("\n");

const input = (() => {
  let line = 0;
  return () => stdin[line++];
})();

////////////////////////////////////////////////////////////


// Baekjoon JavaScript 
// #19948  음유시인 영재

// https://www.acmicpc.net/problem/19948


let original_content = input().split('')
for (let i = 1; i < original_content.length; i++) {
  if (original_content[i] == original_content[i -1]) {
    original_content.splice(i, 1)
  }
}

const content = original_content.join('').toLowerCase()
let spaceBar = Number(input())
const letters = input().split(' ').map(Number)

const checkValid = function (content, spaceBar, letters) {
  let title = ''
  const first = content.charCodeAt(0) - 97
  
  title += content[0]
  letters[first]--
  if (letters[first] < 0) {
    return -1
  }
  
  let i = 1
  while (content[i] != null) {
    if (content[i] == ' ') {
      spaceBar--
    } else {
      letters[content[i].charCodeAt() - 97]--
      if (content[i - 1] == ' ') {
        title += content[i]
      }
    }
  
    if (letters[content[i].charCodeAt() - 97] < 0 || spaceBar < 0) {
      return -1
    }
    i++
  }
  
  return title.toUpperCase()
}

const res = checkValid(content, spaceBar, letters)
console.log(res)