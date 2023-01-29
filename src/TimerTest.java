import java.awt.*;
import java.awt.event.*;
import java.time.*;
import javax.swing.*;

public class TimerTest {

    public static void main(String[] args) {
        var listener = new TimePrinter();
        var timer = new Timer(1000, listener);
        timer.start();
        //图形化界面的相关接口，生成可以进行交互的按钮；
        JOptionPane.showMessageDialog(null, "Quit program?");
        System.exit(0);
    }
}

class TimePrinter implements ActionListener{
    public void actionPerformed(ActionEvent event){
        System.out.println("At the tone, the time is " +  Instant.ofEpochMilli(event.getWhen()));
        //发出计时器结束的声音；
        Toolkit.getDefaultToolkit().beep();
    }
}

