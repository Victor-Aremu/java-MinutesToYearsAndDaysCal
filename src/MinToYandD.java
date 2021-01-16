public class MinToYandD {
    public static void main(String[] args) {
    printYearsAndDays(525600);

    }
    public static void printYearsAndDays(long minutes){
        long years = minutes / 525600;
        long days = minutes % 1440;
        long remainingMinutes = days % 525600;

        //printYearsAndDays(525600);
        if (minutes < 0) {
            System.out.println("Invalid Value");
        }
        else {
            System.out.println(minutes + "mins = " + years + "y and " + days +"d");
            System.out.println(remainingMinutes);
        }
    }
}
