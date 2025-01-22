package com.dao;

import com.entity.NongzichanpinEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.NongzichanpinVO;
import com.entity.view.NongzichanpinView;


/**
 * 农资产品
 * 
 * @author 
 * @email 
 * @date 2022-06-15 14:56:43
 */
public interface NongzichanpinDao extends BaseMapper<NongzichanpinEntity> {
	
	List<NongzichanpinVO> selectListVO(@Param("ew") Wrapper<NongzichanpinEntity> wrapper);
	
	NongzichanpinVO selectVO(@Param("ew") Wrapper<NongzichanpinEntity> wrapper);
	
	List<NongzichanpinView> selectListView(@Param("ew") Wrapper<NongzichanpinEntity> wrapper);

	List<NongzichanpinView> selectListView(Pagination page,@Param("ew") Wrapper<NongzichanpinEntity> wrapper);
	
	NongzichanpinView selectView(@Param("ew") Wrapper<NongzichanpinEntity> wrapper);
	

}
