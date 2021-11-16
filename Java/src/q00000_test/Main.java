package q00000_test;

import java.util.*;
import java.io.IOException;

public class Main {
	
	public static void main(String[] args) throws IOException {
		int[] progresses = {93, 30, 55};
		int[] speeds = {1, 30, 5};
        ArrayList<Integer> progressList = new ArrayList<>();
        ArrayList<Integer> speedList = new ArrayList<>();
        // 편의를 위해 progresses와 speeds 배열을 ArrayList로 변환
        // ArrayList - progressList
        // ArrayList - speedList
        for (int i = 0; i < progresses.length; i++) {
            progressList.add(progresses[i]);
            speedList.add(speeds[i]);
        }

        ArrayList<Integer> result = new ArrayList<>();
        int count = 0;
        // 작업이 완료되면 해당 작업을 ArrayList에서 제거한다. 
        // 따라서 모든 작업이 완료되어 ArrayList의 size()가 0이 될 때까지 반복문을 진행한다.
        while (progressList.size() > 0) {
            // 개발을 하루 진행했을 때 각 progress의 진행률을 갱신한다.
            for (int i = 0; i < progressList.size(); i++) {
                progressList.set(i, progressList.get(i) + speedList.get(i));
            }
            // 맨앞의 작업률이 100%가 된 시점에 완료된 작업이 연이어 붙이었다면 count하여 기록한다.
            // 기록한 후 완료된 작업은 prgressList에서 제거하고 해당 속도 역시 speedList에서 제거한다.
            if (progressList.get(0) >= 100) {
                int j = 0;
                while (progressList.get(j) >= 100) {
                    count++;
                    j++;
                    if (j == progressList.size()) break;
                }
                result.add(count);
            }
            
            for (int i = 0; i < count; i++) {
                progressList.remove(0);
                speedList.remove(0);
            }
            count = 0;
        }
        int[] answer = new int[result.size()];
        for (int i = 0; i < result.size(); i++) {
            answer[i] = result.get(i);
        }
        System.out.println(Arrays.toString(answer));

	}

}