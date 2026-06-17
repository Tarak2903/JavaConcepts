import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

class Employee{
    int id;
    String name;
    String department;
    double Salary;

    Employee(int id,String name,String department,double Salary){
        this.id=id;
        this.name=name;
        this.department=department;
        this.Salary=Salary;
    }
public String getDepartment(){return this.department;}

    public Double getSalary(){return this.Salary;}
    public String getName(){return this.name;}

    @Override
    public boolean equals(Object o){
        if(this==o)return true;

        if(! (o instanceof  Employee))return false;

        Employee s= (Employee) o;

        return this.id==s.id;
    }

    @Override
    public int hashCode(){
        return this.id;
    }

    @Override
    public String toString(){
        return name;
    }
}

class Day1{
    void main(){
        List<Employee> employees = new ArrayList<>();

        employees.add(new Employee(101, "Tarak", "IT", 65000));
        employees.add(new Employee(102, "Rahul", "HR", 55000));
        employees.add(new Employee(103, "Aman", "Finance", 70000));
        employees.add(new Employee(104, "Priya", "IT", 80000));
        employees.add(new Employee(105, "Sneha", "HR", 60000));
        employees.add(new Employee(106, "Rohit", "Finance", 75000));
        employees.add(new Employee(107, "Karan", "IT", 72000));
        employees.add(new Employee(108, "Neha", "Marketing", 58000));
        employees.add(new Employee(109, "Ankit", "Marketing", 62000));
        employees.add(new Employee(110, "Pooja", "HR", 67000));


       Map<String,List<Employee>> mp= employees.stream()
                .collect(
                        Collectors.groupingBy(
                                Employee::getDepartment
                        )
                );

       Double avgSalary= employees.stream()
               .collect(
                       Collectors.averagingDouble(
                               Employee::getSalary
                       )
               );

        Optional<Employee> highest= employees.stream()
                .max((a, b) -> {
                   return Double.compare(a.getSalary(), b.getSalary());
                });

        List<String>  ls = employees.stream()
                .filter(x->
                        x.getSalary()>60000
                ).map(Employee::getName)
                .collect(Collectors.toList());

    }
}
