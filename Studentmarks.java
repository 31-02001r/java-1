import java.util.Scanner;

public class Studentmarks {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Student student = new Student();
        System.out.print("Enter your name =");
        student.setName(input.nextLine());
        System.out.print("Enter your Reg =");
        student.setReg(input.nextLine());
        int i = 1, flag = 0;
        System.out.printf("Do you want to Enter Subject Marks?(y/n)");
        String option = input.nextLine();
        while (option.equalsIgnoreCase("y")) {
            // selection menu
            flag = 0;
            System.out.println("1-Enter Subject marks(Theory Only)");
            System.out.println("2-Enter Subject marks(Theory & Lab)");
            option = input.nextLine();
            // for theory marks only
            if (option.equalsIgnoreCase("1")) {
                System.out.print("Enter Subject name :");
                student.setName(input.nextLine(), i);
                System.out.print("Enter Subject marks :");
                student.setMark(input.nextDouble(), i);
                student.setTMark(student.getMark(i), 1.1, i);

            } else if (option.equalsIgnoreCase("2")) {
                // for theory and lab marks
                System.out.print("Enter Subject name :");
                student.setName(input.nextLine(), i);
                System.out.print("Enter Subject Theory marks :");
                student.setMark(input.nextDouble(), i);
                System.out.print("Enter Subject Lab marks :");
                student.setLabMark(input.nextDouble(), i);
                student.setTMark(student.getMark(i), student.getLabmark(i), i);
            } else {
                System.out.println("Invalid Selection has been made.");
                flag = 1;
            }
            input.nextLine();
            System.out.printf("Do you want to Enter Subject Marks?(y/n)");
            option = input.nextLine();
            if (flag != 1) {
                i++;
            }
        }
        // CGPA and GPA calculation
        student.setGpa(student.getTmark(1));
        double gpa1 = student.getGpa();

        student.setGpa(student.getTmark(2));
        double gpa2 = student.getGpa();

        student.setGpa(student.getTmark(3));
        double gpa3 = student.getGpa();

        student.setGpa(student.getTmark(4));
        double gpa4 = student.getGpa();

        student.setGpa(student.getTmark(5));
        double gpa5 = student.getGpa();

        double total = gpa1 + gpa2 + gpa3 + gpa4 + gpa5;
        student.setCgpa(total);
        // Display All the Data
        System.out.println("Student Name:" + student.getName());
        System.out.println("Registration Number:" + student.getReg());
        System.out.print("");
        System.out.printf("\tSubject\t\tTheory\t\tLab\n");
        for (i = 1; i <= 5; i++) {
            System.out.printf("\t%s\t\t%.1f\t\t%.1f\n", student.getSub(i), student.getMark(i), student.getLabmark(i));
        }
        System.out.println("");
        System.out.printf("\tCGPA:%.2f\n", student.getCgpa());
    }
}
