package sorting;
import java.util.Arrays;
public class selection_sort {
    public static void main(String[] args){
        int[] array = {10, 30, 40, 20, 60, 50};

        for(int i = 0; i<array.length-1; i++){
            for(int j = i+1; j<array.length; j++){
                if(array[i] > array[j]){
                  int temp = array[i];
                  array[i] = array[j];
                  array[j] = temp;
                }
            }
        }
        System.out.println("Sorted array: " + Arrays.toString(array));
    }
}
