package ui;
import domain.*;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.*;

public class CreateGUI {

    private JFrame frame;
    private JPanel panel;
    private ArrayList<Staff> st = new ArrayList<Staff>();
    private static SetOfActions setOfActions = new SetOfActions();
    private String s1 = "The total number of all staffs is: ";
    private String s2 = "The total salary of all staffs is: ";

    public CreateGUI() {
        initUI();
    }

    private void initUI() {
        createJFrame();
        createJPanel();
        addPanel();
    }

    private void addPanel() {
        frame.setContentPane(panel);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    private void createJFrame() {
        frame = new JFrame("GUI");
        frame.setSize(800, 200);
        frame.setLocationRelativeTo(null);
    }

    private boolean isDouble(String str) {
        try {
            Double.parseDouble(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    private void createJPanel() {
        panel = new JPanel(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();

        JLabel name = new JLabel("Name");
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.ipady = 10;
        gbc.gridx = 0;
        gbc.gridy = 0;
        panel.add(name, gbc);

        final JTextField name_text = new JTextField(10);
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.gridx = 1;
        gbc.gridy = 0;
        gbc.weightx = 0.2;
        panel.add(name_text, gbc);

        final JLabel totalNumber = new JLabel("The total number of all staffs is: 0");
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.gridx = 2;
        gbc.gridy = 0;
        panel.add(totalNumber, gbc);

        final JLabel salary = new JLabel("Salary");
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.gridx = 0;
        gbc.gridy = 1;
        panel.add(salary, gbc);

        final JTextField salary_text = new JTextField(10);
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.gridx = 1;
        gbc.gridy = 1;
        panel.add(salary_text, gbc);

        final JLabel totalSalary = new JLabel("The total salary of all staffs is: 0");
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.gridx = 2;
        gbc.gridy = 1;
        panel.add(totalSalary, gbc);

        JButton ta = new JButton("TA");
        ta.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (name_text.getText() == null || salary_text.getText() == null || !isDouble(salary_text.getText()))
                    JOptionPane.showMessageDialog(frame, "Please make sure you have input name and salary," +
                            " the salary must be a number", "Error Message", JOptionPane.ERROR_MESSAGE);
                else {
                    setOfActions.addTA(st, name_text.getText(), Double.parseDouble(salary_text.getText()));
                    name_text.setText("");
                    salary_text.setText("");
                    totalNumber.setText(s1 + st.size());
                    totalSalary.setText(s2 + setOfActions.getTotalSalary(st));
                }
            }
        });
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.gridx = 0;
        gbc.gridy = 2;
        panel.add(ta, gbc);

        JButton technician = new JButton("Technician");
        technician.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (name_text.getText() == null || salary_text.getText() == null || !isDouble(salary_text.getText()))
                    JOptionPane.showMessageDialog(frame, "Please make sure you have input name and salary," +
                            " the salary must be a number", "Error Message", JOptionPane.ERROR_MESSAGE);
                else {
                    setOfActions.addTechnician(st, name_text.getText(), Double.parseDouble(salary_text.getText()));
                    name_text.setText("");
                    salary_text.setText("");
                    totalNumber.setText(s1 + st.size());
                    totalSalary.setText(s2 + setOfActions.getTotalSalary(st));
                }
            }
        });
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.gridx = 1;
        gbc.gridy = 2;
        panel.add(technician, gbc);

        JButton officer = new JButton("Officer");
        officer.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (name_text.getText() == null || salary_text.getText() == null || !isDouble(salary_text.getText()))
                    JOptionPane.showMessageDialog(frame, "Please make sure you have input name and salary," +
                            " the salary must be a number", "Error Message", JOptionPane.ERROR_MESSAGE);
                else {
                    setOfActions.addOfficer(st, name_text.getText(), Double.parseDouble(salary_text.getText()));
                    name_text.setText("");
                    salary_text.setText("");
                    totalNumber.setText(s1 + st.size());
                    totalSalary.setText(s2 + setOfActions.getTotalSalary(st));
                }
            }
        });
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.gridx = 2;
        gbc.gridy = 2;
        panel.add(officer, gbc);

        JButton rs = new JButton("RS");
        rs.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (name_text.getText() == null || salary_text.getText() == null || !isDouble(salary_text.getText()))
                    JOptionPane.showMessageDialog(frame, "Please make sure you have input name and salary," +
                            " the salary must be a number", "Error Message", JOptionPane.ERROR_MESSAGE);
                else {
                    setOfActions.addRS(st, name_text.getText(), Double.parseDouble(salary_text.getText()));
                    name_text.setText("");
                    salary_text.setText("");
                    totalNumber.setText(s1 + st.size());
                    totalSalary.setText(s2 + setOfActions.getTotalSalary(st));
                }
            }
        });
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.gridx = 3;
        gbc.gridy = 2;
        panel.add(rs, gbc);

        JButton ra = new JButton("RA");
        ra.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (name_text.getText() == null || salary_text.getText() == null || !isDouble(salary_text.getText()))
                    JOptionPane.showMessageDialog(frame, "Please make sure you have input name and salary," +
                            " the salary must be a number", "Error Message", JOptionPane.ERROR_MESSAGE);
                else {
                    setOfActions.addRA(st, name_text.getText(), Double.parseDouble(salary_text.getText()));
                    name_text.setText("");
                    salary_text.setText("");
                    totalNumber.setText(s1 + st.size());
                    totalSalary.setText(s2 + setOfActions.getTotalSalary(st));
                }
            }
        });
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.gridx = 0;
        gbc.gridy = 3;
        panel.add(ra, gbc);

        JButton professor = new JButton("Professor");
        professor.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (name_text.getText() == null || salary_text.getText() == null || !isDouble(salary_text.getText()))
                    JOptionPane.showMessageDialog(frame, "Please make sure you have input name and salary," +
                            " the salary must be a number", "Error Message", JOptionPane.ERROR_MESSAGE);
                else {
                    setOfActions.addProfessor(st, name_text.getText(), Double.parseDouble(salary_text.getText()));
                    name_text.setText("");
                    salary_text.setText("");
                    totalNumber.setText(s1 + st.size());
                    totalSalary.setText(s2 + setOfActions.getTotalSalary(st));
                }
            }
        });
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.gridx = 1;
        gbc.gridy = 3;
        panel.add(professor, gbc);

        JButton lecturer = new JButton("Lecturer");
        lecturer.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (name_text.getText() == null || salary_text.getText() == null || !isDouble(salary_text.getText()))
                    JOptionPane.showMessageDialog(frame, "Please make sure you have input name and salary," +
                            " the salary must be a number", "Error Message", JOptionPane.ERROR_MESSAGE);
                else {
                    setOfActions.addLecturer(st, name_text.getText(), Double.parseDouble(salary_text.getText()));
                    name_text.setText("");
                    salary_text.setText("");
                    totalNumber.setText(s1 + st.size());
                    totalSalary.setText(s2 + setOfActions.getTotalSalary(st));
                }
            }
        });
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.gridx = 2;
        gbc.gridy = 3;
        panel.add(lecturer, gbc);

        JButton increase = new JButton("Increase Salary");
        increase.setBackground(Color.GREEN);
        increase.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                    name_text.setText("");
                    salary_text.setText("");
                    totalNumber.setText(s1 + st.size());
                    totalSalary.setText(s2 + setOfActions.increaseTotalSalary(st));
            }
        });
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.gridx = 0;
        gbc.gridy = 4;
        panel.add(increase, gbc);
    }

    public static void main(String[] args) {
        CreateGUI ui = new CreateGUI();
    }
}
