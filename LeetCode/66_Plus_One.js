// LeetCode JavaScript
// 66. Plus One
// https://leetcode.com/problems/plus-one/

// @param {number[]} digits
// @return {number[]}
var plusOne = function(digits) {
  // 일의 자리부터 처리해주기위해서 배열을 뒤집는다.
  digits.reverse()
  let i = 0
  while (digits[i] != null) {
    // 맨 마지막 index요소가 9이면 0으로 바꾸고 자리수가 넘어가므로,
    // 배열에 1을 추가하고 반복문을 종료한다.
    if (digits[i] == 9 && i == digits.length - 1) {
      digits[i] = 0
      digits.push(1)
      break
    // 현재 index요소가 9이고 아직 최고자리수가 아니라면, 
    // 0으로 바꾸고 다음 index요소를 검사한다.
    } else if (digits[i] == 9) {
      digits[i] = 0
    // 현재 index요소가 9가아니면, 자리수에 1을 더해주고 반복문을 종료한다.
    } else if (digits[i] != 9) {
      digits[i]++
      break
    }
    i++
  }

  return digits.reverse()
};