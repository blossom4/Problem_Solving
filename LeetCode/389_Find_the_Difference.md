## 389. Find the Difference



https://leetcode.com/problems/find-the-difference/



```javascript
/**
 * @param {string} s
 * @param {string} t
 * @return {character}
 */
var findTheDifference = function(s, t) {
  const s_arr = s.split('').sort()
  const t_arr = t.split('').sort()
  const s_len = s.length

  for (let i=0; i < s_len; i++) {
    if (s_arr[i] != t_arr[i]) {
      return t_arr[i]
    }
  }
  return t_arr[s_len]
};
```

