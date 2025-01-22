package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DiscussnongzichanpinEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DiscussnongzichanpinVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DiscussnongzichanpinView;


/**
 * 农资产品评论表
 *
 * @author 
 * @email 
 * @date 2022-06-15 14:56:43
 */
public interface DiscussnongzichanpinService extends IService<DiscussnongzichanpinEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiscussnongzichanpinVO> selectListVO(Wrapper<DiscussnongzichanpinEntity> wrapper);
   	
   	DiscussnongzichanpinVO selectVO(@Param("ew") Wrapper<DiscussnongzichanpinEntity> wrapper);
   	
   	List<DiscussnongzichanpinView> selectListView(Wrapper<DiscussnongzichanpinEntity> wrapper);
   	
   	DiscussnongzichanpinView selectView(@Param("ew") Wrapper<DiscussnongzichanpinEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiscussnongzichanpinEntity> wrapper);
   	

}

