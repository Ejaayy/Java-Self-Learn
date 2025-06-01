import com.forest.*;

public class Main {
    public static void main(String[] args){
        Owl owl1 = new Owl(); //this Owl() is calling the constructors
        Owl owl2 = new Owl("White");
        Mushroom m1 = new Mushroom();

        owl1.eat(m1);
        //m1 has an initial size of 10, but owl eats it so it goes to 5

        //END OF THE DAY
        owl1.grow();
        m1.grow();

        System.out.println("Owl size: " + owl1.getSize());
        System.out.println("Mushroom size: " + m1.getSize());

    }
}
