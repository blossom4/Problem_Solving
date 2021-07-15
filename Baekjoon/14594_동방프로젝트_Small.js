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
// #14594  동방 프로젝트 (Small)

// https://www.acmicpc.net/problem/14594


// 방의 개수를 세는것보다 벽이 몇개있는지를 세는것이 더 계산하기 편리하다고 생각했다.
// 초기 벽의 개수는 방보다 1개 적다.
const wall = Number(input()) - 1
let crush_n = Number(input())

// 벽의 존재유무를 Boolean으로 나타낸 array로 0번째 index는 1번방과 2번방 사이의 벽을 위미한다.
// ex) 5번째 index는 6번방과 7번방 사이의 벽의 유무이다.
const wall_arr = new Array(wall).fill(1)

// 부수는 횟수만큼 input을 받아 해당범위의 벽부분을 0으로 만들어 벽이 부숴졌음을 표시한다.
while (crush_n > 0) {
  const crush = input().split(' ')

  for (let i = crush[0] - 1; i < crush[1] - 1; i++) {
    wall_arr[i] = 0
  }
  crush_n--
}

// 벽이 세워져있다는 것은 공간이 분리되어있다는 의미 이므로 벽 한개당 방의 개수는 +1씩 늘어난다.
// 따라서 부숴진 벽을 모두 체크한 후에 아직 벽이 세워져있는 곳을 기준으로 방 개수를 센다.
let room_cnt = 1
let i = 0
while (wall_arr[i] != null) {
  if (wall_arr[i] == 1) {
    room_cnt++
  }
  i++
}

console.log(room_cnt)