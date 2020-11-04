package uestc.zhangkx.gulimall.ware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import uestc.zhangkx.common.utils.PageUtils;
import uestc.zhangkx.gulimall.ware.entity.PurchaseDetailEntity;

import java.util.List;
import java.util.Map;

/**
 * 
 *
 * @author zhangkx
 * @email zhangkx@gmail.com
 * @date 2019-11-17 13:50:10
 */
public interface PurchaseDetailService extends IService<PurchaseDetailEntity> {

    PageUtils queryPage(Map<String, Object> params);

    List<PurchaseDetailEntity> listDetailByPurchaseId(Long id);


}

