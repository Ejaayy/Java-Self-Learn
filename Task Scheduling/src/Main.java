import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        TaskPlan taskplan = new TaskPlan();
        taskplan.taskList = new Task[2]; //creates an array that can hold 2 task objects, still empty

        System.out.println("Welcome to your Task Scheduler!");
        System.out.println("Please input your tasks below: ");

        for(int i=0; i<2; i++){
            taskplan.taskList[i] = new Task(); //Task object to put inside the array
            taskplan.taskList[i].startTime = new Time();
            taskplan.taskList[i].endTime = new Time();

            System.out.printf("Task %d Name: ", i);
            taskplan.taskList[i].shortName = scanner.nextLine();
            System.out.printf("Task %d Description: ", i);
            taskplan.taskList[i].description = scanner.nextLine();

            String startingTime = scanner.nextLine();
            taskplan.taskList[i].startTime.initializeTime(startingTime);

            String endingTime = scanner.nextLine();
            taskplan.taskList[i].endTime.initializeTime(endingTime);
        }

        taskplan.displayTasks();
    }
}
