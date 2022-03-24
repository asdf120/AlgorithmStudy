package study.정렬;

/**
 * 시간복잡도 O(n^2)
 */
public class 선택정렬 {
    public static void main(String[] args) {
        int[] array = {7,5,9,0,3,1,6,2,4,8};

        for(int i = 0; i<array.length; i++){
            for(int j = i+1; j<array.length; j++){
                int minN = array[i];
                if(minN > array[j]){
                    array[i] = array[j];
                    array[j] = minN;
                }
            }
        }

        for(int n : array){
            System.out.println(n + " ");
        }
    }
}
