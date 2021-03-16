package com.zippozu.passjavaquestion.question.dao;

import com.zippozu.passjavaquestion.question.entity.TypeEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 题目-题目类型表
 * 
 * @author zippo_zu
 * @email zippo_zu@163.com
 * @date 2021-03-16 15:48:08
 */
@Mapper
public interface TypeDao extends BaseMapper<TypeEntity> {
	
}
