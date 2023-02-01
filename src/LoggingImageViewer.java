import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.util.logging.*;
import javax.swing.*;

public class LoggingImageViewer {
    public static void main(String[] args) {
        if(System.getProperty("java.util,logging.config.class") == null && System.getProperty("java.util.logging.config.file") == null){
            try
            {
                Logger.getLogger("com.horstmann.corejava").setLevel(Level.ALL);
                final int LOG_ROTATION_COUNT = 10;
                var handler = new FileHandler("%hLoggingImageViewer.log",0,LOG_ROTATION_COUNT);
                Logger.getLogger("com.horstmann.corejava").addHandler(handler);
            }
            catch (IOException e){
                Logger.getLogger("com.horstmann.corejava").log(Level.SEVERE,"Can't create log file hander",e);
            }
        }
        EventQueue.invokeLater(() ->{
            var windowHander = new WindowHandler();
            windowHander.setLevel(Level.ALL);
            Logger.getLogger("com.horstmann.corejava").addHandler(windowHander);

            var frame = new ImageViewerFrame();
            frame.setTitle("LoggingImageViewer");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            Logger.getLogger("com.horstmann.corejava").fine("Showing frame");
            frame.setVisible(true);
        });
    }
}

class ImageViewerFrame extends JFrame {
    private static final int DEFAULT_WIDTH = 300;
    private static final int DEFAULT_HEIGHT = 400;
    private JLabel label;
    private static Logger logger = Logger.getLogger("com.horstmann.corejava");

    public ImageViewerFrame() {
        logger.entering("ImageViewerFrame", "<init>");
        setSize(DEFAULT_WIDTH, DEFAULT_HEIGHT);

        var menuBar = new JMenuBar();
        setJMenuBar(menuBar);
        var menu = new JMenu("File");
        menuBar.add(menu);
        var openItem = new JMenuItem("Open");
        menu.add(openItem);
        openItem.addActionListener(new FileOpenListener());

        var exitItem = new JMenuItem("Exit");
        menu.add(exitItem);
        exitItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent event) {
                logger.fine("Exiting.");
                System.exit(0);
            }
        });
        label = new JLabel();
        add(label);
        logger.exiting("ImageViewerFrame", "<init>");
    }

    private class FileOpenListener implements ActionListener {
        public void actionPerformed(ActionEvent event) {
            logger.entering("ImageViewerFrame.FileOpenListener", "actionPerformed", event);
            var chooser = new JFileChooser();
            chooser.setCurrentDirectory(new File("."));
            chooser.setFileFilter(new javax.swing.filechooser.FileFilter() {
                public boolean accept(File f){
                    return f.getName().toLowerCase().endsWith(".gif") || f.isDirectory();
                }
                public String getDescription(){
                    return "GIF Images";
                }
            });
            int r = chooser.showOpenDialog(ImageViewerFrame.this);
            if(r == JFileChooser.APPROVE_OPTION){
                String name = chooser.getSelectedFile().getPath();
                logger.log(Level.FINE,"Reading file {0}",name);
                label.setIcon(new ImageIcon(name));
            }
            else logger.fine("File open dialog caneled");
            logger.exiting("ImageViewerFrame.FileOpenListener","actionPerformed");
        }
    }
}

class WindowHandler extends StreamHandler{
    private JFrame frame;
    public WindowHandler(){
        frame = new JFrame();
        var output = new JTextArea();
        output.setEditable(false);
        frame.setSize(200,200);
        frame.add(new JScrollPane(output));
        frame.setFocusableWindowState(false);
        frame.setVisible(true);
        setOutputStream(new OutputStream() {
            public void write(int b)  {
            }
            public void write(byte[] b,int off,int len){
                output.append(new String (b,off,len));
            }
        });
    }
    public void publish(LogRecord record){
        if(!frame.isVisible()) return;
        super.publish(record);
        flush();
    }
}