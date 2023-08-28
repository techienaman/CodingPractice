package BinarySearchExplained;

public class PivotElementInRotatedSortedArray {
    public static void main(String[] args) {
        int arr[]={12,24,45,7,8,9};
        System.out.println(pivotElementInRotatedSortedArray(arr));


    }
    public static int pivotElementInRotatedSortedArray(int[] arr){
        int start=0;
        int end=arr.length-1;
        int mid=start+(end-start)/2;

        while(start<end){
            if(arr[mid]>arr[0]){
                start=mid+1;
            }
            else{
                end=mid;
            }
             mid=start+(end-start)/2;
        }
        return end;

    }

}
