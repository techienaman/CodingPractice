package InterviewPreparation;

public class sortZeroOne {
    public static void main(String[] args) {
        int[] arr={0,1,0,0,1,1,1,0,1,0,1,0,1};
        segregateZeroOne(arr);
        for(int z=0;z<arr.length;z++){
            System.out.print(arr[z]+" ");
        }
    }

    public static void swap(int[] arr,int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;


    }

    public static void segregateZeroOne(int[] arr){
        int i=0;
        int j=i+1;
        while(j<arr.length){
            if(arr[i]==0){
                i++;
                j++;
            }
            else if(arr[i]==1 && arr[j]==0){
                swap(arr,i,j);
                i++;
                j++;

            }

            else if(arr[i]==1 && arr[j]==1){
                j++;
            }
        }

    }


}
