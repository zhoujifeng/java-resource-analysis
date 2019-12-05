package com.kind.test;

import java.util.ArrayList;

/**
 * @author zhoujifeng
 * @date 2019/12/5 11:18
 */
public class ArrEqualsTest {

    private static final Object[] DEFAULTCAPACITY_EMPTY_ELEMENTDATA = {};

    public static void main(String[] args) {
        Object[] arr1 = {};
        Object[] arr2 = DEFAULTCAPACITY_EMPTY_ELEMENTDATA;
        System.out.println(arr2 == DEFAULTCAPACITY_EMPTY_ELEMENTDATA);

        ArrayList arrayList = new ArrayList();
    }
}
