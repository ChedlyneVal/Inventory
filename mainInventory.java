
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.Border;

public class mainInventory extends JFrame{
    public JTextField NoItems = new JTextField();
    public JTextField SerialNo = new JTextField();
    public JTextField NameItem = new JTextField();
    
    public JLabel Name = new JLabel("Enter Name Of Item\n");
    public JLabel NameItems = new JLabel("Number of Items");
    public JLabel NameSerial= new JLabel("Enter Serial Number");
    
    public JButton Enter = new JButton("Enter item");
    private JButton Exit = new JButton("Exit");
    
    Border border = BorderFactory.createLineBorder(Color.BLACK,5);
    
    //NoItems.setBorder(border);
    
    public void FileText() throws FileNotFoundException
    {
        
    }
    public mainInventory() throws FileNotFoundException
    {
        JPanel x = new JPanel(new GridLayout(3,2));
        
        
        x.setBorder(BorderFactory.createTitledBorder("Enter Product Information"));
        
        x.add(Name);
        x.add(NoItems);
        
        x.add(Box.createVerticalStrut(1));
        //codebreakerAttempt.setBorder(BorderFactory.createTitledBorder("Codebreaker Attempt"));
      // x.setBorder(BorderFactory.createLineBorder(Color.yellow));
        x.add(NameItems);
        x.add(SerialNo);
        
        x.add(NameSerial);
        x.add(NameItem);
        
        JPanel z = new JPanel(new FlowLayout(FlowLayout.CENTER));
        
        z.add(Enter);
        z.add(Exit);
        
        add(x,BorderLayout.NORTH);
        add(z,BorderLayout.SOUTH);
        
        Enter.setEnabled(false);
        
        Enter.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
           
            }
        });
        Exit.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                mainInventory.super.dispose();
            }
        });
    }  
    public static void main(String[] args) throws FileNotFoundException{
        mainInventory window = new mainInventory();
        window.setTitle("Inventory");
        window.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        window.setVisible(true);
        window.setSize(900,200);
        //window.getContentPane().setBackground(Color.BLACK);        
    }
    
}
