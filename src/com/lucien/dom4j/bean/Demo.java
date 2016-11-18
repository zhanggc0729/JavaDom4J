package com.lucien.dom4j.bean;

import com.lucien.dom4j.annotation.XMLField;

/**
  *   @author  zhanggc@qianbaocard.com
  *   @time:2016年11月17日 下午5:57:38
  *   @Description:
*/
public class Demo {
    @XMLField(ordinal=1)
    private String name;

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }
    
}
