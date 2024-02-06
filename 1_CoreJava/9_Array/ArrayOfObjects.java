class Student{
    int rollNo;
    String name;
    double marks;
}

public class ArrayOfObjects {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.rollNo = 5;
        s1.name = "Sovan Roy";
        s1.marks = 8.5;

        Student s2 = new Student();
        s2.rollNo = 5;
        s2.name = "Telusko";
        s2.marks = 8.5;

        Student s3 = new Student();
        s3.rollNo = 5;
        s3.name = "YOYO";
        s3.marks = 8.5;

        //Array of objects
        Student students [] = new Student[3];
        students[0] = s1;
        students[1] = s2;
        students[2] = s3;

        // printing all details of students

        for(Student s : students){ // for each loop
            System.out.println(s.name + " "+s.rollNo+ " "+s.marks);
        }

        // System.out.println(s1); // hashcode

    }
}
