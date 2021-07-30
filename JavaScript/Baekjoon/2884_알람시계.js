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
// #2884  알람 시계

// https://www.acmicpc.net/problem/2884


const time = input().split(' ').map(Number)

// 45분 이후면 시(hour)의 변화는 없고 분(minute)만 바꿔준다.
// 45분 이전이면 시를 -1하고 분은 +15해준다.
// 단 0시라면 시를 23시로 바꿔준다.
if (time[1] >= 45) {
  time[1] -= 45
} else {
  if (time[0] == 0) time[0] = 23
  else time[0] -= 1
  time[1] += 15
}

console.log(time.join(' '))