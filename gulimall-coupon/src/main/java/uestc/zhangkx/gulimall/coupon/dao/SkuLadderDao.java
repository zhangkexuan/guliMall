package uestc.zhangkx.gulimall.coupon.dao;

import uestc.zhangkx.gulimall.coupon.entity.SkuLadderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品阶梯价格
 * 
 * @author zhangkx
 * @email zhangkx@gmail.com
 * @date 2019-10-08 09:36:40
 */
@Mapper
public interface SkuLadderDao extends BaseMapper<SkuLadderEntity> {
	
}
