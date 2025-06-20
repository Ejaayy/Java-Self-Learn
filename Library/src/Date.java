public class Date {

    // Attributes / Properties

    private int month;
    private int day;
    private int year;

    public Date(String date) {
        // Expecting format: MM/DD/YYYY
        String[] parts = date.split("/");
        this.month = Integer.parseInt(parts[0]);
        this.day = Integer.parseInt(parts[1]);
        this.year = Integer.parseInt(parts[2]);
    }

    public getStringFormat(){
        return String.format("%02d/%02d/%04d", month, day, year);
    }

}
