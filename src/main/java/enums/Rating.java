package enums;

public enum Rating {
    G("G"),
    PG("PG"),
    PG13("PG-13"),
    R("R"),
    NC17("NC-17");

    private final String str;

    Rating(String s) {
        this.str = s;
    }

    public String getStr() {
        return str;
    }
}
