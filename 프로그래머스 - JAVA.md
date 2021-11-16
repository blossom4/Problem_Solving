# 프로그래머스 - JAVA



## #해시



### 1. 완주하지 못한 선수

```java
import java.util.*;

class Solution {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        HashMap<String, Integer> nameList = new HashMap<String, Integer>();
        for (int i = 0; i < participant.length; i++) {
            nameList.put(participant[i], nameList.getOrDefault(participant[i], 0) + 1);
        }
        for (int i = 0; i < completion.length; i++) {
            if (nameList.get(completion[i]) != null) {
                nameList.put(completion[i], nameList.get(completion[i]) - 1);
            }
        }
        
        for (int i = 0; i < nameList.size(); i++) {
            if (nameList.get(participant[i]) != 0) {
                answer = participant[i];
            }
        }
        return answer;
    }
}
```



### 2. 전화번호 목록

```java
import java.util.*;

class Solution {
    public boolean solution(String[] phone_book) {
        boolean answer = true;
        HashMap<String, String> hm = new HashMap<String, String>();
        for (int i = 0; i < phone_book.length; i++) {
            hm.put(phone_book[i], phone_book[i]);
        }
        int flag = 1;
        for (int i = 0; i < phone_book.length; i++) {
            String number_i = hm.get(phone_book[i]);
            for (int j = 0; j < phone_book[i].length(); j++) {
                if (hm.containsKey(number_i.substring(0, j))) {
                    answer = false;
                    flag = 0;
                    break;
                }
            }
            if (flag == 0) break;
        }

        return answer;
    }
}
```



### 3. 위장

```java
import java.util.*;

class Solution {
    public int solution(String[][] clothes) {
        int answer = 0;
        HashMap<String, String> hmList = new HashMap<>();
        HashMap<String, Integer> hmCount = new HashMap<>();
        ArrayList<String> temp = new ArrayList<>();
        for (int i = 0; i < clothes.length; i++) {
            hmList.put(clothes[i][0], clothes[i][1]);
        }

        for (int i = 0; i < hmList.size(); i++) {
            hmCount.put(clothes[i][1], hmCount.getOrDefault(clothes[i][1], 0) + 1);
            if (!temp.contains(clothes[i][1])) {
                temp.add(clothes[i][1]);
            }
        }
    
        int cases = 1;
        for (int i = 0; i < hmCount.size(); i++) {
            cases *= hmCount.get(temp.get(i)) + 1;
        }

        answer = cases - 1;
        return answer;
    }
}
```



### 4. 베스트 앨범

```java
 import java.util.*;

class Solution {
    public int[] solution(String[] genres, int[] plays) {
        HashMap<String, Integer> hmGenrePlay = new HashMap<>();
        HashMap<Integer, Integer> hmIndexPlay = new HashMap<>();
        ArrayList<String> maxGenre = new ArrayList<>();
        ArrayList<Integer> result = new ArrayList<>();
        ArrayList<String> resultArrList = new ArrayList<>();
        for (int i = 0; i < genres.length; i++) {
            hmGenrePlay.put(genres[i], hmGenrePlay.getOrDefault(genres[i], 0) + plays[i]);
        }
        for (int i = 0; i < plays.length; i++) {
            hmIndexPlay.put(i, plays[i]);
        }

        String[] resultArr = Arrays.stream(genres).distinct().toArray(String[]::new);
        
        for (int i = 0; i < resultArr.length; i++) {
            resultArrList.add(resultArr[i]);
        }
        
        int maxPlay1 = -1;
        String maxGenre1 = "";
        
        while (resultArrList.size() > 0) {
        maxPlay1 = -1;
        maxGenre1 = "";
            for (int i = 0; i < resultArrList.size(); i++) {
                if (maxPlay1 < hmGenrePlay.get(resultArrList.get(i))) {
                    maxPlay1 = hmGenrePlay.get(resultArrList.get(i));
                    maxGenre1 = resultArrList.get(i);
                }
            }
            resultArrList.remove(maxGenre1);
            maxGenre.add(maxGenre1);         
        }
        
        for (int k = 0; k < maxGenre.size(); k++) {
            ArrayList<Integer> resultTemp = new ArrayList<>();
                
            int maxPlayCount1_1 = -1;
            int maxPlayIndex1_1 = -1;
            int count = 1;
            for (int i = 0; i < genres.length; i++) {
                if (genres[i].equals(maxGenre.get(k))) {
                    if (maxPlayCount1_1 < plays[i]) {
                        maxPlayCount1_1 = plays[i];
                        maxPlayIndex1_1 = i;
                        count = 1;
                    } else if (maxPlayCount1_1 == plays[i]) {
                        count++;
                    }
                }
            }
            resultTemp.add(maxPlayIndex1_1);
            System.out.println(count);
            int maxPlayCount1_2 = -1;
            int maxPlayIndex1_2 = -1;
            for (int i = 0; i < genres.length; i++) {
                if (genres[i].equals(maxGenre.get(k))) {
                    if (count == 1) {
                        if (maxPlayCount1_2 < plays[i] && plays[i] != maxPlayCount1_1) {
                            maxPlayCount1_2 = plays[i];
                            maxPlayIndex1_2 = i;
                        }                        
                    } else {
                        if (maxPlayCount1_2 < plays[i] && i != maxPlayIndex1_1) {
                            maxPlayCount1_2 = plays[i];
                            maxPlayIndex1_2 = i;
                        }                                  
                    }
                }
            }            
            if (maxPlayCount1_2 != -1) {
                resultTemp.add(maxPlayIndex1_2);
            }
            if (maxPlayCount1_1 == maxPlayCount1_2) {
                Collections.sort(resultTemp);
            }
            for (int i = 0; i < resultTemp.size(); i++) {
                result.add(resultTemp.get(i));
            }
            resultTemp.clear();
        }
        int[] answer = new int[result.size()];
        for (int i = 0; i < result.size(); i++) {
            answer[i] = result.get(i);
        }
        return answer;
    }
}
```



