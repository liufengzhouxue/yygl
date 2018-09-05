package yycg.base.pojo;

import java.util.ArrayList;
import java.util.List;

public class ErrorTaskBackupExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ErrorTaskBackupExample() {
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

        public Criteria andTaskidIsNull() {
            addCriterion("TASKID is null");
            return (Criteria) this;
        }

        public Criteria andTaskidIsNotNull() {
            addCriterion("TASKID is not null");
            return (Criteria) this;
        }

        public Criteria andTaskidEqualTo(String value) {
            addCriterion("TASKID =", value, "taskid");
            return (Criteria) this;
        }

        public Criteria andTaskidNotEqualTo(String value) {
            addCriterion("TASKID <>", value, "taskid");
            return (Criteria) this;
        }

        public Criteria andTaskidGreaterThan(String value) {
            addCriterion("TASKID >", value, "taskid");
            return (Criteria) this;
        }

        public Criteria andTaskidGreaterThanOrEqualTo(String value) {
            addCriterion("TASKID >=", value, "taskid");
            return (Criteria) this;
        }

        public Criteria andTaskidLessThan(String value) {
            addCriterion("TASKID <", value, "taskid");
            return (Criteria) this;
        }

        public Criteria andTaskidLessThanOrEqualTo(String value) {
            addCriterion("TASKID <=", value, "taskid");
            return (Criteria) this;
        }

        public Criteria andTaskidLike(String value) {
            addCriterion("TASKID like", value, "taskid");
            return (Criteria) this;
        }

        public Criteria andTaskidNotLike(String value) {
            addCriterion("TASKID not like", value, "taskid");
            return (Criteria) this;
        }

        public Criteria andTaskidIn(List<String> values) {
            addCriterion("TASKID in", values, "taskid");
            return (Criteria) this;
        }

        public Criteria andTaskidNotIn(List<String> values) {
            addCriterion("TASKID not in", values, "taskid");
            return (Criteria) this;
        }

        public Criteria andTaskidBetween(String value1, String value2) {
            addCriterion("TASKID between", value1, value2, "taskid");
            return (Criteria) this;
        }

        public Criteria andTaskidNotBetween(String value1, String value2) {
            addCriterion("TASKID not between", value1, value2, "taskid");
            return (Criteria) this;
        }

        public Criteria andWsurlIsNull() {
            addCriterion("WSURL is null");
            return (Criteria) this;
        }

        public Criteria andWsurlIsNotNull() {
            addCriterion("WSURL is not null");
            return (Criteria) this;
        }

        public Criteria andWsurlEqualTo(String value) {
            addCriterion("WSURL =", value, "wsurl");
            return (Criteria) this;
        }

        public Criteria andWsurlNotEqualTo(String value) {
            addCriterion("WSURL <>", value, "wsurl");
            return (Criteria) this;
        }

        public Criteria andWsurlGreaterThan(String value) {
            addCriterion("WSURL >", value, "wsurl");
            return (Criteria) this;
        }

        public Criteria andWsurlGreaterThanOrEqualTo(String value) {
            addCriterion("WSURL >=", value, "wsurl");
            return (Criteria) this;
        }

        public Criteria andWsurlLessThan(String value) {
            addCriterion("WSURL <", value, "wsurl");
            return (Criteria) this;
        }

        public Criteria andWsurlLessThanOrEqualTo(String value) {
            addCriterion("WSURL <=", value, "wsurl");
            return (Criteria) this;
        }

        public Criteria andWsurlLike(String value) {
            addCriterion("WSURL like", value, "wsurl");
            return (Criteria) this;
        }

        public Criteria andWsurlNotLike(String value) {
            addCriterion("WSURL not like", value, "wsurl");
            return (Criteria) this;
        }

        public Criteria andWsurlIn(List<String> values) {
            addCriterion("WSURL in", values, "wsurl");
            return (Criteria) this;
        }

        public Criteria andWsurlNotIn(List<String> values) {
            addCriterion("WSURL not in", values, "wsurl");
            return (Criteria) this;
        }

        public Criteria andWsurlBetween(String value1, String value2) {
            addCriterion("WSURL between", value1, value2, "wsurl");
            return (Criteria) this;
        }

        public Criteria andWsurlNotBetween(String value1, String value2) {
            addCriterion("WSURL not between", value1, value2, "wsurl");
            return (Criteria) this;
        }

        public Criteria andWsmethodIsNull() {
            addCriterion("WSMETHOD is null");
            return (Criteria) this;
        }

