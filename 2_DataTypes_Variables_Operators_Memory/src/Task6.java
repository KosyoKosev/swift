public class Task6 {
    public static void main(String[] args) {
       long number=1234567;
       long seconds=number%60;
       long minutes =(number/60)%60;
       long hours= (number/3600)%24;
       long days=(number/3600)/24;
       System.out.println(days+"days,"+hours+"hours,"+ minutes+"minutes,"+seconds+"seconds");
    }
    
}