package uestc.zhangkx.gulimall.coupon.service;

import uestc.zhangkx.common.to.SkuReductionTo;
import com.baomidou.mybatisplus.extension.service.IService;
import uestc.zhangkx.common.utils.PageUtils;
import uestc.zhangkx.gulimall.coupon.entity.SkuFullReductionEntity;

import java.util.Map;

/**
 * 商品满减信息
 *
 * @author zhangkx
 * @email zhangkx@gmail.com
 * @date 2019-10-08 09:36:40
 */
public interface SkuFullReductionService extends IService<SkuFullReductionEntity> {

    PageUtils queryPage(Map<String, Object> params);

    void saveSkuReduction(SkuReductionTo reductionTo);


}

