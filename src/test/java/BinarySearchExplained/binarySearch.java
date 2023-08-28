package BinarySearchExplained;

public class binarySearch {
    public static void main(String[] args) {
        int[] evenArray = {3, 5, 9, 13, 27,31};
        int[] oddArray = {2,4,6,8,12};
        System.out.println(findElementUsingBinarySearch(evenArray,13));
        System.out.println(findElementUsingBinarySearch(oddArray,4));
    }

    public static int findElementUsingBinarySearch(int[] arr,int key){
        int start=0;
        int end=arr.length-1;

        int mid=start+(end-start)/2;
        while(start<=end){
            if(arr[mid]==key){
                return mid;
            }
            else if(key>arr[mid]){
                start=mid+1;
            }
            else{
                end=mid-1;
            }
            mid=start+(end-start)/2;
        }
        return -1;

    }




}
