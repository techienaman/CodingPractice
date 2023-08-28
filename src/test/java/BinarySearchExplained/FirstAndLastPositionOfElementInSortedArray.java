package BinarySearchExplained;

public class FirstAndLastPositionOfElementInSortedArray {

    public static void main(String[] args){
        int[] arr={0,5,5,6,6,6};
        System.out.println("First Occurence Of An Element is at index->"+firstOccurenceOfAnElement(arr,6));
        System.out.println("Last Occurence Of An Element is at index->"+lastOccurenceOfAnElement(arr,6));

    }

    public static int firstOccurenceOfAnElement(int[] arr,int itemToBeSearched){
        int start=0;
        int end=arr.length-1;
        int firstPosition=-2;

        int mid=start+(end-start)/2;

        while(start<=end){
            if(arr[mid]==itemToBeSearched){
                firstPosition=mid;
                end=mid-1;
            }
            else if(arr[mid]>itemToBeSearched){
                end=mid-1;

            }
            else if(arr[mid]<itemToBeSearched){
                start=mid+1;
            }

            mid=start+(end-start)/2;

        }
        return firstPosition;
    }

    public static int lastOccurenceOfAnElement(int[] arr,int itemToBeSearched){
        int start=0;
        int end=arr.length-1;
        int firstPosition=-2;

        int mid=start+(end-start)/2;

        while(start<=end){
            if(arr[mid]==itemToBeSearched){
                firstPosition=mid;
                start=mid+1;
            }
            else if(arr[mid]>itemToBeSearched){
                end=mid-1;

            }
            else if(arr[mid]<itemToBeSearched){
                start=mid+1;
            }
            mid=start+(end-start)/2;

        }
        return firstPosition;
    }
}
