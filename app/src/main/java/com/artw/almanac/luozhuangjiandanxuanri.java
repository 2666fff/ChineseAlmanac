package com.artw.almanac;

/*
 * 简单的吉日选择日子实现
 *@author luozhuang 大师♂罗莊
 */

import com.artw.almanac.luozhuanghehun.LuozhuangshenshaHehun;
import com.artw.almanac.luozhuangpaipan.LuozhuangcommonClass;

import java.text.ParseException;
import java.util.Calendar;

/**
 * @author luozhuang 大师♂罗莊
 */
public class luozhuangjiandanxuanri {

    /**
     * 大月：初一，初七，十一，十七，二十三，三十。 小月：初三，初七，十二，二十六。 忌造酒、合酱。
     *
     * @param intChinesemonth 农历月份天数
     * @param intChineseday   农历日子数字
     */
    public static String nomakewine(int intChinesemonth, int intChineseday) {
        if (intChinesemonth == 30) {
            if (intChineseday == 1) {
                return "造酒 合酱 ";
            }
            if (intChineseday == 7) {
                return "造酒 合酱 ";
            }
            if (intChineseday == 12) {
                return "造酒 合酱 ";
            }
            if (intChineseday == 17) {
                return "造酒 合酱 ";
            }
            if (intChineseday == 23) {
                return "造酒 合酱 ";
            }
            if (intChineseday == 30) {
                return "造酒 合酱 ";
            }
        }
        if (intChinesemonth == 29) {
            if (intChineseday == 3) {
                return "造酒 合酱 ";
            }
            if (intChineseday == 7) {
                return "造酒 合酱 ";
            }
            if (intChineseday == 12) {
                return "造酒 合酱 ";
            }
            if (intChineseday == 26) {
                return "造酒 合酱 ";
            }
        }
        return "";
    }

    /**
     * 初五：十四：二十三，穷嘴老鼠不出庵”，月忌
     *
     * @param intChineseday
     */
    public static String yueji(int intChineseday) {
        if (intChineseday == 5) {
            return "月忌,初五、十四、二十三，老君炉里不炼丹。";

        }
        if (intChineseday == 14) {
            return "月忌,初五、十四、二十三，老君炉里不炼丹。";

        }
        if (intChineseday == 23) {
            return "月忌,初五、十四、二十三，老君炉里不炼丹。";

        }
        return "";
    }

