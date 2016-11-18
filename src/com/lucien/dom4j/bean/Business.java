package com.lucien.dom4j.bean;

import com.lucien.dom4j.annotation.XMLField;

/**
  *   @author  zhanggc@qianbaocard.com
  *   @time:2016年11月17日 下午2:10:52
  *   @Description:
*/
public class Business {
    @XMLField(ordinal=1)
    private String amtTotal;
    @XMLField(ordinal=2)
    private String transCnt;
    @XMLField(ordinal=3)
    private String  fileName;
    @XMLField(ordinal=4)
    private String recordNum;
    /**
     * @return the amtTotal
     */
    public String getAmtTotal() {
        return amtTotal;
    }
    /**
     * @param amtTotal the amtTotal to set
     */
    public void setAmtTotal(String amtTotal) {
        this.amtTotal = amtTotal;
    }
    /**
     * @return the transCnt
     */
    public String getTransCnt() {
        return transCnt;
    }
    /**
     * @param transCnt the transCnt to set
     */
    public void setTransCnt(String transCnt) {
        this.transCnt = transCnt;
    }
    /**
     * @return the fileName
     */
    public String getFileName() {
        return fileName;
    }
    /**
     * @param fileName the fileName to set
     */
    public void setFileName(String fileName) {
        this.fileName = fileName;
    }
    /**
     * @return the recordNum
     */
    public String getRecordNum() {
        return recordNum;
    }
    /**
     * @param recordNum the recordNum to set
     */
    public void setRecordNum(String recordNum) {
        this.recordNum = recordNum;
    }
    /* (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
	return "Business [amtTotal=" + amtTotal + ", transCnt=" + transCnt + ", fileName=" + fileName + ", recordNum="
		+ recordNum + "]";
    }
    
}
