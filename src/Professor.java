public class Professor extends Employee{
    private String field ;
    public Professor(String name, int hours) {
        super(name, hours);
    }

    @Override
    public double calculateSalary(){
        return this.getHours()*30;
    }
}
