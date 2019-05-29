package com.huawei.vo;

import java.util.ArrayList;
import java.util.List;

public class ProductCondition {
    /**
     * SQL的orderby条件
     */
    protected String orderByClause;

    /**
     * 去除重复条件
     */
    protected boolean distinct;
    /**
     * Or条件
     */
    protected List<Criteria> oredCriteria;

    /**
     * 查询条件集合
     */
    public ProductCondition() {
        oredCriteria = new ArrayList<Criteria>();
    }

    //设置当前orderBy语句
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

   //设置当前orderby语句
    public String getOrderByClause() {

        return orderByClause;
    }

    /**
     * 设置去重复
     * @param distinct
     */
    public void setDistinct(boolean distinct) {

        this.distinct = distinct;
    }

    /**
     * 获取去重复数据
     * @return
     */

    public boolean isDistinct() {
        return distinct;
    }


    //获取Criteria集合
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * 添加条件
     * @param criteria
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    //添加or条件
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * 初始化条件
     * @return
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * 初始化条件
     * @return
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * 清除条件
     */
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

        public Criteria andProductnameIsNull() {
            addCriterion("productName is null");
            return (Criteria) this;
        }

        public Criteria andProductnameIsNotNull() {
            addCriterion("productName is not null");
            return (Criteria) this;
        }

        public Criteria andProductnameEqualTo(String value) {
            addCriterion("productName =", value, "productname");
            return (Criteria) this;
        }

        public Criteria andProductnameNotEqualTo(String value) {
            addCriterion("productName <>", value, "productname");
            return (Criteria) this;
        }

        public Criteria andProductnameGreaterThan(String value) {
            addCriterion("productName >", value, "productname");
            return (Criteria) this;
        }

        public Criteria andProductnameGreaterThanOrEqualTo(String value) {
            addCriterion("productName >=", value, "productname");
            return (Criteria) this;
        }

        public Criteria andProductnameLessThan(String value) {
            addCriterion("productName <", value, "productname");
            return (Criteria) this;
        }

        public Criteria andProductnameLessThanOrEqualTo(String value) {
            addCriterion("productName <=", value, "productname");
            return (Criteria) this;
        }

        public Criteria andProductnameLike(String value) {
            addCriterion("productName like", value, "productname");
            return (Criteria) this;
        }

        public Criteria andProductnameNotLike(String value) {
            addCriterion("productName not like", value, "productname");
            return (Criteria) this;
        }

        public Criteria andProductnameIn(List<String> values) {
            addCriterion("productName in", values, "productname");
            return (Criteria) this;
        }

        public Criteria andProductnameNotIn(List<String> values) {
            addCriterion("productName not in", values, "productname");
            return (Criteria) this;
        }

        public Criteria andProductnameBetween(String value1, String value2) {
            addCriterion("productName between", value1, value2, "productname");
            return (Criteria) this;
        }

        public Criteria andProductnameNotBetween(String value1, String value2) {
            addCriterion("productName not between", value1, value2, "productname");
            return (Criteria) this;
        }

        public Criteria andProductdesc1IsNull() {
            addCriterion("productDesc1 is null");
            return (Criteria) this;
        }

        public Criteria andProductdesc1IsNotNull() {
            addCriterion("productDesc1 is not null");
            return (Criteria) this;
        }

        public Criteria andProductdesc1EqualTo(String value) {
            addCriterion("productDesc1 =", value, "productdesc1");
            return (Criteria) this;
        }

        public Criteria andProductdesc1NotEqualTo(String value) {
            addCriterion("productDesc1 <>", value, "productdesc1");
            return (Criteria) this;
        }

        public Criteria andProductdesc1GreaterThan(String value) {
            addCriterion("productDesc1 >", value, "productdesc1");
            return (Criteria) this;
        }

        public Criteria andProductdesc1GreaterThanOrEqualTo(String value) {
            addCriterion("productDesc1 >=", value, "productdesc1");
            return (Criteria) this;
        }

        public Criteria andProductdesc1LessThan(String value) {
            addCriterion("productDesc1 <", value, "productdesc1");
            return (Criteria) this;
        }

