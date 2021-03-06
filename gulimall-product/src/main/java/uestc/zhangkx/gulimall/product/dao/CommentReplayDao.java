package uestc.zhangkx.gulimall.product.dao;

import uestc.zhangkx.gulimall.product.entity.CommentReplayEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品评价回复关系
 * 
 * @author zhangkx
 * @email zhangkx@gmail.com
 * @date 2019-10-01 21:08:48
 */
@Mapper
public interface CommentReplayDao extends BaseMapper<CommentReplayEntity> {
	
}
