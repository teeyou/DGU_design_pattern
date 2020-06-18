package make_a_graph;

import java.util.List;

public class BarGraph extends Graph{
    private List<BarData> dataList;
    private int scaleGap;

    public BarGraph(String labelX, String labelY, String title, List<BarData> dataList) {
        super(labelX, labelY, title);
        this.dataList = dataList;
    }

    public BarGraph(String labelX, String labelY, String title, String backgroundColor, String pointColor, List<BarData> dataList) {
        super(labelX, labelY, title, backgroundColor, pointColor);
        this.dataList = dataList;
    }

    public List<BarData> getDataList() {
        return dataList;
    }

    public void setDataList(List<BarData> dataList) {
        this.dataList = dataList;
    }
}
