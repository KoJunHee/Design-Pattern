package ass3;

import java.util.ArrayList;
import java.util.Arrays;

public class ChartOrder {

    private String title;
    private String xCoordinateName;
    private String yCoordinateName;
    private ArrayList<DataPoint> dataPoints;


    ChartOrder(String title, String xCoordinateName, String yCoordinateName, ArrayList<DataPoint> dataPoints) {
        this.title = title;
        this.xCoordinateName = xCoordinateName;
        this.yCoordinateName = yCoordinateName;
        this.dataPoints = dataPoints;
    }

    public int[] getAccendingXDataPoints() {
        int x[] = new int[dataPoints.size()];

        for (int i = 0; i < dataPoints.size(); i++) {
            x[i] = dataPoints.get(i).getX();
                System.out.println(x[i]);
        }

        Arrays.sort(x);

        return x;
    }

    public int[] getAccendingYDataPoints() {
        int y[] = new int[dataPoints.size()];

        for (int i = 0; i < dataPoints.size(); i++) {
            y[i] = dataPoints.get(i).getY();
        }

        Arrays.sort(y);

        return y;
    }


    //최종 그래프 리턴
    public String getChart() {
        return getTopLine() + "\n\n" + getMiddleLineOfScatter() + "\n";
    }


    // 타이틀
    private String getTopLine() {
        return "                                      " + this.title;
    }

    // 그래프 내부
    private String getMiddleLineOfScatter() {

        String result = "";

        int y[] = getAccendingYDataPoints();   // y 값 오름차순
        int x[] = getAccendingXDataPoints();   // x 값 오름차순

        // y 최대값이 0으로 나누어떨어지지 않으면
        if (y[y.length - 1] % 10 != 0) {
            y[y.length - 1] = y[y.length - 1] + (10 - y[y.length - 1] % 10);
        }

        // y 최소값이 0으로 나누어떨어지지 않으면
        if (y[0] % 10 != 0) {
            y[0] = y[0] - (y[0] % 10);
        }

        int yAvg = (y[y.length - 1] + y[0]) / 2;

        // x 최소값이 0으로 나누어떨어지지 않으면
        if (x[0] % 10 != 0) {
            x[0] = x[0] - (x[0] % 10);
        }

        // x 최대값이 0으로 나누어떨어지지 않으면
        if (x[x.length - 1] % 10 != 0) {
            y[x.length - 1] = x[x.length - 1] - (y[x.length - 1] % 10);
        }

        int xAvg = (x[x.length - 1] + x[0]) / 2;




        // Y축
        for (int i = y[y.length - 1]; i >= y[0]; i--) {


            if (i % 10 != 0) {
                if (yAvg == i) {
                    result += yCoordinateName + "              |";
                    //x값
                    if (findXData(i) != -1000) {
                        result += makeSpace(i - x[0]) + "*";
                    }
                    result += "\n";
                } else {
                    result += getyCoordinateSpace() + "              |";

                    //x값
                    if (findXData(i) != -1000) {
                        result += makeSpace(i - x[0]) + "*";
                    }
                    result += "\n";
                }

            } else {
                if (yAvg == i) {
                    result += yCoordinateName + "        " + i + "  -";

                    //x값
                    if (findXData(i) != -1000) {
                        result += makeSpace(i - x[0]) + "*";
                    }
                    result += "\n";

                } else {
                    result += getyCoordinateSpace() + "        " + i + "  -";
                    //x값
                    if (findXData(i) != -1000) {
                        result += makeSpace(i - x[0]) + "*";
                    }
                    result += "\n";
                }
            }
        }

        // X축
        result += getyCoordinateSpace() + "               " + "_______________________________________________________________________________________\n";

        result += getyCoordinateSpace() + "                ";
        for (int i = x[0]; i <= x[x.length - 1]; i++) {
            if (i % 10 == 0) {
                result += i + "  ";
            } else {
                result += "  ";
            }
        }


        return result;
    }

