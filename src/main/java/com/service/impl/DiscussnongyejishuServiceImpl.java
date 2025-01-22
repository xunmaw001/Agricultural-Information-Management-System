package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.DiscussnongyejishuDao;
import com.entity.DiscussnongyejishuEntity;
import com.service.DiscussnongyejishuService;
import com.entity.vo.DiscussnongyejishuVO;
import com.entity.view.DiscussnongyejishuView;

@Service("discussnongyejishuService")
public class DiscussnongyejishuServiceImpl extends ServiceImpl<DiscussnongyejishuDao, DiscussnongyejishuEntity> implements DiscussnongyejishuService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DiscussnongyejishuEntity> page = this.selectPage(
                new Query<DiscussnongyejishuEntity>(params).getPage(),
                new EntityWrapper<DiscussnongyejishuEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DiscussnongyejishuEntity> wrapper) {
		  Page<DiscussnongyejishuView> page =new Query<DiscussnongyejishuView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DiscussnongyejishuVO> selectListVO(Wrapper<DiscussnongyejishuEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DiscussnongyejishuVO selectVO(Wrapper<DiscussnongyejishuEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DiscussnongyejishuView> selectListView(Wrapper<DiscussnongyejishuEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DiscussnongyejishuView selectView(Wrapper<DiscussnongyejishuEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
