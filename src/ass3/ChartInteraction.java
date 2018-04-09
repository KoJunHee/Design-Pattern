package ass3;

import java.util.ArrayList;
import java.util.Scanner;

public class ChartInteraction {
    private Scanner scanner;
    private ChartOrder chartOrder;


    public ChartInteraction() {
        scanner = new Scanner(System.in);
    }


    //runs the program as follows:
    // 1. Gets details of chart info from user
    // 2. Displays Chart
    public void run() {


        // 1. Gets details of chart info from user
        System.out.print("Enter Chart Name : ");
        String title = scanner.nextLine();
        System.out.print("Enter X-Coordinate Name : ");
        String xCoordinateName = scanner.nextLine();
        System.out.print("Enter Y-Coordinate Name : ");
        String yCoordinateName = scanner.nextLine();



        ArrayList<DataPoint> dataPoints = new ArrayList<DataPoint>();
        System.out.println("Enter your data ");
        while (true) {

            System.out.print("x : ");
            int xRes = scanner.nextInt();
//            String x = scanner.nextLine();
            System.out.print("y : ");
            int yRes = scanner.nextInt();
//            String y = scanner.nextLine();

//            int xRes = x.charAt(0)-'0';
//            int yRes = Integer.parseInt(y);



            scanner.nextLine();
            dataPoints.add(new DataPoint(xRes, yRes));

            System.out.print("If you want to stop, enter '!'. Otherwise, enter '@' ");
            String flag = scanner.nextLine();
            if (flag.charAt(0)=='!') {
                break;
            }

        }
        chartOrder = new ChartOrder(title, xCoordinateName, yCoordinateName, dataPoints );



        // 2. Displays Chart
        System.out.println(chartOrder.getChart());

    }
}
