public class Task {

    //Properties / Attributes

    String shortName;
    String description;
    Time startTime;
    Time endTime;

    // Methods

    public boolean isValid(){
        //checks if start and end times are valid
        boolean status = false;

        if(this.startTime.isBefore(this.endTime)){
            status = true;
        }
        return status;
    }

    public String taskFormat(){
        //Returns in correct format
        String format = startTime.timeFormat() + " to " + endTime.timeFormat() + " : " + shortName + " - " + description;
        return format;
    }

}
