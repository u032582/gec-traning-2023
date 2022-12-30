// Copyright (c) 2018 Kenji Iida  All rights reserved.
/*

    for文の標準問題の解答例

*/
public class ForNormalPracticeAnswer{

    public static void main(String[] args){

        // 素数の表示（continueとラベルを使用）
        outer:for(int i = 10 ; i <= 100 ; i++){

            for(int j = 2 ; j < i ; j++){

                if(i % j == 0){
                    continue outer;
                }

            }

            System.out.println(i);

        }

    }

}
