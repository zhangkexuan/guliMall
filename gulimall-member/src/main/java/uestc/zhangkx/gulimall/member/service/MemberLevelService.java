package uestc.zhangkx.gulimall.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import uestc.zhangkx.common.utils.PageUtils;
import uestc.zhangkx.gulimall.member.entity.MemberLevelEntity;

import java.util.Map;

/**
 * 会员等级
 *
 * @author zhangkx
 * @email zhangkx@gmail.com
 * @date 2019-10-08 09:47:05
 */
public interface MemberLevelService extends IService<MemberLevelEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

