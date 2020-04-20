package com.share.jvm;

import java.util.ArrayList;
import java.util.List;

/**
 * Java 虚拟机规范
 * @author Lgq create on 2020/4/18
 */
public class HeapOOM {


    static class  OMMObject{

    }

    public static void main(String[] args) {

        List<OMMObject> list = new ArrayList<OMMObject>();

        while (true){
            list.add(new OMMObject());
        }
    }
}
