public class teachers extends Employees{
   private String TypeOfJob;

    public String getTypeOfJob() {
        return TypeOfJob;
    }

    public void setTypeOfJob(String typeOfJob) {
        TypeOfJob = typeOfJob;
    }

    @Override
    public String toString() {
        return "teachers{" +
                "TypeOfJob='" + TypeOfJob + '\'' +
                ", id=" + id +
                ", name='" + name + '\'' +
                ", Salary=" + Salary +
                '}';
    }

    public teachers(String name, int salary, String typeOfJob) {
        super( name, salary);
        TypeOfJob = typeOfJob;
    }

}
