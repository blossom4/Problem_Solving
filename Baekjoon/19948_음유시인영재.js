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
// #19948  음유시인 영재

// https://www.acmicpc.net/problem/19948


// 입력받은 문자열에서 연속된 같은 문자열을 미리 제거해주고 시작했다.
let original_content = input().split('')
let i = 0
while (original_content[i] != null) {
  if (original_content[i] == original_content[i -1]) {
    original_content.splice(i, 1)
  } else {
    i++
  }
}

// 연속으로 같은 중복문자열을 미리제거하고 소문자로 모두 바꿨다.
const content = original_content.join('').toLowerCase()
let spaceBar = Number(input())
const letters = input().split(' ').map(Number)

const checkValid = function (content, spaceBar, letters) {
  let title = ''
  const first = content.charCodeAt(0) - 97
  
  // 첫번 째 문자는 무조건 제목에 들어가므로 미리 처리해주고 시작했다.
  // 1. 제목에 첫번 째 문자를 더해주고,
  // 2. 내용입력할때 한 번, 제목입력할 때 한 번 해서 총 두 번 키보드횟수를 소모하므로 -2를 해준다.
  title += content[0]
  letters[first] -= 2
  if (letters[first] < 0) {
    return -1
  }
  
  // 1. 공백을 만나면 입력가능한 spaceBar의 개수를 줄인다.
  // 2. 공백 다음 문자는 제목에 들어가므로 title 문자열에 더하고, 
  //    제목입력에도 키보드횟수를 소모하므로 -1을 미리 한번더 해준다.
  // 3. 공백이 아닌 알파벳이 나오면 해당 index의 남은 횟수를 -1 해준다.
  // 4. 한번의 과정을 거치고 spacebar 혹은 alphabet의 입력 가능한 횟수가 0보다 줄어들어있으면,
  //    불가능한 case이므로 바로 return -1을 해준다.
  let i = 1
  while (content[i] != null) {
    if (content[i] == ' ') {
      spaceBar--
      title += content[i + 1]
      letters[content[i + 1].charCodeAt() - 97]--
    } else {
      letters[content[i].charCodeAt() - 97]--
    }
  
    if (letters[content[i].charCodeAt() - 97] < 0 || spaceBar < 0) {
      return -1
    }
    i++
  }
  // title을 대문자로 변환후 return
  return title.toUpperCase()
}

const res = checkValid(content, spaceBar, letters)
console.log(res)