import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) throws IOException {
        Random random = new Random();
        Group group = new Group("MY group");
        LastNameComparator lastNameComparator = new LastNameComparator();

        for (int i = 0; i <10 ; i++) {
            Student student = new Student("Name" + random.nextInt(10),random.nextBoolean(), 16+i,100+i,"IEE" );
            try {
                group.addStudent(student);
            }
            catch (MyException e){
                System.out.println(e.getMessage());
            }
        }
   //     group.deleteStudent(104);
         System.out.println(group);
        System.out.println("Last Name Finder "+group.studentFinder("Name4"));
        System.out.println("_______________________________");
//        Arrays.sort(group.getStudents(),  new LastNameComparator());
//        System.out.println(group);
//        Arrays.sort(group.getStudents(),  new SexComparator());
//        System.out.println(group);
        System.out.println(Arrays.toString(group.getStToArmy()));
    }
}
