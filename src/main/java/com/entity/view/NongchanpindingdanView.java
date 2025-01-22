package com.entity.view;

import com.entity.NongchanpindingdanEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 农产品订单
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2022-06-15 14:56:43
 */
@TableName("nongchanpindingdan")
public class NongchanpindingdanView  extends NongchanpindingdanEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public NongchanpindingdanView(){
	}
 
 	public NongchanpindingdanView(NongchanpindingdanEntity nongchanpindingdanEntity){
 	try {
			BeanUtils.copyProperties(this, nongchanpindingdanEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
