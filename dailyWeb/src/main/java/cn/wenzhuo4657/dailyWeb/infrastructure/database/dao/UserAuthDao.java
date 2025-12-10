package cn.wenzhuo4657.dailyWeb.infrastructure.database.dao;

import cn.wenzhuo4657.dailyWeb.infrastructure.database.entity.Docs;
import cn.wenzhuo4657.dailyWeb.infrastructure.database.entity.UserAuth;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * (UserAuth)表数据库访问层
 *
 * @author makejava
 * @since 2025-11-10 13:41:16
 */
public interface UserAuthDao {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    UserAuth queryById(Long id);

  
    /**
     * 统计总行数
     *
     * @param userAuth 查询条件
     * @return 总行数
     */
    long count(UserAuth userAuth);

    /**
     * 新增数据
     *
     * @param userAuth 实例对象
     * @return 影响行数
     */
    int insert(UserAuth userAuth);

    /**
     * 批量新增数据（MyBatis原生foreach方法）
     *
     * @param entities List<UserAuth> 实例对象列表
     * @return 影响行数
     */
    int insertBatch(@Param("entities") List<UserAuth> entities);

    /**
     * 批量新增或按主键更新数据（MyBatis原生foreach方法）
     *
     * @param entities List<UserAuth> 实例对象列表
     * @return 影响行数
     * @throws org.springframework.jdbc.BadSqlGrammarException 入参是空List的时候会抛SQL语句错误的异常，请自行校验入参
     */
    int insertOrUpdateBatch(@Param("entities") List<UserAuth> entities);

    /**
     * 修改数据
     *
     * @param userAuth 实例对象
     * @return 影响行数
     */
    int update(UserAuth userAuth);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(Long id);

    List<Docs> queryByUserIdAndtypeId(@Param("userId") Long userId, @Param("typeId") Long typeId);
}

