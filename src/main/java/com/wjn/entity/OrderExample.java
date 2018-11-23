package com.wjn.entity;

import java.util.ArrayList;
import java.util.List;

public class OrderExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public OrderExample() {
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

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andTableidIsNull() {
            addCriterion("TableID is null");
            return (Criteria) this;
        }

        public Criteria andTableidIsNotNull() {
            addCriterion("TableID is not null");
            return (Criteria) this;
        }

        public Criteria andTableidEqualTo(Integer value) {
            addCriterion("TableID =", value, "tableid");
            return (Criteria) this;
        }

        public Criteria andTableidNotEqualTo(Integer value) {
            addCriterion("TableID <>", value, "tableid");
            return (Criteria) this;
        }

        public Criteria andTableidGreaterThan(Integer value) {
            addCriterion("TableID >", value, "tableid");
            return (Criteria) this;
        }

        public Criteria andTableidGreaterThanOrEqualTo(Integer value) {
            addCriterion("TableID >=", value, "tableid");
            return (Criteria) this;
        }

        public Criteria andTableidLessThan(Integer value) {
            addCriterion("TableID <", value, "tableid");
            return (Criteria) this;
        }

        public Criteria andTableidLessThanOrEqualTo(Integer value) {
            addCriterion("TableID <=", value, "tableid");
            return (Criteria) this;
        }

        public Criteria andTableidIn(List<Integer> values) {
            addCriterion("TableID in", values, "tableid");
            return (Criteria) this;
        }

        public Criteria andTableidNotIn(List<Integer> values) {
            addCriterion("TableID not in", values, "tableid");
            return (Criteria) this;
        }

        public Criteria andTableidBetween(Integer value1, Integer value2) {
            addCriterion("TableID between", value1, value2, "tableid");
            return (Criteria) this;
        }

        public Criteria andTableidNotBetween(Integer value1, Integer value2) {
            addCriterion("TableID not between", value1, value2, "tableid");
            return (Criteria) this;
        }

        public Criteria andOrdertimeIsNull() {
            addCriterion("OrderTime is null");
            return (Criteria) this;
        }

        public Criteria andOrdertimeIsNotNull() {
            addCriterion("OrderTime is not null");
            return (Criteria) this;
        }

        public Criteria andOrdertimeEqualTo(String value) {
            addCriterion("OrderTime =", value, "ordertime");
            return (Criteria) this;
        }

        public Criteria andOrdertimeNotEqualTo(String value) {
            addCriterion("OrderTime <>", value, "ordertime");
            return (Criteria) this;
        }

        public Criteria andOrdertimeGreaterThan(String value) {
            addCriterion("OrderTime >", value, "ordertime");
            return (Criteria) this;
        }

        public Criteria andOrdertimeGreaterThanOrEqualTo(String value) {
            addCriterion("OrderTime >=", value, "ordertime");
            return (Criteria) this;
        }

        public Criteria andOrdertimeLessThan(String value) {
            addCriterion("OrderTime <", value, "ordertime");
            return (Criteria) this;
        }

        public Criteria andOrdertimeLessThanOrEqualTo(String value) {
            addCriterion("OrderTime <=", value, "ordertime");
            return (Criteria) this;
        }

        public Criteria andOrdertimeLike(String value) {
            addCriterion("OrderTime like", value, "ordertime");
            return (Criteria) this;
        }

        public Criteria andOrdertimeNotLike(String value) {
            addCriterion("OrderTime not like", value, "ordertime");
            return (Criteria) this;
        }

        public Criteria andOrdertimeIn(List<String> values) {
            addCriterion("OrderTime in", values, "ordertime");
            return (Criteria) this;
        }

        public Criteria andOrdertimeNotIn(List<String> values) {
            addCriterion("OrderTime not in", values, "ordertime");
            return (Criteria) this;
        }

        public Criteria andOrdertimeBetween(String value1, String value2) {
            addCriterion("OrderTime between", value1, value2, "ordertime");
            return (Criteria) this;
        }

        public Criteria andOrdertimeNotBetween(String value1, String value2) {
            addCriterion("OrderTime not between", value1, value2, "ordertime");
            return (Criteria) this;
        }

        public Criteria andUseridIsNull() {
            addCriterion("UserID is null");
            return (Criteria) this;
        }

        public Criteria andUseridIsNotNull() {
            addCriterion("UserID is not null");
            return (Criteria) this;
        }

