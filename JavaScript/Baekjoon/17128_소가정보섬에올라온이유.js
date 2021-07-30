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
// #17128  소가 정보섬에 올라온 이유

// https://www.acmicpc.net/problem/17128


const NQ = input().split(' ').map(Number)
const cows = input().split(' ').map(Number)
const changed = input().split(' ').map(Number)

// 장난을 치기전 품질계산값과 각 항의 합의 값을 sum_arr로 미리 저장해둔다.
let total = 0
const sum_arr = new Array(cows.length).fill(0)
const n = cows.length
// 연속된 4마리의 소의 값을 더해서 각 항의 계산값을 sum_arr에 저장
// total에는 현재 각 항의 총합을 저장한다.
for (let i = 0; i < n; i++) {
  sum_arr[i] = cows[i % n] * cows[(i + 1) % n] * cows[(i + 2) % n] * cows[(i + 3) % n]
  total += sum_arr[i]
}

let ans = []
// 1. 장난을 친 번호를 changed[i - 1]로 지정하면 그 index 포함 4개의 앞쪽의 항들의 값의 부호값이 바뀐다.
// 2. 4개의 index의 값의 부호를 바꾸어주고 부호가 바뀌면 기존의 total 값에 해당 index의 새로운값이 두 번 더해지는 것이므로
//    total += sum_arr[a] * 2를 해주고 답을 array(ans)에 저장해준다.
for (let i = 0; i < NQ[1]; i++) {
  for (let j = 0; j < 4; j++) {
    let index = changed[i] - 1 - j
    // 바꾸어야하는 index가 0보다 작아지면 배열의 맨 뒤index로 가야하므로 +n을 해주어서 index를 맞췄다.
    if (index < 0) index += n
    sum_arr[index] *= -1
    total += sum_arr[index] * 2
  }
  ans.push(total)
}
console.log(ans.join('\n'))