public class Employees {
    int id=++number;
    public static int number;
    String name;
    int Salary ;



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

    public int getSalary() {
        return Salary;
    }

    public void setSalary(int salary) {
        Salary = salary;
    }

    public Employees( String name, int salary) {

        this.name = name;
        Salary = salary;
    }
    public Employees() {

    }
}
