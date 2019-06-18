
package lab2;

import java.util.ArrayList;
import java.util.List;
import java.util.Date;

public class Student extends Person {

    private int year;
    private int group;
    private int indexId;
    private List<Grade> grades;

    public Student() {
        super();
        this.year = 0;
        this.group = 0;
        this.indexId = 0;
        this.grades = new ArrayList<Grade>();
    }

    public Student(String firstName, String lastName, Date dateOfBirth, int year, int group, int indexId) {
        super(firstName, lastName, dateOfBirth);
        this.year = year;
        this.group = group;
        this.indexId = indexId;
        this.grades = new ArrayList<Grade>();

    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getGroup() {
        return group;
    }

    public void setGroup(int group) {
        this.group = group;
    }

    public int getIndexId() {
        return indexId;
    }

    public void setIndexId(int indexId) {
        this.indexId = indexId;
    }

    public void setGrades(List<Grade> grades) {
        this.grades = grades;
    }

    @Override
    public String toString() {
        String str = String.format("Year: %s, Group: %s, IndexId: %s, Grades: %s", super.toString(), year, group, indexId);
        for (Grade grade : grades) {
            str = str + grade + "\r\n";
        }
        return str + "\r\n";
    }

    public void details() {
        System.out.println(toString());
    }

    public void addGrade(String subjectName, double value, Date date) {
        Grade oceny = new Grade(subjectName, value, date);
        grades.add(oceny);
    }

    //dobieramy się z funkcji wyżej, która stworzyła nowy obiekt? 
    public void addGrade(Grade oceny) {
        addGrade(oceny.getSubjectName(), oceny.getValue(), oceny.getDate());
    }

    public void displayGrades() {
        String str = String.format("Grades: %s \r\n");
        for (Grade oceny : this.grades) {
            str = str + oceny + "\r\n";
        }
        System.out.println("str");
    }

    public void displayGrades(String subjectName) {
    }

    public void deleteGrade(String subjectName, double value, Date date) {
        Grade przypisanie = null;
        for (Grade oceny : this.grades) {
            if (subjectName.equals(oceny.getSubjectName()) && value == oceny.getValue() && date.equals(oceny.getDate())) {
                przypisanie = oceny;
            }
        }
        if (przypisanie != null) {
            grades.remove(przypisanie);
        } else {
            System.out.println("Ni ma czego usunac");
        }
    }

    public void deleteGrade(Grade grade) {
        deleteGrade(grade.getSubjectName(), grade.getValue(), grade.getDate());
    }

    public void deleteGrades(String subjectName) {
        for (int i = 0; i < grades.size(); i++) {
            if (subjectName == grades.get(i).getSubjectName()) {
                grades.remove(i);
            }

        }
    }

    public void deleteGrades() {

        grades.clear();
    }
}//KONIEC KLASY STUDENT
