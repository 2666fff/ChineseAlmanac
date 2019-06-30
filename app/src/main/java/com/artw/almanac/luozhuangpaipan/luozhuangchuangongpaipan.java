/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.artw.almanac.luozhuangpaipan;

import com.artw.almanac.luozhuanghehun.LuozhuangshenshaHehun;

import java.text.ParseException;
import java.util.Calendar;


/**
 * 串宫大法排盘
 *
 * @author luozhuang 大师♂罗莊
 */
public class luozhuangchuangongpaipan {
 
    LuozhuangshenshaHehun myLuozhuangshenshaHehun = new LuozhuangshenshaHehun();
    luozhuanglvhehun myluozhuanglvhehun = new luozhuanglvhehun();
    Luozhuangpaipandayun myLuozhuangpaipandayun = new Luozhuangpaipandayun();
 
    /**
     * 串宫大法日干对
     *
     * @param paramString2 要对比的地支
     * @param paramString1 此人日干
     * @return
     */
    public static String chuangongtiangan(String paramString1, String paramString2) {
        if (paramString1.equals("子")) {
            if (paramString2.equals("甲")) {
                return "丧门";
            }
            if (paramString2.equals("乙")) {
                return "六合";
            }
            if (paramString2.equals("丙")) {
                return "小耗";
            }
            if (paramString2.equals("丁")) {
                return "大耗";
            }
            if (paramString2.equals("戊")) {
                return "吊客";
            }
            if (paramString2.equals("己")) {
                return "青龙";
            }
            if (paramString2.equals("庚")) {
                return "白虎";
            }
            if (paramString2.equals("辛")) {
                return "贵神";
            }
            if (paramString2.equals("壬")) {
                return "病符";
            }
            if (paramString2.equals("癸")) {
                return "太岁";
            }
        }
        if (paramString1.equals("丑")) {
            if (paramString2.equals("甲")) {
                return "青龙";
            }
            if (paramString2.equals("乙")) {
                return "丧门";
            }
            if (paramString2.equals("丙")) {
                return "官符";
            }
            if (paramString2.equals("丁")) {
                return "小耗";
            }
            if (paramString2.equals("戊")) {
                return "贵神";
            }
            if (paramString2.equals("己")) {
                return "太岁";
            }
            if (paramString2.equals("庚")) {
                return "朱雀";
            }
            if (paramString2.equals("辛")) {
                return "白虎";
            }
            if (paramString2.equals("壬")) {
                return "吊客";
            }
            if (paramString2.equals("癸")) {
                return "病符";
            }
        }
        if (paramString1.equals("寅")) {
            if (paramString2.equals("甲")) {
                return "太岁";
            }
            if (paramString2.equals("乙")) {
                return "青龙";
            }
            if (paramString2.equals("丙")) {
                return "六合";
            }
            if (paramString2.equals("丁")) {
                return "官符";
            }
            if (paramString2.equals("戊")) {
                return "白虎";
            }
            if (paramString2.equals("己")) {
                return "病符";
            }
            if (paramString2.equals("庚")) {
                return "大耗";
            }
            if (paramString2.equals("辛")) {
                return "朱雀";
            }
            if (paramString2.equals("壬")) {
                return "贵神";
            }
            if (paramString2.equals("癸")) {
                return "吊客";
            }
        }
        if (paramString1.equals("卯")) {
            if (paramString2.equals("甲")) {
                return "病符";
            }
            if (paramString2.equals("乙")) {
                return "太岁";
            }
            if (paramString2.equals("丙")) {
                return "丧门";
            }
            if (paramString2.equals("丁")) {
                return "六合";
            }
            if (paramString2.equals("戊")) {
                return "朱雀";
            }
            if (paramString2.equals("己")) {
                return "吊客";
            }
            if (paramString2.equals("庚")) {
                return "小耗";
            }
            if (paramString2.equals("辛")) {
                return "大耗";
            }
            if (paramString2.equals("壬")) {
                return "白虎";
            }
            if (paramString2.equals("癸")) {
                return "贵神";
            }
        }
        if (paramString1.equals("辰")) {
            if (paramString2.equals("甲")) {
                return "吊客";
            }
            if (paramString2.equals("乙")) {
                return "病符";
            }
            if (paramString2.equals("丙")) {
                return "青龙";
            }
            if (paramString2.equals("丁")) {
                return "丧门";
            }
            if (paramString2.equals("戊")) {
                return "大耗";
            }
            if (paramString2.equals("己")) {
                return "贵神";
            }
            if (paramString2.equals("庚")) {
                return "官符";
            }
            if (paramString2.equals("辛")) {
                return "小耗";
            }
            if (paramString2.equals("壬")) {
                return "朱雀";
            }
            if (paramString2.equals("癸")) {
                return "白虎";
            }
        }
        if (paramString1.equals("巳")) {
            if (paramString2.equals("甲")) {
                return "贵神";
            }
            if (paramString2.equals("乙")) {
                return "吊客";
            }
            if (paramString2.equals("丙")) {
                return "太岁";
            }
            if (paramString2.equals("丁")) {
                return "青龙";
            }
            if (paramString2.equals("戊")) {
                return "小耗";
            }
            if (paramString2.equals("己")) {
                return "白虎";
            }
            if (paramString2.equals("庚")) {
                return "六合";
            }
            if (paramString2.equals("辛")) {
                return "官符";
            }
            if (paramString2.equals("壬")) {
                return "大耗";
            }
            if (paramString2.equals("癸")) {
                return "朱雀";
            }
        }
        if (paramString1.equals("午")) {
            if (paramString2.equals("甲")) {
                return "白虎";
            }
            if (paramString2.equals("乙")) {
                return "贵神";
            }
            if (paramString2.equals("丙")) {
                return "病符";
            }
            if (paramString2.equals("丁")) {
                return "太岁";
            }
            if (paramString2.equals("戊")) {
                return "官符";
            }
            if (paramString2.equals("己")) {
                return "朱雀";
            }
            if (paramString2.equals("庚")) {
                return "丧门";
            }
            if (paramString2.equals("辛")) {
                return "六合";
            }
            if (paramString2.equals("壬")) {
                return "小耗";
            }
            if (paramString2.equals("癸")) {
                return "大耗";
            }
        }
        if (paramString1.equals("未")) {
            if (paramString2.equals("甲")) {
                return "朱雀";
            }
            if (paramString2.equals("乙")) {
                return "白虎";
            }
            if (paramString2.equals("丙")) {
                return "吊客";
            }
            if (paramString2.equals("丁")) {
                return "病符";
            }
            if (paramString2.equals("戊")) {
                return "六合";
            }
            if (paramString2.equals("己")) {
                return "大耗";
            }
            if (paramString2.equals("庚")) {
                return "青龙";
            }
            if (paramString2.equals("辛")) {
                return "丧门";
            }
            if (paramString2.equals("壬")) {
                return "官符";
            }
            if (paramString2.equals("癸")) {
                return "小耗";
            }
        }
        if (paramString1.equals("申")) {
            if (paramString2.equals("甲")) {
                return "大耗";
            }
            if (paramString2.equals("乙")) {
                return "朱雀";
            }
            if (paramString2.equals("丙")) {
                return "贵神";
            }
            if (paramString2.equals("丁")) {
                return "吊客";
            }
            if (paramString2.equals("戊")) {
                return "丧门";
            }
            if (paramString2.equals("己")) {
                return "小耗";
            }
            if (paramString2.equals("庚")) {
                return "太岁";
            }
            if (paramString2.equals("辛")) {
                return "青龙";
            }
            if (paramString2.equals("壬")) {
                return "六合";
            }
            if (paramString2.equals("癸")) {
                return "官符";
            }
        }
        if (paramString1.equals("酉")) {
            if (paramString2.equals("甲")) {
                return "小耗";
            }
            if (paramString2.equals("乙")) {
                return "大耗";
            }
            if (paramString2.equals("丙")) {
                return "白虎";
            }
            if (paramString2.equals("丁")) {
                return "贵神";
            }
            if (paramString2.equals("戊")) {
                return "青龙";
            }
            if (paramString2.equals("己")) {
                return "官符";
            }
            if (paramString2.equals("庚")) {
                return "病符";
            }
            if (paramString2.equals("辛")) {
                return "太岁";
            }
            if (paramString2.equals("壬")) {
                return "丧门";
            }
            if (paramString2.equals("癸")) {
                return "六合";
            }
        }
        if (paramString1.equals("戌")) {
            if (paramString2.equals("甲")) {
                return "官符";
            }
            if (paramString2.equals("乙")) {
                return "小耗";
            }
            if (paramString2.equals("丙")) {
                return "朱雀";
            }
            if (paramString2.equals("丁")) {
                return "白虎";
            }
            if (paramString2.equals("戊")) {
                return "太岁";
            }
            if (paramString2.equals("己")) {
                return "六合";
            }
            if (paramString2.equals("庚")) {
                return "吊客";
            }
            if (paramString2.equals("辛")) {
                return "病符";
            }
            if (paramString2.equals("壬")) {
                return "青龙";
            }
            if (paramString2.equals("癸")) {
                return "丧门";
            }
        }
        if (paramString1.equals("亥")) {
            if (paramString2.equals("甲")) {
                return "六合";
            }
            if (paramString2.equals("乙")) {
                return "官符";
            }
            if (paramString2.equals("丙")) {
                return "大耗";
            }
            if (paramString2.equals("丁")) {
                return "朱雀";
            }
            if (paramString2.equals("戊")) {
                return "病符";
            }
            if (paramString2.equals("己")) {
                return "丧门";
            }
            if (paramString2.equals("庚")) {
                return "贵神";
            }
            if (paramString2.equals("辛")) {
                return "吊客";
            }
            if (paramString2.equals("壬")) {
                return "太岁";
            }
            if (paramString2.equals("癸")) {
                return "青龙";
            }
        }
        return "";
    }
 
