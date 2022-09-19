package school.mjc.stage0.conditions.finalTask;

public class DaysInMonth {
    public void printDays(int year, int month) {
        int leap = year%400;
        switch (month){
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println(31);
            case 2:
                System.out.println(leap == 0? 29: 28);
            default:
                System.out.println(30);
        }

    }
}
