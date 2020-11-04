package uestc.zhangkx.gulimall.coupon.dao;

import uestc.zhangkx.gulimall.coupon.entity.SeckillSessionEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 秒杀活动场次
 * 
 * @author zhangkx
 * @email zhangkx@gmail.com
 * @date 2019-10-08 09:36:40
 */
@Mapper
public interface SeckillSessionDao extends BaseMapper<SeckillSessionEntity> {
	
}