    //串宫大法地支对
    /**
     *
     * @param paramString1 要对比的地支
     * @param paramString2 此人日支
     * @return
     */
    public static String chuangongdizhi(String paramString1, String paramString2) {
        if (paramString1.equals("子")) {
            if (paramString2.equals("子")) {
                return "太岁";
            }
            if (paramString2.equals("丑")) {
                return "青龙";
            }
            if (paramString2.equals("寅")) {
                return "丧门";
            }
            if (paramString2.equals("卯")) {
                return "六合";
            }
            if (paramString2.equals("辰")) {
                return "官符";
            }
            if (paramString2.equals("巳")) {
                return "小耗";
            }
            if (paramString2.equals("午")) {
                return "大耗";
            }
            if (paramString2.equals("未")) {
                return "朱雀";
            }
            if (paramString2.equals("申")) {
                return "白虎";
            }
            if (paramString2.equals("酉")) {
                return "贵神";
            }
            if (paramString2.equals("戌")) {
                return "吊客";
            }
            if (paramString2.equals("亥")) {
                return "病符";
            }
        }
        if (paramString1.equals("丑")) {
            if (paramString2.equals("丑")) {
                return "太岁";
            }
            if (paramString2.equals("寅")) {
                return "青龙";
            }
            if (paramString2.equals("卯")) {
                return "丧门";
            }
            if (paramString2.equals("辰")) {
                return "六合";
            }
            if (paramString2.equals("巳")) {
                return "官符";
            }
            if (paramString2.equals("午")) {
                return "小耗";
            }
            if (paramString2.equals("未")) {
                return "大耗";
            }
            if (paramString2.equals("申")) {
                return "朱雀";
            }
            if (paramString2.equals("酉")) {
                return "白虎";
            }
            if (paramString2.equals("戌")) {
                return "贵神";
            }
            if (paramString2.equals("亥")) {
                return "吊客";
            }
            if (paramString2.equals("子")) {
                return "病符";
            }
        }
        if (paramString1.equals("寅")) {
            if (paramString2.equals("寅")) {
                return "太岁";
            }
            if (paramString2.equals("卯")) {
                return "青龙";
            }
            if (paramString2.equals("辰")) {
                return "丧门";
            }
            if (paramString2.equals("巳")) {
                return "六合";
            }
            if (paramString2.equals("午")) {
                return "官符";
            }
            if (paramString2.equals("未")) {
                return "小耗";
            }
            if (paramString2.equals("申")) {
                return "大耗";
            }
            if (paramString2.equals("酉")) {
                return "朱雀";
            }
            if (paramString2.equals("戌")) {
                return "白虎";
            }
            if (paramString2.equals("亥")) {
                return "贵神";
            }
            if (paramString2.equals("子")) {
                return "吊客";
            }
            if (paramString2.equals("丑")) {
                return "病符";
            }
        }
        if (paramString1.equals("卯")) {
            if (paramString2.equals("卯")) {
                return "太岁";
            }
            if (paramString2.equals("辰")) {
                return "青龙";
            }
            if (paramString2.equals("巳")) {
                return "丧门";
            }
            if (paramString2.equals("午")) {
                return "六合";
            }
            if (paramString2.equals("未")) {
                return "官符";
            }
            if (paramString2.equals("申")) {
                return "小耗";
            }
            if (paramString2.equals("酉")) {
                return "大耗";
            }
            if (paramString2.equals("戌")) {
                return "朱雀";
            }
            if (paramString2.equals("亥")) {
                return "白虎";
            }
            if (paramString2.equals("子")) {
                return "贵神";
            }
            if (paramString2.equals("丑")) {
                return "吊客";
            }
            if (paramString2.equals("寅")) {
                return "病符";
            }
        }
        if (paramString1.equals("辰")) {
            if (paramString2.equals("辰")) {
                return "太岁";
            }
            if (paramString2.equals("巳")) {
                return "青龙";
            }
            if (paramString2.equals("午")) {
                return "丧门";
            }
            if (paramString2.equals("未")) {
                return "六合";
            }
            if (paramString2.equals("申")) {
                return "官符";
            }
            if (paramString2.equals("酉")) {
                return "小耗";
            }
            if (paramString2.equals("戌")) {
                return "大耗";
            }
            if (paramString2.equals("亥")) {
                return "朱雀";
            }
            if (paramString2.equals("子")) {
                return "白虎";
            }
            if (paramString2.equals("丑")) {
                return "贵神";
            }
            if (paramString2.equals("寅")) {
                return "吊客";
            }
            if (paramString2.equals("卯")) {
                return "病符";
            }
        }
        if (paramString1.equals("巳")) {
            if (paramString2.equals("巳")) {
                return "太岁";
            }
            if (paramString2.equals("午")) {
                return "青龙";
            }
            if (paramString2.equals("未")) {
                return "丧门";
            }
            if (paramString2.equals("申")) {
                return "六合";
            }
            if (paramString2.equals("酉")) {
                return "官符";
            }
            if (paramString2.equals("戌")) {
                return "小耗";
            }
            if (paramString2.equals("亥")) {
                return "大耗";
            }
            if (paramString2.equals("子")) {
                return "朱雀";
            }
            if (paramString2.equals("丑")) {
                return "白虎";
            }
            if (paramString2.equals("寅")) {
                return "贵神";
            }
            if (paramString2.equals("卯")) {
                return "吊客";
            }
            if (paramString2.equals("辰")) {
                return "病符";
            }
        }
        if (paramString1.equals("午")) {
            if (paramString2.equals("午")) {
                return "太岁";
            }
            if (paramString2.equals("未")) {
                return "青龙";
            }
            if (paramString2.equals("申")) {
                return "丧门";
            }
            if (paramString2.equals("酉")) {
                return "六合";
            }
            if (paramString2.equals("戌")) {
                return "官符";
            }
            if (paramString2.equals("亥")) {
                return "小耗";
            }
            if (paramString2.equals("子")) {
                return "大耗";
            }
            if (paramString2.equals("丑")) {
                return "朱雀";
            }
            if (paramString2.equals("寅")) {
                return "白虎";
            }
            if (paramString2.equals("卯")) {
                return "贵神";
            }
            if (paramString2.equals("辰")) {
                return "吊客";
            }
            if (paramString2.equals("巳")) {
                return "病符";
            }
        }
        if (paramString1.equals("未")) {
            if (paramString2.equals("未")) {
                return "太岁";
            }
            if (paramString2.equals("申")) {
                return "青龙";
            }
            if (paramString2.equals("酉")) {
                return "丧门";
            }
            if (paramString2.equals("戌")) {
                return "六合";
            }
            if (paramString2.equals("亥")) {
                return "官符";
            }
            if (paramString2.equals("子")) {
                return "小耗";
            }
            if (paramString2.equals("丑")) {
                return "大耗";
            }
            if (paramString2.equals("寅")) {
                return "朱雀";
            }
            if (paramString2.equals("卯")) {
                return "白虎";
            }
            if (paramString2.equals("辰")) {
                return "贵神";
            }
            if (paramString2.equals("巳")) {
                return "吊客";
            }
            if (paramString2.equals("午")) {
                return "病符";
            }
        }
        if (paramString1.equals("申")) {
            if (paramString2.equals("申")) {
                return "太岁";
            }
            if (paramString2.equals("酉")) {
                return "青龙";
            }
            if (paramString2.equals("戌")) {
                return "丧门";
            }
            if (paramString2.equals("亥")) {
                return "六合";
            }
            if (paramString2.equals("子")) {
                return "官符";
            }
            if (paramString2.equals("丑")) {
                return "小耗";
            }
            if (paramString2.equals("寅")) {
                return "大耗";
            }
            if (paramString2.equals("卯")) {
                return "朱雀";
            }
            if (paramString2.equals("辰")) {
                return "白虎";
            }
            if (paramString2.equals("巳")) {
                return "贵神";
            }
            if (paramString2.equals("午")) {
                return "吊客";
            }
            if (paramString2.equals("未")) {
                return "病符";
            }
        }
        if (paramString1.equals("酉")) {
            if (paramString2.equals("酉")) {
                return "太岁";
            }
            if (paramString2.equals("戌")) {
                return "青龙";
            }
            if (paramString2.equals("亥")) {
                return "丧门";
            }
            if (paramString2.equals("子")) {
                return "六合";
            }
            if (paramString2.equals("丑")) {
                return "官符";
            }
            if (paramString2.equals("寅")) {
                return "小耗";
            }
            if (paramString2.equals("卯")) {
                return "大耗";
            }
            if (paramString2.equals("辰")) {
                return "朱雀";
            }
            if (paramString2.equals("巳")) {
                return "白虎";
            }
            if (paramString2.equals("午")) {
                return "贵神";
            }
            if (paramString2.equals("未")) {
                return "吊客";
            }
            if (paramString2.equals("申")) {
                return "病符";
            }
        }
        if (paramString1.equals("戌")) {
            if (paramString2.equals("戌")) {
                return "太岁";
            }
            if (paramString2.equals("亥")) {
                return "青龙";
            }
            if (paramString2.equals("子")) {
                return "丧门";
            }
            if (paramString2.equals("丑")) {
                return "六合";
            }
            if (paramString2.equals("寅")) {
                return "官符";
            }
            if (paramString2.equals("卯")) {
                return "小耗";
            }
            if (paramString2.equals("辰")) {
                return "大耗";
            }
            if (paramString2.equals("巳")) {
                return "朱雀";
            }
            if (paramString2.equals("午")) {
                return "白虎";
            }
            if (paramString2.equals("未")) {
                return "贵神";
            }
            if (paramString2.equals("申")) {
                return "吊客";
            }
            if (paramString2.equals("酉")) {
                return "病符";
            }
        }
        if (paramString1.equals("亥")) {
            if (paramString2.equals("亥")) {
                return "太岁";
            }
            if (paramString2.equals("子")) {
                return "青龙";
            }
            if (paramString2.equals("丑")) {
                return "丧门";
            }
            if (paramString2.equals("寅")) {
                return "六合";
            }
            if (paramString2.equals("卯")) {
                return "官符";
            }
            if (paramString2.equals("辰")) {
                return "小耗";
            }
            if (paramString2.equals("巳")) {
                return "大耗";
            }
            if (paramString2.equals("午")) {
                return "朱雀";
            }
            if (paramString2.equals("未")) {
                return "白虎";
            }
            if (paramString2.equals("申")) {
                return "贵神";
            }
            if (paramString2.equals("酉")) {
                return "吊客";
            }
            if (paramString2.equals("戌")) {
                return "病符";
            }
        }
        return "";
    }
 
