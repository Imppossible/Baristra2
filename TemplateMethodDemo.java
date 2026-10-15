import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TemplateMethodDemo extends JFrame {
    private JRadioButton rbCoffee, rbTea;
    private JButton btnBrew;
    private JTextArea textArea;

    public TemplateMethodDemo() {
        setTitle("Coffee and Tea");
        setSize(350, 450);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(null);

        JLabel lblTitle = new JLabel("Coffee and Tea");
        lblTitle.setFont(lblTitle.getFont().deriveFont(20.0f));
        lblTitle.setBounds(70, 20, 200, 30);
        add(lblTitle);

        rbCoffee = new JRadioButton("Coffee");
        rbCoffee.setBounds(70, 70, 80, 25);
        add(rbCoffee);

        rbTea = new JRadioButton("Tea");
        rbTea.setBounds(70, 105, 80, 25);
        add(rbTea);

        ButtonGroup group = new ButtonGroup();
        group.add(rbCoffee);
        group.add(rbTea);
        rbCoffee.setSelected(true);

        btnBrew = new JButton("BREW");
        btnBrew.setBounds(170, 70, 100, 55);
        add(btnBrew);

        textArea = new JTextArea();
        textArea.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(textArea);
        scrollPane.setBounds(30, 150, 275, 220);
        add(scrollPane);

        btnBrew.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Beverage beverage;
                String drinkName;

                if (rbCoffee.isSelected()) {
                    beverage = new Coffee();
                    drinkName = "Coffee";
                } else {
                    beverage = new Tea();
                    drinkName = "Tea";
                }

                beverage.brew();

                StringBuilder sb = new StringBuilder();
                sb.append("Making ").append(drinkName).append(":\n");
                sb.append("1.").append(beverage.getStep1()).append("\n");
                sb.append("2.").append(beverage.getStep2()).append("\n");
                sb.append("3.").append(beverage.getStep3()).append("\n");
                if (beverage.getStep4() != null) {
                    sb.append("4.").append(beverage.getStep4()).append("\n");
                }

                textArea.setText(sb.toString());
            }
        });
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new TemplateMethodDemo().setVisible(true);
            }
        });
    }
}