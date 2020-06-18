package adapter_facade.prob_3;

/*
 * 2013112045
 * 컴퓨터공학
 * 김태웅
 */

public class RocketTable extends AbstractTableModel {

    protected Rocket[] rockets;

    protected String[] columnNames = new String[] { "Name", "Price", "Apogee" };

    public RocketTable(Rocket[] rockets) {
        this.rockets = rockets;
    }

    public int getColumnCount() { // 완성할 코드!
        return columnNames.length;
    }

    public String getColumnName(int i) { // 완성할 코드!
        return columnNames[i];
    }

    public int getRowCount() { // 완성할 코드!
        return rockets.length;
    }

    public Object getValueAt(int row, int col) { // 완성할 코드!
        String colName = getColumnName(col);
        if (colName.equals("Name"))
            return rockets[row].getName();
        else if (colName.equals("Price"))
            return rockets[row].getPrice();
        else
            return rockets[row].getApogee();
    }
}


//class Rocket {
//    private String name;
//    private double price;
//    private Length apogee;
//
//    public Rocket(String name, double price, Length apogee) {
//        this.name = name;
//        this.price = price;
//        this.apogee = apogee;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public double getPrice() {
//        return price;
//    }
//
//    public Length getApogee() {
//        return apogee;
//    }
//}

//class Length {
//    private double value;
//
//    public Length(double value) {
//        this.value = value;
//    }
//
//    public double getApogeeValue() {
//        return this.value;
//    }
//}
