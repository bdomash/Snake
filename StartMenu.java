import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class StartMenu extends JFrame implements ActionListener
{
    private JButton play, mode, colorButton, highscores, music;
    private JLabel clickCount;
    private Screen s;
    private JComboBox modeList;
    
    private int defaultDiff = 1;
    private String difficult;
    private String[] difficultyOption = {"EASY","MEDIUM","HARD","YOU WILL NOT SURVIVE","GHOST","TROLL"};
    private String[] colorOption = {"GREEN","BLUE","CYAN","GRAY","MAGENTA","ORANGE","PINK","RED","WHITE","YELLOW"};
    private String color = "GREEN";
    //Counter counter
    
    public StartMenu()
    {
        super("Snake");
        
        s = new Screen();
        
        //counter = c;
        preInit();
        postInit();        
    }
    private void preInit()
    {
        //setLayout(new GridLayout(7,5,15,30));
        setLayout(null);
        setResizable(false);
        
        
        //clickCount = new JLabel("Do Not Press");
        play = new JButton("Play");
        play.setActionCommand("play");
        play.addActionListener(this);
        
        mode = new JButton("Mode");
        mode.setActionCommand("mode");
        mode.addActionListener(this);
        
        modeList = new JComboBox(difficultyOption);
        modeList.setSelectedIndex(0);
        modeList.addActionListener(this);
        modeList.setVisible(true);
        
        colorButton = new JButton("Color");
        colorButton.setActionCommand("color");
        colorButton.addActionListener(this);
        
        highscores = new JButton("Highscores");
        highscores.setActionCommand("highscores");
        highscores.addActionListener(this);
        
        music = new JButton("Music");
        highscores.setActionCommand("music");
        highscores.addActionListener(this);
        
         
        JRadioButton s1 = new JRadioButton("Sound On");
        JRadioButton s2 = new JRadioButton("Mute");
        
        add(play);
        add(mode);
        add(modeList);
        add(colorButton);
        add(highscores);        
        add(music);
        
        JPanel right = new JPanel(new GridLayout(1, 2));
        right.add(s1);
        right.add(s2);
       
        
        play.setBounds(570,30,200,50);
        mode.setBounds(570,100,200,50);
        colorButton.setBounds(570,170,200,50);
        highscores.setBounds(570,700,200,50);
        music.setBounds(30,700,200,50);
        
        //clickButton.setLocation(400,400);
        
        //Insets insets = getInsets();
        //Dimension size = clickButton.getPreferredSize();
        //clickButton.setBounds(25 + insets.left, 5 + insets.top, size.width, size.height);
        //setSize(300 + insets.left + insets.right, 125 + insets.top + insets.bottom);
        
        
        
        //add(new JButton("1"));
        //add(new JButton("2"));
        //add(new JButton("3"));
        //add(new JButton("4"));
        //add(new JButton("5"));
        //add(new JButton("6"));
        //add(new JButton("7"));
        //add(new JButton("8"));
       
       
       
        
    }
    public void postInit()
    {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        setSize(800,800);
        
        setVisible(true);
    }
    public void actionPerformed(ActionEvent e)
    {
        if(e.getActionCommand().equals("play"))
        {
            //System.out.println("This worked kind of");
            setVisible(false);
            
            Frame f = new Frame();
            //JFrame frame = (JFrame) SwingUtilities.getRoot(this);   
            //frame.setVisible(false);
            //Frame.reset();
        }
        if(e.getActionCommand().equals("mode"))
        {
            difficult = (String)JOptionPane.showInputDialog(null,"Choose your difficulty","Choose Difficulty",JOptionPane.QUESTION_MESSAGE,null,difficultyOption,difficultyOption[defaultDiff]);
        }
        if(e.getActionCommand().equals("color"))
        {
            color = (String)JOptionPane.showInputDialog(null,"Select a color for your Snake","Choose Color",JOptionPane.QUESTION_MESSAGE,null,colorOption,colorOption[0]);
        }
        if(e.getActionCommand().equals("highscores"))
        {
            s.displayhs();
        }
    }
}