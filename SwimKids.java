import java.util.Scanner;

public class SwimKids {
  public static void main(String[] args) {

    System.out.println("Welcome to SwimKids. Let's get started.");

    Scanner n = new Scanner(System.in);
    Scanner s = new Scanner(System.in);

    int familySize;
    SKmethods methods = new SKmethods();

    System.out.println("How many swimmers would you like to register today? ");
    familySize = n.nextInt();


    Registrant kids[] = new Registrant[familySize];
    double total = 39;
    double tuition;
    String swimmerLevel;
    String name;
    int age;

    for (int i = 0; i < familySize; i++) {
      kids[i] = new Registrant();
      System.out.print("Enter name: ");
      name = s.nextLine();
      kids[i].setName(name);
      System.out.print("Enter age: ");
      age = n.nextInt();
      kids[i].setAge(age);
      swimmerLevel = methods.findLevel(age);
      kids[i].setLevel(swimmerLevel);
      kids[i].setTuition(swimmerLevel);
      tuition = kids[i].getTuition();
    }

    if (familySize > 1) {
      for (int i = 0; i < familySize; i++) {
        total += (kids[i].tuition);
      }
    }
    else {
      total += kids[0].tuition;
    }

    // Print out results
    for (int i = 0; i < familySize; i++) {
      System.out.println("\nName: " + kids[i].getName());
      System.out.println("Age: " + kids[i].getAge());
      System.out.println("Level: " + kids[i].getLevel());
      System.out.println("Tuition: " + kids[i].getTuition() + "\n");
    }

    System.out.println("Registration fee: $39\nTotal: " + total + "\n");


    //methods.getCost(familySize);



  }
}
