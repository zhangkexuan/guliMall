package uestc.zhangkx.gulimall.member.dao;

import uestc.zhangkx.gulimall.member.entity.MemberLoginLogEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员登录记录
 * 
 * @author zhangkx
 * @email zhangkx@gmail.com
 * @date 2019-10-08 09:47:05
 */
@Mapper
public interface MemberLoginLogDao extends BaseMapper<MemberLoginLogEntity> {
	
}
