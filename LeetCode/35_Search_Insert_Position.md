## 35. Search Insert position



https://leetcode.com/problems/search-insert-position/



```javascript
/**
 * @param {number[]} nums
 * @param {number} target
 * @return {number}
 */
var searchInsert = function(nums, target) {

  let index = 0

  for (let i = 0, n_len = nums.length; i < n_len; i++) {
    if (target > nums[i]) {
      index++
    } else {
      return index
    }

    if (index == n_len) {
      return index
    }
  }   
};
```

