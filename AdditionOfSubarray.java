public class AdditionOfSubarray {

    public static void subArray(int arr[]){
        int l = 0 ;
        int arr_2[] = new int[50];
        System.out.println("Addition of Subarray :-");
        for( int i = 0 ; i < arr.length ; i++){
             
            for( int j = i ; j < arr.length ; j++){

                 for( int k = i ; k <= j ; k++){
                     arr_2[l] += arr[k] ; 
                     
                 }
                 System.out.println(arr_2[l]);
                 l += 1 ;
            }

        }
    }

    public static void main(String[] args){
        int arr[] = {2,4,5,7,9,3};
        subArray(arr);
    }

}
