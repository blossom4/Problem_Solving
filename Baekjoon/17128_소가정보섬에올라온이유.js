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
// #17128  소가 정보섬에 올라온 이유

// https://www.acmicpc.net/problem/17128


const NQ = input().split(' ').map(Number)
const cows = input().split(' ').map(Number)
const changed = input().split(' ').map(Number)

// 길이가 4인 배열값의 곱의 합을 구하는 함수
const multipy_4 = function (arr) {
  let res = 0
  for (let i = 0; i < 4; i++) {
    res = arr[0] * arr[1] * arr[2] * arr[3]
  }

  return res
}

let total = 0
for (let i = 0; i < NQ[1]; i++) {
  // 장난친 index의 소의 품질값이 *= -1을 해준다.
  cows[changed[i] - 1] = cows[changed[i] - 1] * -1
  // 원순열을 만들기위해 앞의 3개요소를 뒤에 더하고
  // 계산을 마치고 다시 빼준다.
  for (let i = 0; i < 3; i++) cows.push(cows[i])

  // 앞에서부터 4개씩 배열을 자르면서 각요소의 곱의 합을 total에 더해간다.
  // 한바퀴를 돌고나면 total 값을 출력한다.
  for (let j = 0; j < cows.length - 3; j++) {
    total += multipy_4(cows.slice(j, j + 4))
  }
  console.log(total)

  // cows 배열을 원래대로 돌리고 다음 장난에 대한 total값을 계산하기 위해 초기화한다.
  for (let i = 0; i < 3; i++) cows.pop()
  total = 0
}