    public static String donotdo(int intChinesemonth, int intChineseday) {
        if (intChinesemonth == 1) {
            if (intChineseday == 3) {
                return "嫁娶 宴饮 ";

            }
            if (intChineseday == 9) {
                return "嫁娶 宴饮 ";

            }
            if (intChineseday == 15) {
                return "嫁娶 宴饮 ";

            }
            if (intChineseday == 21) {
                return "嫁娶 宴饮 ";

            }
            if (intChineseday == 27) {
                return "嫁娶 宴饮 ";

            }
        }
        if (intChinesemonth == 2) {
            if (intChineseday == 2) {
                return "嫁娶 宴饮 ";

            }
            if (intChineseday == 8) {
                return "嫁娶 宴饮 ";

            }
            if (intChineseday == 14) {
                return "嫁娶 宴饮 ";

            }
            if (intChineseday == 20) {
                return "嫁娶 宴饮 ";

            }
            if (intChineseday == 26) {
                return "嫁娶 宴饮 ";

            }
        }
        if (intChinesemonth == 3) {
            if (intChineseday == 1) {
                return "嫁娶 宴饮 ";

            }
            if (intChineseday == 7) {
                return "嫁娶 宴饮 ";

            }
            if (intChineseday == 13) {
                return "嫁娶 宴饮 ";

            }
            if (intChineseday == 19) {
                return "嫁娶 宴饮 ";

            }
            if (intChineseday == 25) {
                return "嫁娶 宴饮 ";

            }
        }
        if (intChinesemonth == 4) {
            if (intChineseday == 6) {
                return "嫁娶 宴饮 ";

            }
            if (intChineseday == 12) {
                return "嫁娶 宴饮 ";

            }
            if (intChineseday == 18) {
                return "嫁娶 宴饮 ";

            }
            if (intChineseday == 24) {
                return "嫁娶 宴饮 ";

            }
            if (intChineseday == 30) {
                return "嫁娶 宴饮 ";

            }
        }
        if (intChinesemonth == 5) {
            if (intChineseday == 5) {
                return "嫁娶 宴饮 ";

            }
            if (intChineseday == 11) {
                return "嫁娶 宴饮 ";

            }
            if (intChineseday == 17) {
                return "嫁娶 宴饮 ";

            }
            if (intChineseday == 23) {
                return "嫁娶 宴饮 ";

            }
            if (intChineseday == 29) {
                return "嫁娶 宴饮 ";

            }
        }
        if (intChinesemonth == 6) {
            if (intChineseday == 4) {
                return "嫁娶 宴饮 ";

            }
            if (intChineseday == 10) {
                return "嫁娶 宴饮 ";

            }
            if (intChineseday == 16) {
                return "嫁娶 宴饮 ";

            }
            if (intChineseday == 22) {
                return "嫁娶 宴饮 ";

            }
            if (intChineseday == 28) {
                return "嫁娶 宴饮 ";

            }
        }
        if (intChinesemonth == 7) {
            if (intChineseday == 3) {
                return "嫁娶 宴饮 ";

            }
            if (intChineseday == 9) {
                return "嫁娶 宴饮 ";

            }
            if (intChineseday == 15) {
                return "嫁娶 宴饮 ";

            }
            if (intChineseday == 21) {
                return "嫁娶 宴饮 ";

            }
            if (intChineseday == 27) {
                return "嫁娶 宴饮 ";

            }
        }
        if (intChinesemonth == 8) {
            if (intChineseday == 2) {
                return "嫁娶 宴饮 ";

            }
            if (intChineseday == 8) {
                return "嫁娶 宴饮 ";

            }
            if (intChineseday == 14) {
                return "嫁娶 宴饮 ";

            }
            if (intChineseday == 20) {
                return "嫁娶 宴饮 ";

            }
            if (intChineseday == 26) {
                return "嫁娶 宴饮 ";

            }
        }
        if (intChinesemonth == 9) {
            if (intChineseday == 1) {
                return "嫁娶 宴饮 ";

            }
            if (intChineseday == 7) {
                return "嫁娶 宴饮 ";

            }
            if (intChineseday == 13) {
                return "嫁娶 宴饮 ";

            }
            if (intChineseday == 19) {
                return "嫁娶 宴饮 ";

            }
            if (intChineseday == 25) {
                return "嫁娶 宴饮 ";

            }
        }
        if (intChinesemonth == 10) {
            if (intChineseday == 6) {
                return "嫁娶 宴饮 ";

            }
            if (intChineseday == 12) {
                return "嫁娶 宴饮 ";

            }
            if (intChineseday == 18) {
                return "嫁娶 宴饮 ";

            }
            if (intChineseday == 24) {
                return "嫁娶 宴饮 ";

            }
            if (intChineseday == 30) {
                return "嫁娶 宴饮 ";

            }
        }
        if (intChinesemonth == 11) {
            if (intChineseday == 5) {
                return "嫁娶 宴饮 ";

            }
            if (intChineseday == 11) {
                return "嫁娶 宴饮 ";

            }
            if (intChineseday == 17) {
                return "嫁娶 宴饮 ";

            }
            if (intChineseday == 23) {
                return "嫁娶 宴饮 ";

            }
            if (intChineseday == 29) {
                return "嫁娶 宴饮 ";

            }
        }
        if (intChinesemonth == 12) {
            if (intChineseday == 4) {
                return "嫁娶 宴饮 ";

            }
            if (intChineseday == 10) {
                return "嫁娶 宴饮 ";

            }
            if (intChineseday == 16) {
                return "嫁娶 宴饮 ";

            }
            if (intChineseday == 22) {
                return "嫁娶 宴饮 ";

            }
            if (intChineseday == 28) {
                return "嫁娶 宴饮 ";

            }
        }
        if (intChinesemonth == 1) {
            if (intChineseday == 6) {
                return "行军 出行 经商 交易 ";
            }
            if (intChineseday == 14) {
                return "行军 出行 经商 交易 ";
            }
            if (intChineseday == 22) {
                return "行军 出行 经商 交易 ";
            }
            if (intChineseday == 30) {
                return "行军 出行 经商 交易 ";
            }
            if (intChineseday == 2) {
                return "行军 出行 经商 交易 ";
            }
            if (intChineseday == 10) {
                return "行军 出行 经商 交易 ";
            }
            if (intChineseday == 18) {
                return "行军 出行 经商 交易 ";
            }
            if (intChineseday == 26) {
                return "行军 出行 经商 交易 ";
            }
        }
        if (intChinesemonth == 2) {
            if (intChineseday == 5) {
                return "行军 出行 经商 交易 ";
            }
            if (intChineseday == 13) {
                return "行军 出行 经商 交易 ";
            }
            if (intChineseday == 21) {
                return "行军 出行 经商 交易 ";
            }
            if (intChineseday == 29) {
                return "行军 出行 经商 交易 ";
            }
            if (intChineseday == 1) {
                return "行军 出行 经商 交易 ";
            }
            if (intChineseday == 9) {
                return "行军 出行 经商 交易 ";
            }
            if (intChineseday == 17) {
                return "行军 出行 经商 交易 ";
            }
            if (intChineseday == 25) {
                return "行军 出行 经商 交易 ";
            }
        }
        if (intChinesemonth == 3) {
            if (intChineseday == 4) {
                return "行军 出行 经商 交易 ";
            }
            if (intChineseday == 12) {
                return "行军 出行 经商 交易 ";
            }
            if (intChineseday == 20) {
                return "行军 出行 经商 交易 ";
            }
            if (intChineseday == 30) {
                return "行军 出行 经商 交易 ";
            }
            if (intChineseday == 8) {
                return "行军 出行 经商 交易 ";
            }
            if (intChineseday == 16) {
                return "行军 出行 经商 交易 ";
            }
            if (intChineseday == 24) {
                return "行军 出行 经商 交易 ";
            }
        }
        if (intChinesemonth == 4) {
            if (intChineseday == 3) {
                return "行军 出行 经商 交易 ";
            }
            if (intChineseday == 11) {
                return "行军 出行 经商 交易 ";
            }
            if (intChineseday == 19) {
                return "行军 出行 经商 交易 ";
            }
            if (intChineseday == 27) {
                return "行军 出行 经商 交易 ";
            }
            if (intChineseday == 7) {
                return "行军 出行 经商 交易 ";
            }
            if (intChineseday == 15) {
                return "行军 出行 经商 交易 ";
            }
            if (intChineseday == 23) {
                return "行军 出行 经商 交易 ";
            }
            if (intChineseday == 30) {
                return "行军 出行 经商 交易 ";
            }
        }
        if (intChinesemonth == 5) {
            if (intChineseday == 2) {
                return "行军 出行 经商 交易 ";
            }
            if (intChineseday == 10) {
                return "行军 出行 经商 交易 ";
            }
            if (intChineseday == 18) {
                return "行军 出行 经商 交易 ";
            }
            if (intChineseday == 26) {
                return "行军 出行 经商 交易 ";
            }
            if (intChineseday == 6) {
                return "行军 出行 经商 交易 ";
            }
            if (intChineseday == 14) {
                return "行军 出行 经商 交易 ";
            }
            if (intChineseday == 22) {
                return "行军 出行 经商 交易 ";
            }
            if (intChineseday == 29) {
                return "行军 出行 经商 交易 ";
            }
        }
        if (intChinesemonth == 6) {
            if (intChineseday == 1) {
                return "行军 出行 经商 交易 ";
            }
            if (intChineseday == 17) {
                return "行军 出行 经商 交易 ";
            }
            if (intChineseday == 25) {
                return "行军 出行 经商 交易 ";
            }
            if (intChineseday == 29) {
                return "行军 出行 经商 交易 ";
            }
            if (intChineseday == 5) {
                return "行军 出行 经商 交易 ";
            }
            if (intChineseday == 13) {
                return "行军 出行 经商 交易 ";
            }
            if (intChineseday == 21) {
                return "行军 出行 经商 交易 ";
            }
            if (intChineseday == 28) {
                return "行军 出行 经商 交易 ";
            }
        }
        if (intChinesemonth == 7) {
            if (intChineseday == 8) {
                return "行军 出行 经商 交易 ";
            }
            if (intChineseday == 16) {
                return "行军 出行 经商 交易 ";
            }
            if (intChineseday == 24) {
                return "行军 出行 经商 交易 ";
            }
            if (intChineseday == 4) {
                return "行军 出行 经商 交易 ";
            }
            if (intChineseday == 12) {
                return "行军 出行 经商 交易 ";
            }
            if (intChineseday == 20) {
                return "行军 出行 经商 交易 ";
            }
            if (intChineseday == 27) {
                return "行军 出行 经商 交易 ";
            }
        }
        if (intChinesemonth == 8) {
            if (intChineseday == 7) {
                return "行军 出行 经商 交易 ";
            }
            if (intChineseday == 15) {
                return "行军 出行 经商 交易 ";
            }
            if (intChineseday == 23) {
                return "行军 出行 经商 交易 ";
            }
            if (intChineseday == 30) {
                return "行军 出行 经商 交易 ";
            }
            if (intChineseday == 3) {
                return "行军 出行 经商 交易 ";
            }
            if (intChineseday == 11) {
                return "行军 出行 经商 交易 ";
            }
            if (intChineseday == 19) {
                return "行军 出行 经商 交易 ";
            }
            if (intChineseday == 26) {
                return "行军 出行 经商 交易 ";
            }
        }
        if (intChinesemonth == 9) {
            if (intChineseday == 6) {
                return "行军 出行 经商 交易 ";
            }
            if (intChineseday == 13) {
                return "行军 出行 经商 交易 ";
            }
            if (intChineseday == 22) {
                return "行军 出行 经商 交易 ";
            }
            if (intChineseday == 29) {
                return "行军 出行 经商 交易 ";
            }
            if (intChineseday == 2) {
                return "行军 出行 经商 交易 ";
            }
            if (intChineseday == 10) {
                return "行军 出行 经商 交易 ";
            }
            if (intChineseday == 18) {
                return "行军 出行 经商 交易 ";
            }
            if (intChineseday == 25) {
                return "行军 出行 经商 交易 ";
            }
        }
        if (intChinesemonth == 10) {
            if (intChineseday == 4) {
                return "行军 出行 经商 交易 ";
            }
            if (intChineseday == 12) {
                return "行军 出行 经商 交易 ";
            }
            if (intChineseday == 21) {
                return "行军 出行 经商 交易 ";
            }
            if (intChineseday == 28) {
                return "行军 出行 经商 交易 ";
            }
            if (intChineseday == 1) {
                return "行军 出行 经商 交易 ";
            }
            if (intChineseday == 9) {
                return "行军 出行 经商 交易 ";
            }
            if (intChineseday == 17) {
                return "行军 出行 经商 交易 ";
            }
            if (intChineseday == 24) {
                return "行军 出行 经商 交易 ";
            }
        }
        if (intChinesemonth == 11) {
            if (intChineseday == 4) {
                return "行军 出行 经商 交易 ";
            }
            if (intChineseday == 13) {
                return "行军 出行 经商 交易 ";
            }
            if (intChineseday == 20) {
                return "行军 出行 经商 交易 ";
            }
            if (intChineseday == 27) {
                return "行军 出行 经商 交易 ";
            }
            if (intChineseday == 8) {
                return "行军 出行 经商 交易 ";
            }
            if (intChineseday == 16) {
                return "行军 出行 经商 交易 ";
            }
            if (intChineseday == 23) {
                return "行军 出行 经商 交易 ";
            }
        }
        if (intChinesemonth == 12) {
            if (intChineseday == 3) {
                return "行军 出行 经商 交易 ";
            }
            if (intChineseday == 11) {
                return "行军 出行 经商 交易 ";
            }
            if (intChineseday == 19) {
                return "行军 出行 经商 交易 ";
            }
            if (intChineseday == 7) {
                return "行军 出行 经商 交易 ";
            }
            if (intChineseday == 15) {
                return "行军 出行 经商 交易 ";
            }
        }
        if ((intChinesemonth == 1) && (intChineseday == 2)) {
            return "开仓 ";
        }
        if ((intChinesemonth == 2) && (intChineseday == 3)) {
            return "开仓 ";
        }
        if ((intChinesemonth == 3) && (intChineseday == 4)) {
            return "开仓 ";
        }
        if ((intChinesemonth == 4) && (intChineseday == 5)) {
            return "开仓 ";
        }
        if ((intChinesemonth == 5) && (intChineseday == 2)) {
            return "开仓 ";
        }
        if ((intChinesemonth == 6) && (intChineseday == 3)) {
            return "开仓 ";
        }
        if ((intChinesemonth == 7) && (intChineseday == 4)) {
            return "开仓 ";
        }
        if ((intChinesemonth == 8) && (intChineseday == 5)) {
            return "开仓 ";
        }
        if ((intChinesemonth == 9) && (intChineseday == 2)) {
            return "开仓 ";
        }
        if ((intChinesemonth == 10) && (intChineseday == 3)) {
            return "开仓 ";
        }
        if ((intChinesemonth == 11) && (intChineseday == 4)) {
            return "开仓 ";
        }
        if ((intChinesemonth == 12) && (intChineseday == 5)) {
            return "开仓 ";
        }
        if (intChinesemonth == 1) {
            if (intChineseday == 4) {
                return "赴任 入宅 ";
            }
            if (intChineseday == 9) {
                return "赴任 入宅 ";
            }
        }
        if (intChinesemonth == 2) {
            if (intChineseday == 13) {
                return "赴任 入宅 ";
            }
            if (intChineseday == 18) {
                return "赴任 入宅 ";
            }
        }
        if (intChinesemonth == 3) {
            if (intChineseday == 22) {
                return "赴任 入宅 ";
            }
            if (intChineseday == 27) {
                return "赴任 入宅 ";
            }
        }
        if (intChinesemonth == 4) {
            if (intChineseday == 4) {
                return "赴任 入宅 ";
            }
            if (intChineseday == 9) {
                return "赴任 入宅 ";
            }
        }
        if (intChinesemonth == 5) {
            if (intChineseday == 13) {
                return "赴任 入宅 ";
            }
            if (intChineseday == 18) {
                return "赴任 入宅 ";
            }
        }
        if (intChinesemonth == 6) {
            if (intChineseday == 22) {
                return "赴任 入宅 ";
            }
            if (intChineseday == 27) {
                return "赴任 入宅 ";
            }
        }
        if (intChinesemonth == 7) {
            if (intChineseday == 4) {
                return "赴任 入宅 ";
            }
            if (intChineseday == 9) {
                return "赴任 入宅 ";
            }
        }
        if (intChinesemonth == 8) {
            if (intChineseday == 13) {
                return "赴任 入宅 ";
            }
            if (intChineseday == 18) {
                return "赴任 入宅 ";
            }
        }
        if (intChinesemonth == 9) {
            if (intChineseday == 2) {
                return "赴任 入宅 ";
            }
            if (intChineseday == 27) {
                return "赴任 入宅 ";
            }
        }
        if (intChinesemonth == 10) {
            if (intChineseday == 4) {
                return "赴任 入宅 ";
            }
            if (intChineseday == 9) {
                return "赴任 入宅 ";
            }
        }
        if (intChinesemonth == 11) {
            if (intChineseday == 13) {
                return "赴任 入宅 ";
            }
            if (intChineseday == 18) {
                return "赴任 入宅 ";
            }
        }
        if (intChinesemonth == 12) {
            if (intChineseday == 22) {
                return "赴任 入宅 ";
            }
            if (intChineseday == 27) {
                return "赴任 入宅 ";
            }
        }
        return "";
    }

