package adapter_facade.prob_3;

/*
 * 2013112045
 * 컴퓨터공학
 * 김태웅
 */

import javax.swing.*;

public class RocketUI {

    public void getRocketUI() {
        new JTableTest();
    }
}


//GUI 부분을 따로 빼서 처리했다.
class JTableTest extends JFrame {
    private Rocket[] rockets = new Rocket[]{
            new Rocket("Shooter", 3.95, 50),
            new Rocket("Orbit", 29.95, 5000),
    };


	JTableTest() {
        RocketTable rt = new RocketTable(rockets);

        String[] columnNames = {rt.getColumnName(0), rt.getColumnName(1), rt.getColumnName(2)};

        Object[][] data = {
                {rockets[0].getName(), rockets[0].getPrice(), rockets[0].getApogee()},
                {rockets[1].getName(), rockets[1].getPrice(), rockets[1].getApogee()},
        };

        JTable table = new JTable(data,columnNames);

        add(new JScrollPane(table));
        setTitle("2013112045 김태웅");
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setSize(300,400);
        setVisible(true);
    }
}
