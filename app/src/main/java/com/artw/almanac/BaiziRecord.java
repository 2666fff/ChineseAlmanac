package com.artw.almanac;

import com.artw.almanac.luozhuangChineseEra.Lunar;
import com.artw.almanac.luozhuanghehun.BaZi;

import java.util.Calendar;

class BaiziRecord {

    public Lunar lunaryue;

    public BaZi lunar;
    private String ganziyear;
    private String ganzimonth;
    private String ganziday;
    private String ganzitime;
    private String[] ganzhiString;

    public BaiziRecord(Calendar cal) {
        lunar = new BaZi(cal);
        lunaryue = new Lunar(cal.getTimeInMillis());
        int time = cal.get(Calendar.HOUR_OF_DAY) / 2;
        String GanZhi = lunar.getYearGanZhi(time);//取八字
        String[] tempchar = GanZhi.split(",");
        //我修改原来的，用,分割
        ganziyear = lunaryue.getCyclicaYear();//年柱
        ganzimonth = lunaryue.getCyclicaMonth();//月柱
        ganziday = lunaryue.getCyclicaDay();//日柱
        ganzitime = tempchar[3];//时柱
        ganzhiString = new String[9];
        ganzhiString[0] = "";
        ganzhiString[1] = ganziyear.substring(0, 1);//年干
        ganzhiString[2] = ganziyear.substring(1, 2);//年支
        ganzhiString[3] = ganzimonth.substring(0, 1);//月干
        ganzhiString[4] = ganzimonth.substring(1, 2);//月支
        ganzhiString[5] = ganziday.substring(0, 1);//日干
        ganzhiString[6] = ganziday.substring(1, 2);//日支
        ganzhiString[7] = ganzitime.substring(0, 1);//时干
        ganzhiString[8] = ganzitime.substring(1, 2);//时支
    }

    public String getGanziyear() {
        return ganziyear;
    }

    public void setGanziyear(String ganziyear) {
        this.ganziyear = ganziyear;
    }

    public String getGanzimonth() {
        return ganzimonth;
    }

    public void setGanzimonth(String ganzimonth) {
        this.ganzimonth = ganzimonth;
    }

    public String getGanziday() {
        return ganziday;
    }

    public void setGanziday(String ganziday) {
        this.ganziday = ganziday;
    }

    public String getGanzitime() {
        return ganzitime;
    }

    public void setGanzitime(String ganzitime) {
        this.ganzitime = ganzitime;
    }

    public String[] getganzhiString() {
        return ganzhiString;
    }

    public void setGanzhiString(String[] ganzhiString) {
        this.ganzhiString = ganzhiString;
    }
}
