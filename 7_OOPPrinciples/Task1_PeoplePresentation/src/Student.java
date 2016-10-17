
public class Student extends Person {

    String facultyNumber;
    double lectureCount;
    double exerciseCount;

    Student(String firstName, String lastName, String facultyNumber, double lectureCount, double exerciseCount) {
        super(firstName, lastName);
        this.facultyNumber = facultyNumber;
        this.lectureCount = lectureCount;
        this.exerciseCount = exerciseCount;
    }
    
    @Override
    public String toString(){
          String result = super.toString();
        result += "Faculty number: " + facultyNumber + "\n" + "Hours per day: " + 
                getHoursPerDay();
        return result;
    }

    @Override
    String getOccupation() {
        return "Student";
    }

    @Override
    double getHoursPerDay() {
        return ((lectureCount * 2) + (exerciseCount * 1.5)) / 5;
    }
    
    @Override
    String validate() {
        String error = super.validate();
        if (error.equals("")) {
             if(facultyNumber.length() < 5 || facultyNumber.length() > 10){
                   error =("Expected length for faculty number is between 5 and 10 symbols.");
                }else if(lectureCount < 0 || exerciseCount < 0){
                   error =("Expected positive number.");
                }else if((int)lectureCount != lectureCount || 
                        (int)exerciseCount != exerciseCount){
                    error =("Expected integer.");
                } 
        }
        
        return error;
    }

}
