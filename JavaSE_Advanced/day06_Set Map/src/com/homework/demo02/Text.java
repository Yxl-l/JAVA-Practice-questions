package com.homework.demo02;

import java.util.*;

public class Text {
   public static void main(String[] args) {
//        String[] attractions = {"A","B","C","D"};
//        Random r = new Random();
//        List<String> vote = new ArrayList<>();
//        for (int i=0;i<=80;i++){
//            vote.add(attractions[r.nextInt(attractions.length)]);
//        }
//        Map<String,Integer> statistics = new HashMap<>();
//        for (String s : vote) {
//            if (!statistics.containsKey(s)){
//                statistics.put(s,1);
//            }else {
//                statistics.put(s,statistics.get(s)+1);
//            }
//        }
//        statistics.forEach((k,y)-> System.out.println(k+":"+y));
//    }

       String[] keys = {"A", "B", "C", "D"};
       Random r = new Random();
       List<Integer> list = new ArrayList<>();
       for (int i = 0; i < 80; i++) {
           //投票集合
           list.add(r.nextInt(keys.length));
       }
       //创建计票集合
       Map<String, Integer> map = new HashMap<>();
       for (int i = 0; i <keys.length; i++) {
           //Collections.frequency()获取list集合指定元素出现次数
           map.put(keys[i],Collections.frequency(list,i) );//i=0.1.2.3出现次数对应4个景点的次数
       }
       map.forEach((k,v)-> System.out.println(k+":"+v));
//       for (int i=0;i<80;i++){
//           int a= r.nextInt(4);
//           switch (a){
//               case 0:
//                   map.put("A",map.get("A")+1);
//                   break;
//               case 1:
//                   map.put("B",map.get("B")+1);
//                   break;
//               case 2:
//                   map.put("C",map.get("C")+1);
//                   break;
//               case 3:
//                   map.put("D",map.get("D")+1);
//                   break;
//               default:
//                   break;
//           }
//       }

   }
}
