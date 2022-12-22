package my_package_name.homework_4;

public class MonthConverter {
    public static void main(String[] args) {

        System.out.println(printMonthInWordBySwitchStatement(6));
        System.out.println(printMonthInWordByIfStatement(5));
    }

    public static String printMonthInWordByIfStatement(int numberOfMonth) {

        if (numberOfMonth == 1) {
            return "JAN";
        } else if (numberOfMonth == 2) {
            return "FEB";
        } else if (numberOfMonth == 3) {
            return "MAR";
        } else if (numberOfMonth == 4) {
            return "APR";
        } else if (numberOfMonth == 5) {
            return "MAY";
        } else if (numberOfMonth == 6) {
            return "JUN";
        } else if (numberOfMonth == 7) {
            return "JUL";
        } else if (numberOfMonth == 8) {
            return "AUG";
        } else if (numberOfMonth == 9) {
            return "SEPT";
        } else if (numberOfMonth == 10) {
            return "OCT";
        } else if (numberOfMonth == 11) {
            return "NOV";
        } else if (numberOfMonth == 12) {
            return "DEC";
        }
        return "Not a valid month";

    }

    public static String printMonthInWordBySwitchStatement(int numberOfMonth) {
        String monthInWord;
        switch (numberOfMonth) {
            case 1:
                monthInWord = "JAN";
                break;
            case 2:
                monthInWord = "FEB";
                break;
            case 3:
                monthInWord = "MAR";
                break;
            case 4:
                monthInWord = "APR";
                break;
            case 5:
                monthInWord = "MAY";
                break;
            case 6:
                monthInWord = "JUN";
                break;
            case 7:
                monthInWord = "JUL";
                break;
            case 8:
                monthInWord = "AUG";
                break;
            case 9:
                monthInWord = "SEPT";
                break;
            case 10:
                monthInWord = "OCT";
                break;
            case 11:
                monthInWord = "NOV";
                break;
            case 12:
                monthInWord = "DEC";
                break;
            default:
                monthInWord = "Not a valid month";
        }
        return monthInWord;
    }
}
