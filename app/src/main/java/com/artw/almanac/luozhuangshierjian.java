/*
 * 简单的通勝十二建选择日子实现
 *@author luozhuang 大师♂罗莊
 */
package com.artw.almanac;
 
import java.text.ParseException;
import java.util.Calendar;


/**
 *
 * @author luozhuang
 */
public class luozhuangshierjian {
 
    /**
     * 通勝十二建判断可以做什么不可以做什么
     *
     * @param shierjianString 通勝十二建字符串
     */
    public String cando="";
    public String canotdo="";;
    /**
     * 月支日支	一月寅节	二月卯节	三月辰节	四月巳节	五月午节	六月未节	七月申节	八月酉节	九月戍节	十月亥节	十一子节	十二丑节 子	开	收	成
     * 危	破	执	定	平	满	除	建	闭 丑	闭	开	收	成	危	破	执	定	平	满	除	建 寅	建	闭	开	收	成	危	破	执	定	平	满	除 卯	除
     * 建	闭	开	收	成	危	破	执	定	平	满 辰	满	除	建	闭	开	收	成	危	破	执	定	平 巳	平	满	除	建	闭	开	收	成	危	破	执	定
     * 午	定	平	满	除	建	闭	开	收	成	危	破	执 未	执	定	平	满	除	建	闭	开	收	成	危	破 申	破	执	定	平	满	除	建	闭	开	收
     * 成	危 酉	危	破	执	定	平	满	除	建	闭	开	收	成 戍	成	危	破	执	定	平	满	除	建	闭	开	收 亥	收	成	危	破	执	定	平	满
     * 除	建	闭	开
     *
     *
     */
    String[][] data = {{"开", "收", "成", "危", "破", "执", "定", "平", "满", "除", "建", "闭"},
        {"闭", "开", "收", "成", "危", "破", "执", "定", "平", "满", "除", "建"},
        {"建", "闭", "开", "收", "成", "危", "破", "执", "定", "平", "满", "除"},
        {"除", "建", "闭", "开", "收", "成", "危", "破", "执", "定", "平", "满"},
        {"满", "除", "建", "闭", "开", "收", "成", "危", "破", "执", "定", "平"},
        {"平", "满", "除", "建", "闭", "开", "收", "成", "危", "破", "执", "定"},
        {"定", "平", "满", "除", "建", "闭", "开", "收", "成", "危", "破", "执"},
        {"执", "定", "平", "满", "除", "建", "闭", "开", "收", "成", "危", "破"},
        {"破", "执", "定", "平", "满", "除", "建", "闭", "开", "收", "成", "危"},
        {"危", "破", "执", "定", "平", "满", "除", "建", "闭", "开", "收", "成"},
        {"成", "危", "破", "执", "定", "平", "满", "除", "建", "闭", "开", "收"},
        {"收", "成", "危", "破", "执", "定", "平", "满", "除", "建", "闭", "开"},};
    String[] shengxiao = {"子", "丑", "寅", "卯", "辰", "巳", "午", "未", "申", "酉", "戌", "亥"};
 
    public String getshierjian(int mouth, String rizhi) {
        if (mouth < 1 || mouth > 12) {
            return null;
        }
        int riziindex = getarrayindex(shengxiao, rizhi);
        return data[riziindex][mouth - 1];
    }
 
    public int getarrayindex(String[] array, String target) {
        for (int i = 0; i < array.length; i++) {
            if (array[i].equals(target)) {
                return i;
            }
        }
        return -1;
    }
 
