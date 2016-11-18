package com.lucien.dom4j;

import java.util.Comparator;

/**
  *   @author  zhanggc@qianbaocard.com
  *   @time:2016年11月17日 下午3:49:58
  *   @Description:
*/
public class MapKeyComparator implements Comparator<Integer>{
    @Override
    public int compare(Integer o1, Integer o2) {
	return Integer.compare(o1,o2);
	
    }
}
