// LeetCode JavaScript
// 18. 4Sum

// https://leetcode.com/problems/4sum/


// @param {number[]} nums
// @param {number} target
// @return {number[][]}
var fourSum = function(nums, target) {
  let lenNums = nums.length
  const results = []
  
  // nums array를 오름차순으로 정렬한다.
  nums.sort((a, b) => a - b)
  
  // 이중for문 안에서 투포인터로 해결한다.
  for (let i = 0; i < lenNums - 3; i++) {
    for (let j = i + 1; j < lenNums - 2; j++) {
      let left = j + 1
      let right = lenNums - 1
      while (left < right) {
        let sum = nums[i] + nums[j] + nums[left] + nums[right]
        if (sum == target) {
          // index i, j에 해당하는 요소와 투포인터가 각각 가리키고 있는 값이 target이라면 results에 추가한다.
          results.push([nums[i], nums[j], nums[left], nums[right]])
          // 중복된 값이 있다면 left index는 +1, right index는 -1해주면 중복값을 미리 지나칠 수 있다.
          while (nums[left] == nums[left + 1]) left++
          while (nums[right] == nums[right - 1]) right--
          // 중복값을 모두 지나치고나서 이제 다음 index로 진행을 위한 index이동
          left++
          right--
        } else if (sum < target) left++
        else right--
      }
      // 투포인터 말고도 index i, j도 중복값이 있으면 index를 1씩 진행해준다.
      while (nums[j] == nums[j + 1]) j++
    }
    while (nums[i] == nums[i + 1]) i++
  }
  return results
};

console.log(fourSum(nums, target))