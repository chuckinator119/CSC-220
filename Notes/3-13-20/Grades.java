import java.util.*;

class Grades {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        ArrayList<Integer> grades = new ArrayList<Integer>();
        while (s.hasNextInt()) {
            grades.add(s.nextInt());

        }
        System.out.println("All grades entered!!");
        for (int grade : grades)
            System.out.print(grade + "\t");

    }
}