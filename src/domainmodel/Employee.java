package domainmodel;

public class Employee {

    private static int id = 1000;
    private int employeeId;
    private String name;
    private String position;
    private int salary;
    private String department;

    {
        department = "IT";
        System.out.println("Non-static init block called");
    }

    static {
        id = 1001;
        System.out.println("Static init block called");
    }


    public Employee() {
        this("A","b",1);
        System.out.println("Empty constructor called");
    }

    public Employee(String name, String position, int salary){
        this(name,position,salary,"IT");
        System.out.println("Constructor with 3 params called");
    }

    private Employee(String name, String position, int salary, String department) {
        employeeId = id++;
        this.name = name;
        this.position = position;
        this.salary = salary;
        this.department = department;
        System.out.println("Constructor with 4 params called");
    }

    public String getName() {
        return name;
    }

    public String getPosition() {
        return position;
    }

    public int getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeId=" + employeeId +
                ", name='" + name + '\'' +
                ", position='" + position + '\'' +
                ", salary=" + salary +
                '}';
    }
}
