
public class DateDifference {
    public class SwiftDate{
        
        
        short year = 0;
        byte month = 0;
        byte day = 0;
        
        boolean isLeapYear(int year){
           return(year % 4 == 0);
        }
        
        int getCentury(int year){
            int century = (year / 100)+ 1;
            return(century);
        }
        
        int getDaysDifference(SwiftDate other){
            return(Days.daysBetween(year1,year2).gerDays());
        }
        
        void printInfo(){
            System.out.println(year+" "+month+" "+day+"-"+SwiftDate);
        }
    }    
        public static void main(String[] args) {
        
        
            
        
        }
    
}
