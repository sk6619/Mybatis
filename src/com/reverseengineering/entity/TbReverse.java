package com.reverseengineering.entity;

public class TbReverse {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_reverse.re_id
     *
     * @mbg.generated Sat Apr 25 23:05:03 CST 2020
     */
    private Integer reId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_reverse.re_name
     *
     * @mbg.generated Sat Apr 25 23:05:03 CST 2020
     */
    private String reName;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_reverse.re_id
     *
     * @return the value of tb_reverse.re_id
     *
     * @mbg.generated Sat Apr 25 23:05:03 CST 2020
     */
    public Integer getReId() {
        return reId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_reverse.re_id
     *
     * @param reId the value for tb_reverse.re_id
     *
     * @mbg.generated Sat Apr 25 23:05:03 CST 2020
     */
    public void setReId(Integer reId) {
        this.reId = reId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_reverse.re_name
     *
     * @return the value of tb_reverse.re_name
     *
     * @mbg.generated Sat Apr 25 23:05:03 CST 2020
     */
    public String getReName() {
        return reName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_reverse.re_name
     *
     * @param reName the value for tb_reverse.re_name
     *
     * @mbg.generated Sat Apr 25 23:05:03 CST 2020
     */
    public void setReName(String reName) {
        this.reName = reName == null ? null : reName.trim();
    }
}