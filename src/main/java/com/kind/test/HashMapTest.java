package com.kind.test;

import java.util.HashMap;
import java.util.Map;

/**
 * @author zhoujifeng
 * @date 2019/12/10 20:01
 */
public class HashMapTest {

    public static void main(String[] args) {

        Map<String, String> hashMap = new HashMap<>();

        for (int i = 0; i < 1000000000; i++) {
            System.out.println("序号"+i);
            hashMap.put("序号"+i,"zhoujifeng"+i);
        }

        //hashMap.put("序号"+1,"zhoujifeng"+1);
    }
}
