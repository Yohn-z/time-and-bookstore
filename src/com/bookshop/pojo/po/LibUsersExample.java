package com.bookshop.pojo.po;

import java.util.ArrayList;
import java.util.List;

public class LibUsersExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public LibUsersExample() {
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

        public Criteria andUNameIsNull() {
            addCriterion("u_name is null");
            return (Criteria) this;
        }

        public Criteria andUNameIsNotNull() {
            addCriterion("u_name is not null");
            return (Criteria) this;
        }

        public Criteria andUNameEqualTo(String value) {
            addCriterion("u_name =", value, "uName");
            return (Criteria) this;
        }

        public Criteria andUNameNotEqualTo(String value) {
            addCriterion("u_name <>", value, "uName");
            return (Criteria) this;
        }

        public Criteria andUNameGreaterThan(String value) {
            addCriterion("u_name >", value, "uName");
            return (Criteria) this;
        }

        public Criteria andUNameGreaterThanOrEqualTo(String value) {
            addCriterion("u_name >=", value, "uName");
            return (Criteria) this;
        }

        public Criteria andUNameLessThan(String value) {
            addCriterion("u_name <", value, "uName");
            return (Criteria) this;
        }

        public Criteria andUNameLessThanOrEqualTo(String value) {
            addCriterion("u_name <=", value, "uName");
            return (Criteria) this;
        }

        public Criteria andUNameLike(String value) {
            addCriterion("u_name like", value, "uName");
            return (Criteria) this;
        }

        public Criteria andUNameNotLike(String value) {
            addCriterion("u_name not like", value, "uName");
            return (Criteria) this;
        }

        public Criteria andUNameIn(List<String> values) {
            addCriterion("u_name in", values, "uName");
            return (Criteria) this;
        }

        public Criteria andUNameNotIn(List<String> values) {
            addCriterion("u_name not in", values, "uName");
            return (Criteria) this;
        }

        public Criteria andUNameBetween(String value1, String value2) {
            addCriterion("u_name between", value1, value2, "uName");
            return (Criteria) this;
        }

        public Criteria andUNameNotBetween(String value1, String value2) {
            addCriterion("u_name not between", value1, value2, "uName");
            return (Criteria) this;
        }

        public Criteria andUPassIsNull() {
            addCriterion("u_pass is null");
            return (Criteria) this;
        }

        public Criteria andUPassIsNotNull() {
            addCriterion("u_pass is not null");
            return (Criteria) this;
        }

        public Criteria andUPassEqualTo(String value) {
            addCriterion("u_pass =", value, "uPass");
            return (Criteria) this;
        }

        public Criteria andUPassNotEqualTo(String value) {
            addCriterion("u_pass <>", value, "uPass");
            return (Criteria) this;
        }

        public Criteria andUPassGreaterThan(String value) {
            addCriterion("u_pass >", value, "uPass");
            return (Criteria) this;
        }

        public Criteria andUPassGreaterThanOrEqualTo(String value) {
            addCriterion("u_pass >=", value, "uPass");
            return (Criteria) this;
        }

        public Criteria andUPassLessThan(String value) {
            addCriterion("u_pass <", value, "uPass");
            return (Criteria) this;
        }

        public Criteria andUPassLessThanOrEqualTo(String value) {
            addCriterion("u_pass <=", value, "uPass");
            return (Criteria) this;
        }

        public Criteria andUPassLike(String value) {
            addCriterion("u_pass like", value, "uPass");
            return (Criteria) this;
        }

        public Criteria andUPassNotLike(String value) {
            addCriterion("u_pass not like", value, "uPass");
            return (Criteria) this;
        }

        public Criteria andUPassIn(List<String> values) {
            addCriterion("u_pass in", values, "uPass");
            return (Criteria) this;
        }

        public Criteria andUPassNotIn(List<String> values) {
            addCriterion("u_pass not in", values, "uPass");
            return (Criteria) this;
        }

        public Criteria andUPassBetween(String value1, String value2) {
            addCriterion("u_pass between", value1, value2, "uPass");
            return (Criteria) this;
        }

        public Criteria andUPassNotBetween(String value1, String value2) {
            addCriterion("u_pass not between", value1, value2, "uPass");
            return (Criteria) this;
        }

        public Criteria andUTimeIsNull() {
            addCriterion("u_time is null");
            return (Criteria) this;
        }

        public Criteria andUTimeIsNotNull() {
            addCriterion("u_time is not null");
            return (Criteria) this;
        }

        public Criteria andUTimeEqualTo(String value) {
            addCriterion("u_time =", value, "uTime");
            return (Criteria) this;
        }

        public Criteria andUTimeNotEqualTo(String value) {
            addCriterion("u_time <>", value, "uTime");
            return (Criteria) this;
        }

