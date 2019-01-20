package com.itheima.dao;

import com.itheima.domain.Items;

/**
 * @Description: 持久层接口
 * @Author: mj
 * @CreateDate: 2019/1/17 18:57
 * @Version: 1.0
 */

public interface ItemsDao {
    /**
     * 根据ID查询
     * @param id
     * @return
     */
    Items findById(Integer id);
}
