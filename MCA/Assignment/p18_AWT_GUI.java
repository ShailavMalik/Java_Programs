
// //* program using AWT that creates a simple GUI with a button and label.
import java.awt.*;
import java.awt.event.*;

class design implements ActionListener {
    Frame frame;
    Button button;
    Label label;

    design() {
        frame = new Frame("AWT GUI Example");
        frame.setBackground(Color.CYAN);
        frame.setResizable(false);
        frame.setBounds(100, 100, 400, 300);
        frame.setVisible(true);

        label = new Label("");
        label.setFont(new Font("Arial", Font.PLAIN, 14));
        label.setForeground(Color.BLACK);
        label.setPreferredSize(new Dimension(200, 50));
        label.setAlignment(Label.CENTER);
        label.setBackground(Color.WHITE);
        frame.add(label);

        button = new Button("Click Me");
        button.setBackground(Color.BLUE);
        button.setForeground(Color.WHITE);
        button.setFont(new Font("Arial", Font.BOLD, 16));
        button.setPreferredSize(new Dimension(150, 50));
        button.addActionListener(this);
        frame.setLayout(new FlowLayout(FlowLayout.CENTER, 20, 40));
        frame.add(button);
    }

    public void actionPerformed(ActionEvent e) {
        // Toggle label text and background color
        if(e.getSource() == button) {
            toggleLabel();
        }
    }

    private void toggleLabel() {
        if (label.getText().isEmpty()) {
            label.setText("Hello! I am Shailav Malik");
            label.setBackground(Color.YELLOW);
        } else {
            label.setText("");
            label.setBackground(Color.WHITE);
        }
    }
}

public class p18_AWT_GUI {
    public static void main(String[] args) {
        new design();
    }
}
