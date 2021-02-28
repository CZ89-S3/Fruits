package com.yc.fruit.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class FruitExample implements java.io.Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public FruitExample() {
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

        public Criteria andFidIsNull() {
            addCriterion("fid is null");
            return (Criteria) this;
        }

        public Criteria andFidIsNotNull() {
            addCriterion("fid is not null");
            return (Criteria) this;
        }

        public Criteria andFidEqualTo(Integer value) {
            addCriterion("fid =", value, "fid");
            return (Criteria) this;
        }

        public Criteria andFidNotEqualTo(Integer value) {
            addCriterion("fid <>", value, "fid");
            return (Criteria) this;
        }

        public Criteria andFidGreaterThan(Integer value) {
            addCriterion("fid >", value, "fid");
            return (Criteria) this;
        }

        public Criteria andFidGreaterThanOrEqualTo(Integer value) {
            addCriterion("fid >=", value, "fid");
            return (Criteria) this;
        }

        public Criteria andFidLessThan(Integer value) {
            addCriterion("fid <", value, "fid");
            return (Criteria) this;
        }

        public Criteria andFidLessThanOrEqualTo(Integer value) {
            addCriterion("fid <=", value, "fid");
            return (Criteria) this;
        }

        public Criteria andFidIn(List<Integer> values) {
            addCriterion("fid in", values, "fid");
            return (Criteria) this;
        }

        public Criteria andFidNotIn(List<Integer> values) {
            addCriterion("fid not in", values, "fid");
            return (Criteria) this;
        }

        public Criteria andFidBetween(Integer value1, Integer value2) {
            addCriterion("fid between", value1, value2, "fid");
            return (Criteria) this;
        }

        public Criteria andFidNotBetween(Integer value1, Integer value2) {
            addCriterion("fid not between", value1, value2, "fid");
            return (Criteria) this;
        }

        public Criteria andFnameIsNull() {
            addCriterion("fname is null");
            return (Criteria) this;
        }

        public Criteria andFnameIsNotNull() {
            addCriterion("fname is not null");
            return (Criteria) this;
        }

        public Criteria andFnameEqualTo(String value) {
            addCriterion("fname =", value, "fname");
            return (Criteria) this;
        }

        public Criteria andFnameNotEqualTo(String value) {
            addCriterion("fname <>", value, "fname");
            return (Criteria) this;
        }

        public Criteria andFnameGreaterThan(String value) {
            addCriterion("fname >", value, "fname");
            return (Criteria) this;
        }

        public Criteria andFnameGreaterThanOrEqualTo(String value) {
            addCriterion("fname >=", value, "fname");
            return (Criteria) this;
        }

        public Criteria andFnameLessThan(String value) {
            addCriterion("fname <", value, "fname");
            return (Criteria) this;
        }

        public Criteria andFnameLessThanOrEqualTo(String value) {
            addCriterion("fname <=", value, "fname");
            return (Criteria) this;
        }

        public Criteria andFnameLike(String value) {
            addCriterion("fname like", value, "fname");
            return (Criteria) this;
        }

        public Criteria andFnameNotLike(String value) {
            addCriterion("fname not like", value, "fname");
            return (Criteria) this;
        }

        public Criteria andFnameIn(List<String> values) {
            addCriterion("fname in", values, "fname");
            return (Criteria) this;
        }

        public Criteria andFnameNotIn(List<String> values) {
            addCriterion("fname not in", values, "fname");
            return (Criteria) this;
        }

        public Criteria andFnameBetween(String value1, String value2) {
            addCriterion("fname between", value1, value2, "fname");
            return (Criteria) this;
        }

        public Criteria andFnameNotBetween(String value1, String value2) {
            addCriterion("fname not between", value1, value2, "fname");
            return (Criteria) this;
        }

        public Criteria andFpriceIsNull() {
            addCriterion("fprice is null");
            return (Criteria) this;
        }

        public Criteria andFpriceIsNotNull() {
            addCriterion("fprice is not null");
            return (Criteria) this;
        }

        public Criteria andFpriceEqualTo(Double value) {
            addCriterion("fprice =", value, "fprice");
            return (Criteria) this;
        }

        public Criteria andFpriceNotEqualTo(Double value) {
            addCriterion("fprice <>", value, "fprice");
            return (Criteria) this;
        }

        public Criteria andFpriceGreaterThan(Double value) {
            addCriterion("fprice >", value, "fprice");
            return (Criteria) this;
        }

        public Criteria andFpriceGreaterThanOrEqualTo(Double value) {
            addCriterion("fprice >=", value, "fprice");
            return (Criteria) this;
        }

        public Criteria andFpriceLessThan(Double value) {
            addCriterion("fprice <", value, "fprice");
            return (Criteria) this;
        }

        public Criteria andFpriceLessThanOrEqualTo(Double value) {
            addCriterion("fprice <=", value, "fprice");
            return (Criteria) this;
        }

        public Criteria andFpriceIn(List<Double> values) {
            addCriterion("fprice in", values, "fprice");
            return (Criteria) this;
        }

        public Criteria andFpriceNotIn(List<Double> values) {
            addCriterion("fprice not in", values, "fprice");
            return (Criteria) this;
        }

        public Criteria andFpriceBetween(Double value1, Double value2) {
            addCriterion("fprice between", value1, value2, "fprice");
            return (Criteria) this;
        }

        public Criteria andFpriceNotBetween(Double value1, Double value2) {
            addCriterion("fprice not between", value1, value2, "fprice");
            return (Criteria) this;
        }

        public Criteria andFnpriceIsNull() {
            addCriterion("fnprice is null");
            return (Criteria) this;
        }

        public Criteria andFnpriceIsNotNull() {
            addCriterion("fnprice is not null");
            return (Criteria) this;
        }

        public Criteria andFnpriceEqualTo(Double value) {
            addCriterion("fnprice =", value, "fnprice");
            return (Criteria) this;
        }

        public Criteria andFnpriceNotEqualTo(Double value) {
            addCriterion("fnprice <>", value, "fnprice");
            return (Criteria) this;
        }

        public Criteria andFnpriceGreaterThan(Double value) {
            addCriterion("fnprice >", value, "fnprice");
            return (Criteria) this;
        }

        public Criteria andFnpriceGreaterThanOrEqualTo(Double value) {
            addCriterion("fnprice >=", value, "fnprice");
            return (Criteria) this;
        }

        public Criteria andFnpriceLessThan(Double value) {
            addCriterion("fnprice <", value, "fnprice");
            return (Criteria) this;
        }

        public Criteria andFnpriceLessThanOrEqualTo(Double value) {
            addCriterion("fnprice <=", value, "fnprice");
            return (Criteria) this;
        }

        public Criteria andFnpriceIn(List<Double> values) {
            addCriterion("fnprice in", values, "fnprice");
            return (Criteria) this;
        }

        public Criteria andFnpriceNotIn(List<Double> values) {
            addCriterion("fnprice not in", values, "fnprice");
            return (Criteria) this;
        }

        public Criteria andFnpriceBetween(Double value1, Double value2) {
            addCriterion("fnprice between", value1, value2, "fnprice");
            return (Criteria) this;
        }

        public Criteria andFnpriceNotBetween(Double value1, Double value2) {
            addCriterion("fnprice not between", value1, value2, "fnprice");
            return (Criteria) this;
        }

        public Criteria andFImageIsNull() {
            addCriterion("f_image is null");
            return (Criteria) this;
        }

        public Criteria andFImageIsNotNull() {
            addCriterion("f_image is not null");
            return (Criteria) this;
        }

        public Criteria andFImageEqualTo(String value) {
            addCriterion("f_image =", value, "fImage");
            return (Criteria) this;
        }

        public Criteria andFImageNotEqualTo(String value) {
            addCriterion("f_image <>", value, "fImage");
            return (Criteria) this;
        }

        public Criteria andFImageGreaterThan(String value) {
            addCriterion("f_image >", value, "fImage");
            return (Criteria) this;
        }

        public Criteria andFImageGreaterThanOrEqualTo(String value) {
            addCriterion("f_image >=", value, "fImage");
            return (Criteria) this;
        }

        public Criteria andFImageLessThan(String value) {
            addCriterion("f_image <", value, "fImage");
            return (Criteria) this;
        }

        public Criteria andFImageLessThanOrEqualTo(String value) {
            addCriterion("f_image <=", value, "fImage");
            return (Criteria) this;
        }

        public Criteria andFImageLike(String value) {
            addCriterion("f_image like", value, "fImage");
            return (Criteria) this;
        }

        public Criteria andFImageNotLike(String value) {
            addCriterion("f_image not like", value, "fImage");
            return (Criteria) this;
        }

        public Criteria andFImageIn(List<String> values) {
            addCriterion("f_image in", values, "fImage");
            return (Criteria) this;
        }

        public Criteria andFImageNotIn(List<String> values) {
            addCriterion("f_image not in", values, "fImage");
            return (Criteria) this;
        }

        public Criteria andFImageBetween(String value1, String value2) {
            addCriterion("f_image between", value1, value2, "fImage");
            return (Criteria) this;
        }

        public Criteria andFImageNotBetween(String value1, String value2) {
            addCriterion("f_image not between", value1, value2, "fImage");
            return (Criteria) this;
        }

        public Criteria andFdescIsNull() {
            addCriterion("fdesc is null");
            return (Criteria) this;
        }

        public Criteria andFdescIsNotNull() {
            addCriterion("fdesc is not null");
            return (Criteria) this;
        }

        public Criteria andFdescEqualTo(String value) {
            addCriterion("fdesc =", value, "fdesc");
            return (Criteria) this;
        }

        public Criteria andFdescNotEqualTo(String value) {
            addCriterion("fdesc <>", value, "fdesc");
            return (Criteria) this;
        }

        public Criteria andFdescGreaterThan(String value) {
            addCriterion("fdesc >", value, "fdesc");
            return (Criteria) this;
        }

        public Criteria andFdescGreaterThanOrEqualTo(String value) {
            addCriterion("fdesc >=", value, "fdesc");
            return (Criteria) this;
        }

        public Criteria andFdescLessThan(String value) {
            addCriterion("fdesc <", value, "fdesc");
            return (Criteria) this;
        }

        public Criteria andFdescLessThanOrEqualTo(String value) {
            addCriterion("fdesc <=", value, "fdesc");
            return (Criteria) this;
        }

        public Criteria andFdescLike(String value) {
            addCriterion("fdesc like", value, "fdesc");
            return (Criteria) this;
        }

        public Criteria andFdescNotLike(String value) {
            addCriterion("fdesc not like", value, "fdesc");
            return (Criteria) this;
        }

        public Criteria andFdescIn(List<String> values) {
            addCriterion("fdesc in", values, "fdesc");
            return (Criteria) this;
        }

        public Criteria andFdescNotIn(List<String> values) {
            addCriterion("fdesc not in", values, "fdesc");
            return (Criteria) this;
        }

        public Criteria andFdescBetween(String value1, String value2) {
            addCriterion("fdesc between", value1, value2, "fdesc");
            return (Criteria) this;
        }

        public Criteria andFdescNotBetween(String value1, String value2) {
            addCriterion("fdesc not between", value1, value2, "fdesc");
            return (Criteria) this;
        }

        public Criteria andHotIsNull() {
            addCriterion("hot is null");
            return (Criteria) this;
        }

        public Criteria andHotIsNotNull() {
            addCriterion("hot is not null");
            return (Criteria) this;
        }

        public Criteria andHotEqualTo(Integer value) {
            addCriterion("hot =", value, "hot");
            return (Criteria) this;
        }

        public Criteria andHotNotEqualTo(Integer value) {
            addCriterion("hot <>", value, "hot");
            return (Criteria) this;
        }

        public Criteria andHotGreaterThan(Integer value) {
            addCriterion("hot >", value, "hot");
            return (Criteria) this;
        }

        public Criteria andHotGreaterThanOrEqualTo(Integer value) {
            addCriterion("hot >=", value, "hot");
            return (Criteria) this;
        }

        public Criteria andHotLessThan(Integer value) {
            addCriterion("hot <", value, "hot");
            return (Criteria) this;
        }

        public Criteria andHotLessThanOrEqualTo(Integer value) {
            addCriterion("hot <=", value, "hot");
            return (Criteria) this;
        }

        public Criteria andHotIn(List<Integer> values) {
            addCriterion("hot in", values, "hot");
            return (Criteria) this;
        }

        public Criteria andHotNotIn(List<Integer> values) {
            addCriterion("hot not in", values, "hot");
            return (Criteria) this;
        }

        public Criteria andHotBetween(Integer value1, Integer value2) {
            addCriterion("hot between", value1, value2, "hot");
            return (Criteria) this;
        }

        public Criteria andHotNotBetween(Integer value1, Integer value2) {
            addCriterion("hot not between", value1, value2, "hot");
            return (Criteria) this;
        }

        public Criteria andFdateIsNull() {
            addCriterion("fdate is null");
            return (Criteria) this;
        }

        public Criteria andFdateIsNotNull() {
            addCriterion("fdate is not null");
            return (Criteria) this;
        }

        public Criteria andFdateEqualTo(Date value) {
            addCriterion("fdate =", value, "fdate");
            return (Criteria) this;
        }

        public Criteria andFdateNotEqualTo(Date value) {
            addCriterion("fdate <>", value, "fdate");
            return (Criteria) this;
        }

        public Criteria andFdateGreaterThan(Date value) {
            addCriterion("fdate >", value, "fdate");
            return (Criteria) this;
        }

        public Criteria andFdateGreaterThanOrEqualTo(Date value) {
            addCriterion("fdate >=", value, "fdate");
            return (Criteria) this;
        }

        public Criteria andFdateLessThan(Date value) {
            addCriterion("fdate <", value, "fdate");
            return (Criteria) this;
        }

        public Criteria andFdateLessThanOrEqualTo(Date value) {
            addCriterion("fdate <=", value, "fdate");
            return (Criteria) this;
        }

        public Criteria andFdateIn(List<Date> values) {
            addCriterion("fdate in", values, "fdate");
            return (Criteria) this;
        }

        public Criteria andFdateNotIn(List<Date> values) {
            addCriterion("fdate not in", values, "fdate");
            return (Criteria) this;
        }

        public Criteria andFdateBetween(Date value1, Date value2) {
            addCriterion("fdate between", value1, value2, "fdate");
            return (Criteria) this;
        }

        public Criteria andFdateNotBetween(Date value1, Date value2) {
            addCriterion("fdate not between", value1, value2, "fdate");
            return (Criteria) this;
        }

        public Criteria andGuanggaoIsNull() {
            addCriterion("guanggao is null");
            return (Criteria) this;
        }

        public Criteria andGuanggaoIsNotNull() {
            addCriterion("guanggao is not null");
            return (Criteria) this;
        }

        public Criteria andGuanggaoEqualTo(Integer value) {
            addCriterion("guanggao =", value, "guanggao");
            return (Criteria) this;
        }

        public Criteria andGuanggaoNotEqualTo(Integer value) {
            addCriterion("guanggao <>", value, "guanggao");
            return (Criteria) this;
        }

        public Criteria andGuanggaoGreaterThan(Integer value) {
            addCriterion("guanggao >", value, "guanggao");
            return (Criteria) this;
        }

        public Criteria andGuanggaoGreaterThanOrEqualTo(Integer value) {
            addCriterion("guanggao >=", value, "guanggao");
            return (Criteria) this;
        }

        public Criteria andGuanggaoLessThan(Integer value) {
            addCriterion("guanggao <", value, "guanggao");
            return (Criteria) this;
        }

        public Criteria andGuanggaoLessThanOrEqualTo(Integer value) {
            addCriterion("guanggao <=", value, "guanggao");
            return (Criteria) this;
        }

        public Criteria andGuanggaoIn(List<Integer> values) {
            addCriterion("guanggao in", values, "guanggao");
            return (Criteria) this;
        }

        public Criteria andGuanggaoNotIn(List<Integer> values) {
            addCriterion("guanggao not in", values, "guanggao");
            return (Criteria) this;
        }

        public Criteria andGuanggaoBetween(Integer value1, Integer value2) {
            addCriterion("guanggao between", value1, value2, "guanggao");
            return (Criteria) this;
        }

        public Criteria andGuanggaoNotBetween(Integer value1, Integer value2) {
            addCriterion("guanggao not between", value1, value2, "guanggao");
            return (Criteria) this;
        }

        public Criteria andCidIsNull() {
            addCriterion("cid is null");
            return (Criteria) this;
        }

        public Criteria andCidIsNotNull() {
            addCriterion("cid is not null");
            return (Criteria) this;
        }

        public Criteria andCidEqualTo(Integer value) {
            addCriterion("cid =", value, "cid");
            return (Criteria) this;
        }

        public Criteria andCidNotEqualTo(Integer value) {
            addCriterion("cid <>", value, "cid");
            return (Criteria) this;
        }

        public Criteria andCidGreaterThan(Integer value) {
            addCriterion("cid >", value, "cid");
            return (Criteria) this;
        }

        public Criteria andCidGreaterThanOrEqualTo(Integer value) {
            addCriterion("cid >=", value, "cid");
            return (Criteria) this;
        }

        public Criteria andCidLessThan(Integer value) {
            addCriterion("cid <", value, "cid");
            return (Criteria) this;
        }

        public Criteria andCidLessThanOrEqualTo(Integer value) {
            addCriterion("cid <=", value, "cid");
            return (Criteria) this;
        }

        public Criteria andCidIn(List<Integer> values) {
            addCriterion("cid in", values, "cid");
            return (Criteria) this;
        }

        public Criteria andCidNotIn(List<Integer> values) {
            addCriterion("cid not in", values, "cid");
            return (Criteria) this;
        }

        public Criteria andCidBetween(Integer value1, Integer value2) {
            addCriterion("cid between", value1, value2, "cid");
            return (Criteria) this;
        }

        public Criteria andCidNotBetween(Integer value1, Integer value2) {
            addCriterion("cid not between", value1, value2, "cid");
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