package anAbstractClass;
import java.util.Random;

public class SATStudent extends Student {
    public SATStudent(String name, double gpa) {
        super(name, gpa);
    }

    @Override
    public int getTestScore() {
        Random rand = new Random(1);
        int testScore = (rand.nextInt(16) + 1) * 100 + ((rand.nextInt(10) + 1) * 10);
        return testScore;
    }

    public String toString() {
        String summary = getName() + " scored " + getTestScore() + " on the SAT";
        return summary;
    }

    public static void main(String[] args) {
        SATStudent yourMom = new SATStudent("Your Mother", 4.22);
        System.out.println(yourMom);
    }
}
