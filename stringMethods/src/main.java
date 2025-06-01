public class main {
    public static void main(String[] args) {

        String name = "Bro code";

        int length = name.length();

        char letter = name.charAt(1);
        System.out.println(letter);
        int index = name.indexOf("o");
        int lastindex = name.lastIndexOf('o');

        name = name.toUpperCase();
        name = name.toLowerCase();
        name = name.replace("o", "a");

        boolean result = name.isEmpty();
        result = name.contains(" ");
        result = name.equals("someString");
        result = name.equalsIgnoreCase("someString");

        System.out.println(result);
    }
}