    /**
     * 民俗吉凶日篇 上兀下兀日 忌上官、赴任、临政、亲民、入学。 阳乾阴巽起正轮，月上初一并顺寻，巽上坤下为兀日，上官入学并遭迍。
     *
     * @param nianyinyang     年阴阳
     * @param intChinesemonth 农历月份
     * @param intChineseday   农历日期
     */
    public static String donot(String nianyinyang, int intChinesemonth, int intChineseday) {
        if ((nianyinyang).equals("阳")) {
            if ((intChinesemonth == 1) || (intChinesemonth == 7)) {
                if (intChineseday == 4) {
                    return "上官 赴任 临政 亲民 入学 ";

                }
                if (intChineseday == 6) {
                    return "上官 赴任 临政 亲民 入学 ";

                }
                if (intChineseday == 10) {
                    return "上官 赴任 临政 亲民 入学 ";

                }
                if (intChineseday == 12) {
                    return "上官 赴任 临政 亲民 入学 ";

                }
                if (intChineseday == 16) {
                    return "上官 赴任 临政 亲民 入学 ";

                }
                if (intChineseday == 18) {
                    return "上官 赴任 临政 亲民 入学 ";

                }
                if (intChineseday == 22) {
                    return "上官 赴任 临政 亲民 入学 ";

                }
                if (intChineseday == 24) {
                    return "上官 赴任 临政 亲民 入学 ";

                }
                if (intChineseday == 28) {
                    return "上官 赴任 临政 亲民 入学 ";

                }
                if (intChineseday == 30) {
                    return "上官 赴任 临政 亲民 入学 ";

                }
            }
            if ((intChinesemonth == 2) || (intChinesemonth == 8)) {
                if (intChineseday == 3) {
                    return "上官 赴任 临政 亲民 入学 ";

                }
                if (intChineseday == 5) {
                    return "上官 赴任 临政 亲民 入学 ";

                }
                if (intChineseday == 9) {
                    return "上官 赴任 临政 亲民 入学 ";

                }
                if (intChineseday == 11) {
                    return "上官 赴任 临政 亲民 入学 ";

                }
                if (intChineseday == 15) {
                    return "上官 赴任 临政 亲民 入学 ";

                }
                if (intChineseday == 17) {
                    return "上官 赴任 临政 亲民 入学 ";

                }
                if (intChineseday == 21) {
                    return "上官 赴任 临政 亲民 入学 ";

                }
                if (intChineseday == 23) {
                    return "上官 赴任 临政 亲民 入学 ";

                }
                if (intChineseday == 27) {
                    return "上官 赴任 临政 亲民 入学 ";

                }
                if (intChineseday == 29) {
                    return "上官 赴任 临政 亲民 入学 ";

                }
            }
            if ((intChinesemonth == 3) || (intChinesemonth == 9)) {
                if (intChineseday == 2) {
                    return "上官 赴任 临政 亲民 入学 ";

                }
                if (intChineseday == 4) {
                    return "上官 赴任 临政 亲民 入学 ";

                }
                if (intChineseday == 8) {
                    return "上官 赴任 临政 亲民 入学 ";

                }
                if (intChineseday == 10) {
                    return "上官 赴任 临政 亲民 入学 ";

                }
                if (intChineseday == 14) {
                    return "上官 赴任 临政 亲民 入学 ";

                }
                if (intChineseday == 16) {
                    return "上官 赴任 临政 亲民 入学 ";

                }
                if (intChineseday == 20) {
                    return "上官 赴任 临政 亲民 入学 ";

                }
                if (intChineseday == 22) {
                    return "上官 赴任 临政 亲民 入学 ";

                }
                if (intChineseday == 27) {
                    return "上官 赴任 临政 亲民 入学 ";

                }
                if (intChineseday == 29) {
                    return "上官 赴任 临政 亲民 入学 ";

                }
            }
            if ((intChinesemonth == 4) || (intChinesemonth == 10)) {
                if (intChineseday == 1) {
                    return "上官 赴任 临政 亲民 入学 ";

                }
                if (intChineseday == 3) {
                    return "上官 赴任 临政 亲民 入学 ";

                }
                if (intChineseday == 7) {
                    return "上官 赴任 临政 亲民 入学 ";

                }
                if (intChineseday == 9) {
                    return "上官 赴任 临政 亲民 入学 ";

                }
                if (intChineseday == 13) {
                    return "上官 赴任 临政 亲民 入学 ";

                }
                if (intChineseday == 15) {
                    return "上官 赴任 临政 亲民 入学 ";

                }
                if (intChineseday == 19) {
                    return "上官 赴任 临政 亲民 入学 ";

                }
                if (intChineseday == 21) {
                    return "上官 赴任 临政 亲民 入学 ";

                }
                if (intChineseday == 25) {
                    return "上官 赴任 临政 亲民 入学 ";

                }
                if (intChineseday == 27) {
                    return "上官 赴任 临政 亲民 入学 ";

                }
            }
            if ((intChinesemonth == 5) || (intChinesemonth == 11)) {
                if (intChineseday == 6) {
                    return "上官 赴任 临政 亲民 入学 ";

                }
                if (intChineseday == 2) {
                    return "上官 赴任 临政 亲民 入学 ";

                }
                if (intChineseday == 12) {
                    return "上官 赴任 临政 亲民 入学 ";

                }
                if (intChineseday == 8) {
                    return "上官 赴任 临政 亲民 入学 ";

                }
                if (intChineseday == 18) {
                    return "上官 赴任 临政 亲民 入学 ";

                }
                if (intChineseday == 14) {
                    return "上官 赴任 临政 亲民 入学 ";

                }
                if (intChineseday == 24) {
                    return "上官 赴任 临政 亲民 入学 ";

                }
                if (intChineseday == 20) {
                    return "上官 赴任 临政 亲民 入学 ";

                }
                if (intChineseday == 30) {
                    return "上官 赴任 临政 亲民 入学 ";

                }
                if (intChineseday == 26) {
                    return "上官 赴任 临政 亲民 入学 ";

                }
            }
            if ((intChinesemonth == 6) || (intChinesemonth == 12)) {
                if (intChineseday == 5) {
                    return "上官 赴任 临政 亲民 入学 ";

                }
                if (intChineseday == 1) {
                    return "上官 赴任 临政 亲民 入学 ";

                }
                if (intChineseday == 11) {
                    return "上官 赴任 临政 亲民 入学 ";

                }
                if (intChineseday == 7) {
                    return "上官 赴任 临政 亲民 入学 ";

                }
                if (intChineseday == 17) {
                    return "上官 赴任 临政 亲民 入学 ";

                }
                if (intChineseday == 13) {
                    return "上官 赴任 临政 亲民 入学 ";

                }
                if (intChineseday == 23) {
                    return "上官 赴任 临政 亲民 入学 ";

                }
                if (intChineseday == 19) {
                    return "上官 赴任 临政 亲民 入学 ";

                }
                if (intChineseday == 29) {
                    return "上官 赴任 临政 亲民 入学 ";

                }
                if (intChineseday == 25) {
                    return "上官 赴任 临政 亲民 入学 ";

                }
            }
        }
        if ((nianyinyang).equals("阴")) {
            if ((intChinesemonth == 1) || (intChinesemonth == 7)) {
                if (intChineseday == 1) {
                    return "上官 赴任 临政 亲民 入学 ";

                }
                if (intChineseday == 3) {
                    return "上官 赴任 临政 亲民 入学 ";

                }
                if (intChineseday == 7) {
                    return "上官 赴任 临政 亲民 入学 ";

                }
                if (intChineseday == 13) {
                    return "上官 赴任 临政 亲民 入学 ";

                }
                if (intChineseday == 15) {
                    return "上官 赴任 临政 亲民 入学 ";

                }
                if (intChineseday == 19) {
                    return "上官 赴任 临政 亲民 入学 ";

                }
                if (intChineseday == 21) {
                    return "上官 赴任 临政 亲民 入学 ";

                }
                if (intChineseday == 25) {
                    return "上官 赴任 临政 亲民 入学 ";

                }
                if (intChineseday == 27) {
                    return "上官 赴任 临政 亲民 入学 ";

                }
            }
            if ((intChinesemonth == 2) || (intChinesemonth == 8)) {
                if (intChineseday == 6) {
                    return "上官 赴任 临政 亲民 入学 ";

                }
                if (intChineseday == 2) {
                    return "上官 赴任 临政 亲民 入学 ";

                }
                if (intChineseday == 12) {
                    return "上官 赴任 临政 亲民 入学 ";

                }
                if (intChineseday == 8) {
                    return "上官 赴任 临政 亲民 入学 ";

                }
                if (intChineseday == 18) {
                    return "上官 赴任 临政 亲民 入学 ";

                }
                if (intChineseday == 14) {
                    return "上官 赴任 临政 亲民 入学 ";

                }
                if (intChineseday == 24) {
                    return "上官 赴任 临政 亲民 入学 ";

                }
                if (intChineseday == 20) {
                    return "上官 赴任 临政 亲民 入学 ";

                }
                if (intChineseday == 30) {
                    return "上官 赴任 临政 亲民 入学 ";

                }
                if (intChineseday == 26) {
                    return "上官 赴任 临政 亲民 入学 ";

                }
            }
            if ((intChinesemonth == 3) || (intChinesemonth == 9)) {
                if (intChineseday == 5) {
                    return "上官 赴任 临政 亲民 入学 ";

                }
                if (intChineseday == 1) {
                    return "上官 赴任 临政 亲民 入学 ";

                }
                if (intChineseday == 11) {
                    return "上官 赴任 临政 亲民 入学 ";

                }
                if (intChineseday == 7) {
                    return "上官 赴任 临政 亲民 入学 ";

                }
                if (intChineseday == 17) {
                    return "上官 赴任 临政 亲民 入学 ";

                }
                if (intChineseday == 13) {
                    return "上官 赴任 临政 亲民 入学 ";

                }
                if (intChineseday == 23) {
                    return "上官 赴任 临政 亲民 入学 ";

                }
                if (intChineseday == 19) {
                    return "上官 赴任 临政 亲民 入学 ";

                }
                if (intChineseday == 29) {
                    return "上官 赴任 临政 亲民 入学 ";

                }
                if (intChineseday == 25) {
                    return "上官 赴任 临政 亲民 入学 ";

                }
            }
            if ((intChinesemonth == 4) || (intChinesemonth == 10)) {
                if (intChineseday == 4) {
                    return "上官 赴任 临政 亲民 入学 ";

                }
                if (intChineseday == 6) {
                    return "上官 赴任 临政 亲民 入学 ";

                }
                if (intChineseday == 10) {
                    return "上官 赴任 临政 亲民 入学 ";

                }
                if (intChineseday == 12) {
                    return "上官 赴任 临政 亲民 入学 ";

                }
                if (intChineseday == 16) {
                    return "上官 赴任 临政 亲民 入学 ";

                }
                if (intChineseday == 18) {
                    return "上官 赴任 临政 亲民 入学 ";

                }
                if (intChineseday == 22) {
                    return "上官 赴任 临政 亲民 入学 ";

                }
                if (intChineseday == 24) {
                    return "上官 赴任 临政 亲民 入学 ";

                }
                if (intChineseday == 28) {
                    return "上官 赴任 临政 亲民 入学 ";

                }
                if (intChineseday == 30) {
                    return "上官 赴任 临政 亲民 入学 ";

                }
            }
            if ((intChinesemonth == 5) || (intChinesemonth == 11)) {
                if (intChineseday == 3) {
                    return "上官 赴任 临政 亲民 入学 ";

                }
                if (intChineseday == 5) {
                    return "上官 赴任 临政 亲民 入学 ";

                }
                if (intChineseday == 9) {
                    return "上官 赴任 临政 亲民 入学 ";

                }
                if (intChineseday == 11) {
                    return "上官 赴任 临政 亲民 入学 ";

                }
                if (intChineseday == 15) {
                    return "上官 赴任 临政 亲民 入学 ";

                }
                if (intChineseday == 17) {
                    return "上官 赴任 临政 亲民 入学 ";

                }
                if (intChineseday == 21) {
                    return "上官 赴任 临政 亲民 入学 ";

                }
                if (intChineseday == 23) {
                    return "上官 赴任 临政 亲民 入学 ";

                }
                if (intChineseday == 27) {
                    return "上官 赴任 临政 亲民 入学 ";

                }
                if (intChineseday == 29) {
                    return "上官 赴任 临政 亲民 入学 ";

                }
            }
            if ((intChinesemonth == 6) || (intChinesemonth == 12)) {
                if (intChineseday == 2) {
                    return "上官 赴任 临政 亲民 入学 ";


                }
                if (intChineseday == 8) {
                    return "上官 赴任 临政 亲民 入学 ";

                }
                if (intChineseday == 7) {
                    return "上官 赴任 临政 亲民 入学 ";

                }
                if (intChineseday == 14) {
                    return "上官 赴任 临政 亲民 入学 ";

                }
                if (intChineseday == 16) {
                    return "上官 赴任 临政 亲民 入学 ";

                }
                if (intChineseday == 20) {
                    return "上官 赴任 临政 亲民 入学 ";

                }
                if (intChineseday == 22) {
                    return "上官 赴任 临政 亲民 入学 ";

                }
                if (intChineseday == 26) {
                    return "上官 赴任 临政 亲民 入学 ";

                }
                if (intChineseday == 28) {
                    return "上官 赴任 临政 亲民 入学 ";

                }
            }
        }
        return "";
    }

