/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.artw.almanac.luozhuanghehun;
 
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
 
/**
 * 神煞合婚法
 *
 * @author luozhuang 大师♂罗莊
 */
public class LuozhuangshenshaHehun {
 
    enum sex {
 
        man,
        woman;
    }
    public final String[][] numsix = {
        //干支，纳音，岁数，男，女
        {"丙戌", "屋上土", "1", "3", "3"},
        {"乙酉", "泉中水", "2", "4", "2"},
        {"甲申", "泉中水", "3", "5", "1"},
        {"癸未", "杨柳木", "4", "6", "9"},
        {"壬午", "杨柳木", "5", "7", "8"},
        {"辛巳", "白蜡金", "6", "8", "7"},
        {"庚辰", "白蜡金", "7", "9", "6"},
        {"己卯", "城墙土", "8", "1", "5"},
        {"戊寅", "城墙土", "9", "2", "4"},
        {"丁丑", "涧下水", "10", "3", "3"},
        {"丙子", "涧下水", "11", "4", "2"},
        {"乙亥", "山头火", "12", "5", "1"},
        {"甲戌", "山头火", "13", "6", "9"},
        {"癸酉", "剑锋金", "14", "7", "8"},
        {"壬申", "剑锋金", "15", "8", "7"},
        {"辛未", "路旁土", "16", "9", "6"},
        {"庚午", "路旁土", "17", "1", "5"},
        {"己巳", "大林木", "18", "2", "4"},
        {"戊辰", "大林木", "19", "3", "3"},
        {"丁卯", "炉中火", "20", "4", "2"},
        {"丙寅", "炉中火", "21", "5", "1"},
        {"乙丑", "海中金", "22", "6", "9"},
        {"甲子", "海中金", "23", "7", "8"},
        {"癸亥", "大海水", "24", "8", "7"},
        {"壬戌", "大海水", "25", "9", "6"},
        {"辛酉", "石榴木", "26", "1", "5"},
        {"庚申", "石榴木", "27", "2", "4"},
        {"己未", "天上火", "28", "3", "3"},
        {"戊午", "天上火", "29", "4", "2"},
        {"丁巳", "沙中土", "30", "5", "1"},
        {"丙辰", "沙中土", "31", "6", "9"},
        {"乙卯", "大溪水", "32", "7", "8"},
        {"甲寅", "大溪水", "33", "8", "7"},
        {"癸丑", "桑松木", "34", "9", "6"},
        {"壬子", "桑松木", "35", "1", "5"},
        {"辛亥", "钗钏金", "36", "2", "4"},
        {"庚戌", "钗钏金", "37", "3", "3"},
        {"己酉", "大驿土", "38", "4", "2"},
        {"戊申", "大驿土", "39", "5", "1"},
        {"丁未", "天河水", "40", "6", "9"},
        {"丙午", "天河水", "41", "7", "8"},
        {"乙巳", "佛灯火", "42", "8", "7"},
        {"甲辰", "佛灯火", "43", "9", "6"},
        {"癸卯", "金箔金", "44", "1", "5"},
        {"壬寅", "金箔金", "45", "2", "4"},
        {"辛丑", "壁上土", "46", "3", "3"},
        {"庚子", "壁上土", "47", "4", "2"},
        {"己亥", "平地木", "48", "5", "1"},
        {"戊戌", "平地木", "49", "6", "9"},
        {"丁酉", "山下火", "50", "7", "8"},
        {"丙申", "山下火", "51", "8", "7"},
        {"乙未", "沙中金", "52", "9", "6"},
        {"甲午", "沙中金", "53", "1", "5"},
        {"癸巳", "长流水", "54", "2", "4"},
        {"壬辰", "长流水", "55", "3", "3"},
        {"辛卯", "松柏木", "56", "4", "2"},
        {"庚寅", "松柏木", "57", "5", "1"},
        {"己丑", "霹雳火", "58", "6", "9"},
        {"戊子", "霹雳火", "59", "7", "8"},
        {"丁亥", "屋上土", "60", "8", "7"},};
    public final String[][] shensha1 = {
        {"碎", "狼籍", "飞天", "八败", "大狼籍", "大败", "相冲", "劫煞", "咸池", "头蒂", "在嫁", "女扫男家", "男扫女家", "女破男家", "男破女家", "生年"},
        {"四", "三", "二", "六", "五", "四", "八", "四", "八", "五", "五", "十二", "正", "六", "二", "子"},
        {"十二", "七", "正", "九", "八", "七", "九", "正", "五", "六", "六", "九", "六", "四", "三", "丑"},
        {"八", "六", "五", "十二", "十一", "十", "十", "十", "二", "七", "七", "七", "四", "三", "十", "寅"},
        {"四", "六", "五", "十二", "十二", "十", "十一", "七", "十一", "八", "八", "八", "二", "正", "五", "卯"},
        {"十二", "二", "三", "六", "五", "四", "十二", "四", "八", "九", "九", "十二", "正", "六", "十二", "辰"},
        {"八", "二", "三", "六", "五", "四", "正", "正", "五", "十", "十", "九", "六", "四", "正", "巳"},
        {"四", "六", "五", "十二", "十一", "十", "八", "十", "二", "十一", "十一", "七", "四", "三", "八", "午"},
        {"十二", "十一", "十", "三", "二", "正", "九", "七", "十一", "十二", "十二", "八", "二", "正", "九", "未"},
        {"八", "七", "正", "三", "八", "七", "十", "四", "八", "正", "正", "十二", "正", "六", "四", "申"},
        {"四", "七", "正", "三", "八", "七", "十一", "正", "五", "六", "六", "九", "六", "四", "十一", "酉"},
        {"十二", "十一", "十", "九", "二", "正", "十二", "十", "二", "四", "四", "七", "四", "三", "六", "戌"},
        {"八", "十一", "十", "九", "二", "正", "正", "七", "十一", "二", "二", "八", "二", "正", "七", "亥"},};
    public final String[][] shensha2 = {
        {"旺门寡", "多厄", "女妨夫", "望门", "多厄", "男妨妻", "胞胎", "亡 神", "脚 踏", "绝房", "重婚", "寡宿", "孤辰", "小狼籍", "小狼籍", "生年"},
        {"十", "八九", "金", "七", "五六", "金", "二", "十", "四", "十一", "四", "九", "正", "九", "四", "子"},
        {"正", "十一十二", "无", "正", "二三", "木", "三", "七", "五", "二", "五", "九", "正", "十", "八", "丑"},
        {"四", "二三", "无", "十", "八九", "水", "四", "四", "六", "七", "六", "十二", "四", "十二", "十", "寅"},
        {"四", "五六", "无", "正", "十一十二", "火", "五", "正", "七", "十一", "七", "十二", "四", "九", "四", "卯"},
        {"七", "无", "土命", "四", "二三", "土", "六", "十", "八", "二", "八", "十二", "四", "九", "四", "辰"},
        {"无", "无", "无", "无", "无", "无", "七", "七", "九", "七", "九", "三", "七", "十二", "十", "巳"},
        {"无", "无", "无", "无", "无", "无", "二", "四", "十", "十一", "十", "三", "七", "六", "二", "午"},
        {"无", "无", "无", "无", "无", "无", "三", "正", "十一", "二", "十一", "三", "七", "十", "八", "未"},
        {"无", "无", "无", "无", "无", "无", "四", "十", "十二", "七", "十二", "六", "十", "十", "八", "申"},
        {"无", "无", "无", "无", "无", "无", "五", "七", "正", "十一", "正", "六", "十", "六", "二", "酉"},
        {"无", "无", "无", "无", "无", "无", "六", "四", "二", "二", "二", "六", "十", "六", "二", "戌"},
        {"无", "无", "无", "无", "无", "无", "七", "七", "三", "七", "三", "九", "正", "二", "十", "亥"},};
    final static String[] Zhi = {"子", "丑", "寅", "卯", "辰", "巳", "午", "未", "申", "酉", "戌", "亥"};
 
