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

    public boolean isTimeSlotAvailable(Time newStart, Time newEnd, Task currentTask) {
        for (int i =0 ; i<2; i++) {
            if(taskList[i] == currentTask){
                continue; //skip
            }
            else{
                // overlap if newStart < endTime AND startTime < newEnd
                if (newStart.isBefore(taskList[i].endTime) && taskList[i.startTime.isBefore(newEnd)) {
                    return false; // time slot is occupied
                }
            }

        }
        return true;
    }

}
