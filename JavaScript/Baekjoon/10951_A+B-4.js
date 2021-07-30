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
// #10951  A+B - 4

// https://www.acmicpc.net/problem/10951


const answer = []

// input은 stdin이라는 array에 쌓이고 차례로 들어온다.
// **실제로는 stdin.length로 해야 맞으나 가끔 백준 자체적으로 입력의 맨 마지막에 null, 개행, 혹은 빈문자열을 넣는다.
// **그래서 stdin.length - 1을 해주어야 정답처리된다.

// 입력 길이 관련 질문답변 링크
// https://www.acmicpc.net/board/view/59328

// 실제로는 t < stdin.length이 맞다.
for (let t = 0; t < stdin.length - 1; t++) {
  // 배열을 생성할 때 미리 요소에 변수명을 정할 수 있다.
  let [A, B] = input().split(' ').map(Number)

  answer.push(A + B)
}

console.log(answer.join('\n'))