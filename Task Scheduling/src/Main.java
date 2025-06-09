import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        TaskPlan taskplan = new TaskPlan();
        taskplan.taskList = new Task[2]; //creates an array that can hold 2 task objects, still empty

        // initialize all tasks once
        for(int i = 0; i < taskplan.taskList.length; i++) {
            taskplan.taskList[i] = new Task();
        }

        System.out.println("Welcome to your Task Scheduler!");
        System.out.println("Please input your tasks below: ");
        System.out.println("---------------------------------");

        for(int i=0; i< taskplan.taskList.length; i++){


            System.out.printf("Task %d Name: ", i+1);
            taskplan.taskList[i].setShortName(scanner.nextLine());

            System.out.printf("Task %d Description: ", i+1);
            taskplan.taskList[i].setDescription(scanner.nextLine());

            boolean flag = true;

            while(flag){ //Loop for time schedule conflict

                //It will loop if either of the error handling methods for time fail
                //If user succeeds, it will mark false on all of them, thus exiting the loop
                do {
                    System.out.print("Input Starting Time [00:00 - 23:59]: ");
                    String startingTime = scanner.nextLine();
                    taskplan.taskList[i].getStartTime().initializeTime(startingTime);
                } while (taskplan.taskList[i].getStartTime().validate() == false);

                do{
                    System.out.print("Input Ending Time [00:00 - 23:59]: ");
                    String endingTime = scanner.nextLine();
                    taskplan.taskList[i].getEndTime().initializeTime(endingTime);
                }while(taskplan.taskList[i].getEndTime().validate() == false || taskplan.taskList[i].isValid() == false);


                //Reaching here means that there are valid startTime and endTime
                //Check for conflicts

                if(taskplan.isTimeSlotAvailable(taskplan.taskList[i].getStartTime(), taskplan.taskList[i].getEndTime(), taskplan.taskList[i])){
                    flag = false;
                }
                else{
                    System.out.println("Scheduling conflict! Please input a valid schedule. ");
                }

            }

            System.out.println("---------------------------------");
        }
        TaskSorter sort = new TaskSorter(taskplan.taskList);
        sort.sortByEndTime(taskplan.taskList);
        taskplan.taskList = sort.getSortedTasks();
        taskplan.displayTasks();
    }
}