        public Criteria andProductdesc1LessThanOrEqualTo(String value) {
            addCriterion("productDesc1 <=", value, "productdesc1");
            return (Criteria) this;
        }

        public Criteria andProductdesc1Like(String value) {
            addCriterion("productDesc1 like", value, "productdesc1");
            return (Criteria) this;
        }

        public Criteria andProductdesc1NotLike(String value) {
            addCriterion("productDesc1 not like", value, "productdesc1");
            return (Criteria) this;
        }

        public Criteria andProductdesc1In(List<String> values) {
            addCriterion("productDesc1 in", values, "productdesc1");
            return (Criteria) this;
        }

        public Criteria andProductdesc1NotIn(List<String> values) {
            addCriterion("productDesc1 not in", values, "productdesc1");
            return (Criteria) this;
        }

        public Criteria andProductdesc1Between(String value1, String value2) {
            addCriterion("productDesc1 between", value1, value2, "productdesc1");
            return (Criteria) this;
        }

        public Criteria andProductdesc1NotBetween(String value1, String value2) {
            addCriterion("productDesc1 not between", value1, value2, "productdesc1");
            return (Criteria) this;
        }

        public Criteria andProductdesc2IsNull() {
            addCriterion("productDesc2 is null");
            return (Criteria) this;
        }

        public Criteria andProductdesc2IsNotNull() {
            addCriterion("productDesc2 is not null");
            return (Criteria) this;
        }

        public Criteria andProductdesc2EqualTo(String value) {
            addCriterion("productDesc2 =", value, "productdesc2");
            return (Criteria) this;
        }

        public Criteria andProductdesc2NotEqualTo(String value) {
            addCriterion("productDesc2 <>", value, "productdesc2");
            return (Criteria) this;
        }

        public Criteria andProductdesc2GreaterThan(String value) {
            addCriterion("productDesc2 >", value, "productdesc2");
            return (Criteria) this;
        }

        public Criteria andProductdesc2GreaterThanOrEqualTo(String value) {
            addCriterion("productDesc2 >=", value, "productdesc2");
            return (Criteria) this;
        }

        public Criteria andProductdesc2LessThan(String value) {
            addCriterion("productDesc2 <", value, "productdesc2");
            return (Criteria) this;
        }

        public Criteria andProductdesc2LessThanOrEqualTo(String value) {
            addCriterion("productDesc2 <=", value, "productdesc2");
            return (Criteria) this;
        }

        public Criteria andProductdesc2Like(String value) {
            addCriterion("productDesc2 like", value, "productdesc2");
            return (Criteria) this;
        }

        public Criteria andProductdesc2NotLike(String value) {
            addCriterion("productDesc2 not like", value, "productdesc2");
            return (Criteria) this;
        }

        public Criteria andProductdesc2In(List<String> values) {
            addCriterion("productDesc2 in", values, "productdesc2");
            return (Criteria) this;
        }

        public Criteria andProductdesc2NotIn(List<String> values) {
            addCriterion("productDesc2 not in", values, "productdesc2");
            return (Criteria) this;
        }

        public Criteria andProductdesc2Between(String value1, String value2) {
            addCriterion("productDesc2 between", value1, value2, "productdesc2");
            return (Criteria) this;
        }

        public Criteria andProductdesc2NotBetween(String value1, String value2) {
            addCriterion("productDesc2 not between", value1, value2, "productdesc2");
            return (Criteria) this;
        }

        public Criteria andWeightIsNull() {
            addCriterion("weight is null");
            return (Criteria) this;
        }

        public Criteria andWeightIsNotNull() {
            addCriterion("weight is not null");
            return (Criteria) this;
        }

