package uestc.zhangkx.gulimall.ware.dao;

import uestc.zhangkx.gulimall.ware.entity.PurchaseEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 采购信息
 * 
 * @author zhangkx
 * @email zhangkx@gmail.com
 * @date 2019-11-17 13:50:10
 */
@Mapper
public interface PurchaseDao extends BaseMapper<PurchaseEntity> {
	
}
