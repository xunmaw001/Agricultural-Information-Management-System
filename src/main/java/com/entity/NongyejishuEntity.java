package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;


/**
 * 农业技术
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2022-06-15 14:56:43
 */
@TableName("nongyejishu")
public class NongyejishuEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public NongyejishuEntity() {
		
	}
	
	public NongyejishuEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * 主键id
	 */
	@TableId
	private Long id;
	/**
	 * 农作物名称
	 */
					
	private String nongzuowumingcheng;
	
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
	
	
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
	private Date addtime;

	public Date getAddtime() {
		return addtime;
	}
	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * 设置：农作物名称
	 */
	public void setNongzuowumingcheng(String nongzuowumingcheng) {
		this.nongzuowumingcheng = nongzuowumingcheng;
	}
	/**
	 * 获取：农作物名称
	 */
	public String getNongzuowumingcheng() {
		return nongzuowumingcheng;
	}
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
