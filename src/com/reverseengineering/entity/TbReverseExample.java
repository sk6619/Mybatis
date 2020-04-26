package com.reverseengineering.entity;

import java.util.ArrayList;
import java.util.List;

public class TbReverseExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table tb_reverse
     *
     * @mbg.generated Sat Apr 25 23:05:03 CST 2020
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table tb_reverse
     *
     * @mbg.generated Sat Apr 25 23:05:03 CST 2020
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table tb_reverse
     *
     * @mbg.generated Sat Apr 25 23:05:03 CST 2020
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_reverse
     *
     * @mbg.generated Sat Apr 25 23:05:03 CST 2020
     */
    public TbReverseExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_reverse
     *
     * @mbg.generated Sat Apr 25 23:05:03 CST 2020
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_reverse
     *
     * @mbg.generated Sat Apr 25 23:05:03 CST 2020
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_reverse
     *
     * @mbg.generated Sat Apr 25 23:05:03 CST 2020
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_reverse
     *
     * @mbg.generated Sat Apr 25 23:05:03 CST 2020
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_reverse
     *
     * @mbg.generated Sat Apr 25 23:05:03 CST 2020
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_reverse
     *
     * @mbg.generated Sat Apr 25 23:05:03 CST 2020
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_reverse
     *
     * @mbg.generated Sat Apr 25 23:05:03 CST 2020
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_reverse
     *
     * @mbg.generated Sat Apr 25 23:05:03 CST 2020
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_reverse
     *
     * @mbg.generated Sat Apr 25 23:05:03 CST 2020
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_reverse
     *
     * @mbg.generated Sat Apr 25 23:05:03 CST 2020
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table tb_reverse
     *
     * @mbg.generated Sat Apr 25 23:05:03 CST 2020
     */
    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andReIdIsNull() {
            addCriterion("re_id is null");
            return (Criteria) this;
        }

        public Criteria andReIdIsNotNull() {
            addCriterion("re_id is not null");
            return (Criteria) this;
        }

        public Criteria andReIdEqualTo(Integer value) {
            addCriterion("re_id =", value, "reId");
            return (Criteria) this;
        }

        public Criteria andReIdNotEqualTo(Integer value) {
            addCriterion("re_id <>", value, "reId");
            return (Criteria) this;
        }

        public Criteria andReIdGreaterThan(Integer value) {
            addCriterion("re_id >", value, "reId");
            return (Criteria) this;
        }

        public Criteria andReIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("re_id >=", value, "reId");
            return (Criteria) this;
        }

        public Criteria andReIdLessThan(Integer value) {
            addCriterion("re_id <", value, "reId");
            return (Criteria) this;
        }

        public Criteria andReIdLessThanOrEqualTo(Integer value) {
            addCriterion("re_id <=", value, "reId");
            return (Criteria) this;
        }

        public Criteria andReIdIn(List<Integer> values) {
            addCriterion("re_id in", values, "reId");
            return (Criteria) this;
        }

        public Criteria andReIdNotIn(List<Integer> values) {
            addCriterion("re_id not in", values, "reId");
            return (Criteria) this;
        }

        public Criteria andReIdBetween(Integer value1, Integer value2) {
            addCriterion("re_id between", value1, value2, "reId");
            return (Criteria) this;
        }

        public Criteria andReIdNotBetween(Integer value1, Integer value2) {
            addCriterion("re_id not between", value1, value2, "reId");
            return (Criteria) this;
        }

        public Criteria andReNameIsNull() {
            addCriterion("re_name is null");
            return (Criteria) this;
        }

        public Criteria andReNameIsNotNull() {
            addCriterion("re_name is not null");
            return (Criteria) this;
        }

        public Criteria andReNameEqualTo(String value) {
            addCriterion("re_name =", value, "reName");
            return (Criteria) this;
        }

        public Criteria andReNameNotEqualTo(String value) {
            addCriterion("re_name <>", value, "reName");
            return (Criteria) this;
        }

        public Criteria andReNameGreaterThan(String value) {
            addCriterion("re_name >", value, "reName");
            return (Criteria) this;
        }

        public Criteria andReNameGreaterThanOrEqualTo(String value) {
            addCriterion("re_name >=", value, "reName");
            return (Criteria) this;
        }

        public Criteria andReNameLessThan(String value) {
            addCriterion("re_name <", value, "reName");
            return (Criteria) this;
        }

        public Criteria andReNameLessThanOrEqualTo(String value) {
            addCriterion("re_name <=", value, "reName");
            return (Criteria) this;
        }

        public Criteria andReNameLike(String value) {
            addCriterion("re_name like", value, "reName");
            return (Criteria) this;
        }

        public Criteria andReNameNotLike(String value) {
            addCriterion("re_name not like", value, "reName");
            return (Criteria) this;
        }

        public Criteria andReNameIn(List<String> values) {
            addCriterion("re_name in", values, "reName");
            return (Criteria) this;
        }

        public Criteria andReNameNotIn(List<String> values) {
            addCriterion("re_name not in", values, "reName");
            return (Criteria) this;
        }

        public Criteria andReNameBetween(String value1, String value2) {
            addCriterion("re_name between", value1, value2, "reName");
            return (Criteria) this;
        }

        public Criteria andReNameNotBetween(String value1, String value2) {
            addCriterion("re_name not between", value1, value2, "reName");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table tb_reverse
     *
     * @mbg.generated do_not_delete_during_merge Sat Apr 25 23:05:03 CST 2020
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table tb_reverse
     *
     * @mbg.generated Sat Apr 25 23:05:03 CST 2020
     */
    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}