    // 그래프 내부
    private String getMiddleLineOfBar() {

        String result = "";

        int y[] = getAccendingYDataPoints();   // y 값 오름차순
        int x[] = getAccendingXDataPoints();   // x 값 오름차순

        // y 최대값이 0으로 나누어떨어지지 않으면
        if (y[y.length - 1] % 10 != 0) {
            y[y.length - 1] = y[y.length - 1] + (10 - y[y.length - 1] % 10);
        }

        // y 최소값이 0으로 나누어떨어지지 않으면
        if (y[0] % 10 != 0) {
            y[0] = y[0] - (y[0] % 10);
        }

        int yAvg = (y[y.length - 1] + y[0]) / 2;

        // x 최소값이 0으로 나누어떨어지지 않으면
        if (x[0] % 10 != 0) {
            x[0] = x[0] - (x[0] % 10);
        }

        // x 최대값이 0으로 나누어떨어지지 않으면
        if (x[x.length - 1] % 10 != 0) {
            y[x.length - 1] = x[x.length - 1] - (y[x.length - 1] % 10);
        }

        int xAvg = (x[x.length - 1] + x[0]) / 2;


        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        // Y축
        for (int i = y[y.length - 1]; i >= y[0]; i--) {


            if (i % 10 != 0) {
                if (yAvg == i) {
                    result += yCoordinateName + "              |";

                    if(findXData(i) != -1000){
                        arrayList.add(findXData(i));
                    }

                    //list안에 있는것 찍기
                    for(int j=0; j<arrayList.size(); j++){
                        result += makeSpace(arrayList.get(j) - x[0]) + "*";
                    }

                    result += "\n";
                } else {
                    result += getyCoordinateSpace() + "              |";

                    if(findXData(i) != -1000){
                        arrayList.add(findXData(i));
                    }

                    //list안에 있는것 찍기
                    for(int j=0; j<arrayList.size(); j++){
                        result += makeSpace(arrayList.get(j) - x[0]) + "*";
                    }

                    result += "\n";






                    result += "\n";
                }

            } else {
                if (yAvg == i) {
                    result += yCoordinateName + "        " + i + "  -";

                    if(findXData(i) != -1000){
                        arrayList.add(findXData(i));
                    }

                    //list안에 있는것 찍기
                    for(int j=0; j<arrayList.size(); j++){
                        result += makeSpace(arrayList.get(j) - x[0]) + "*";
                    }

                    result += "\n";






                    result += "\n";

                } else {
                    result += getyCoordinateSpace() + "        " + i + "  -";

                    if(findXData(i) != -1000){
                        arrayList.add(findXData(i));
                    }

                    //list안에 있는것 찍기
                    for(int j=0; j<arrayList.size(); j++){
                        result += makeSpace(arrayList.get(j) - x[0]) + "*";
                    }

                    result += "\n";



                    result += "\n";
                }
            }
        }




        // X축
        result += getyCoordinateSpace() + "               " + "_______________________________________________________________________________________\n";

        result += getyCoordinateSpace() + "                ";
        for (int i = x[0]; i <= x[x.length - 1]; i++) {

            System.out.println("-----------------------" + i);
            int check = i - 17;
            char res = (char)('A' + check);

            result += "                        " + res;
        }


        return result;

    }


    private String getyCoordinateSpace() {

        String result = "";
        for (int i = 0; i < yCoordinateName.length(); i++) {
            result += " ";
        }
        return result;
    }

    private String getSpace(int num) {
        String result = "";
        int numCnt = (int) (Math.log10(num) + 1);
        int spaceNum = 6 - numCnt;

        for (int i = 0; i < spaceNum; i++) {
            result += " ";
        }
        return result;
    }

    private String getXSpace(int num, int min) {
        String result = "";
        int cnt = num - min;

        for (int i = 0; i < cnt; i++) {
            result += " ";
        }

        return result;
    }

    private int findXData(int y) {
        for (int i = 0; i < dataPoints.size(); i++) {

            if (dataPoints.get(i).getY() == y) {
                return dataPoints.get(i).getX();
            }
        }
        return -1000;
    }

    private String makeSpace(int n) {
        String space = "";
        for (int i = 0; i < n + 2; i++) {
            space += "  ";
        }
        return space;
    }



}