    /**
     * 忌裁衣、纳财 正月：初七，二十七。 二月：初四，十九。 三月：初一，十六。 四月：初九，二十五。 五月：十五，二十五。 六月：初十，二十。
     * 七月：初八，二十二。 八月：初二，初五，十八，十九。 九月：初三，初四，十六，十七。 十月：初一，十四。 十一月：十二，二十二。
     * 十二月：初九，二十五。
     *
     * @param intChinesemonth 农历月份数字
     * @param intChineseday   农历日子数字
     */
    public static String nocutwealth(int intChinesemonth, int intChineseday) {
        if (intChinesemonth == 1) {
            if (intChineseday == 7) {
                return "裁衣 纳财 ";

            }
            if (intChineseday == 27) {
                return "裁衣 纳财 ";

            }
        }
        if (intChinesemonth == 2) {
            if (intChineseday == 4) {
                return "裁衣 纳财 ";

            }
            if (intChineseday == 19) {
                return "裁衣 纳财 ";

            }
        }
        if (intChinesemonth == 3) {
            if (intChineseday == 1) {
                return "裁衣 纳财 ";

            }
            if (intChineseday == 16) {
                return "裁衣 纳财 ";

            }
        }
        if (intChinesemonth == 4) {
            if (intChineseday == 9) {
                return "裁衣 纳财 ";

            }
            if (intChineseday == 25) {
                return "裁衣 纳财 ";

            }
        }
        if (intChinesemonth == 5) {
            if (intChineseday == 15) {
                return "裁衣 纳财 ";

            }
            if (intChineseday == 25) {
                return "裁衣 纳财 ";

            }
        }
        if (intChinesemonth == 6) {
            if (intChineseday == 10) {
                return "裁衣 纳财 ";

            }
            if (intChineseday == 20) {
                return "裁衣 纳财 ";

            }
        }
        if (intChinesemonth == 7) {
            if (intChineseday == 8) {
                return "裁衣 纳财 ";

            }
            if (intChineseday == 22) {
                return "裁衣 纳财 ";

            }
        }
        if (intChinesemonth == 8) {
            if (intChineseday == 2) {
                return "裁衣 纳财 ";

            }
            if (intChineseday == 5) {
                return "裁衣 纳财 ";

            }
            if (intChineseday == 18) {
                return "裁衣 纳财 ";

            }
            if (intChineseday == 19) {
                return "裁衣 纳财 ";

            }
        }
        if (intChinesemonth == 9) {
            if (intChineseday == 3) {
                return "裁衣 纳财 ";

            }
            if (intChineseday == 4) {
                return "裁衣 纳财 ";

            }
            if (intChineseday == 16) {
                return "裁衣 纳财 ";

            }
            if (intChineseday == 17) {
                return "裁衣 纳财 ";

            }
        }
        if (intChinesemonth == 10) {
            if (intChineseday == 1) {
                return "裁衣 纳财 ";

            }
            if (intChineseday == 14) {
                return "裁衣 纳财 ";

            }
        }
        if (intChinesemonth == 11) {
            if (intChineseday == 12) {
                return "裁衣 纳财 ";

            }
            if (intChineseday == 22) {
                return "裁衣 纳财 ";

            }
        }
        if (intChinesemonth == 12) {
            if (intChineseday == 9) {
                return "裁衣 纳财 ";

            }
            if (intChineseday == 25) {
                return "裁衣 纳财 ";

            }
        }
        return "";
    }

