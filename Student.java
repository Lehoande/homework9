import java.util.Date;

public class Student {
    private String id;
    private String fullname;
    private Date dateOfBirth;
    private String major;
    private float gpa;

    public Student() {}

    public Student(String id, String fullname, Date dateOfBirth, String major, float gpa) {
        this.id = id;
        this.fullname = fullname;
        this.dateOfBirth = dateOfBirth;
        this.major = major;
        this.gpa = gpa;
    }

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getFullname() {
        return fullname;
    }
    public void setFullname(String fullname) {
        this.fullname = fullname;
    }
    public Date getDateOfBirth() {
        return dateOfBirth;
    }
    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }
    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public float getGpa() {
        return gpa;
    }

    public void setGpa(float gpa) {
        this.gpa = gpa;
    }
    public void displayInformation() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + fullname);
        System.out.println("Date of Birth: " + dateOfBirth);
        System.out.println("Major: " + major);
        System.out.println("GPA: " + gpa);
    }
}
