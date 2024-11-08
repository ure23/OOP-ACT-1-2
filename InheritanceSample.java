public class InheritanceSample {
    public static void main(String[] args) {
        Student student = new Student("Luraine Villaranda", "Camastilisan, Calaca", "Information Technology", 2);
        
        System.out.println("Student Details:");
        System.out.println("Name: " + student.getName());
        System.out.println("Address: " + student.getAddress());
        System.out.println("Program: " + student.getProgram());
        System.out.println("Year: " + student.getYear());

        Staff staff = new Staff("John Lorel", "Admana St. Pob.2", "BSU-Balayan", 30000.00);

        System.out.println("\nStaff Details:");
        System.out.println("Name: " + staff.getName());
        System.out.println("Address: " + staff.getAddress());
        System.out.println("School: " + staff.getSchool());
        System.out.println("Salary: " + staff.getSalary());
    }
}

class Person {
    protected String Name;
    protected String Address;

    public void setName(String name) {
        this.Name = name;
    }

    public String getName() {
        return Name;
    }

    public void setAddress(String address) {
        this.Address = address;
    }

    public String getAddress() {
        return Address;
    }
}

class Student extends Person {
    private String Program;
    private int Year;

    public Student(String Name, String Address, String Program, int Year) {
        this.Name = Name;
        this.Address = Address;
        this.Program = Program;
        this.Year = Year;
    }

    public void setProgram(String program) {
        this.Program = program;
    }

    public String getProgram() {
        return Program;
    }

    public void setYear(int year) {
        this.Year = year;
    }

    public int getYear() {
        return Year;
    }
}

class Staff extends Person {
    private String School;
    private double Salary;

    public Staff(String Name, String Address, String School, double Salary) {
        this.Name = Name;
        this.Address = Address;
        this.School = School;
        this.Salary = Salary;
    }

    public void setSchool(String school) {
        this.School = school;
    }

    public String getSchool() {
        return School;
    }

    public void setSalary(double salary) {
        this.Salary = salary;
    }

    public double getSalary() {
        return Salary;
    }
}