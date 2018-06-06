package com.easyfly.main.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class PbsRecordExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PbsRecordExample() {
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

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
        }

        public Criteria andRecordIdIsNull() {
            addCriterion("record_id is null");
            return (Criteria) this;
        }

        public Criteria andRecordIdIsNotNull() {
            addCriterion("record_id is not null");
            return (Criteria) this;
        }

        public Criteria andRecordIdEqualTo(Integer value) {
            addCriterion("record_id =", value, "recordId");
            return (Criteria) this;
        }

        public Criteria andRecordIdNotEqualTo(Integer value) {
            addCriterion("record_id <>", value, "recordId");
            return (Criteria) this;
        }

        public Criteria andRecordIdGreaterThan(Integer value) {
            addCriterion("record_id >", value, "recordId");
            return (Criteria) this;
        }

        public Criteria andRecordIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("record_id >=", value, "recordId");
            return (Criteria) this;
        }

        public Criteria andRecordIdLessThan(Integer value) {
            addCriterion("record_id <", value, "recordId");
            return (Criteria) this;
        }

        public Criteria andRecordIdLessThanOrEqualTo(Integer value) {
            addCriterion("record_id <=", value, "recordId");
            return (Criteria) this;
        }

        public Criteria andRecordIdIn(List<Integer> values) {
            addCriterion("record_id in", values, "recordId");
            return (Criteria) this;
        }

        public Criteria andRecordIdNotIn(List<Integer> values) {
            addCriterion("record_id not in", values, "recordId");
            return (Criteria) this;
        }

        public Criteria andRecordIdBetween(Integer value1, Integer value2) {
            addCriterion("record_id between", value1, value2, "recordId");
            return (Criteria) this;
        }

        public Criteria andRecordIdNotBetween(Integer value1, Integer value2) {
            addCriterion("record_id not between", value1, value2, "recordId");
            return (Criteria) this;
        }

        public Criteria andRecordNoIsNull() {
            addCriterion("record_no is null");
            return (Criteria) this;
        }

        public Criteria andRecordNoIsNotNull() {
            addCriterion("record_no is not null");
            return (Criteria) this;
        }

        public Criteria andRecordNoEqualTo(String value) {
            addCriterion("record_no =", value, "recordNo");
            return (Criteria) this;
        }

        public Criteria andRecordNoNotEqualTo(String value) {
            addCriterion("record_no <>", value, "recordNo");
            return (Criteria) this;
        }

        public Criteria andRecordNoGreaterThan(String value) {
            addCriterion("record_no >", value, "recordNo");
            return (Criteria) this;
        }

        public Criteria andRecordNoGreaterThanOrEqualTo(String value) {
            addCriterion("record_no >=", value, "recordNo");
            return (Criteria) this;
        }

        public Criteria andRecordNoLessThan(String value) {
            addCriterion("record_no <", value, "recordNo");
            return (Criteria) this;
        }

        public Criteria andRecordNoLessThanOrEqualTo(String value) {
            addCriterion("record_no <=", value, "recordNo");
            return (Criteria) this;
        }

        public Criteria andRecordNoLike(String value) {
            addCriterion("record_no like", value, "recordNo");
            return (Criteria) this;
        }

        public Criteria andRecordNoNotLike(String value) {
            addCriterion("record_no not like", value, "recordNo");
            return (Criteria) this;
        }

        public Criteria andRecordNoIn(List<String> values) {
            addCriterion("record_no in", values, "recordNo");
            return (Criteria) this;
        }

        public Criteria andRecordNoNotIn(List<String> values) {
            addCriterion("record_no not in", values, "recordNo");
            return (Criteria) this;
        }

        public Criteria andRecordNoBetween(String value1, String value2) {
            addCriterion("record_no between", value1, value2, "recordNo");
            return (Criteria) this;
        }

        public Criteria andRecordNoNotBetween(String value1, String value2) {
            addCriterion("record_no not between", value1, value2, "recordNo");
            return (Criteria) this;
        }

        public Criteria andUuidIsNull() {
            addCriterion("uuid is null");
            return (Criteria) this;
        }

        public Criteria andUuidIsNotNull() {
            addCriterion("uuid is not null");
            return (Criteria) this;
        }

        public Criteria andUuidEqualTo(String value) {
            addCriterion("uuid =", value, "uuid");
            return (Criteria) this;
        }

        public Criteria andUuidNotEqualTo(String value) {
            addCriterion("uuid <>", value, "uuid");
            return (Criteria) this;
        }

        public Criteria andUuidGreaterThan(String value) {
            addCriterion("uuid >", value, "uuid");
            return (Criteria) this;
        }

        public Criteria andUuidGreaterThanOrEqualTo(String value) {
            addCriterion("uuid >=", value, "uuid");
            return (Criteria) this;
        }

        public Criteria andUuidLessThan(String value) {
            addCriterion("uuid <", value, "uuid");
            return (Criteria) this;
        }

        public Criteria andUuidLessThanOrEqualTo(String value) {
            addCriterion("uuid <=", value, "uuid");
            return (Criteria) this;
        }

        public Criteria andUuidLike(String value) {
            addCriterion("uuid like", value, "uuid");
            return (Criteria) this;
        }

        public Criteria andUuidNotLike(String value) {
            addCriterion("uuid not like", value, "uuid");
            return (Criteria) this;
        }

        public Criteria andUuidIn(List<String> values) {
            addCriterion("uuid in", values, "uuid");
            return (Criteria) this;
        }

        public Criteria andUuidNotIn(List<String> values) {
            addCriterion("uuid not in", values, "uuid");
            return (Criteria) this;
        }

        public Criteria andUuidBetween(String value1, String value2) {
            addCriterion("uuid between", value1, value2, "uuid");
            return (Criteria) this;
        }

        public Criteria andUuidNotBetween(String value1, String value2) {
            addCriterion("uuid not between", value1, value2, "uuid");
            return (Criteria) this;
        }

        public Criteria andKyrNameIsNull() {
            addCriterion("kyr_name is null");
            return (Criteria) this;
        }

        public Criteria andKyrNameIsNotNull() {
            addCriterion("kyr_name is not null");
            return (Criteria) this;
        }

        public Criteria andKyrNameEqualTo(String value) {
            addCriterion("kyr_name =", value, "kyrName");
            return (Criteria) this;
        }

        public Criteria andKyrNameNotEqualTo(String value) {
            addCriterion("kyr_name <>", value, "kyrName");
            return (Criteria) this;
        }

        public Criteria andKyrNameGreaterThan(String value) {
            addCriterion("kyr_name >", value, "kyrName");
            return (Criteria) this;
        }

        public Criteria andKyrNameGreaterThanOrEqualTo(String value) {
            addCriterion("kyr_name >=", value, "kyrName");
            return (Criteria) this;
        }

        public Criteria andKyrNameLessThan(String value) {
            addCriterion("kyr_name <", value, "kyrName");
            return (Criteria) this;
        }

        public Criteria andKyrNameLessThanOrEqualTo(String value) {
            addCriterion("kyr_name <=", value, "kyrName");
            return (Criteria) this;
        }

        public Criteria andKyrNameLike(String value) {
            addCriterion("kyr_name like", value, "kyrName");
            return (Criteria) this;
        }

        public Criteria andKyrNameNotLike(String value) {
            addCriterion("kyr_name not like", value, "kyrName");
            return (Criteria) this;
        }

        public Criteria andKyrNameIn(List<String> values) {
            addCriterion("kyr_name in", values, "kyrName");
            return (Criteria) this;
        }

        public Criteria andKyrNameNotIn(List<String> values) {
            addCriterion("kyr_name not in", values, "kyrName");
            return (Criteria) this;
        }

        public Criteria andKyrNameBetween(String value1, String value2) {
            addCriterion("kyr_name between", value1, value2, "kyrName");
            return (Criteria) this;
        }

        public Criteria andKyrNameNotBetween(String value1, String value2) {
            addCriterion("kyr_name not between", value1, value2, "kyrName");
            return (Criteria) this;
        }

        public Criteria andKyUnitNameIsNull() {
            addCriterion("ky_unit_name is null");
            return (Criteria) this;
        }

        public Criteria andKyUnitNameIsNotNull() {
            addCriterion("ky_unit_name is not null");
            return (Criteria) this;
        }

        public Criteria andKyUnitNameEqualTo(String value) {
            addCriterion("ky_unit_name =", value, "kyUnitName");
            return (Criteria) this;
        }

        public Criteria andKyUnitNameNotEqualTo(String value) {
            addCriterion("ky_unit_name <>", value, "kyUnitName");
            return (Criteria) this;
        }

        public Criteria andKyUnitNameGreaterThan(String value) {
            addCriterion("ky_unit_name >", value, "kyUnitName");
            return (Criteria) this;
        }

        public Criteria andKyUnitNameGreaterThanOrEqualTo(String value) {
            addCriterion("ky_unit_name >=", value, "kyUnitName");
            return (Criteria) this;
        }

        public Criteria andKyUnitNameLessThan(String value) {
            addCriterion("ky_unit_name <", value, "kyUnitName");
            return (Criteria) this;
        }

        public Criteria andKyUnitNameLessThanOrEqualTo(String value) {
            addCriterion("ky_unit_name <=", value, "kyUnitName");
            return (Criteria) this;
        }

        public Criteria andKyUnitNameLike(String value) {
            addCriterion("ky_unit_name like", value, "kyUnitName");
            return (Criteria) this;
        }

        public Criteria andKyUnitNameNotLike(String value) {
            addCriterion("ky_unit_name not like", value, "kyUnitName");
            return (Criteria) this;
        }

        public Criteria andKyUnitNameIn(List<String> values) {
            addCriterion("ky_unit_name in", values, "kyUnitName");
            return (Criteria) this;
        }

        public Criteria andKyUnitNameNotIn(List<String> values) {
            addCriterion("ky_unit_name not in", values, "kyUnitName");
            return (Criteria) this;
        }

        public Criteria andKyUnitNameBetween(String value1, String value2) {
            addCriterion("ky_unit_name between", value1, value2, "kyUnitName");
            return (Criteria) this;
        }

        public Criteria andKyUnitNameNotBetween(String value1, String value2) {
            addCriterion("ky_unit_name not between", value1, value2, "kyUnitName");
            return (Criteria) this;
        }

        public Criteria andJjrIdIsNull() {
            addCriterion("jjr_id is null");
            return (Criteria) this;
        }

        public Criteria andJjrIdIsNotNull() {
            addCriterion("jjr_id is not null");
            return (Criteria) this;
        }

        public Criteria andJjrIdEqualTo(String value) {
            addCriterion("jjr_id =", value, "jjrId");
            return (Criteria) this;
        }

        public Criteria andJjrIdNotEqualTo(String value) {
            addCriterion("jjr_id <>", value, "jjrId");
            return (Criteria) this;
        }

        public Criteria andJjrIdGreaterThan(String value) {
            addCriterion("jjr_id >", value, "jjrId");
            return (Criteria) this;
        }

        public Criteria andJjrIdGreaterThanOrEqualTo(String value) {
            addCriterion("jjr_id >=", value, "jjrId");
            return (Criteria) this;
        }

        public Criteria andJjrIdLessThan(String value) {
            addCriterion("jjr_id <", value, "jjrId");
            return (Criteria) this;
        }

        public Criteria andJjrIdLessThanOrEqualTo(String value) {
            addCriterion("jjr_id <=", value, "jjrId");
            return (Criteria) this;
        }

        public Criteria andJjrIdLike(String value) {
            addCriterion("jjr_id like", value, "jjrId");
            return (Criteria) this;
        }

        public Criteria andJjrIdNotLike(String value) {
            addCriterion("jjr_id not like", value, "jjrId");
            return (Criteria) this;
        }

        public Criteria andJjrIdIn(List<String> values) {
            addCriterion("jjr_id in", values, "jjrId");
            return (Criteria) this;
        }

        public Criteria andJjrIdNotIn(List<String> values) {
            addCriterion("jjr_id not in", values, "jjrId");
            return (Criteria) this;
        }

        public Criteria andJjrIdBetween(String value1, String value2) {
            addCriterion("jjr_id between", value1, value2, "jjrId");
            return (Criteria) this;
        }

        public Criteria andJjrIdNotBetween(String value1, String value2) {
            addCriterion("jjr_id not between", value1, value2, "jjrId");
            return (Criteria) this;
        }

        public Criteria andJjrNameIsNull() {
            addCriterion("jjr_name is null");
            return (Criteria) this;
        }

        public Criteria andJjrNameIsNotNull() {
            addCriterion("jjr_name is not null");
            return (Criteria) this;
        }

        public Criteria andJjrNameEqualTo(String value) {
            addCriterion("jjr_name =", value, "jjrName");
            return (Criteria) this;
        }

        public Criteria andJjrNameNotEqualTo(String value) {
            addCriterion("jjr_name <>", value, "jjrName");
            return (Criteria) this;
        }

        public Criteria andJjrNameGreaterThan(String value) {
            addCriterion("jjr_name >", value, "jjrName");
            return (Criteria) this;
        }

        public Criteria andJjrNameGreaterThanOrEqualTo(String value) {
            addCriterion("jjr_name >=", value, "jjrName");
            return (Criteria) this;
        }

        public Criteria andJjrNameLessThan(String value) {
            addCriterion("jjr_name <", value, "jjrName");
            return (Criteria) this;
        }

        public Criteria andJjrNameLessThanOrEqualTo(String value) {
            addCriterion("jjr_name <=", value, "jjrName");
            return (Criteria) this;
        }

        public Criteria andJjrNameLike(String value) {
            addCriterion("jjr_name like", value, "jjrName");
            return (Criteria) this;
        }

        public Criteria andJjrNameNotLike(String value) {
            addCriterion("jjr_name not like", value, "jjrName");
            return (Criteria) this;
        }

        public Criteria andJjrNameIn(List<String> values) {
            addCriterion("jjr_name in", values, "jjrName");
            return (Criteria) this;
        }

        public Criteria andJjrNameNotIn(List<String> values) {
            addCriterion("jjr_name not in", values, "jjrName");
            return (Criteria) this;
        }

        public Criteria andJjrNameBetween(String value1, String value2) {
            addCriterion("jjr_name between", value1, value2, "jjrName");
            return (Criteria) this;
        }

        public Criteria andJjrNameNotBetween(String value1, String value2) {
            addCriterion("jjr_name not between", value1, value2, "jjrName");
            return (Criteria) this;
        }

        public Criteria andJjUnitIdIsNull() {
            addCriterion("jj_unit_id is null");
            return (Criteria) this;
        }

        public Criteria andJjUnitIdIsNotNull() {
            addCriterion("jj_unit_id is not null");
            return (Criteria) this;
        }

        public Criteria andJjUnitIdEqualTo(String value) {
            addCriterion("jj_unit_id =", value, "jjUnitId");
            return (Criteria) this;
        }

        public Criteria andJjUnitIdNotEqualTo(String value) {
            addCriterion("jj_unit_id <>", value, "jjUnitId");
            return (Criteria) this;
        }

        public Criteria andJjUnitIdGreaterThan(String value) {
            addCriterion("jj_unit_id >", value, "jjUnitId");
            return (Criteria) this;
        }

        public Criteria andJjUnitIdGreaterThanOrEqualTo(String value) {
            addCriterion("jj_unit_id >=", value, "jjUnitId");
            return (Criteria) this;
        }

        public Criteria andJjUnitIdLessThan(String value) {
            addCriterion("jj_unit_id <", value, "jjUnitId");
            return (Criteria) this;
        }

        public Criteria andJjUnitIdLessThanOrEqualTo(String value) {
            addCriterion("jj_unit_id <=", value, "jjUnitId");
            return (Criteria) this;
        }

        public Criteria andJjUnitIdLike(String value) {
            addCriterion("jj_unit_id like", value, "jjUnitId");
            return (Criteria) this;
        }

        public Criteria andJjUnitIdNotLike(String value) {
            addCriterion("jj_unit_id not like", value, "jjUnitId");
            return (Criteria) this;
        }

        public Criteria andJjUnitIdIn(List<String> values) {
            addCriterion("jj_unit_id in", values, "jjUnitId");
            return (Criteria) this;
        }

        public Criteria andJjUnitIdNotIn(List<String> values) {
            addCriterion("jj_unit_id not in", values, "jjUnitId");
            return (Criteria) this;
        }

        public Criteria andJjUnitIdBetween(String value1, String value2) {
            addCriterion("jj_unit_id between", value1, value2, "jjUnitId");
            return (Criteria) this;
        }

        public Criteria andJjUnitIdNotBetween(String value1, String value2) {
            addCriterion("jj_unit_id not between", value1, value2, "jjUnitId");
            return (Criteria) this;
        }

        public Criteria andJjUnitNameIsNull() {
            addCriterion("jj_unit_name is null");
            return (Criteria) this;
        }

        public Criteria andJjUnitNameIsNotNull() {
            addCriterion("jj_unit_name is not null");
            return (Criteria) this;
        }

        public Criteria andJjUnitNameEqualTo(String value) {
            addCriterion("jj_unit_name =", value, "jjUnitName");
            return (Criteria) this;
        }

        public Criteria andJjUnitNameNotEqualTo(String value) {
            addCriterion("jj_unit_name <>", value, "jjUnitName");
            return (Criteria) this;
        }

        public Criteria andJjUnitNameGreaterThan(String value) {
            addCriterion("jj_unit_name >", value, "jjUnitName");
            return (Criteria) this;
        }

        public Criteria andJjUnitNameGreaterThanOrEqualTo(String value) {
            addCriterion("jj_unit_name >=", value, "jjUnitName");
            return (Criteria) this;
        }

        public Criteria andJjUnitNameLessThan(String value) {
            addCriterion("jj_unit_name <", value, "jjUnitName");
            return (Criteria) this;
        }

        public Criteria andJjUnitNameLessThanOrEqualTo(String value) {
            addCriterion("jj_unit_name <=", value, "jjUnitName");
            return (Criteria) this;
        }

        public Criteria andJjUnitNameLike(String value) {
            addCriterion("jj_unit_name like", value, "jjUnitName");
            return (Criteria) this;
        }

        public Criteria andJjUnitNameNotLike(String value) {
            addCriterion("jj_unit_name not like", value, "jjUnitName");
            return (Criteria) this;
        }

        public Criteria andJjUnitNameIn(List<String> values) {
            addCriterion("jj_unit_name in", values, "jjUnitName");
            return (Criteria) this;
        }

        public Criteria andJjUnitNameNotIn(List<String> values) {
            addCriterion("jj_unit_name not in", values, "jjUnitName");
            return (Criteria) this;
        }

        public Criteria andJjUnitNameBetween(String value1, String value2) {
            addCriterion("jj_unit_name between", value1, value2, "jjUnitName");
            return (Criteria) this;
        }

        public Criteria andJjUnitNameNotBetween(String value1, String value2) {
            addCriterion("jj_unit_name not between", value1, value2, "jjUnitName");
            return (Criteria) this;
        }

        public Criteria andKyrIdIsNull() {
            addCriterion("kyr_id is null");
            return (Criteria) this;
        }

        public Criteria andKyrIdIsNotNull() {
            addCriterion("kyr_id is not null");
            return (Criteria) this;
        }

        public Criteria andKyrIdEqualTo(String value) {
            addCriterion("kyr_id =", value, "kyrId");
            return (Criteria) this;
        }

        public Criteria andKyrIdNotEqualTo(String value) {
            addCriterion("kyr_id <>", value, "kyrId");
            return (Criteria) this;
        }

        public Criteria andKyrIdGreaterThan(String value) {
            addCriterion("kyr_id >", value, "kyrId");
            return (Criteria) this;
        }

        public Criteria andKyrIdGreaterThanOrEqualTo(String value) {
            addCriterion("kyr_id >=", value, "kyrId");
            return (Criteria) this;
        }

        public Criteria andKyrIdLessThan(String value) {
            addCriterion("kyr_id <", value, "kyrId");
            return (Criteria) this;
        }

        public Criteria andKyrIdLessThanOrEqualTo(String value) {
            addCriterion("kyr_id <=", value, "kyrId");
            return (Criteria) this;
        }

        public Criteria andKyrIdLike(String value) {
            addCriterion("kyr_id like", value, "kyrId");
            return (Criteria) this;
        }

        public Criteria andKyrIdNotLike(String value) {
            addCriterion("kyr_id not like", value, "kyrId");
            return (Criteria) this;
        }

        public Criteria andKyrIdIn(List<String> values) {
            addCriterion("kyr_id in", values, "kyrId");
            return (Criteria) this;
        }

        public Criteria andKyrIdNotIn(List<String> values) {
            addCriterion("kyr_id not in", values, "kyrId");
            return (Criteria) this;
        }

        public Criteria andKyrIdBetween(String value1, String value2) {
            addCriterion("kyr_id between", value1, value2, "kyrId");
            return (Criteria) this;
        }

        public Criteria andKyrIdNotBetween(String value1, String value2) {
            addCriterion("kyr_id not between", value1, value2, "kyrId");
            return (Criteria) this;
        }

        public Criteria andKyUnitIdIsNull() {
            addCriterion("ky_unit_id is null");
            return (Criteria) this;
        }

        public Criteria andKyUnitIdIsNotNull() {
            addCriterion("ky_unit_id is not null");
            return (Criteria) this;
        }

        public Criteria andKyUnitIdEqualTo(String value) {
            addCriterion("ky_unit_id =", value, "kyUnitId");
            return (Criteria) this;
        }

        public Criteria andKyUnitIdNotEqualTo(String value) {
            addCriterion("ky_unit_id <>", value, "kyUnitId");
            return (Criteria) this;
        }

        public Criteria andKyUnitIdGreaterThan(String value) {
            addCriterion("ky_unit_id >", value, "kyUnitId");
            return (Criteria) this;
        }

        public Criteria andKyUnitIdGreaterThanOrEqualTo(String value) {
            addCriterion("ky_unit_id >=", value, "kyUnitId");
            return (Criteria) this;
        }

        public Criteria andKyUnitIdLessThan(String value) {
            addCriterion("ky_unit_id <", value, "kyUnitId");
            return (Criteria) this;
        }

        public Criteria andKyUnitIdLessThanOrEqualTo(String value) {
            addCriterion("ky_unit_id <=", value, "kyUnitId");
            return (Criteria) this;
        }

        public Criteria andKyUnitIdLike(String value) {
            addCriterion("ky_unit_id like", value, "kyUnitId");
            return (Criteria) this;
        }

        public Criteria andKyUnitIdNotLike(String value) {
            addCriterion("ky_unit_id not like", value, "kyUnitId");
            return (Criteria) this;
        }

        public Criteria andKyUnitIdIn(List<String> values) {
            addCriterion("ky_unit_id in", values, "kyUnitId");
            return (Criteria) this;
        }

        public Criteria andKyUnitIdNotIn(List<String> values) {
            addCriterion("ky_unit_id not in", values, "kyUnitId");
            return (Criteria) this;
        }

        public Criteria andKyUnitIdBetween(String value1, String value2) {
            addCriterion("ky_unit_id between", value1, value2, "kyUnitId");
            return (Criteria) this;
        }

        public Criteria andKyUnitIdNotBetween(String value1, String value2) {
            addCriterion("ky_unit_id not between", value1, value2, "kyUnitId");
            return (Criteria) this;
        }

        public Criteria andBgrIdIsNull() {
            addCriterion("bgr_id is null");
            return (Criteria) this;
        }

        public Criteria andBgrIdIsNotNull() {
            addCriterion("bgr_id is not null");
            return (Criteria) this;
        }

        public Criteria andBgrIdEqualTo(String value) {
            addCriterion("bgr_id =", value, "bgrId");
            return (Criteria) this;
        }

        public Criteria andBgrIdNotEqualTo(String value) {
            addCriterion("bgr_id <>", value, "bgrId");
            return (Criteria) this;
        }

        public Criteria andBgrIdGreaterThan(String value) {
            addCriterion("bgr_id >", value, "bgrId");
            return (Criteria) this;
        }

        public Criteria andBgrIdGreaterThanOrEqualTo(String value) {
            addCriterion("bgr_id >=", value, "bgrId");
            return (Criteria) this;
        }

        public Criteria andBgrIdLessThan(String value) {
            addCriterion("bgr_id <", value, "bgrId");
            return (Criteria) this;
        }

        public Criteria andBgrIdLessThanOrEqualTo(String value) {
            addCriterion("bgr_id <=", value, "bgrId");
            return (Criteria) this;
        }

        public Criteria andBgrIdLike(String value) {
            addCriterion("bgr_id like", value, "bgrId");
            return (Criteria) this;
        }

        public Criteria andBgrIdNotLike(String value) {
            addCriterion("bgr_id not like", value, "bgrId");
            return (Criteria) this;
        }

        public Criteria andBgrIdIn(List<String> values) {
            addCriterion("bgr_id in", values, "bgrId");
            return (Criteria) this;
        }

        public Criteria andBgrIdNotIn(List<String> values) {
            addCriterion("bgr_id not in", values, "bgrId");
            return (Criteria) this;
        }

        public Criteria andBgrIdBetween(String value1, String value2) {
            addCriterion("bgr_id between", value1, value2, "bgrId");
            return (Criteria) this;
        }

        public Criteria andBgrIdNotBetween(String value1, String value2) {
            addCriterion("bgr_id not between", value1, value2, "bgrId");
            return (Criteria) this;
        }

        public Criteria andBgrNameIsNull() {
            addCriterion("bgr_name is null");
            return (Criteria) this;
        }

        public Criteria andBgrNameIsNotNull() {
            addCriterion("bgr_name is not null");
            return (Criteria) this;
        }

        public Criteria andBgrNameEqualTo(String value) {
            addCriterion("bgr_name =", value, "bgrName");
            return (Criteria) this;
        }

        public Criteria andBgrNameNotEqualTo(String value) {
            addCriterion("bgr_name <>", value, "bgrName");
            return (Criteria) this;
        }

        public Criteria andBgrNameGreaterThan(String value) {
            addCriterion("bgr_name >", value, "bgrName");
            return (Criteria) this;
        }

        public Criteria andBgrNameGreaterThanOrEqualTo(String value) {
            addCriterion("bgr_name >=", value, "bgrName");
            return (Criteria) this;
        }

        public Criteria andBgrNameLessThan(String value) {
            addCriterion("bgr_name <", value, "bgrName");
            return (Criteria) this;
        }

        public Criteria andBgrNameLessThanOrEqualTo(String value) {
            addCriterion("bgr_name <=", value, "bgrName");
            return (Criteria) this;
        }

        public Criteria andBgrNameLike(String value) {
            addCriterion("bgr_name like", value, "bgrName");
            return (Criteria) this;
        }

        public Criteria andBgrNameNotLike(String value) {
            addCriterion("bgr_name not like", value, "bgrName");
            return (Criteria) this;
        }

        public Criteria andBgrNameIn(List<String> values) {
            addCriterion("bgr_name in", values, "bgrName");
            return (Criteria) this;
        }

        public Criteria andBgrNameNotIn(List<String> values) {
            addCriterion("bgr_name not in", values, "bgrName");
            return (Criteria) this;
        }

        public Criteria andBgrNameBetween(String value1, String value2) {
            addCriterion("bgr_name between", value1, value2, "bgrName");
            return (Criteria) this;
        }

        public Criteria andBgrNameNotBetween(String value1, String value2) {
            addCriterion("bgr_name not between", value1, value2, "bgrName");
            return (Criteria) this;
        }

        public Criteria andRecTitleIsNull() {
            addCriterion("rec_title is null");
            return (Criteria) this;
        }

        public Criteria andRecTitleIsNotNull() {
            addCriterion("rec_title is not null");
            return (Criteria) this;
        }

        public Criteria andRecTitleEqualTo(String value) {
            addCriterion("rec_title =", value, "recTitle");
            return (Criteria) this;
        }

        public Criteria andRecTitleNotEqualTo(String value) {
            addCriterion("rec_title <>", value, "recTitle");
            return (Criteria) this;
        }

        public Criteria andRecTitleGreaterThan(String value) {
            addCriterion("rec_title >", value, "recTitle");
            return (Criteria) this;
        }

        public Criteria andRecTitleGreaterThanOrEqualTo(String value) {
            addCriterion("rec_title >=", value, "recTitle");
            return (Criteria) this;
        }

        public Criteria andRecTitleLessThan(String value) {
            addCriterion("rec_title <", value, "recTitle");
            return (Criteria) this;
        }

        public Criteria andRecTitleLessThanOrEqualTo(String value) {
            addCriterion("rec_title <=", value, "recTitle");
            return (Criteria) this;
        }

        public Criteria andRecTitleLike(String value) {
            addCriterion("rec_title like", value, "recTitle");
            return (Criteria) this;
        }

        public Criteria andRecTitleNotLike(String value) {
            addCriterion("rec_title not like", value, "recTitle");
            return (Criteria) this;
        }

        public Criteria andRecTitleIn(List<String> values) {
            addCriterion("rec_title in", values, "recTitle");
            return (Criteria) this;
        }

        public Criteria andRecTitleNotIn(List<String> values) {
            addCriterion("rec_title not in", values, "recTitle");
            return (Criteria) this;
        }

        public Criteria andRecTitleBetween(String value1, String value2) {
            addCriterion("rec_title between", value1, value2, "recTitle");
            return (Criteria) this;
        }

        public Criteria andRecTitleNotBetween(String value1, String value2) {
            addCriterion("rec_title not between", value1, value2, "recTitle");
            return (Criteria) this;
        }

        public Criteria andRecXzIsNull() {
            addCriterion("rec_xz is null");
            return (Criteria) this;
        }

        public Criteria andRecXzIsNotNull() {
            addCriterion("rec_xz is not null");
            return (Criteria) this;
        }

        public Criteria andRecXzEqualTo(String value) {
            addCriterion("rec_xz =", value, "recXz");
            return (Criteria) this;
        }

        public Criteria andRecXzNotEqualTo(String value) {
            addCriterion("rec_xz <>", value, "recXz");
            return (Criteria) this;
        }

        public Criteria andRecXzGreaterThan(String value) {
            addCriterion("rec_xz >", value, "recXz");
            return (Criteria) this;
        }

        public Criteria andRecXzGreaterThanOrEqualTo(String value) {
            addCriterion("rec_xz >=", value, "recXz");
            return (Criteria) this;
        }

        public Criteria andRecXzLessThan(String value) {
            addCriterion("rec_xz <", value, "recXz");
            return (Criteria) this;
        }

        public Criteria andRecXzLessThanOrEqualTo(String value) {
            addCriterion("rec_xz <=", value, "recXz");
            return (Criteria) this;
        }

        public Criteria andRecXzLike(String value) {
            addCriterion("rec_xz like", value, "recXz");
            return (Criteria) this;
        }

        public Criteria andRecXzNotLike(String value) {
            addCriterion("rec_xz not like", value, "recXz");
            return (Criteria) this;
        }

        public Criteria andRecXzIn(List<String> values) {
            addCriterion("rec_xz in", values, "recXz");
            return (Criteria) this;
        }

        public Criteria andRecXzNotIn(List<String> values) {
            addCriterion("rec_xz not in", values, "recXz");
            return (Criteria) this;
        }

        public Criteria andRecXzBetween(String value1, String value2) {
            addCriterion("rec_xz between", value1, value2, "recXz");
            return (Criteria) this;
        }

        public Criteria andRecXzNotBetween(String value1, String value2) {
            addCriterion("rec_xz not between", value1, value2, "recXz");
            return (Criteria) this;
        }

        public Criteria andFsqyIsNull() {
            addCriterion("fsqy is null");
            return (Criteria) this;
        }

        public Criteria andFsqyIsNotNull() {
            addCriterion("fsqy is not null");
            return (Criteria) this;
        }

        public Criteria andFsqyEqualTo(String value) {
            addCriterion("fsqy =", value, "fsqy");
            return (Criteria) this;
        }

        public Criteria andFsqyNotEqualTo(String value) {
            addCriterion("fsqy <>", value, "fsqy");
            return (Criteria) this;
        }

        public Criteria andFsqyGreaterThan(String value) {
            addCriterion("fsqy >", value, "fsqy");
            return (Criteria) this;
        }

        public Criteria andFsqyGreaterThanOrEqualTo(String value) {
            addCriterion("fsqy >=", value, "fsqy");
            return (Criteria) this;
        }

        public Criteria andFsqyLessThan(String value) {
            addCriterion("fsqy <", value, "fsqy");
            return (Criteria) this;
        }

        public Criteria andFsqyLessThanOrEqualTo(String value) {
            addCriterion("fsqy <=", value, "fsqy");
            return (Criteria) this;
        }

        public Criteria andFsqyLike(String value) {
            addCriterion("fsqy like", value, "fsqy");
            return (Criteria) this;
        }

        public Criteria andFsqyNotLike(String value) {
            addCriterion("fsqy not like", value, "fsqy");
            return (Criteria) this;
        }

        public Criteria andFsqyIn(List<String> values) {
            addCriterion("fsqy in", values, "fsqy");
            return (Criteria) this;
        }

        public Criteria andFsqyNotIn(List<String> values) {
            addCriterion("fsqy not in", values, "fsqy");
            return (Criteria) this;
        }

        public Criteria andFsqyBetween(String value1, String value2) {
            addCriterion("fsqy between", value1, value2, "fsqy");
            return (Criteria) this;
        }

        public Criteria andFsqyNotBetween(String value1, String value2) {
            addCriterion("fsqy not between", value1, value2, "fsqy");
            return (Criteria) this;
        }

        public Criteria andXcwzIsNull() {
            addCriterion("xcwz is null");
            return (Criteria) this;
        }

        public Criteria andXcwzIsNotNull() {
            addCriterion("xcwz is not null");
            return (Criteria) this;
        }

        public Criteria andXcwzEqualTo(String value) {
            addCriterion("xcwz =", value, "xcwz");
            return (Criteria) this;
        }

        public Criteria andXcwzNotEqualTo(String value) {
            addCriterion("xcwz <>", value, "xcwz");
            return (Criteria) this;
        }

        public Criteria andXcwzGreaterThan(String value) {
            addCriterion("xcwz >", value, "xcwz");
            return (Criteria) this;
        }

        public Criteria andXcwzGreaterThanOrEqualTo(String value) {
            addCriterion("xcwz >=", value, "xcwz");
            return (Criteria) this;
        }

        public Criteria andXcwzLessThan(String value) {
            addCriterion("xcwz <", value, "xcwz");
            return (Criteria) this;
        }

        public Criteria andXcwzLessThanOrEqualTo(String value) {
            addCriterion("xcwz <=", value, "xcwz");
            return (Criteria) this;
        }

        public Criteria andXcwzLike(String value) {
            addCriterion("xcwz like", value, "xcwz");
            return (Criteria) this;
        }

        public Criteria andXcwzNotLike(String value) {
            addCriterion("xcwz not like", value, "xcwz");
            return (Criteria) this;
        }

        public Criteria andXcwzIn(List<String> values) {
            addCriterion("xcwz in", values, "xcwz");
            return (Criteria) this;
        }

        public Criteria andXcwzNotIn(List<String> values) {
            addCriterion("xcwz not in", values, "xcwz");
            return (Criteria) this;
        }

        public Criteria andXcwzBetween(String value1, String value2) {
            addCriterion("xcwz between", value1, value2, "xcwz");
            return (Criteria) this;
        }

        public Criteria andXcwzNotBetween(String value1, String value2) {
            addCriterion("xcwz not between", value1, value2, "xcwz");
            return (Criteria) this;
        }

        public Criteria andXczbIsNull() {
            addCriterion("xczb is null");
            return (Criteria) this;
        }

        public Criteria andXczbIsNotNull() {
            addCriterion("xczb is not null");
            return (Criteria) this;
        }

        public Criteria andXczbEqualTo(String value) {
            addCriterion("xczb =", value, "xczb");
            return (Criteria) this;
        }

        public Criteria andXczbNotEqualTo(String value) {
            addCriterion("xczb <>", value, "xczb");
            return (Criteria) this;
        }

        public Criteria andXczbGreaterThan(String value) {
            addCriterion("xczb >", value, "xczb");
            return (Criteria) this;
        }

        public Criteria andXczbGreaterThanOrEqualTo(String value) {
            addCriterion("xczb >=", value, "xczb");
            return (Criteria) this;
        }

        public Criteria andXczbLessThan(String value) {
            addCriterion("xczb <", value, "xczb");
            return (Criteria) this;
        }

        public Criteria andXczbLessThanOrEqualTo(String value) {
            addCriterion("xczb <=", value, "xczb");
            return (Criteria) this;
        }

        public Criteria andXczbLike(String value) {
            addCriterion("xczb like", value, "xczb");
            return (Criteria) this;
        }

        public Criteria andXczbNotLike(String value) {
            addCriterion("xczb not like", value, "xczb");
            return (Criteria) this;
        }

        public Criteria andXczbIn(List<String> values) {
            addCriterion("xczb in", values, "xczb");
            return (Criteria) this;
        }

        public Criteria andXczbNotIn(List<String> values) {
            addCriterion("xczb not in", values, "xczb");
            return (Criteria) this;
        }

        public Criteria andXczbBetween(String value1, String value2) {
            addCriterion("xczb between", value1, value2, "xczb");
            return (Criteria) this;
        }

        public Criteria andXczbNotBetween(String value1, String value2) {
            addCriterion("xczb not between", value1, value2, "xczb");
            return (Criteria) this;
        }

        public Criteria andRecStateIsNull() {
            addCriterion("rec_state is null");
            return (Criteria) this;
        }

        public Criteria andRecStateIsNotNull() {
            addCriterion("rec_state is not null");
            return (Criteria) this;
        }

        public Criteria andRecStateEqualTo(Integer value) {
            addCriterion("rec_state =", value, "recState");
            return (Criteria) this;
        }

        public Criteria andRecStateNotEqualTo(Integer value) {
            addCriterion("rec_state <>", value, "recState");
            return (Criteria) this;
        }

        public Criteria andRecStateGreaterThan(Integer value) {
            addCriterion("rec_state >", value, "recState");
            return (Criteria) this;
        }

        public Criteria andRecStateGreaterThanOrEqualTo(Integer value) {
            addCriterion("rec_state >=", value, "recState");
            return (Criteria) this;
        }

        public Criteria andRecStateLessThan(Integer value) {
            addCriterion("rec_state <", value, "recState");
            return (Criteria) this;
        }

        public Criteria andRecStateLessThanOrEqualTo(Integer value) {
            addCriterion("rec_state <=", value, "recState");
            return (Criteria) this;
        }

        public Criteria andRecStateIn(List<Integer> values) {
            addCriterion("rec_state in", values, "recState");
            return (Criteria) this;
        }

        public Criteria andRecStateNotIn(List<Integer> values) {
            addCriterion("rec_state not in", values, "recState");
            return (Criteria) this;
        }

        public Criteria andRecStateBetween(Integer value1, Integer value2) {
            addCriterion("rec_state between", value1, value2, "recState");
            return (Criteria) this;
        }

        public Criteria andRecStateNotBetween(Integer value1, Integer value2) {
            addCriterion("rec_state not between", value1, value2, "recState");
            return (Criteria) this;
        }

        public Criteria andXctqIsNull() {
            addCriterion("xctq is null");
            return (Criteria) this;
        }

        public Criteria andXctqIsNotNull() {
            addCriterion("xctq is not null");
            return (Criteria) this;
        }

        public Criteria andXctqEqualTo(String value) {
            addCriterion("xctq =", value, "xctq");
            return (Criteria) this;
        }

        public Criteria andXctqNotEqualTo(String value) {
            addCriterion("xctq <>", value, "xctq");
            return (Criteria) this;
        }

        public Criteria andXctqGreaterThan(String value) {
            addCriterion("xctq >", value, "xctq");
            return (Criteria) this;
        }

        public Criteria andXctqGreaterThanOrEqualTo(String value) {
            addCriterion("xctq >=", value, "xctq");
            return (Criteria) this;
        }

        public Criteria andXctqLessThan(String value) {
            addCriterion("xctq <", value, "xctq");
            return (Criteria) this;
        }

        public Criteria andXctqLessThanOrEqualTo(String value) {
            addCriterion("xctq <=", value, "xctq");
            return (Criteria) this;
        }

        public Criteria andXctqLike(String value) {
            addCriterion("xctq like", value, "xctq");
            return (Criteria) this;
        }

        public Criteria andXctqNotLike(String value) {
            addCriterion("xctq not like", value, "xctq");
            return (Criteria) this;
        }

        public Criteria andXctqIn(List<String> values) {
            addCriterion("xctq in", values, "xctq");
            return (Criteria) this;
        }

        public Criteria andXctqNotIn(List<String> values) {
            addCriterion("xctq not in", values, "xctq");
            return (Criteria) this;
        }

        public Criteria andXctqBetween(String value1, String value2) {
            addCriterion("xctq between", value1, value2, "xctq");
            return (Criteria) this;
        }

        public Criteria andXctqNotBetween(String value1, String value2) {
            addCriterion("xctq not between", value1, value2, "xctq");
            return (Criteria) this;
        }

        public Criteria andXcsdIsNull() {
            addCriterion("xcsd is null");
            return (Criteria) this;
        }

        public Criteria andXcsdIsNotNull() {
            addCriterion("xcsd is not null");
            return (Criteria) this;
        }

        public Criteria andXcsdEqualTo(String value) {
            addCriterion("xcsd =", value, "xcsd");
            return (Criteria) this;
        }

        public Criteria andXcsdNotEqualTo(String value) {
            addCriterion("xcsd <>", value, "xcsd");
            return (Criteria) this;
        }

        public Criteria andXcsdGreaterThan(String value) {
            addCriterion("xcsd >", value, "xcsd");
            return (Criteria) this;
        }

        public Criteria andXcsdGreaterThanOrEqualTo(String value) {
            addCriterion("xcsd >=", value, "xcsd");
            return (Criteria) this;
        }

        public Criteria andXcsdLessThan(String value) {
            addCriterion("xcsd <", value, "xcsd");
            return (Criteria) this;
        }

        public Criteria andXcsdLessThanOrEqualTo(String value) {
            addCriterion("xcsd <=", value, "xcsd");
            return (Criteria) this;
        }

        public Criteria andXcsdLike(String value) {
            addCriterion("xcsd like", value, "xcsd");
            return (Criteria) this;
        }

        public Criteria andXcsdNotLike(String value) {
            addCriterion("xcsd not like", value, "xcsd");
            return (Criteria) this;
        }

        public Criteria andXcsdIn(List<String> values) {
            addCriterion("xcsd in", values, "xcsd");
            return (Criteria) this;
        }

        public Criteria andXcsdNotIn(List<String> values) {
            addCriterion("xcsd not in", values, "xcsd");
            return (Criteria) this;
        }

        public Criteria andXcsdBetween(String value1, String value2) {
            addCriterion("xcsd between", value1, value2, "xcsd");
            return (Criteria) this;
        }

        public Criteria andXcsdNotBetween(String value1, String value2) {
            addCriterion("xcsd not between", value1, value2, "xcsd");
            return (Criteria) this;
        }

        public Criteria andXcwdIsNull() {
            addCriterion("xcwd is null");
            return (Criteria) this;
        }

        public Criteria andXcwdIsNotNull() {
            addCriterion("xcwd is not null");
            return (Criteria) this;
        }

        public Criteria andXcwdEqualTo(String value) {
            addCriterion("xcwd =", value, "xcwd");
            return (Criteria) this;
        }

        public Criteria andXcwdNotEqualTo(String value) {
            addCriterion("xcwd <>", value, "xcwd");
            return (Criteria) this;
        }

        public Criteria andXcwdGreaterThan(String value) {
            addCriterion("xcwd >", value, "xcwd");
            return (Criteria) this;
        }

        public Criteria andXcwdGreaterThanOrEqualTo(String value) {
            addCriterion("xcwd >=", value, "xcwd");
            return (Criteria) this;
        }

        public Criteria andXcwdLessThan(String value) {
            addCriterion("xcwd <", value, "xcwd");
            return (Criteria) this;
        }

        public Criteria andXcwdLessThanOrEqualTo(String value) {
            addCriterion("xcwd <=", value, "xcwd");
            return (Criteria) this;
        }

        public Criteria andXcwdLike(String value) {
            addCriterion("xcwd like", value, "xcwd");
            return (Criteria) this;
        }

        public Criteria andXcwdNotLike(String value) {
            addCriterion("xcwd not like", value, "xcwd");
            return (Criteria) this;
        }

        public Criteria andXcwdIn(List<String> values) {
            addCriterion("xcwd in", values, "xcwd");
            return (Criteria) this;
        }

        public Criteria andXcwdNotIn(List<String> values) {
            addCriterion("xcwd not in", values, "xcwd");
            return (Criteria) this;
        }

        public Criteria andXcwdBetween(String value1, String value2) {
            addCriterion("xcwd between", value1, value2, "xcwd");
            return (Criteria) this;
        }

        public Criteria andXcwdNotBetween(String value1, String value2) {
            addCriterion("xcwd not between", value1, value2, "xcwd");
            return (Criteria) this;
        }

        public Criteria andKyDateIsNull() {
            addCriterion("ky_date is null");
            return (Criteria) this;
        }

        public Criteria andKyDateIsNotNull() {
            addCriterion("ky_date is not null");
            return (Criteria) this;
        }

        public Criteria andKyDateEqualTo(Date value) {
            addCriterionForJDBCDate("ky_date =", value, "kyDate");
            return (Criteria) this;
        }

        public Criteria andKyDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("ky_date <>", value, "kyDate");
            return (Criteria) this;
        }

        public Criteria andKyDateGreaterThan(Date value) {
            addCriterionForJDBCDate("ky_date >", value, "kyDate");
            return (Criteria) this;
        }

        public Criteria andKyDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("ky_date >=", value, "kyDate");
            return (Criteria) this;
        }

        public Criteria andKyDateLessThan(Date value) {
            addCriterionForJDBCDate("ky_date <", value, "kyDate");
            return (Criteria) this;
        }

        public Criteria andKyDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("ky_date <=", value, "kyDate");
            return (Criteria) this;
        }

        public Criteria andKyDateIn(List<Date> values) {
            addCriterionForJDBCDate("ky_date in", values, "kyDate");
            return (Criteria) this;
        }

        public Criteria andKyDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("ky_date not in", values, "kyDate");
            return (Criteria) this;
        }

        public Criteria andKyDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("ky_date between", value1, value2, "kyDate");
            return (Criteria) this;
        }

        public Criteria andKyDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("ky_date not between", value1, value2, "kyDate");
            return (Criteria) this;
        }

        public Criteria andJjTimeIsNull() {
            addCriterion("jj_time is null");
            return (Criteria) this;
        }

        public Criteria andJjTimeIsNotNull() {
            addCriterion("jj_time is not null");
            return (Criteria) this;
        }

        public Criteria andJjTimeEqualTo(Date value) {
            addCriterion("jj_time =", value, "jjTime");
            return (Criteria) this;
        }

        public Criteria andJjTimeNotEqualTo(Date value) {
            addCriterion("jj_time <>", value, "jjTime");
            return (Criteria) this;
        }

        public Criteria andJjTimeGreaterThan(Date value) {
            addCriterion("jj_time >", value, "jjTime");
            return (Criteria) this;
        }

        public Criteria andJjTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("jj_time >=", value, "jjTime");
            return (Criteria) this;
        }

        public Criteria andJjTimeLessThan(Date value) {
            addCriterion("jj_time <", value, "jjTime");
            return (Criteria) this;
        }

        public Criteria andJjTimeLessThanOrEqualTo(Date value) {
            addCriterion("jj_time <=", value, "jjTime");
            return (Criteria) this;
        }

        public Criteria andJjTimeIn(List<Date> values) {
            addCriterion("jj_time in", values, "jjTime");
            return (Criteria) this;
        }

        public Criteria andJjTimeNotIn(List<Date> values) {
            addCriterion("jj_time not in", values, "jjTime");
            return (Criteria) this;
        }

        public Criteria andJjTimeBetween(Date value1, Date value2) {
            addCriterion("jj_time between", value1, value2, "jjTime");
            return (Criteria) this;
        }

        public Criteria andJjTimeNotBetween(Date value1, Date value2) {
            addCriterion("jj_time not between", value1, value2, "jjTime");
            return (Criteria) this;
        }

        public Criteria andKyksTimeIsNull() {
            addCriterion("kyks_time is null");
            return (Criteria) this;
        }

        public Criteria andKyksTimeIsNotNull() {
            addCriterion("kyks_time is not null");
            return (Criteria) this;
        }

        public Criteria andKyksTimeEqualTo(Date value) {
            addCriterion("kyks_time =", value, "kyksTime");
            return (Criteria) this;
        }

        public Criteria andKyksTimeNotEqualTo(Date value) {
            addCriterion("kyks_time <>", value, "kyksTime");
            return (Criteria) this;
        }

        public Criteria andKyksTimeGreaterThan(Date value) {
            addCriterion("kyks_time >", value, "kyksTime");
            return (Criteria) this;
        }

        public Criteria andKyksTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("kyks_time >=", value, "kyksTime");
            return (Criteria) this;
        }

        public Criteria andKyksTimeLessThan(Date value) {
            addCriterion("kyks_time <", value, "kyksTime");
            return (Criteria) this;
        }

        public Criteria andKyksTimeLessThanOrEqualTo(Date value) {
            addCriterion("kyks_time <=", value, "kyksTime");
            return (Criteria) this;
        }

        public Criteria andKyksTimeIn(List<Date> values) {
            addCriterion("kyks_time in", values, "kyksTime");
            return (Criteria) this;
        }

        public Criteria andKyksTimeNotIn(List<Date> values) {
            addCriterion("kyks_time not in", values, "kyksTime");
            return (Criteria) this;
        }

        public Criteria andKyksTimeBetween(Date value1, Date value2) {
            addCriterion("kyks_time between", value1, value2, "kyksTime");
            return (Criteria) this;
        }

        public Criteria andKyksTimeNotBetween(Date value1, Date value2) {
            addCriterion("kyks_time not between", value1, value2, "kyksTime");
            return (Criteria) this;
        }

        public Criteria andKyjsTimeIsNull() {
            addCriterion("kyjs_time is null");
            return (Criteria) this;
        }

        public Criteria andKyjsTimeIsNotNull() {
            addCriterion("kyjs_time is not null");
            return (Criteria) this;
        }

        public Criteria andKyjsTimeEqualTo(Date value) {
            addCriterion("kyjs_time =", value, "kyjsTime");
            return (Criteria) this;
        }

        public Criteria andKyjsTimeNotEqualTo(Date value) {
            addCriterion("kyjs_time <>", value, "kyjsTime");
            return (Criteria) this;
        }

        public Criteria andKyjsTimeGreaterThan(Date value) {
            addCriterion("kyjs_time >", value, "kyjsTime");
            return (Criteria) this;
        }

        public Criteria andKyjsTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("kyjs_time >=", value, "kyjsTime");
            return (Criteria) this;
        }

        public Criteria andKyjsTimeLessThan(Date value) {
            addCriterion("kyjs_time <", value, "kyjsTime");
            return (Criteria) this;
        }

        public Criteria andKyjsTimeLessThanOrEqualTo(Date value) {
            addCriterion("kyjs_time <=", value, "kyjsTime");
            return (Criteria) this;
        }

        public Criteria andKyjsTimeIn(List<Date> values) {
            addCriterion("kyjs_time in", values, "kyjsTime");
            return (Criteria) this;
        }

        public Criteria andKyjsTimeNotIn(List<Date> values) {
            addCriterion("kyjs_time not in", values, "kyjsTime");
            return (Criteria) this;
        }

        public Criteria andKyjsTimeBetween(Date value1, Date value2) {
            addCriterion("kyjs_time between", value1, value2, "kyjsTime");
            return (Criteria) this;
        }

        public Criteria andKyjsTimeNotBetween(Date value1, Date value2) {
            addCriterion("kyjs_time not between", value1, value2, "kyjsTime");
            return (Criteria) this;
        }

        public Criteria andXcfxIsNull() {
            addCriterion("xcfx is null");
            return (Criteria) this;
        }

        public Criteria andXcfxIsNotNull() {
            addCriterion("xcfx is not null");
            return (Criteria) this;
        }

        public Criteria andXcfxEqualTo(String value) {
            addCriterion("xcfx =", value, "xcfx");
            return (Criteria) this;
        }

        public Criteria andXcfxNotEqualTo(String value) {
            addCriterion("xcfx <>", value, "xcfx");
            return (Criteria) this;
        }

        public Criteria andXcfxGreaterThan(String value) {
            addCriterion("xcfx >", value, "xcfx");
            return (Criteria) this;
        }

        public Criteria andXcfxGreaterThanOrEqualTo(String value) {
            addCriterion("xcfx >=", value, "xcfx");
            return (Criteria) this;
        }

        public Criteria andXcfxLessThan(String value) {
            addCriterion("xcfx <", value, "xcfx");
            return (Criteria) this;
        }

        public Criteria andXcfxLessThanOrEqualTo(String value) {
            addCriterion("xcfx <=", value, "xcfx");
            return (Criteria) this;
        }

        public Criteria andXcfxLike(String value) {
            addCriterion("xcfx like", value, "xcfx");
            return (Criteria) this;
        }

        public Criteria andXcfxNotLike(String value) {
            addCriterion("xcfx not like", value, "xcfx");
            return (Criteria) this;
        }

        public Criteria andXcfxIn(List<String> values) {
            addCriterion("xcfx in", values, "xcfx");
            return (Criteria) this;
        }

        public Criteria andXcfxNotIn(List<String> values) {
            addCriterion("xcfx not in", values, "xcfx");
            return (Criteria) this;
        }

        public Criteria andXcfxBetween(String value1, String value2) {
            addCriterion("xcfx between", value1, value2, "xcfx");
            return (Criteria) this;
        }

        public Criteria andXcfxNotBetween(String value1, String value2) {
            addCriterion("xcfx not between", value1, value2, "xcfx");
            return (Criteria) this;
        }

        public Criteria andXcgzIsNull() {
            addCriterion("xcgz is null");
            return (Criteria) this;
        }

        public Criteria andXcgzIsNotNull() {
            addCriterion("xcgz is not null");
            return (Criteria) this;
        }

        public Criteria andXcgzEqualTo(String value) {
            addCriterion("xcgz =", value, "xcgz");
            return (Criteria) this;
        }

        public Criteria andXcgzNotEqualTo(String value) {
            addCriterion("xcgz <>", value, "xcgz");
            return (Criteria) this;
        }

        public Criteria andXcgzGreaterThan(String value) {
            addCriterion("xcgz >", value, "xcgz");
            return (Criteria) this;
        }

        public Criteria andXcgzGreaterThanOrEqualTo(String value) {
            addCriterion("xcgz >=", value, "xcgz");
            return (Criteria) this;
        }

        public Criteria andXcgzLessThan(String value) {
            addCriterion("xcgz <", value, "xcgz");
            return (Criteria) this;
        }

        public Criteria andXcgzLessThanOrEqualTo(String value) {
            addCriterion("xcgz <=", value, "xcgz");
            return (Criteria) this;
        }

        public Criteria andXcgzLike(String value) {
            addCriterion("xcgz like", value, "xcgz");
            return (Criteria) this;
        }

        public Criteria andXcgzNotLike(String value) {
            addCriterion("xcgz not like", value, "xcgz");
            return (Criteria) this;
        }

        public Criteria andXcgzIn(List<String> values) {
            addCriterion("xcgz in", values, "xcgz");
            return (Criteria) this;
        }

        public Criteria andXcgzNotIn(List<String> values) {
            addCriterion("xcgz not in", values, "xcgz");
            return (Criteria) this;
        }

        public Criteria andXcgzBetween(String value1, String value2) {
            addCriterion("xcgz between", value1, value2, "xcgz");
            return (Criteria) this;
        }

        public Criteria andXcgzNotBetween(String value1, String value2) {
            addCriterion("xcgz not between", value1, value2, "xcgz");
            return (Criteria) this;
        }

        public Criteria andXczkIsNull() {
            addCriterion("xczk is null");
            return (Criteria) this;
        }

        public Criteria andXczkIsNotNull() {
            addCriterion("xczk is not null");
            return (Criteria) this;
        }

        public Criteria andXczkEqualTo(String value) {
            addCriterion("xczk =", value, "xczk");
            return (Criteria) this;
        }

        public Criteria andXczkNotEqualTo(String value) {
            addCriterion("xczk <>", value, "xczk");
            return (Criteria) this;
        }

        public Criteria andXczkGreaterThan(String value) {
            addCriterion("xczk >", value, "xczk");
            return (Criteria) this;
        }

        public Criteria andXczkGreaterThanOrEqualTo(String value) {
            addCriterion("xczk >=", value, "xczk");
            return (Criteria) this;
        }

        public Criteria andXczkLessThan(String value) {
            addCriterion("xczk <", value, "xczk");
            return (Criteria) this;
        }

        public Criteria andXczkLessThanOrEqualTo(String value) {
            addCriterion("xczk <=", value, "xczk");
            return (Criteria) this;
        }

        public Criteria andXczkLike(String value) {
            addCriterion("xczk like", value, "xczk");
            return (Criteria) this;
        }

        public Criteria andXczkNotLike(String value) {
            addCriterion("xczk not like", value, "xczk");
            return (Criteria) this;
        }

        public Criteria andXczkIn(List<String> values) {
            addCriterion("xczk in", values, "xczk");
            return (Criteria) this;
        }

        public Criteria andXczkNotIn(List<String> values) {
            addCriterion("xczk not in", values, "xczk");
            return (Criteria) this;
        }

        public Criteria andXczkBetween(String value1, String value2) {
            addCriterion("xczk between", value1, value2, "xczk");
            return (Criteria) this;
        }

        public Criteria andXczkNotBetween(String value1, String value2) {
            addCriterion("xczk not between", value1, value2, "xczk");
            return (Criteria) this;
        }

        public Criteria andBhFlagIsNull() {
            addCriterion("bh_flag is null");
            return (Criteria) this;
        }

        public Criteria andBhFlagIsNotNull() {
            addCriterion("bh_flag is not null");
            return (Criteria) this;
        }

        public Criteria andBhFlagEqualTo(Integer value) {
            addCriterion("bh_flag =", value, "bhFlag");
            return (Criteria) this;
        }

        public Criteria andBhFlagNotEqualTo(Integer value) {
            addCriterion("bh_flag <>", value, "bhFlag");
            return (Criteria) this;
        }

        public Criteria andBhFlagGreaterThan(Integer value) {
            addCriterion("bh_flag >", value, "bhFlag");
            return (Criteria) this;
        }

        public Criteria andBhFlagGreaterThanOrEqualTo(Integer value) {
            addCriterion("bh_flag >=", value, "bhFlag");
            return (Criteria) this;
        }

        public Criteria andBhFlagLessThan(Integer value) {
            addCriterion("bh_flag <", value, "bhFlag");
            return (Criteria) this;
        }

        public Criteria andBhFlagLessThanOrEqualTo(Integer value) {
            addCriterion("bh_flag <=", value, "bhFlag");
            return (Criteria) this;
        }

        public Criteria andBhFlagIn(List<Integer> values) {
            addCriterion("bh_flag in", values, "bhFlag");
            return (Criteria) this;
        }

        public Criteria andBhFlagNotIn(List<Integer> values) {
            addCriterion("bh_flag not in", values, "bhFlag");
            return (Criteria) this;
        }

        public Criteria andBhFlagBetween(Integer value1, Integer value2) {
            addCriterion("bh_flag between", value1, value2, "bhFlag");
            return (Criteria) this;
        }

        public Criteria andBhFlagNotBetween(Integer value1, Integer value2) {
            addCriterion("bh_flag not between", value1, value2, "bhFlag");
            return (Criteria) this;
        }

        public Criteria andBhrIdIsNull() {
            addCriterion("bhr_id is null");
            return (Criteria) this;
        }

        public Criteria andBhrIdIsNotNull() {
            addCriterion("bhr_id is not null");
            return (Criteria) this;
        }

        public Criteria andBhrIdEqualTo(String value) {
            addCriterion("bhr_id =", value, "bhrId");
            return (Criteria) this;
        }

        public Criteria andBhrIdNotEqualTo(String value) {
            addCriterion("bhr_id <>", value, "bhrId");
            return (Criteria) this;
        }

        public Criteria andBhrIdGreaterThan(String value) {
            addCriterion("bhr_id >", value, "bhrId");
            return (Criteria) this;
        }

        public Criteria andBhrIdGreaterThanOrEqualTo(String value) {
            addCriterion("bhr_id >=", value, "bhrId");
            return (Criteria) this;
        }

        public Criteria andBhrIdLessThan(String value) {
            addCriterion("bhr_id <", value, "bhrId");
            return (Criteria) this;
        }

        public Criteria andBhrIdLessThanOrEqualTo(String value) {
            addCriterion("bhr_id <=", value, "bhrId");
            return (Criteria) this;
        }

        public Criteria andBhrIdLike(String value) {
            addCriterion("bhr_id like", value, "bhrId");
            return (Criteria) this;
        }

        public Criteria andBhrIdNotLike(String value) {
            addCriterion("bhr_id not like", value, "bhrId");
            return (Criteria) this;
        }

        public Criteria andBhrIdIn(List<String> values) {
            addCriterion("bhr_id in", values, "bhrId");
            return (Criteria) this;
        }

        public Criteria andBhrIdNotIn(List<String> values) {
            addCriterion("bhr_id not in", values, "bhrId");
            return (Criteria) this;
        }

        public Criteria andBhrIdBetween(String value1, String value2) {
            addCriterion("bhr_id between", value1, value2, "bhrId");
            return (Criteria) this;
        }

        public Criteria andBhrIdNotBetween(String value1, String value2) {
            addCriterion("bhr_id not between", value1, value2, "bhrId");
            return (Criteria) this;
        }

        public Criteria andBhrNameIsNull() {
            addCriterion("bhr_name is null");
            return (Criteria) this;
        }

        public Criteria andBhrNameIsNotNull() {
            addCriterion("bhr_name is not null");
            return (Criteria) this;
        }

        public Criteria andBhrNameEqualTo(String value) {
            addCriterion("bhr_name =", value, "bhrName");
            return (Criteria) this;
        }

        public Criteria andBhrNameNotEqualTo(String value) {
            addCriterion("bhr_name <>", value, "bhrName");
            return (Criteria) this;
        }

        public Criteria andBhrNameGreaterThan(String value) {
            addCriterion("bhr_name >", value, "bhrName");
            return (Criteria) this;
        }

        public Criteria andBhrNameGreaterThanOrEqualTo(String value) {
            addCriterion("bhr_name >=", value, "bhrName");
            return (Criteria) this;
        }

        public Criteria andBhrNameLessThan(String value) {
            addCriterion("bhr_name <", value, "bhrName");
            return (Criteria) this;
        }

        public Criteria andBhrNameLessThanOrEqualTo(String value) {
            addCriterion("bhr_name <=", value, "bhrName");
            return (Criteria) this;
        }

        public Criteria andBhrNameLike(String value) {
            addCriterion("bhr_name like", value, "bhrName");
            return (Criteria) this;
        }

        public Criteria andBhrNameNotLike(String value) {
            addCriterion("bhr_name not like", value, "bhrName");
            return (Criteria) this;
        }

        public Criteria andBhrNameIn(List<String> values) {
            addCriterion("bhr_name in", values, "bhrName");
            return (Criteria) this;
        }

        public Criteria andBhrNameNotIn(List<String> values) {
            addCriterion("bhr_name not in", values, "bhrName");
            return (Criteria) this;
        }

        public Criteria andBhrNameBetween(String value1, String value2) {
            addCriterion("bhr_name between", value1, value2, "bhrName");
            return (Criteria) this;
        }

        public Criteria andBhrNameNotBetween(String value1, String value2) {
            addCriterion("bhr_name not between", value1, value2, "bhrName");
            return (Criteria) this;
        }

        public Criteria andBhrUnitIdIsNull() {
            addCriterion("bhr_unit_id is null");
            return (Criteria) this;
        }

        public Criteria andBhrUnitIdIsNotNull() {
            addCriterion("bhr_unit_id is not null");
            return (Criteria) this;
        }

        public Criteria andBhrUnitIdEqualTo(String value) {
            addCriterion("bhr_unit_id =", value, "bhrUnitId");
            return (Criteria) this;
        }

        public Criteria andBhrUnitIdNotEqualTo(String value) {
            addCriterion("bhr_unit_id <>", value, "bhrUnitId");
            return (Criteria) this;
        }

        public Criteria andBhrUnitIdGreaterThan(String value) {
            addCriterion("bhr_unit_id >", value, "bhrUnitId");
            return (Criteria) this;
        }

        public Criteria andBhrUnitIdGreaterThanOrEqualTo(String value) {
            addCriterion("bhr_unit_id >=", value, "bhrUnitId");
            return (Criteria) this;
        }

        public Criteria andBhrUnitIdLessThan(String value) {
            addCriterion("bhr_unit_id <", value, "bhrUnitId");
            return (Criteria) this;
        }

        public Criteria andBhrUnitIdLessThanOrEqualTo(String value) {
            addCriterion("bhr_unit_id <=", value, "bhrUnitId");
            return (Criteria) this;
        }

        public Criteria andBhrUnitIdLike(String value) {
            addCriterion("bhr_unit_id like", value, "bhrUnitId");
            return (Criteria) this;
        }

        public Criteria andBhrUnitIdNotLike(String value) {
            addCriterion("bhr_unit_id not like", value, "bhrUnitId");
            return (Criteria) this;
        }

        public Criteria andBhrUnitIdIn(List<String> values) {
            addCriterion("bhr_unit_id in", values, "bhrUnitId");
            return (Criteria) this;
        }

        public Criteria andBhrUnitIdNotIn(List<String> values) {
            addCriterion("bhr_unit_id not in", values, "bhrUnitId");
            return (Criteria) this;
        }

        public Criteria andBhrUnitIdBetween(String value1, String value2) {
            addCriterion("bhr_unit_id between", value1, value2, "bhrUnitId");
            return (Criteria) this;
        }

        public Criteria andBhrUnitIdNotBetween(String value1, String value2) {
            addCriterion("bhr_unit_id not between", value1, value2, "bhrUnitId");
            return (Criteria) this;
        }

        public Criteria andBhrUnitNameIsNull() {
            addCriterion("bhr_unit_name is null");
            return (Criteria) this;
        }

        public Criteria andBhrUnitNameIsNotNull() {
            addCriterion("bhr_unit_name is not null");
            return (Criteria) this;
        }

        public Criteria andBhrUnitNameEqualTo(String value) {
            addCriterion("bhr_unit_name =", value, "bhrUnitName");
            return (Criteria) this;
        }

        public Criteria andBhrUnitNameNotEqualTo(String value) {
            addCriterion("bhr_unit_name <>", value, "bhrUnitName");
            return (Criteria) this;
        }

        public Criteria andBhrUnitNameGreaterThan(String value) {
            addCriterion("bhr_unit_name >", value, "bhrUnitName");
            return (Criteria) this;
        }

        public Criteria andBhrUnitNameGreaterThanOrEqualTo(String value) {
            addCriterion("bhr_unit_name >=", value, "bhrUnitName");
            return (Criteria) this;
        }

        public Criteria andBhrUnitNameLessThan(String value) {
            addCriterion("bhr_unit_name <", value, "bhrUnitName");
            return (Criteria) this;
        }

        public Criteria andBhrUnitNameLessThanOrEqualTo(String value) {
            addCriterion("bhr_unit_name <=", value, "bhrUnitName");
            return (Criteria) this;
        }

        public Criteria andBhrUnitNameLike(String value) {
            addCriterion("bhr_unit_name like", value, "bhrUnitName");
            return (Criteria) this;
        }

        public Criteria andBhrUnitNameNotLike(String value) {
            addCriterion("bhr_unit_name not like", value, "bhrUnitName");
            return (Criteria) this;
        }

        public Criteria andBhrUnitNameIn(List<String> values) {
            addCriterion("bhr_unit_name in", values, "bhrUnitName");
            return (Criteria) this;
        }

        public Criteria andBhrUnitNameNotIn(List<String> values) {
            addCriterion("bhr_unit_name not in", values, "bhrUnitName");
            return (Criteria) this;
        }

        public Criteria andBhrUnitNameBetween(String value1, String value2) {
            addCriterion("bhr_unit_name between", value1, value2, "bhrUnitName");
            return (Criteria) this;
        }

        public Criteria andBhrUnitNameNotBetween(String value1, String value2) {
            addCriterion("bhr_unit_name not between", value1, value2, "bhrUnitName");
            return (Criteria) this;
        }

        public Criteria andBhrZwIsNull() {
            addCriterion("bhr_zw is null");
            return (Criteria) this;
        }

        public Criteria andBhrZwIsNotNull() {
            addCriterion("bhr_zw is not null");
            return (Criteria) this;
        }

        public Criteria andBhrZwEqualTo(String value) {
            addCriterion("bhr_zw =", value, "bhrZw");
            return (Criteria) this;
        }

        public Criteria andBhrZwNotEqualTo(String value) {
            addCriterion("bhr_zw <>", value, "bhrZw");
            return (Criteria) this;
        }

        public Criteria andBhrZwGreaterThan(String value) {
            addCriterion("bhr_zw >", value, "bhrZw");
            return (Criteria) this;
        }

        public Criteria andBhrZwGreaterThanOrEqualTo(String value) {
            addCriterion("bhr_zw >=", value, "bhrZw");
            return (Criteria) this;
        }

        public Criteria andBhrZwLessThan(String value) {
            addCriterion("bhr_zw <", value, "bhrZw");
            return (Criteria) this;
        }

        public Criteria andBhrZwLessThanOrEqualTo(String value) {
            addCriterion("bhr_zw <=", value, "bhrZw");
            return (Criteria) this;
        }

        public Criteria andBhrZwLike(String value) {
            addCriterion("bhr_zw like", value, "bhrZw");
            return (Criteria) this;
        }

        public Criteria andBhrZwNotLike(String value) {
            addCriterion("bhr_zw not like", value, "bhrZw");
            return (Criteria) this;
        }

        public Criteria andBhrZwIn(List<String> values) {
            addCriterion("bhr_zw in", values, "bhrZw");
            return (Criteria) this;
        }

        public Criteria andBhrZwNotIn(List<String> values) {
            addCriterion("bhr_zw not in", values, "bhrZw");
            return (Criteria) this;
        }

        public Criteria andBhrZwBetween(String value1, String value2) {
            addCriterion("bhr_zw between", value1, value2, "bhrZw");
            return (Criteria) this;
        }

        public Criteria andBhrZwNotBetween(String value1, String value2) {
            addCriterion("bhr_zw not between", value1, value2, "bhrZw");
            return (Criteria) this;
        }

        public Criteria andBdyyIsNull() {
            addCriterion("bdyy is null");
            return (Criteria) this;
        }

        public Criteria andBdyyIsNotNull() {
            addCriterion("bdyy is not null");
            return (Criteria) this;
        }

        public Criteria andBdyyEqualTo(String value) {
            addCriterion("bdyy =", value, "bdyy");
            return (Criteria) this;
        }

        public Criteria andBdyyNotEqualTo(String value) {
            addCriterion("bdyy <>", value, "bdyy");
            return (Criteria) this;
        }

        public Criteria andBdyyGreaterThan(String value) {
            addCriterion("bdyy >", value, "bdyy");
            return (Criteria) this;
        }

        public Criteria andBdyyGreaterThanOrEqualTo(String value) {
            addCriterion("bdyy >=", value, "bdyy");
            return (Criteria) this;
        }

        public Criteria andBdyyLessThan(String value) {
            addCriterion("bdyy <", value, "bdyy");
            return (Criteria) this;
        }

        public Criteria andBdyyLessThanOrEqualTo(String value) {
            addCriterion("bdyy <=", value, "bdyy");
            return (Criteria) this;
        }

        public Criteria andBdyyLike(String value) {
            addCriterion("bdyy like", value, "bdyy");
            return (Criteria) this;
        }

        public Criteria andBdyyNotLike(String value) {
            addCriterion("bdyy not like", value, "bdyy");
            return (Criteria) this;
        }

        public Criteria andBdyyIn(List<String> values) {
            addCriterion("bdyy in", values, "bdyy");
            return (Criteria) this;
        }

        public Criteria andBdyyNotIn(List<String> values) {
            addCriterion("bdyy not in", values, "bdyy");
            return (Criteria) this;
        }

        public Criteria andBdyyBetween(String value1, String value2) {
            addCriterion("bdyy between", value1, value2, "bdyy");
            return (Criteria) this;
        }

        public Criteria andBdyyNotBetween(String value1, String value2) {
            addCriterion("bdyy not between", value1, value2, "bdyy");
            return (Criteria) this;
        }

        public Criteria andBhfsIsNull() {
            addCriterion("bhfs is null");
            return (Criteria) this;
        }

        public Criteria andBhfsIsNotNull() {
            addCriterion("bhfs is not null");
            return (Criteria) this;
        }

        public Criteria andBhfsEqualTo(String value) {
            addCriterion("bhfs =", value, "bhfs");
            return (Criteria) this;
        }

        public Criteria andBhfsNotEqualTo(String value) {
            addCriterion("bhfs <>", value, "bhfs");
            return (Criteria) this;
        }

        public Criteria andBhfsGreaterThan(String value) {
            addCriterion("bhfs >", value, "bhfs");
            return (Criteria) this;
        }

        public Criteria andBhfsGreaterThanOrEqualTo(String value) {
            addCriterion("bhfs >=", value, "bhfs");
            return (Criteria) this;
        }

        public Criteria andBhfsLessThan(String value) {
            addCriterion("bhfs <", value, "bhfs");
            return (Criteria) this;
        }

        public Criteria andBhfsLessThanOrEqualTo(String value) {
            addCriterion("bhfs <=", value, "bhfs");
            return (Criteria) this;
        }

        public Criteria andBhfsLike(String value) {
            addCriterion("bhfs like", value, "bhfs");
            return (Criteria) this;
        }

        public Criteria andBhfsNotLike(String value) {
            addCriterion("bhfs not like", value, "bhfs");
            return (Criteria) this;
        }

        public Criteria andBhfsIn(List<String> values) {
            addCriterion("bhfs in", values, "bhfs");
            return (Criteria) this;
        }

        public Criteria andBhfsNotIn(List<String> values) {
            addCriterion("bhfs not in", values, "bhfs");
            return (Criteria) this;
        }

        public Criteria andBhfsBetween(String value1, String value2) {
            addCriterion("bhfs between", value1, value2, "bhfs");
            return (Criteria) this;
        }

        public Criteria andBhfsNotBetween(String value1, String value2) {
            addCriterion("bhfs not between", value1, value2, "bhfs");
            return (Criteria) this;
        }

        public Criteria andXcEastIsNull() {
            addCriterion("xc_east is null");
            return (Criteria) this;
        }

        public Criteria andXcEastIsNotNull() {
            addCriterion("xc_east is not null");
            return (Criteria) this;
        }

        public Criteria andXcEastEqualTo(String value) {
            addCriterion("xc_east =", value, "xcEast");
            return (Criteria) this;
        }

        public Criteria andXcEastNotEqualTo(String value) {
            addCriterion("xc_east <>", value, "xcEast");
            return (Criteria) this;
        }

        public Criteria andXcEastGreaterThan(String value) {
            addCriterion("xc_east >", value, "xcEast");
            return (Criteria) this;
        }

        public Criteria andXcEastGreaterThanOrEqualTo(String value) {
            addCriterion("xc_east >=", value, "xcEast");
            return (Criteria) this;
        }

        public Criteria andXcEastLessThan(String value) {
            addCriterion("xc_east <", value, "xcEast");
            return (Criteria) this;
        }

        public Criteria andXcEastLessThanOrEqualTo(String value) {
            addCriterion("xc_east <=", value, "xcEast");
            return (Criteria) this;
        }

        public Criteria andXcEastLike(String value) {
            addCriterion("xc_east like", value, "xcEast");
            return (Criteria) this;
        }

        public Criteria andXcEastNotLike(String value) {
            addCriterion("xc_east not like", value, "xcEast");
            return (Criteria) this;
        }

        public Criteria andXcEastIn(List<String> values) {
            addCriterion("xc_east in", values, "xcEast");
            return (Criteria) this;
        }

        public Criteria andXcEastNotIn(List<String> values) {
            addCriterion("xc_east not in", values, "xcEast");
            return (Criteria) this;
        }

        public Criteria andXcEastBetween(String value1, String value2) {
            addCriterion("xc_east between", value1, value2, "xcEast");
            return (Criteria) this;
        }

        public Criteria andXcEastNotBetween(String value1, String value2) {
            addCriterion("xc_east not between", value1, value2, "xcEast");
            return (Criteria) this;
        }

        public Criteria andXcWestIsNull() {
            addCriterion("xc_west is null");
            return (Criteria) this;
        }

        public Criteria andXcWestIsNotNull() {
            addCriterion("xc_west is not null");
            return (Criteria) this;
        }

        public Criteria andXcWestEqualTo(String value) {
            addCriterion("xc_west =", value, "xcWest");
            return (Criteria) this;
        }

        public Criteria andXcWestNotEqualTo(String value) {
            addCriterion("xc_west <>", value, "xcWest");
            return (Criteria) this;
        }

        public Criteria andXcWestGreaterThan(String value) {
            addCriterion("xc_west >", value, "xcWest");
            return (Criteria) this;
        }

        public Criteria andXcWestGreaterThanOrEqualTo(String value) {
            addCriterion("xc_west >=", value, "xcWest");
            return (Criteria) this;
        }

        public Criteria andXcWestLessThan(String value) {
            addCriterion("xc_west <", value, "xcWest");
            return (Criteria) this;
        }

        public Criteria andXcWestLessThanOrEqualTo(String value) {
            addCriterion("xc_west <=", value, "xcWest");
            return (Criteria) this;
        }

        public Criteria andXcWestLike(String value) {
            addCriterion("xc_west like", value, "xcWest");
            return (Criteria) this;
        }

        public Criteria andXcWestNotLike(String value) {
            addCriterion("xc_west not like", value, "xcWest");
            return (Criteria) this;
        }

        public Criteria andXcWestIn(List<String> values) {
            addCriterion("xc_west in", values, "xcWest");
            return (Criteria) this;
        }

        public Criteria andXcWestNotIn(List<String> values) {
            addCriterion("xc_west not in", values, "xcWest");
            return (Criteria) this;
        }

        public Criteria andXcWestBetween(String value1, String value2) {
            addCriterion("xc_west between", value1, value2, "xcWest");
            return (Criteria) this;
        }

        public Criteria andXcWestNotBetween(String value1, String value2) {
            addCriterion("xc_west not between", value1, value2, "xcWest");
            return (Criteria) this;
        }

        public Criteria andXcSouthIsNull() {
            addCriterion("xc_south is null");
            return (Criteria) this;
        }

        public Criteria andXcSouthIsNotNull() {
            addCriterion("xc_south is not null");
            return (Criteria) this;
        }

        public Criteria andXcSouthEqualTo(String value) {
            addCriterion("xc_south =", value, "xcSouth");
            return (Criteria) this;
        }

        public Criteria andXcSouthNotEqualTo(String value) {
            addCriterion("xc_south <>", value, "xcSouth");
            return (Criteria) this;
        }

        public Criteria andXcSouthGreaterThan(String value) {
            addCriterion("xc_south >", value, "xcSouth");
            return (Criteria) this;
        }

        public Criteria andXcSouthGreaterThanOrEqualTo(String value) {
            addCriterion("xc_south >=", value, "xcSouth");
            return (Criteria) this;
        }

        public Criteria andXcSouthLessThan(String value) {
            addCriterion("xc_south <", value, "xcSouth");
            return (Criteria) this;
        }

        public Criteria andXcSouthLessThanOrEqualTo(String value) {
            addCriterion("xc_south <=", value, "xcSouth");
            return (Criteria) this;
        }

        public Criteria andXcSouthLike(String value) {
            addCriterion("xc_south like", value, "xcSouth");
            return (Criteria) this;
        }

        public Criteria andXcSouthNotLike(String value) {
            addCriterion("xc_south not like", value, "xcSouth");
            return (Criteria) this;
        }

        public Criteria andXcSouthIn(List<String> values) {
            addCriterion("xc_south in", values, "xcSouth");
            return (Criteria) this;
        }

        public Criteria andXcSouthNotIn(List<String> values) {
            addCriterion("xc_south not in", values, "xcSouth");
            return (Criteria) this;
        }

        public Criteria andXcSouthBetween(String value1, String value2) {
            addCriterion("xc_south between", value1, value2, "xcSouth");
            return (Criteria) this;
        }

        public Criteria andXcSouthNotBetween(String value1, String value2) {
            addCriterion("xc_south not between", value1, value2, "xcSouth");
            return (Criteria) this;
        }

        public Criteria andXcNorthIsNull() {
            addCriterion("xc_north is null");
            return (Criteria) this;
        }

        public Criteria andXcNorthIsNotNull() {
            addCriterion("xc_north is not null");
            return (Criteria) this;
        }

        public Criteria andXcNorthEqualTo(String value) {
            addCriterion("xc_north =", value, "xcNorth");
            return (Criteria) this;
        }

        public Criteria andXcNorthNotEqualTo(String value) {
            addCriterion("xc_north <>", value, "xcNorth");
            return (Criteria) this;
        }

        public Criteria andXcNorthGreaterThan(String value) {
            addCriterion("xc_north >", value, "xcNorth");
            return (Criteria) this;
        }

        public Criteria andXcNorthGreaterThanOrEqualTo(String value) {
            addCriterion("xc_north >=", value, "xcNorth");
            return (Criteria) this;
        }

        public Criteria andXcNorthLessThan(String value) {
            addCriterion("xc_north <", value, "xcNorth");
            return (Criteria) this;
        }

        public Criteria andXcNorthLessThanOrEqualTo(String value) {
            addCriterion("xc_north <=", value, "xcNorth");
            return (Criteria) this;
        }

        public Criteria andXcNorthLike(String value) {
            addCriterion("xc_north like", value, "xcNorth");
            return (Criteria) this;
        }

        public Criteria andXcNorthNotLike(String value) {
            addCriterion("xc_north not like", value, "xcNorth");
            return (Criteria) this;
        }

        public Criteria andXcNorthIn(List<String> values) {
            addCriterion("xc_north in", values, "xcNorth");
            return (Criteria) this;
        }

        public Criteria andXcNorthNotIn(List<String> values) {
            addCriterion("xc_north not in", values, "xcNorth");
            return (Criteria) this;
        }

        public Criteria andXcNorthBetween(String value1, String value2) {
            addCriterion("xc_north between", value1, value2, "xcNorth");
            return (Criteria) this;
        }

        public Criteria andXcNorthNotBetween(String value1, String value2) {
            addCriterion("xc_north not between", value1, value2, "xcNorth");
            return (Criteria) this;
        }

        public Criteria andJzrNameIsNull() {
            addCriterion("jzr_name is null");
            return (Criteria) this;
        }

        public Criteria andJzrNameIsNotNull() {
            addCriterion("jzr_name is not null");
            return (Criteria) this;
        }

        public Criteria andJzrNameEqualTo(String value) {
            addCriterion("jzr_name =", value, "jzrName");
            return (Criteria) this;
        }

        public Criteria andJzrNameNotEqualTo(String value) {
            addCriterion("jzr_name <>", value, "jzrName");
            return (Criteria) this;
        }

        public Criteria andJzrNameGreaterThan(String value) {
            addCriterion("jzr_name >", value, "jzrName");
            return (Criteria) this;
        }

        public Criteria andJzrNameGreaterThanOrEqualTo(String value) {
            addCriterion("jzr_name >=", value, "jzrName");
            return (Criteria) this;
        }

        public Criteria andJzrNameLessThan(String value) {
            addCriterion("jzr_name <", value, "jzrName");
            return (Criteria) this;
        }

        public Criteria andJzrNameLessThanOrEqualTo(String value) {
            addCriterion("jzr_name <=", value, "jzrName");
            return (Criteria) this;
        }

        public Criteria andJzrNameLike(String value) {
            addCriterion("jzr_name like", value, "jzrName");
            return (Criteria) this;
        }

        public Criteria andJzrNameNotLike(String value) {
            addCriterion("jzr_name not like", value, "jzrName");
            return (Criteria) this;
        }

        public Criteria andJzrNameIn(List<String> values) {
            addCriterion("jzr_name in", values, "jzrName");
            return (Criteria) this;
        }

        public Criteria andJzrNameNotIn(List<String> values) {
            addCriterion("jzr_name not in", values, "jzrName");
            return (Criteria) this;
        }

        public Criteria andJzrNameBetween(String value1, String value2) {
            addCriterion("jzr_name between", value1, value2, "jzrName");
            return (Criteria) this;
        }

        public Criteria andJzrNameNotBetween(String value1, String value2) {
            addCriterion("jzr_name not between", value1, value2, "jzrName");
            return (Criteria) this;
        }

        public Criteria andJzrSexIsNull() {
            addCriterion("jzr_sex is null");
            return (Criteria) this;
        }

        public Criteria andJzrSexIsNotNull() {
            addCriterion("jzr_sex is not null");
            return (Criteria) this;
        }

        public Criteria andJzrSexEqualTo(String value) {
            addCriterion("jzr_sex =", value, "jzrSex");
            return (Criteria) this;
        }

        public Criteria andJzrSexNotEqualTo(String value) {
            addCriterion("jzr_sex <>", value, "jzrSex");
            return (Criteria) this;
        }

        public Criteria andJzrSexGreaterThan(String value) {
            addCriterion("jzr_sex >", value, "jzrSex");
            return (Criteria) this;
        }

        public Criteria andJzrSexGreaterThanOrEqualTo(String value) {
            addCriterion("jzr_sex >=", value, "jzrSex");
            return (Criteria) this;
        }

        public Criteria andJzrSexLessThan(String value) {
            addCriterion("jzr_sex <", value, "jzrSex");
            return (Criteria) this;
        }

        public Criteria andJzrSexLessThanOrEqualTo(String value) {
            addCriterion("jzr_sex <=", value, "jzrSex");
            return (Criteria) this;
        }

        public Criteria andJzrSexLike(String value) {
            addCriterion("jzr_sex like", value, "jzrSex");
            return (Criteria) this;
        }

        public Criteria andJzrSexNotLike(String value) {
            addCriterion("jzr_sex not like", value, "jzrSex");
            return (Criteria) this;
        }

        public Criteria andJzrSexIn(List<String> values) {
            addCriterion("jzr_sex in", values, "jzrSex");
            return (Criteria) this;
        }

        public Criteria andJzrSexNotIn(List<String> values) {
            addCriterion("jzr_sex not in", values, "jzrSex");
            return (Criteria) this;
        }

        public Criteria andJzrSexBetween(String value1, String value2) {
            addCriterion("jzr_sex between", value1, value2, "jzrSex");
            return (Criteria) this;
        }

        public Criteria andJzrSexNotBetween(String value1, String value2) {
            addCriterion("jzr_sex not between", value1, value2, "jzrSex");
            return (Criteria) this;
        }

        public Criteria andJzrBirthIsNull() {
            addCriterion("jzr_birth is null");
            return (Criteria) this;
        }

        public Criteria andJzrBirthIsNotNull() {
            addCriterion("jzr_birth is not null");
            return (Criteria) this;
        }

        public Criteria andJzrBirthEqualTo(String value) {
            addCriterion("jzr_birth =", value, "jzrBirth");
            return (Criteria) this;
        }

        public Criteria andJzrBirthNotEqualTo(String value) {
            addCriterion("jzr_birth <>", value, "jzrBirth");
            return (Criteria) this;
        }

        public Criteria andJzrBirthGreaterThan(String value) {
            addCriterion("jzr_birth >", value, "jzrBirth");
            return (Criteria) this;
        }

        public Criteria andJzrBirthGreaterThanOrEqualTo(String value) {
            addCriterion("jzr_birth >=", value, "jzrBirth");
            return (Criteria) this;
        }

        public Criteria andJzrBirthLessThan(String value) {
            addCriterion("jzr_birth <", value, "jzrBirth");
            return (Criteria) this;
        }

        public Criteria andJzrBirthLessThanOrEqualTo(String value) {
            addCriterion("jzr_birth <=", value, "jzrBirth");
            return (Criteria) this;
        }

        public Criteria andJzrBirthLike(String value) {
            addCriterion("jzr_birth like", value, "jzrBirth");
            return (Criteria) this;
        }

        public Criteria andJzrBirthNotLike(String value) {
            addCriterion("jzr_birth not like", value, "jzrBirth");
            return (Criteria) this;
        }

        public Criteria andJzrBirthIn(List<String> values) {
            addCriterion("jzr_birth in", values, "jzrBirth");
            return (Criteria) this;
        }

        public Criteria andJzrBirthNotIn(List<String> values) {
            addCriterion("jzr_birth not in", values, "jzrBirth");
            return (Criteria) this;
        }

        public Criteria andJzrBirthBetween(String value1, String value2) {
            addCriterion("jzr_birth between", value1, value2, "jzrBirth");
            return (Criteria) this;
        }

        public Criteria andJzrBirthNotBetween(String value1, String value2) {
            addCriterion("jzr_birth not between", value1, value2, "jzrBirth");
            return (Criteria) this;
        }

        public Criteria andJzrAddressIsNull() {
            addCriterion("jzr_address is null");
            return (Criteria) this;
        }

        public Criteria andJzrAddressIsNotNull() {
            addCriterion("jzr_address is not null");
            return (Criteria) this;
        }

        public Criteria andJzrAddressEqualTo(String value) {
            addCriterion("jzr_address =", value, "jzrAddress");
            return (Criteria) this;
        }

        public Criteria andJzrAddressNotEqualTo(String value) {
            addCriterion("jzr_address <>", value, "jzrAddress");
            return (Criteria) this;
        }

        public Criteria andJzrAddressGreaterThan(String value) {
            addCriterion("jzr_address >", value, "jzrAddress");
            return (Criteria) this;
        }

        public Criteria andJzrAddressGreaterThanOrEqualTo(String value) {
            addCriterion("jzr_address >=", value, "jzrAddress");
            return (Criteria) this;
        }

        public Criteria andJzrAddressLessThan(String value) {
            addCriterion("jzr_address <", value, "jzrAddress");
            return (Criteria) this;
        }

        public Criteria andJzrAddressLessThanOrEqualTo(String value) {
            addCriterion("jzr_address <=", value, "jzrAddress");
            return (Criteria) this;
        }

        public Criteria andJzrAddressLike(String value) {
            addCriterion("jzr_address like", value, "jzrAddress");
            return (Criteria) this;
        }

        public Criteria andJzrAddressNotLike(String value) {
            addCriterion("jzr_address not like", value, "jzrAddress");
            return (Criteria) this;
        }

        public Criteria andJzrAddressIn(List<String> values) {
            addCriterion("jzr_address in", values, "jzrAddress");
            return (Criteria) this;
        }

        public Criteria andJzrAddressNotIn(List<String> values) {
            addCriterion("jzr_address not in", values, "jzrAddress");
            return (Criteria) this;
        }

        public Criteria andJzrAddressBetween(String value1, String value2) {
            addCriterion("jzr_address between", value1, value2, "jzrAddress");
            return (Criteria) this;
        }

        public Criteria andJzrAddressNotBetween(String value1, String value2) {
            addCriterion("jzr_address not between", value1, value2, "jzrAddress");
            return (Criteria) this;
        }

        public Criteria andZhrIdIsNull() {
            addCriterion("zhr_id is null");
            return (Criteria) this;
        }

        public Criteria andZhrIdIsNotNull() {
            addCriterion("zhr_id is not null");
            return (Criteria) this;
        }

        public Criteria andZhrIdEqualTo(String value) {
            addCriterion("zhr_id =", value, "zhrId");
            return (Criteria) this;
        }

        public Criteria andZhrIdNotEqualTo(String value) {
            addCriterion("zhr_id <>", value, "zhrId");
            return (Criteria) this;
        }

        public Criteria andZhrIdGreaterThan(String value) {
            addCriterion("zhr_id >", value, "zhrId");
            return (Criteria) this;
        }

        public Criteria andZhrIdGreaterThanOrEqualTo(String value) {
            addCriterion("zhr_id >=", value, "zhrId");
            return (Criteria) this;
        }

        public Criteria andZhrIdLessThan(String value) {
            addCriterion("zhr_id <", value, "zhrId");
            return (Criteria) this;
        }

        public Criteria andZhrIdLessThanOrEqualTo(String value) {
            addCriterion("zhr_id <=", value, "zhrId");
            return (Criteria) this;
        }

        public Criteria andZhrIdLike(String value) {
            addCriterion("zhr_id like", value, "zhrId");
            return (Criteria) this;
        }

        public Criteria andZhrIdNotLike(String value) {
            addCriterion("zhr_id not like", value, "zhrId");
            return (Criteria) this;
        }

        public Criteria andZhrIdIn(List<String> values) {
            addCriterion("zhr_id in", values, "zhrId");
            return (Criteria) this;
        }

        public Criteria andZhrIdNotIn(List<String> values) {
            addCriterion("zhr_id not in", values, "zhrId");
            return (Criteria) this;
        }

        public Criteria andZhrIdBetween(String value1, String value2) {
            addCriterion("zhr_id between", value1, value2, "zhrId");
            return (Criteria) this;
        }

        public Criteria andZhrIdNotBetween(String value1, String value2) {
            addCriterion("zhr_id not between", value1, value2, "zhrId");
            return (Criteria) this;
        }

        public Criteria andZhrNameIsNull() {
            addCriterion("zhr_name is null");
            return (Criteria) this;
        }

        public Criteria andZhrNameIsNotNull() {
            addCriterion("zhr_name is not null");
            return (Criteria) this;
        }

        public Criteria andZhrNameEqualTo(String value) {
            addCriterion("zhr_name =", value, "zhrName");
            return (Criteria) this;
        }

        public Criteria andZhrNameNotEqualTo(String value) {
            addCriterion("zhr_name <>", value, "zhrName");
            return (Criteria) this;
        }

        public Criteria andZhrNameGreaterThan(String value) {
            addCriterion("zhr_name >", value, "zhrName");
            return (Criteria) this;
        }

        public Criteria andZhrNameGreaterThanOrEqualTo(String value) {
            addCriterion("zhr_name >=", value, "zhrName");
            return (Criteria) this;
        }

        public Criteria andZhrNameLessThan(String value) {
            addCriterion("zhr_name <", value, "zhrName");
            return (Criteria) this;
        }

        public Criteria andZhrNameLessThanOrEqualTo(String value) {
            addCriterion("zhr_name <=", value, "zhrName");
            return (Criteria) this;
        }

        public Criteria andZhrNameLike(String value) {
            addCriterion("zhr_name like", value, "zhrName");
            return (Criteria) this;
        }

        public Criteria andZhrNameNotLike(String value) {
            addCriterion("zhr_name not like", value, "zhrName");
            return (Criteria) this;
        }

        public Criteria andZhrNameIn(List<String> values) {
            addCriterion("zhr_name in", values, "zhrName");
            return (Criteria) this;
        }

        public Criteria andZhrNameNotIn(List<String> values) {
            addCriterion("zhr_name not in", values, "zhrName");
            return (Criteria) this;
        }

        public Criteria andZhrNameBetween(String value1, String value2) {
            addCriterion("zhr_name between", value1, value2, "zhrName");
            return (Criteria) this;
        }

        public Criteria andZhrNameNotBetween(String value1, String value2) {
            addCriterion("zhr_name not between", value1, value2, "zhrName");
            return (Criteria) this;
        }

        public Criteria andZhrUnitIdIsNull() {
            addCriterion("zhr_unit_id is null");
            return (Criteria) this;
        }

        public Criteria andZhrUnitIdIsNotNull() {
            addCriterion("zhr_unit_id is not null");
            return (Criteria) this;
        }

        public Criteria andZhrUnitIdEqualTo(String value) {
            addCriterion("zhr_unit_id =", value, "zhrUnitId");
            return (Criteria) this;
        }

        public Criteria andZhrUnitIdNotEqualTo(String value) {
            addCriterion("zhr_unit_id <>", value, "zhrUnitId");
            return (Criteria) this;
        }

        public Criteria andZhrUnitIdGreaterThan(String value) {
            addCriterion("zhr_unit_id >", value, "zhrUnitId");
            return (Criteria) this;
        }

        public Criteria andZhrUnitIdGreaterThanOrEqualTo(String value) {
            addCriterion("zhr_unit_id >=", value, "zhrUnitId");
            return (Criteria) this;
        }

        public Criteria andZhrUnitIdLessThan(String value) {
            addCriterion("zhr_unit_id <", value, "zhrUnitId");
            return (Criteria) this;
        }

        public Criteria andZhrUnitIdLessThanOrEqualTo(String value) {
            addCriterion("zhr_unit_id <=", value, "zhrUnitId");
            return (Criteria) this;
        }

        public Criteria andZhrUnitIdLike(String value) {
            addCriterion("zhr_unit_id like", value, "zhrUnitId");
            return (Criteria) this;
        }

        public Criteria andZhrUnitIdNotLike(String value) {
            addCriterion("zhr_unit_id not like", value, "zhrUnitId");
            return (Criteria) this;
        }

        public Criteria andZhrUnitIdIn(List<String> values) {
            addCriterion("zhr_unit_id in", values, "zhrUnitId");
            return (Criteria) this;
        }

        public Criteria andZhrUnitIdNotIn(List<String> values) {
            addCriterion("zhr_unit_id not in", values, "zhrUnitId");
            return (Criteria) this;
        }

        public Criteria andZhrUnitIdBetween(String value1, String value2) {
            addCriterion("zhr_unit_id between", value1, value2, "zhrUnitId");
            return (Criteria) this;
        }

        public Criteria andZhrUnitIdNotBetween(String value1, String value2) {
            addCriterion("zhr_unit_id not between", value1, value2, "zhrUnitId");
            return (Criteria) this;
        }

        public Criteria andZhrUnitNameIsNull() {
            addCriterion("zhr_unit_name is null");
            return (Criteria) this;
        }

        public Criteria andZhrUnitNameIsNotNull() {
            addCriterion("zhr_unit_name is not null");
            return (Criteria) this;
        }

        public Criteria andZhrUnitNameEqualTo(String value) {
            addCriterion("zhr_unit_name =", value, "zhrUnitName");
            return (Criteria) this;
        }

        public Criteria andZhrUnitNameNotEqualTo(String value) {
            addCriterion("zhr_unit_name <>", value, "zhrUnitName");
            return (Criteria) this;
        }

        public Criteria andZhrUnitNameGreaterThan(String value) {
            addCriterion("zhr_unit_name >", value, "zhrUnitName");
            return (Criteria) this;
        }

        public Criteria andZhrUnitNameGreaterThanOrEqualTo(String value) {
            addCriterion("zhr_unit_name >=", value, "zhrUnitName");
            return (Criteria) this;
        }

        public Criteria andZhrUnitNameLessThan(String value) {
            addCriterion("zhr_unit_name <", value, "zhrUnitName");
            return (Criteria) this;
        }

        public Criteria andZhrUnitNameLessThanOrEqualTo(String value) {
            addCriterion("zhr_unit_name <=", value, "zhrUnitName");
            return (Criteria) this;
        }

        public Criteria andZhrUnitNameLike(String value) {
            addCriterion("zhr_unit_name like", value, "zhrUnitName");
            return (Criteria) this;
        }

        public Criteria andZhrUnitNameNotLike(String value) {
            addCriterion("zhr_unit_name not like", value, "zhrUnitName");
            return (Criteria) this;
        }

        public Criteria andZhrUnitNameIn(List<String> values) {
            addCriterion("zhr_unit_name in", values, "zhrUnitName");
            return (Criteria) this;
        }

        public Criteria andZhrUnitNameNotIn(List<String> values) {
            addCriterion("zhr_unit_name not in", values, "zhrUnitName");
            return (Criteria) this;
        }

        public Criteria andZhrUnitNameBetween(String value1, String value2) {
            addCriterion("zhr_unit_name between", value1, value2, "zhrUnitName");
            return (Criteria) this;
        }

        public Criteria andZhrUnitNameNotBetween(String value1, String value2) {
            addCriterion("zhr_unit_name not between", value1, value2, "zhrUnitName");
            return (Criteria) this;
        }

        public Criteria andZhrZwIsNull() {
            addCriterion("zhr_zw is null");
            return (Criteria) this;
        }

        public Criteria andZhrZwIsNotNull() {
            addCriterion("zhr_zw is not null");
            return (Criteria) this;
        }

        public Criteria andZhrZwEqualTo(String value) {
            addCriterion("zhr_zw =", value, "zhrZw");
            return (Criteria) this;
        }

        public Criteria andZhrZwNotEqualTo(String value) {
            addCriterion("zhr_zw <>", value, "zhrZw");
            return (Criteria) this;
        }

        public Criteria andZhrZwGreaterThan(String value) {
            addCriterion("zhr_zw >", value, "zhrZw");
            return (Criteria) this;
        }

        public Criteria andZhrZwGreaterThanOrEqualTo(String value) {
            addCriterion("zhr_zw >=", value, "zhrZw");
            return (Criteria) this;
        }

        public Criteria andZhrZwLessThan(String value) {
            addCriterion("zhr_zw <", value, "zhrZw");
            return (Criteria) this;
        }

        public Criteria andZhrZwLessThanOrEqualTo(String value) {
            addCriterion("zhr_zw <=", value, "zhrZw");
            return (Criteria) this;
        }

        public Criteria andZhrZwLike(String value) {
            addCriterion("zhr_zw like", value, "zhrZw");
            return (Criteria) this;
        }

        public Criteria andZhrZwNotLike(String value) {
            addCriterion("zhr_zw not like", value, "zhrZw");
            return (Criteria) this;
        }

        public Criteria andZhrZwIn(List<String> values) {
            addCriterion("zhr_zw in", values, "zhrZw");
            return (Criteria) this;
        }

        public Criteria andZhrZwNotIn(List<String> values) {
            addCriterion("zhr_zw not in", values, "zhrZw");
            return (Criteria) this;
        }

        public Criteria andZhrZwBetween(String value1, String value2) {
            addCriterion("zhr_zw between", value1, value2, "zhrZw");
            return (Criteria) this;
        }

        public Criteria andZhrZwNotBetween(String value1, String value2) {
            addCriterion("zhr_zw not between", value1, value2, "zhrZw");
            return (Criteria) this;
        }

        public Criteria andBlrNameIsNull() {
            addCriterion("blr_name is null");
            return (Criteria) this;
        }

        public Criteria andBlrNameIsNotNull() {
            addCriterion("blr_name is not null");
            return (Criteria) this;
        }

        public Criteria andBlrNameEqualTo(String value) {
            addCriterion("blr_name =", value, "blrName");
            return (Criteria) this;
        }

        public Criteria andBlrNameNotEqualTo(String value) {
            addCriterion("blr_name <>", value, "blrName");
            return (Criteria) this;
        }

        public Criteria andBlrNameGreaterThan(String value) {
            addCriterion("blr_name >", value, "blrName");
            return (Criteria) this;
        }

        public Criteria andBlrNameGreaterThanOrEqualTo(String value) {
            addCriterion("blr_name >=", value, "blrName");
            return (Criteria) this;
        }

        public Criteria andBlrNameLessThan(String value) {
            addCriterion("blr_name <", value, "blrName");
            return (Criteria) this;
        }

        public Criteria andBlrNameLessThanOrEqualTo(String value) {
            addCriterion("blr_name <=", value, "blrName");
            return (Criteria) this;
        }

        public Criteria andBlrNameLike(String value) {
            addCriterion("blr_name like", value, "blrName");
            return (Criteria) this;
        }

        public Criteria andBlrNameNotLike(String value) {
            addCriterion("blr_name not like", value, "blrName");
            return (Criteria) this;
        }

        public Criteria andBlrNameIn(List<String> values) {
            addCriterion("blr_name in", values, "blrName");
            return (Criteria) this;
        }

        public Criteria andBlrNameNotIn(List<String> values) {
            addCriterion("blr_name not in", values, "blrName");
            return (Criteria) this;
        }

        public Criteria andBlrNameBetween(String value1, String value2) {
            addCriterion("blr_name between", value1, value2, "blrName");
            return (Criteria) this;
        }

        public Criteria andBlrNameNotBetween(String value1, String value2) {
            addCriterion("blr_name not between", value1, value2, "blrName");
            return (Criteria) this;
        }

        public Criteria andZtrNameIsNull() {
            addCriterion("ztr_name is null");
            return (Criteria) this;
        }

        public Criteria andZtrNameIsNotNull() {
            addCriterion("ztr_name is not null");
            return (Criteria) this;
        }

        public Criteria andZtrNameEqualTo(String value) {
            addCriterion("ztr_name =", value, "ztrName");
            return (Criteria) this;
        }

        public Criteria andZtrNameNotEqualTo(String value) {
            addCriterion("ztr_name <>", value, "ztrName");
            return (Criteria) this;
        }

        public Criteria andZtrNameGreaterThan(String value) {
            addCriterion("ztr_name >", value, "ztrName");
            return (Criteria) this;
        }

        public Criteria andZtrNameGreaterThanOrEqualTo(String value) {
            addCriterion("ztr_name >=", value, "ztrName");
            return (Criteria) this;
        }

        public Criteria andZtrNameLessThan(String value) {
            addCriterion("ztr_name <", value, "ztrName");
            return (Criteria) this;
        }

        public Criteria andZtrNameLessThanOrEqualTo(String value) {
            addCriterion("ztr_name <=", value, "ztrName");
            return (Criteria) this;
        }

        public Criteria andZtrNameLike(String value) {
            addCriterion("ztr_name like", value, "ztrName");
            return (Criteria) this;
        }

        public Criteria andZtrNameNotLike(String value) {
            addCriterion("ztr_name not like", value, "ztrName");
            return (Criteria) this;
        }

        public Criteria andZtrNameIn(List<String> values) {
            addCriterion("ztr_name in", values, "ztrName");
            return (Criteria) this;
        }

        public Criteria andZtrNameNotIn(List<String> values) {
            addCriterion("ztr_name not in", values, "ztrName");
            return (Criteria) this;
        }

        public Criteria andZtrNameBetween(String value1, String value2) {
            addCriterion("ztr_name between", value1, value2, "ztrName");
            return (Criteria) this;
        }

        public Criteria andZtrNameNotBetween(String value1, String value2) {
            addCriterion("ztr_name not between", value1, value2, "ztrName");
            return (Criteria) this;
        }

        public Criteria andZxrNameIsNull() {
            addCriterion("zxr_name is null");
            return (Criteria) this;
        }

        public Criteria andZxrNameIsNotNull() {
            addCriterion("zxr_name is not null");
            return (Criteria) this;
        }

        public Criteria andZxrNameEqualTo(String value) {
            addCriterion("zxr_name =", value, "zxrName");
            return (Criteria) this;
        }

        public Criteria andZxrNameNotEqualTo(String value) {
            addCriterion("zxr_name <>", value, "zxrName");
            return (Criteria) this;
        }

        public Criteria andZxrNameGreaterThan(String value) {
            addCriterion("zxr_name >", value, "zxrName");
            return (Criteria) this;
        }

        public Criteria andZxrNameGreaterThanOrEqualTo(String value) {
            addCriterion("zxr_name >=", value, "zxrName");
            return (Criteria) this;
        }

        public Criteria andZxrNameLessThan(String value) {
            addCriterion("zxr_name <", value, "zxrName");
            return (Criteria) this;
        }

        public Criteria andZxrNameLessThanOrEqualTo(String value) {
            addCriterion("zxr_name <=", value, "zxrName");
            return (Criteria) this;
        }

        public Criteria andZxrNameLike(String value) {
            addCriterion("zxr_name like", value, "zxrName");
            return (Criteria) this;
        }

        public Criteria andZxrNameNotLike(String value) {
            addCriterion("zxr_name not like", value, "zxrName");
            return (Criteria) this;
        }

        public Criteria andZxrNameIn(List<String> values) {
            addCriterion("zxr_name in", values, "zxrName");
            return (Criteria) this;
        }

        public Criteria andZxrNameNotIn(List<String> values) {
            addCriterion("zxr_name not in", values, "zxrName");
            return (Criteria) this;
        }

        public Criteria andZxrNameBetween(String value1, String value2) {
            addCriterion("zxr_name between", value1, value2, "zxrName");
            return (Criteria) this;
        }

        public Criteria andZxrNameNotBetween(String value1, String value2) {
            addCriterion("zxr_name not between", value1, value2, "zxrName");
            return (Criteria) this;
        }

        public Criteria andLxrNameIsNull() {
            addCriterion("lxr_name is null");
            return (Criteria) this;
        }

        public Criteria andLxrNameIsNotNull() {
            addCriterion("lxr_name is not null");
            return (Criteria) this;
        }

        public Criteria andLxrNameEqualTo(String value) {
            addCriterion("lxr_name =", value, "lxrName");
            return (Criteria) this;
        }

        public Criteria andLxrNameNotEqualTo(String value) {
            addCriterion("lxr_name <>", value, "lxrName");
            return (Criteria) this;
        }

        public Criteria andLxrNameGreaterThan(String value) {
            addCriterion("lxr_name >", value, "lxrName");
            return (Criteria) this;
        }

        public Criteria andLxrNameGreaterThanOrEqualTo(String value) {
            addCriterion("lxr_name >=", value, "lxrName");
            return (Criteria) this;
        }

        public Criteria andLxrNameLessThan(String value) {
            addCriterion("lxr_name <", value, "lxrName");
            return (Criteria) this;
        }

        public Criteria andLxrNameLessThanOrEqualTo(String value) {
            addCriterion("lxr_name <=", value, "lxrName");
            return (Criteria) this;
        }

        public Criteria andLxrNameLike(String value) {
            addCriterion("lxr_name like", value, "lxrName");
            return (Criteria) this;
        }

        public Criteria andLxrNameNotLike(String value) {
            addCriterion("lxr_name not like", value, "lxrName");
            return (Criteria) this;
        }

        public Criteria andLxrNameIn(List<String> values) {
            addCriterion("lxr_name in", values, "lxrName");
            return (Criteria) this;
        }

        public Criteria andLxrNameNotIn(List<String> values) {
            addCriterion("lxr_name not in", values, "lxrName");
            return (Criteria) this;
        }

        public Criteria andLxrNameBetween(String value1, String value2) {
            addCriterion("lxr_name between", value1, value2, "lxrName");
            return (Criteria) this;
        }

        public Criteria andLxrNameNotBetween(String value1, String value2) {
            addCriterion("lxr_name not between", value1, value2, "lxrName");
            return (Criteria) this;
        }

        public Criteria andLyrNameIsNull() {
            addCriterion("lyr_name is null");
            return (Criteria) this;
        }

        public Criteria andLyrNameIsNotNull() {
            addCriterion("lyr_name is not null");
            return (Criteria) this;
        }

        public Criteria andLyrNameEqualTo(String value) {
            addCriterion("lyr_name =", value, "lyrName");
            return (Criteria) this;
        }

        public Criteria andLyrNameNotEqualTo(String value) {
            addCriterion("lyr_name <>", value, "lyrName");
            return (Criteria) this;
        }

        public Criteria andLyrNameGreaterThan(String value) {
            addCriterion("lyr_name >", value, "lyrName");
            return (Criteria) this;
        }

        public Criteria andLyrNameGreaterThanOrEqualTo(String value) {
            addCriterion("lyr_name >=", value, "lyrName");
            return (Criteria) this;
        }

        public Criteria andLyrNameLessThan(String value) {
            addCriterion("lyr_name <", value, "lyrName");
            return (Criteria) this;
        }

        public Criteria andLyrNameLessThanOrEqualTo(String value) {
            addCriterion("lyr_name <=", value, "lyrName");
            return (Criteria) this;
        }

        public Criteria andLyrNameLike(String value) {
            addCriterion("lyr_name like", value, "lyrName");
            return (Criteria) this;
        }

        public Criteria andLyrNameNotLike(String value) {
            addCriterion("lyr_name not like", value, "lyrName");
            return (Criteria) this;
        }

        public Criteria andLyrNameIn(List<String> values) {
            addCriterion("lyr_name in", values, "lyrName");
            return (Criteria) this;
        }

        public Criteria andLyrNameNotIn(List<String> values) {
            addCriterion("lyr_name not in", values, "lyrName");
            return (Criteria) this;
        }

        public Criteria andLyrNameBetween(String value1, String value2) {
            addCriterion("lyr_name between", value1, value2, "lyrName");
            return (Criteria) this;
        }

        public Criteria andLyrNameNotBetween(String value1, String value2) {
            addCriterion("lyr_name not between", value1, value2, "lyrName");
            return (Criteria) this;
        }

        public Criteria andJjrOtherIsNull() {
            addCriterion("jjr_other is null");
            return (Criteria) this;
        }

        public Criteria andJjrOtherIsNotNull() {
            addCriterion("jjr_other is not null");
            return (Criteria) this;
        }

        public Criteria andJjrOtherEqualTo(String value) {
            addCriterion("jjr_other =", value, "jjrOther");
            return (Criteria) this;
        }

        public Criteria andJjrOtherNotEqualTo(String value) {
            addCriterion("jjr_other <>", value, "jjrOther");
            return (Criteria) this;
        }

        public Criteria andJjrOtherGreaterThan(String value) {
            addCriterion("jjr_other >", value, "jjrOther");
            return (Criteria) this;
        }

        public Criteria andJjrOtherGreaterThanOrEqualTo(String value) {
            addCriterion("jjr_other >=", value, "jjrOther");
            return (Criteria) this;
        }

        public Criteria andJjrOtherLessThan(String value) {
            addCriterion("jjr_other <", value, "jjrOther");
            return (Criteria) this;
        }

        public Criteria andJjrOtherLessThanOrEqualTo(String value) {
            addCriterion("jjr_other <=", value, "jjrOther");
            return (Criteria) this;
        }

        public Criteria andJjrOtherLike(String value) {
            addCriterion("jjr_other like", value, "jjrOther");
            return (Criteria) this;
        }

        public Criteria andJjrOtherNotLike(String value) {
            addCriterion("jjr_other not like", value, "jjrOther");
            return (Criteria) this;
        }

        public Criteria andJjrOtherIn(List<String> values) {
            addCriterion("jjr_other in", values, "jjrOther");
            return (Criteria) this;
        }

        public Criteria andJjrOtherNotIn(List<String> values) {
            addCriterion("jjr_other not in", values, "jjrOther");
            return (Criteria) this;
        }

        public Criteria andJjrOtherBetween(String value1, String value2) {
            addCriterion("jjr_other between", value1, value2, "jjrOther");
            return (Criteria) this;
        }

        public Criteria andJjrOtherNotBetween(String value1, String value2) {
            addCriterion("jjr_other not between", value1, value2, "jjrOther");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNull() {
            addCriterion("update_time is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("update_time is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualTo(Date value) {
            addCriterion("update_time =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(Date value) {
            addCriterion("update_time <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(Date value) {
            addCriterion("update_time >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("update_time >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(Date value) {
            addCriterion("update_time <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("update_time <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<Date> values) {
            addCriterion("update_time in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<Date> values) {
            addCriterion("update_time not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("update_time between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("update_time not between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andShUnitIdIsNull() {
            addCriterion("sh_unit_id is null");
            return (Criteria) this;
        }

        public Criteria andShUnitIdIsNotNull() {
            addCriterion("sh_unit_id is not null");
            return (Criteria) this;
        }

        public Criteria andShUnitIdEqualTo(String value) {
            addCriterion("sh_unit_id =", value, "shUnitId");
            return (Criteria) this;
        }

        public Criteria andShUnitIdNotEqualTo(String value) {
            addCriterion("sh_unit_id <>", value, "shUnitId");
            return (Criteria) this;
        }

        public Criteria andShUnitIdGreaterThan(String value) {
            addCriterion("sh_unit_id >", value, "shUnitId");
            return (Criteria) this;
        }

        public Criteria andShUnitIdGreaterThanOrEqualTo(String value) {
            addCriterion("sh_unit_id >=", value, "shUnitId");
            return (Criteria) this;
        }

        public Criteria andShUnitIdLessThan(String value) {
            addCriterion("sh_unit_id <", value, "shUnitId");
            return (Criteria) this;
        }

        public Criteria andShUnitIdLessThanOrEqualTo(String value) {
            addCriterion("sh_unit_id <=", value, "shUnitId");
            return (Criteria) this;
        }

        public Criteria andShUnitIdLike(String value) {
            addCriterion("sh_unit_id like", value, "shUnitId");
            return (Criteria) this;
        }

        public Criteria andShUnitIdNotLike(String value) {
            addCriterion("sh_unit_id not like", value, "shUnitId");
            return (Criteria) this;
        }

        public Criteria andShUnitIdIn(List<String> values) {
            addCriterion("sh_unit_id in", values, "shUnitId");
            return (Criteria) this;
        }

        public Criteria andShUnitIdNotIn(List<String> values) {
            addCriterion("sh_unit_id not in", values, "shUnitId");
            return (Criteria) this;
        }

        public Criteria andShUnitIdBetween(String value1, String value2) {
            addCriterion("sh_unit_id between", value1, value2, "shUnitId");
            return (Criteria) this;
        }

        public Criteria andShUnitIdNotBetween(String value1, String value2) {
            addCriterion("sh_unit_id not between", value1, value2, "shUnitId");
            return (Criteria) this;
        }

        public Criteria andShUnitNameIsNull() {
            addCriterion("sh_unit_name is null");
            return (Criteria) this;
        }

        public Criteria andShUnitNameIsNotNull() {
            addCriterion("sh_unit_name is not null");
            return (Criteria) this;
        }

        public Criteria andShUnitNameEqualTo(String value) {
            addCriterion("sh_unit_name =", value, "shUnitName");
            return (Criteria) this;
        }

        public Criteria andShUnitNameNotEqualTo(String value) {
            addCriterion("sh_unit_name <>", value, "shUnitName");
            return (Criteria) this;
        }

        public Criteria andShUnitNameGreaterThan(String value) {
            addCriterion("sh_unit_name >", value, "shUnitName");
            return (Criteria) this;
        }

        public Criteria andShUnitNameGreaterThanOrEqualTo(String value) {
            addCriterion("sh_unit_name >=", value, "shUnitName");
            return (Criteria) this;
        }

        public Criteria andShUnitNameLessThan(String value) {
            addCriterion("sh_unit_name <", value, "shUnitName");
            return (Criteria) this;
        }

        public Criteria andShUnitNameLessThanOrEqualTo(String value) {
            addCriterion("sh_unit_name <=", value, "shUnitName");
            return (Criteria) this;
        }

        public Criteria andShUnitNameLike(String value) {
            addCriterion("sh_unit_name like", value, "shUnitName");
            return (Criteria) this;
        }

        public Criteria andShUnitNameNotLike(String value) {
            addCriterion("sh_unit_name not like", value, "shUnitName");
            return (Criteria) this;
        }

        public Criteria andShUnitNameIn(List<String> values) {
            addCriterion("sh_unit_name in", values, "shUnitName");
            return (Criteria) this;
        }

        public Criteria andShUnitNameNotIn(List<String> values) {
            addCriterion("sh_unit_name not in", values, "shUnitName");
            return (Criteria) this;
        }

        public Criteria andShUnitNameBetween(String value1, String value2) {
            addCriterion("sh_unit_name between", value1, value2, "shUnitName");
            return (Criteria) this;
        }

        public Criteria andShUnitNameNotBetween(String value1, String value2) {
            addCriterion("sh_unit_name not between", value1, value2, "shUnitName");
            return (Criteria) this;
        }

        public Criteria andShyjIsNull() {
            addCriterion("shyj is null");
            return (Criteria) this;
        }

        public Criteria andShyjIsNotNull() {
            addCriterion("shyj is not null");
            return (Criteria) this;
        }

        public Criteria andShyjEqualTo(String value) {
            addCriterion("shyj =", value, "shyj");
            return (Criteria) this;
        }

        public Criteria andShyjNotEqualTo(String value) {
            addCriterion("shyj <>", value, "shyj");
            return (Criteria) this;
        }

        public Criteria andShyjGreaterThan(String value) {
            addCriterion("shyj >", value, "shyj");
            return (Criteria) this;
        }

        public Criteria andShyjGreaterThanOrEqualTo(String value) {
            addCriterion("shyj >=", value, "shyj");
            return (Criteria) this;
        }

        public Criteria andShyjLessThan(String value) {
            addCriterion("shyj <", value, "shyj");
            return (Criteria) this;
        }

        public Criteria andShyjLessThanOrEqualTo(String value) {
            addCriterion("shyj <=", value, "shyj");
            return (Criteria) this;
        }

        public Criteria andShyjLike(String value) {
            addCriterion("shyj like", value, "shyj");
            return (Criteria) this;
        }

        public Criteria andShyjNotLike(String value) {
            addCriterion("shyj not like", value, "shyj");
            return (Criteria) this;
        }

        public Criteria andShyjIn(List<String> values) {
            addCriterion("shyj in", values, "shyj");
            return (Criteria) this;
        }

        public Criteria andShyjNotIn(List<String> values) {
            addCriterion("shyj not in", values, "shyj");
            return (Criteria) this;
        }

        public Criteria andShyjBetween(String value1, String value2) {
            addCriterion("shyj between", value1, value2, "shyj");
            return (Criteria) this;
        }

        public Criteria andShyjNotBetween(String value1, String value2) {
            addCriterion("shyj not between", value1, value2, "shyj");
            return (Criteria) this;
        }

        public Criteria andModelIdIsNull() {
            addCriterion("model_id is null");
            return (Criteria) this;
        }

        public Criteria andModelIdIsNotNull() {
            addCriterion("model_id is not null");
            return (Criteria) this;
        }

        public Criteria andModelIdEqualTo(Integer value) {
            addCriterion("model_id =", value, "modelId");
            return (Criteria) this;
        }

        public Criteria andModelIdNotEqualTo(Integer value) {
            addCriterion("model_id <>", value, "modelId");
            return (Criteria) this;
        }

        public Criteria andModelIdGreaterThan(Integer value) {
            addCriterion("model_id >", value, "modelId");
            return (Criteria) this;
        }

        public Criteria andModelIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("model_id >=", value, "modelId");
            return (Criteria) this;
        }

        public Criteria andModelIdLessThan(Integer value) {
            addCriterion("model_id <", value, "modelId");
            return (Criteria) this;
        }

        public Criteria andModelIdLessThanOrEqualTo(Integer value) {
            addCriterion("model_id <=", value, "modelId");
            return (Criteria) this;
        }

        public Criteria andModelIdIn(List<Integer> values) {
            addCriterion("model_id in", values, "modelId");
            return (Criteria) this;
        }

        public Criteria andModelIdNotIn(List<Integer> values) {
            addCriterion("model_id not in", values, "modelId");
            return (Criteria) this;
        }

        public Criteria andModelIdBetween(Integer value1, Integer value2) {
            addCriterion("model_id between", value1, value2, "modelId");
            return (Criteria) this;
        }

        public Criteria andModelIdNotBetween(Integer value1, Integer value2) {
            addCriterion("model_id not between", value1, value2, "modelId");
            return (Criteria) this;
        }

        public Criteria andDocUrlIsNull() {
            addCriterion("doc_url is null");
            return (Criteria) this;
        }

        public Criteria andDocUrlIsNotNull() {
            addCriterion("doc_url is not null");
            return (Criteria) this;
        }

        public Criteria andDocUrlEqualTo(String value) {
            addCriterion("doc_url =", value, "docUrl");
            return (Criteria) this;
        }

        public Criteria andDocUrlNotEqualTo(String value) {
            addCriterion("doc_url <>", value, "docUrl");
            return (Criteria) this;
        }

        public Criteria andDocUrlGreaterThan(String value) {
            addCriterion("doc_url >", value, "docUrl");
            return (Criteria) this;
        }

        public Criteria andDocUrlGreaterThanOrEqualTo(String value) {
            addCriterion("doc_url >=", value, "docUrl");
            return (Criteria) this;
        }

        public Criteria andDocUrlLessThan(String value) {
            addCriterion("doc_url <", value, "docUrl");
            return (Criteria) this;
        }

        public Criteria andDocUrlLessThanOrEqualTo(String value) {
            addCriterion("doc_url <=", value, "docUrl");
            return (Criteria) this;
        }

        public Criteria andDocUrlLike(String value) {
            addCriterion("doc_url like", value, "docUrl");
            return (Criteria) this;
        }

        public Criteria andDocUrlNotLike(String value) {
            addCriterion("doc_url not like", value, "docUrl");
            return (Criteria) this;
        }

        public Criteria andDocUrlIn(List<String> values) {
            addCriterion("doc_url in", values, "docUrl");
            return (Criteria) this;
        }

        public Criteria andDocUrlNotIn(List<String> values) {
            addCriterion("doc_url not in", values, "docUrl");
            return (Criteria) this;
        }

        public Criteria andDocUrlBetween(String value1, String value2) {
            addCriterion("doc_url between", value1, value2, "docUrl");
            return (Criteria) this;
        }

        public Criteria andDocUrlNotBetween(String value1, String value2) {
            addCriterion("doc_url not between", value1, value2, "docUrl");
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