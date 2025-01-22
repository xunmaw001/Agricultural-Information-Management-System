package com.dao;

import com.entity.NongzileixingEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.NongzileixingVO;
import com.entity.view.NongzileixingView;


/**
 * 农资类型
 * 
 * @author 
 * @email 
 * @date 2022-06-15 14:56:43
 */
public interface NongzileixingDao extends BaseMapper<NongzileixingEntity> {
	
	List<NongzileixingVO> selectListVO(@Param("ew") Wrapper<NongzileixingEntity> wrapper);
	
	NongzileixingVO selectVO(@Param("ew") Wrapper<NongzileixingEntity> wrapper);
	
	List<NongzileixingView> selectListView(@Param("ew") Wrapper<NongzileixingEntity> wrapper);

	List<NongzileixingView> selectListView(Pagination page,@Param("ew") Wrapper<NongzileixingEntity> wrapper);
	
	NongzileixingView selectView(@Param("ew") Wrapper<NongzileixingEntity> wrapper);
	

}
