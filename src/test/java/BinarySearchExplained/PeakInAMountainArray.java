package BinarySearchExplained;

public class PeakInAMountainArray {

    public static void main(String[] args){
        int[] arr1={9,18,27,45,38,28,4};
        int[] arr2={0,10,5};
        System.out.println(findPeakInAMountainArray(arr1));

    }
    public static int findPeakInAMountainArray(int[] arr){
        int start=0;
        int end=arr.length-1;

        int mid=start+(end-start)/2;

        while(start<end){
            if(arr[mid]<arr[mid+1]){
                start=mid+1;
            }
            else{
                end=mid;
            }
            mid=start+(end-start)/2;

        }
        return mid;

    }
}
