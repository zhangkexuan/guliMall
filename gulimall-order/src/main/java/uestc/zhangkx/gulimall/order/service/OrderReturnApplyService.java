package uestc.zhangkx.gulimall.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import uestc.zhangkx.common.utils.PageUtils;
import uestc.zhangkx.gulimall.order.entity.OrderReturnApplyEntity;

import java.util.Map;

/**
 * 订单退货申请
 *
 * @author zhangkx
 * @email zhangkx@gmail.com
 * @date 2019-10-08 09:56:16
 */
public interface OrderReturnApplyService extends IService<OrderReturnApplyEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

