package com.mycollab.common.dao;

import com.mycollab.common.domain.RelayEmailNotification;
import com.mycollab.common.domain.RelayEmailNotificationExample;
import com.mycollab.db.persistence.ICrudGenericDAO;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@SuppressWarnings({ "ucd", "rawtypes" })
@Mapper
public interface RelayEmailNotificationMapper extends ICrudGenericDAO {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table s_relay_email_notification
     *
     * @mbg.generated Sat Feb 09 11:42:26 CST 2019
     */
    long countByExample(RelayEmailNotificationExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table s_relay_email_notification
     *
     * @mbg.generated Sat Feb 09 11:42:26 CST 2019
     */
    int deleteByExample(RelayEmailNotificationExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table s_relay_email_notification
     *
     * @mbg.generated Sat Feb 09 11:42:26 CST 2019
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table s_relay_email_notification
     *
     * @mbg.generated Sat Feb 09 11:42:26 CST 2019
     */
    int insert(RelayEmailNotification record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table s_relay_email_notification
     *
     * @mbg.generated Sat Feb 09 11:42:26 CST 2019
     */
    int insertSelective(RelayEmailNotification record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table s_relay_email_notification
     *
     * @mbg.generated Sat Feb 09 11:42:26 CST 2019
     */
    List<RelayEmailNotification> selectByExampleWithBLOBs(RelayEmailNotificationExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table s_relay_email_notification
     *
     * @mbg.generated Sat Feb 09 11:42:26 CST 2019
     */
    List<RelayEmailNotification> selectByExample(RelayEmailNotificationExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table s_relay_email_notification
     *
     * @mbg.generated Sat Feb 09 11:42:26 CST 2019
     */
    RelayEmailNotification selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table s_relay_email_notification
     *
     * @mbg.generated Sat Feb 09 11:42:26 CST 2019
     */
    int updateByExampleSelective(@Param("record") RelayEmailNotification record, @Param("example") RelayEmailNotificationExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table s_relay_email_notification
     *
     * @mbg.generated Sat Feb 09 11:42:26 CST 2019
     */
    int updateByExampleWithBLOBs(@Param("record") RelayEmailNotification record, @Param("example") RelayEmailNotificationExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table s_relay_email_notification
     *
     * @mbg.generated Sat Feb 09 11:42:26 CST 2019
     */
    int updateByExample(@Param("record") RelayEmailNotification record, @Param("example") RelayEmailNotificationExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table s_relay_email_notification
     *
     * @mbg.generated Sat Feb 09 11:42:26 CST 2019
     */
    int updateByPrimaryKeySelective(RelayEmailNotification record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table s_relay_email_notification
     *
     * @mbg.generated Sat Feb 09 11:42:26 CST 2019
     */
    int updateByPrimaryKeyWithBLOBs(RelayEmailNotification record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table s_relay_email_notification
     *
     * @mbg.generated Sat Feb 09 11:42:26 CST 2019
     */
    int updateByPrimaryKey(RelayEmailNotification record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table s_relay_email_notification
     *
     * @mbg.generated Sat Feb 09 11:42:26 CST 2019
     */
    Integer insertAndReturnKey(RelayEmailNotification value);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table s_relay_email_notification
     *
     * @mbg.generated Sat Feb 09 11:42:26 CST 2019
     */
    void removeKeysWithSession(List primaryKeys);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table s_relay_email_notification
     *
     * @mbg.generated Sat Feb 09 11:42:26 CST 2019
     */
    void massUpdateWithSession(@Param("record") RelayEmailNotification record, @Param("primaryKeys") List primaryKeys);
}