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


// #1157 Baekjoon JavaScript 
const alpha = input().toUpperCase().split('').sort()
const alpha_arr = []
let cnt = 0
const cnt_arr = []

for (let i = 0; i < alpha.length; i++) {
  cnt++
  // 1. 현재 알파벳이 다음 index의 알파벳과 다르면 현재 알파벳의 cnt를 배열에 추가하고 cnt 초기화
  // 2. 배열의 끝에 다다르면 현재 알파벳의 cnt를 배열에 추가하고 cnt 초기화
  if (alpha[i] !== alpha[i + 1] || i + 1 == null) {
    cnt_arr.push(cnt)
    alpha_arr.push(alpha[i])
    cnt *= 0
  }
}

// 최대값
const max_num = Math.max(...cnt_arr)
// 최대값에 해당하는 값만 배열에 남기고 개수를 센다.
const max_cnt = cnt_arr.filter(el => el == max_num).length

// 최대값이 1개보다 많으면 ? 출력
// 최대값이 1개이면 그 최대값에 해당하는 알파벳 출력
if (max_cnt > 1) {
  console.log('?')
} else {
  const res = alpha_arr[cnt_arr.indexOf(max_num)]
  console.log(res)
}