package geoPolitics;

public enum GeoPoliticalZone {
    NORTH_CENTRAL("benue", "fct", "nogi", "nwara", "nasawara", "niger", "plateau"),
    NORTH_EAST("adamawa", "bauchi", "borno", "gombe", "taraba", "yobe"),
    NORTH_WEST("kaduna", "katsina", "kano", "kebbi", "sokoto", "jigawa", "zamfara"),
    SOUTH_EAST("abia", "anambra", "ebonyi", "enugu", "imo"),
    SOUTH_SOUTH("akwa-ibom", "bayelsa", "cross-river", "delta", "edo", "rivers"),
    SOUTH_WEST("ekiti", "lagos", "osun", "ondo", "ogun", "oyo");

    private String[] states;

    GeoPoliticalZone(String... states) {
        this.states = states;
    }

    public String[] getStates() {
        return states;
    }
}
