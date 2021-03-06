package com.monster.greenfruit.pojo.domain;

public class OrderInspector {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column order_inspector.order_id
     *
     * @mbggenerated
     */
    private Long orderId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column order_inspector.inspector_id
     *
     * @mbggenerated
     */
    private Long inspectorId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column order_inspector.inspector_name
     *
     * @mbggenerated
     */
    private String inspectorName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column order_inspector.portrait_path
     *
     * @mbggenerated
     */
    private String portraitPath;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column order_inspector.inspecotr_cellphone
     *
     * @mbggenerated
     */
    private String inspecotrCellphone;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column order_inspector.order_id
     *
     * @return the value of order_inspector.order_id
     *
     * @mbggenerated
     */
    public Long getOrderId() {
        return orderId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column order_inspector.order_id
     *
     * @param orderId the value for order_inspector.order_id
     *
     * @mbggenerated
     */
    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column order_inspector.inspector_id
     *
     * @return the value of order_inspector.inspector_id
     *
     * @mbggenerated
     */
    public Long getInspectorId() {
        return inspectorId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column order_inspector.inspector_id
     *
     * @param inspectorId the value for order_inspector.inspector_id
     *
     * @mbggenerated
     */
    public void setInspectorId(Long inspectorId) {
        this.inspectorId = inspectorId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column order_inspector.inspector_name
     *
     * @return the value of order_inspector.inspector_name
     *
     * @mbggenerated
     */
    public String getInspectorName() {
        return inspectorName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column order_inspector.inspector_name
     *
     * @param inspectorName the value for order_inspector.inspector_name
     *
     * @mbggenerated
     */
    public void setInspectorName(String inspectorName) {
        this.inspectorName = inspectorName == null ? null : inspectorName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column order_inspector.portrait_path
     *
     * @return the value of order_inspector.portrait_path
     *
     * @mbggenerated
     */
    public String getPortraitPath() {
        return portraitPath;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column order_inspector.portrait_path
     *
     * @param portraitPath the value for order_inspector.portrait_path
     *
     * @mbggenerated
     */
    public void setPortraitPath(String portraitPath) {
        this.portraitPath = portraitPath == null ? null : portraitPath.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column order_inspector.inspecotr_cellphone
     *
     * @return the value of order_inspector.inspecotr_cellphone
     *
     * @mbggenerated
     */
    public String getInspecotrCellphone() {
        return inspecotrCellphone;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column order_inspector.inspecotr_cellphone
     *
     * @param inspecotrCellphone the value for order_inspector.inspecotr_cellphone
     *
     * @mbggenerated
     */
    public void setInspecotrCellphone(String inspecotrCellphone) {
        this.inspecotrCellphone = inspecotrCellphone == null ? null : inspecotrCellphone.trim();
    }
}