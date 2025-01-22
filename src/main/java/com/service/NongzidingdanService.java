package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.NongzidingdanEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.NongzidingdanVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.NongzidingdanView;


/**
 * 农资订单
 *
 * @author 
 * @email 
 * @date 2022-06-15 14:56:43
 */
public interface NongzidingdanService extends IService<NongzidingdanEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<NongzidingdanVO> selectListVO(Wrapper<NongzidingdanEntity> wrapper);
   	
   	NongzidingdanVO selectVO(@Param("ew") Wrapper<NongzidingdanEntity> wrapper);
   	
   	List<NongzidingdanView> selectListView(Wrapper<NongzidingdanEntity> wrapper);
   	
   	NongzidingdanView selectView(@Param("ew") Wrapper<NongzidingdanEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<NongzidingdanEntity> wrapper);
   	

}

