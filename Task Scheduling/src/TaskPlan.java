import java.util.Scanner;

public class TaskPlan {

    // Properties / Attributes
    public Task[] taskList;

    // Methods

    public void run(TaskPlan taskplan) {
        Scanner scanner = new Scanner(System.in);
        taskList = new Task[2];

        for (int i = 0; i < taskList.length; i++) {
            taskList[i] = new Task();
        }

        System.out.println("Welcome to your Task Scheduler!");
        System.out.println("Please input your tasks below: ");
        System.out.println("---------------------------------");

        for (int i = 0; i < taskList.length; i++) {
            System.out.printf("Task %d Name: ", i + 1);
            taskList[i].setShortName(scanner.nextLine());

            System.out.printf("Task %d Description: ", i + 1);
            taskList[i].setDescription(scanner.nextLine());

            boolean flag = true;

            do {
                System.out.print("Input Starting Time [00:00 - 23:59]: ");
                String startingTime = scanner.nextLine();
                taskList[i].getStartTime().initializeTime(startingTime);
            } while (!taskList[i].getStartTime().validate());

            do {
                System.out.print("Input Ending Time [00:00 - 23:59]: ");
                String endingTime = scanner.nextLine();
                taskList[i].getEndTime().initializeTime(endingTime);
            } while (!taskList[i].getEndTime().validate() || !taskList[i].isValid());

            System.out.println("---------------------------------");
        }

        TaskSorter sort = new TaskSorter(taskList);

        taskplan.displayTasks();

        scanner.close();
    }

    public boolean isTimeSlotAvailable(Time newStart, Time newEnd, Task currentTask) {
        for (int i =0 ; i<this.taskList.length; i++) {
            if(taskList[i] == currentTask){
                continue; //skip
            }
            else{
                // overlap if newStart < endTime AND startTime < newEnd
                if (newStart.isBefore(taskList[i].getEndTime()) && taskList[i].getStartTime().isBefore(newEnd)) {
                    return false; // time slot is occupied
                }
            }

        }
        return true;
    }

    public void displayTasks(){
        System.out.println("Here is your schedule for today!");
        for(int i=0; i< this.taskList.length; i++){
            System.out.println(taskList[i].taskFormat());
        }
    }
}
