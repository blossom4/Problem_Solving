////////////////////////////////////////////////////////////

// Input and Output
const fs = require("fs");
const stdin = (
  process.platform === "linux"
    ? fs.readFileSync("/dev/stdin").toString()
    : `pretty
women
walking
down
the
street`
).split("\n");

const input = (() => {
  let line = 0;
  return () => stdin[line++];
})();

////////////////////////////////////////////////////////////


// Baekjoon JavaScript
// #1622  공통순열

// https://www.acmicpc.net/problem/1622

while (1) {
  // 입력 a와 b에 대하여 undefined나 null이 들어오면 즉시 종료시키고,
  // 둘중 하나라도 빈문자열 ''이 들어오면 결과는 ''이므로 출력하고 다음 case로 넘어가도록 했다.
  let a = input()
  if (a == undefined || a == null) {
    break
  }
  a = a.split('')

  let b = input()
  if (b == undefined || b == null) {
    break
  }
  b = b.split('')

  if (a == '' || b == '') {
    console.log('')
    continue
  }

  const arr = []
    // b와 a를 이중for문을 돌며 중복되지 않도록 같은 알파벳들을 arr에 추가한다.
  for (let i = 0; i < b.length; i++) {
    for (let j = 0; j < a.length; j++) {
      if (b[i] == a[j]) {
        arr.push(a[j])
        a.splice(j, 1)
        break
      }
    }
  }
  
  console.log(arr.sort().join(''))
}