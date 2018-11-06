public class Odd_even {
    public static void main(String[] args) {
         int [] array = {1,2,3,8,4,5,6,7,8,9,10,12,15,11,16};
         int even=0,odd=0;

         for (int i=0; i<array.length; i++){
             if(array[i]%2==0){
                 even++;
             }
            else odd++;



        }

        System.out.println("We get: " + even + " even numbers and  : "+odd+" odd numbers");


    }




}
