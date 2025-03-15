package pkg123230003_if.a_kuis;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.text.NumberFormat;
import java.util.Locale;


public class MainPage extends JFrame
{
    private JLabel gitar;
    private  JTextField jumlahGitar;
    private  JLabel piano;
    private   JTextField jumlahPiano;
    private  JLabel drum;
    private   JTextField jumlahDrum;
    private static String username;
    
    
    public MainPage(String username)
    {
        MainPage.username = username;
        setTitle("Halaman Utama");
        setSize(400,400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setAlwaysOnTop(true);
        
   
        
        JLabel welcomeLabel = new JLabel ("Selamat Datang di Musicians " + username);
        welcomeLabel.setHorizontalAlignment(SwingConstants.CENTER);
        JLabel gitar = new JLabel("Gitar (Rp500.000:");
        JLabel piano = new JLabel("Piano (Rp2.000.000:");
        JLabel drum = new JLabel("Drum (Rp1.500.000:");
        
        jumlahGitar = new JTextField();
        jumlahPiano = new JTextField();
        jumlahDrum = new JTextField();
        
        JButton beliButton = new JButton("Beli");
        JButton logoutButton = new JButton("Logout");
        
        beliButton.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                new PembelianPage();
                dispose();
            }
        });
        
         logoutButton.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                new LoginPage();
                dispose();
            }
        });
         
         
         add(gitar);
         add(piano);
         add(drum);
         add(jumlahGitar);
         add(jumlahPiano);
         add(jumlahDrum);
         add(beliButton);
         add(logoutButton);
         
         gitar.setBounds(20,10,440,15);
         jumlahGitar.setBounds(120,30,120,20);
         
         piano.setBounds(20,10,440,15);
         jumlahPiano.setBounds(120,30,120,20);
         
         drum.setBounds(20,50,440,15);
         jumlahDrum.setBounds(120,50,120,20);
         
         beliButton.setBounds(100,200,100,20);
         logoutButton.setBounds(105,200,100,20);
         setVisible(true);
    }
    
    public static String getUsername()
    {
    return username;
    }
   
}
