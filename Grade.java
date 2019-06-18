package lab2;

import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Grade {

    private String subjectName;
    private double value;
    private Date date;
    

    public Grade() {
        this.subjectName = "brak";
        this.date = new Date();
        this.value = 0;
    }

    public Grade(String subjectName, double value, Date date ) {
        this.subjectName = subjectName;
        this.date = date;
        this.value = value;
    }

    public String getSubjectName() {
        return subjectName;
    }

    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    @Override
    public String toString() {
        Format formatter = new SimpleDateFormat("yyy-MM-dd");
        String str = String.format("Subject name: %s, Value: %s, Data: %s", subjectName, value, formatter.format(date));
        return str;
    }

    public void details() {
        System.out.println("toString()");
    }

}//KONIEC KLASY GRADE
