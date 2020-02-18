package naverHackaton;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class N1 {
    public static void main(String[] args) {
        String arr[] = {"1", "2", "3", "4", "5"};
        permutation(arr, 0, arr.length, 3);
    }

    public static int solution(String[] A) {
        List<String> list = new ArrayList<>(Arrays.asList(A));
        for (int i = 0; i < A.length; i++) {
            if(isHomo(A[i])) {
                list.remove(i);
            }
        }
        int r = A.length;
        String temp = null;
        int cnt = 0;
        while(r > 0) {
            List<String> tempList = new ArrayList<>();
            permutation(list, 0, list.size(), r, tempList);
            for (int i = 0; i < tempList.size(); i++) {
                if(isHomo(concat(tempList)))
            }
            r--;
        }
        return cnt;
    }
    public static boolean isHomo(String s) {
        char temp[] = s.toCharArray();
        for (int i = 0; i < temp.length; i++) {
            for (int j = i + 1; j < temp.length; j++) {
                if(i == j)
                    continue;
                if(temp[i] == temp[j]) {
                    return true;
                }
            }
        }
        return false;
    }
    public static void save(List<String> arr, List<String> tempList) {
        int len = arr.size();
		for (int i = 0; i < len; i++) {
			arr.get(i).concat(str)
		}
	}

    public static void permutation(List<String> arr, int level, int n, int r, List<String> tempList) {
        if(level == n) {
            save(arr, tempList);
            return;
        }
        for (int i = level; i < arr.size(); i++) {
            swap(arr, i, level);
            permutation(arr, level + 1, n, r, tempList);
            swap(arr, i ,level);
        }
    }
    public static void swap(List<String> arr, int i, int j) {
		String temp = arr.get(i);
		arr.set(i, arr.get(j));
        arr.set(j, temp);
	}
}