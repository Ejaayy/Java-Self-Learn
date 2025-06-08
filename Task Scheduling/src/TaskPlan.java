import java.util.List;

public class TaskPlan {

    // Properties / Attributes
    public Task[] taskList;

    // Methods
    public void displayTasks(){
        System.out.println("Here is your schedule for today!");
        for(int i=0; i< this.taskList.length; i++){
            System.out.println(taskList[i].taskFormat());
        }
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

}
