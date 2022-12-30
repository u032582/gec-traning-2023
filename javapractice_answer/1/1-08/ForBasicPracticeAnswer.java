// Copyright (c) 2018 Kenji Iida  All rights reserved.
/*

    for文の基本問題の解答例

*/
public class ForBasicPracticeAnswer{

    public static void main(String[] args){

        // 21から29までのループ
        for(int i = 21; i <= 29; i++){

            // 3から9までの倍数か調査するためのループ
            for(int j = 3; j <= 9; j++){

                // もし割った余りが0ならその倍数
                if(i % j == 0){
                    System.out.println(i + "は" + j + "の倍数です");
                }

            }

        }

    }

}
