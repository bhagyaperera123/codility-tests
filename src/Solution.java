import java.util.ArrayList;
import java.util.List;

public class Solution {

    public int solution(int[] A){
        double bin = 0;
        for (int i = 0; i < A.length; i++) {
            bin = bin + Math.pow(2, A[i]);
        }

        int int_bin = (int) bin;
        int array_bin[] = new int[1000];

        int i = 0;
        for ( ; int_bin > 0; i++) {
            array_bin[i++] = int_bin % 2;
            int_bin = int_bin / 2;
        }

        int sum = 0;
        List<Integer> bin_list = new ArrayList<Integer>();
        while(i > 0){
            for (int j = i - 1; j >= 0; j--) {
                if (array_bin[j] != 0) {
                    sum = sum + (array_bin[j] * (int) Math.pow(2, i));
                    i--;
                    bin_list.add(i);
                }
                else{
                    i--;
                }

            }
        }
        int returned_val = bin_list.size();
        return returned_val;

    }
}