        public Criteria andWsmethodIsNotNull() {
            addCriterion("WSMETHOD is not null");
            return (Criteria) this;
        }

        public Criteria andWsmethodEqualTo(String value) {
            addCriterion("WSMETHOD =", value, "wsmethod");
            return (Criteria) this;
        }

        public Criteria andWsmethodNotEqualTo(String value) {
            addCriterion("WSMETHOD <>", value, "wsmethod");
            return (Criteria) this;
        }

        public Criteria andWsmethodGreaterThan(String value) {
            addCriterion("WSMETHOD >", value, "wsmethod");
            return (Criteria) this;
        }

        public Criteria andWsmethodGreaterThanOrEqualTo(String value) {
            addCriterion("WSMETHOD >=", value, "wsmethod");
            return (Criteria) this;
        }

        public Criteria andWsmethodLessThan(String value) {
            addCriterion("WSMETHOD <", value, "wsmethod");
            return (Criteria) this;
        }

        public Criteria andWsmethodLessThanOrEqualTo(String value) {
            addCriterion("WSMETHOD <=", value, "wsmethod");
            return (Criteria) this;
        }

        public Criteria andWsmethodLike(String value) {
            addCriterion("WSMETHOD like", value, "wsmethod");
            return (Criteria) this;
        }

        public Criteria andWsmethodNotLike(String value) {
            addCriterion("WSMETHOD not like", value, "wsmethod");
            return (Criteria) this;
        }

        public Criteria andWsmethodIn(List<String> values) {
            addCriterion("WSMETHOD in", values, "wsmethod");
            return (Criteria) this;
        }

        public Criteria andWsmethodNotIn(List<String> values) {
            addCriterion("WSMETHOD not in", values, "wsmethod");
            return (Criteria) this;
        }

        public Criteria andWsmethodBetween(String value1, String value2) {
            addCriterion("WSMETHOD between", value1, value2, "wsmethod");
            return (Criteria) this;
        }

        public Criteria andWsmethodNotBetween(String value1, String value2) {
            addCriterion("WSMETHOD not between", value1, value2, "wsmethod");
            return (Criteria) this;
        }

        public Criteria andWsnamespaceIsNull() {
            addCriterion("WSNAMESPACE is null");
            return (Criteria) this;
        }

        public Criteria andWsnamespaceIsNotNull() {
            addCriterion("WSNAMESPACE is not null");
            return (Criteria) this;
        }

        public Criteria andWsnamespaceEqualTo(String value) {
            addCriterion("WSNAMESPACE =", value, "wsnamespace");
            return (Criteria) this;
        }

        public Criteria andWsnamespaceNotEqualTo(String value) {
            addCriterion("WSNAMESPACE <>", value, "wsnamespace");
            return (Criteria) this;
        }

        public Criteria andWsnamespaceGreaterThan(String value) {
            addCriterion("WSNAMESPACE >", value, "wsnamespace");
            return (Criteria) this;
        }

        public Criteria andWsnamespaceGreaterThanOrEqualTo(String value) {
            addCriterion("WSNAMESPACE >=", value, "wsnamespace");
            return (Criteria) this;
        }

        public Criteria andWsnamespaceLessThan(String value) {
            addCriterion("WSNAMESPACE <", value, "wsnamespace");
            return (Criteria) this;
        }

        public Criteria andWsnamespaceLessThanOrEqualTo(String value) {
            addCriterion("WSNAMESPACE <=", value, "wsnamespace");
            return (Criteria) this;
        }

        public Criteria andWsnamespaceLike(String value) {
            addCriterion("WSNAMESPACE like", value, "wsnamespace");
            return (Criteria) this;
        }

        public Criteria andWsnamespaceNotLike(String value) {
            addCriterion("WSNAMESPACE not like", value, "wsnamespace");
            return (Criteria) this;
        }

        public Criteria andWsnamespaceIn(List<String> values) {
            addCriterion("WSNAMESPACE in", values, "wsnamespace");
            return (Criteria) this;
        }

        public Criteria andWsnamespaceNotIn(List<String> values) {
            addCriterion("WSNAMESPACE not in", values, "wsnamespace");
            return (Criteria) this;
        }

        public Criteria andWsnamespaceBetween(String value1, String value2) {
            addCriterion("WSNAMESPACE between", value1, value2, "wsnamespace");
            return (Criteria) this;
        }

        public Criteria andWsnamespaceNotBetween(String value1, String value2) {
            addCriterion("WSNAMESPACE not between", value1, value2, "wsnamespace");
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