## #완전탐색

### 3. 카펫

```java
import java.util.*;

class Solution {
    public int[] solution(int brown, int yellow) {
        int[] answer = new int[2];
        int total = brown + yellow;
        ArrayList<Integer> numbers = new ArrayList<>();
        for (int i = 1; i < total + 1; i++) {
            if (total % i == 0) {
                numbers.add(i);
            }
        }
        int mid1 = 0;
        int mid2 = 0;
        if (numbers.size() % 2 == 0) {
            mid1 = (numbers.size() / 2) - 1;
            mid2 = numbers.size() / 2;
        } else {
            mid1 = numbers.size() / 2;
            mid2 = numbers.size() / 2;            
        }
        while (mid1 > 0) {
            int width = numbers.get(mid2);
            int height = numbers.get(mid1);
            if (height * width == total && (width - 2) * (height - 2) == yellow) {
                answer[0] = width;
                answer[1] = height;
                break;
            }
            mid1--;
            mid2++;
        }
        // System.out.println(numbers);
        return answer;
    }
}
```





## #탐욕법(Greedy)

## 1. 체육복

```java
import java.util.*;

class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        int answer = 0;
        int[] students = new int[n];
        for (int i = 0; i < n; i++) {
            students[i] = 1;
        }
        for (int i = 0; i < lost.length; i++) {
            students[lost[i] - 1]--;
        }
        for (int i = 0; i < reserve.length; i++) {
            students[reserve[i] - 1]++;
        }
        for (int i = 0; i < n; i++) {
            if (students[i] == 0) {
                if (i > 0 && students[i - 1] == 2) {
                    students[i]++;
                    students[i - 1]--;
                } else if (i < n - 1 && students[i + 1] == 2) {
                    students[i]++;
                    students[i + 1]--;
                }
            }
        }
        for (int i = 0; i < n; i++) {
            if (students[i] > 0) {
                answer++;
            }
        }
        return answer;
    }
}
```



## 2. 조이스틱

```java
import java.util.*;

class Solution {
    public boolean isZero(int[] arr) {
        int total = 0;
        for (int i = 0; i < arr.length; i++) {
            total += arr[i];
        }
        
        if (total == 0) {
            return true;
        } else {
            return false;
        }
    }
    
    public int moveRight(int[] arr, int index) {
        int arrLength = arr.length;
        if (arrLength - 1 == index) return 0;
        else return index + 1;
    }

    public int moveLeft(int[] arr, int index) {
        int arrLength = arr.length;
        if (index == 0) return arr.length - 1;
        else return index - 1;
    }
    
    public int solution(String name) {
        int answer = 0;
        String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        int[] arr = new int[name.length()];
        for (int i = 0; i < name.length(); i++) {
            arr[i] = alphabet.indexOf(String.valueOf(name.charAt(i)));
        }
        
        System.out.println(Arrays.toString(arr));
        int index = 0;
        int indexLeft = 0;
        int indexRight = 0;
        int right = 0;
        int left = 0;
        int countLeft = 0;
        int countRight = 0;
        int minValue = 21;
        for (int i = 0; i < 10; i++) {
            if (isZero(arr)) break;
            for (int j = 0; j < arr.length; j++) {
                if (arr[moveRight(arr, indexRight)] != 0) {
                    countRight++;
                    indexRight++;
                    break;
                }
            }
            for (int j = 0; j < arr.length; j++) {
                if (arr[moveLeft(arr, indexLeft)] != 0) {
                    System.out.println("INLLLLLL");
                    countLeft++;
                    indexLeft--;
                    break;
                }
            }
            // System.out.println("countRight: " + countRight);
            // System.out.println("countLeft: " + countLeft);
            // System.out.println("indexRight: " + indexRight);
            // System.out.println("indexLeft: " + indexLeft);
            int flag = 0;
            if (countRight <= countLeft) {
                minValue = countRight;
                flag = 1;
            } else {
                minValue = countLeft;
                flag = -1;
            }
            if (arr[index] <= 13) answer += arr[index];
            else if (arr[index] > 13) answer += 26 - arr[index];
            arr[index] = 0;
            answer += minValue;
            minValue = 21;
            System.out.println("flag: " + flag);
            if (flag > 0) index = indexRight;
            else index = indexLeft;
            indexRight = index;
            indexLeft = index;
            countRight = 0;
            countLeft = 0;
        }
        return answer;
    }
}
```





### 3. 큰수 만들기

```java
import java.util.*;

class Solution {
    
    public String solution(String number, int k) {
        String answer = "";
        String[] numberArr = number.split("");
        int digit = numberArr.length - k;
        int maxValue = -1;
        int index = 0;
        for (int i = 0; i < digit; i++) {
            for (int j = index; j < i + k + 1; j++) {
                int thisNumber = Integer.parseInt(numberArr[j]);
				if (maxValue < thisNumber) {
                    maxValue = thisNumber;
                    index = j + 1;
                }
            }
            answer += Integer.toString(maxValue);
            maxValue = -1;
        }
        return answer;
    }
}
```

