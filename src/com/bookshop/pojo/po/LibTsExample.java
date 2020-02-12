package com.bookshop.pojo.po;

import java.util.ArrayList;
import java.util.List;

public class LibTsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public LibTsExample() {
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

        public Criteria andTsNameIsNull() {
            addCriterion("ts_name is null");
            return (Criteria) this;
        }

        public Criteria andTsNameIsNotNull() {
            addCriterion("ts_name is not null");
            return (Criteria) this;
        }

        public Criteria andTsNameEqualTo(String value) {
            addCriterion("ts_name =", value, "tsName");
            return (Criteria) this;
        }

        public Criteria andTsNameNotEqualTo(String value) {
            addCriterion("ts_name <>", value, "tsName");
            return (Criteria) this;
        }

        public Criteria andTsNameGreaterThan(String value) {
            addCriterion("ts_name >", value, "tsName");
            return (Criteria) this;
        }

        public Criteria andTsNameGreaterThanOrEqualTo(String value) {
            addCriterion("ts_name >=", value, "tsName");
            return (Criteria) this;
        }

        public Criteria andTsNameLessThan(String value) {
            addCriterion("ts_name <", value, "tsName");
            return (Criteria) this;
        }

        public Criteria andTsNameLessThanOrEqualTo(String value) {
            addCriterion("ts_name <=", value, "tsName");
            return (Criteria) this;
        }

        public Criteria andTsNameLike(String value) {
            addCriterion("ts_name like", value, "tsName");
            return (Criteria) this;
        }

        public Criteria andTsNameNotLike(String value) {
            addCriterion("ts_name not like", value, "tsName");
            return (Criteria) this;
        }

        public Criteria andTsNameIn(List<String> values) {
            addCriterion("ts_name in", values, "tsName");
            return (Criteria) this;
        }

        public Criteria andTsNameNotIn(List<String> values) {
            addCriterion("ts_name not in", values, "tsName");
            return (Criteria) this;
        }

        public Criteria andTsNameBetween(String value1, String value2) {
            addCriterion("ts_name between", value1, value2, "tsName");
            return (Criteria) this;
        }

        public Criteria andTsNameNotBetween(String value1, String value2) {
            addCriterion("ts_name not between", value1, value2, "tsName");
            return (Criteria) this;
        }

        public Criteria andTsAuthorIsNull() {
            addCriterion("ts_author is null");
            return (Criteria) this;
        }

        public Criteria andTsAuthorIsNotNull() {
            addCriterion("ts_author is not null");
            return (Criteria) this;
        }

        public Criteria andTsAuthorEqualTo(String value) {
            addCriterion("ts_author =", value, "tsAuthor");
            return (Criteria) this;
        }

        public Criteria andTsAuthorNotEqualTo(String value) {
            addCriterion("ts_author <>", value, "tsAuthor");
            return (Criteria) this;
        }

        public Criteria andTsAuthorGreaterThan(String value) {
            addCriterion("ts_author >", value, "tsAuthor");
            return (Criteria) this;
        }

        public Criteria andTsAuthorGreaterThanOrEqualTo(String value) {
            addCriterion("ts_author >=", value, "tsAuthor");
            return (Criteria) this;
        }

        public Criteria andTsAuthorLessThan(String value) {
            addCriterion("ts_author <", value, "tsAuthor");
            return (Criteria) this;
        }

        public Criteria andTsAuthorLessThanOrEqualTo(String value) {
            addCriterion("ts_author <=", value, "tsAuthor");
            return (Criteria) this;
        }

        public Criteria andTsAuthorLike(String value) {
            addCriterion("ts_author like", value, "tsAuthor");
            return (Criteria) this;
        }

        public Criteria andTsAuthorNotLike(String value) {
            addCriterion("ts_author not like", value, "tsAuthor");
            return (Criteria) this;
        }

        public Criteria andTsAuthorIn(List<String> values) {
            addCriterion("ts_author in", values, "tsAuthor");
            return (Criteria) this;
        }

        public Criteria andTsAuthorNotIn(List<String> values) {
            addCriterion("ts_author not in", values, "tsAuthor");
            return (Criteria) this;
        }

        public Criteria andTsAuthorBetween(String value1, String value2) {
            addCriterion("ts_author between", value1, value2, "tsAuthor");
            return (Criteria) this;
        }

