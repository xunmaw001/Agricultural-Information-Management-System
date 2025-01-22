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


import com.dao.NongchanpindingdanDao;
import com.entity.NongchanpindingdanEntity;
import com.service.NongchanpindingdanService;
import com.entity.vo.NongchanpindingdanVO;
import com.entity.view.NongchanpindingdanView;

@Service("nongchanpindingdanService")
public class NongchanpindingdanServiceImpl extends ServiceImpl<NongchanpindingdanDao, NongchanpindingdanEntity> implements NongchanpindingdanService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<NongchanpindingdanEntity> page = this.selectPage(
                new Query<NongchanpindingdanEntity>(params).getPage(),
                new EntityWrapper<NongchanpindingdanEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<NongchanpindingdanEntity> wrapper) {
		  Page<NongchanpindingdanView> page =new Query<NongchanpindingdanView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<NongchanpindingdanVO> selectListVO(Wrapper<NongchanpindingdanEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public NongchanpindingdanVO selectVO(Wrapper<NongchanpindingdanEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<NongchanpindingdanView> selectListView(Wrapper<NongchanpindingdanEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public NongchanpindingdanView selectView(Wrapper<NongchanpindingdanEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
