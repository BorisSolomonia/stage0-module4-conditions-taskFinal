package school.mjc.stage0.conditions.finalTask;

public class TriangleSidesValidator {
    public void validate(double firstSide, double secondSide, double thirdSide) {
        System.out.println(firstSide != secondSide && secondSide != thirdSide?
                "this is a valid triangle": "it's not a triangle");   
    }
}
