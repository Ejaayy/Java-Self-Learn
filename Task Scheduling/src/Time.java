public class Time {

    //Properties
    int start;
    int end;

    //Methods

    Time(){
        this.start = 0;
        this.end = 0;
    }

    Time(int start, int end){
        this.start = start;
        this.end = end;
    }

    public void setStart(int start){
        this.start = start;
    }

    public int getStart(){
        return this.start;
    }

    public void setEnd(int start){
        this.start = start;
    }

    public int getEnd(){
        return this.end;
    }
}
