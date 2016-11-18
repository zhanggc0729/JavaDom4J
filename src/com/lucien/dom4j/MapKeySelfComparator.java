package com.lucien.dom4j;

import java.util.Comparator;

/**
  *   @author  zhanggc@qianbaocard.com
  *   @time:2016年11月18日 上午9:46:14
  *   @Description:
*/
public class MapKeySelfComparator implements Comparator<String>{
    //key:1'1 1'2 1'3 1'4 1'5 1'6 1'7 1'8 1'10'1 1'11 2'1 2'2 2'3 2'4 
   // value:1 2 3 4 5 6 7 8 ------ 9 10 11 12 13 
    @Override
    public int compare(String o1, String o2) {
	String str1s[] = o1.split("'");
	String str2s[] = o2.split("'");
	int length = str2s.length >str1s.length ? str1s.length:str2s.length;
	//先进行共同长度的比较
	for(int i = 0 ; i <length;i++){
	    if(Integer.valueOf(str1s[i])>Integer.valueOf(str2s[i])){
		return 1;
	    }else if(Integer.valueOf(str1s[i])<Integer.valueOf(str2s[i])){
		return -1;
	    }
	}
	//判断长度小的大于长度大的
	if( str1s.length >str2s.length){
	    return -1;
	}else if(str1s.length <str2s.length){
	    return 1;
	}
	return 0;
    }

}
