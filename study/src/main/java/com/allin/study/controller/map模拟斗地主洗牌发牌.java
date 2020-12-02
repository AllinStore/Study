package com.allin.study.controller;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;

public class map模拟斗地主洗牌发牌 {
    public static void main(String[] args) {
        //定义map集合存储扑克牌，键是牌的编号，值是牌
        HashMap<Integer,String> mapPoker = new HashMap<Integer, String>();

        //定义一个List集合保存牌的编号，一共54张牌 这里编号范围是0~53
        ArrayList<Integer> pokerNumbers = new ArrayList<Integer>();

        //定义集合保存花色
        ArrayList<String> colors = new ArrayList<String>();
        colors.add("♣");
        colors.add("♦");
        colors.add("♠");
        colors.add("♥");

        //定义一个集合保存牌的数字
        ArrayList<String> numbers = new ArrayList<String>();
        Collections.addAll(numbers,"2","A","K","Q","J");
        for (int i = 10; i >= 3; i--){
            numbers.add(i+"");
        }
        //System.out.println("numbers = " + numbers);
        //定义变量作为编号
        int index = 0;
        //将大小王添加到mapPoker集合中
        mapPoker.put(index,"大☺");
        pokerNumbers.add(index);
        //修改编号
        index++;
        mapPoker.put(index,"小☺");
        pokerNumbers.add(index);

        //修改编号
        index++;
        //组装牌 2AKQJ109
        for (String thisNumber:numbers){
            for (String thisColor :colors){
                mapPoker.put(index,thisColor+thisNumber);
                // 将编号保存到pokerNumbers集合中
                pokerNumbers.add(index);
                // 修改编号
                index++;
            }
        }

        //System.out.println(mapPoker.size());

        // 洗牌 其实就是在打乱保存编号的集合顺序
        Collections.shuffle(pokerNumbers);

        // 创建三个玩家和底牌
        ArrayList<Integer> player1 = new ArrayList<Integer>();
        ArrayList<Integer> player2 = new ArrayList<Integer>();
        ArrayList<Integer> player3 = new ArrayList<Integer>();
        ArrayList<Integer> dipai = new ArrayList<Integer>();

        // 遍历pokerNumbers集合，即存储编号的集合
        for (int i = 0; i < pokerNumbers.size(); i++) {
            // 取出编号
            Integer thisPokerNumber = pokerNumbers.get(i);
            if (i >= pokerNumbers.size() - 3) {
                // 存储到底牌中
                dipai.add(thisPokerNumber);
            } else {
                // 将编号给三个玩家
                if (i % 3 == 0) {
                    player1.add(thisPokerNumber);
                } else if (i % 3 == 1) {
                    player2.add(thisPokerNumber);
                } else if (i % 3 == 2) {
                    player3.add(thisPokerNumber);
                }
            }
        }

        // 给玩家集合排序
        Collections.sort(player1);
        Collections.sort(player2);
        Collections.sort(player3);
        Collections.sort(dipai);

        System.out.println("player1 = " + player1);

        // 看牌
        // 调用方法遍历三个玩家的牌，并根据牌即编号作为key到map集合中查找value
        /*lookCard(mapPoker, player1, "玩家一");
        lookCard(mapPoker, player2, "玩家二");
        lookCard(mapPoker, player3, "玩家三");
        lookCard(mapPoker, dipai, "底牌");


        // 看牌方法
        public static void lookCard(HashMap<Integer, String> mapPoker, ArrayList<Integer> list, String name) {
            // 创建字符串缓冲区对象
            StringBuilder sb = new StringBuilder(name).append(": ");
            //遍历存储编号的集合
            for (Integer key : list) {
                //根据key获取值
                String value = mapPoker.get(key);
                sb.append(value).append(" ");
            }
            System.out.println(sb);
        }*/

        StringBuilder sb = new StringBuilder("玩家一").append(": ");
        //遍历存储编号的集合
        for (Integer key : player2) {
            //根据key获取值
            String value = mapPoker.get(key);
            sb.append(value).append(" ");
        }
        System.out.println(sb);


    }
}
