import geoPolitics.GeoPoliticalZone;

import javax.swing.JOptionPane;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        GeoPoliticalZone[] zones = GeoPoliticalZone.values();

        String state = input();
        GeoPoliticalZone zone = getGeoPoliticalZone(zones, state.toLowerCase());
        print(String.format("political zone:%s", zone));
    }

    private static GeoPoliticalZone getGeoPoliticalZone(GeoPoliticalZone[] politicalZones, String states) {
        for (GeoPoliticalZone politicalZone : politicalZones) {
            if (checkIfStateExists(politicalZone, states)) return politicalZone;
        }
        return null;
    }

    private static boolean checkIfStateExists(GeoPoliticalZone politicalZones, String states) {
        return Arrays.asList(politicalZones.getStates()).contains(states);
    }

    private static void print(String prompt) {
        JOptionPane.showMessageDialog(null, prompt);
    }

    private static String input() {
        return JOptionPane.showInputDialog("Enter your state: ");
    }

}