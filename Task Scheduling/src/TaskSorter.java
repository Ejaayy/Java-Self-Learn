import java.util.Arrays;
import java.util.Scanner;


public class TaskSorter {

    //Properties
    private Task[] taskList;

    //Constructor
    public TaskSorter(Task[] taskList) {
        this.taskList = taskList;
    }

    //Methods

    public void sortByEndTime(Task[] tasks) {
        int n = tasks.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (tasks[j].getEndTime().isAfter(tasks[j + 1].getEndTime())) {
                    // swap tasks[j] and tasks[j+1]
                    Task temp = tasks[j];
                    tasks[j] = tasks[j + 1];
                    tasks[j + 1] = temp;
                }
            }
        }
    }

    public Task[] getSortedTasks() {
        return taskList;
    }
}
