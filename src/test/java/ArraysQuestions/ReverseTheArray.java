package ArraysQuestions;

public class ReverseTheArray {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        reverseTheArray(arr);
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }


    }
    public static void swap(int[] arr,int i,int j){
        int temp;
        temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;

    }

    public static void reverseTheArray(int[] arr){
        int i=0;
        int j=arr.length-1;
        while(i<j){
            swap(arr,i,j);
            i++;
            j--;
        }
    }
}
