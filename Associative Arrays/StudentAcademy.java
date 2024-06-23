import java.util.*;

//Write a program that keeps the information about students and their grades.

//On the first line, you will receive number n.
//After that, you will receive n pair of rows.
//First, you will receive the student's name, after that,
//you will receive his grade. Check if the student already exists and if not - add him. Keep track of all grades for each student.

//When you finish reading data, keep students with an average grade higher
//or equal to 4.50.

//Print the students and their average grade in the format:
//"{name} –> {averageGrade}"

//Format the average grade to the 2nd decimal place

//Example

//Input:
//5
//John
//5.5
//John
//4.5
//Alice
//6
//Alice
//3
//George
//5

//Output:
//John -> 5.00
//Alice -> 4.50
//George -> 5.00

public class StudentAcademy {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int countStudents = Integer.parseInt(scanner.nextLine());

        Map<String, List<Double>> studentGrades = new LinkedHashMap<>();

        for (int i = 0; i < countStudents; i++) {

            String studentName = scanner.nextLine();
            double grade = Double.parseDouble(scanner.nextLine());

            if (studentGrades.containsKey(studentName)) {
                studentGrades.get(studentName).add(grade);
            } else {
                studentGrades.put(studentName, new ArrayList<>());
                studentGrades.get(studentName).add(grade);
            }
        }

        for (Map.Entry<String, List<Double>> entry : studentGrades.entrySet()) {

            String studentName = entry.getKey();
            List<Double> grades = entry.getValue();

            // Option 1
            double sum = grades.stream().mapToDouble(Double::doubleValue).sum();

            // Option 2
//            double sum = 0;
//            for (Double grade : grades) {
//                sum  += grade;
//            }
            double averageGrade = sum / grades.size();
            if (averageGrade >= 4.50){
                System.out.printf("%s -> %.2f\n", studentName, averageGrade);
            }
        }

    }
}
