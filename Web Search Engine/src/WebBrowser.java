//package web.browser;

import javax.swing.*;
import javafx.embed.swing.JFXPanel;
import javafx.scene.web.WebView;
import javafx.scene.Scene;
import javafx.application.Platform;

public class WebBrowser extends JFrame implements Runnable  
{
    private JFXPanel panel;
    
    public static void main(String[] args){
        SwingUtilities.invokeLater(new WebBrowser());
    }

    @Override
    public void run() {
        setTitle("Jaguar");
        setBounds(40,20,600,600);
        setVisible(true);   

        panel=new JFXPanel();
        add(panel);
        Platform.runLater(() -> {
            WebView view = new WebView();
            view.getEngine().load("http://www.google.com");

            panel.setScene(new Scene(view));
        });
    }

}