    void test(BaiziRecord cal) {
        int intChinesemonth = cal.lunaryue.getLunarMonth();
        int intChineseday = cal.lunaryue.getLunarDay();
        String yueyin = LuozhuangcommonClass.tianganyinyang(cal.getganzhiString()[1]);
        println("今天不宜");
        println(donot(yueyin, intChinesemonth, intChineseday));
        println(donotdo(intChinesemonth, intChineseday));
        println(nocutwealth(intChinesemonth, intChineseday));
        println(nomakewine(intChinesemonth, intChineseday));


    }

    public BaiziRecord getbazi(String man) throws ParseException {

        Calendar mancal;

        LuozhuangshenshaHehun myLuozhuangshenshaHehun = new LuozhuangshenshaHehun();
        mancal = myLuozhuangshenshaHehun.getCalendarfromString(man, "yyyy-MM-dd");
        //原来的private 方法改了下
        return getbazi(mancal);

    }

    public BaiziRecord getbazi(Calendar cal) {
        BaiziRecord returnvalue = new BaiziRecord(cal);
        println("农历的日期【" + returnvalue.lunar.toString() + "】");
        /**
         * 很多地方都是按照23：00-1：00为子时这是不对的。
         * 子时24.00－2.00,丑时2.00－4.00,寅时4.00－6.00,卯时6.00－8.00,
         * 辰时8.00－10.00,巳时10.00－12.00,午时12.00－14.00,未时14.00－16.00
         * 申时16.00－18.00,酉时18.00－20.00,戌时20.00－22.00,亥时22.00－24.00
         *
         */
        int time = cal.get(Calendar.HOUR_OF_DAY) / 2;

        //获取生肖
        println("农历生肖【" + returnvalue.lunar.animalsYear() + "】");

        println(konggou);
        println("八字:");
        println(konggou + returnvalue.getGanziyear() + konggou + returnvalue.getGanzimonth() + konggou + returnvalue.getGanziday() + konggou + returnvalue.getGanzitime() + konggou);
        println("农历日期:");
        println(konggou + returnvalue.lunaryue.getLunarYear() + konggou + returnvalue.lunaryue.getLunarMonth() + konggou + returnvalue.lunaryue.getLunarDay());

        println("农历日期:");
        println(konggou + returnvalue.lunaryue.getLunarDayString());
        return returnvalue;

    }

