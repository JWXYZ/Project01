package com.company;

import java.math.BigDecimal;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.logging.SimpleFormatter;

public class Main {

    public static void main(String[] args) {

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
      //  Date date1 = new Date();
        Calendar instance = Calendar.getInstance();
      //  instance.setTime(date1);
        int minimum = instance.getMinimum(Calendar.DATE);
        instance.set(Calendar.DAY_OF_MONTH,16);
        String format = sdf.format(instance.getTimeInMillis());
      //  System.out.println(format + "format");

        long sst = 1L;
      //  System.out.println((int)sst);

        try {
            SimpleDateFormat sf = new SimpleDateFormat("yyyy-mm-dd");
            SimpleDateFormat sfs = new SimpleDateFormat("yyyy-mm-dd HH:mm:ss");

            String ss = "2019-01-01 00:00:00";
            String sss = "2019-01-01 23:59:59";

            Date date1 = sfs.parse(ss);
            Date date2 = sfs.parse(sss);

            String format1 = sfs.format(date1);
            String format2 = sfs.format(date2);
            String[] s = format1.split(" ");
            String[] s1 = format2.split(" ");
            System.out.println(s[0] + ": + wqeqewq");
            System.out.println(s1[0] + ": = 112321");
            Date parse = sf.parse(s[0]);
            Date parse1 = sf.parse(s1[0]);
            System.out.println(parse);
            System.out.println(parse1);


        } catch (ParseException e) {
            System.out.println("yyy");
            e.printStackTrace();
        }


        BigDecimal ONE = new BigDecimal("0");
        BigDecimal two = BigDecimal.ZERO;
        if (ONE.compareTo(two) == 0 ){
            System.out.println("123");
        }

        Map<String, Object> map1 = new HashMap<>();
        map1.put("121","23");
        if (map1.get("dcd") == null ){
            System.out.println("123123");
        }else {
            System.out.println("erwe");
        }


        BigDecimal a = new BigDecimal("33");
        BigDecimal b = new BigDecimal("50");
        BigDecimal d = new BigDecimal("80");
        BigDecimal divide = a.subtract(b).divide(d).setScale(2,BigDecimal.ROUND_DOWN);
        System.out.println(divide.toString().concat("%") + ":dasfd");


        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).equals(1)){
                list.remove(i);
            }
            if (list.get(i).equals(2)){
                list.remove(i);
            }
        }
        System.out.println(list.toString() + ":sfdsdfd");


        BigDecimal ah = BigDecimal.ZERO;
        BigDecimal decimal = new BigDecimal("4");
         ah = ah.add(decimal);
        System.out.println("dsaf = " + ah);

        Map<String, Object> hashMap = new HashMap<>();
        hashMap.put("we","上海分行");
        String wee = (String) hashMap.get("we");
        String replace = wee.replace("分行", "中支");
        hashMap.put("we",replace);
        System.out.println(hashMap + "dfadasfdsfadgd");


        Date date = new Date();
        long time = date.getTime();
        System.out.println("dfsdsd = " + time);

        Map<String, Object> map = new HashMap<>();
        float i1 = Math.round(3849 / 833);
        System.out.println(i1);

        int custCOunt = 200000;
        int netCount = 3849;
        int totalCount = 4;

        double handlend = (float) totalCount * 1000 / (float) custCOunt;
        String custAverageRate = custCOunt == 0 ? "0.00%" : String.format("%.2f",handlend) + "%";
        System.out.println("custCOunt===" + custAverageRate);
        System.out.println("custCOunt===" +  String.format("%.2f",i1));

        map.put("1",custAverageRate);
        map.put("2",netCount == 0 ? 0.00 : String.format("%.2f",(float)Math.round(3849 / 833)));


    }
}
