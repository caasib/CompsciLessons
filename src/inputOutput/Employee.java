package inputOutput;

public class Employee {
    String first, last, job;
    int years, salary;

    public Employee(String first, String last, String job, int years, int salary) {
        this.first = first;
        this.last = last;
        this.job = job;
        this.years = years;
        this.salary = salary;
    }

    public String toString() {
        String info = first + " " + last + " is a(n) " + job + ".\n";
        info += "They make $" + salary + " after " + years + " years of working.\n";
        return info;
    }
}
