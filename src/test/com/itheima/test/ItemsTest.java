package com.itheima.test;

import com.itheima.dao.ItemsDao;
import com.itheima.domain.Items;
import com.itheima.service.ItemsService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Description: java类作用描述
 * @Author: mj
 * @CreateDate: 2019/1/17 19:15
 * @Version: 1.0
 */

public class ItemsTest {

    /**
     * 测试根据id进行查询
     */
    @Test
    public void testFindById(){
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
//        ItemsDao itemsDao = ac.getBean(ItemsDao.class);
//        Items items = itemsDao.findById(1);
        ItemsService itemsService = ac.getBean(ItemsService.class);
        Items items = itemsService.findById(1);
        System.out.println(items);

    }
}
