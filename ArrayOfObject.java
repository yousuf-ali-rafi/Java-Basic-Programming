class Student
{
    //instance variable
    String name;
    int roll;
    int mark;
}

public class ArrayOfObject
{
    public static void main(String[] args)
    {
        Student s1 = new Student();
        s1.mark = 60;
        s1.name = "Rafi";
        s1.roll = 1;

        Student s2 = new Student();
        s2.mark = 50;
        s2.name = "Yousuf";
        s2.roll = 3;

        Student s3 = new Student();
        s3.mark = 67;
        s3.name = "Ali";
        s3.roll = 10;

        Student students[] = new Student[3];
        students[0] = s1;
        students[1] = s2;
        students[2] = s3;

        // for(int i=0; i<students.length; i++)
        // {
        //     System.out.println(students[i].name + " : " + students[i].mark);
        // }

        for(Student n : students)       //for each loop/enhance for loop & worked with Student
        {
            System.out.println(n.name + " : " + n.mark + " : Roll : " + n.roll);
        }

    }
}