        public Criteria andTsAuthorNotBetween(String value1, String value2) {
            addCriterion("ts_author not between", value1, value2, "tsAuthor");
            return (Criteria) this;
        }

        public Criteria andTsPublisherIsNull() {
            addCriterion("ts_publisher is null");
            return (Criteria) this;
        }

        public Criteria andTsPublisherIsNotNull() {
            addCriterion("ts_publisher is not null");
            return (Criteria) this;
        }

        public Criteria andTsPublisherEqualTo(String value) {
            addCriterion("ts_publisher =", value, "tsPublisher");
            return (Criteria) this;
        }

        public Criteria andTsPublisherNotEqualTo(String value) {
            addCriterion("ts_publisher <>", value, "tsPublisher");
            return (Criteria) this;
        }

        public Criteria andTsPublisherGreaterThan(String value) {
            addCriterion("ts_publisher >", value, "tsPublisher");
            return (Criteria) this;
        }

        public Criteria andTsPublisherGreaterThanOrEqualTo(String value) {
            addCriterion("ts_publisher >=", value, "tsPublisher");
            return (Criteria) this;
        }

        public Criteria andTsPublisherLessThan(String value) {
            addCriterion("ts_publisher <", value, "tsPublisher");
            return (Criteria) this;
        }

        public Criteria andTsPublisherLessThanOrEqualTo(String value) {
            addCriterion("ts_publisher <=", value, "tsPublisher");
            return (Criteria) this;
        }

        public Criteria andTsPublisherLike(String value) {
            addCriterion("ts_publisher like", value, "tsPublisher");
            return (Criteria) this;
        }

        public Criteria andTsPublisherNotLike(String value) {
            addCriterion("ts_publisher not like", value, "tsPublisher");
            return (Criteria) this;
        }

        public Criteria andTsPublisherIn(List<String> values) {
            addCriterion("ts_publisher in", values, "tsPublisher");
            return (Criteria) this;
        }

        public Criteria andTsPublisherNotIn(List<String> values) {
            addCriterion("ts_publisher not in", values, "tsPublisher");
            return (Criteria) this;
        }

        public Criteria andTsPublisherBetween(String value1, String value2) {
            addCriterion("ts_publisher between", value1, value2, "tsPublisher");
            return (Criteria) this;
        }

        public Criteria andTsPublisherNotBetween(String value1, String value2) {
            addCriterion("ts_publisher not between", value1, value2, "tsPublisher");
            return (Criteria) this;
        }

        public Criteria andTsPupblishtimeIsNull() {
            addCriterion("ts_pupblishtime is null");
            return (Criteria) this;
        }

        public Criteria andTsPupblishtimeIsNotNull() {
            addCriterion("ts_pupblishtime is not null");
            return (Criteria) this;
        }

        public Criteria andTsPupblishtimeEqualTo(String value) {
            addCriterion("ts_pupblishtime =", value, "tsPupblishtime");
            return (Criteria) this;
        }

        public Criteria andTsPupblishtimeNotEqualTo(String value) {
            addCriterion("ts_pupblishtime <>", value, "tsPupblishtime");
            return (Criteria) this;
        }

        public Criteria andTsPupblishtimeGreaterThan(String value) {
            addCriterion("ts_pupblishtime >", value, "tsPupblishtime");
            return (Criteria) this;
        }

        public Criteria andTsPupblishtimeGreaterThanOrEqualTo(String value) {
            addCriterion("ts_pupblishtime >=", value, "tsPupblishtime");
            return (Criteria) this;
        }

        public Criteria andTsPupblishtimeLessThan(String value) {
            addCriterion("ts_pupblishtime <", value, "tsPupblishtime");
            return (Criteria) this;
        }

        public Criteria andTsPupblishtimeLessThanOrEqualTo(String value) {
            addCriterion("ts_pupblishtime <=", value, "tsPupblishtime");
            return (Criteria) this;
        }

        public Criteria andTsPupblishtimeLike(String value) {
            addCriterion("ts_pupblishtime like", value, "tsPupblishtime");
            return (Criteria) this;
        }

        public Criteria andTsPupblishtimeNotLike(String value) {
            addCriterion("ts_pupblishtime not like", value, "tsPupblishtime");
            return (Criteria) this;
        }

