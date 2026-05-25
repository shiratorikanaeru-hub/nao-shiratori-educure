public class RegularEmployee extends Employee {
    private int bassSalary;
    public RegularEmployee(String name,int bassSalary){
        super(name);
        this.bassSalary=bassSalary;
    }
    @Override
    public String getRole(){
        return"正社員";
    }
    @Override
    public int calculateSalary(){
        return bassSalary;
    }
}
