////////////////////////////////////////////////////////////

// Input and Output
const fs = require("fs");
const stdin = (
  process.platform === "linux"
    ? fs.readFileSync("/dev/stdin").toString()
    : `walking
nia`
).split("\n");

const input = (() => {
  let line = 0;
  return () => stdin[line++];
})();

////////////////////////////////////////////////////////////


// Baekjoon JavaScript
// #14467  소가 길을 건너간 이유 1

// https://www.acmicpc.net/problem/14467


const N = Number(input())
const cows = new Array(11).fill(-1)
let cnt = 0

// -1로 초기화한 array에 index는 소의 번호, index요소는 0, 1로 현재 위치를 나타냈다.
for (let i = 0; i < N; i++) {
  let [cow_n, position] = input().split(' ').map(Number)

  // 현재위치가 기존과 달라질때마다 cnt++를 했다.
  if (cows[cow_n] == -1) {
    cows[cow_n] = position
  } else if (cows[cow_n] == 1 && position == 0) {
    cows[cow_n] = position
    cnt++
  } else if (cows[cow_n] == 0 && position == 1) {
    cows[cow_n] = position
    cnt++
  }
}

console.log(cnt)