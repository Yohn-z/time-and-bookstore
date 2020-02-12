package com.bookshop.pojo.po;

import java.util.ArrayList;
import java.util.List;

public class TsjyHisExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TsjyHisExample() {
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

        public Criteria andTsjyIdIsNull() {
            addCriterion("tsjy_id is null");
            return (Criteria) this;
        }

        public Criteria andTsjyIdIsNotNull() {
            addCriterion("tsjy_id is not null");
            return (Criteria) this;
        }

        public Criteria andTsjyIdEqualTo(Integer value) {
            addCriterion("tsjy_id =", value, "tsjyId");
            return (Criteria) this;
        }

        public Criteria andTsjyIdNotEqualTo(Integer value) {
            addCriterion("tsjy_id <>", value, "tsjyId");
            return (Criteria) this;
        }

        public Criteria andTsjyIdGreaterThan(Integer value) {
            addCriterion("tsjy_id >", value, "tsjyId");
            return (Criteria) this;
        }

        public Criteria andTsjyIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("tsjy_id >=", value, "tsjyId");
            return (Criteria) this;
        }

        public Criteria andTsjyIdLessThan(Integer value) {
            addCriterion("tsjy_id <", value, "tsjyId");
            return (Criteria) this;
        }

        public Criteria andTsjyIdLessThanOrEqualTo(Integer value) {
            addCriterion("tsjy_id <=", value, "tsjyId");
            return (Criteria) this;
        }

        public Criteria andTsjyIdIn(List<Integer> values) {
            addCriterion("tsjy_id in", values, "tsjyId");
            return (Criteria) this;
        }

        public Criteria andTsjyIdNotIn(List<Integer> values) {
            addCriterion("tsjy_id not in", values, "tsjyId");
            return (Criteria) this;
        }

        public Criteria andTsjyIdBetween(Integer value1, Integer value2) {
            addCriterion("tsjy_id between", value1, value2, "tsjyId");
            return (Criteria) this;
        }

        public Criteria andTsjyIdNotBetween(Integer value1, Integer value2) {
            addCriterion("tsjy_id not between", value1, value2, "tsjyId");
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

        public Criteria andTsjyStimeIsNull() {
            addCriterion("tsjy_stime is null");
            return (Criteria) this;
        }

        public Criteria andTsjyStimeIsNotNull() {
            addCriterion("tsjy_stime is not null");
            return (Criteria) this;
        }

        public Criteria andTsjyStimeEqualTo(String value) {
            addCriterion("tsjy_stime =", value, "tsjyStime");
            return (Criteria) this;
        }

        public Criteria andTsjyStimeNotEqualTo(String value) {
            addCriterion("tsjy_stime <>", value, "tsjyStime");
            return (Criteria) this;
        }

        public Criteria andTsjyStimeGreaterThan(String value) {
            addCriterion("tsjy_stime >", value, "tsjyStime");
            return (Criteria) this;
        }

        public Criteria andTsjyStimeGreaterThanOrEqualTo(String value) {
            addCriterion("tsjy_stime >=", value, "tsjyStime");
            return (Criteria) this;
        }

        public Criteria andTsjyStimeLessThan(String value) {
            addCriterion("tsjy_stime <", value, "tsjyStime");
            return (Criteria) this;
        }

        public Criteria andTsjyStimeLessThanOrEqualTo(String value) {
            addCriterion("tsjy_stime <=", value, "tsjyStime");
            return (Criteria) this;
        }

        public Criteria andTsjyStimeLike(String value) {
            addCriterion("tsjy_stime like", value, "tsjyStime");
            return (Criteria) this;
        }

        public Criteria andTsjyStimeNotLike(String value) {
            addCriterion("tsjy_stime not like", value, "tsjyStime");
            return (Criteria) this;
        }

        public Criteria andTsjyStimeIn(List<String> values) {
            addCriterion("tsjy_stime in", values, "tsjyStime");
            return (Criteria) this;
        }

        public Criteria andTsjyStimeNotIn(List<String> values) {
            addCriterion("tsjy_stime not in", values, "tsjyStime");
            return (Criteria) this;
        }

        public Criteria andTsjyStimeBetween(String value1, String value2) {
            addCriterion("tsjy_stime between", value1, value2, "tsjyStime");
            return (Criteria) this;
        }

        public Criteria andTsjyStimeNotBetween(String value1, String value2) {
            addCriterion("tsjy_stime not between", value1, value2, "tsjyStime");
            return (Criteria) this;
        }

        public Criteria andTsjyFtimeIsNull() {
            addCriterion("tsjy_ftime is null");
            return (Criteria) this;
        }

        public Criteria andTsjyFtimeIsNotNull() {
            addCriterion("tsjy_ftime is not null");
            return (Criteria) this;
        }

        public Criteria andTsjyFtimeEqualTo(String value) {
            addCriterion("tsjy_ftime =", value, "tsjyFtime");
            return (Criteria) this;
        }

        public Criteria andTsjyFtimeNotEqualTo(String value) {
            addCriterion("tsjy_ftime <>", value, "tsjyFtime");
            return (Criteria) this;
        }

        public Criteria andTsjyFtimeGreaterThan(String value) {
            addCriterion("tsjy_ftime >", value, "tsjyFtime");
            return (Criteria) this;
        }

        public Criteria andTsjyFtimeGreaterThanOrEqualTo(String value) {
            addCriterion("tsjy_ftime >=", value, "tsjyFtime");
            return (Criteria) this;
        }

        public Criteria andTsjyFtimeLessThan(String value) {
            addCriterion("tsjy_ftime <", value, "tsjyFtime");
            return (Criteria) this;
        }

        public Criteria andTsjyFtimeLessThanOrEqualTo(String value) {
            addCriterion("tsjy_ftime <=", value, "tsjyFtime");
            return (Criteria) this;
        }

        public Criteria andTsjyFtimeLike(String value) {
            addCriterion("tsjy_ftime like", value, "tsjyFtime");
            return (Criteria) this;
        }

        public Criteria andTsjyFtimeNotLike(String value) {
            addCriterion("tsjy_ftime not like", value, "tsjyFtime");
            return (Criteria) this;
        }

        public Criteria andTsjyFtimeIn(List<String> values) {
            addCriterion("tsjy_ftime in", values, "tsjyFtime");
            return (Criteria) this;
        }

        public Criteria andTsjyFtimeNotIn(List<String> values) {
            addCriterion("tsjy_ftime not in", values, "tsjyFtime");
            return (Criteria) this;
        }

        public Criteria andTsjyFtimeBetween(String value1, String value2) {
            addCriterion("tsjy_ftime between", value1, value2, "tsjyFtime");
            return (Criteria) this;
        }

        public Criteria andTsjyFtimeNotBetween(String value1, String value2) {
            addCriterion("tsjy_ftime not between", value1, value2, "tsjyFtime");
            return (Criteria) this;
        }

        public Criteria andTsjyNumIsNull() {
            addCriterion("tsjy_num is null");
            return (Criteria) this;
        }

        public Criteria andTsjyNumIsNotNull() {
            addCriterion("tsjy_num is not null");
            return (Criteria) this;
        }

        public Criteria andTsjyNumEqualTo(Integer value) {
            addCriterion("tsjy_num =", value, "tsjyNum");
            return (Criteria) this;
        }

        public Criteria andTsjyNumNotEqualTo(Integer value) {
            addCriterion("tsjy_num <>", value, "tsjyNum");
            return (Criteria) this;
        }

        public Criteria andTsjyNumGreaterThan(Integer value) {
            addCriterion("tsjy_num >", value, "tsjyNum");
            return (Criteria) this;
        }

        public Criteria andTsjyNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("tsjy_num >=", value, "tsjyNum");
            return (Criteria) this;
        }

        public Criteria andTsjyNumLessThan(Integer value) {
            addCriterion("tsjy_num <", value, "tsjyNum");
            return (Criteria) this;
        }

        public Criteria andTsjyNumLessThanOrEqualTo(Integer value) {
            addCriterion("tsjy_num <=", value, "tsjyNum");
            return (Criteria) this;
        }

        public Criteria andTsjyNumIn(List<Integer> values) {
            addCriterion("tsjy_num in", values, "tsjyNum");
            return (Criteria) this;
        }

        public Criteria andTsjyNumNotIn(List<Integer> values) {
            addCriterion("tsjy_num not in", values, "tsjyNum");
            return (Criteria) this;
        }

        public Criteria andTsjyNumBetween(Integer value1, Integer value2) {
            addCriterion("tsjy_num between", value1, value2, "tsjyNum");
            return (Criteria) this;
        }

        public Criteria andTsjyNumNotBetween(Integer value1, Integer value2) {
            addCriterion("tsjy_num not between", value1, value2, "tsjyNum");
            return (Criteria) this;
        }

        public Criteria andJyztIdIsNull() {
            addCriterion("jyzt_id is null");
            return (Criteria) this;
        }

        public Criteria andJyztIdIsNotNull() {
            addCriterion("jyzt_id is not null");
            return (Criteria) this;
        }

        public Criteria andJyztIdEqualTo(Integer value) {
            addCriterion("jyzt_id =", value, "jyztId");
            return (Criteria) this;
        }

        public Criteria andJyztIdNotEqualTo(Integer value) {
            addCriterion("jyzt_id <>", value, "jyztId");
            return (Criteria) this;
        }

        public Criteria andJyztIdGreaterThan(Integer value) {
            addCriterion("jyzt_id >", value, "jyztId");
            return (Criteria) this;
        }

        public Criteria andJyztIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("jyzt_id >=", value, "jyztId");
            return (Criteria) this;
        }

        public Criteria andJyztIdLessThan(Integer value) {
            addCriterion("jyzt_id <", value, "jyztId");
            return (Criteria) this;
        }

        public Criteria andJyztIdLessThanOrEqualTo(Integer value) {
            addCriterion("jyzt_id <=", value, "jyztId");
            return (Criteria) this;
        }

        public Criteria andJyztIdIn(List<Integer> values) {
            addCriterion("jyzt_id in", values, "jyztId");
            return (Criteria) this;
        }

        public Criteria andJyztIdNotIn(List<Integer> values) {
            addCriterion("jyzt_id not in", values, "jyztId");
            return (Criteria) this;
        }

        public Criteria andJyztIdBetween(Integer value1, Integer value2) {
            addCriterion("jyzt_id between", value1, value2, "jyztId");
            return (Criteria) this;
        }

        public Criteria andJyztIdNotBetween(Integer value1, Integer value2) {
            addCriterion("jyzt_id not between", value1, value2, "jyztId");
            return (Criteria) this;
        }

        public Criteria andTsjyCostIsNull() {
            addCriterion("tsjy_cost is null");
            return (Criteria) this;
        }

        public Criteria andTsjyCostIsNotNull() {
            addCriterion("tsjy_cost is not null");
            return (Criteria) this;
        }

        public Criteria andTsjyCostEqualTo(Double value) {
            addCriterion("tsjy_cost =", value, "tsjyCost");
            return (Criteria) this;
        }

        public Criteria andTsjyCostNotEqualTo(Double value) {
            addCriterion("tsjy_cost <>", value, "tsjyCost");
            return (Criteria) this;
        }

        public Criteria andTsjyCostGreaterThan(Double value) {
            addCriterion("tsjy_cost >", value, "tsjyCost");
            return (Criteria) this;
        }

        public Criteria andTsjyCostGreaterThanOrEqualTo(Double value) {
            addCriterion("tsjy_cost >=", value, "tsjyCost");
            return (Criteria) this;
        }

        public Criteria andTsjyCostLessThan(Double value) {
            addCriterion("tsjy_cost <", value, "tsjyCost");
            return (Criteria) this;
        }

        public Criteria andTsjyCostLessThanOrEqualTo(Double value) {
            addCriterion("tsjy_cost <=", value, "tsjyCost");
            return (Criteria) this;
        }

        public Criteria andTsjyCostIn(List<Double> values) {
            addCriterion("tsjy_cost in", values, "tsjyCost");
            return (Criteria) this;
        }

        public Criteria andTsjyCostNotIn(List<Double> values) {
            addCriterion("tsjy_cost not in", values, "tsjyCost");
            return (Criteria) this;
        }

        public Criteria andTsjyCostBetween(Double value1, Double value2) {
            addCriterion("tsjy_cost between", value1, value2, "tsjyCost");
            return (Criteria) this;
        }

        public Criteria andTsjyCostNotBetween(Double value1, Double value2) {
            addCriterion("tsjy_cost not between", value1, value2, "tsjyCost");
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