package com.lq.app;

import com.lq.enums.TirePressures;

public class PrintEnums {
    public static void main(String[] args){
        TirePressures tp = TirePressures.valueOf("RR");
        tp.overridePressure(22);
//        for (TirePressures tp: TirePressures.values()) {
//            System.out.printf("%s is %d pounds%n", tp.getName(), tp.getPressure());
//        }
        for (TirePressures t: TirePressures.values()) {
            System.out.println(t + " " + t.getPressure());
        }
    }
}
