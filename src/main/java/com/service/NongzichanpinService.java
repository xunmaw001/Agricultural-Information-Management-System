package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.NongzichanpinEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.NongzichanpinVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.NongzichanpinView;


/**
 * 农资产品
 *
 * @author 
 * @email 
 * @date 2022-06-15 14:56:43
 */
public interface NongzichanpinService extends IService<NongzichanpinEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<NongzichanpinVO> selectListVO(Wrapper<NongzichanpinEntity> wrapper);
   	
   	NongzichanpinVO selectVO(@Param("ew") Wrapper<NongzichanpinEntity> wrapper);
   	
   	List<NongzichanpinView> selectListView(Wrapper<NongzichanpinEntity> wrapper);
   	
   	NongzichanpinView selectView(@Param("ew") Wrapper<NongzichanpinEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<NongzichanpinEntity> wrapper);
   	

}

