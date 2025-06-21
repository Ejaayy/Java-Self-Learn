public class Date {

    // Attributes / Properties

    private int month;
    private int day;
    private int year;

    public Date(String date) {
        // Expecting format: MM/DD/YYYY and distributes it to Class attributes
        String[] parts = date.split("/");
        this.month = Integer.parseInt(parts[0]);
        this.day = Integer.parseInt(parts[1]);
        this.year = Integer.parseInt(parts[2]);
    }

    public String getStringFormat(){
        //Returns proper format of the Date
        return String.format("%02d/%02d/%04d", this.month, this.day, this.year);
    }

}
