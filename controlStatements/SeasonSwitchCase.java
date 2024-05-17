package controlStatements;

/*
 * This program is a demonstration of working of Swtich case 
 */

public class SeasonSwitchCase {
    public static void main(String[] args) {
        int month = 4;
        String season;

        switch (month) {
            case 12:
            case 1:
            case 2:
                season = "Winter";
                break;

            case 3:
            case 4:
            case 5:
                season = "Spring";
                break;

            case 6:
            case 7:
            case 8:
                season = "Summer";
                break;

            case 9:
            case 10:
            case 11:
                season = "Autum";
                break;

            default:
                season = "Bogus Month";
                break;
        }
        System.out.println("It's a " + season);
    }
}