        public Criteria andUseridEqualTo(Integer value) {
            addCriterion("UserID =", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotEqualTo(Integer value) {
            addCriterion("UserID <>", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridGreaterThan(Integer value) {
            addCriterion("UserID >", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridGreaterThanOrEqualTo(Integer value) {
            addCriterion("UserID >=", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLessThan(Integer value) {
            addCriterion("UserID <", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLessThanOrEqualTo(Integer value) {
            addCriterion("UserID <=", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridIn(List<Integer> values) {
            addCriterion("UserID in", values, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotIn(List<Integer> values) {
            addCriterion("UserID not in", values, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridBetween(Integer value1, Integer value2) {
            addCriterion("UserID between", value1, value2, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotBetween(Integer value1, Integer value2) {
            addCriterion("UserID not between", value1, value2, "userid");
            return (Criteria) this;
        }

        public Criteria andPersonnumIsNull() {
            addCriterion("personNum is null");
            return (Criteria) this;
        }

        public Criteria andPersonnumIsNotNull() {
            addCriterion("personNum is not null");
            return (Criteria) this;
        }

        public Criteria andPersonnumEqualTo(Integer value) {
            addCriterion("personNum =", value, "personnum");
            return (Criteria) this;
        }

        public Criteria andPersonnumNotEqualTo(Integer value) {
            addCriterion("personNum <>", value, "personnum");
            return (Criteria) this;
        }

        public Criteria andPersonnumGreaterThan(Integer value) {
            addCriterion("personNum >", value, "personnum");
            return (Criteria) this;
        }

        public Criteria andPersonnumGreaterThanOrEqualTo(Integer value) {
            addCriterion("personNum >=", value, "personnum");
            return (Criteria) this;
        }

        public Criteria andPersonnumLessThan(Integer value) {
            addCriterion("personNum <", value, "personnum");
            return (Criteria) this;
        }

        public Criteria andPersonnumLessThanOrEqualTo(Integer value) {
            addCriterion("personNum <=", value, "personnum");
            return (Criteria) this;
        }

        public Criteria andPersonnumIn(List<Integer> values) {
            addCriterion("personNum in", values, "personnum");
            return (Criteria) this;
        }

        public Criteria andPersonnumNotIn(List<Integer> values) {
            addCriterion("personNum not in", values, "personnum");
            return (Criteria) this;
        }

        public Criteria andPersonnumBetween(Integer value1, Integer value2) {
            addCriterion("personNum between", value1, value2, "personnum");
            return (Criteria) this;
        }

        public Criteria andPersonnumNotBetween(Integer value1, Integer value2) {
            addCriterion("personNum not between", value1, value2, "personnum");
            return (Criteria) this;
        }

        public Criteria andIdpayIsNull() {
            addCriterion("idPay is null");
            return (Criteria) this;
        }

        public Criteria andIdpayIsNotNull() {
            addCriterion("idPay is not null");
            return (Criteria) this;
        }

        public Criteria andIdpayEqualTo(Integer value) {
            addCriterion("idPay =", value, "idpay");
            return (Criteria) this;
        }

        public Criteria andIdpayNotEqualTo(Integer value) {
            addCriterion("idPay <>", value, "idpay");
            return (Criteria) this;
        }

        public Criteria andIdpayGreaterThan(Integer value) {
            addCriterion("idPay >", value, "idpay");
            return (Criteria) this;
        }

        public Criteria andIdpayGreaterThanOrEqualTo(Integer value) {
            addCriterion("idPay >=", value, "idpay");
            return (Criteria) this;
        }

        public Criteria andIdpayLessThan(Integer value) {
            addCriterion("idPay <", value, "idpay");
            return (Criteria) this;
        }

        public Criteria andIdpayLessThanOrEqualTo(Integer value) {
            addCriterion("idPay <=", value, "idpay");
            return (Criteria) this;
        }

        public Criteria andIdpayIn(List<Integer> values) {
            addCriterion("idPay in", values, "idpay");
            return (Criteria) this;
        }

        public Criteria andIdpayNotIn(List<Integer> values) {
            addCriterion("idPay not in", values, "idpay");
            return (Criteria) this;
        }

        public Criteria andIdpayBetween(Integer value1, Integer value2) {
            addCriterion("idPay between", value1, value2, "idpay");
            return (Criteria) this;
        }

        public Criteria andIdpayNotBetween(Integer value1, Integer value2) {
            addCriterion("idPay not between", value1, value2, "idpay");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNull() {
            addCriterion("remark is null");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNotNull() {
            addCriterion("remark is not null");
            return (Criteria) this;
        }

        public Criteria andRemarkEqualTo(String value) {
            addCriterion("remark =", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotEqualTo(String value) {
            addCriterion("remark <>", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThan(String value) {
            addCriterion("remark >", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("remark >=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThan(String value) {
            addCriterion("remark <", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThanOrEqualTo(String value) {
            addCriterion("remark <=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLike(String value) {
            addCriterion("remark like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotLike(String value) {
            addCriterion("remark not like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkIn(List<String> values) {
            addCriterion("remark in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotIn(List<String> values) {
            addCriterion("remark not in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkBetween(String value1, String value2) {
            addCriterion("remark between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotBetween(String value1, String value2) {
            addCriterion("remark not between", value1, value2, "remark");
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