package com.lucien.dom4j.bean;

import com.lucien.dom4j.annotation.XMLField;
import com.lucien.dom4j.annotation.XMLRoot;

/**
  *   @author  zhanggc@qianbaocard.com
  *   @time:2016年11月17日 下午2:07:02
  *   @Description:
*/
@XMLRoot(name="frxbfj")
public class Frxbfj {
    @XMLField(hasNextLevel=true,ordinal=1)
    private Common common;
    @XMLField(hasNextLevel=true,ordinal=2)
    private Business business;
    /**
     * @return the common
     */
    public Common getCommon() {
        return common;
    }
    /**
     * @param common the common to set
     */
    public void setCommon(Common common) {
        this.common = common;
    }
    /**
     * @return the business
     */
    public Business getBusiness() {
        return business;
    }
    /**
     * @param business the business to set
     */
    public void setBusiness(Business business) {
        this.business = business;
    }
    /* (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
	return "Frxbfj [common=" + common + ", business=" + business + "]";
    }
    
}
