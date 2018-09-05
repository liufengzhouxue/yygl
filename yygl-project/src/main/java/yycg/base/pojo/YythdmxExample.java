package yycg.base.pojo;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class YythdmxExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public YythdmxExample() {
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
            addCriterion("ID is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("ID is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(String value) {
            addCriterion("ID =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(String value) {
            addCriterion("ID <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(String value) {
            addCriterion("ID >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(String value) {
            addCriterion("ID >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(String value) {
            addCriterion("ID <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(String value) {
            addCriterion("ID <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLike(String value) {
            addCriterion("ID like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotLike(String value) {
            addCriterion("ID not like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<String> values) {
            addCriterion("ID in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<String> values) {
            addCriterion("ID not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(String value1, String value2) {
            addCriterion("ID between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(String value1, String value2) {
            addCriterion("ID not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andYythdidIsNull() {
            addCriterion("YYTHDID is null");
            return (Criteria) this;
        }

        public Criteria andYythdidIsNotNull() {
            addCriterion("YYTHDID is not null");
            return (Criteria) this;
        }

        public Criteria andYythdidEqualTo(String value) {
            addCriterion("YYTHDID =", value, "yythdid");
            return (Criteria) this;
        }

        public Criteria andYythdidNotEqualTo(String value) {
            addCriterion("YYTHDID <>", value, "yythdid");
            return (Criteria) this;
        }

        public Criteria andYythdidGreaterThan(String value) {
            addCriterion("YYTHDID >", value, "yythdid");
            return (Criteria) this;
        }

        public Criteria andYythdidGreaterThanOrEqualTo(String value) {
            addCriterion("YYTHDID >=", value, "yythdid");
            return (Criteria) this;
        }

        public Criteria andYythdidLessThan(String value) {
            addCriterion("YYTHDID <", value, "yythdid");
            return (Criteria) this;
        }

        public Criteria andYythdidLessThanOrEqualTo(String value) {
            addCriterion("YYTHDID <=", value, "yythdid");
            return (Criteria) this;
        }

        public Criteria andYythdidLike(String value) {
            addCriterion("YYTHDID like", value, "yythdid");
            return (Criteria) this;
        }

        public Criteria andYythdidNotLike(String value) {
            addCriterion("YYTHDID not like", value, "yythdid");
            return (Criteria) this;
        }

        public Criteria andYythdidIn(List<String> values) {
            addCriterion("YYTHDID in", values, "yythdid");
            return (Criteria) this;
        }

        public Criteria andYythdidNotIn(List<String> values) {
            addCriterion("YYTHDID not in", values, "yythdid");
            return (Criteria) this;
        }

        public Criteria andYythdidBetween(String value1, String value2) {
            addCriterion("YYTHDID between", value1, value2, "yythdid");
            return (Criteria) this;
        }

        public Criteria andYythdidNotBetween(String value1, String value2) {
            addCriterion("YYTHDID not between", value1, value2, "yythdid");
            return (Criteria) this;
        }

        public Criteria andYycgdidIsNull() {
            addCriterion("YYCGDID is null");
            return (Criteria) this;
        }

        public Criteria andYycgdidIsNotNull() {
            addCriterion("YYCGDID is not null");
            return (Criteria) this;
        }

        public Criteria andYycgdidEqualTo(String value) {
            addCriterion("YYCGDID =", value, "yycgdid");
            return (Criteria) this;
        }

        public Criteria andYycgdidNotEqualTo(String value) {
            addCriterion("YYCGDID <>", value, "yycgdid");
            return (Criteria) this;
        }

        public Criteria andYycgdidGreaterThan(String value) {
            addCriterion("YYCGDID >", value, "yycgdid");
            return (Criteria) this;
        }

        public Criteria andYycgdidGreaterThanOrEqualTo(String value) {
            addCriterion("YYCGDID >=", value, "yycgdid");
            return (Criteria) this;
        }

        public Criteria andYycgdidLessThan(String value) {
            addCriterion("YYCGDID <", value, "yycgdid");
            return (Criteria) this;
        }

        public Criteria andYycgdidLessThanOrEqualTo(String value) {
            addCriterion("YYCGDID <=", value, "yycgdid");
            return (Criteria) this;
        }

        public Criteria andYycgdidLike(String value) {
            addCriterion("YYCGDID like", value, "yycgdid");
            return (Criteria) this;
        }

        public Criteria andYycgdidNotLike(String value) {
            addCriterion("YYCGDID not like", value, "yycgdid");
            return (Criteria) this;
        }

        public Criteria andYycgdidIn(List<String> values) {
            addCriterion("YYCGDID in", values, "yycgdid");
            return (Criteria) this;
        }

        public Criteria andYycgdidNotIn(List<String> values) {
            addCriterion("YYCGDID not in", values, "yycgdid");
            return (Criteria) this;
        }

        public Criteria andYycgdidBetween(String value1, String value2) {
            addCriterion("YYCGDID between", value1, value2, "yycgdid");
            return (Criteria) this;
        }

        public Criteria andYycgdidNotBetween(String value1, String value2) {
            addCriterion("YYCGDID not between", value1, value2, "yycgdid");
            return (Criteria) this;
        }

        public Criteria andYpxxidIsNull() {
            addCriterion("YPXXID is null");
            return (Criteria) this;
        }

        public Criteria andYpxxidIsNotNull() {
            addCriterion("YPXXID is not null");
            return (Criteria) this;
        }

        public Criteria andYpxxidEqualTo(String value) {
            addCriterion("YPXXID =", value, "ypxxid");
            return (Criteria) this;
        }

        public Criteria andYpxxidNotEqualTo(String value) {
            addCriterion("YPXXID <>", value, "ypxxid");
            return (Criteria) this;
        }

        public Criteria andYpxxidGreaterThan(String value) {
            addCriterion("YPXXID >", value, "ypxxid");
            return (Criteria) this;
        }

        public Criteria andYpxxidGreaterThanOrEqualTo(String value) {
            addCriterion("YPXXID >=", value, "ypxxid");
            return (Criteria) this;
        }

        public Criteria andYpxxidLessThan(String value) {
            addCriterion("YPXXID <", value, "ypxxid");
            return (Criteria) this;
        }

        public Criteria andYpxxidLessThanOrEqualTo(String value) {
            addCriterion("YPXXID <=", value, "ypxxid");
            return (Criteria) this;
        }

        public Criteria andYpxxidLike(String value) {
            addCriterion("YPXXID like", value, "ypxxid");
            return (Criteria) this;
        }

        public Criteria andYpxxidNotLike(String value) {
            addCriterion("YPXXID not like", value, "ypxxid");
            return (Criteria) this;
        }

        public Criteria andYpxxidIn(List<String> values) {
            addCriterion("YPXXID in", values, "ypxxid");
            return (Criteria) this;
        }

        public Criteria andYpxxidNotIn(List<String> values) {
            addCriterion("YPXXID not in", values, "ypxxid");
            return (Criteria) this;
        }

        public Criteria andYpxxidBetween(String value1, String value2) {
            addCriterion("YPXXID between", value1, value2, "ypxxid");
            return (Criteria) this;
        }

        public Criteria andYpxxidNotBetween(String value1, String value2) {
            addCriterion("YPXXID not between", value1, value2, "ypxxid");
            return (Criteria) this;
        }

        public Criteria andThlIsNull() {
            addCriterion("THL is null");
            return (Criteria) this;
        }

        public Criteria andThlIsNotNull() {
            addCriterion("THL is not null");
            return (Criteria) this;
        }

        public Criteria andThlEqualTo(BigDecimal value) {
            addCriterion("THL =", value, "thl");
            return (Criteria) this;
        }

        public Criteria andThlNotEqualTo(BigDecimal value) {
            addCriterion("THL <>", value, "thl");
            return (Criteria) this;
        }

        public Criteria andThlGreaterThan(BigDecimal value) {
            addCriterion("THL >", value, "thl");
            return (Criteria) this;
        }

        public Criteria andThlGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("THL >=", value, "thl");
            return (Criteria) this;
        }

        public Criteria andThlLessThan(BigDecimal value) {
            addCriterion("THL <", value, "thl");
            return (Criteria) this;
        }

        public Criteria andThlLessThanOrEqualTo(BigDecimal value) {
            addCriterion("THL <=", value, "thl");
            return (Criteria) this;
        }

        public Criteria andThlIn(List<BigDecimal> values) {
            addCriterion("THL in", values, "thl");
            return (Criteria) this;
        }

        public Criteria andThlNotIn(List<BigDecimal> values) {
            addCriterion("THL not in", values, "thl");
            return (Criteria) this;
        }

        public Criteria andThlBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("THL between", value1, value2, "thl");
            return (Criteria) this;
        }

        public Criteria andThlNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("THL not between", value1, value2, "thl");
            return (Criteria) this;
        }

        public Criteria andThjeIsNull() {
            addCriterion("THJE is null");
            return (Criteria) this;
        }

        public Criteria andThjeIsNotNull() {
            addCriterion("THJE is not null");
            return (Criteria) this;
        }

        public Criteria andThjeEqualTo(Double value) {
            addCriterion("THJE =", value, "thje");
            return (Criteria) this;
        }

        public Criteria andThjeNotEqualTo(Double value) {
            addCriterion("THJE <>", value, "thje");
            return (Criteria) this;
        }

        public Criteria andThjeGreaterThan(Double value) {
            addCriterion("THJE >", value, "thje");
            return (Criteria) this;
        }

        public Criteria andThjeGreaterThanOrEqualTo(Double value) {
            addCriterion("THJE >=", value, "thje");
            return (Criteria) this;
        }

        public Criteria andThjeLessThan(Double value) {
            addCriterion("THJE <", value, "thje");
            return (Criteria) this;
        }

        public Criteria andThjeLessThanOrEqualTo(Double value) {
            addCriterion("THJE <=", value, "thje");
            return (Criteria) this;
        }

        public Criteria andThjeIn(List<Double> values) {
            addCriterion("THJE in", values, "thje");
            return (Criteria) this;
        }

        public Criteria andThjeNotIn(List<Double> values) {
            addCriterion("THJE not in", values, "thje");
            return (Criteria) this;
        }

        public Criteria andThjeBetween(Double value1, Double value2) {
            addCriterion("THJE between", value1, value2, "thje");
            return (Criteria) this;
        }

        public Criteria andThjeNotBetween(Double value1, Double value2) {
            addCriterion("THJE not between", value1, value2, "thje");
            return (Criteria) this;
        }

        public Criteria andThztIsNull() {
            addCriterion("THZT is null");
            return (Criteria) this;
        }

        public Criteria andThztIsNotNull() {
            addCriterion("THZT is not null");
            return (Criteria) this;
        }

        public Criteria andThztEqualTo(String value) {
            addCriterion("THZT =", value, "thzt");
            return (Criteria) this;
        }

        public Criteria andThztNotEqualTo(String value) {
            addCriterion("THZT <>", value, "thzt");
            return (Criteria) this;
        }

        public Criteria andThztGreaterThan(String value) {
            addCriterion("THZT >", value, "thzt");
            return (Criteria) this;
        }

        public Criteria andThztGreaterThanOrEqualTo(String value) {
            addCriterion("THZT >=", value, "thzt");
            return (Criteria) this;
        }

        public Criteria andThztLessThan(String value) {
            addCriterion("THZT <", value, "thzt");
            return (Criteria) this;
        }

        public Criteria andThztLessThanOrEqualTo(String value) {
            addCriterion("THZT <=", value, "thzt");
            return (Criteria) this;
        }

        public Criteria andThztLike(String value) {
            addCriterion("THZT like", value, "thzt");
            return (Criteria) this;
        }

        public Criteria andThztNotLike(String value) {
            addCriterion("THZT not like", value, "thzt");
            return (Criteria) this;
        }

        public Criteria andThztIn(List<String> values) {
            addCriterion("THZT in", values, "thzt");
            return (Criteria) this;
        }

        public Criteria andThztNotIn(List<String> values) {
            addCriterion("THZT not in", values, "thzt");
            return (Criteria) this;
        }

        public Criteria andThztBetween(String value1, String value2) {
            addCriterion("THZT between", value1, value2, "thzt");
            return (Criteria) this;
        }

        public Criteria andThztNotBetween(String value1, String value2) {
            addCriterion("THZT not between", value1, value2, "thzt");
            return (Criteria) this;
        }

        public Criteria andThyyIsNull() {
            addCriterion("THYY is null");
            return (Criteria) this;
        }

        public Criteria andThyyIsNotNull() {
            addCriterion("THYY is not null");
            return (Criteria) this;
        }

        public Criteria andThyyEqualTo(String value) {
            addCriterion("THYY =", value, "thyy");
            return (Criteria) this;
        }

        public Criteria andThyyNotEqualTo(String value) {
            addCriterion("THYY <>", value, "thyy");
            return (Criteria) this;
        }

        public Criteria andThyyGreaterThan(String value) {
            addCriterion("THYY >", value, "thyy");
            return (Criteria) this;
        }

        public Criteria andThyyGreaterThanOrEqualTo(String value) {
            addCriterion("THYY >=", value, "thyy");
            return (Criteria) this;
        }

        public Criteria andThyyLessThan(String value) {
            addCriterion("THYY <", value, "thyy");
            return (Criteria) this;
        }

        public Criteria andThyyLessThanOrEqualTo(String value) {
            addCriterion("THYY <=", value, "thyy");
            return (Criteria) this;
        }

        public Criteria andThyyLike(String value) {
            addCriterion("THYY like", value, "thyy");
            return (Criteria) this;
        }

        public Criteria andThyyNotLike(String value) {
            addCriterion("THYY not like", value, "thyy");
            return (Criteria) this;
        }

        public Criteria andThyyIn(List<String> values) {
            addCriterion("THYY in", values, "thyy");
            return (Criteria) this;
        }

        public Criteria andThyyNotIn(List<String> values) {
            addCriterion("THYY not in", values, "thyy");
            return (Criteria) this;
        }

        public Criteria andThyyBetween(String value1, String value2) {
            addCriterion("THYY between", value1, value2, "thyy");
            return (Criteria) this;
        }

        public Criteria andThyyNotBetween(String value1, String value2) {
            addCriterion("THYY not between", value1, value2, "thyy");
            return (Criteria) this;
        }

        public Criteria andVchar1IsNull() {
            addCriterion("VCHAR1 is null");
            return (Criteria) this;
        }

        public Criteria andVchar1IsNotNull() {
            addCriterion("VCHAR1 is not null");
            return (Criteria) this;
        }

        public Criteria andVchar1EqualTo(String value) {
            addCriterion("VCHAR1 =", value, "vchar1");
            return (Criteria) this;
        }

        public Criteria andVchar1NotEqualTo(String value) {
            addCriterion("VCHAR1 <>", value, "vchar1");
            return (Criteria) this;
        }

        public Criteria andVchar1GreaterThan(String value) {
            addCriterion("VCHAR1 >", value, "vchar1");
            return (Criteria) this;
        }

        public Criteria andVchar1GreaterThanOrEqualTo(String value) {
            addCriterion("VCHAR1 >=", value, "vchar1");
            return (Criteria) this;
        }

        public Criteria andVchar1LessThan(String value) {
            addCriterion("VCHAR1 <", value, "vchar1");
            return (Criteria) this;
        }

        public Criteria andVchar1LessThanOrEqualTo(String value) {
            addCriterion("VCHAR1 <=", value, "vchar1");
            return (Criteria) this;
        }

        public Criteria andVchar1Like(String value) {
            addCriterion("VCHAR1 like", value, "vchar1");
            return (Criteria) this;
        }

        public Criteria andVchar1NotLike(String value) {
            addCriterion("VCHAR1 not like", value, "vchar1");
            return (Criteria) this;
        }

        public Criteria andVchar1In(List<String> values) {
            addCriterion("VCHAR1 in", values, "vchar1");
            return (Criteria) this;
        }

        public Criteria andVchar1NotIn(List<String> values) {
            addCriterion("VCHAR1 not in", values, "vchar1");
            return (Criteria) this;
        }

        public Criteria andVchar1Between(String value1, String value2) {
            addCriterion("VCHAR1 between", value1, value2, "vchar1");
            return (Criteria) this;
        }

        public Criteria andVchar1NotBetween(String value1, String value2) {
            addCriterion("VCHAR1 not between", value1, value2, "vchar1");
            return (Criteria) this;
        }

        public Criteria andVchar2IsNull() {
            addCriterion("VCHAR2 is null");
            return (Criteria) this;
        }

        public Criteria andVchar2IsNotNull() {
            addCriterion("VCHAR2 is not null");
            return (Criteria) this;
        }

        public Criteria andVchar2EqualTo(String value) {
            addCriterion("VCHAR2 =", value, "vchar2");
            return (Criteria) this;
        }

        public Criteria andVchar2NotEqualTo(String value) {
            addCriterion("VCHAR2 <>", value, "vchar2");
            return (Criteria) this;
        }

        public Criteria andVchar2GreaterThan(String value) {
            addCriterion("VCHAR2 >", value, "vchar2");
            return (Criteria) this;
        }

        public Criteria andVchar2GreaterThanOrEqualTo(String value) {
            addCriterion("VCHAR2 >=", value, "vchar2");
            return (Criteria) this;
        }

        public Criteria andVchar2LessThan(String value) {
            addCriterion("VCHAR2 <", value, "vchar2");
            return (Criteria) this;
        }

        public Criteria andVchar2LessThanOrEqualTo(String value) {
            addCriterion("VCHAR2 <=", value, "vchar2");
            return (Criteria) this;
        }

        public Criteria andVchar2Like(String value) {
            addCriterion("VCHAR2 like", value, "vchar2");
            return (Criteria) this;
        }

        public Criteria andVchar2NotLike(String value) {
            addCriterion("VCHAR2 not like", value, "vchar2");
            return (Criteria) this;
        }

        public Criteria andVchar2In(List<String> values) {
            addCriterion("VCHAR2 in", values, "vchar2");
            return (Criteria) this;
        }

        public Criteria andVchar2NotIn(List<String> values) {
            addCriterion("VCHAR2 not in", values, "vchar2");
            return (Criteria) this;
        }

        public Criteria andVchar2Between(String value1, String value2) {
            addCriterion("VCHAR2 between", value1, value2, "vchar2");
            return (Criteria) this;
        }

        public Criteria andVchar2NotBetween(String value1, String value2) {
            addCriterion("VCHAR2 not between", value1, value2, "vchar2");
            return (Criteria) this;
        }

        public Criteria andVchar3IsNull() {
            addCriterion("VCHAR3 is null");
            return (Criteria) this;
        }

        public Criteria andVchar3IsNotNull() {
            addCriterion("VCHAR3 is not null");
            return (Criteria) this;
        }

        public Criteria andVchar3EqualTo(String value) {
            addCriterion("VCHAR3 =", value, "vchar3");
            return (Criteria) this;
        }

        public Criteria andVchar3NotEqualTo(String value) {
            addCriterion("VCHAR3 <>", value, "vchar3");
            return (Criteria) this;
        }

        public Criteria andVchar3GreaterThan(String value) {
            addCriterion("VCHAR3 >", value, "vchar3");
            return (Criteria) this;
        }

        public Criteria andVchar3GreaterThanOrEqualTo(String value) {
            addCriterion("VCHAR3 >=", value, "vchar3");
            return (Criteria) this;
        }

        public Criteria andVchar3LessThan(String value) {
            addCriterion("VCHAR3 <", value, "vchar3");
            return (Criteria) this;
        }

        public Criteria andVchar3LessThanOrEqualTo(String value) {
            addCriterion("VCHAR3 <=", value, "vchar3");
            return (Criteria) this;
        }

        public Criteria andVchar3Like(String value) {
            addCriterion("VCHAR3 like", value, "vchar3");
            return (Criteria) this;
        }

        public Criteria andVchar3NotLike(String value) {
            addCriterion("VCHAR3 not like", value, "vchar3");
            return (Criteria) this;
        }

        public Criteria andVchar3In(List<String> values) {
            addCriterion("VCHAR3 in", values, "vchar3");
            return (Criteria) this;
        }

        public Criteria andVchar3NotIn(List<String> values) {
            addCriterion("VCHAR3 not in", values, "vchar3");
            return (Criteria) this;
        }

        public Criteria andVchar3Between(String value1, String value2) {
            addCriterion("VCHAR3 between", value1, value2, "vchar3");
            return (Criteria) this;
        }

        public Criteria andVchar3NotBetween(String value1, String value2) {
            addCriterion("VCHAR3 not between", value1, value2, "vchar3");
            return (Criteria) this;
        }

        public Criteria andVchar4IsNull() {
            addCriterion("VCHAR4 is null");
            return (Criteria) this;
        }

        public Criteria andVchar4IsNotNull() {
            addCriterion("VCHAR4 is not null");
            return (Criteria) this;
        }

        public Criteria andVchar4EqualTo(String value) {
            addCriterion("VCHAR4 =", value, "vchar4");
            return (Criteria) this;
        }

        public Criteria andVchar4NotEqualTo(String value) {
            addCriterion("VCHAR4 <>", value, "vchar4");
            return (Criteria) this;
        }

        public Criteria andVchar4GreaterThan(String value) {
            addCriterion("VCHAR4 >", value, "vchar4");
            return (Criteria) this;
        }

        public Criteria andVchar4GreaterThanOrEqualTo(String value) {
            addCriterion("VCHAR4 >=", value, "vchar4");
            return (Criteria) this;
        }

        public Criteria andVchar4LessThan(String value) {
            addCriterion("VCHAR4 <", value, "vchar4");
            return (Criteria) this;
        }

        public Criteria andVchar4LessThanOrEqualTo(String value) {
            addCriterion("VCHAR4 <=", value, "vchar4");
            return (Criteria) this;
        }

        public Criteria andVchar4Like(String value) {
            addCriterion("VCHAR4 like", value, "vchar4");
            return (Criteria) this;
        }

        public Criteria andVchar4NotLike(String value) {
            addCriterion("VCHAR4 not like", value, "vchar4");
            return (Criteria) this;
        }

        public Criteria andVchar4In(List<String> values) {
            addCriterion("VCHAR4 in", values, "vchar4");
            return (Criteria) this;
        }

        public Criteria andVchar4NotIn(List<String> values) {
            addCriterion("VCHAR4 not in", values, "vchar4");
            return (Criteria) this;
        }

        public Criteria andVchar4Between(String value1, String value2) {
            addCriterion("VCHAR4 between", value1, value2, "vchar4");
            return (Criteria) this;
        }

        public Criteria andVchar4NotBetween(String value1, String value2) {
            addCriterion("VCHAR4 not between", value1, value2, "vchar4");
            return (Criteria) this;
        }

        public Criteria andVchar5IsNull() {
            addCriterion("VCHAR5 is null");
            return (Criteria) this;
        }

        public Criteria andVchar5IsNotNull() {
            addCriterion("VCHAR5 is not null");
            return (Criteria) this;
        }

        public Criteria andVchar5EqualTo(String value) {
            addCriterion("VCHAR5 =", value, "vchar5");
            return (Criteria) this;
        }

        public Criteria andVchar5NotEqualTo(String value) {
            addCriterion("VCHAR5 <>", value, "vchar5");
            return (Criteria) this;
        }

        public Criteria andVchar5GreaterThan(String value) {
            addCriterion("VCHAR5 >", value, "vchar5");
            return (Criteria) this;
        }

        public Criteria andVchar5GreaterThanOrEqualTo(String value) {
            addCriterion("VCHAR5 >=", value, "vchar5");
            return (Criteria) this;
        }

        public Criteria andVchar5LessThan(String value) {
            addCriterion("VCHAR5 <", value, "vchar5");
            return (Criteria) this;
        }

        public Criteria andVchar5LessThanOrEqualTo(String value) {
            addCriterion("VCHAR5 <=", value, "vchar5");
            return (Criteria) this;
        }

        public Criteria andVchar5Like(String value) {
            addCriterion("VCHAR5 like", value, "vchar5");
            return (Criteria) this;
        }

        public Criteria andVchar5NotLike(String value) {
            addCriterion("VCHAR5 not like", value, "vchar5");
            return (Criteria) this;
        }

        public Criteria andVchar5In(List<String> values) {
            addCriterion("VCHAR5 in", values, "vchar5");
            return (Criteria) this;
        }

        public Criteria andVchar5NotIn(List<String> values) {
            addCriterion("VCHAR5 not in", values, "vchar5");
            return (Criteria) this;
        }

        public Criteria andVchar5Between(String value1, String value2) {
            addCriterion("VCHAR5 between", value1, value2, "vchar5");
            return (Criteria) this;
        }

        public Criteria andVchar5NotBetween(String value1, String value2) {
            addCriterion("VCHAR5 not between", value1, value2, "vchar5");
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