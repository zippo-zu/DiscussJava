package com.zippozu.passjavaquestion.question.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.zippozu.common.utils.PageUtils;
import com.zippozu.passjavaquestion.question.entity.TypeEntity;

import java.util.Map;

/**
 * 题目-题目类型表
 *
 * @author zippo_zu
 * @email zippo_zu@163.com
 * @date 2021-03-16 15:48:08
 */
public interface TypeService extends IService<TypeEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

