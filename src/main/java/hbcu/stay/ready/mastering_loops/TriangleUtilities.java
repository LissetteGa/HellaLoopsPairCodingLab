package hbcu.stay.ready.mastering_loops;

public class TriangleUtilities {

    public static String getTriangle(int numberOfRows) {
        String output = "";
        for(int i = 1; i < numberOfRows; i++) { //getRow = number of stars. row number = number of stars
            output += getRow(i)+ "\n";
        }
        return output;
    }

    public static String getRow(int numberOfStars) {
        String output = "";
        for(int i = 1; i <= numberOfStars; i++) {
            output += "*";
        }
        return output;
    }

    public static String getSmallTriangle() {
        String output = "";
        for(int i = 1; i <= 4; i++) {
            output += getRow(i) + "\n";
        }
        return output;
    }

    public static String getLargeTriangle() {
        String output = "";
        for(int i = 1; i <= 9; i++) {
            output += getRow(i) + "\n";
        }
        return output;
    }
}
