package com.bookshop.pojo.po;

import java.util.ArrayList;
import java.util.List;

public class LibTslsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public LibTslsExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

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

        public Criteria andTslsIdIsNull() {
            addCriterion("tsls_id is null");
            return (Criteria) this;
        }

        public Criteria andTslsIdIsNotNull() {
            addCriterion("tsls_id is not null");
            return (Criteria) this;
        }

        public Criteria andTslsIdEqualTo(Integer value) {
            addCriterion("tsls_id =", value, "tslsId");
            return (Criteria) this;
        }

        public Criteria andTslsIdNotEqualTo(Integer value) {
            addCriterion("tsls_id <>", value, "tslsId");
            return (Criteria) this;
        }

        public Criteria andTslsIdGreaterThan(Integer value) {
            addCriterion("tsls_id >", value, "tslsId");
            return (Criteria) this;
        }

        public Criteria andTslsIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("tsls_id >=", value, "tslsId");
            return (Criteria) this;
        }

        public Criteria andTslsIdLessThan(Integer value) {
            addCriterion("tsls_id <", value, "tslsId");
            return (Criteria) this;
        }

        public Criteria andTslsIdLessThanOrEqualTo(Integer value) {
            addCriterion("tsls_id <=", value, "tslsId");
            return (Criteria) this;
        }

        public Criteria andTslsIdIn(List<Integer> values) {
            addCriterion("tsls_id in", values, "tslsId");
            return (Criteria) this;
        }

        public Criteria andTslsIdNotIn(List<Integer> values) {
            addCriterion("tsls_id not in", values, "tslsId");
            return (Criteria) this;
        }

        public Criteria andTslsIdBetween(Integer value1, Integer value2) {
            addCriterion("tsls_id between", value1, value2, "tslsId");
            return (Criteria) this;
        }

        public Criteria andTslsIdNotBetween(Integer value1, Integer value2) {
            addCriterion("tsls_id not between", value1, value2, "tslsId");
            return (Criteria) this;
        }

        public Criteria andTsIdIsNull() {
            addCriterion("ts_id is null");
            return (Criteria) this;
        }

        public Criteria andTsIdIsNotNull() {
            addCriterion("ts_id is not null");
            return (Criteria) this;
        }

        public Criteria andTsIdEqualTo(Integer value) {
            addCriterion("ts_id =", value, "tsId");
            return (Criteria) this;
        }

        public Criteria andTsIdNotEqualTo(Integer value) {
            addCriterion("ts_id <>", value, "tsId");
            return (Criteria) this;
        }

        public Criteria andTsIdGreaterThan(Integer value) {
            addCriterion("ts_id >", value, "tsId");
            return (Criteria) this;
        }

        public Criteria andTsIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("ts_id >=", value, "tsId");
            return (Criteria) this;
        }

        public Criteria andTsIdLessThan(Integer value) {
            addCriterion("ts_id <", value, "tsId");
            return (Criteria) this;
        }

        public Criteria andTsIdLessThanOrEqualTo(Integer value) {
            addCriterion("ts_id <=", value, "tsId");
            return (Criteria) this;
        }

        public Criteria andTsIdIn(List<Integer> values) {
            addCriterion("ts_id in", values, "tsId");
            return (Criteria) this;
        }

        public Criteria andTsIdNotIn(List<Integer> values) {
            addCriterion("ts_id not in", values, "tsId");
            return (Criteria) this;
        }

        public Criteria andTsIdBetween(Integer value1, Integer value2) {
            addCriterion("ts_id between", value1, value2, "tsId");
            return (Criteria) this;
        }

        public Criteria andTsIdNotBetween(Integer value1, Integer value2) {
            addCriterion("ts_id not between", value1, value2, "tsId");
            return (Criteria) this;
        }

        public Criteria andUIdIsNull() {
            addCriterion("u_id is null");
            return (Criteria) this;
        }

        public Criteria andUIdIsNotNull() {
            addCriterion("u_id is not null");
            return (Criteria) this;
        }

        public Criteria andUIdEqualTo(Integer value) {
            addCriterion("u_id =", value, "uId");
            return (Criteria) this;
        }

        public Criteria andUIdNotEqualTo(Integer value) {
            addCriterion("u_id <>", value, "uId");
            return (Criteria) this;
        }

        public Criteria andUIdGreaterThan(Integer value) {
            addCriterion("u_id >", value, "uId");
            return (Criteria) this;
        }

        public Criteria andUIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("u_id >=", value, "uId");
            return (Criteria) this;
        }

        public Criteria andUIdLessThan(Integer value) {
            addCriterion("u_id <", value, "uId");
            return (Criteria) this;
        }

        public Criteria andUIdLessThanOrEqualTo(Integer value) {
            addCriterion("u_id <=", value, "uId");
            return (Criteria) this;
        }

        public Criteria andUIdIn(List<Integer> values) {
            addCriterion("u_id in", values, "uId");
            return (Criteria) this;
        }

        public Criteria andUIdNotIn(List<Integer> values) {
            addCriterion("u_id not in", values, "uId");
            return (Criteria) this;
        }

        public Criteria andUIdBetween(Integer value1, Integer value2) {
            addCriterion("u_id between", value1, value2, "uId");
            return (Criteria) this;
        }

        public Criteria andUIdNotBetween(Integer value1, Integer value2) {
            addCriterion("u_id not between", value1, value2, "uId");
            return (Criteria) this;
        }

        public Criteria andTslsTimeIsNull() {
            addCriterion("tsls_time is null");
            return (Criteria) this;
        }

        public Criteria andTslsTimeIsNotNull() {
            addCriterion("tsls_time is not null");
            return (Criteria) this;
        }

        public Criteria andTslsTimeEqualTo(String value) {
            addCriterion("tsls_time =", value, "tslsTime");
            return (Criteria) this;
        }

        public Criteria andTslsTimeNotEqualTo(String value) {
            addCriterion("tsls_time <>", value, "tslsTime");
            return (Criteria) this;
        }

        public Criteria andTslsTimeGreaterThan(String value) {
            addCriterion("tsls_time >", value, "tslsTime");
            return (Criteria) this;
        }

        public Criteria andTslsTimeGreaterThanOrEqualTo(String value) {
            addCriterion("tsls_time >=", value, "tslsTime");
            return (Criteria) this;
        }

        public Criteria andTslsTimeLessThan(String value) {
            addCriterion("tsls_time <", value, "tslsTime");
            return (Criteria) this;
        }

        public Criteria andTslsTimeLessThanOrEqualTo(String value) {
            addCriterion("tsls_time <=", value, "tslsTime");
            return (Criteria) this;
        }

        public Criteria andTslsTimeLike(String value) {
            addCriterion("tsls_time like", value, "tslsTime");
            return (Criteria) this;
        }

        public Criteria andTslsTimeNotLike(String value) {
            addCriterion("tsls_time not like", value, "tslsTime");
            return (Criteria) this;
        }

        public Criteria andTslsTimeIn(List<String> values) {
            addCriterion("tsls_time in", values, "tslsTime");
            return (Criteria) this;
        }

        public Criteria andTslsTimeNotIn(List<String> values) {
            addCriterion("tsls_time not in", values, "tslsTime");
            return (Criteria) this;
        }

        public Criteria andTslsTimeBetween(String value1, String value2) {
            addCriterion("tsls_time between", value1, value2, "tslsTime");
            return (Criteria) this;
        }

        public Criteria andTslsTimeNotBetween(String value1, String value2) {
            addCriterion("tsls_time not between", value1, value2, "tslsTime");
            return (Criteria) this;
        }

        public Criteria andTslsPriceIsNull() {
            addCriterion("tsls_price is null");
            return (Criteria) this;
        }

        public Criteria andTslsPriceIsNotNull() {
            addCriterion("tsls_price is not null");
            return (Criteria) this;
        }

        public Criteria andTslsPriceEqualTo(Double value) {
            addCriterion("tsls_price =", value, "tslsPrice");
            return (Criteria) this;
        }

        public Criteria andTslsPriceNotEqualTo(Double value) {
            addCriterion("tsls_price <>", value, "tslsPrice");
            return (Criteria) this;
        }

        public Criteria andTslsPriceGreaterThan(Double value) {
            addCriterion("tsls_price >", value, "tslsPrice");
            return (Criteria) this;
        }

        public Criteria andTslsPriceGreaterThanOrEqualTo(Double value) {
            addCriterion("tsls_price >=", value, "tslsPrice");
            return (Criteria) this;
        }

        public Criteria andTslsPriceLessThan(Double value) {
            addCriterion("tsls_price <", value, "tslsPrice");
            return (Criteria) this;
        }

        public Criteria andTslsPriceLessThanOrEqualTo(Double value) {
            addCriterion("tsls_price <=", value, "tslsPrice");
            return (Criteria) this;
        }

        public Criteria andTslsPriceIn(List<Double> values) {
            addCriterion("tsls_price in", values, "tslsPrice");
            return (Criteria) this;
        }

        public Criteria andTslsPriceNotIn(List<Double> values) {
            addCriterion("tsls_price not in", values, "tslsPrice");
            return (Criteria) this;
        }

        public Criteria andTslsPriceBetween(Double value1, Double value2) {
            addCriterion("tsls_price between", value1, value2, "tslsPrice");
            return (Criteria) this;
        }

        public Criteria andTslsPriceNotBetween(Double value1, Double value2) {
            addCriterion("tsls_price not between", value1, value2, "tslsPrice");
            return (Criteria) this;
        }

        public Criteria andTslsNumIsNull() {
            addCriterion("tsls_num is null");
            return (Criteria) this;
        }

        public Criteria andTslsNumIsNotNull() {
            addCriterion("tsls_num is not null");
            return (Criteria) this;
        }

        public Criteria andTslsNumEqualTo(Integer value) {
            addCriterion("tsls_num =", value, "tslsNum");
            return (Criteria) this;
        }

        public Criteria andTslsNumNotEqualTo(Integer value) {
            addCriterion("tsls_num <>", value, "tslsNum");
            return (Criteria) this;
        }

        public Criteria andTslsNumGreaterThan(Integer value) {
            addCriterion("tsls_num >", value, "tslsNum");
            return (Criteria) this;
        }

        public Criteria andTslsNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("tsls_num >=", value, "tslsNum");
            return (Criteria) this;
        }

        public Criteria andTslsNumLessThan(Integer value) {
            addCriterion("tsls_num <", value, "tslsNum");
            return (Criteria) this;
        }

        public Criteria andTslsNumLessThanOrEqualTo(Integer value) {
            addCriterion("tsls_num <=", value, "tslsNum");
            return (Criteria) this;
        }

        public Criteria andTslsNumIn(List<Integer> values) {
            addCriterion("tsls_num in", values, "tslsNum");
            return (Criteria) this;
        }

        public Criteria andTslsNumNotIn(List<Integer> values) {
            addCriterion("tsls_num not in", values, "tslsNum");
            return (Criteria) this;
        }

        public Criteria andTslsNumBetween(Integer value1, Integer value2) {
            addCriterion("tsls_num between", value1, value2, "tslsNum");
            return (Criteria) this;
        }

        public Criteria andTslsNumNotBetween(Integer value1, Integer value2) {
            addCriterion("tsls_num not between", value1, value2, "tslsNum");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

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