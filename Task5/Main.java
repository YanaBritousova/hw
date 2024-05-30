package Task5;

import java.util.*;
import java.util.stream.Collectors;


public class Main {
    public static List<Employee> makeList(){
        List<Employee> employees = new ArrayList<>();

        employees.add(new Employee("John Doe", 30, "IT", 50000));
        employees.add(new Employee("Ann Smith", 35, "HR", 45000));
        employees.add(new Employee("Jane Smith", 25, "Sales", 40000));
        employees.add(new Employee("Michael Jones", 40, "Marketing", 60000));
        employees.add(new Employee("Sarah Miller", 35, "HR", 45000));

        return employees;
    }

    public static void printList(List<Employee>employees){
        employees.forEach(e-> System.out.println(e.toString()));
    }

    public static List<Employee> filterAge(List<Employee>employees){
        List<Employee>sortedByAgeEmployees = employees.stream().filter(e->e.getAge()>30).sorted(Comparator.comparing(Employee::getAge)).toList();
        return sortedByAgeEmployees;
    }

    public static long countITSpecialists(List<Employee>employees){
        long count = employees.stream().filter(e->e.getDepartment().equals("IT")).count();
        return count;
    }

    public static Optional <Employee> richEmployee(List<Employee>employees){
        Optional <Employee> emp = employees.stream().max(Comparator.comparing(Employee::getSalary));
        return emp;
    }

    public static List<String> getHRs(List<Employee>employees){
        List<String> hrs = employees.stream().filter(e->e.getDepartment().equals("HR")).sorted(Comparator.comparing(Employee::getName)).map(Employee::getName).toList();
        return hrs;
    }

    public static double getAverageSalary(List<Employee>employees){
        double averageSalary = employees.stream().mapToDouble(Employee::getSalary).average().getAsDouble();
        return averageSalary;
    }
    public static void main(String[]args){
        //task 1
        ArrayList<Integer> l1 = new ArrayList<>(List.of(1,1,2,2,3,4,5));
        int sum = l1.stream().distinct().filter(e->e%2==0).mapToInt(e->e).sum();
        System.out.println(sum);

        //task2
        List<Employee>employees = makeList();
        List<Employee>sortedByAgeEmployees = filterAge(employees);
        System.out.println(countITSpecialists(employees));
        System.out.println(richEmployee(employees));
        System.out.println(getAverageSalary(employees));
        System.out.println(getHRs(employees));





    }
}
