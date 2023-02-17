package inputOutput;
import java.util.*;
import java.io.*;

public class EmployeeDatabase {

    public static void main(String[] args) {
        try {
            FileInputStream database = new FileInputStream("C:\\Users\\studentgvsc\\eclipse-workspace\\BetterEclipse\\src\\inputOutput\\employee.txt");
            ArrayList<Employee> employees = new ArrayList<Employee>();
            Scanner reader = new Scanner(database);

            while (reader.hasNext()) {
                String first = reader.next();
                String last = reader.next();
                String job = reader.next();
                int years = reader.nextInt();
                int salary = reader.nextInt();
                employees.add(new Employee(first, last, job, years, salary));
            }
            for (Employee employee : employees) {
                System.out.println(employee);
            }
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
