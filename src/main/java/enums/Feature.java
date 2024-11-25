package enums;

import static java.util.Objects.isNull;

public enum Feature {
    TRAILERS("Trailers"),
    COMMENTARIES("Commentaries"),
    DELETED_SCENES("Deleted Scenes"),
    BEHIND_THE_SCENES("Behind the Scenes");

    private final String str;

    Feature(String s) {
        this.str = s;
    }

    public String getStr() {
        return str;
    }

    public static Feature getFeatureByString(String str) {
        if (isNull(str) || str.isEmpty()) {
            return null;
        }
        Feature[] features = Feature.values();
        for (Feature feature:features) {
            if (feature.str.equals(str)) {
                return feature;
            }
        }
        return null;
    }
}
