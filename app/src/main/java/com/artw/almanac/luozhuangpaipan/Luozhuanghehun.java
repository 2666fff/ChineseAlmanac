/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.artw.almanac.luozhuangpaipan;
 
/**
 * 本命卦合婚
 *
 * @author luozhuang 大师♂罗莊
 */
public class Luozhuanghehun {
 
    enum sex {
 
        man,
        woman;
    }
 
    enum basicstring {
 
        坎, 坤, 震, 巽, 乾, 兑, 艮, 离;
    }
 
    public String hehun(String man, String woman) {
        if (man.length() != 4 || woman.length() != 4) {
            return "输入不正确";
        }
 
        return  peihun(getnumber(man,sex.man), getnumber(woman,sex.woman));
 
    }
 
    public  String peihun(String man, String woman) {
      return  peihun(getnumber(man,sex.man), getnumber(woman,sex.woman));
    }
    private String peihun(int man, int woman) {
        basicstring mang = basicsnumber(man, sex.man);
        basicstring womang = basicsnumber(woman, sex.woman);
 
        //    乾命男配艮命女 ，艮命男配乾命女；
        if (mang == basicstring.乾 && womang == basicstring.艮) {
            return "延年婚";
        }
 
 
        if (womang == basicstring.乾 && mang == basicstring.艮) {
            return "延年婚";
        }
 
        //    震命男配坎命女，坎命男配震命女；
        if (mang == basicstring.震 && womang == basicstring.坎) {
            return "延年婚";
        }
        if (womang == basicstring.震 && mang == basicstring.坎) {
            return "延年婚";
        }
 
        //    兑命男配坤命女，坤命男配兑命女；
        if (mang == basicstring.兑 && womang == basicstring.坤) {
            return "延年婚";
        }
        if (womang == basicstring.兑 && mang == basicstring.坤) {
            return "延年婚";
        }
 
        //    巽命男配离命女，离命男配巽命女；
        if (mang == basicstring.巽 && womang == basicstring.离) {
            return "延年婚";
        }
        if (womang == basicstring.巽 && mang == basicstring.离) {
            return "延年婚";
        }
 
        //       坎命男配巽命女，巽命男配坎命女；
        if (mang == basicstring.坎 && womang == basicstring.巽) {
            return "生气婚";
        }
        if (womang == basicstring.坎 && mang == basicstring.巽) {
            return "生气婚";
        }
 
        //       震命男配离命女，离命女配震命男；
        if (mang == basicstring.震 && womang == basicstring.离) {
            return "生气婚";
        }
        if (womang == basicstring.震 && mang == basicstring.离) {
            return "生气婚";
        }
 
 
        //       乾命男配兑命女，兑命男配乾命女；
        if (mang == basicstring.乾 && womang == basicstring.兑) {
            return "生气婚";
        }
        if (womang == basicstring.乾 && mang == basicstring.兑) {
            return "生气婚";
        }
 
 
        //       艮命男配坤命女，坤命男配艮命女。
        if (mang == basicstring.艮 && womang == basicstring.坤) {
            return "生气婚";
        }
        if (womang == basicstring.艮 && mang == basicstring.坤) {
            return "生气婚";
        }
 
 
 
        //        坎命男配艮命女，艮命男配坎命女；
        if (mang == basicstring.艮 && womang == basicstring.坎) {
            return "天医婚";
        }
        if (womang == basicstring.艮 && mang == basicstring.坎) {
            return "天医婚";
        }
 
 
        //       坤命男配巽命女，巽命男配坤命女；
        if (mang == basicstring.坤 && womang == basicstring.巽) {
            return "天医婚";
        }
        if (womang == basicstring.坤 && mang == basicstring.巽) {
            return "天医婚";
        }
 
 
        //     震命男配乾命女，乾命男配震命女；
        if (mang == basicstring.震 && womang == basicstring.乾) {
            return "天医婚";
        }
        if (womang == basicstring.震 && mang == basicstring.乾) {
            return "天医婚";
        }
 
        //     兑命男配离命女，离命男配兑命女。
        if (mang == basicstring.兑 && womang == basicstring.离) {
            return "天医婚";
        }
        if (womang == basicstring.兑 && mang == basicstring.离) {
            return "天医婚";
        }
 
        //     坎命男配乾命女，乾命男配坎命女；
        if (mang == basicstring.坎 && womang == basicstring.乾) {
            return "六煞婚";
        }
        if (womang == basicstring.坎 && mang == basicstring.乾) {
            return "六煞婚";
        }
 
 
        //     震命男配艮命女，艮命男配震命女；
        if (mang == basicstring.震 && womang == basicstring.艮) {
            return "六煞婚";
        }
        if (womang == basicstring.震 && mang == basicstring.艮) {
            return "六煞婚";
        }
 
 
        //     兑命男配巽命女，巽命男配兑命女；
        if (mang == basicstring.兑 && womang == basicstring.巽) {
            return "六煞婚";
        }
        if (womang == basicstring.兑 && mang == basicstring.巽) {
            return "六煞婚";
        }
 
 
 
        //     离命男配坤命女，坤命男配离命女。
        if (mang == basicstring.离 && womang == basicstring.坤) {
            return "六煞婚";
        }
        if (womang == basicstring.离 && mang == basicstring.坤) {
            return "六煞婚";
        }
 
 
        //     坎命男配离命女，离命男配坎命女；
        if (mang == basicstring.坎 && womang == basicstring.离) {
            return "祸害婚";
        }
        if (womang == basicstring.坎 && mang == basicstring.离) {
            return "祸害婚";
        }
 
        //巽命男配震命女，震命男配巽命女；
        if (mang == basicstring.巽 && womang == basicstring.震) {
            return "祸害婚";
        }
        if (womang == basicstring.巽 && mang == basicstring.震) {
            return "祸害婚";
        }
 
        //乾命男配坤命女，坤命男配乾命女；
        if (mang == basicstring.乾 && womang == basicstring.坤) {
            return "祸害婚";
        }
        if (womang == basicstring.乾 && mang == basicstring.坤) {
            return "祸害婚";
        }
 
 
        //兑命男配巽命女，巽命男配兑命女；
        if (mang == basicstring.兑 && womang == basicstring.巽) {
            return "祸害婚";
        }
        if (womang == basicstring.兑 && mang == basicstring.巽) {
            return "祸害婚";
        }
 
 
//           坎命男配坎命女，乾命男配乾命女；
//
//    坤命男配坤命女，兑命男配兑命女；
//
//    震命男配震命女，艮命男配艮命女；
//
//    巽命男配巽命女，离命男配离命女。
 
        if (mang == womang) {
            return "伏位婚";
        }
 
        // 坎命男配兑命女，兑命男配坎命女；
        if (mang == basicstring.坎 && womang == basicstring.兑) {
            return "五鬼婚";
        }
        if (womang == basicstring.坎 && mang == basicstring.兑) {
            return "五鬼婚";
        }
 
 
        // 震命男配坤命女，坤命男配震命女；
        if (mang == basicstring.震 && womang == basicstring.坤) {
            return "五鬼婚";
        }
        if (womang == basicstring.震 && mang == basicstring.坤) {
            return "五鬼婚";
        }
 
        // 离命男配艮命女，艮命男配离命女；
        if (mang == basicstring.离 && womang == basicstring.艮) {
            return "五鬼婚";
        }
        if (womang == basicstring.离 && mang == basicstring.艮) {
            return "五鬼婚";
        }
 
        // 乾命男配巽命女，巽命男配乾命女。；
        if (mang == basicstring.乾 && womang == basicstring.巽) {
            return "五鬼婚";
        }
        if (womang == basicstring.乾 && mang == basicstring.巽) {
            return "五鬼婚";
        }
 
        // 坎命男配坤命女，坤命男配坎命女；
        if (mang == basicstring.坎 && womang == basicstring.坤) {
            return "绝命婚";
        }
        if (womang == basicstring.坎 && mang == basicstring.坤) {
            return "绝命婚";
        }
 
 
        //  震命男配兑命女，兑命男配震命女；
        if (mang == basicstring.震 && womang == basicstring.兑) {
            return "绝命婚";
        }
        if (womang == basicstring.震 && mang == basicstring.兑) {
            return "绝命婚";
        }
 
 
        //  巽命男配艮命女，艮命男配巽命女；
        if (mang == basicstring.巽 && womang == basicstring.艮) {
            return "绝命婚";
        }
        if (womang == basicstring.巽 && mang == basicstring.艮) {
            return "绝命婚";
        }
 
 
        //      乾命男配离命女，离命男配乾命女。
        if (mang == basicstring.乾 && womang == basicstring.离) {
            return "绝命婚";
        }
        if (womang == basicstring.乾 && mang == basicstring.离) {
            return "绝命婚";
        }
        return "输入不正确";
 
    }
 
