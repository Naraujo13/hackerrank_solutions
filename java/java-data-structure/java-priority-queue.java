
import java.util.PriorityQueue;
import java.util.Comparator;
/*
 * Create the Student and Priorities classes here.
 */

class Student {
    private int id;
    private String name;
    private double cgpa;

    Student(int id, String name, double cgpa){
        this.id = id;
        this.name = name;
        this.cgpa = cgpa;
    }

    int getId() {return this.id;}
    String getName() {return this.name;}
    double getCGPA() {return this.cgpa;}
}

class Priorities {
    
    List<Student> getStudents(List<String> events) {

        PriorityQueue<Student> pQueue = new PriorityQueue<Student>(
            Comparator.comparing(Student::getCGPA).reversed()
                .thenComparing(Student::getName)
                .thenComparing(Student::getId)
        ); 

        for (String event : events){

            String[] temp = event.split(" ");
            String op = temp[0];

            if (op.equals("ENTER")){
                int id = Integer.parseInt(temp[3]);
                String name = temp[1];
                double cgpa = Double.parseDouble(temp[2]);

                // System.out.printf(
                //     "%s %s %f %d%n",
                //     op, name, cgpa, id
                // );
                Student student = new Student(
                    id,
                    name,
                    cgpa
                );
                pQueue.add(student);
            }   
            else
                // System.out.println(op);
                pQueue.poll(); 
        }

        ArrayList<Student> array = new ArrayList<>();
        while (!pQueue.isEmpty()) {
            array.add(pQueue.poll());
        }

        return array;
    }
}