    /**
     *
     * @param man 生日 yyyy-MM-dd HH
     * @return
     * @throws ParseException
     */
    public String paipan(String man, luozhuanglvhehun.sex isman) throws ParseException {
 
        Calendar mancal;
 
        try {
            mancal = myLuozhuangshenshaHehun.getCalendarfromString(man, "yyyy-MM-dd HH");
            //原来的private 方法改了下
        } catch (ParseException ex) {
            return "输入不正确" + ex.getMessage();
        }
 
        return paipan(mancal, isman);
 
    }
 
    private String paipan(Calendar cal, luozhuanglvhehun.sex isman) throws ParseException {
 
        BaZi lunar = new BaZi(cal);
        System.out.println("此人农历的日期【" + lunar.toString() + "】");
        /**
         * 很多地方都是按照23：00-1：00为子时这是不对的。
         * 子时24.00－2.00,丑时2.00－4.00,寅时4.00－6.00,卯时6.00－8.00,
         * 辰时8.00－10.00,巳时10.00－12.00,午时12.00－14.00,未时14.00－16.00
         * 申时16.00－18.00,酉时18.00－20.00,戌时20.00－22.00,亥时22.00－24.00
         *
         */
        int time = cal.get(Calendar.HOUR_OF_DAY) / 2;
        System.out.println("此人八字【" + lunar.getYearGanZhi(time) + "】");
        //获取生肖
        System.out.println("此人的农历生肖【" + lunar.animalsYear() + "】");
 
 
 
        String GanZhi = lunar.getYearGanZhi(time);//取八字
        String[] tempchar = GanZhi.split(",");
        //我修改原来的，用,分割
        String ganziyear = tempchar[0];//年柱
        String ganzimonth = tempchar[1];//月柱
        String ganziday = tempchar[2];//日柱
        String ganzitime = tempchar[3];//时柱
        //五行纳音
        System.out.println("");
        String soundyear = myLuozhuangshenshaHehun.getnumsix(ganziyear);
        String soundmonth = myLuozhuangshenshaHehun.getnumsix(ganzimonth);
        String soundday = myLuozhuangshenshaHehun.getnumsix(ganziday);
        String soundtime = myLuozhuangshenshaHehun.getnumsix(ganzitime);
        System.out.println("五行纳音");
        System.out.print(soundyear);
        System.out.print(" ");
        System.out.print(soundmonth);
        System.out.print(" ");
        System.out.print(soundday);
        System.out.print(" ");
        System.out.print(soundtime);
        System.out.print(" ");
        System.out.println("");
        String[] DayunArray = myLuozhuangpaipandayun.Dayun(ganziyear, ganzimonth, isman);
    
 
        //串宫大法是排命局时候用日柱
        //排大运的时候用大运作为判断
        //baidu 文档：
        //庚戌  己卯  甲寅  丙寅
        //排命局时候用甲寅
        //大运：庚辰，那么以辰起太岁配命局
        process(ganziyear, ganzimonth, ganziday, ganzitime, ganziday);
        System.out.println("此人大运");
        myLuozhuangpaipandayun.pringst(DayunArray);
 
        for (int i = 0; i < DayunArray.length; i++) {
            System.out.println("大运");
            System.out.println(DayunArray[i]);
            process(ganziyear, ganzimonth, ganziday, ganzitime, DayunArray[i]);
        }
 
 
        return null;
    }
 
