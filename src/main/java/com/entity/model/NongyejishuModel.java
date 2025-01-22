package com.entity.model;

import com.entity.NongyejishuEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;
 

/**
 * 农业技术
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2022-06-15 14:56:43
 */
public class NongyejishuModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 封面
	 */
	
	private String fengmian;
		
	/**
	 * 作用
	 */
	
	private String zuoyong;
		
	/**
	 * 产地
	 */
	
	private String chandi;
		
	/**
	 * 适宜温度
	 */
	
	private String shiyiwendu;
		
	/**
	 * 适宜湿度
	 */
	
	private String shiyishidu;
		
	/**
	 * 日照时长
	 */
	
	private String rizhaoshizhang;
		
	/**
	 * 视频
	 */
	
	private String shipin;
		
	/**
	 * 营业价值
	 */
	
	private String yingyejiazhi;
		
	/**
	 * 注意事项
	 */
	
	private String zhuyishixiang;
				
	
	/**
	 * 设置：封面
	 */
	 
	public void setFengmian(String fengmian) {
		this.fengmian = fengmian;
	}
	
	/**
	 * 获取：封面
	 */
	public String getFengmian() {
		return fengmian;
	}
				
	
	/**
	 * 设置：作用
	 */
	 
	public void setZuoyong(String zuoyong) {
		this.zuoyong = zuoyong;
	}
	
	/**
	 * 获取：作用
	 */
	public String getZuoyong() {
		return zuoyong;
	}
				
	
	/**
	 * 设置：产地
	 */
	 
	public void setChandi(String chandi) {
		this.chandi = chandi;
	}
	
	/**
	 * 获取：产地
	 */
	public String getChandi() {
		return chandi;
	}
				
	
	/**
	 * 设置：适宜温度
	 */
	 
	public void setShiyiwendu(String shiyiwendu) {
		this.shiyiwendu = shiyiwendu;
	}
	
	/**
	 * 获取：适宜温度
	 */
	public String getShiyiwendu() {
		return shiyiwendu;
	}
				
	
	/**
	 * 设置：适宜湿度
	 */
	 
	public void setShiyishidu(String shiyishidu) {
		this.shiyishidu = shiyishidu;
	}
	
	/**
	 * 获取：适宜湿度
	 */
	public String getShiyishidu() {
		return shiyishidu;
	}
				
	
	/**
	 * 设置：日照时长
	 */
	 
	public void setRizhaoshizhang(String rizhaoshizhang) {
		this.rizhaoshizhang = rizhaoshizhang;
	}
	
	/**
	 * 获取：日照时长
	 */
	public String getRizhaoshizhang() {
		return rizhaoshizhang;
	}
				
	
	/**
	 * 设置：视频
	 */
	 
	public void setShipin(String shipin) {
		this.shipin = shipin;
	}
	
	/**
	 * 获取：视频
	 */
	public String getShipin() {
		return shipin;
	}
				
	
	/**
	 * 设置：营业价值
	 */
	 
	public void setYingyejiazhi(String yingyejiazhi) {
		this.yingyejiazhi = yingyejiazhi;
	}
	
	/**
	 * 获取：营业价值
	 */
	public String getYingyejiazhi() {
		return yingyejiazhi;
	}
				
	
	/**
	 * 设置：注意事项
	 */
	 
	public void setZhuyishixiang(String zhuyishixiang) {
		this.zhuyishixiang = zhuyishixiang;
	}
	
	/**
	 * 获取：注意事项
	 */
	public String getZhuyishixiang() {
		return zhuyishixiang;
	}
			
}
