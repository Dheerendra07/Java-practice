public class pattern_array {
    public static void main(String[] args) {

        int[] pattern_array = { 10, 20, 30, 40, 50 };
        int target = 30;
        int index = -1;

        for (int i = 0; i < pattern_array.length; i++) {
            if (pattern_array[i] == target) {
                index = i;
            }

        }
        if (index != -1) {
            System.out.println("Element found at index" + index);
        }
        else{
            System.out.println("Element not found");
        }


        // count element
        int[] arr = {10, 20, 30, 40, 50, 10, 10};
        int match = 10;
        int count = 0; 

        for(int i = 0; i<arr.length; i++){
            if(arr[i] == match){
            count++;
            }
        }
        System.out.println(count);

        // Last occurence
        int[] array = {10, 20, 30, 40, 30, 50};
        int Target = 30;
        int last = -1;


    for(int i=0; i<array.length; i++){
        if(array[i] == Target){
            last = i;
        }
    }
    System.out.println(last);

    // Maximum number
    int[] maxArr = {10, 20, 30, 40, 50};
    int max = maxArr[0];

    for(int i=1; i<maxArr.length; i++){
        if(maxArr[i] > max){
        max = maxArr[i];
    }}
    System.out.println(max);

// Minimum
    int[] minArr = {10, 20, 30, 40, 50};
    int min = minArr[0];

    for(int i=1; i<minArr.length; i++){
        if(minArr[i] < min){
        min = minArr[i];

    }}
    System.out.println(min);

    // Positive/Negative
    int[] Arr = {10, 20, 30, 40, 50};
    for(int i =0; i<Arr.length; i++){
        if(Arr[i] > 0){
            System.out.println("Positive numbers: " + Arr[i]);
        }
    }
    }
}