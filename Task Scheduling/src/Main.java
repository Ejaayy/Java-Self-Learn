import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        TaskPlan taskplan = new TaskPlan();
        taskplan.taskList = new Task[2]; //creates an array that can hold 2 task objects, still empty

        System.out.println("Welcome to your Task Scheduler!");
        System.out.println("Please input your tasks below: ");
        System.out.println("---------------------------------");

        for(int i=0; i<2; i++){

            taskplan.taskList[i] = new Task(); //Task object to put inside the array
            taskplan.taskList[i].startTime = new Time();
            taskplan.taskList[i].endTime = new Time();

            System.out.printf("Task %d Name: ", i+1);
            taskplan.taskList[i].shortName = scanner.nextLine();
            System.out.printf("Task %d Description: ", i+1);
            taskplan.taskList[i].description = scanner.nextLine();

            boolean flag = true;

            while(flag){ //Loop for time schedule conflict

                //It will loop if either of the error handling methods for time fail
                //If user succeeds, it will mark false on all of them, thus exiting the loop
                do{
                    System.out.print("Input Starting Time [00:00 - 23:59]");
                    String startingTime = scanner.nextLine();
                    taskplan.taskList[i].startTime.initializeTime(startingTime);
                }while(taskplan.taskList[i].startTime.validate() == false);

                do{
                    System.out.print("Input Ending Time [00:00 - 23:59]");
                    String endingTime = scanner.nextLine();
                    taskplan.taskList[i].endTime.initializeTime(endingTime);
                }while(taskplan.taskList[i].endTime.validate() == false || taskplan.taskList[i].isValid() == false);


                //Reaching here means that there are valid startTime and endTime
                //Check for conflicts

                if(taskplan.isTimeSlotAvailable(taskplan.taskList[i].startTime))

            }

            System.out.println("---------------------------------");
        }

        taskplan.displayTasks();
    }
}
