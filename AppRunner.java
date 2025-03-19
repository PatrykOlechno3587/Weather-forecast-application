import javax.swing.*;

public class AppRunner {

    public static void main(String[] args) {

        SwingUtilities.invokeLater(new Runnable(){
            @Override
            public void run(){
                // display our weather app gui
                new AppGui().setVisible(true);

//   /             System.out.println(WeatherApp.getLocationData("USA"));

//                System.out.println(WeatherApp.getCurrentTime());

            }
        });

    }
    }

