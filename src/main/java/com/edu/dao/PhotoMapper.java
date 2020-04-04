package com.edu.dao;

import com.edu.entry.Photo;
import com.edu.entry.PhotoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PhotoMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table photo
     *
     * @mbg.generated Sat Apr 04 10:31:14 CST 2020
     */
    long countByExample(PhotoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table photo
     *
     * @mbg.generated Sat Apr 04 10:31:14 CST 2020
     */
    int deleteByExample(PhotoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table photo
     *
     * @mbg.generated Sat Apr 04 10:31:14 CST 2020
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table photo
     *
     * @mbg.generated Sat Apr 04 10:31:14 CST 2020
     */
    int insert(Photo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table photo
     *
     * @mbg.generated Sat Apr 04 10:31:14 CST 2020
     */
    int insertSelective(Photo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table photo
     *
     * @mbg.generated Sat Apr 04 10:31:14 CST 2020
     */
    List<Photo> selectByExample(PhotoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table photo
     *
     * @mbg.generated Sat Apr 04 10:31:14 CST 2020
     */
    Photo selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table photo
     *
     * @mbg.generated Sat Apr 04 10:31:14 CST 2020
     */
    int updateByExampleSelective(@Param("record") Photo record, @Param("example") PhotoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table photo
     *
     * @mbg.generated Sat Apr 04 10:31:14 CST 2020
     */
    int updateByExample(@Param("record") Photo record, @Param("example") PhotoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table photo
     *
     * @mbg.generated Sat Apr 04 10:31:14 CST 2020
     */
    int updateByPrimaryKeySelective(Photo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table photo
     *
     * @mbg.generated Sat Apr 04 10:31:14 CST 2020
     */
    int updateByPrimaryKey(Photo record);
}