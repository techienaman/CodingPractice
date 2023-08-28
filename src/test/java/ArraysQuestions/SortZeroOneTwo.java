package ArraysQuestions;

public class SortZeroOneTwo {
    public static void main(String[] args) {
        int[] arr={0,0,1,1,0,2,1,2,1,1,2,2,0,1,0,0,1,0};
        sortZeroOneTwo(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }

    }
    public static void swap(int[] arr,int i,int j){
        int temp;
        temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    public static void sortZeroOneTwo(int[] arr){
        int i=0;
        int j=i+1;
        int k=arr.length-1;

        while(j<k){
            if(arr[i]==0){
                i++;
                j++;
            }
            else if(arr[i]==1 && arr[j]==0){
                swap(arr,i,j);
                i++;
                j++;
            }
            else if(arr[i]==1 && arr[j]==2){
                swap(arr,j,k);
                k--;

            }
            else if(arr[i]==1 && arr[j]==1){
                j++;
            }
            else if(arr[j]==2){
                swap(arr,i,k);
                k--;
            }
        }
    }
}
