package com.ruoyi.dts.mapper;

import com.ruoyi.dts.domain.DtsCoupon;
import com.ruoyi.dts.domain.DtsCouponExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface DtsCouponMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dts_coupon
     *
     * @mbg.generated
     */
    long countByExample(DtsCouponExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dts_coupon
     *
     * @mbg.generated
     */
    int deleteByExample(DtsCouponExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dts_coupon
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dts_coupon
     *
     * @mbg.generated
     */
    int insert(DtsCoupon record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dts_coupon
     *
     * @mbg.generated
     */
    int insertSelective(DtsCoupon record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dts_coupon
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    DtsCoupon selectOneByExample(DtsCouponExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dts_coupon
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    DtsCoupon selectOneByExampleSelective(@Param("example") DtsCouponExample example, @Param("selective") DtsCoupon.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dts_coupon
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    List<DtsCoupon> selectByExampleSelective(@Param("example") DtsCouponExample example, @Param("selective") DtsCoupon.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dts_coupon
     *
     * @mbg.generated
     */
    List<DtsCoupon> selectByExample(DtsCouponExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dts_coupon
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    DtsCoupon selectByPrimaryKeySelective(@Param("id") Integer id, @Param("selective") DtsCoupon.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dts_coupon
     *
     * @mbg.generated
     */
    DtsCoupon selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dts_coupon
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    DtsCoupon selectByPrimaryKeyWithLogicalDelete(@Param("id") Integer id, @Param("andLogicalDeleted") boolean andLogicalDeleted);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dts_coupon
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") DtsCoupon record, @Param("example") DtsCouponExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dts_coupon
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") DtsCoupon record, @Param("example") DtsCouponExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dts_coupon
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(DtsCoupon record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dts_coupon
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(DtsCoupon record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dts_coupon
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    int logicalDeleteByExample(@Param("example") DtsCouponExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dts_coupon
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    int logicalDeleteByPrimaryKey(Integer id);
}