import java.util.Arrays;
import java.util.Scanner;


public class TaskSorter {

    //Properties
    private Task[] taskList;
    private int n;

    //Constructor
    public TaskSorter(Task[] taskList) {
        //Copies the taskList for sorting
        this.taskList = Arrays.copyOf(taskList);
        this.n = taskList.length;
    }

    //Methods

    public void sortByEndTime() {

        for (int i = 0; i < this.n - 1; i++) {
            for (int j = 0; j < this.n - i - 1; j++) {
                if (taskList[j].getEndTime().isAfter(taskList[j + 1].getEndTime())) {
                    // swap tasks[j] and tasks[j+1]
                    Task temp = taskList[j];
                    taskList[j] = taskList[j + 1];
                    taskList[j + 1] = temp;
                }
            }
        }
    }

    public void greedyAlgorithm(Task[] tasks){
        sortByEndTime();

        tasks[0] = taskList[0];
        for(int i =1 ; i < this.n; i++){
            for(int j = i + 1; j < this.n; j++){

            }
        }
    }
    public Task[] getSortedTasks() {
        return taskList;
    }
}
