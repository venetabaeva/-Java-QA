package javaTelerick;

public class DaysOfWeek {

    public static void main(String[] args) {
        String[] daysOfWeek = new String[]
                {
                        "Monday",
                        "Tuesday",
                        "Wednesday",
                        "Thursday",
                        "Friday",
                        "Saturday",
                        "Sunday"
                };

        // Print how many days there are in the week
        System.out.println(daysOfWeek.length);

        // Print the days, separated by comma
        System.out.println(String.join(", ", daysOfWeek));
    }
}
