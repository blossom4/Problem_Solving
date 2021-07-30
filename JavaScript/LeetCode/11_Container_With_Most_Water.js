// LeetCode JavaScript
// 11. Container With Most Water

// https://leetcode.com/problems/container-with-most-water/


// @param {number[]} height
// @return {number}
var maxArea = function(height) {
  let left = 0
  let right = height.length - 1
  let temp_h = 0
  let max_volume = 0
  
  // 1. 현재 물의 부피를 계산해보고 max 부피값보다 크면 max_volume 값을 갱신한다.
  // 2. 다음 변경은 길이가 긴쪽은 부피를 크게하므로 길이가 짧은 쪽을 가운데쪽으로 옮기면서 최대값을 갱신한다.
  // 3. 가운데로 옮겨가면서 비교하다가 두 세로축이 겹치면 그 이후는 중복된 부피값이므로 비교를 중단한다.
  while(left < right) {
    // 왼쪽 세로축과 오른쪽 세로축의 길이를 비교하여 짧은 쪽을 골라야 부피를 계산할 수 있다.
    if (height[left] > height[right]) temp_h = height[right]
    else temp_h = height[left]

    let volume = (right - left) * temp_h
    // 최대 volume값 갱신한다.
    if (volume > max_volume) max_volume = volume
    // 더 짧은쪽의 축을 가운데로 이동한다.
    if (temp_h == height[right]) right--
    else left++
  }  
  return max_volume
}