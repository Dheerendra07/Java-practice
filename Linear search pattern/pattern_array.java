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
    }
}