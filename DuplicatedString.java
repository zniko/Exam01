public class DuplicatedString {

    public static void main(String[] args) {

       int n = 2;
        String[] myArray = new String[2];
        myArray[0]="a";
        myArray[1]="b";

        int currentSize = myArray.length;
        String[] tempArray = new String[ n*currentSize ];
        for (int i=0; i<2; i++){
                int a=1;
                if(a<=n)
                  tempArray[a-1] = myArray[i];

                a++;
            }
        myArray=tempArray;


        for (String element:tempArray ) {
            System.out.println( element );
        }

        }


    }




