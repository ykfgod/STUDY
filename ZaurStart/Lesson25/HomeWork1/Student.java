package ZaurStart.Lesson25.HomeWork1;

public class Student {
    private StringBuilder name;
    private int course;
    private double grade;

    void setName(StringBuilder s) {
        if (!(s.length() < 3)) {
            this.name = s;
        }
    }

    StringBuilder getName() {
        StringBuilder st = new StringBuilder();
        st = this.name;
        return st;
    }

    void setCourse(int course) {
        if (course >= 1 && course <= 4) {
            this.course = course;
        }
    }

    int getCourse() {
        int course = this.course;
        return course;
    }

    void setGrade(double grade) {
        if (grade >= 1 && grade <= 10 ) {
            this.grade = grade;
        }
    }

    double getGrade() {
        double grade = this.grade;
        return grade;
    }

    void showInfo() {
        System.out.println("Imya = " + getName() + " Course " +
                getCourse() + " Grade " + getGrade());
    }
}

class TestStudent {
    public static void main(String[] args) {
        Student st = new Student();
        st.setName(new StringBuilder("Yaroslav"));
        st.setCourse(4);
        st.setGrade(9.8);
        st.showInfo();
    }
}
