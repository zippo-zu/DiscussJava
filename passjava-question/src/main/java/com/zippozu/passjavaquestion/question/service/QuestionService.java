package com.zippozu.passjavaquestion.question.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.zippozu.common.utils.PageUtils;
import com.zippozu.passjavaquestion.question.entity.QuestionEntity;

import java.util.Map;

/**
 * 
 *
 * @author zippo_zu
 * @email zippo_zu@163.com
 * @date 2021-03-16 15:48:08
 */
public interface QuestionService extends IService<QuestionEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

