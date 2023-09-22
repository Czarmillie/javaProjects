public class Watch {
    private int seconds;
    private int minutes;

    private int days;

    private int years;

    public int getSeconds() {
        seconds = minutes * 60;
        return seconds;
    }

    public void setMinutes(int minutes) {
        if (minutes > 0) this.minutes = minutes;


    }

    public int getDays() {
        days = minutes / 1440;
        return days;
    }

    public int getYears() {
        years = minutes / 525600;
        return years;
    }
}

