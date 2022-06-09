package com.vladarsenjtev;

;
import java.io.File;
import java.util.ArrayList;


public class Main {
    public static final String PATHNAME = "C:\\Projects\\Home_Work23\\сurrency";
    public static final String NAMEFILE = "C:\\Projects\\Home_Work23\\сurrency\\060";

    public static void main(String[] args) throws Exception {
        ScannerClient scannerClient = new ScannerClient();
        scannerClient.scanner();
        FileReaderOne fileReaderOne = new FileReaderOne();
        File dir = new File(PATHNAME);
        File[] arrFiles = dir.listFiles();
        int num = 6;

        for (int i = 0; i < arrFiles.length; i++) {
            fileReaderOne.reader(scannerClient.getСurrency(), NAMEFILE + num + ".txt", scannerClient.getDateStart(), scannerClient.getDateEnd());
            num++;
            if (num > 8) {
                break;
            }
        }
        System.out.println(average(fileReaderOne.getListDouble()));
    }

    public static double average(ArrayList<Double> list) {
        double sum = 0;

        for (Double aDouble : list) {
            sum += aDouble;
        }
        return sum / list.size();
    }
}