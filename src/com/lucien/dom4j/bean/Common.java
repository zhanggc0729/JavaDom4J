package com.lucien.dom4j.bean;

import com.lucien.dom4j.annotation.XMLField;

/**
  *   @author  zhanggc@qianbaocard.com
  *   @time:2016年11月17日 下午2:08:15
  *   @Description:
*/
public class Common {
    @XMLField(ordinal=1)
    private String transCode;
    @XMLField(ordinal=2)
    private String orgNo;
    @XMLField(ordinal=3)
    private String optNo;
    @XMLField(ordinal=4)
    private String  reqSeqNo;
    @XMLField(ordinal=5)
    private String  reqDate;
    @XMLField(ordinal=6)
    private String  reqTime;
    @XMLField(ordinal=7)
    private String  authNo;
    @XMLField(ordinal=8)
    private String  bsType;
    @XMLField(ordinal=11)
    private String sign;
    @XMLField(ordinal=10,hasNextLevel=true)
    private Demo demo;
    
    /**
     * @return the demo
     */
    public Demo getDemo() {
        return demo;
    }
    /**
     * @param demo the demo to set
     */
    public void setDemo(Demo demo) {
        this.demo = demo;
    }
    /**
     * @return the transCode
     */
    public String getTransCode() {
        return transCode;
    }
    /**
     * @param transCode the transCode to set
     */
    public void setTransCode(String transCode) {
        this.transCode = transCode;
    }
    /**
     * @return the orgNo
     */
    public String getOrgNo() {
        return orgNo;
    }
    /**
     * @param orgNo the orgNo to set
     */
    public void setOrgNo(String orgNo) {
        this.orgNo = orgNo;
    }
    /**
     * @return the optNo
     */
    public String getOptNo() {
        return optNo;
    }
    /**
     * @param optNo the optNo to set
     */
    public void setOptNo(String optNo) {
        this.optNo = optNo;
    }
    /**
     * @return the reqSeqNo
     */
    public String getReqSeqNo() {
        return reqSeqNo;
    }
    /**
     * @param reqSeqNo the reqSeqNo to set
     */
    public void setReqSeqNo(String reqSeqNo) {
        this.reqSeqNo = reqSeqNo;
    }
    /**
     * @return the reqDate
     */
    public String getReqDate() {
        return reqDate;
    }
    /**
     * @param reqDate the reqDate to set
     */
    public void setReqDate(String reqDate) {
        this.reqDate = reqDate;
    }
    /**
     * @return the reqTime
     */
    public String getReqTime() {
        return reqTime;
    }
    /**
     * @param reqTime the reqTime to set
     */
    public void setReqTime(String reqTime) {
        this.reqTime = reqTime;
    }
    /**
     * @return the authNo
     */
    public String getAuthNo() {
        return authNo;
    }
    /**
     * @param authNo the authNo to set
     */
    public void setAuthNo(String authNo) {
        this.authNo = authNo;
    }
    /**
     * @return the bsType
     */
    public String getBsType() {
        return bsType;
    }
    /**
     * @param bsType the bsType to set
     */
    public void setBsType(String bsType) {
        this.bsType = bsType;
    }
    /**
     * @return the sign
     */
    public String getSign() {
        return sign;
    }
    /**
     * @param sign the sign to set
     */
    public void setSign(String sign) {
        this.sign = sign;
    }
    /* (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
	return "Common [transCode=" + transCode + ", orgNo=" + orgNo + ", optNo=" + optNo + ", reqSeqNo=" + reqSeqNo
		+ ", reqDate=" + reqDate + ", reqTime=" + reqTime + ", authNo=" + authNo + ", bsType=" + bsType
		+ ", sign=" + sign + "]";
    }
    
   
}
