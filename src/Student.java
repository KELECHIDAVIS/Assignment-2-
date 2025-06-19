public class Student {
    private String name;
    private String major;
    private double gpa;

    public Student(){}
    public Student(String name, String major){
        this.name = name;
        this.major = major;
    }
    public Student(String name, String major, double gpa){
        this(name, major);
        this.gpa = gpa;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    @Override
    public String toString() {
        return "Name: " + name + ", Major: " + major + ", GPA: " + gpa;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Student) {
            Student s = (Student) obj;
            return (this.name == s.name && this.major == s.major ); // if name and major are the same
        }
        return false;
    }
}
