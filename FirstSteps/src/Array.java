/**
 * Created by kuzorov on 12.07.2017.
 */
public class Array {
    public static void main (String[] args){
     int[] arr = {21,98,985,1,6,2,7};
     for(int i=0; i<arr.length-1; i++){
         for(int j=0; j<arr.length-i-1; j++){
             if (arr[j] < arr[j+1]){
                 int temp = arr[j];
                 arr[j] = arr[j+1];
                 arr[j+1] = temp;
             }
         }
         }
        for(int elem:arr){
            System.out.print(elem + " ");
     }
    }


}
