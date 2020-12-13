package springmvc;

public class StudentData {
    private String snumber;
    private String sname;
    private Double gpa;

    public StudentData(String snumber, String sname, Double gpa) {
        this.snumber = snumber;
        this.sname = sname;
        this.gpa = gpa;
    }

    public String getSnumber() {
        return snumber;
    }

    public void setSnumber(String snumber) {
        this.snumber = snumber;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public Double getGpa() {
        return gpa;
    }

    public void setGpa(Double gpa) {
        this.gpa = gpa;
    }
}
