import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        TaskPlan taskplan = new TaskPlan();

        System.out.println("Welcome to your Task Scheduler!");
        System.out.println("Please input your tasks below: ");

        for(int i=0; i<2; i++){
            System.out.printf("Task %d Name: ", i);
            taskplan.tasks[i].shortName = scanner.nextLine();
            System.out.printf("Task %d Description: ", i);
            taskplan.tasks[i].description = scanner.nextLine();

            taskplan.tasks[i].startTime = scanner.nextInt();
                //while(taskplan.tasks[i].startTime.validate())
            taskplan.tasks[i].endTime = scanner.nextInt();

        }

        taskplan.displayTasks();
    }
}
