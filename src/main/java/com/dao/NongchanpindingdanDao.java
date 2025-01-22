package com.dao;

import com.entity.NongchanpindingdanEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.NongchanpindingdanVO;
import com.entity.view.NongchanpindingdanView;


/**
 * 农产品订单
 * 
 * @author 
 * @email 
 * @date 2022-06-15 14:56:43
 */
public interface NongchanpindingdanDao extends BaseMapper<NongchanpindingdanEntity> {
	
	List<NongchanpindingdanVO> selectListVO(@Param("ew") Wrapper<NongchanpindingdanEntity> wrapper);
	
	NongchanpindingdanVO selectVO(@Param("ew") Wrapper<NongchanpindingdanEntity> wrapper);
	
	List<NongchanpindingdanView> selectListView(@Param("ew") Wrapper<NongchanpindingdanEntity> wrapper);

	List<NongchanpindingdanView> selectListView(Pagination page,@Param("ew") Wrapper<NongchanpindingdanEntity> wrapper);
	
	NongchanpindingdanView selectView(@Param("ew") Wrapper<NongchanpindingdanEntity> wrapper);
	

}
