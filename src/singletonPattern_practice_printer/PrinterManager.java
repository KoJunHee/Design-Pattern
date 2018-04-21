package singletonPattern_practice_printer;

import java.util.ArrayList;
import java.util.List;

public class PrinterManager {
    private static PrinterManager instance = null;
    private static List <Printer> printers = new ArrayList<Printer>();


    private PrinterManager(){
        printers.add(new Printer());
        printers.add(new Printer());
        printers.add(new Printer());
    }

    public synchronized static PrinterManager getInstance(){
        if(instance==null){
            instance = new PrinterManager();
        }
        return instance;
    }
//
//    public static void assignAvailablePrinter(){
//        for (Printer printer : printers){
//            if(printer.isAvailable()){
//                printer.setAvailable(false);
//                return printer;
//            }
//        }
//    }



}