        public Criteria andTsPupblishtimeIn(List<String> values) {
            addCriterion("ts_pupblishtime in", values, "tsPupblishtime");
            return (Criteria) this;
        }

        public Criteria andTsPupblishtimeNotIn(List<String> values) {
            addCriterion("ts_pupblishtime not in", values, "tsPupblishtime");
            return (Criteria) this;
        }

        public Criteria andTsPupblishtimeBetween(String value1, String value2) {
            addCriterion("ts_pupblishtime between", value1, value2, "tsPupblishtime");
            return (Criteria) this;
        }

        public Criteria andTsPupblishtimeNotBetween(String value1, String value2) {
            addCriterion("ts_pupblishtime not between", value1, value2, "tsPupblishtime");
            return (Criteria) this;
        }

        public Criteria andTsTimeIsNull() {
            addCriterion("ts_time is null");
            return (Criteria) this;
        }

        public Criteria andTsTimeIsNotNull() {
            addCriterion("ts_time is not null");
            return (Criteria) this;
        }

        public Criteria andTsTimeEqualTo(String value) {
            addCriterion("ts_time =", value, "tsTime");
            return (Criteria) this;
        }

        public Criteria andTsTimeNotEqualTo(String value) {
            addCriterion("ts_time <>", value, "tsTime");
            return (Criteria) this;
        }

        public Criteria andTsTimeGreaterThan(String value) {
            addCriterion("ts_time >", value, "tsTime");
            return (Criteria) this;
        }

        public Criteria andTsTimeGreaterThanOrEqualTo(String value) {
            addCriterion("ts_time >=", value, "tsTime");
            return (Criteria) this;
        }

        public Criteria andTsTimeLessThan(String value) {
            addCriterion("ts_time <", value, "tsTime");
            return (Criteria) this;
        }

        public Criteria andTsTimeLessThanOrEqualTo(String value) {
            addCriterion("ts_time <=", value, "tsTime");
            return (Criteria) this;
        }

        public Criteria andTsTimeLike(String value) {
            addCriterion("ts_time like", value, "tsTime");
            return (Criteria) this;
        }

        public Criteria andTsTimeNotLike(String value) {
            addCriterion("ts_time not like", value, "tsTime");
            return (Criteria) this;
        }

        public Criteria andTsTimeIn(List<String> values) {
            addCriterion("ts_time in", values, "tsTime");
            return (Criteria) this;
        }

        public Criteria andTsTimeNotIn(List<String> values) {
            addCriterion("ts_time not in", values, "tsTime");
            return (Criteria) this;
        }

        public Criteria andTsTimeBetween(String value1, String value2) {
            addCriterion("ts_time between", value1, value2, "tsTime");
            return (Criteria) this;
        }

        public Criteria andTsTimeNotBetween(String value1, String value2) {
            addCriterion("ts_time not between", value1, value2, "tsTime");
            return (Criteria) this;
        }

        public Criteria andTsDetailIsNull() {
            addCriterion("ts_detail is null");
            return (Criteria) this;
        }

        public Criteria andTsDetailIsNotNull() {
            addCriterion("ts_detail is not null");
            return (Criteria) this;
        }

        public Criteria andTsDetailEqualTo(String value) {
            addCriterion("ts_detail =", value, "tsDetail");
            return (Criteria) this;
        }

        public Criteria andTsDetailNotEqualTo(String value) {
            addCriterion("ts_detail <>", value, "tsDetail");
            return (Criteria) this;
        }

        public Criteria andTsDetailGreaterThan(String value) {
            addCriterion("ts_detail >", value, "tsDetail");
            return (Criteria) this;
        }

        public Criteria andTsDetailGreaterThanOrEqualTo(String value) {
            addCriterion("ts_detail >=", value, "tsDetail");
            return (Criteria) this;
        }

        public Criteria andTsDetailLessThan(String value) {
            addCriterion("ts_detail <", value, "tsDetail");
            return (Criteria) this;
        }

        public Criteria andTsDetailLessThanOrEqualTo(String value) {
            addCriterion("ts_detail <=", value, "tsDetail");
            return (Criteria) this;
        }

