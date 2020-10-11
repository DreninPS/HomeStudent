import java.util.Arrays;

public class Group implements Voencom {
    private Student [] students = new Student[10];
    private String groupName;



    public Group() {
        this.groupName = "no name Group";
    }

    public Group(String groupName) {
        this.groupName = groupName;
    }

    public void addStudent (Student student) throws MyException{
        if (student == null) throw new IllegalArgumentException("Student Null ");
        for (int i = 0; i <students.length ; i++) {
            if (students[i]== null){
                students[i]=student;
                return;
            }
        }
        throw new MyException();
    }
    public Student getStudent (int i) {
        return students[i];
    }
    public Student[] getStudents() {
        return students;
    }

    @Override
    public Student[] getStToArmy() {
        Student[] studentsMaleUp18 = new Student[10];
        int length = 0;
        for (int i = 0, j=0; i <10 ; i++) {
            if(students[i].getStringSex().equals("Male")&&students[i].getAge()>=18 ){
                studentsMaleUp18[j] = students[i];
                j++;
            }
            length = j;
        }
        return Arrays.copyOf(studentsMaleUp18, length);

    }

    public void addStudentbyKeyBoard(){
    }

    public void deleteStudent (int zach) {

        for (int i = 0; i <students.length ; i++) {
            if(students[i]!=null){
                if (students[i].getZach()==zach) students[i]=null;
            }
        }
    }
    public Student studentFinder (String lastName){
        for (int i = 0; i <students.length ; i++) {
            if (students[i]!=null && students[i].getLastName().equals(lastName)) return students[i];
        }
        return null;
    }



    @Override
    public String toString() {
        return "Group of students " + groupName+ System.lineSeparator()+
                Arrays.toString(students) +
                '}';
    }
}
