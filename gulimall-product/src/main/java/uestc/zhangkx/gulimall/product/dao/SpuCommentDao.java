package uestc.zhangkx.gulimall.product.dao;

import uestc.zhangkx.gulimall.product.entity.SpuCommentEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品评价
 * 
 * @author zhangkx
 * @email zhangkx@gmail.com
 * @date 2019-10-01 21:08:49
 */
@Mapper
public interface SpuCommentDao extends BaseMapper<SpuCommentEntity> {
	
}
