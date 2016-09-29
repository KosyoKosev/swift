
import java.util.Scanner;

public class PersonCharacteristics{
 public static void main(String[] args){
     
     Scanner sc = new Scanner(System.in);
        
     System.out.println("Please enter first name.");
     
     String firstName = sc.nextLine();
     
     System.out.println("Please enter last name.");
     
     String lastName = sc.nextLine();
     
     System.out.println("Please enter year of birth.");
     
     short yearOfBirth = sc.nextShort();
     
     System.out.println("Please enter weight.");
     
     short weight = sc.nextShort();
     
     System.out.println("Please enter growth.");
     
     short growth = sc.nextShort();
     
     System.out.println("Please enter profession.");
        
     String profession = sc.nextLine();
        
     System.out.println("Name: "+ firstName +" "+lastName);
     System.out.println("Year of birth: "+ yearOfBirth);
     System.out.println("Weight: "+ weight);
     System.out.println("Growth: "+ growth);
     System.out.println("Profession: "+ profession);
    }
}   

//Не можах да разбера в условието на задачата N на брой характеристики или N на брой хора?
//Също не мога да измисля как да конфигурирам проверка за грешка при въвеждане на данните.