        public Criteria andWeightEqualTo(String value) {
            addCriterion("weight =", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightNotEqualTo(String value) {
            addCriterion("weight <>", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightGreaterThan(String value) {
            addCriterion("weight >", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightGreaterThanOrEqualTo(String value) {
            addCriterion("weight >=", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightLessThan(String value) {
            addCriterion("weight <", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightLessThanOrEqualTo(String value) {
            addCriterion("weight <=", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightLike(String value) {
            addCriterion("weight like", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightNotLike(String value) {
            addCriterion("weight not like", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightIn(List<String> values) {
            addCriterion("weight in", values, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightNotIn(List<String> values) {
            addCriterion("weight not in", values, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightBetween(String value1, String value2) {
            addCriterion("weight between", value1, value2, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightNotBetween(String value1, String value2) {
            addCriterion("weight not between", value1, value2, "weight");
            return (Criteria) this;
        }

        public Criteria andProductoriginIsNull() {
            addCriterion("productOrigin is null");
            return (Criteria) this;
        }

        public Criteria andProductoriginIsNotNull() {
            addCriterion("productOrigin is not null");
            return (Criteria) this;
        }

        public Criteria andProductoriginEqualTo(String value) {
            addCriterion("productOrigin =", value, "productorigin");
            return (Criteria) this;
        }

        public Criteria andProductoriginNotEqualTo(String value) {
            addCriterion("productOrigin <>", value, "productorigin");
            return (Criteria) this;
        }

        public Criteria andProductoriginGreaterThan(String value) {
            addCriterion("productOrigin >", value, "productorigin");
            return (Criteria) this;
        }

        public Criteria andProductoriginGreaterThanOrEqualTo(String value) {
            addCriterion("productOrigin >=", value, "productorigin");
            return (Criteria) this;
        }

        public Criteria andProductoriginLessThan(String value) {
            addCriterion("productOrigin <", value, "productorigin");
            return (Criteria) this;
        }

        public Criteria andProductoriginLessThanOrEqualTo(String value) {
            addCriterion("productOrigin <=", value, "productorigin");
            return (Criteria) this;
        }

        public Criteria andProductoriginLike(String value) {
            addCriterion("productOrigin like", value, "productorigin");
            return (Criteria) this;
        }

        public Criteria andProductoriginNotLike(String value) {
            addCriterion("productOrigin not like", value, "productorigin");
            return (Criteria) this;
        }

        public Criteria andProductoriginIn(List<String> values) {
            addCriterion("productOrigin in", values, "productorigin");
            return (Criteria) this;
        }

        public Criteria andProductoriginNotIn(List<String> values) {
            addCriterion("productOrigin not in", values, "productorigin");
            return (Criteria) this;
        }

        public Criteria andProductoriginBetween(String value1, String value2) {
            addCriterion("productOrigin between", value1, value2, "productorigin");
            return (Criteria) this;
        }

        public Criteria andProductoriginNotBetween(String value1, String value2) {
            addCriterion("productOrigin not between", value1, value2, "productorigin");
            return (Criteria) this;
        }

        public Criteria andProductbzIsNull() {
            addCriterion("productBz is null");
            return (Criteria) this;
        }

        public Criteria andProductbzIsNotNull() {
            addCriterion("productBz is not null");
            return (Criteria) this;
        }

        public Criteria andProductbzEqualTo(String value) {
            addCriterion("productBz =", value, "productbz");
            return (Criteria) this;
        }

        public Criteria andProductbzNotEqualTo(String value) {
            addCriterion("productBz <>", value, "productbz");
            return (Criteria) this;
        }

        public Criteria andProductbzGreaterThan(String value) {
            addCriterion("productBz >", value, "productbz");
            return (Criteria) this;
        }

        public Criteria andProductbzGreaterThanOrEqualTo(String value) {
            addCriterion("productBz >=", value, "productbz");
            return (Criteria) this;
        }

        public Criteria andProductbzLessThan(String value) {
            addCriterion("productBz <", value, "productbz");
            return (Criteria) this;
        }

        public Criteria andProductbzLessThanOrEqualTo(String value) {
            addCriterion("productBz <=", value, "productbz");
            return (Criteria) this;
        }

        public Criteria andProductbzLike(String value) {
            addCriterion("productBz like", value, "productbz");
            return (Criteria) this;
        }

        public Criteria andProductbzNotLike(String value) {
            addCriterion("productBz not like", value, "productbz");
            return (Criteria) this;
        }

        public Criteria andProductbzIn(List<String> values) {
            addCriterion("productBz in", values, "productbz");
            return (Criteria) this;
        }

        public Criteria andProductbzNotIn(List<String> values) {
            addCriterion("productBz not in", values, "productbz");
            return (Criteria) this;
        }

        public Criteria andProductbzBetween(String value1, String value2) {
            addCriterion("productBz between", value1, value2, "productbz");
            return (Criteria) this;
        }

        public Criteria andProductbzNotBetween(String value1, String value2) {
            addCriterion("productBz not between", value1, value2, "productbz");
            return (Criteria) this;
        }

        public Criteria andProductshapeIsNull() {
            addCriterion("productShape is null");
            return (Criteria) this;
        }

        public Criteria andProductshapeIsNotNull() {
            addCriterion("productShape is not null");
            return (Criteria) this;
        }

        public Criteria andProductshapeEqualTo(String value) {
            addCriterion("productShape =", value, "productshape");
            return (Criteria) this;
        }

        public Criteria andProductshapeNotEqualTo(String value) {
            addCriterion("productShape <>", value, "productshape");
            return (Criteria) this;
        }

        public Criteria andProductshapeGreaterThan(String value) {
            addCriterion("productShape >", value, "productshape");
            return (Criteria) this;
        }

        public Criteria andProductshapeGreaterThanOrEqualTo(String value) {
            addCriterion("productShape >=", value, "productshape");
            return (Criteria) this;
        }

        public Criteria andProductshapeLessThan(String value) {
            addCriterion("productShape <", value, "productshape");
            return (Criteria) this;
        }

        public Criteria andProductshapeLessThanOrEqualTo(String value) {
            addCriterion("productShape <=", value, "productshape");
            return (Criteria) this;
        }

        public Criteria andProductshapeLike(String value) {
            addCriterion("productShape like", value, "productshape");
            return (Criteria) this;
        }

        public Criteria andProductshapeNotLike(String value) {
            addCriterion("productShape not like", value, "productshape");
            return (Criteria) this;
        }

        public Criteria andProductshapeIn(List<String> values) {
            addCriterion("productShape in", values, "productshape");
            return (Criteria) this;
        }

        public Criteria andProductshapeNotIn(List<String> values) {
            addCriterion("productShape not in", values, "productshape");
            return (Criteria) this;
        }

        public Criteria andProductshapeBetween(String value1, String value2) {
            addCriterion("productShape between", value1, value2, "productshape");
            return (Criteria) this;
        }

        public Criteria andProductshapeNotBetween(String value1, String value2) {
            addCriterion("productShape not between", value1, value2, "productshape");
            return (Criteria) this;
        }

        public Criteria andPriceIsNull() {
            addCriterion("price is null");
            return (Criteria) this;
        }

        public Criteria andPriceIsNotNull() {
            addCriterion("price is not null");
            return (Criteria) this;
        }

        public Criteria andPriceEqualTo(String value) {
            addCriterion("price =", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotEqualTo(String value) {
            addCriterion("price <>", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThan(String value) {
            addCriterion("price >", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThanOrEqualTo(String value) {
            addCriterion("price >=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThan(String value) {
            addCriterion("price <", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThanOrEqualTo(String value) {
            addCriterion("price <=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLike(String value) {
            addCriterion("price like", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotLike(String value) {
            addCriterion("price not like", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceIn(List<String> values) {
            addCriterion("price in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotIn(List<String> values) {
            addCriterion("price not in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceBetween(String value1, String value2) {
            addCriterion("price between", value1, value2, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotBetween(String value1, String value2) {
            addCriterion("price not between", value1, value2, "price");
            return (Criteria) this;
        }

        public Criteria andProducttypeidIsNull() {
            addCriterion("producttypeid is null");
            return (Criteria) this;
        }

        public Criteria andProducttypeidIsNotNull() {
            addCriterion("producttypeid is not null");
            return (Criteria) this;
        }

        public Criteria andProducttypeidEqualTo(String value) {
            addCriterion("producttypeid =", value, "producttypeid");
            return (Criteria) this;
        }

        public Criteria andProducttypeidNotEqualTo(String value) {
            addCriterion("producttypeid <>", value, "producttypeid");
            return (Criteria) this;
        }

        public Criteria andProducttypeidGreaterThan(String value) {
            addCriterion("producttypeid >", value, "producttypeid");
            return (Criteria) this;
        }

        public Criteria andProducttypeidGreaterThanOrEqualTo(String value) {
            addCriterion("producttypeid >=", value, "producttypeid");
            return (Criteria) this;
        }

        public Criteria andProducttypeidLessThan(String value) {
            addCriterion("producttypeid <", value, "producttypeid");
            return (Criteria) this;
        }

        public Criteria andProducttypeidLessThanOrEqualTo(String value) {
            addCriterion("producttypeid <=", value, "producttypeid");
            return (Criteria) this;
        }

        public Criteria andProducttypeidLike(String value) {
            addCriterion("producttypeid like", value, "producttypeid");
            return (Criteria) this;
        }

        public Criteria andProducttypeidNotLike(String value) {
            addCriterion("producttypeid not like", value, "producttypeid");
            return (Criteria) this;
        }

        public Criteria andProducttypeidIn(List<String> values) {
            addCriterion("producttypeid in", values, "producttypeid");
            return (Criteria) this;
        }

        public Criteria andProducttypeidNotIn(List<String> values) {
            addCriterion("producttypeid not in", values, "producttypeid");
            return (Criteria) this;
        }

        public Criteria andProducttypeidBetween(String value1, String value2) {
            addCriterion("producttypeid between", value1, value2, "producttypeid");
            return (Criteria) this;
        }

        public Criteria andProducttypeidNotBetween(String value1, String value2) {
            addCriterion("producttypeid not between", value1, value2, "producttypeid");
            return (Criteria) this;
        }

        public Criteria andBrandidIsNull() {
            addCriterion("brandId is null");
            return (Criteria) this;
        }

        public Criteria andBrandidIsNotNull() {
            addCriterion("brandId is not null");
            return (Criteria) this;
        }

        public Criteria andBrandidEqualTo(String value) {
            addCriterion("brandId =", value, "brandid");
            return (Criteria) this;
        }

        public Criteria andBrandidNotEqualTo(String value) {
            addCriterion("brandId <>", value, "brandid");
            return (Criteria) this;
        }

        public Criteria andBrandidGreaterThan(String value) {
            addCriterion("brandId >", value, "brandid");
            return (Criteria) this;
        }

        public Criteria andBrandidGreaterThanOrEqualTo(String value) {
            addCriterion("brandId >=", value, "brandid");
            return (Criteria) this;
        }

        public Criteria andBrandidLessThan(String value) {
            addCriterion("brandId <", value, "brandid");
            return (Criteria) this;
        }

        public Criteria andBrandidLessThanOrEqualTo(String value) {
            addCriterion("brandId <=", value, "brandid");
            return (Criteria) this;
        }

        public Criteria andBrandidLike(String value) {
            addCriterion("brandId like", value, "brandid");
            return (Criteria) this;
        }

        public Criteria andBrandidNotLike(String value) {
            addCriterion("brandId not like", value, "brandid");
            return (Criteria) this;
        }

        public Criteria andBrandidIn(List<String> values) {
            addCriterion("brandId in", values, "brandid");
            return (Criteria) this;
        }

        public Criteria andBrandidNotIn(List<String> values) {
            addCriterion("brandId not in", values, "brandid");
            return (Criteria) this;
        }

        public Criteria andBrandidBetween(String value1, String value2) {
            addCriterion("brandId between", value1, value2, "brandid");
            return (Criteria) this;
        }

        public Criteria andBrandidNotBetween(String value1, String value2) {
            addCriterion("brandId not between", value1, value2, "brandid");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table tb_product
     *
     * @mbggenerated do_not_delete_during_merge
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table tb_product
     *
     * @mbggenerated
     */
    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

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

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value) {
            super();
            this.condition = condition;
            this.value = value;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }


        protected Criterion(String condition, Object value, Object secondValue) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.betweenValue = true;
        }

    }
}