    private void process(String ganziyear,
            String ganzimonth,
            String ganziday,
            String ganzitime, String panding) {
        //串宫大法和十神生旺一样分别用日柱的天干地支对其他对
        //那么就把每个的天干地支带入函数就可以了
        //注意串宫大法只用日支对其他天干地支,请大家不要和十神弄混
 
        //panding 作为判断的柱
        //串宫大法是排命局时候用日柱
        //排大运的时候用大运作为判断
        //baidu 文档：
        //庚戌  己卯  甲寅  丙寅
        //排命局时候用甲寅
        //大运：庚辰，那么以辰起太岁配命局
        System.out.print("此人年柱:");
 
        System.out.print(chuangongtiangan(panding.substring(1, 2), ganziyear.substring(0, 1)));
        System.out.print(chuangongdizhi(panding.substring(1, 2), ganziyear.substring(1, 2)));
        System.out.println("");
 
        System.out.print("此人月柱:");
        System.out.print(chuangongtiangan(panding.substring(1, 2), ganzimonth.substring(0, 1)));
        System.out.print(chuangongdizhi(panding.substring(1, 2), ganzimonth.substring(1, 2)));
        System.out.println("");
 
        System.out.print("此人日柱:");
        System.out.print(chuangongtiangan(panding.substring(1, 2), ganziday.substring(0, 1)));
        System.out.print(chuangongdizhi(panding.substring(1, 2), ganziday.substring(1, 2)));
        System.out.println("");
 
        System.out.print("此人时柱:");
        System.out.print(chuangongtiangan(panding.substring(1, 2), ganzitime.substring(0, 1)));
        System.out.print(chuangongdizhi(panding.substring(1, 2), ganzitime.substring(1, 2)));
        System.out.println("");
    }
 
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ParseException {
        luozhuangchuangongpaipan my = new luozhuangchuangongpaipan();
        my.paipan("2000-3-13 11", luozhuanglvhehun.sex.man);
 
    }
}
