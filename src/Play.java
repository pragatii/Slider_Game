import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Poko on 23-01-2016.
 */
public class Play extends JFrame implements ActionListener {
    private JPanel panel1;
    private JSlider slider1;
    private JButton GOButton;
    private JButton EXITButton;
    private JButton RESETButton;
    private JLabel label1;
    private JLabel label2;
    int randomNo;
    int sliderValue;

    public Play(){
        setSize(500,500);
        setContentPane(panel1);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        GOButton.addActionListener(this);
        EXITButton.addActionListener(this);
        RESETButton.addActionListener(this);

        randomNo=(int)(Math.random()*100);
        String random=Integer.toString(randomNo);

        label1.setText("Target : "+ random);




        setVisible(true);
    }

    public static void main(String[] args) {
        new Play();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==GOButton){
            sliderValue=slider1.getValue();
        }
        if(randomNo==sliderValue){
            label2.setText("BULLZZZ EYE!!!!");
        }
        else{
            label2.setText("OOPPPSSS !! You missed it.. Value was : "+sliderValue);
            if(e.getSource()==RESETButton){
                new Play();
            }

        }
        if(e.getSource()==EXITButton){
            System.exit(0);
        }
    }

    }


