import java.util.Arrays;

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

        List<Task> selectedTasks = new ArrayList<>();
        selectedTasks.add(tasks[0]);
        Time lastEndTime = tasks[0].getEndTime();

        for (int i = 1; i < tasks.length; i++) {
            if (!tasks[i].getStartTime().isBefore(lastEndTime)) {
                selectedTasks.add(tasks[i]);
                lastEndTime = tasks[i].getEndTime();
            }
        }
    }

    public Task[] getSortedTasks() {
        return taskList;
    }
}
