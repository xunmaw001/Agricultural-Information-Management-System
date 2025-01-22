package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.NongchanpindingdanEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.NongchanpindingdanVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.NongchanpindingdanView;


/**
 * 农产品订单
 *
 * @author 
 * @email 
 * @date 2022-06-15 14:56:43
 */
public interface NongchanpindingdanService extends IService<NongchanpindingdanEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<NongchanpindingdanVO> selectListVO(Wrapper<NongchanpindingdanEntity> wrapper);
   	
   	NongchanpindingdanVO selectVO(@Param("ew") Wrapper<NongchanpindingdanEntity> wrapper);
   	
   	List<NongchanpindingdanView> selectListView(Wrapper<NongchanpindingdanEntity> wrapper);
   	
   	NongchanpindingdanView selectView(@Param("ew") Wrapper<NongchanpindingdanEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<NongchanpindingdanEntity> wrapper);
   	

}

