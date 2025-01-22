package com.dao;

import com.entity.NongzidingdanEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.NongzidingdanVO;
import com.entity.view.NongzidingdanView;


/**
 * 农资订单
 * 
 * @author 
 * @email 
 * @date 2022-06-15 14:56:43
 */
public interface NongzidingdanDao extends BaseMapper<NongzidingdanEntity> {
	
	List<NongzidingdanVO> selectListVO(@Param("ew") Wrapper<NongzidingdanEntity> wrapper);
	
	NongzidingdanVO selectVO(@Param("ew") Wrapper<NongzidingdanEntity> wrapper);
	
	List<NongzidingdanView> selectListView(@Param("ew") Wrapper<NongzidingdanEntity> wrapper);

	List<NongzidingdanView> selectListView(Pagination page,@Param("ew") Wrapper<NongzidingdanEntity> wrapper);
	
	NongzidingdanView selectView(@Param("ew") Wrapper<NongzidingdanEntity> wrapper);
	

}
