package com.sunzhen;

import java.util.HashMap;

public class MyMapping {
    public static HashMap<String,String> mapping = new HashMap<String,String>();

    static{
        mapping.put("/mytomcat","com.sunzhen.MyServlet");
    }

    public HashMap<String,String> getMapping(){
        return mapping;
    }

}
