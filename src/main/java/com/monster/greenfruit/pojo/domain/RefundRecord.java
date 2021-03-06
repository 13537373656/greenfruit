package com.monster.greenfruit.pojo.domain;

import java.util.Date;

public class RefundRecord {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column refund_record.usr_id
     *
     * @mbggenerated
     */
    private Long usrId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column refund_record.refund_money
     *
     * @mbggenerated
     */
    private Integer refundMoney;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column refund_record.order_id
     *
     * @mbggenerated
     */
    private Long orderId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column refund_record.refund_reason
     *
     * @mbggenerated
     */
    private String refundReason;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column refund_record.refund_status
     *
     * @mbggenerated
     */
    private Integer refundStatus;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column refund_record.refund_type
     *
     * @mbggenerated
     */
    private Integer refundType;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column refund_record.refund_time
     *
     * @mbggenerated
     */
    private Date refundTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column refund_record.trade_id
     *
     * @mbggenerated
     */
    private String tradeId;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column refund_record.usr_id
     *
     * @return the value of refund_record.usr_id
     * @mbggenerated
     */
    public Long getUsrId() {
        return usrId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column refund_record.usr_id
     *
     * @param usrId the value for refund_record.usr_id
     * @mbggenerated
     */
    public void setUsrId(Long usrId) {
        this.usrId = usrId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column refund_record.refund_money
     *
     * @return the value of refund_record.refund_money
     * @mbggenerated
     */
    public Integer getRefundMoney() {
        return refundMoney;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column refund_record.refund_money
     *
     * @param refundMoney the value for refund_record.refund_money
     * @mbggenerated
     */
    public void setRefundMoney(Integer refundMoney) {
        this.refundMoney = refundMoney;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column refund_record.order_id
     *
     * @return the value of refund_record.order_id
     * @mbggenerated
     */
    public Long getOrderId() {
        return orderId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column refund_record.order_id
     *
     * @param orderId the value for refund_record.order_id
     * @mbggenerated
     */
    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column refund_record.refund_reason
     *
     * @return the value of refund_record.refund_reason
     * @mbggenerated
     */
    public String getRefundReason() {
        return refundReason;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column refund_record.refund_reason
     *
     * @param refundReason the value for refund_record.refund_reason
     * @mbggenerated
     */
    public void setRefundReason(String refundReason) {
        this.refundReason = refundReason == null ? null : refundReason.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column refund_record.refund_status
     *
     * @return the value of refund_record.refund_status
     * @mbggenerated
     */
    public Integer getRefundStatus() {
        return refundStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column refund_record.refund_status
     *
     * @param refundStatus the value for refund_record.refund_status
     * @mbggenerated
     */
    public void setRefundStatus(Integer refundStatus) {
        this.refundStatus = refundStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column refund_record.refund_type
     *
     * @return the value of refund_record.refund_type
     * @mbggenerated
     */
    public Integer getRefundType() {
        return refundType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column refund_record.refund_type
     *
     * @param refundType the value for refund_record.refund_type
     * @mbggenerated
     */
    public void setRefundType(Integer refundType) {
        this.refundType = refundType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column refund_record.refund_time
     *
     * @return the value of refund_record.refund_time
     * @mbggenerated
     */
    public Date getRefundTime() {
        return refundTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column refund_record.refund_time
     *
     * @param refundTime the value for refund_record.refund_time
     * @mbggenerated
     */
    public void setRefundTime(Date refundTime) {
        this.refundTime = refundTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column refund_record.trade_id
     *
     * @return the value of refund_record.trade_id
     * @mbggenerated
     */
    public String getTradeId() {
        return tradeId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column refund_record.trade_id
     *
     * @param tradeId the value for refund_record.trade_id
     * @mbggenerated
     */
    public void setTradeId(String tradeId) {
        this.tradeId = tradeId == null ? null : tradeId.trim();
    }
}