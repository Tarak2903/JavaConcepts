import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

class Employee{
    String name;
    String dept;
    int salary;
    Employee(String name,String dept,int salary){
        this.name=name;
        this.salary=salary;
        this.dept=dept;
    }
    public String getDept(){
        return this.dept;
    }
    public String getName(){
        return this.name;
    }
    public int getSalary(){return this.salary;}
}

public class StreamPractice {
    void main(){

        List<Employee> ls= new ArrayList<>(List.of(
                new Employee("Tarak","IT",100000),
                new Employee("Harsh","IT",120000),
                new Employee("Saurabh","HR",80000),
                new Employee("Ankit","HR",90000),
                new Employee("Rohit","Finance",1500000),
                new Employee("Mohit","Finance",100)
        ));

        Map<String,List<Employee>>mp =ls.stream()
                .collect(
                        Collectors.groupingBy(
                                Employee::getDept
                        )
                );

        Map<String,List<String>> mp2=ls.stream()
                .collect(
                        Collectors.groupingBy(
                                Employee::getDept,
                                Collectors.mapping(
                                        Employee::getName,
                                        Collectors.toList()
                                )
                        )
                );

        Map<String,Long> mp3= ls.
                stream()
                .collect(
                        Collectors.groupingBy(
                                Employee::getDept,
                                Collectors.mapping(
                                        Employee::getDept,
                                        Collectors.counting()
                                )
                        )
                );

        Map<String,Double> mp4=ls.stream()
                .collect(
                        Collectors.groupingBy(
                                Employee::getDept,

                                Collectors.averagingInt(Employee::getSalary)

                        )
                );

        Employee  e= ls.stream()
                .max((a,b)->
                        Integer.compare(a.getSalary(),b.getSalary())
                ).get();



        for(String i: mp.keySet()){
            System.out.println("Department: "+i);
            for(Employee er : mp.get(i)){
                System.out.println(er.getName());
            }
        }
    }
}
