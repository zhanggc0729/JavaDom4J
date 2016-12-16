package com.lucien.dom4j.test;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.TreeMap;

import com.lucien.dom4j.Dom4jBeanToXml;
import com.lucien.dom4j.MapKeyComparator;
import com.lucien.dom4j.bean.Business;
import com.lucien.dom4j.bean.Common;
import com.lucien.dom4j.bean.Demo;
import com.lucien.dom4j.bean.Frxbfj;

/**
  *   @author  zhanggc@qianbaocard.com
  *   @time:2016年11月17日 下午2:56:30
  *   @Description:
*/
public class MainMethodTest {
    public static void main(String[] args) throws Exception {
	Frxbfj frxbfj = new Frxbfj();
	Common common= new Common();
	int i = 1 ;
	for(Field field :common.getClass().getDeclaredFields()){
	    
	  
	   
		if(field.getName().equals("demo")){
		    Method method = common.getClass().getDeclaredMethod("set" +field.getName().substring(0, 1) .toUpperCase() +field.getName().substring(1),Demo.class);
		    method.setAccessible(true);
		    Demo demo = new Demo();
			demo.setName("------");
			method.invoke(common, demo);
		}else{
		    Method method = common.getClass().getDeclaredMethod("set" +field.getName().substring(0, 1) .toUpperCase() +field.getName().substring(1),String.class);
		    method.setAccessible(true);
		    method.invoke(common, String.valueOf(i++));
		}
	   
	};
	frxbfj.setCommon(common);
	Business business = new Business();
	for(Field field :business.getClass().getDeclaredFields()){
	    System.out.println(i+""+i%2);
	    if(i%2!=0){
		
		Method method = business.getClass().getDeclaredMethod("set" +field.getName().substring(0, 1) .toUpperCase() +field.getName().substring(1),String.class);
		method.setAccessible(true);
		
		method.invoke(business, String.valueOf(i++));
	    }
	    i++;
	}
	frxbfj.setBusiness(business);
	
	System.out.println(frxbfj.toString());
	Dom4jBeanToXml.beanToXml(frxbfj);
	//Dom4jBeanToXml .getEncrypt(frxbfj);
    }
}
