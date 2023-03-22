package anAbstractClass;

import java.util.Random;

public class ACTStudent extends Student {
    public ACTStudent(String name, double gpa) {
        super(name, gpa);
    }

    @Override
    public int getTestScore() {
        Random rand = new Random(1);
        int testScore = (rand.nextInt(36) + 1);
        return testScore;
    }

    public String toString() {
        String summary = getName() + " scored " + getTestScore() + " on the ACT";
        return summary;
    }

    public static void main(String[] args) {
        ACTStudent yourMom = new ACTStudent("Your Mother", 4.22);
        System.out.println(yourMom);
    }
}
