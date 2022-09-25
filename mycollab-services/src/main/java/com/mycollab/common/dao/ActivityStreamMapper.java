package com.mycollab.common.dao;

import com.mycollab.common.domain.ActivityStream;
import com.mycollab.common.domain.ActivityStreamExample;
import com.mycollab.db.persistence.ICrudGenericDAO;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@SuppressWarnings({ "ucd", "rawtypes" })
@Mapper
public interface ActivityStreamMapper extends ICrudGenericDAO {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table s_activitystream
     *
     * @mbg.generated Sat Feb 09 11:42:26 CST 2019
     */
    long countByExample(ActivityStreamExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table s_activitystream
     *
     * @mbg.generated Sat Feb 09 11:42:26 CST 2019
     */
    int deleteByExample(ActivityStreamExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table s_activitystream
     *
     * @mbg.generated Sat Feb 09 11:42:26 CST 2019
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table s_activitystream
     *
     * @mbg.generated Sat Feb 09 11:42:26 CST 2019
     */
    int insert(ActivityStream record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table s_activitystream
     *
     * @mbg.generated Sat Feb 09 11:42:26 CST 2019
     */
    int insertSelective(ActivityStream record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table s_activitystream
     *
     * @mbg.generated Sat Feb 09 11:42:26 CST 2019
     */
    List<ActivityStream> selectByExampleWithBLOBs(ActivityStreamExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table s_activitystream
     *
     * @mbg.generated Sat Feb 09 11:42:26 CST 2019
     */
    List<ActivityStream> selectByExample(ActivityStreamExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table s_activitystream
     *
     * @mbg.generated Sat Feb 09 11:42:26 CST 2019
     */
    ActivityStream selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table s_activitystream
     *
     * @mbg.generated Sat Feb 09 11:42:26 CST 2019
     */
    int updateByExampleSelective(@Param("record") ActivityStream record, @Param("example") ActivityStreamExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table s_activitystream
     *
     * @mbg.generated Sat Feb 09 11:42:26 CST 2019
     */
    int updateByExampleWithBLOBs(@Param("record") ActivityStream record, @Param("example") ActivityStreamExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table s_activitystream
     *
     * @mbg.generated Sat Feb 09 11:42:26 CST 2019
     */
    int updateByExample(@Param("record") ActivityStream record, @Param("example") ActivityStreamExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table s_activitystream
     *
     * @mbg.generated Sat Feb 09 11:42:26 CST 2019
     */
    int updateByPrimaryKeySelective(ActivityStream record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table s_activitystream
     *
     * @mbg.generated Sat Feb 09 11:42:26 CST 2019
     */
    int updateByPrimaryKeyWithBLOBs(ActivityStream record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table s_activitystream
     *
     * @mbg.generated Sat Feb 09 11:42:26 CST 2019
     */
    int updateByPrimaryKey(ActivityStream record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table s_activitystream
     *
     * @mbg.generated Sat Feb 09 11:42:26 CST 2019
     */
    Integer insertAndReturnKey(ActivityStream value);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table s_activitystream
     *
     * @mbg.generated Sat Feb 09 11:42:26 CST 2019
     */
    void removeKeysWithSession(List primaryKeys);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table s_activitystream
     *
     * @mbg.generated Sat Feb 09 11:42:26 CST 2019
     */
    void massUpdateWithSession(@Param("record") ActivityStream record, @Param("primaryKeys") List primaryKeys);
}