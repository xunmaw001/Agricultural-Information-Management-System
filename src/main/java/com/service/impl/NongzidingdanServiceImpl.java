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


import com.dao.NongzidingdanDao;
import com.entity.NongzidingdanEntity;
import com.service.NongzidingdanService;
import com.entity.vo.NongzidingdanVO;
import com.entity.view.NongzidingdanView;

@Service("nongzidingdanService")
public class NongzidingdanServiceImpl extends ServiceImpl<NongzidingdanDao, NongzidingdanEntity> implements NongzidingdanService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<NongzidingdanEntity> page = this.selectPage(
                new Query<NongzidingdanEntity>(params).getPage(),
                new EntityWrapper<NongzidingdanEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<NongzidingdanEntity> wrapper) {
		  Page<NongzidingdanView> page =new Query<NongzidingdanView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<NongzidingdanVO> selectListVO(Wrapper<NongzidingdanEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public NongzidingdanVO selectVO(Wrapper<NongzidingdanEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<NongzidingdanView> selectListView(Wrapper<NongzidingdanEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public NongzidingdanView selectView(Wrapper<NongzidingdanEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
