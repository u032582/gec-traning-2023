// Copyright (c) 2018 Kenji Iida  All rights reserved.
/*

    列挙型に関する基本問題の解答例

*/
public class EnumBasicPracticeAnswer{

    public static void main(String[] args){

        // 四季列挙子を格納した配列変数の宣言
        Season[] seasons = {
                                Season.SPRING, 
                                Season.SUMMER,
                                Season.FALL,
                                Season.WINTER
                            };

        // 四季をループで回す
        for(Season s : seasons){

            switch(s){

                case SUMMER:

                    System.out.println(s + "は暑い！！");
                    break;

                case WINTER:

                    System.out.println(s + "は寒い！！");
                    break;

                case SPRING:
                case FALL:

                    System.out.println(s);
                    break;

                default:
                    // 現状はあり得ない
                    throw new RuntimeException("Illegal Season!");

            }

        }

    }

}

// 季節Season列挙型
enum Season{

    SPRING("春"), SUMMER("夏"), FALL("秋"), WINTER("冬");

    // 季節名
    private String name;

    // コンストラクタ
    private Season(final String name){
        this.name = name;
    }

    @Override
    public String toString(){
        return name;
    }

}
