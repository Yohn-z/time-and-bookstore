package com.bookshop.pojo.po;

import java.util.ArrayList;
import java.util.List;

public class LibLetterExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public LibLetterExample() {
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

        public Criteria andLIdIsNull() {
            addCriterion("l_id is null");
            return (Criteria) this;
        }

        public Criteria andLIdIsNotNull() {
            addCriterion("l_id is not null");
            return (Criteria) this;
        }

        public Criteria andLIdEqualTo(Integer value) {
            addCriterion("l_id =", value, "lId");
            return (Criteria) this;
        }

        public Criteria andLIdNotEqualTo(Integer value) {
            addCriterion("l_id <>", value, "lId");
            return (Criteria) this;
        }

        public Criteria andLIdGreaterThan(Integer value) {
            addCriterion("l_id >", value, "lId");
            return (Criteria) this;
        }

        public Criteria andLIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("l_id >=", value, "lId");
            return (Criteria) this;
        }

        public Criteria andLIdLessThan(Integer value) {
            addCriterion("l_id <", value, "lId");
            return (Criteria) this;
        }

        public Criteria andLIdLessThanOrEqualTo(Integer value) {
            addCriterion("l_id <=", value, "lId");
            return (Criteria) this;
        }

        public Criteria andLIdIn(List<Integer> values) {
            addCriterion("l_id in", values, "lId");
            return (Criteria) this;
        }

        public Criteria andLIdNotIn(List<Integer> values) {
            addCriterion("l_id not in", values, "lId");
            return (Criteria) this;
        }

        public Criteria andLIdBetween(Integer value1, Integer value2) {
            addCriterion("l_id between", value1, value2, "lId");
            return (Criteria) this;
        }

        public Criteria andLIdNotBetween(Integer value1, Integer value2) {
            addCriterion("l_id not between", value1, value2, "lId");
            return (Criteria) this;
        }

        public Criteria andLMsgIsNull() {
            addCriterion("l_msg is null");
            return (Criteria) this;
        }

        public Criteria andLMsgIsNotNull() {
            addCriterion("l_msg is not null");
            return (Criteria) this;
        }

        public Criteria andLMsgEqualTo(String value) {
            addCriterion("l_msg =", value, "lMsg");
            return (Criteria) this;
        }

        public Criteria andLMsgNotEqualTo(String value) {
            addCriterion("l_msg <>", value, "lMsg");
            return (Criteria) this;
        }

        public Criteria andLMsgGreaterThan(String value) {
            addCriterion("l_msg >", value, "lMsg");
            return (Criteria) this;
        }

        public Criteria andLMsgGreaterThanOrEqualTo(String value) {
            addCriterion("l_msg >=", value, "lMsg");
            return (Criteria) this;
        }

        public Criteria andLMsgLessThan(String value) {
            addCriterion("l_msg <", value, "lMsg");
            return (Criteria) this;
        }

        public Criteria andLMsgLessThanOrEqualTo(String value) {
            addCriterion("l_msg <=", value, "lMsg");
            return (Criteria) this;
        }

        public Criteria andLMsgLike(String value) {
            addCriterion("l_msg like", value, "lMsg");
            return (Criteria) this;
        }

        public Criteria andLMsgNotLike(String value) {
            addCriterion("l_msg not like", value, "lMsg");
            return (Criteria) this;
        }

        public Criteria andLMsgIn(List<String> values) {
            addCriterion("l_msg in", values, "lMsg");
            return (Criteria) this;
        }

        public Criteria andLMsgNotIn(List<String> values) {
            addCriterion("l_msg not in", values, "lMsg");
            return (Criteria) this;
        }

        public Criteria andLMsgBetween(String value1, String value2) {
            addCriterion("l_msg between", value1, value2, "lMsg");
            return (Criteria) this;
        }

        public Criteria andLMsgNotBetween(String value1, String value2) {
            addCriterion("l_msg not between", value1, value2, "lMsg");
            return (Criteria) this;
        }

        public Criteria andLZtIsNull() {
            addCriterion("l_zt is null");
            return (Criteria) this;
        }

        public Criteria andLZtIsNotNull() {
            addCriterion("l_zt is not null");
            return (Criteria) this;
        }

        public Criteria andLZtEqualTo(Integer value) {
            addCriterion("l_zt =", value, "lZt");
            return (Criteria) this;
        }

        public Criteria andLZtNotEqualTo(Integer value) {
            addCriterion("l_zt <>", value, "lZt");
            return (Criteria) this;
        }

        public Criteria andLZtGreaterThan(Integer value) {
            addCriterion("l_zt >", value, "lZt");
            return (Criteria) this;
        }

        public Criteria andLZtGreaterThanOrEqualTo(Integer value) {
            addCriterion("l_zt >=", value, "lZt");
            return (Criteria) this;
        }

        public Criteria andLZtLessThan(Integer value) {
            addCriterion("l_zt <", value, "lZt");
            return (Criteria) this;
        }

        public Criteria andLZtLessThanOrEqualTo(Integer value) {
            addCriterion("l_zt <=", value, "lZt");
            return (Criteria) this;
        }

        public Criteria andLZtIn(List<Integer> values) {
            addCriterion("l_zt in", values, "lZt");
            return (Criteria) this;
        }

        public Criteria andLZtNotIn(List<Integer> values) {
            addCriterion("l_zt not in", values, "lZt");
            return (Criteria) this;
        }

        public Criteria andLZtBetween(Integer value1, Integer value2) {
            addCriterion("l_zt between", value1, value2, "lZt");
            return (Criteria) this;
        }

        public Criteria andLZtNotBetween(Integer value1, Integer value2) {
            addCriterion("l_zt not between", value1, value2, "lZt");
            return (Criteria) this;
        }

        public Criteria andLFuserIsNull() {
            addCriterion("l_fuser is null");
            return (Criteria) this;
        }

        public Criteria andLFuserIsNotNull() {
            addCriterion("l_fuser is not null");
            return (Criteria) this;
        }

        public Criteria andLFuserEqualTo(String value) {
            addCriterion("l_fuser =", value, "lFuser");
            return (Criteria) this;
        }

        public Criteria andLFuserNotEqualTo(String value) {
            addCriterion("l_fuser <>", value, "lFuser");
            return (Criteria) this;
        }

        public Criteria andLFuserGreaterThan(String value) {
            addCriterion("l_fuser >", value, "lFuser");
            return (Criteria) this;
        }

        public Criteria andLFuserGreaterThanOrEqualTo(String value) {
            addCriterion("l_fuser >=", value, "lFuser");
            return (Criteria) this;
        }

        public Criteria andLFuserLessThan(String value) {
            addCriterion("l_fuser <", value, "lFuser");
            return (Criteria) this;
        }

        public Criteria andLFuserLessThanOrEqualTo(String value) {
            addCriterion("l_fuser <=", value, "lFuser");
            return (Criteria) this;
        }

        public Criteria andLFuserLike(String value) {
            addCriterion("l_fuser like", value, "lFuser");
            return (Criteria) this;
        }

        public Criteria andLFuserNotLike(String value) {
            addCriterion("l_fuser not like", value, "lFuser");
            return (Criteria) this;
        }

        public Criteria andLFuserIn(List<String> values) {
            addCriterion("l_fuser in", values, "lFuser");
            return (Criteria) this;
        }

        public Criteria andLFuserNotIn(List<String> values) {
            addCriterion("l_fuser not in", values, "lFuser");
            return (Criteria) this;
        }

        public Criteria andLFuserBetween(String value1, String value2) {
            addCriterion("l_fuser between", value1, value2, "lFuser");
            return (Criteria) this;
        }

        public Criteria andLFuserNotBetween(String value1, String value2) {
            addCriterion("l_fuser not between", value1, value2, "lFuser");
            return (Criteria) this;
        }

        public Criteria andLWhoIsNull() {
            addCriterion("l_who is null");
            return (Criteria) this;
        }

        public Criteria andLWhoIsNotNull() {
            addCriterion("l_who is not null");
            return (Criteria) this;
        }

        public Criteria andLWhoEqualTo(Integer value) {
            addCriterion("l_who =", value, "lWho");
            return (Criteria) this;
        }

        public Criteria andLWhoNotEqualTo(Integer value) {
            addCriterion("l_who <>", value, "lWho");
            return (Criteria) this;
        }

        public Criteria andLWhoGreaterThan(Integer value) {
            addCriterion("l_who >", value, "lWho");
            return (Criteria) this;
        }

        public Criteria andLWhoGreaterThanOrEqualTo(Integer value) {
            addCriterion("l_who >=", value, "lWho");
            return (Criteria) this;
        }

        public Criteria andLWhoLessThan(Integer value) {
            addCriterion("l_who <", value, "lWho");
            return (Criteria) this;
        }

        public Criteria andLWhoLessThanOrEqualTo(Integer value) {
            addCriterion("l_who <=", value, "lWho");
            return (Criteria) this;
        }

        public Criteria andLWhoIn(List<Integer> values) {
            addCriterion("l_who in", values, "lWho");
            return (Criteria) this;
        }

        public Criteria andLWhoNotIn(List<Integer> values) {
            addCriterion("l_who not in", values, "lWho");
            return (Criteria) this;
        }

        public Criteria andLWhoBetween(Integer value1, Integer value2) {
            addCriterion("l_who between", value1, value2, "lWho");
            return (Criteria) this;
        }

        public Criteria andLWhoNotBetween(Integer value1, Integer value2) {
            addCriterion("l_who not between", value1, value2, "lWho");
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