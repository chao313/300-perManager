package com.phms.mapper;

import com.phms.pojo.Standard;
import com.phms.pojo.StandardExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface StandardMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table standard
     *
     * @mbg.generated Mon Apr 06 17:03:33 CST 2020
     */
    long countByExample(StandardExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table standard
     *
     * @mbg.generated Mon Apr 06 17:03:33 CST 2020
     */
    int deleteByExample(StandardExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table standard
     *
     * @mbg.generated Mon Apr 06 17:03:33 CST 2020
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table standard
     *
     * @mbg.generated Mon Apr 06 17:03:33 CST 2020
     */
    int insert(Standard record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table standard
     *
     * @mbg.generated Mon Apr 06 17:03:33 CST 2020
     */
    int insertSelective(Standard record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table standard
     *
     * @mbg.generated Mon Apr 06 17:03:33 CST 2020
     */
    List<Standard> selectByExample(StandardExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table standard
     *
     * @mbg.generated Mon Apr 06 17:03:33 CST 2020
     */
    Standard selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table standard
     *
     * @mbg.generated Mon Apr 06 17:03:33 CST 2020
     */
    int updateByExampleSelective(@Param("record") Standard record, @Param("example") StandardExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table standard
     *
     * @mbg.generated Mon Apr 06 17:03:33 CST 2020
     */
    int updateByExample(@Param("record") Standard record, @Param("example") StandardExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table standard
     *
     * @mbg.generated Mon Apr 06 17:03:33 CST 2020
     */
    int updateByPrimaryKeySelective(Standard record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table standard
     *
     * @mbg.generated Mon Apr 06 17:03:33 CST 2020
     */
    int updateByPrimaryKey(Standard record);

    List<Standard> getAllByLimit(Standard po);

    int countAllByLimit(Standard po);
}