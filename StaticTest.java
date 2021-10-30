public class StaticTest {
    public static void main(String[] args)
    {
        Employee[] staff = new Employee[3];
        staff[0] = new Employee("Tom", 1000);
        staff[1] = new Employee("Mike", 3000);
        staff[2] = new Employee("Juan", 800);

        for (Employee e : staff)
        {
            e.setId();
            System.out.println("name=" + e.getName() + ",id=" + e.getId() + ",salary=" + e.getSalary());
        }

        int n = Employee.getNextId();
        System.out.println("Next available id=" + n);
    }
}
