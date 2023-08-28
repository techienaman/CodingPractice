package ArraysQuestions;

public class MoveAllNegativeElementToOneSideOfArray {
    public static void main(String[] args) {
        int[] arr={-1,-2,3,4,-8,-16,18,29,-31,56};
        moveAllNegativeElementToOneSideOFArray(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+"  ");
        }

    }

    public static void swap(int[] arr,int i,int j){
        int temp;
        temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }

    public static void moveAllNegativeElementToOneSideOFArray(int[] arr){
        int i=0;
        int j=i+1;
        while(j<arr.length){
            if(arr[i]>0){
                i++;
                j++;
            }
            else if(arr[i]<0 && arr[j]>0){
                swap(arr,i,j);
                i++;
                j++;
            }
            else if(arr[i]<0 && arr[j]<0){
                j++;
            }
        }
    }
}
