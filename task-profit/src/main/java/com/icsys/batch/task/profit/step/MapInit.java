package com.icsys.batch.task.profit.step;

import java.util.HashMap;
import java.util.Map;

/**
 * 此类初始化生成要生成文件名的连个map
 * @author SDNX
 *
 */
public class MapInit {
	/**
	 * 获得在卡号78两位和对应地区的值map
	 * @return
	 */
	public static Map<String,String> getAdressMap(){
		Map<String,String> adressMap = new HashMap<String,String>();
		adressMap.put("JN","ISDAJNF.FCREOVFE.PS.");                                             
		adressMap.put("QD","ISDAQDF.FCREOVFE.PS.");                                             
		adressMap.put("ZB","ISDAZBF.FCREOVFE.PS.");                                             
		adressMap.put("ZZ","ISDAZZF.FCREOVFE.PS.");                                             
		adressMap.put("DY","ISDADYF.FCREOVFE.PS.");                                             
		adressMap.put("YT","ISDAYTF.FCREOVFE.PS.");                                             
		adressMap.put("WF","ISDAWFF.FCREOVFE.PS.");                                             
		adressMap.put("JL","ISDAJLF.FCREOVFE.PS.");                                             
		adressMap.put("TA","ISDATAF.FCREOVFE.PS.");                                             
		adressMap.put("WH","ISDAWHF.FCREOVFE.PS.");                                             
		adressMap.put("RZ","ISDARZF.FCREOVFE.PS.");                                             
		adressMap.put("LW","ISDALWF.FCREOVFE.PS.");                                             
		adressMap.put("BZ","ISDABZF.FCREOVFE.PS.");                                             
		adressMap.put("DZ","ISDADZF.FCREOVFE.PS.");                                             
		adressMap.put("LC","ISDALCF.FCREOVFE.PS.");                                             
		adressMap.put("LY","ISDALYF.FCREOVFE.PS.");                                             
		adressMap.put("HZ","ISDAHZF.FCREOVFE.PS.");                                             
		return adressMap;                                                                       
	}   
	public static Map<String,String> getAreaMap(){
		Map<String,String> adressMap = new HashMap<String,String>();
		adressMap.put("01","JN");
		adressMap.put("02","QD");
		adressMap.put("03","ZB");
		adressMap.put("04","ZZ");
		adressMap.put("05","DY");
		adressMap.put("06","YT");
		adressMap.put("07","WF");
		adressMap.put("08","JL");
		adressMap.put("09","TA");
		adressMap.put("10","WH");
		adressMap.put("11","RZ");
		adressMap.put("12","LW");
		adressMap.put("13","BZ");
		adressMap.put("14","DZ");
		adressMap.put("15","LC");
		adressMap.put("16","LY");
		adressMap.put("17","HZ");                                           
		return adressMap;                                                                       
	} 
	/**                                                                              	      
	 * 根据对应的key来存放filecontent                                                         
	 * @return                                                                       			  
	 */                                                                              			  
	public static Map<String,StringBuilder> getFileContent(){                        			  
		Map<String,StringBuilder> fileContentMap = new HashMap<String,StringBuilder>();			  
		fileContentMap.put("JN",new StringBuilder(""));                                  			  
		fileContentMap.put("QD",new StringBuilder(""));                                  			  
		fileContentMap.put("ZB",new StringBuilder(""));                                  			  
		fileContentMap.put("ZZ",new StringBuilder(""));                                  			  
		fileContentMap.put("DY",new StringBuilder(""));                                  			  
		fileContentMap.put("YT",new StringBuilder(""));                                  			  
		fileContentMap.put("WF",new StringBuilder(""));                                  			  
		fileContentMap.put("JL",new StringBuilder(""));                                  			  
		fileContentMap.put("TA",new StringBuilder(""));                                  			  
		fileContentMap.put("WH",new StringBuilder(""));                                  			  
		fileContentMap.put("RZ",new StringBuilder(""));                                  			  
		fileContentMap.put("LW",new StringBuilder(""));                                  			  
		fileContentMap.put("BZ",new StringBuilder(""));                                     		
		fileContentMap.put("DZ",new StringBuilder(""));                                         
		fileContentMap.put("LC",new StringBuilder(""));                                         
		fileContentMap.put("LY",new StringBuilder(""));                                         
		fileContentMap.put("HZ",new StringBuilder(""));                                         

		return fileContentMap;
	}
}
