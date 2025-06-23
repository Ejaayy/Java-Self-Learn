import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        new Main().menu(); ;
    }
    public void menu(){
        Scanner scanner = new Scanner(System.in);
        String[] courses = new String[3];
        int index=0;
        boolean running = true;
        while(running){
            System.out.println("Welcome to Courses!");
            System.out.println("---------------------");
            System.out.println("1. Add Course");
            System.out.println("2. Search Course");
            System.out.println("3. Exit");
            System.out.print("Choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); //input buffer

            switch (choice){
                case 1:
                    System.out.print("Enter course name: ");
                    String name = scanner.nextLine();
                    if(this.addCourse(courses, name, index)){
                        index++;
                    }
                    break;
                case 2:
                    System.out.print("Enter course name: ");
                    String namesearch = scanner.nextLine();
                    if(this.searchCard(courses, namesearch, index)){
                        System.out.println("course found");
                    }
                    else{
                        System.out.println("course not found");
                    }
                    break;
                case 3:
                    running=false;
                    break;
            }
        }
    }
    public boolean addCourse(String[] courses, String name, int index){
        if (index >= courses.length) {
            return false;
        }
        else{
            courses[index] = name;
            return true;
        }
    }

    public boolean searchCard(String[] courses, String name, int index){
        for(int i=0; i<index; i++){
            if(courses[i].equals(name)){
                return true;
            }
        }
        return false;
    }


}