        public Criteria andTsDetailLike(String value) {
            addCriterion("ts_detail like", value, "tsDetail");
            return (Criteria) this;
        }

        public Criteria andTsDetailNotLike(String value) {
            addCriterion("ts_detail not like", value, "tsDetail");
            return (Criteria) this;
        }

        public Criteria andTsDetailIn(List<String> values) {
            addCriterion("ts_detail in", values, "tsDetail");
            return (Criteria) this;
        }

        public Criteria andTsDetailNotIn(List<String> values) {
            addCriterion("ts_detail not in", values, "tsDetail");
            return (Criteria) this;
        }

        public Criteria andTsDetailBetween(String value1, String value2) {
            addCriterion("ts_detail between", value1, value2, "tsDetail");
            return (Criteria) this;
        }

        public Criteria andTsDetailNotBetween(String value1, String value2) {
            addCriterion("ts_detail not between", value1, value2, "tsDetail");
            return (Criteria) this;
        }

        public Criteria andTsPriceIsNull() {
            addCriterion("ts_price is null");
            return (Criteria) this;
        }

        public Criteria andTsPriceIsNotNull() {
            addCriterion("ts_price is not null");
            return (Criteria) this;
        }

        public Criteria andTsPriceEqualTo(Double value) {
            addCriterion("ts_price =", value, "tsPrice");
            return (Criteria) this;
        }

        public Criteria andTsPriceNotEqualTo(Double value) {
            addCriterion("ts_price <>", value, "tsPrice");
            return (Criteria) this;
        }

        public Criteria andTsPriceGreaterThan(Double value) {
            addCriterion("ts_price >", value, "tsPrice");
            return (Criteria) this;
        }

        public Criteria andTsPriceGreaterThanOrEqualTo(Double value) {
            addCriterion("ts_price >=", value, "tsPrice");
            return (Criteria) this;
        }

        public Criteria andTsPriceLessThan(Double value) {
            addCriterion("ts_price <", value, "tsPrice");
            return (Criteria) this;
        }

        public Criteria andTsPriceLessThanOrEqualTo(Double value) {
            addCriterion("ts_price <=", value, "tsPrice");
            return (Criteria) this;
        }

        public Criteria andTsPriceIn(List<Double> values) {
            addCriterion("ts_price in", values, "tsPrice");
            return (Criteria) this;
        }

        public Criteria andTsPriceNotIn(List<Double> values) {
            addCriterion("ts_price not in", values, "tsPrice");
            return (Criteria) this;
        }

        public Criteria andTsPriceBetween(Double value1, Double value2) {
            addCriterion("ts_price between", value1, value2, "tsPrice");
            return (Criteria) this;
        }

        public Criteria andTsPriceNotBetween(Double value1, Double value2) {
            addCriterion("ts_price not between", value1, value2, "tsPrice");
            return (Criteria) this;
        }

        public Criteria andTsSumIsNull() {
            addCriterion("ts_sum is null");
            return (Criteria) this;
        }

        public Criteria andTsSumIsNotNull() {
            addCriterion("ts_sum is not null");
            return (Criteria) this;
        }

        public Criteria andTsSumEqualTo(Integer value) {
            addCriterion("ts_sum =", value, "tsSum");
            return (Criteria) this;
        }

        public Criteria andTsSumNotEqualTo(Integer value) {
            addCriterion("ts_sum <>", value, "tsSum");
            return (Criteria) this;
        }

        public Criteria andTsSumGreaterThan(Integer value) {
            addCriterion("ts_sum >", value, "tsSum");
            return (Criteria) this;
        }

        public Criteria andTsSumGreaterThanOrEqualTo(Integer value) {
            addCriterion("ts_sum >=", value, "tsSum");
            return (Criteria) this;
        }

        public Criteria andTsSumLessThan(Integer value) {
            addCriterion("ts_sum <", value, "tsSum");
            return (Criteria) this;
        }

        public Criteria andTsSumLessThanOrEqualTo(Integer value) {
            addCriterion("ts_sum <=", value, "tsSum");
            return (Criteria) this;
        }

        public Criteria andTsSumIn(List<Integer> values) {
            addCriterion("ts_sum in", values, "tsSum");
            return (Criteria) this;
        }

        public Criteria andTsSumNotIn(List<Integer> values) {
            addCriterion("ts_sum not in", values, "tsSum");
            return (Criteria) this;
        }

