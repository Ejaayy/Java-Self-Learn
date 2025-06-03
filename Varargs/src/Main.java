public class Main {
    public static void main(String[] args){
        // varargs = allow a method to accept a varying # of arguments

        System.out.println(add(1,2,3));
    }

    static int add(int... numbers){ //its an array
        int sum = 0;
        for(int i=0; i<numbers.length; i++){
            sum += numbers[i];
        }
        return sum;
    }
}
