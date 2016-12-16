package com.lucien.dom4j;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

import org.dom4j.Document;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;

import com.lucien.dom4j.annotation.XMLField;

/**
 * @author zhanggc@qianbaocard.com
 * @time:2016年11月17日 下午1:59:38
 * @Description:
 */
public class Dom4jBeanToXml {

    public static <T> String beanToXml( T object) {
	Document doc = DocumentHelper.createDocument();
	Element root = doc.addElement(object.getClass().getSimpleName().toLowerCase());
	Dom4jBeanToXml dom4jBeanToXml = new Dom4jBeanToXml();
	try {
	    dom4jBeanToXml.generateElement(object.getClass(), object, root);
	} catch (Exception e) {
	    // TODO Auto-generated catch block
	    e.printStackTrace();
	}
	System.out.println(doc.asXML());
	return doc.asXML();
    }
    private void generateElement(Class<? extends Object> class1, Object invoke2, Element root) throws Exception {
	Field[] fields = class1.getDeclaredFields();
	Map<Integer, Field> sortMap = new TreeMap<Integer, Field>(new MapKeyComparator());
	int index = 1000;
	for (Field field : fields) {
	    XMLField annotation = field.getAnnotation(XMLField.class);
	    int ordinal = 0;
	    if (annotation != null) {
		ordinal = annotation.ordinal();
	    }
	    if (ordinal == 0) {
		ordinal = index++;
	    }
	    //防止设置顺序重复
	    if(sortMap.get(ordinal) != null){
		ordinal = (int) (ordinal+10000*Math.random());
		System.out.println("排序重复来"+ordinal);
	    }
	    sortMap.put(ordinal, field);
	}
	for (Integer key : sortMap.keySet()) {
	    Field field = sortMap.get(key);
	    XMLField annotation = field.getAnnotation(XMLField.class);
	    String name = "";
	    
	    if (annotation != null) {
		if(!annotation.name().equals("")){//如果别名存在使用别名
		    name = annotation.name();
		}else{
		    name = formatCase(field, annotation);
		}
	    } else {
		name = field.getName();
	    }
	    Method method = class1
		    .getMethod("get" + field.getName().substring(0, 1).toUpperCase() + field.getName().substring(1));
	   
	    if (annotation != null && annotation.hasNextLevel()) {
		 Element addElement = root.addElement(name);
		method.setAccessible(true);
		Object invoke = method.invoke(invoke2);
		generateElement(invoke.getClass(), invoke, addElement);
	    } else {
		Object invoke = method.invoke(invoke2);
		if(invoke!= null){
		    Element addElement = root.addElement(name);
		    addElement.setText(method.invoke(invoke2).toString());
		}
	    }
	}
    }

    private String formatCase(Field field, XMLField annotation) {

	String name = field.getName();
	String format = annotation.format();
	switch (format) {
	case "upper":
	    name = name.toUpperCase();
	    break;
	case "lower":
	    name = name.toLowerCase();
	    break;
	}
	return name;
    }
    
    public static <T>String getEncrypt(T t){
	StringBuffer emcryptString = new StringBuffer(10);
	Map<String, String> allSortMap = new TreeMap<String, String>(new MapKeySelfComparator());
	try {
	     getEncrypt(t,allSortMap,"0");
	} catch (Exception e) {
	    // TODO Auto-generated catch block
	    e.printStackTrace();
	}
	StringBuffer sb = new StringBuffer(10);
	StringBuffer sb1 = new StringBuffer(10);
	for(String i :allSortMap.keySet()){
	    System.out.println("getEncrypt:"+i);
	    sb1.append(i+" ");
	    sb.append(allSortMap.get(i)+" ");
	}
	System.out.println("key:"+sb1.toString());
	System.out.println("value:"+sb.toString());
	return "";
    }
    /**
      *   @author  zhanggc@qianbaocard.com
      *   @time:2016年11月18日 上午10:41:59
      *   @Description:
      *   @param t
      *   @param allSortMap
      *   @param ordinal
      *   @throws Exception
     */
    public static  <T>void getEncrypt(T t,Map<String, String> allSortMap,String ordinal) throws Exception{
	for(Field field:t.getClass().getDeclaredFields()){
	    XMLField annotation = field.getAnnotation(XMLField.class);
	    Method method = t.getClass()
		    .getMethod("get" + field.getName().substring(0, 1).toUpperCase() + field.getName().substring(1));
	 method.setAccessible(true);
	 Object invoke = method.invoke(t);
	    if(annotation.hasNextLevel()){
		System.out.println("ordinal :"+annotation.ordinal());
		String level =(ordinal.equals("0")?"":String.valueOf(ordinal))+ String.valueOf(annotation.ordinal());
		System.out.println("level:"+level);
		 getEncrypt(invoke,allSortMap,level+"'");
	    }else{
		String level =ordinal+ String.valueOf(annotation.ordinal());
		System.out.println("ordinalTemp:"+level);
		if(annotation.isEncrypt()){
		    allSortMap.put(level, (String)invoke);
		}
	    }
	    
	}
    }

}