    /**
     *通胜十二建 
建、除、满、平、定、执、破、危、成、收、开、闭。 吉日：红白二事皆宜的日子。 
成日：成功、天帝纪万物成就的大吉日子，凡事皆顺。  宜：结婚、开市、修造、动土、安床、破土、安葬、搬迁、    交易、求财、出行、立契、竖柱、裁种、牧养。  忌：诉讼。 
收日：收成、收获，天帝宝库收纳的日子。 
 宜：祈福、求嗣、赴任、嫁娶、安床、修造、动土、    求学、开市、交易、买卖、立契。  忌：放债、新船下水、新车下地、破土、安葬。 开日：开始、开展的日子。 
 宜：祭祀、祈福、入学、上任、修造、动土、    开市、安床、交易、出行、竖柱。  忌：放债、诉讼、安葬。 次吉：吉日后，退而求其次的日子。 建日：万物生育、强健、健壮的日子。 
 宜：赴任、祈福、求嗣、破土、安葬、修造、上梁、求财、    置业、入学、考试、结婚、动土、签约、交涉、出行。 
 忌：动土、开仓、掘井、乘船、新船下水、新车下地、维修水电器具。 除日：扫除恶煞、去旧迎新的日子。 
 宜：祭祀、祈福、婚姻、出行、入伙、搬迁、出货、动土、求医、交易。  忌：结婚、赴任、远行、签约。 满日：丰收、美满、天帝宝库积满的日子。 
 宜：嫁娶、祈福、移徙、开市、交易、求财、立契、祭祀、出行、牧养。  忌：造葬、赴任、求医。 平日：普通的日子。 
平日：平常、官人集合平分的日子。 
 宜：嫁娶、修造、破土、安葬、牧养、开市、安床、动土、求嗣。  忌：祈福、求嗣、赴任、嫁娶、开市、安葬。 定日：安定、平常、天帝众客定座的日子。 
 宜：祭祀、祈福、嫁娶、造屋、装修、修路、开市、入学、上任、入伙。  忌：诉讼、出行、交涉。 
凶日：诸事不宜，最好避之则吉，喜事更可免则免。 
执日：破日之从神，曰小耗，天帝执行万物赐天福，较差的日子。  宜：造屋、装修、嫁娶、收购、立契、祭祀。  忌：开市、求财、出行、搬迁。
* 破日：日月相冲，曰大耗，斗柄相冲相向必破坏的日子，大事不宜。  宜：破土、拆卸、求医。 
 忌：嫁娶、签约、交涉、出行、搬迁。 危日：危机、危险，诸事不宜的日子。  宜：祭祀、祈福、安床、拆卸、破土。  忌：登山、乘船、出行、嫁娶、造葬、迁徙。 
闭日：十二建中最后一日，关闭、收藏、天地阴阳闭寒的日子。  宜：祭祀、祈福、筑堤、埋池、埋穴、造葬、填补、修屋。  忌：开市、出行、求医、手术、嫁娶。
     * @param shierjianString 通胜十二建字符串
     */
    public void shierxingjianpanduan(String shierjianString) {
        if (shierjianString.equals("建")) {
            cando += "出行 ";
            canotdo += "开仓 ";
        }
        if (shierjianString.equals("除")) {
            cando += "服药 针灸 ";
        }
        if (shierjianString.equals("满")) {
            cando += "开市 ";
            canotdo += "服药 ";
        }
        if (shierjianString.equals("平")) {
            cando += "涂泥 ";
        }
        if (shierjianString.equals("定")) {
            cando += "纳畜 入学 ";
        }
        if (shierjianString.equals("执")) {
            cando += "捕捉 ";
        }
        if (shierjianString.equals("破")) {
            cando += "治病 ";
        }
        if (shierjianString.equals("危")) {
            cando += "捕鱼 ";
            canotdo += "行船 ";
        }
        if (shierjianString.equals("成")) {
            cando += "入学 ";
            canotdo += "诉讼 ";
        }
        if (shierjianString.equals("收")) {
            cando += "纳财 ";
            canotdo += "安葬 ";
        }
        if (shierjianString.equals("开")) {
            cando += "求仕 ";
            canotdo += "安葬 ";
        }
        if (shierjianString.equals("闭")) {
            cando += "安床 ";
            canotdo += "治目 ";
        }
 
 
        if (shierjianString.equals("建")) {
            cando += "裁衣 纳财 交易 出行 竖柱 ";
            canotdo += "乘船 开仓 动土 ";
        }
        if (shierjianString.equals("除")) {
            cando += "沐浴 清洁 服药 ";
            canotdo += "婚礼 出行 开井 ";
        }
        if (shierjianString.equals("满")) {
            cando += "造作 婚礼 旅行 ";
            canotdo += "种植 开井 ";
        }
        if (shierjianString.equals("平")) {
            cando += "婚礼 出行 修道 涂泥 ";
            canotdo += "种植 掘沟 开井 ";
        }
        if (shierjianString.equals("定")) {
            cando += "宴饮 协议 种植 造作 婚礼 旅行 动土 开井 ";
            canotdo += "治病 诉讼 出师 ";
        }
        if (shierjianString.equals("执")) {
            cando += "种植 捕捉 造作 开井 婚礼 ";
            canotdo += "出行 开市 开仓 ";
        }
        if (shierjianString.equals("破")) {
            cando += "破垣 出渔 ";
        }
        if (shierjianString.equals("成")) {
            cando += "开市 入学 嫁娶 上官 赴任 婚礼 造作 动土 旅行 ";
            canotdo += "诉讼 ";
        }
        if (shierjianString.equals("收")) {
            cando += "收获 开仓 交易 入学 婚礼 造作 动土 ";
            canotdo += "出行 安葬 针灸 ";
        }
        if (shierjianString.equals("开")) {
            cando += "学艺 就业 婚礼 出行 ";
            canotdo += "安葬 ";
        }
        if (shierjianString.equals("闭")) {
            canotdo += "修造 筑堤 ";
        }
    }
    luozhuangjiandanxuanri my = new luozhuangjiandanxuanri();
 
    void test(BaiziRecord cal) {
        int intChinesemonth = cal.lunaryue.getLunarMonth();
        int intChineseday = cal.lunaryue.getLunarDay();
        my.println("今天通勝十二建");
        stringBuilder.append("今天通勝十二建").append("\r\n");
        String shierjianstring = getshierjian(intChinesemonth, cal.getganzhiString()[6]);

        my.println(shierjianstring);
        stringBuilder.append(shierjianstring).append("\r\n");

        shierxingjianpanduan(shierjianstring);

        my.println("今天宜");
        stringBuilder.append("今天宜").append("\r\n");

        my.println(cando);
        stringBuilder.append(cando).append("\r\n");

        my.println("今天不宜");
        stringBuilder.append("今天不宜").append("\r\n");

        my.println(canotdo);
        stringBuilder.append(canotdo).append("\r\n");

        if(callBackListener!=null){
            callBackListener.onTextDataGet(stringBuilder.toString());
        }
 
    }
 
    public static void main(String[] args) throws ParseException {
        luozhuangjiandanxuanri myluozhuangjiandanxuanri = new luozhuangjiandanxuanri();
        luozhuangshierjian myluozhuangshierjian = new luozhuangshierjian();
        myluozhuangshierjian.test(myluozhuangjiandanxuanri.getbazi(Calendar.getInstance()));
 
    }

    private On12jianCalculatorListener callBackListener;
    private StringBuilder stringBuilder = new StringBuilder();


    public luozhuangshierjian(On12jianCalculatorListener callBackListener) {
        this.callBackListener = callBackListener;
    }

    public luozhuangshierjian() {
    }

    public interface On12jianCalculatorListener{
        void onTextDataGet(String data);
    }
}