package uestc.zhangkx.gulimall.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import uestc.zhangkx.common.utils.PageUtils;
import uestc.zhangkx.gulimall.order.entity.OrderReturnReasonEntity;

import java.util.Map;

/**
 * 退货原因
 *
 * @author zhangkx
 * @email zhangkx@gmail.com
 * @date 2019-10-08 09:56:16
 */
public interface OrderReturnReasonService extends IService<OrderReturnReasonEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

