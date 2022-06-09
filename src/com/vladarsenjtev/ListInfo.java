package com.vladarsenjtev;

import java.util.Date;

public class ListInfo {
    private Date date;
    private String time;
    private String digitalCode;
    private String letterCode;
    private String Unit;
    private String currencyName;
    private String UAH;

    public ListInfo(Date date, String time, String digitalCode, String letterCode, String unit, String currencyName, String UAH) {
        this.date = date;
        this.time = time;
        this.digitalCode = digitalCode;
        this.letterCode = letterCode;
        Unit = unit;
        this.currencyName = currencyName;
        this.UAH = UAH;
    }

    public Date getDate() {
        return date;
    }


    public String getLetterCode() {
        return letterCode;
    }

    public String getUAH() {
        return UAH;
    }

    @Override
    public String toString() {
        return "ListInfo{" +
                "date='" + date + '\'' +
                ", time='" + time + '\'' +
                ", digitalCode='" + digitalCode + '\'' +
                ", letterCode='" + letterCode + '\'' +
                ", Unit='" + Unit + '\'' +
                ", currencyName='" + currencyName + '\'' +
                ", UAH='" + UAH + '\'' +
                '}';
    }
}
