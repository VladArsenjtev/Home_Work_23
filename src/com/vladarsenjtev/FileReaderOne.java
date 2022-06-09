package com.vladarsenjtev;

import java.io.BufferedReader;
import java.io.FileReader;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;



public class FileReaderOne {

    String strTwo;
    ArrayList<Double> listDouble = new ArrayList<>();

    public void reader(String сurrency, String nameFile, String dateStart, String dateEnd) throws Exception {
        try (
                BufferedReader reader = new BufferedReader(new FileReader(nameFile))) {
            SimpleDateFormat format = new SimpleDateFormat();
            format.applyPattern("dd.MM.yyyy");
            Date start = format.parse(dateStart);
            Date end = format.parse(dateEnd);
            String line;
            while ((line = reader.readLine()) != null) {
                if (start.before(addList(line).getDate()) && end.after(addList(line).getDate())) {
                    if (listSearch(addList(line), сurrency)) {
                        strTwo = addList(line).getUAH().replace(',', '.');
                        listDouble.add(Double.parseDouble(strTwo));
                    }
                }
            }
        }
    }

    private ListInfo addList(String line) throws Exception {
        SimpleDateFormat format = new SimpleDateFormat();
        format.applyPattern("dd.MM.yyyy");
        String[] str;
        str = line.split("\t");
        Date docDate = format.parse(str[0]);

        return new ListInfo(docDate, str[1], str[2], str[3], str[4], str[5], str[6]);
    }

    public ArrayList<Double> getListDouble() {
        return listDouble;
    }

    public boolean listSearch(ListInfo listInfo, String str) {
        return str.equals(listInfo.getLetterCode());
    }
}