    /**
     *
     * @param man 男方年份字符串
     * @param woman 女方年份字符串
     * @return
     */
    public String hehun(String man, String woman) throws ParseException {
 
        Calendar mancal;
        Calendar womancal;
        try {
            mancal = getCalendarfromString(man, "yyyy-MM-dd HH");
            womancal = getCalendarfromString(woman, "yyyy-MM-dd HH");
        } catch (ParseException ex) {
            return "输入不正确" + ex.getMessage();
        }
 
        return man + shensha(mancal) + woman + shensha(womancal);
 
    }
 
    /**
     *
     * @param year 年份
     * @return 返回纳音
     */
    public String getnumsix(String year) {
 
        for (int i = 0; i < 60; i++) {
            if (year.equalsIgnoreCase(numsix[i][0])) {
 
 
                return numsix[i][1];
 
            }
        }
        return null;
 
    }
 
    public Calendar getCalendarfromString(String year, String DateFormat) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat(DateFormat);
        Calendar cal = Calendar.getInstance();
        cal.setTime(sdf.parse(year));
        return cal;
    }
 
    public String shensha(Calendar cal) throws ParseException {
 
        BaZi lunar = new BaZi(cal);
        System.out.println("此人农历的日期【" + lunar.toString() + "】");
        /**
         * 很多地方都是按照23：00-1：00为子时这是不对的。
         * 子时24.00－2.00,丑时2.00－4.00,寅时4.00－6.00,卯时6.00－8.00,
         * 辰时8.00－10.00,巳时10.00－12.00,午时12.00－14.00,未时14.00－16.00
         * 申时16.00－18.00,酉时18.00－20.00,戌时20.00－22.00,亥时22.00－24.00
         *
         */
        int time =cal.get(Calendar.HOUR_OF_DAY)/2;
        System.out.println("此人八字【" + lunar.getYearGanZhi(time) + "】"); //获取生肖
        System.out.println("此人的农历生肖【" + lunar.animalsYear() + "】"); String GanZhi = lunar.getYearGanZhi(time);
        //取八字
        String month = lunar.getMonth();
        //取表格中的中国农历月份 //取月份，其实原来表格不很合理，因为没有考虑闰月和节气问题 //正规算八字按节气算，即使闰月也不怕——大师♂罗莊 //建议按照文章中根据五行纳音或者属相来处理某些神煞 //这里要帮大家解决通用问题，我就把四柱和四柱五行纳音都取出来 //然后大家根据substring 取出五行和属相
        String[] tempchar = GanZhi.split(",");
        //我修改原来的，用,分割
        String ganziyear = tempchar[0];
        //年柱
         String ganzimonth = tempchar[1];
         //月柱
         String ganziday = tempchar[2];
         //日柱
         String ganzitime = tempchar[3];
         //时柱 //五行纳音
         String soundyear = getnumsix(ganziyear); String soundmonth = getnumsix(ganzimonth); String soundday = getnumsix(ganziday); String soundtime = getnumsix(ganzitime);
         //表格有14格 //其中属相从数组1-12，顺序就是子1，丑2这样 //使用者注意：本代码只是简单取表，没有考虑男女和多月分以及五行纳音
         int number = lunar.getYearindex() + 1; StringBuffer result = new StringBuffer(); for (int i = 0; i < 14; i++) { if (month.equalsIgnoreCase(shensha1[number][ i])) { result.append("此人犯" + shensha1[0][ i]); result.append("\n"); } if (month.equalsIgnoreCase(shensha2[number][ i])) { result.append("此人犯" + shensha2[0][ i]); result.append("\n"); } } return result.toString(); } /** * 字符串-》数字 * * @param year 字符串 * @return 字符串对应数字 * @throws NumberFormatException */ public int getnumber(String year) throws NumberFormatException { int yearnumber = Short.parseShort(year); return yearnumber; } /** * * * @return 传回农历 y年的属相 */ final String baiziYear(int year) { return Zhi[(year - 4) % 12]; } public static void main(String[] args) { LuozhuangshenshaHehun my = new LuozhuangshenshaHehun(); try { System.out.println(my.hehun("1977-5-2 22", "1988-5-2 4")); } catch (Exception e) { e.printStackTrace(); } }}
