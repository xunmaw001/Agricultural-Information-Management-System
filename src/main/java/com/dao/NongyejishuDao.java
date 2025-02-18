package com.dao;

import com.entity.NongyejishuEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.NongyejishuVO;
import com.entity.view.NongyejishuView;


/**
 * 农业技术
 * 
 * @author 
 * @email 
 * @date 2022-06-15 14:56:43
 */
public interface NongyejishuDao extends BaseMapper<NongyejishuEntity> {
	
	List<NongyejishuVO> selectListVO(@Param("ew") Wrapper<NongyejishuEntity> wrapper);
	
	NongyejishuVO selectVO(@Param("ew") Wrapper<NongyejishuEntity> wrapper);
	
	List<NongyejishuView> selectListView(@Param("ew") Wrapper<NongyejishuEntity> wrapper);

	List<NongyejishuView> selectListView(Pagination page,@Param("ew") Wrapper<NongyejishuEntity> wrapper);
	
	NongyejishuView selectView(@Param("ew") Wrapper<NongyejishuEntity> wrapper);
	

}
