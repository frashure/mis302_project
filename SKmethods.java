import java.util.Scanner;

public class SKmethods {

  Scanner n = new Scanner(System.in);
  Scanner s = new Scanner(System.in);
  Scanner c = new Scanner(System.in);


  // **** Begin findLevel() ****
  public String findLevel(int age) {
    String swimmerLevel;
    String program;

    // If swimmer is under age 6
    if (age < 6) {
      System.out.print("Is swimmer comfortable with water on their face? (Y/N): ");
      if (c.next().charAt(0) == 'Y') {
         System.out.print("Is swimmer comfortable floating?: ");
         if (c.next().charAt(0) == 'Y') {
           swimmerLevel = "Swim Tots 4";
         }
         else {
           swimmerLevel = "Swim Tots 3";
         }
       }
     else {
         swimmerLevel = "Swim Tots 1/2";
     }
   }
     // End of under 6 if

    // else over 6
    else {
      System.out.print("Select a program - Stealth or Lessons: ");
      program = s.nextLine();

      if (program.equalsIgnoreCase("Stealth")) {
        System.out.print("Can swimmer swim freestyle and backstroke legally?: ");
        if (c.next().charAt(0) == 'Y') {
          System.out.print("Can swimmer swim butterfly?: ");
          if (c.next().charAt(0) == 'Y') {
            System.out.print("Can swimmer swim strokes under 25m under 3 minutes?: ");
            if (c.next().charAt(0) == 'Y') {
              swimmerLevel = "Mach";
            }
            else {
              swimmerLevel = "Stealth Breaststroke and Butterfly Racing Squad";
            }
          }
          else {
            swimmerLevel = "Stealth Freestyle and Backstroke Racing Squad";
          }
        }
        else {
          swimmerLevel = "Stealth Prep";
        }
      }
      else {
        System.out.print("Can swimmer float on front and back for 10 seconds?: ");
        if (c.next().charAt(0) == 'Y') {
          System.out.print("Can swimmer do front and back kicks?: ");
          if (c.next().charAt(0) == 'Y') {
            swimmerLevel = "SwimKids 3/4";
          }
          else {
            swimmerLevel = "SwimKids 2/3";
          }
        }
        else {
          swimmerLevel = "SwimKids 1/2";
        }
      }
    }
    return swimmerLevel;
  } // **** End of findLevel() ****
} // **** End of class SKmethods ****
