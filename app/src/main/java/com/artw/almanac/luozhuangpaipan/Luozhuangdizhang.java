/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.artw.almanac.luozhuangpaipan;

import com.artw.almanac.luozhuangChineseEra.Lunar;
import com.artw.almanac.luozhuanghehun.LuozhuangshenshaHehun;

import java.text.ParseException;
import java.util.Calendar;


/**
 * 地藏和大运起始排盘
 *
 * @author luozhuang 大师♂罗莊
 */
public class Luozhuangdizhang {
 
    LuozhuangshenshaHehun myLuozhuangshenshaHehun = new LuozhuangshenshaHehun();
    luozhuanglvhehun myluozhuanglvhehun = new luozhuanglvhehun();
    Luozhuangpaipandayun myLuozhuangpaipandayun = new Luozhuangpaipandayun();
    LuozhuangshengSha myLuozhuangshengSha = new LuozhuangshengSha();
    luozhuangpaipanshisheng myluozhuangpaipanshisheng = new luozhuangpaipanshisheng();
 
    /**
     * 起大运周岁
     *
     * 大运排法: 阳男阴女顺排, 阴男阳女逆排, 离出生日最近的气节。 三天折合一岁计, 即一天折合四个月, 一小时折合五天. 计算时,
     * 如起运总数为18天, 被3除, 等于6, 即为6岁起大运. 如为19天, 则为6岁4个月起大运.
     *
     * @param bazi 八字阳历
     * @return
     */
    public long dayunkaishi(Calendar bazi, String nianzhu, luozhuanglvhehun.sex isman) {
 
        long returnvalue = 0;
        //甲、丙、戊、庚、壬之年为阳，乙、丁、己、辛、癸之年为阴
        //阴年生男子（或阳年生女子），大运逆行否则顺行
        if (LuozhuangcommonClass.tianganyinyang(nianzhu).equals("阳")) {
            if (isman == luozhuanglvhehun.sex.man) {//顺行
                returnvalue = Lunar.getaftersolarTerm(bazi.get(Calendar.YEAR), bazi.getTime());
            } else {
                returnvalue = Lunar.getbeforesolarTerm(bazi.get(Calendar.YEAR), bazi.getTime());
            }
 
        } else {
            if (isman == luozhuanglvhehun.sex.man) {
                returnvalue = Lunar.getbeforesolarTerm(bazi.get(Calendar.YEAR), bazi.getTime());
            } else {
                returnvalue = Lunar.getaftersolarTerm(bazi.get(Calendar.YEAR), bazi.getTime());
            }
        }
        returnvalue = returnvalue / 3;//我们就不细算到月日
 
        return returnvalue;
 
 
 
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
 
    public String paipan(Calendar cal, luozhuanglvhehun.sex isman) throws ParseException {
 
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
        
        
         //排食神生旺死绝
        //用日干 日支分别查找位于表的对应值
        //修改原文的类方法字段属性为public
        //我的表格均是按照顺序比如
        //十天干生旺死绝表 十神概念按顺序排列
        //查找某一行就可以查到对应值
        String[] shengsibiao = {"甲", "丙", "戊", "庚", "壬", "乙", "丁", "己", "辛", "癸"};//十天干生旺死绝表顺序
        //十天干生旺死绝表 用日干查表
 
        int shengsibiaoshunxu = myLuozhuangpaipandayun.getyuezhuStart(shengsibiao, ganziday.substring(0, 1));
        //十神表按顺序
        int shishengbiaoshunxu = myLuozhuangpaipandayun.getyuezhuStart(BaZi.Gan, ganziday.substring(0, 1));
 
        shengsibiaoshunxu++;
        shishengbiaoshunxu++;
 
 
        String[] DayunArray = myLuozhuangpaipandayun.Dayun(ganziyear, ganzimonth, isman);
        
         //排此人四柱十神生旺死绝
 
        //       比　　　　印　　　　日元　　　劫　　　<- 这里直接用四柱干支计算　
        //乾造　　庚　　　　己　　　　庚　　　　辛
        //　　　　辰　　　　卯　　　　午　　　　巳　　　　
        //藏干　　乙戊癸　　乙　　　　己丁　　　庚丙戊　 <- 这里直接用藏干计算
        //　　　　才枭伤　　才　　　　印官　　　比杀枭　 <- 这里直接用藏干计算
        //地势　　养　　　　胎　　　　沐浴　　　长生　　　<- 藏干不算生旺死绝
        //纳音　　白蜡金　　城墙土　　路旁土　　白蜡金
 
        System.out.println("此人四柱干支十神");
        System.out.print(myluozhuangpaipanshisheng.shisheng[shishengbiaoshunxu][myLuozhuangpaipandayun.getyuezhuStart(myluozhuangpaipanshisheng.shisheng[0], ganziyear.substring(0, 1))]); //十神表 用支查表
        System.out.print(" ");
        System.out.print(myluozhuangpaipanshisheng.shisheng[shishengbiaoshunxu][myLuozhuangpaipandayun.getyuezhuStart(myluozhuangpaipanshisheng.shisheng[0], ganzimonth.substring(0, 1))]); //十神表 用支查表
        System.out.print(" ");
        System.out.print("日主"); //日柱不计算！
        System.out.print(" ");
        System.out.print(myluozhuangpaipanshisheng.shisheng[shishengbiaoshunxu][myLuozhuangpaipandayun.getyuezhuStart(myluozhuangpaipanshisheng.shisheng[0], ganzitime.substring(0, 1))]); //十神表 用支查表
 
        System.out.println("");
 
        System.out.println("此人年藏干");
        String[] zhanggan = LuozhuangcommonClass.dizhuang(ganziyear.substring(1, 2));
        for (int i = 0; i < zhanggan.length; i++) {
 
            if (zhanggan[i] == null) {
                continue;
            }
            System.out.print(zhanggan[i]);
            System.out.print("");
            System.out.println(myluozhuangpaipanshisheng.shisheng[shishengbiaoshunxu][myLuozhuangpaipandayun.getyuezhuStart(myluozhuangpaipanshisheng.shisheng[0], zhanggan[i])]); //十神表 用支查表
 
        }
 
        zhanggan = LuozhuangcommonClass.dizhuang(ganzimonth.substring(1, 2));
        System.out.println("此人月藏干");
 
        for (int i = 0; i < zhanggan.length; i++) {
            if (zhanggan[i] == null) {
                continue;
            }
            System.out.print(zhanggan[i]);
            System.out.print("");
            System.out.println(myluozhuangpaipanshisheng.shisheng[shishengbiaoshunxu][myLuozhuangpaipandayun.getyuezhuStart(myluozhuangpaipanshisheng.shisheng[0], zhanggan[i])]); //十神表 用支查表
 
        }
 
        System.out.println("此人日藏干");
        zhanggan = LuozhuangcommonClass.dizhuang(ganziday.substring(1, 2));
        for (int i = 0; i < zhanggan.length; i++) {
            if (zhanggan[i] == null) {
                continue;
            }
            System.out.print(zhanggan[i]);
            System.out.print("");
            System.out.println(myluozhuangpaipanshisheng.shisheng[shishengbiaoshunxu][myLuozhuangpaipandayun.getyuezhuStart(myluozhuangpaipanshisheng.shisheng[0], zhanggan[i])]); //十神表 用支查表
 
        }
 
 
        System.out.println("此人时藏干");
        zhanggan = LuozhuangcommonClass.dizhuang(ganzitime.substring(1, 2));
        for (int i = 0; i < zhanggan.length; i++) {
            if (zhanggan[i] == null) {
                continue;
            }
            System.out.print(zhanggan[i]);
            System.out.print("");
            System.out.println(myluozhuangpaipanshisheng.shisheng[shishengbiaoshunxu][myLuozhuangpaipandayun.getyuezhuStart(myluozhuangpaipanshisheng.shisheng[0], zhanggan[i])]); //十神表 用支查表
 
        }
 
 
       
        String[] DayunArrayshengsi = new String[DayunArray.length];//大运十天干生旺死绝表
        String[] DayunArrayshisheng = new String[DayunArray.length];//大运十神表
 
 
        for (int i = 0; i < DayunArray.length; i++) {
            DayunArrayshengsi[i] = myluozhuangpaipanshisheng.shengwang[0][myLuozhuangpaipandayun.getyuezhuStart(myluozhuangpaipanshisheng.shengwang[shengsibiaoshunxu], DayunArray[i].substring(1, 2))]; //十天干生旺死绝表 用干查表
 
            DayunArrayshisheng[i] = myluozhuangpaipanshisheng.shisheng[shishengbiaoshunxu][myLuozhuangpaipandayun.getyuezhuStart(myluozhuangpaipanshisheng.shisheng[0], DayunArray[i].substring(0, 1))]; //十神表 用支查表
 
 
        }
        System.out.println("此人大运");
        myLuozhuangpaipandayun.pringst(DayunArray);
 
        System.out.println("此人起大运周岁：");
        System.out.println(dayunkaishi(cal, ganziyear.substring(0,1), isman) + "岁");
 
        System.out.println("此人大运生旺死绝");
        myLuozhuangpaipandayun.pringst(DayunArrayshengsi);
        System.out.println("此人大运十神");
        myLuozhuangpaipandayun.pringst(DayunArrayshisheng);
 
       
 
 
 
        return null;
    }
 
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ParseException {
        Luozhuangdizhang my = new Luozhuangdizhang();
        my.paipan("2013-3-14 20", luozhuanglvhehun.sex.man);
 
    }
}
