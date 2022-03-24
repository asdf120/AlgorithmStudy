package study.정렬;

/**
 * 시간복잡도 O(n^2)
 */
public class 삽입정렬 {
    public static void main(String[] args) {
        int[] array = {7,5,9,0,3,1,6,2,4,8};

        for(int i = 1; i<array.length; i++){
            for(int j = 0; j< i; j++){
                int temp = array[j];
                if(array[i] < array[j]){
                    array[j] = array[i];
                    array[i] = temp;
                }
            }
        }

        for(int n : array){
            System.out.println(n + " ");
        }
    }
}