        public Criteria andUTimeGreaterThan(String value) {
            addCriterion("u_time >", value, "uTime");
            return (Criteria) this;
        }

        public Criteria andUTimeGreaterThanOrEqualTo(String value) {
            addCriterion("u_time >=", value, "uTime");
            return (Criteria) this;
        }

        public Criteria andUTimeLessThan(String value) {
            addCriterion("u_time <", value, "uTime");
            return (Criteria) this;
        }

        public Criteria andUTimeLessThanOrEqualTo(String value) {
            addCriterion("u_time <=", value, "uTime");
            return (Criteria) this;
        }

        public Criteria andUTimeLike(String value) {
            addCriterion("u_time like", value, "uTime");
            return (Criteria) this;
        }

        public Criteria andUTimeNotLike(String value) {
            addCriterion("u_time not like", value, "uTime");
            return (Criteria) this;
        }

        public Criteria andUTimeIn(List<String> values) {
            addCriterion("u_time in", values, "uTime");
            return (Criteria) this;
        }

        public Criteria andUTimeNotIn(List<String> values) {
            addCriterion("u_time not in", values, "uTime");
            return (Criteria) this;
        }

        public Criteria andUTimeBetween(String value1, String value2) {
            addCriterion("u_time between", value1, value2, "uTime");
            return (Criteria) this;
        }

        public Criteria andUTimeNotBetween(String value1, String value2) {
            addCriterion("u_time not between", value1, value2, "uTime");
            return (Criteria) this;
        }

        public Criteria andUSexIsNull() {
            addCriterion("u_sex is null");
            return (Criteria) this;
        }

        public Criteria andUSexIsNotNull() {
            addCriterion("u_sex is not null");
            return (Criteria) this;
        }

        public Criteria andUSexEqualTo(String value) {
            addCriterion("u_sex =", value, "uSex");
            return (Criteria) this;
        }

        public Criteria andUSexNotEqualTo(String value) {
            addCriterion("u_sex <>", value, "uSex");
            return (Criteria) this;
        }

        public Criteria andUSexGreaterThan(String value) {
            addCriterion("u_sex >", value, "uSex");
            return (Criteria) this;
        }

        public Criteria andUSexGreaterThanOrEqualTo(String value) {
            addCriterion("u_sex >=", value, "uSex");
            return (Criteria) this;
        }

        public Criteria andUSexLessThan(String value) {
            addCriterion("u_sex <", value, "uSex");
            return (Criteria) this;
        }

        public Criteria andUSexLessThanOrEqualTo(String value) {
            addCriterion("u_sex <=", value, "uSex");
            return (Criteria) this;
        }

        public Criteria andUSexLike(String value) {
            addCriterion("u_sex like", value, "uSex");
            return (Criteria) this;
        }

        public Criteria andUSexNotLike(String value) {
            addCriterion("u_sex not like", value, "uSex");
            return (Criteria) this;
        }

        public Criteria andUSexIn(List<String> values) {
            addCriterion("u_sex in", values, "uSex");
            return (Criteria) this;
        }

        public Criteria andUSexNotIn(List<String> values) {
            addCriterion("u_sex not in", values, "uSex");
            return (Criteria) this;
        }

        public Criteria andUSexBetween(String value1, String value2) {
            addCriterion("u_sex between", value1, value2, "uSex");
            return (Criteria) this;
        }

        public Criteria andUSexNotBetween(String value1, String value2) {
            addCriterion("u_sex not between", value1, value2, "uSex");
            return (Criteria) this;
        }

        public Criteria andUTelIsNull() {
            addCriterion("u_tel is null");
            return (Criteria) this;
        }

        public Criteria andUTelIsNotNull() {
            addCriterion("u_tel is not null");
            return (Criteria) this;
        }

        public Criteria andUTelEqualTo(String value) {
            addCriterion("u_tel =", value, "uTel");
            return (Criteria) this;
        }

        public Criteria andUTelNotEqualTo(String value) {
            addCriterion("u_tel <>", value, "uTel");
            return (Criteria) this;
        }

        public Criteria andUTelGreaterThan(String value) {
            addCriterion("u_tel >", value, "uTel");
            return (Criteria) this;
        }

        public Criteria andUTelGreaterThanOrEqualTo(String value) {
            addCriterion("u_tel >=", value, "uTel");
            return (Criteria) this;
        }

        public Criteria andUTelLessThan(String value) {
            addCriterion("u_tel <", value, "uTel");
            return (Criteria) this;
        }

        public Criteria andUTelLessThanOrEqualTo(String value) {
            addCriterion("u_tel <=", value, "uTel");
            return (Criteria) this;
        }

        public Criteria andUTelLike(String value) {
            addCriterion("u_tel like", value, "uTel");
            return (Criteria) this;
        }

