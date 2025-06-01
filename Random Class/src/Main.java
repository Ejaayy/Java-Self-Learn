import java.util.Random;

public class Main {
    public static void main(String args[]){

        Random random = new Random();

        //int number;
        //number = random.nextInt(1, 6);

        //double number;
        //number = random.nextDouble(); //generates random between 0-1

        boolean isHeads = random.nextBoolean();

        if(isHeads){
            System.out.println("Gay");
        }
        else{
            System.out.println("LMAO");
        }



    }
}