        public Criteria andTsSumBetween(Integer value1, Integer value2) {
            addCriterion("ts_sum between", value1, value2, "tsSum");
            return (Criteria) this;
        }

        public Criteria andTsSumNotBetween(Integer value1, Integer value2) {
            addCriterion("ts_sum not between", value1, value2, "tsSum");
            return (Criteria) this;
        }

        public Criteria andTsOnnumIsNull() {
            addCriterion("ts_onnum is null");
            return (Criteria) this;
        }

        public Criteria andTsOnnumIsNotNull() {
            addCriterion("ts_onnum is not null");
            return (Criteria) this;
        }

        public Criteria andTsOnnumEqualTo(Integer value) {
            addCriterion("ts_onnum =", value, "tsOnnum");
            return (Criteria) this;
        }

        public Criteria andTsOnnumNotEqualTo(Integer value) {
            addCriterion("ts_onnum <>", value, "tsOnnum");
            return (Criteria) this;
        }

        public Criteria andTsOnnumGreaterThan(Integer value) {
            addCriterion("ts_onnum >", value, "tsOnnum");
            return (Criteria) this;
        }

        public Criteria andTsOnnumGreaterThanOrEqualTo(Integer value) {
            addCriterion("ts_onnum >=", value, "tsOnnum");
            return (Criteria) this;
        }

        public Criteria andTsOnnumLessThan(Integer value) {
            addCriterion("ts_onnum <", value, "tsOnnum");
            return (Criteria) this;
        }

        public Criteria andTsOnnumLessThanOrEqualTo(Integer value) {
            addCriterion("ts_onnum <=", value, "tsOnnum");
            return (Criteria) this;
        }

        public Criteria andTsOnnumIn(List<Integer> values) {
            addCriterion("ts_onnum in", values, "tsOnnum");
            return (Criteria) this;
        }

        public Criteria andTsOnnumNotIn(List<Integer> values) {
            addCriterion("ts_onnum not in", values, "tsOnnum");
            return (Criteria) this;
        }

        public Criteria andTsOnnumBetween(Integer value1, Integer value2) {
            addCriterion("ts_onnum between", value1, value2, "tsOnnum");
            return (Criteria) this;
        }

        public Criteria andTsOnnumNotBetween(Integer value1, Integer value2) {
            addCriterion("ts_onnum not between", value1, value2, "tsOnnum");
            return (Criteria) this;
        }

        public Criteria andSkztIdIsNull() {
            addCriterion("skzt_id is null");
            return (Criteria) this;
        }

        public Criteria andSkztIdIsNotNull() {
            addCriterion("skzt_id is not null");
            return (Criteria) this;
        }

        public Criteria andSkztIdEqualTo(Integer value) {
            addCriterion("skzt_id =", value, "skztId");
            return (Criteria) this;
        }

        public Criteria andSkztIdNotEqualTo(Integer value) {
            addCriterion("skzt_id <>", value, "skztId");
            return (Criteria) this;
        }

        public Criteria andSkztIdGreaterThan(Integer value) {
            addCriterion("skzt_id >", value, "skztId");
            return (Criteria) this;
        }

        public Criteria andSkztIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("skzt_id >=", value, "skztId");
            return (Criteria) this;
        }

        public Criteria andSkztIdLessThan(Integer value) {
            addCriterion("skzt_id <", value, "skztId");
            return (Criteria) this;
        }

        public Criteria andSkztIdLessThanOrEqualTo(Integer value) {
            addCriterion("skzt_id <=", value, "skztId");
            return (Criteria) this;
        }

        public Criteria andSkztIdIn(List<Integer> values) {
            addCriterion("skzt_id in", values, "skztId");
            return (Criteria) this;
        }

        public Criteria andSkztIdNotIn(List<Integer> values) {
            addCriterion("skzt_id not in", values, "skztId");
            return (Criteria) this;
        }

        public Criteria andSkztIdBetween(Integer value1, Integer value2) {
            addCriterion("skzt_id between", value1, value2, "skztId");
            return (Criteria) this;
        }

        public Criteria andSkztIdNotBetween(Integer value1, Integer value2) {
            addCriterion("skzt_id not between", value1, value2, "skztId");
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