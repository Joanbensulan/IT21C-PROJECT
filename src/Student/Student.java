  package Student;
          
class Student {
      
    String name;
    String section;
    String motto;

    public Student(String name, String section, String motto) {
        this.name = name;
        this.section = section;
        this.motto = motto;
    }

    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Section: " + section);
        System.out.println("Motto: " + motto);
    
}
  }

    