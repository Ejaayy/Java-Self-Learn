public class Time {

    //Properties
    public int minutes;
    public int hour;

    //Methods

    public boolean validate(){

        //validate if its within 00:00 - 23:59
        boolean valid = false;

        if (this.hour >= 0 && this.hour <= 23){
            if (this.minutes >= 0 && this.minutes <= 59){
                valid = true;
            }
        }

        return valid;
    }

    public boolean isBefore(Time time){

        //Returns true if this.time is before

        boolean status = false;
        if(this.hour < time.hour){
            status = true;
        }
        else if(this.hour == time.hour){
            if(this.minutes < time.minutes){
                status = true;
            }
        }

        return status;
    }

    public boolean isAfter(Time time){

            boolean status = false;
            if(this.hour > time.hour){
                status = true;
            }
            else if(this.hour == time.hour){
                if(this.minutes > time.minutes){
                    status = true;
                }
            }

            return status;
    }

    public String timeFormat(){
        String format = this.hour + ":" + this.minutes;
        return format;
    }




}
