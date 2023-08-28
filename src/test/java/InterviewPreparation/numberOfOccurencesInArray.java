package InterviewPreparation;

import java.util.HashMap;
import java.util.Map;

public class numberOfOccurencesInArray {
    public static void main(String[] args) {
        int[] arr={1,1,1,4,5,6,6,6,7,1,2,3,2,1,2,1};
        Map<Integer,Integer> finalMap=numberOfOccurenceInArray(arr);
        System.out.println(finalMap);
    }


    public static Map numberOfOccurenceInArray(int[] arr){
        Map<Integer,Integer> hashMap=new HashMap<Integer,Integer>();
        for(int i=0;i<arr.length;i++){
            if(hashMap.containsKey(arr[i])){
                hashMap.put(arr[i],hashMap.get(arr[i])+1);
            }
            else{
               hashMap.put(arr[i],1);
            }
        }
        return hashMap;
    }
}
