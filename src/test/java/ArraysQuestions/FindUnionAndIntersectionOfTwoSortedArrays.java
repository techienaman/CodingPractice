package ArraysQuestions;

public class FindUnionAndIntersectionOfTwoSortedArrays {
    public static void main(String[] args) {
        int[] arr1={1,5,7,8,23,45};
        int[] arr2={5,23,45,67,89};
       findIntersectionOfTwoSortedArrays(arr1,arr2);


    }

    public static void findUnionOfTwoSortedArrays(int[] arr1,int[] arr2){
        int i=0;
        int j=0;
        int k=0;
        int[] arr3=new int[arr1.length+arr2.length];

        while(i<arr1.length && j<arr2.length) {
            if (arr1[i] > arr2[j]) {
                arr3[k] = arr2[j];
                k++;
                j++;
            } else if (arr1[i] < arr2[j]) {
                arr3[k] = arr1[i];
                i++;
                k++;

            } else if (arr1[i] == arr2[j]) {
                arr3[k] = arr1[i];
                i++;
                j++;
                k++;
            }
        }

            if(i<arr1.length) {
                while(i<arr1.length){
                    arr3[k]=arr1[i];
                    k++;
                    i++;


                }
            }
            while(j<arr2.length){
                arr3[k]=arr2[j];
                j++;
                k++;


                }
        for(int l=0;l<arr3.length;l++){
            System.out.print(arr3[l]+"  ");
            }
            }




    public static void findIntersectionOfTwoSortedArrays(int[] arr1,int[] arr2){
        int i=0;
        int j=0;
        int k=0;
        int[] arr3=new int[arr1.length+arr2.length];
        while(i<arr1.length && j<arr2.length){
            if(arr1[i]==arr2[j]){
                arr3[k]=arr1[i];
                j++;
                i++;
                k++;
            }
            else if(arr1[i]<arr2[j]){
                i++;
            }
            else if(arr1[i]>arr2[j]){
                j++;

            }
        }
        for(int l=0;l<arr3.length;l++){
            System.out.print(arr3[l]+"  ");
        }


    }
}
