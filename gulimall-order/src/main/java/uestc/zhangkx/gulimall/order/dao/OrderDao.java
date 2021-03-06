package uestc.zhangkx.gulimall.order.dao;

import uestc.zhangkx.gulimall.order.entity.OrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 * 
 * @author zhangkx
 * @email zhangkx@gmail.com
 * @date 2019-10-08 09:56:16
 */
@Mapper
public interface OrderDao extends BaseMapper<OrderEntity> {
	
}
