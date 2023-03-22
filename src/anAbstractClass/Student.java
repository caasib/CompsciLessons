package anAbstractClass;

public abstract class Student {
    private String name;
    private double gpa;

    //in this constructor, we only need to initialize the name and gpa
    //the test score will be calculated by some other method
    public Student(String name, double gpa) {
        this.name = name;
        this.gpa = gpa;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public abstract int getTestScore(); //has to be implemented in any class that extends this class

}
