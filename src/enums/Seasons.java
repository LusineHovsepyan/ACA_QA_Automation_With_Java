package enums;

public enum Seasons {
    WINTER("winter"), SPRING("spring"), SUMMER("summer"), FALL("fall");
    public final String value;

    Seasons(String season) {
        this.value = season;
    }
}
