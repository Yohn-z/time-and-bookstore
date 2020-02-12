package com.bookshop.pojo.po;

import java.util.ArrayList;
import java.util.List;

public class LibTslbExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public LibTslbExample() {
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

        public Criteria andTslbNameIsNull() {
            addCriterion("tslb_name is null");
            return (Criteria) this;
        }

        public Criteria andTslbNameIsNotNull() {
            addCriterion("tslb_name is not null");
            return (Criteria) this;
        }

        public Criteria andTslbNameEqualTo(String value) {
            addCriterion("tslb_name =", value, "tslbName");
            return (Criteria) this;
        }

        public Criteria andTslbNameNotEqualTo(String value) {
            addCriterion("tslb_name <>", value, "tslbName");
            return (Criteria) this;
        }

        public Criteria andTslbNameGreaterThan(String value) {
            addCriterion("tslb_name >", value, "tslbName");
            return (Criteria) this;
        }

        public Criteria andTslbNameGreaterThanOrEqualTo(String value) {
            addCriterion("tslb_name >=", value, "tslbName");
            return (Criteria) this;
        }

        public Criteria andTslbNameLessThan(String value) {
            addCriterion("tslb_name <", value, "tslbName");
            return (Criteria) this;
        }

        public Criteria andTslbNameLessThanOrEqualTo(String value) {
            addCriterion("tslb_name <=", value, "tslbName");
            return (Criteria) this;
        }

        public Criteria andTslbNameLike(String value) {
            addCriterion("tslb_name like", value, "tslbName");
            return (Criteria) this;
        }

        public Criteria andTslbNameNotLike(String value) {
            addCriterion("tslb_name not like", value, "tslbName");
            return (Criteria) this;
        }

        public Criteria andTslbNameIn(List<String> values) {
            addCriterion("tslb_name in", values, "tslbName");
            return (Criteria) this;
        }

        public Criteria andTslbNameNotIn(List<String> values) {
            addCriterion("tslb_name not in", values, "tslbName");
            return (Criteria) this;
        }

        public Criteria andTslbNameBetween(String value1, String value2) {
            addCriterion("tslb_name between", value1, value2, "tslbName");
            return (Criteria) this;
        }

        public Criteria andTslbNameNotBetween(String value1, String value2) {
            addCriterion("tslb_name not between", value1, value2, "tslbName");
            return (Criteria) this;
        }

        public Criteria andTslbIdIsNull() {
            addCriterion("tslb_id is null");
            return (Criteria) this;
        }

        public Criteria andTslbIdIsNotNull() {
            addCriterion("tslb_id is not null");
            return (Criteria) this;
        }

        public Criteria andTslbIdEqualTo(Integer value) {
            addCriterion("tslb_id =", value, "tslbId");
            return (Criteria) this;
        }

        public Criteria andTslbIdNotEqualTo(Integer value) {
            addCriterion("tslb_id <>", value, "tslbId");
            return (Criteria) this;
        }

        public Criteria andTslbIdGreaterThan(Integer value) {
            addCriterion("tslb_id >", value, "tslbId");
            return (Criteria) this;
        }

