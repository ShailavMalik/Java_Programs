import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

public class p19_Applet_GUI extends Applet implements ActionListener {
    Label label;
    Button button;

    public void init() {
        setLayout(new FlowLayout());

        // Create label and button
        label = new Label("Click the button");
        button = new Button("Click Me");

        // Add components to the applet
        add(label);
        add(button);

        // Register action listener
        button.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e) {
        label.setText("Button clicked!");
    }
}
