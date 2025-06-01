public class Main {
    public static void main(String[] args){

        //overloaded methods = methods that share the same name but different parameters

        System.out.println(add(5,3, 4));

    }

    static double add(double a, double b){
        return a+b;
    }

    static double add(double a, double b, double c){
        return a+b+c;
    }


}
