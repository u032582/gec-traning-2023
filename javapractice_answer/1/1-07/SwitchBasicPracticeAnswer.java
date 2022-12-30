// Copyright (c) 2018 Kenji Iida  All rights reserved.
/*

    switch文の基本問題の解答例

*/
public class SwitchBasicPracticeAnswer{

    public static void main(String[] args){

        System.out.println("月を入力してください");

        int month = Integer.parseInt(System.console().readLine());

        // switch文による分岐
        switch(month){

            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:

                System.out.println(month + "月は31日まであります");
                break;

            case 4:
            case 6:
            case 9:
            case 11:

                System.out.println(month + "月は30日まであります");
                break;

            case 2:

                System.out.println("2月は28、または29日まであります");
                break;

            default:

                System.out.println("エラー");
                break;

        }

    }

}
