public enum Time {
    Breakfast("It's time to breakfast!)"),
    Lunch("It's time to lunch!)"),
    Dinner("It's time to dinner!)"),
    Sleep("It's time to sleep!)");

    final String time;

    Time(String time){
        this.time = time;
    }

    public String getTime() {
        return time;
    }
}
