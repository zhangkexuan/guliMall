package uestc.zhangkx.gulimall.coupon.dao;

import uestc.zhangkx.gulimall.coupon.entity.CouponSpuRelationEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券与产品关联
 * 
 * @author zhangkx
 * @email zhangkx@gmail.com
 * @date 2019-10-08 09:36:40
 */
@Mapper
public interface CouponSpuRelationDao extends BaseMapper<CouponSpuRelationEntity> {
	
}
