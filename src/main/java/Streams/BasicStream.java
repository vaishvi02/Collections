package main.java.Streams;

import java.util.*;
import java.util.stream.Collectors;

public class BasicStream {
    
    public static void main(String[] args) {
        //List<Integer> nums = Arrays.asList(1,2,3,4,5);
        List<Employee> empList = Employee.employees();
        
         //1. Filter
        //System.out.println(nums.stream().filter(i -> i%2 == 0).collect(Collectors.toList()));
        //2. Max 
        //System.out.println(nums.stream().max(Comparator.naturalOrder()).get());
        //3. groupingBy (classifier)
        //System.out.println(empList.stream().collect(Collectors.groupingBy(Employee::getDesignation)));

        //4. groupingBy (classifier,collector)
//         System.out.println(empList.stream().collect(Collectors.groupingBy(Employee::getDesignation,
//                                                     Collectors.mapping(Employee::getId,
//                                                                          Collectors.toList()))));
//        //5.
//        System.out.println(empList.stream().collect(Collectors.groupingBy(emp -> emp.getDesignation(),
//                                                                          Collectors.counting())));
//        //6. groupingBy(classifier, supplier, collector) - returns map
//         System.out.println(String.valueOf(empList.stream().collect(Collectors.groupingBy(emp -> emp.getDesignation(),
//                                                         LinkedHashMap::new,
//                                                         Collectors.mapping(Employee::getName, Collectors.toList())))));

        //7. Group by designation and return a map with designation -> Name or department
//         System.out.println(empList.stream().collect(Collectors.groupingBy(Employee::getDesignation,
//                                                     Collectors.mapping(emp -> emp.getName(), Collectors.toList()))));

        //8. grouping by and then grouping by
        // System.out.println(empList.stream().collect(Collectors.groupingBy(Employee::getDesignation,
        //                                             Collectors.groupingBy(Employee::getName, Collectors.toList()))));

        //9. summarizingInt ->
        // IntSummaryStatistics stats = empList.stream().collect(Collectors.summarizingInt(Employee::getId));
        // System.out.println(stats);

        //10. Flat Map
        // List<String> firstList = Arrays.asList("A quick brown "," fox jumped ");
        // List<String> secondList = Arrays.asList( "over the", "lazy");
        // List<String> thirdList = Arrays.asList("dog");

        // List<List<String>> listOfListOfString = Arrays.asList(firstList,secondList,thirdList);

        //System.out.println(listOfListOfString.stream().flatMap(list -> list.stream()).collect(Collectors.toList()));

        //11. Group by dept then designation and return list with names
        //    System.out.println(empList.stream().collect(Collectors.groupingBy(Employee::getDept, 
        //                             Collectors.groupingBy(Employee::getDesignation,
        //                             Collectors.mapping(Employee::getName, Collectors.counting())))));

        //12. Collectors.toMap with merge function to handle duplicate keys
//         System.out.println(empList.stream().collect(Collectors.groupingBy(Employee::getDesignation,
//                                 Collectors.toMap(Employee::getName,
//                                 Employee::getId , (t, u) -> t))));

        //System.out.println(empList.stream().distinct().collect(Collectors.toList()));
    }
}

class Employee{

    int id;
    Department dept;
    public Department getDept() {
        return dept;
    }
    public void setDept(Department dept) {
        this.dept = dept;
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
    public String getDesignation() {
        return designation;
    }
    public void setDesignation(String designation) {
        this.designation = designation;
    }

    String name;
    String designation;

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    String date;

    public Employee(int id, String name, Department department, String designation, String date) {
        this.id = id;
        this.name = name;
        this.designation = designation;
        this.dept = department;
        this.date = date;
    }

    public static List<Employee> employees(){
        List<Employee> empList = new ArrayList<>();
        empList.add(new Employee(1, "Hary", new Department(21, "Sales"), "Manager","10-01-2024"));
        empList.add(new Employee(2, "Hary", new Department(22, "Ops"), "Manager","12-01-2024"));
        empList.add(new Employee(3, "Chris", new Department(23, "Sales"), "Senior Engineer","14-02-2024"));
        empList.add(new Employee(4, "Martin", new Department(24, "Sales"), "Data Head","07-01-2024"));
        empList.add(new Employee(5, "Ben", new Department(25, "Data"), "Assistant Manager","10-05-2024"));

        return empList;
    }
    
}
class Department{
    int id;
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getDepartment() {
        return department;
    }
    public void setDepartment(String department) {
        this.department = department;
    }
    String department;
    public Department(int id, String department) {
        this.id = id;
        this.department = department;
    }
}