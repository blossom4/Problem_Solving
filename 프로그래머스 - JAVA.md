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

