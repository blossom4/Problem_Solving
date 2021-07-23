// LeetCode JavaScript
// 6. ZigZag Conversion

// https://leetcode.com/problems/zigzag-conversion/


var convert = function(s, numRows) {
  const arr = []
  for (let i = 0; i < numRows; i++) arr.push([])

  // numsRows가 1이면 한줄에 모두 표현하면 되므로 바로 return s
  if (numRows == 1) return s

  for (let i = 0; i < s.length; i++) {
    // numRows번 세로로 내려가고 (numRows - 2)번 대각선 위로 올라가는 것을 반복한다.
    // 
    // zigzag가 세로로 내려가는 경우
    if (i % (numRows * 2 - 2) < numRows) {
      arr[i % (numRows * 2 - 2)].push(s[i])
    // zigzag가 대각선 위로 올라가는 경우
    } else {
      arr[numRows - 1 - ((i % (numRows * 2 - 2)) - numRows + 1)].push(s[i])
    }
  }
  // 베열에 분리되어 있는 알파벳들을  join하고 그것들을 한번더 join하여 return
  for (let i = 0; i < numRows; i++) arr[i] = arr[i].join('')
  return arr.join('')
}

console.log(convert(s, numRows))