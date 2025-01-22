package com.entity.view;

import com.entity.NongzidingdanEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 农资订单
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2022-06-15 14:56:43
 */
@TableName("nongzidingdan")
public class NongzidingdanView  extends NongzidingdanEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public NongzidingdanView(){
	}
 
 	public NongzidingdanView(NongzidingdanEntity nongzidingdanEntity){
 	try {
			BeanUtils.copyProperties(this, nongzidingdanEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
