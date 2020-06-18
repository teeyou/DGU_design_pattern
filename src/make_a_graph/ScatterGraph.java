package make_a_graph;

import java.util.List;

public class ScatterGraph extends Graph{
    private List<ScatterData> dataList;
    private int scaleGap;

    public ScatterGraph(String labelX, String labelY, String title, List<ScatterData> dataList) {
        super(labelX, labelY, title);
        this.dataList = dataList;
    }

    public ScatterGraph(String labelX, String labelY, String title, String backgroundColor, String pointColor, List<ScatterData> dataList) {
        super(labelX, labelY, title, backgroundColor, pointColor);
        this.dataList = dataList;
    }

    public List<ScatterData> getDataList() {
        return dataList;
    }

    public void setDataList(List<ScatterData> dataList) {
        this.dataList = dataList;
    }
}
