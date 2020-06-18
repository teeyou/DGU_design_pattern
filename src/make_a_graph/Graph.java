package make_a_graph;

public class Graph {
    private String labelX;
    private String labelY;
    private String title;
    private char dataPoint;

    private String backgroundColor;
    private String pointColor;

    public Graph(String labelX, String labelY, String title) {
        this.labelX = labelX;
        this.labelY = labelY;
        this.title = title;

        this.dataPoint = '*';
    }

    public Graph(String labelX, String labelY, String title, String backgroundColor, String pointColor) {
        this.labelX = labelX;
        this.labelY = labelY;
        this.title = title;
        this.backgroundColor = backgroundColor;
        this.pointColor = pointColor;

        this.dataPoint = '*';
    }

    public String getLabelX() {
        return labelX;
    }

    public void setLabelX(String labelX) {
        this.labelX = labelX;
    }

    public String getLabelY() {
        return labelY;
    }

    public void setLabelY(String labelY) {
        this.labelY = labelY;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public char getDataPoint() {
        return dataPoint;
    }

    public void setDataPoint(char dataPoint) {
        this.dataPoint = dataPoint;
    }

    public String getBackgroundColor() {
        return backgroundColor;
    }

    public void setBackgroundColor(String backgroundColor) {
        this.backgroundColor = backgroundColor;
    }

    public String getPointColor() {
        return pointColor;
    }

    public void setPointColor(String pointColor) {
        this.pointColor = pointColor;
    }
}
