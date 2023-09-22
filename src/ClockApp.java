public class Clock {
    public int hour;
    public int minute;
    public int second;
    public Clock(int hour, int minute, int second){
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }
    public void setHour(){
        if (hour > 23){
            this.hour = hour;
        }
    }
    public int getHour(){
        return hour;
    }
    public void setMinute() {
        if (minute > 59) {
            this.minute = minute;
        }
    }
    public int getMinute(){
        return minute;
    }
    public void setSecond() {
        if (second > 59) {
            this.second = second;
        }
    }
    public int getSecond(){
        return second;
    }
}
