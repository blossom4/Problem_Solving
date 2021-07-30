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
// # 1952  달팽이 2

// https://www.acmicpc.net/problem/1952


const MN = input().split(' ')
let M = Number(MN[0])
let N = Number(MN[1])
let arr = []
for (let i = 0; i < M; i++) {
  arr[i] = new Array(N).fill(0)
}

let y = 0
let x = 0
while (1) {
  arr[y][x] += 1
  if (N == 1) {
    arr[y][x] += 1
  }
  for (let i = 0; i < N - 1; i++) {
    arr[y][++x] += 1
    if (arr[y][x + 1] != 0) {
      arr[y][x] += 1
      break
    }
  }

  for (let i = 0; i < M - 1; i++) {
    arr[++y][x] += 1
    if (i == M - 2 || arr[y + 1][x] != 0) {
      arr[y][x] += 1
      break
    }
  }

  for (let i = 0; i < N - 1; i++) {
    arr[y][--x] += 1
    if (x == 0 || arr[y][x - 1] != 0) {
      arr[y][x] += 1
      break
    }
  }

  for (let i = 0; i < M - 1; i++) {
    arr[--y][x] += 1
    if (y == 0 || arr[y - 1][x] != 0) {
      arr[y][x] += 1
      break
    }
  }
  x++
  console.log(arr)
  M -= 2
  N -= 2
  if (M < 1 || N < 1) break
}

let cnt = arr.flat().filter(el => el == 2).length
console.log(cnt)