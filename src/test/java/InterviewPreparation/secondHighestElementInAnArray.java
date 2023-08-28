package InterviewPreparation;

public class secondHighestElementInAnArray {
    public static void main(String[] args) {
        int[] arr={23,45,56,76,87,31};
        System.out.println(findSecondHighestElementOfArray(arr));
    }

    public static int findSecondHighestElementOfArray(int[] arr){

        int secondHighest=Integer.MIN_VALUE;
        int highest=Integer.MIN_VALUE;

        for(int i=0;i<arr.length;i++){
            if(arr[i]>highest){
                secondHighest=highest;
                highest=arr[i];
            }
            else if(arr[i]>secondHighest){
                secondHighest=arr[i];
            }

        }
        return secondHighest;
    }

}
