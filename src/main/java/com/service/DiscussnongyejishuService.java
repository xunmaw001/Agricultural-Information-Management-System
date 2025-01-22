package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DiscussnongyejishuEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DiscussnongyejishuVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DiscussnongyejishuView;


/**
 * 农业技术评论表
 *
 * @author 
 * @email 
 * @date 2022-06-15 14:56:43
 */
public interface DiscussnongyejishuService extends IService<DiscussnongyejishuEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiscussnongyejishuVO> selectListVO(Wrapper<DiscussnongyejishuEntity> wrapper);
   	
   	DiscussnongyejishuVO selectVO(@Param("ew") Wrapper<DiscussnongyejishuEntity> wrapper);
   	
   	List<DiscussnongyejishuView> selectListView(Wrapper<DiscussnongyejishuEntity> wrapper);
   	
   	DiscussnongyejishuView selectView(@Param("ew") Wrapper<DiscussnongyejishuEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiscussnongyejishuEntity> wrapper);
   	

}

