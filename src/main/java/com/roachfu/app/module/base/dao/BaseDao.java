package com.roachfu.app.module.base.dao;

import com.roachfu.app.pojo.entity.Page;

import java.io.Serializable;
import java.util.List;

/**
 * @author fuqiang
 * @time 2017/2/26 13:31
 */
public interface BaseDao<T extends Serializable, PK extends Serializable> {

    /**
     * 分页获取列表
     * @param pageStart 起始记录
     * @param pageSize  页大小
     * @param parameters    参数
     * @return
     */
    List<T> listByPage(int pageStart, int pageSize, Object parameters);

    /**
     * 获取列表
     * @param parameter
     * @return
     */
    List<T> getList(Object parameter);

    /**
     * 获取记录总数
     * @param parameter
     * @return
     */
    Long count(Object parameter);

    /**
     * 根据id获取详情
     * @param id
     * @return
     */
    T getInfoById(PK id);

    /**
     * 插入
     * @param entity 要插入的实体
     * @return
     */
    int insert(T entity);

    /**
     * 更新
     * @param entity
     * @return
     */
    int updateById(T entity);

    /**
     * 根据id删除数据
     * @param id    主键id
     * @return
     */
    int deleteById(PK id);

    /**
     * 删除一条记录
     * @param statement sql声明
     * @param parameter 参数
     * @return
     */
    int delete(String statement, Object parameter);

}
