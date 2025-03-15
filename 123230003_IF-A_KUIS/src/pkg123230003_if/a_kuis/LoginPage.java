
package pkg123230003_if.a_kuis;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

public class LoginPage extends JFrame
{
    private JTextField usernameField;
    private JPasswordField passwordField;
    private String usernamePlaceholder = "Masukkan username";
    private String passwordPlaceholder = "Masukkan password";

   
    public LoginPage ()
    {
        setTitle("Login Page");
        setSize(300,300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setAlwaysOnTop(true);
        
        JLabel usernameLabel = new JLabel("Username: ");
        usernameField = new JTextField();
        usernameField.setText(usernamePlaceholder);
        
        usernameField.addFocusListener(new FocusListener()
        {
            @Override
            public void focusGained(FocusEvent e)
            {
                if(usernameField.getText().equals(usernamePlaceholder))
                {
                    usernameField.setText("");
                }
            }    
            
            @Override
            public void focusLost(FocusEvent e)
            {
                if(usernameField.getText().isEmpty())
                {
                    usernameField.setText(usernamePlaceholder);
                }
            
            }
        });
        
        JLabel passwordLabel = new JLabel("Password: ");
        passwordField = new JPasswordField();
        passwordField.setText(passwordPlaceholder);
        
        passwordField.addFocusListener(new FocusListener()
        {
            @Override
            public void focusGained(FocusEvent e)
            {
                if(new String(passwordField.getPassword()).equals(passwordPlaceholder))
                {
                    passwordField.setText("");
                }
            }    
            
            @Override
            public void focusLost(FocusEvent e)
            {
            
                     if(new String(passwordField.getPassword()).isEmpty())
                {
                    passwordField.setText(passwordPlaceholder);
                }
            
            }
        });
        
       JButton loginButton = new JButton("Login");
       loginButton.addActionListener(new ActionListener()
       {
           @Override
           public void actionPerformed(ActionEvent e)
           {
           login();
           }
       });
        
        setLayout(null);
        add(usernameLabel);
        add(usernameField);
        add(passwordLabel);
        add(passwordField);
        add(new JLabel());
        add(loginButton);
        
        usernameLabel.setBounds(20,10,100,20);
        usernameField.setBounds(120,10,150,20);
        
        passwordLabel.setBounds(20,30,100,20);
        passwordField.setBounds(120,30,150,20);
        
        loginButton.setBounds(100,80,100,30);
        
        setVisible(true);   
    }
    
    
    private void login()
    {
        String username = usernameField.getText();
        String password = passwordField.getText();
        
        if(username.equals("123230003") && password.equals("0003"))
        {
            new MainPage(username);
            dispose();
        }
        
        else
        {
            JOptionPane.showMessageDialog(this,"Login Gagal.Username atau Password Salah.");
        }
    }
    
public static void main(String[]args)
{
 new LoginPage();
}
    
}
