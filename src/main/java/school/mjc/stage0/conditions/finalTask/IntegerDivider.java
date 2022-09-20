package school.mjc.stage0.conditions.finalTask;

public class IntegerDivider {
    public void printCompletelyDivided(int dividend, int divider) {
        int result = dividend/divider;
        System.out.println(divider == 0? "division by zero": 
                result*divider == dividend? "can be divided completely": "can be divided completely");
    }
}