        public Criteria andUTelNotLike(String value) {
            addCriterion("u_tel not like", value, "uTel");
            return (Criteria) this;
        }

        public Criteria andUTelIn(List<String> values) {
            addCriterion("u_tel in", values, "uTel");
            return (Criteria) this;
        }

        public Criteria andUTelNotIn(List<String> values) {
            addCriterion("u_tel not in", values, "uTel");
            return (Criteria) this;
        }

        public Criteria andUTelBetween(String value1, String value2) {
            addCriterion("u_tel between", value1, value2, "uTel");
            return (Criteria) this;
        }

        public Criteria andUTelNotBetween(String value1, String value2) {
            addCriterion("u_tel not between", value1, value2, "uTel");
            return (Criteria) this;
        }

        public Criteria andUDebtIsNull() {
            addCriterion("u_debt is null");
            return (Criteria) this;
        }

        public Criteria andUDebtIsNotNull() {
            addCriterion("u_debt is not null");
            return (Criteria) this;
        }

        public Criteria andUDebtEqualTo(Double value) {
            addCriterion("u_debt =", value, "uDebt");
            return (Criteria) this;
        }

        public Criteria andUDebtNotEqualTo(Double value) {
            addCriterion("u_debt <>", value, "uDebt");
            return (Criteria) this;
        }

        public Criteria andUDebtGreaterThan(Double value) {
            addCriterion("u_debt >", value, "uDebt");
            return (Criteria) this;
        }

        public Criteria andUDebtGreaterThanOrEqualTo(Double value) {
            addCriterion("u_debt >=", value, "uDebt");
            return (Criteria) this;
        }

        public Criteria andUDebtLessThan(Double value) {
            addCriterion("u_debt <", value, "uDebt");
            return (Criteria) this;
        }

        public Criteria andUDebtLessThanOrEqualTo(Double value) {
            addCriterion("u_debt <=", value, "uDebt");
            return (Criteria) this;
        }

        public Criteria andUDebtIn(List<Double> values) {
            addCriterion("u_debt in", values, "uDebt");
            return (Criteria) this;
        }

        public Criteria andUDebtNotIn(List<Double> values) {
            addCriterion("u_debt not in", values, "uDebt");
            return (Criteria) this;
        }

        public Criteria andUDebtBetween(Double value1, Double value2) {
            addCriterion("u_debt between", value1, value2, "uDebt");
            return (Criteria) this;
        }

        public Criteria andUDebtNotBetween(Double value1, Double value2) {
            addCriterion("u_debt not between", value1, value2, "uDebt");
            return (Criteria) this;
        }

        public Criteria andUPicurlIsNull() {
            addCriterion("u_picurl is null");
            return (Criteria) this;
        }

        public Criteria andUPicurlIsNotNull() {
            addCriterion("u_picurl is not null");
            return (Criteria) this;
        }

        public Criteria andUPicurlEqualTo(String value) {
            addCriterion("u_picurl =", value, "uPicurl");
            return (Criteria) this;
        }

        public Criteria andUPicurlNotEqualTo(String value) {
            addCriterion("u_picurl <>", value, "uPicurl");
            return (Criteria) this;
        }

        public Criteria andUPicurlGreaterThan(String value) {
            addCriterion("u_picurl >", value, "uPicurl");
            return (Criteria) this;
        }

        public Criteria andUPicurlGreaterThanOrEqualTo(String value) {
            addCriterion("u_picurl >=", value, "uPicurl");
            return (Criteria) this;
        }

        public Criteria andUPicurlLessThan(String value) {
            addCriterion("u_picurl <", value, "uPicurl");
            return (Criteria) this;
        }

        public Criteria andUPicurlLessThanOrEqualTo(String value) {
            addCriterion("u_picurl <=", value, "uPicurl");
            return (Criteria) this;
        }

        public Criteria andUPicurlLike(String value) {
            addCriterion("u_picurl like", value, "uPicurl");
            return (Criteria) this;
        }

        public Criteria andUPicurlNotLike(String value) {
            addCriterion("u_picurl not like", value, "uPicurl");
            return (Criteria) this;
        }

        public Criteria andUPicurlIn(List<String> values) {
            addCriterion("u_picurl in", values, "uPicurl");
            return (Criteria) this;
        }

        public Criteria andUPicurlNotIn(List<String> values) {
            addCriterion("u_picurl not in", values, "uPicurl");
            return (Criteria) this;
        }

        public Criteria andUPicurlBetween(String value1, String value2) {
            addCriterion("u_picurl between", value1, value2, "uPicurl");
            return (Criteria) this;
        }

        public Criteria andUPicurlNotBetween(String value1, String value2) {
            addCriterion("u_picurl not between", value1, value2, "uPicurl");
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