package java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MapRedu {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(3, 7, 8, 1, 5, 9);
        int sum1=numbers.stream().mapToInt(i->i).sum();
        System.out.println(sum1);
        Integer sum2=numbers.stream().reduce(0,(a,b)->a+b);
        System.out.println(sum2);

        double average=getEmployees().stream().filter(employee -> employee.getGrade().equalsIgnoreCase("A"))
                .map(employee -> employee.getSalary())
                .mapToDouble(i->i)
                .average().getAsDouble();
        System.out.println(average);

    }
    public static List<Employee> getEmployees() {
        return Stream.of(new Employee(101, "Mohit", "A", 60000),
                new Employee(109, "Ramesh", "A", 80000),
                new Employee(102, "Raju", "B", 75000),
                new Employee(103, "Kunal", "A", 90000),
                new Employee(104, "Arpit", "C", 15000)
        ).collect(Collectors.toList());
    }
}
class Employee{
    private int id;
    private String name;
    private String grade;
    private int salary;

    public Employee() {
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", grade='" + grade + '\'' +
                ", salary='" + salary + '\'' +
                '}';
    }

    public Employee(int id, String name, String grade, int salary) {
        this.id = id;
        this.name = name;
        this.grade = grade;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}
