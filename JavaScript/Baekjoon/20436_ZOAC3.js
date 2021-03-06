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
// #20436  ZOAC 3

// https://www.acmicpc.net/problem/20436


// 해당 문자 s의 키보드 위에서의 (x,y)좌표를 array형태로 return
var findIndex = function (s) {
  const keyboard = ['zxcvbnm', 'asdfghjkl', 'qwertyuiop']
  const res = []
  for (let i = 0; i < 3; i++) {
    if (keyboard[i].indexOf(s) !== -1) {
      res.push(keyboard[i].indexOf(s), i)
      return res
    }
  }
}

const LR = input().split(' ')
const str = input().split('')

let total = 0

for (let i = 0; i < str.length; i++) {
  const LR_xy_1 = findIndex(LR[0])
  const LR_xy_2 = findIndex(LR[1])
  const str_xy = findIndex(str[i])
  const distance_L = Math.abs(LR_xy_1[0] - str_xy[0]) + Math.abs(LR_xy_1[1] - str_xy[1])
  const distance_R =  Math.abs(LR_xy_2[0] - str_xy[0]) + Math.abs(LR_xy_2[1] - str_xy[1])

	// 이번에 입력해야할 문자가 자음인경우
  if ((str_xy[1] == 0 && str_xy[0] <= 3) || (str_xy[1] >= 1 && str_xy[0] <= 4)) {
		// 왼손가락이 움직여야할 거리를 더해주고 현재위치LR을 갱신한다.
    total += distance_L + 1
    LR[0] = str[i]
	// 모음인경우
  } else {
		// 오른손가락이 움직여햐라 거리를 더해주고 위치 갱신
    total += distance_R + 1
    LR[1] = str[i]
  }
}

console.log(total)