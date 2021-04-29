package com.kuang.utils;

import org.junit.Test;

import java.util.UUID;

/**
 * @author Willam_xh
 * @create 2021-04-29 14:46
 */

public class IDUtils {

    public static String getId(){
        return UUID.randomUUID().toString().replaceAll("-","");
    }


    @Test
    public void test(){
        System.out.println(IDUtils.getId());

    }


}
