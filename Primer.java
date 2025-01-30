//Primeros comandos en Java

public class Primer {
    static String[] DAYS = {"first", "second"};
    static String firstLine(int day){
        return "On the" + DAYS[day] + "day of chirstmas my true love sent to me";
    }

    public static void main(String[] args) {
        System.out.println(firstLine(0));
    }
}
