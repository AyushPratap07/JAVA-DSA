import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class StudentGradeCalculator extends JFrame {
    private JTextField nameField;
    private JTextField subjectField;
    private JTextField marksField;
    private JTextArea resultArea;
    private ArrayList<Student> students;

    public StudentGradeCalculator() {
        students = new ArrayList<>();

        setTitle("Student Grade Calculator");
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        JLabel nameLabel = new JLabel("Student Name:");
        nameField = new JTextField(15);
        JLabel subjectLabel = new JLabel("Subject:");
        subjectField = new JTextField(10);
        JLabel marksLabel = new JLabel("Marks:");
        marksField = new JTextField(5);
        JButton addStudentButton = new JButton("Add Student");
        JButton addSubjectButton = new JButton("Add Subject Marks");
        JButton calculateButton = new JButton("Calculate Average & Grade");
        resultArea = new JTextArea(10, 30);
        resultArea.setEditable(false);

        add(nameLabel);
        add(nameField);
        add(addStudentButton);
        add(subjectLabel);
        add(subjectField);
        add(marksLabel);
        add(marksField);
        add(addSubjectButton);
        add(calculateButton);
        add(new JScrollPane(resultArea));

        addStudentButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                addStudent();
            }
        });

        addSubjectButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                addSubjectMarks();
            }
        });

        calculateButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                calculateAverageAndGrade();
            }
        });
    }

    private void addStudent() {
        String name = nameField.getText();

        if (name.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please enter a student name.");
            return;
        }

        // Check if the student already exists
        if (findStudent(name) != null) {
            JOptionPane.showMessageDialog(this, "Student already exists.");
            return;
        }

        students.add(new Student(name));
        resultArea.append("Added Student: " + name + "\n");
        nameField.setText("");
    }

    private void addSubjectMarks() {
        String name = nameField.getText();
        String subject = subjectField.getText();
        String marksText = marksField.getText();

        if (name.isEmpty() || subject.isEmpty() || marksText.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please enter student name, subject, and marks.");
            return;
        }

        try {
            double marks = Double.parseDouble(marksText);
            if (marks < 0 || marks > 100) {
                JOptionPane.showMessageDialog(this, "Marks must be between 0 and 100.");
                return;
            }

            // Find the student
            Student student = findStudent(name);
            if (student == null) {
                JOptionPane.showMessageDialog(this, "Student not found. Please add the student first.");
                return;
            }

            student.addSubject(new Subject(subject, marks));
            resultArea.append("Added Marks: " + name + " - " + subject + ": " + marks + "\n");
            subjectField.setText("");
            marksField.setText("");
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Please enter valid marks.");
        }
    }

    private Student findStudent(String name) {
        for (Student student : students) {
            if (student.getName().equalsIgnoreCase(name)) {
                return student;
            }
        }
        return null;
    }

    private void calculateAverageAndGrade() {
        if (students.isEmpty()) {
            JOptionPane.showMessageDialog(this, "No students to calculate.");
            return;
        }

        StringBuilder results = new StringBuilder();
        for (Student student : students) {
            double average = student.calculateAverage();
            String letterGrade = student.calculateLetterGrade();
            results.append(student.getName()).append(" - Average Marks: ").append(average)
                    .append(" - Letter Grade: ").append(letterGrade).append("\n");
        }
        resultArea.append(results.toString());
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            StudentGradeCalculator calculator = new StudentGradeCalculator();
            calculator.setVisible(true);
        });
    }

    class Student {
        private String name;
        private ArrayList<Subject> subjects;

        public Student(String name) {
            this.name = name;
            this.subjects = new ArrayList<>();
        }

        public String getName() {
            return name;
        }

        public void addSubject(Subject subject) {
            subjects.add(subject);
        }

        public double calculateAverage() {
            double total = 0;
            for (Subject subject : subjects) {
                total += subject.getMarks();
            }
            return subjects.isEmpty() ? 0 : total / subjects.size();
        }

        public String calculateLetterGrade() {
            double average = calculateAverage();
            if (average >= 90) {
                return "A";
            } else if (average >= 80) {
                return "B";
            } else if (average >= 70) {
                return "C";
            } else if (average >= 60) {
                return "D";
            } else {
                return "F";
            }
        }
    }

    class Subject {
        private String name;
        private double marks;

        public Subject(String name, double marks) {
            this.name = name;
            this.marks = marks;
        }

        public double getMarks() {
            return marks;
        }
    }
}