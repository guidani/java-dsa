package DSA;

public class MinValue {

    public static void main(String[] args) {
        Integer[] myArray = {4,2,6,7,1,3,47,3,9};

        int min_value = myArray[0];
    
        for (int i = 0; i < myArray.length; i++){
            if( myArray[i] < min_value){
                min_value = myArray[i];
            }
        }
        System.out.println("Menor valor: " + min_value);
    }

    
}
