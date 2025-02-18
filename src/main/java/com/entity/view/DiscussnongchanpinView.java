package com.entity.view;

import com.entity.DiscussnongchanpinEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 农产品评论表
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2022-06-15 14:56:43
 */
@TableName("discussnongchanpin")
public class DiscussnongchanpinView  extends DiscussnongchanpinEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public DiscussnongchanpinView(){
	}
 
 	public DiscussnongchanpinView(DiscussnongchanpinEntity discussnongchanpinEntity){
 	try {
			BeanUtils.copyProperties(this, discussnongchanpinEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
