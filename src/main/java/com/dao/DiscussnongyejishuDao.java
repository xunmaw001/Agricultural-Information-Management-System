package com.dao;

import com.entity.DiscussnongyejishuEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DiscussnongyejishuVO;
import com.entity.view.DiscussnongyejishuView;


/**
 * 农业技术评论表
 * 
 * @author 
 * @email 
 * @date 2022-06-15 14:56:43
 */
public interface DiscussnongyejishuDao extends BaseMapper<DiscussnongyejishuEntity> {
	
	List<DiscussnongyejishuVO> selectListVO(@Param("ew") Wrapper<DiscussnongyejishuEntity> wrapper);
	
	DiscussnongyejishuVO selectVO(@Param("ew") Wrapper<DiscussnongyejishuEntity> wrapper);
	
	List<DiscussnongyejishuView> selectListView(@Param("ew") Wrapper<DiscussnongyejishuEntity> wrapper);

	List<DiscussnongyejishuView> selectListView(Pagination page,@Param("ew") Wrapper<DiscussnongyejishuEntity> wrapper);
	
	DiscussnongyejishuView selectView(@Param("ew") Wrapper<DiscussnongyejishuEntity> wrapper);
	

}
