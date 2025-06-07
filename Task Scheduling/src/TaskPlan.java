import java.util.List;

public class TaskPlan {

    // Properties / Attributes
    public Task[] taskList;

    // Methods
    public void displayTasks(){
        for(int i=0; i<2; i++){
            System.out.println(taskList[i].taskFormat());
        }
    }

}
