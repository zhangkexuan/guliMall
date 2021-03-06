package uestc.zhangkx.gulimall.order.dao;

import uestc.zhangkx.gulimall.order.entity.PaymentInfoEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 支付信息表
 * 
 * @author zhangkx
 * @email zhangkx@gmail.com
 * @date 2019-10-08 09:56:16
 */
@Mapper
public interface PaymentInfoDao extends BaseMapper<PaymentInfoEntity> {
	
}
