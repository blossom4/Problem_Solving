// LeetCode JavaScript
// 88. Merge Sorted Array

// https://leetcode.com/problems/merge-sorted-array/


// @param {number[]} nums1
// @param {number} m
// @param {number[]} nums2
// @param {number} n
// @return {void} Do not return anything, modify nums1 in-place instead.
var merge = function(nums1, nums2, m, n) {
  // sort() 함수
  // 1. return < 0: a가 b의 앞에 있어야한다.
  // 2. return = 0: a와 b를 바꾸지 않는다.
  // 3. return > 0: a가 b의 뒤에 있어야한다.
  function compare (a, b) {
    return a - b
  }
  // LeetCode의 JS version을 잘 모르겠으나 push()함수로 array가 추가되지 않는다.
  // 따라서 반복문으로 하나씩 다 넣어주었다.
  nums1.splice(m)
  for (let i = 0; i < n; i++) {
    nums1.push(nums2[i])
  }
  nums1.sort(compare)

  return nums1
};