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
// #1913  달팽이

// https://www.acmicpc.net/problem/1913


let N = Number(input())
const N_temp = N
const index = Number(input())
// 2차원배열 0으로 초기화
let arr = []
for (let i = 0; i < N; i++) {
  arr[i] = new Array(N).fill(0)
}

let x = 0
let y = 0
let start = N ** 2
// 사각형의 가장 왼쪽상단을 시작점 start로 잡고 반시계방향으로 돌면서 -1씩하며 배열에 넣는다.
while (1) {
  // N이 한칸이면 1을 마지막으로 넣고 반복문 종료
  if (N == 1) {
    arr[y][x] += start
    break
  }
  // 달팽이가 움직이는 방향
  // 아래로 내려갈 때
  for (let i = 0; i < N - 1; i++) {
    arr[y++][x] += start
    start--
  }
  // 오른쪽으로 갈 때
  for (let i = 0; i < N - 1; i++) {
    arr[y][x++] += start
    start--
  }
  // 위로 갈 떄
  for (let i = 0; i < N - 1; i++) {
    arr[y--][x] += start
    start--
  }
  // 왼쪽으로 갈 떄
  for (let i = 0; i < N - 1; i++) {
    arr[y][x--] += start
    start--
  }
  // 한 바퀴를 다 돌았으면 길이를 2만큼 줄이고 y, x를 1씩 더해 다음 출발점으로 맞춘다.
  N -= 2
  y++
  x++
}

// 배열 출력
for (let i = 0; i < N_temp; i ++) {
  console.log(arr[i].join(' '))
}
// 완성한 arr를 1차원배열로 만든 후 몇번 째 칸 몇번째 줄에 있었냐를 변의 길이로 나누어서 구한다.
const res = arr.flat().indexOf(index)
const res_arr = [parseInt(res / N_temp) + 1, (res % N_temp) + 1]
console.log(res_arr.join(' '))