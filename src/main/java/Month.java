public enum Month {
    JANUARY(31, "WINTER"),
    FEBRUARY(28, "SPRING"),
    MARCH(31, "SPRING"),
    APRIL(30, "SPRING"),
    MAY(31, "SUMMER"),
    JUNE(30, "SUMMER"),
    JULY(31, "SUMMER"),
    AUGUST(31, "AUTUMN"),
    SEPTEMBER(30, "AUTUMN"),
    OCTOBER(31, "AUTUMN"),
    NOVEMBER(30, "WINTER"),
    DECEMBER(31, "WINTER");

    String seasons;
    int days;

    Month(int days, String seasons) {
        this.seasons = seasons;
        this.days = days;
    }

    public String getSeasons() {
        return seasons;
    }

    public void setSeasons(String seasons) {
        this.seasons = seasons;
    }

    public int getDays() {
        return days;
    }

    public void setDays(int days) {
        this.days = days;
    }

}
