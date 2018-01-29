public class Registrant {
  private String swimmerName;
  private int swimmerAge;
  private String swimmerLevel;
  public double tuition;

  public void setName(String name) {
    swimmerName = name;
  }

  public String getName() {
    return swimmerName;
  }

  public void setAge(int age) {
    swimmerAge = age;
  }

  public int getAge() {
    return swimmerAge;
  }

  public void setLevel(String level) {
    swimmerLevel = level;
  }

  public String getLevel() {
    return swimmerLevel;
  }

  public void setTuition(String swimmerLevel) {
    if (swimmerLevel.equals("Mach")) {
      tuition = 130;
    }
    else {
      tuition = 95;
    }
  }

  public double getTuition() {
    return tuition;
  }

}