    /** 数字选宫挂
     *
     * @param number 数字
     * @param isman 男人么
     * @return 属于宫挂
     */
    public Luozhuanghehun.basicstring basicsnumber(int number, sex isman) {
        switch (number) {
            case 1:
                return basicstring.坎;
 
            case 2:
                return basicstring.坤;
            case 3:
                return basicstring.震;
            case 4:
                return basicstring.巽;
            case 5:
                if (isman == sex.man) {
                    return basicstring.坤;
                } else {
                    return basicstring.艮;
                }
            case 6:
                return basicstring.乾;
            case 7:
                return basicstring.兑;
            case 8:
                return basicstring.艮;
            case 9:
                return basicstring.离;
 
        }
        return null;
    }
 
    /**
     * 男性：11-出生年横加（也为流年玄空飞星入中宫计算公式） 女性：4+出生年横加
     * 1989年出生的男性：11-（1+9+8+9）=11-（27）=11-（2+7）=2，即本命卦为坤卦
     *
     * @param year 输入年份字符
     * @return 重载getnumber
     */
    public int getnumber(String year, sex isman) throws NumberFormatException {
 
        int yearnumber = Short.parseShort(year);
        return getnumber(yearnumber,isman);
 
    }
 
    /**
     * 男性：11-出生年横加（也为流年玄空飞星入中宫计算公式） 女性：4+出生年横加
     * 1989年出生的男性：11-（1+9+8+9）=11-（27）=11-（2+7）=2，即本命卦为坤卦
     *
     * @param year 输入年份数字
     * @return 返回结果
     */
    public int getnumber(int year, sex isman) {
 
        int m = ((int) (year / 1000) % 10);
        int h = ((int) (year / 100) % 10);
        int s = ((int) (year / 10) % 10);
        int g = year % 10;
        int sum = m + h + g + s;
         int result;
          if (isman == sex.man) {
                       result = 11 - ((int) (sum / 10) % 10) - (sum % 10);
                       
                } else {
                    result = 4+ ((int) (sum / 10) % 10) + (sum % 10);
                }
          if(result>10)
          {
      result=result-9;//如果超过10，原文没有写怎么做，我自己推的
          }
        return result;
 
    }
 
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Luozhuanghehun my = new Luozhuanghehun();
        String result=my.hehun("1956", "1856");
        System.out.println(my.getnumber("1956",sex.man));
        System.out.println(my.basicsnumber(my.getnumber("1956",sex.man),sex.man));
        
          System.out.println(my.getnumber("1856",sex.woman));
        System.out.println(my.basicsnumber(my.getnumber("1856",sex.woman),sex.woman));
        System.out.println(result);
    }
}
