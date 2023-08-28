package BinarySearchExplained;

public class NumberOfOccurenceOfAnElement {

    //We can find the number of occurences of an  Element using Binary Search method because in this approach the Time compleity will be log(n)
    // What we will dois we will find the first occurence of the element and the last occurence of the element and we will do
    //(Last Occurence - First Occurence)+1

    public static void main(String[] args){
        int[] arr={1,2,2,3,3,3,3,3,3,3,3,4,4,5};
        int firstIndex=findFirstOccurenceOfAnElement(arr,3);
        int lastIndex=lastOccurenceOfAnElement(arr,3);
        System.out.println(findFirstOccurenceOfAnElement(arr,3));
        System.out.println(lastOccurenceOfAnElement(arr,3));

        int numberOfOccurenceof=(lastIndex-firstIndex)+1;
        System.out.println(numberOfOccurenceof);
    }
    public static int findFirstOccurenceOfAnElement(int[] arr,int n){
        int start=0;
        int end=arr.length-1;

        int mid=start+(end-start)/2;
        int answer=-2;

        while(start<=end){
            if(arr[mid]==n){
                answer=mid;
                end=mid-1;
            }
            else if(arr[mid]>n){
                end=mid-1;
            }
            else if(arr[mid]<n){
                start=mid+1;
            }
            mid=start+(end-start)/2;
        }
        return answer;
    }
    public static int lastOccurenceOfAnElement(int[] arr,int n){
        int start=0;
        int end=arr.length-1;

        int mid=start+(end-start)/2;
        int answers=-2;

        while(start<=end){
            if(arr[mid]==n){
                answers=mid;
                start=mid+1;
            }
            else if(arr[mid]>n){
                end=mid-1;
            }
            else if(arr[mid]<n){
                start=mid+1;
            }
            mid=start+(end-start)/2;
        }
        return answers;
    }
}
