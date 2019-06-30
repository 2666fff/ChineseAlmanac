/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.artw.almanac.luozhuangpaipan;
 
/**
 * 吕才合婚算法
 *
 * @author luozhuang 大师♂罗莊
 */
public class luozhuanglvhehun {
 
    enum sex {
 
        man,
        woman;
    }
    public final String[] jiazhi = {
        "甲子", "乙丑", "丙寅", "丁卯", "戊辰", "己巳", "庚午", "辛未", "壬申", "癸酉",
        "甲戌", "乙亥", "丙子", "丁丑", "戊寅", "己卯", "庚辰", "辛巳", "壬午", "癸未",
        "甲申", "乙酉", "丙戌", "丁亥", "戊子", "己丑", "庚寅", "辛卯", "壬辰", "癸巳",
        "甲午", "乙未", "丙申", "丁酉", "戊戌", "己亥", "庚子", "辛丑", "壬寅", "癸卯",
        "甲辰", "乙巳", "丙午", "丁未", "戊申", "己酉", "庚戌", "辛亥", "壬子", "癸丑",
        "甲寅", "乙卯", "丙辰", "丁巳", "戊午", "己未", "庚申", "辛酉", "壬戌", "癸亥"
    };
    //注意数组没有第5行和第5列
    public final String[][] resultarray = {
        {"伏位", "绝命", "天医", "生气", "六煞", "祸害", "五鬼", "延年"},
        {"绝命", "伏位", "祸害", "五鬼", "延年", "天医", "生气", "六煞"},
        {"天医", "祸害", "伏位", "延年", "五鬼", "绝命", "六煞", "生气"},
        {"生气", "五鬼", "延年", "伏位", "祸害", "六煞", "绝命", "天医"},
        {"六煞", "延年", "五鬼", "祸害", "伏位", "生气", "天医", "绝命"},
        {"祸害", "天医", "绝命", "六煞", "生气", "伏位", "延年", "五鬼"},
        {"五鬼", "生气", "六煞", "绝命", "天医", "延年", "伏位", "祸害"},
        {"延年", "六煞", "生气", "天医", "绝命", "五鬼", "祸害", "伏位"},};
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
 
    /**
     *
     * @param man 男方年份字符串
     * @param woman 女方年份字符串
     * @return
     */
    public String hehun(String man, String woman) {
        if (man.length() != 4 || woman.length() != 4) {
            return "输入不正确";
        }
 
        return peihun(man, woman);
 
    }
 
    public String peihun(String manyear, String womanyear) {
        return peihun(getnumber(manyear), getnumber(womanyear));
    }
 
    private String peihun(int manyear, int womanyear) {
        String mang = getnumsix(yearnumber(manyear), sex.man);
        String womang = getnumsix(yearnumber(womanyear), sex.woman);
        int man = getnumber(mang);
        int woman = getnumber(womang);
        
        
        //数组从0开始，而我们计算从1开始
        man--;
        woman--;
        //注意数组没有第5行和第5列
        if (man >= 5) {
            man--;
        }
        if (woman >= 5) {
            woman--;
        }
 
        //根据表格取结果
        return resultarray[man][woman];//顺序一样的
 
 
    }
 
    /**
     *
     * @param year 年份
     * @param isman 男的么
     * @return 返回宫挂数
     */
    public String getnumsix(String year, sex isman) {
 
        for (int i = 0; i < 60; i++) {
            if (year.equalsIgnoreCase(numsix[i][0])) {
 
                if (isman == sex.man) {
                    return numsix[i][3];
                } else {
                    return numsix[i][4];
                }
            }
        }
        return null;
 
    }
 
    /**
     * 字符串-》数字
     *
     * @param year 字符串
     * @return 字符串对应数字
     * @throws NumberFormatException
     */
    public int getnumber(String year) throws NumberFormatException {
 
        int yearnumber = Short.parseShort(year);
        return yearnumber;
 
    }
 
    /**
     * 年份取出年柱
     *
     * @param year 年数
     * @return 求的年份的干支
     */
    public String yearnumber(int year) {
 
        //1864年是甲子年，每隔六十年一个甲子
        int idx = (Math.abs(year - 1864)) % 60;
        //没有过春节的话那么年还算上一年的，此处求的年份的干支
        String result = jiazhi[idx];
        return result;
 
    }
 
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        luozhuanglvhehun my = new luozhuanglvhehun();
        String result = my.hehun("1947", "1853");
 
        System.out.println(result);
        
    }
}
