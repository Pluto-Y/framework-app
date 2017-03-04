package com.roachfu.app.module.base.dao.impl;

import com.roachfu.app.module.base.dao.BaseDao;
import org.apache.ibatis.session.RowBounds;
import org.mybatis.spring.SqlSessionTemplate;

import javax.annotation.Resource;
import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.util.List;

/**
 * @author fuqiang
 * @time 2017/2/26 15:12
 */
public class BaseDaoImpl<T extends Serializable, P extends Serializable> implements BaseDao<T, P> {


    @Resource
    private SqlSessionTemplate sqlSession;

    /** 命名空间 */
    private String namespace;

    public BaseDaoImpl(){
        /* T实体的名称 */
        Class<T> classEntity = (Class<T>) ((ParameterizedType) this.getClass().getGenericSuperclass())
                .getActualTypeArguments()[0];
        this.namespace = classEntity.getSimpleName().toLowerCase();

        System.out.println("namespace = " + namespace);
    }

    @Override
    public List<T> listByPage(int pageStart, int pageSize, Object parameter) {
        return sqlSession.selectList(this.namespace + ".list", parameter,
                new RowBounds(pageStart, pageSize));
    }

    @Override
    public List<T> getList(Object parameter) {
        return sqlSession.selectList(this.namespace + ".list", parameter);
    }

    @Override
    public Long count(Object parameter) {
        return sqlSession.selectOne(this.namespace + ".count", parameter);
    }

    @Override
    public T getInfoById(P id) {
        return sqlSession.selectOne(this.namespace + ".getInfoById", id);
    }

    @Override
    public int insert(T entity) {
        return sqlSession.insert(this.namespace + ".insert", entity);
    }

    @Override
    public int updateById(T entity) {
        return sqlSession.update(this.namespace + ".updateById", entity);
    }

    @Override
    public int deleteById(P id) {
        return delete("deleteById", id);
    }

    @Override
    public int delete(String statement, Object parameter) {
        return sqlSession.delete(this.namespace + "." + statement, parameter);
    }
}
