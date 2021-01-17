public class MinToYandD {
    public static void printYearsAndDays(long minutes){
        long hours = minutes/60;
        long days = hours / 24;
        long years = days / 365;
        long remainingMinutes = days % 365;
        if (minutes < 0) {
            System.out.println("Invalid Value");
        }
        else {
            System.out.println(minutes + " mins = " + years + " y and " + remainingMinutes +" d");
        }
    }
}