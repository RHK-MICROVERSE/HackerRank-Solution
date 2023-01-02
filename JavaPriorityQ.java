
/*
 * HackerRank: PRIORITY QUEQE
 * JAVA 15
 * Problem no: 41
 */


import java.util.*;

class Student {
    private int token = 0;
    private String fname;
    private double scgpa = 0.0;

    public Student(int id, String name, double cgpa) {
        this.token = id;
        this.fname = name;
        this.scgpa = cgpa;
    }

    public int getID() {
        return token;
    }

    public String getName() {
        return fname;
    }

    public double getCGPA() {
        return scgpa;
    }
}

class Priorities {
    public Priorities() {

    }

    // Creating A Function getStudents
    public List<Student> getStudents(List<String> events) {
        // Creating a Priority Queue of Student class name queue
        PriorityQueue<Student> queue = new PriorityQueue<>(
                Comparator.comparing(Student::getCGPA).reversed()
                        .thenComparing(Student::getName)
                        .thenComparing(Student::getID));
        for (String event : events) {
            String[] eventData = event.split(" ");
            if (eventData[0].equals("ENTER")) {
                Student student = new Student(Integer.parseInt(eventData[3]),
                        eventData[1], Double.parseDouble(eventData[2]));
                queue.add(student);
            } else if (eventData[0].equals("SERVED")) {
                queue.poll();
            }
        }
        List<Student> students = new ArrayList<>();
        while (!queue.isEmpty()) {
            students.add(queue.poll());
        }
        return students;

    }
}

public class JavaPriorityQ {
    private final static Scanner scan = new Scanner(System.in);
    private final static Priorities priorities = new Priorities();

    public static void main(String[] args) {
        int totalEvents = Integer.parseInt(scan.nextLine());
        List<String> events = new ArrayList<>();

        while (totalEvents-- != 0) {
            String event = scan.nextLine();
            events.add(event);
        }
        System.out.println(events);

        List<Student> students = priorities.getStudents(events);
        if (students.isEmpty()) {
            System.out.println("EMPTY");
        } else {
            for (Student st : students) {
                System.out.println(st.getName());
            }
        }
    }
}