import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JOptionPane;

public class textField extend JFrame;
{
    private JTextField textField1; 
    private JTextField textField2; 
    private JTextField textField3; 
    private JPasswordField passwordField;
    
    public TextFieldFrame()
    {
        super( "Testing JTextField and JPasswordField");
        setLayout( new FlowLayout()); 
        
        textFied1 = new JTextField(10);
        add (textField1); 
        
        
        textField2 = new JTextField(" Enter text here");
        add ( textField2); 
        
        
        textField3= new JPasswordField(" Hidden text");
        textField3.setEditable( false);
        add (  textField3); 
        
        TextFieldHandler handler = new TextFieldHandler();
        textFieldHAndler1.addActionListener( handler);
        textFieldHandler2.addActionListener(handler);
        textFieldHandler3.addActionListener(handler);
        passwordField.addActionListener( handler);
        
    }    
}