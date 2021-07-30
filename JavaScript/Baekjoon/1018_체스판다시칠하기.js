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
// #1018  체스판 다시 칠하기

// https://www.acmicpc.net/problem/1018


const [N, M] = input().split(' ').map(Number)
const myBoard = []

for (let line = 0; line < N; line++) {
  myBoard.push(input())
}

const boardWhite = [
  'WBWBWBWB',
  'BWBWBWBW',
  'WBWBWBWB',
  'BWBWBWBW',
  'WBWBWBWB',
  'BWBWBWBW',
  'WBWBWBWB',
  'BWBWBWBW'
]
const boardBlack = [
  'BWBWBWBW',
  'WBWBWBWB',
  'BWBWBWBW',
  'WBWBWBWB',
  'BWBWBWBW',
  'WBWBWBWB',
  'BWBWBWBW',
  'WBWBWBWB'
]

let minChangeCount = 65
let changeCount = 0

// 바꿔야하는 체스판 myBoard와 맨 왼쪽 위칸이 White인 체스판을 비교한다.
// n, m index를 8x8 체스판의 맨 왼쪽 위칸을 기준으로 잡고 비교한다. 
for (let n = 0; n < N - 7; n++) {
  for (let m = 0; m < M - 7; m++) {
    for (let i = 0; i < 8; i++) {
      for (let j = 0; j < 8; j++) {
        if (myBoard[n + i][m + j] != boardWhite[i][j]) {
          changeCount++
        }
      }
      // 바꿔야 하는 칸의 개수가 최소값보다 크다면 더이상 의미가 없으므로 break
      if (changeCount > minChangeCount) break
    }
    // 바꿔야 하는 칸의 개수가 최소값보다 작다면 최소값을 갱신한다.
    if (changeCount < minChangeCount) minChangeCount = changeCount
    // 비교해야한 체스판의 기준점 n, m index가 변경하면 changeCount를 초기화
    changeCount = 0
  }
}

changeCount = 0
// 맨 왼쪽 위칸이 Black인 경우와 비교한다. 논리는 위쪽과 완전히 같다.
for (let n = 0; n < N - 7; n++) {
  for (let m = 0; m < M - 7; m++) {
    for (let i = 0; i < 8; i++) {
      for (let j = 0; j < 8; j++) {
        if (myBoard[n + i][m + j] != boardBlack[i][j]) {
          changeCount++
        }
      }
      if (changeCount > minChangeCount) break
    }
    if (changeCount < minChangeCount) minChangeCount = changeCount
    changeCount = 0
  }
}

console.log(minChangeCount)