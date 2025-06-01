public class Main {
    public static void main(String[] args){

        String name = "bro";
        int age = 15;
        happyBirthday(name, age);
    }

    static void happyBirthday(String name, int age){
        System.out.printf("Happy %dth\n", age);
        System.out.println("Birthday");
        System.out.printf("To %s!", name);
    }
}
