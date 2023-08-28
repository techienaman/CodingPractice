package ArraysQuestions;

public class FindMaximumMinimumElementInArray {
    public static void main(String[] args) {
        int[] arr={3,5,8,23,45,65,19};
        System.out.println(findMaximumElementInAnArray(arr));
        System.out.println(findMinimumElementInAnArray(arr));
    }
    public static int findMaximumElementInAnArray(int[] arr){
        int max= Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
            else{
                continue;
            }

        }
        return max;

    }
    public static int findMinimumElementInAnArray(int[] arr){
        int min= Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]<min){
                min=arr[i];
            }
            else{
                continue;
            }

        }
        return min;

    }
}
