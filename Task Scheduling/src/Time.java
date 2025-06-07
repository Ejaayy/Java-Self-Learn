public class Time {

    //Properties
    public int minutes;
    public int hour;

    //Methods

    public boolean validate(int mins, int hrs){

        //validate if its within 00:00 - 23:59
        boolean valid = false;

        if (hrs >= 0 && hrs <= 23){
            if (mins >= 0 && min <= 59){
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

    public void initializeTime(String time){
        int tempMinutes = Integer.parseInt(time.substring(0, 2));
        int tempHour = Integer.parseInt(time.substring(3, 5));
    }

    public void setMinutes(int minutes){
        this.minutes = minutes;
    }

    public void setHour(int hour){
        this.hour = hour;
    }

    public int getMinutes(){
        return this.minutes;
    }

    public int getHour(){
        return this.hour;
    }

}
