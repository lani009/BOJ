package scpc.one;
/*
You should use the standard input/output

in order to receive a score properly.

Do not use file input and output

Please be very careful. 
*/

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

/*
   As the name of the class should be Solution , using Solution.java as the filename is recommended.
   In any case, you can execute your program by running 'java Solution' command.
 */
class Solution {
	static int Answer;

	public static void main(String args[]) throws Exception	{
		/*
		   The method below means that the program will read from input.txt, instead of standard(keyboard) input.
		   To test your program, you may save input data in input.txt file,
		   and call below method to read from the file when using nextInt() method.
		   You may remove the comment symbols(//) in the below statement and use it.
		   But before submission, you must remove the freopen function or rewrite comment symbols(//).
		 */		

		/*
		   Make new scanner from standard input System.in, and read data.
		 */
		Scanner sc = new Scanner(System.in);
		//Scanner sc = new Scanner(new FileInputStream("input.txt"));

		int T = sc.nextInt();
		for(int test_case = 0; test_case < T; test_case++) {

			// Answer = 0;
			/////////////////////////////////////////////////////////////////////////////////////////////
            int N = sc.nextInt();   // 두 식당 메뉴 수
            int K = sc.nextInt();   // 날짜 수

            List<Integer> aList = new ArrayList<>();    // A 식당 칼로리 리스트
            List<Integer> bList = new ArrayList<>();    // B 식당 칼로리 리스트

            for (int i = 0; i < 2; i++) {
                for (int j = 0; j < N; j++) {
                    if (i == 0) {
                        aList.add(sc.nextInt());
                    } else {
                        bList.add(sc.nextInt());
                    }
                }
            }

            aList.sort(Comparator.naturalOrder());
            bList.sort(Comparator.reverseOrder());

            aList = aList.subList(0, K);
            bList = bList.subList(N - K, N);

            List<Integer> sumList = new ArrayList<>();
            for (int i = 0; i < aList.size(); i++) {
                sumList.add(aList.get(i) + bList.get(i));
            }

            Answer = Collections.max(sumList);
			/////////////////////////////////////////////////////////////////////////////////////////////


			// Print the answer to standard output(screen).
			System.out.println("Case #"+(test_case+1));
            System.out.println(Answer);
            sc.close();
		}
	}
}