    public String getBaziString(Calendar cal){
        BaiziRecord returnvalue = new BaiziRecord(cal);
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("农历的日期【" + returnvalue.lunar.toString() + "】").append("\r\n");
        /**
         * 很多地方都是按照23：00-1：00为子时这是不对的。
         * 子时24.00－2.00,丑时2.00－4.00,寅时4.00－6.00,卯时6.00－8.00,
         * 辰时8.00－10.00,巳时10.00－12.00,午时12.00－14.00,未时14.00－16.00
         * 申时16.00－18.00,酉时18.00－20.00,戌时20.00－22.00,亥时22.00－24.00
         *
         */
        int time = cal.get(Calendar.HOUR_OF_DAY) / 2;

        //获取生肖
        stringBuilder.append("农历生肖【" + returnvalue.lunar.animalsYear() + "】").append("\r\n");

        stringBuilder.append(konggou).append("\r\n");
        stringBuilder.append("八字:").append("\r\n");
        stringBuilder.append(konggou + returnvalue.getGanziyear() + konggou + returnvalue.getGanzimonth() + konggou +
                returnvalue.getGanziday() + konggou + returnvalue.getGanzitime() + konggou).append("\r\n");
        stringBuilder.append("农历日期:").append("\r\n");
        stringBuilder.append(konggou + returnvalue.lunaryue.getLunarYear() + konggou + returnvalue.lunaryue.getLunarMonth() + konggou + returnvalue.lunaryue.getLunarDay()).append("\r\n");

        stringBuilder.append("农历日期:").append("\r\n");
        stringBuilder.append(konggou + returnvalue.lunaryue.getLunarDayString()).append("\r\n");
        return stringBuilder.toString();
    }

    public void print(String message) {

        result.append(message);
        System.out.print(message);

    }

    String konggou = "     ";
    String konggou2 = "  ";
    StringBuffer result = new StringBuffer();

    public void println(String message) {
        print(message);
        System.out.println(konggou2);
        result.append("\n");
        result.append("\n");
        System.out.println(konggou2);
    }

    public static void main(String[] args) throws ParseException {

        luozhuangjiandanxuanri my = new luozhuangjiandanxuanri();
        my.test(my.getbazi("2013-8-14"));

    }
}