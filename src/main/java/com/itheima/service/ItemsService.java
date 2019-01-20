package com.itheima.service;

import com.itheima.domain.Items;

/**
 * @Description: java接口作用描述
 * @Author: mj
 * @CreateDate: 2019/1/17 19:22
 * @Version: 1.0
 */
public interface ItemsService {
    /**
     * 根据Id查询
     * @param id
     * @return
     */
    Items findById(Integer id);
}
