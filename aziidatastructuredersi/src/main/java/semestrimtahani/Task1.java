package semestrimtahani;

import java.util.ArrayList;
import java.util.List;

public class Task1 {



    public static void main(String[] args) {

        List<Employee> employeeInfo = new ArrayList<>();

        employeeInfo.add(new Employee("Murad",2000, "director"));
        employeeInfo.add(new Employee("Vasif",2000, "technican"));
        employeeInfo.add(new Employee("Abdulla",2000, "manager"));
        employeeInfo.add(new Employee("Kerim",2000, "staff"));

        List<ReturnedObject> returnedObjects = increaseSalary(20, employeeInfo);
        printOldSalary(employeeInfo);
        printNewSalary(returnedObjects);

    }

    private static List<ReturnedObject> increaseSalary(int percentage, List<Employee> employees){
        List<ReturnedObject> list = new ArrayList<>();
        int newSalary;
        for(Employee e : employees){
            int salary = e.getSalary();
            newSalary = salary + salary * percentage/100;

            list.add(new ReturnedObject(e.getName() , newSalary));
        }

        return list;

    }

    private static void printOldSalary(List<Employee> employees){
        for(Employee e : employees){
            System.out.println("name: " + e.getName() + " old salary: " + e.getSalary());
        }
    }

    private static void printNewSalary(List<ReturnedObject> returnedObjects){
        for(ReturnedObject e : returnedObjects){
            System.out.println("name: " + e.getName() + " new salary: " + e.getSalary());
        }
    }

    static class ReturnedObject {

        private String name;
        private Integer salary;

        public ReturnedObject(String name, Integer salary) {
            this.name = name;
            this.salary = salary;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public Integer getSalary() {
            return salary;
        }

        public void setSalary(Integer salary) {
            this.salary = salary;
        }
    }

    static class Employee {

        private String name;
        private Integer salary;
        private String status;

        public Employee(String name, Integer salary, String status) {
            this.name = name;
            this.salary = salary;
            this.status = status;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public Integer getSalary() {
            return salary;
        }

        public void setSalary(Integer salary) {
            this.salary = salary;
        }

        public String getStatus() {
            return status;
        }

        public void setStatus(String status) {
            this.status = status;
        }

    }


}