        public Criteria andTslbIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("tslb_id >=", value, "tslbId");
            return (Criteria) this;
        }

        public Criteria andTslbIdLessThan(Integer value) {
            addCriterion("tslb_id <", value, "tslbId");
            return (Criteria) this;
        }

        public Criteria andTslbIdLessThanOrEqualTo(Integer value) {
            addCriterion("tslb_id <=", value, "tslbId");
            return (Criteria) this;
        }

        public Criteria andTslbIdIn(List<Integer> values) {
            addCriterion("tslb_id in", values, "tslbId");
            return (Criteria) this;
        }

        public Criteria andTslbIdNotIn(List<Integer> values) {
            addCriterion("tslb_id not in", values, "tslbId");
            return (Criteria) this;
        }

        public Criteria andTslbIdBetween(Integer value1, Integer value2) {
            addCriterion("tslb_id between", value1, value2, "tslbId");
            return (Criteria) this;
        }

        public Criteria andTslbIdNotBetween(Integer value1, Integer value2) {
            addCriterion("tslb_id not between", value1, value2, "tslbId");
            return (Criteria) this;
        }

        public Criteria andTslbNumIsNull() {
            addCriterion("tslb_num is null");
            return (Criteria) this;
        }

        public Criteria andTslbNumIsNotNull() {
            addCriterion("tslb_num is not null");
            return (Criteria) this;
        }

        public Criteria andTslbNumEqualTo(Integer value) {
            addCriterion("tslb_num =", value, "tslbNum");
            return (Criteria) this;
        }

        public Criteria andTslbNumNotEqualTo(Integer value) {
            addCriterion("tslb_num <>", value, "tslbNum");
            return (Criteria) this;
        }

        public Criteria andTslbNumGreaterThan(Integer value) {
            addCriterion("tslb_num >", value, "tslbNum");
            return (Criteria) this;
        }

        public Criteria andTslbNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("tslb_num >=", value, "tslbNum");
            return (Criteria) this;
        }

        public Criteria andTslbNumLessThan(Integer value) {
            addCriterion("tslb_num <", value, "tslbNum");
            return (Criteria) this;
        }

        public Criteria andTslbNumLessThanOrEqualTo(Integer value) {
            addCriterion("tslb_num <=", value, "tslbNum");
            return (Criteria) this;
        }

        public Criteria andTslbNumIn(List<Integer> values) {
            addCriterion("tslb_num in", values, "tslbNum");
            return (Criteria) this;
        }

        public Criteria andTslbNumNotIn(List<Integer> values) {
            addCriterion("tslb_num not in", values, "tslbNum");
            return (Criteria) this;
        }

        public Criteria andTslbNumBetween(Integer value1, Integer value2) {
            addCriterion("tslb_num between", value1, value2, "tslbNum");
            return (Criteria) this;
        }

        public Criteria andTslbNumNotBetween(Integer value1, Integer value2) {
            addCriterion("tslb_num not between", value1, value2, "tslbNum");
            return (Criteria) this;
        }

        public Criteria andTslbOnnumIsNull() {
            addCriterion("tslb_onnum is null");
            return (Criteria) this;
        }

        public Criteria andTslbOnnumIsNotNull() {
            addCriterion("tslb_onnum is not null");
            return (Criteria) this;
        }

        public Criteria andTslbOnnumEqualTo(Integer value) {
            addCriterion("tslb_onnum =", value, "tslbOnnum");
            return (Criteria) this;
        }

        public Criteria andTslbOnnumNotEqualTo(Integer value) {
            addCriterion("tslb_onnum <>", value, "tslbOnnum");
            return (Criteria) this;
        }

        public Criteria andTslbOnnumGreaterThan(Integer value) {
            addCriterion("tslb_onnum >", value, "tslbOnnum");
            return (Criteria) this;
        }

        public Criteria andTslbOnnumGreaterThanOrEqualTo(Integer value) {
            addCriterion("tslb_onnum >=", value, "tslbOnnum");
            return (Criteria) this;
        }

        public Criteria andTslbOnnumLessThan(Integer value) {
            addCriterion("tslb_onnum <", value, "tslbOnnum");
            return (Criteria) this;
        }

        public Criteria andTslbOnnumLessThanOrEqualTo(Integer value) {
            addCriterion("tslb_onnum <=", value, "tslbOnnum");
            return (Criteria) this;
        }

        public Criteria andTslbOnnumIn(List<Integer> values) {
            addCriterion("tslb_onnum in", values, "tslbOnnum");
            return (Criteria) this;
        }

        public Criteria andTslbOnnumNotIn(List<Integer> values) {
            addCriterion("tslb_onnum not in", values, "tslbOnnum");
            return (Criteria) this;
        }

        public Criteria andTslbOnnumBetween(Integer value1, Integer value2) {
            addCriterion("tslb_onnum between", value1, value2, "tslbOnnum");
            return (Criteria) this;
        }

        public Criteria andTslbOnnumNotBetween(Integer value1, Integer value2) {
            addCriterion("tslb_onnum not between", value1, value2, "tslbOnnum");
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