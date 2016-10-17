
public class Worker extends Person {

    int weekSalary;
    int workHoursPerDay;

    Worker(String firstName, String lastName, int weekSalary, int workHoursPerDay) {
        super(firstName, lastName);
        this.weekSalary = weekSalary;
        this.workHoursPerDay = workHoursPerDay;
    }

    @Override
    public String toString() {
        String result = super.toString();
        result += "Week salary: " + weekSalary + "\n" + "Hours per day: " + 
                getHoursPerDay() + "\n" + "Salary per hour: " + getSalaryPerHour();
        return result;
    }

    @Override
    String getOccupation() {
        return "Worker";
    }

    @Override
    double getHoursPerDay() {
        return workHoursPerDay;
    }
    
    double getSalaryPerHour(){
        return (weekSalary / (5 * workHoursPerDay));
    }
    
    @Override
    String validate(){
        String error = super.validate();
        if (error.equals("")) {
             if(weekSalary < 0 || workHoursPerDay < 0){
                   error =("Expected positive number.");
             }
        }
        
        return error;
    }
}
