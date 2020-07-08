package hbcu.stay.ready.mastering_loops;

public class TableUtilities {
    public static String getSmallMultiplicationTable() {
        String output = "";
        for(int i = 1; i < 6;i++) {
            for(int c = 1; c < 6; c++) {
                if(i*c < 10) {
                    output += "  " +i*c +" |";
                } else {
                    output += " " +i*c + " |";
                }
            }
            output += "\n";
        }
        return output;
    }

    public static String getLargeMultiplicationTable() {
        String output = "";
        for(int i = 1; i <= 10;i++) {
            for(int c = 1; c <= 10; c++) {
                if(i*c < 10) {
                    output += "  " +i*c +" |";
                }
                else if(i*c >= 10 && i*c <100) {
                    output +=" " +i*c +" |";
                }else{
                    output += i*c + " |";
                }
            }
            output += "\n";
        }
        return output;
    }

    public static String getMultiplicationTable(int tableSize) {
        String output = "";
        for(int i = 1; i <= tableSize;i++) {
            for(int c = 1; c <= tableSize; c++) {
                if(i*c < 10) {
                    output += "  " +i*c +" |";
                }
                else if(i*c >= 10 && i*c <100) {
                    output +=" " +i*c +" |";
                }else{
                    output += i*c + " |";
                }
            }
            output += "\n";
        }
        return output;
    }
}
