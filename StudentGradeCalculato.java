import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class StudentGradeCalculato extends JFrame {
    private JTextField nameField;
    private JTextField gradeField;
    private JTextArea resultArea;
    private ArrayList<Student> students;

    public StudentGradeCalculato() {
        students = new ArrayList<>();

        setTitle("Student Grade Calculator");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        JLabel nameLabel = new JLabel("Student Name:");
        nameField = new JTextField(15);
        JLabel gradeLabel = new JLabel("Grade:");
        gradeField = new JTextField(5);
        JButton addButton = new JButton("Add Student");
        JButton calculateButton = new JButton("Calculate Average");
        resultArea = new JTextArea(10, 30);
        resultArea.setEditable(false);

        add(nameLabel);
        add(nameField);
        add(gradeLabel);
        add(gradeField);
        add(addButton);
        add(calculateButton);
        add(new JScrollPane(resultArea));

        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                addStudent();
            }
        });

        calculateButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                calculateAverage();
            }
        });
    }

    private void addStudent() {
        String name = nameField.getText();
        String gradeText = gradeField.getText();

        if (name.isEmpty() || gradeText.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please enter both name and grade.");
            return;
        }

        try {
            double grade = Double.parseDouble(gradeText);
            students.add(new Student(name, grade));
            resultArea.append("Added: " + name + " with grade: " + grade + "\n");
            nameField.setText("");
            gradeField.setText("");
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Please enter a valid grade.");
        }
    }

    private void calculateAverage() {
        if (students.isEmpty()) {
            JOptionPane.showMessageDialog(this, "No students to calculate.");
            return;
        }

        double total = 0;
        for (Student student : students) {
            total += student.getGrade();
        }
        double average = total / students.size();
        resultArea.append("Average Grade: " + average + "\n");
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            StudentGradeCalculator calculator = new StudentGradeCalculator();
            calculator.setVisible(true);
        });
    }

    class Student {
        private String name;
        private double grade;

        public Student(String name, double grade) {
            this.name = name;
            this.grade = grade;
        }

        public double getGrade() {
            return grade;
        }
    }
}