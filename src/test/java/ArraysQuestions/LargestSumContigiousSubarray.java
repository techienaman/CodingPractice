package ArraysQuestions;

public class LargestSumContigiousSubarray {
    public static void main(String[] args) {
        int[] arr={-4,4,6,-3,4,-1};
        System.out.println(findSumContigiousSubArray(arr));

    }

    public  static int findSumContigiousSubArray(int[] arr){
        int currentSum=0;
        int finalSum=0;

        for(int i=0;i<arr.length;i++){
            currentSum=currentSum+arr[i];
            if(currentSum<0){
                currentSum=0;

            }
            else if(currentSum>finalSum){
                finalSum=currentSum;

            }

        }
        return finalSum;
    }
}
