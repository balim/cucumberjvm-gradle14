package com.example.cuke;

import java.util.Properties;

public class SomeTokenBean {
    private String aField;

    public SomeTokenBean() {
        final Properties properties = System.getProperties();
        try {
//            properties.storeToXML(System.out, "dump properties");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public String getaField() {
        return aField;
    }

    public void setaField(String aField) {
        this.aField = aField;
    }
}
