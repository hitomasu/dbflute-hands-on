/*
 * Copyright 2004-2013 the Seasar Foundation and the Others.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND,
 * either express or implied. See the License for the specific language
 * governing permissions and limitations under the License.
 */
package org.dbflute.quickstage.dbflute.bsbhv;

import java.util.List;

import org.seasar.dbflute.*;
import org.seasar.dbflute.bhv.*;
import org.seasar.dbflute.cbean.*;
import org.seasar.dbflute.dbmeta.DBMeta;
import org.seasar.dbflute.exception.*;
import org.seasar.dbflute.optional.*;
import org.seasar.dbflute.outsidesql.executor.*;
import org.dbflute.quickstage.dbflute.exbhv.*;
import org.dbflute.quickstage.dbflute.exentity.*;
import org.dbflute.quickstage.dbflute.bsentity.dbmeta.*;
import org.dbflute.quickstage.dbflute.cbean.*;

/**
 * The behavior of SUMMARY_PRODUCT as VIEW. <br />
 * <pre>
 * [primary key]
 *     PRODUCT_ID
 *
 * [column]
 *     PRODUCT_ID, PRODUCT_NAME, PRODUCT_HANDLE_CODE, PRODUCT_STATUS_CODE, LATEST_PURCHASE_DATETIME
 *
 * [sequence]
 *     
 *
 * [identity]
 *     
 *
 * [version-no]
 *     
 *
 * [foreign table]
 *     PRODUCT_STATUS
 *
 * [referrer table]
 *     PURCHASE
 *
 * [foreign property]
 *     productStatus
 *
 * [referrer property]
 *     purchaseList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsSummaryProductBhv extends AbstractBehaviorWritable {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /*df:beginQueryPath*/
    /*df:endQueryPath*/

    // ===================================================================================
    //                                                                          Table name
    //                                                                          ==========
    /** @return The name on database of table. (NotNull) */
    public String getTableDbName() { return "SUMMARY_PRODUCT"; }

    // ===================================================================================
    //                                                                              DBMeta
    //                                                                              ======
    /** @return The instance of DBMeta. (NotNull) */
    public DBMeta getDBMeta() { return SummaryProductDbm.getInstance(); }

    /** @return The instance of DBMeta as my table type. (NotNull) */
    public SummaryProductDbm getMyDBMeta() { return SummaryProductDbm.getInstance(); }

    // ===================================================================================
    //                                                                        New Instance
    //                                                                        ============
    /** {@inheritDoc} */
    public Entity newEntity() { return newMyEntity(); }

    /** {@inheritDoc} */
    public ConditionBean newConditionBean() { return newMyConditionBean(); }

    /** @return The instance of new entity as my table type. (NotNull) */
    public SummaryProduct newMyEntity() { return new SummaryProduct(); }

    /** @return The instance of new condition-bean as my table type. (NotNull) */
    public SummaryProductCB newMyConditionBean() { return new SummaryProductCB(); }

    // ===================================================================================
    //                                                                        Count Select
    //                                                                        ============
    /**
     * Select the count of uniquely-selected records by the condition-bean. {IgnorePagingCondition, IgnoreSpecifyColumn}<br />
     * SpecifyColumn is ignored but you can use it only to remove text type column for union's distinct.
     * <pre>
     * SummaryProductCB cb = new SummaryProductCB();
     * cb.query().setFoo...(value);
     * int count = summaryProductBhv.<span style="color: #DD4747">selectCount</span>(cb);
     * </pre>
     * @param cb The condition-bean of SummaryProduct. (NotNull)
     * @return The count for the condition. (NotMinus)
     */
    public int selectCount(SummaryProductCB cb) {
        return doSelectCountUniquely(cb);
    }

    protected int doSelectCountUniquely(SummaryProductCB cb) { // called by selectCount(cb)
        assertCBStateValid(cb);
        return delegateSelectCountUniquely(cb);
    }

    protected int doSelectCountPlainly(SummaryProductCB cb) { // called by selectPage(cb)
        assertCBStateValid(cb);
        return delegateSelectCountPlainly(cb);
    }

    @Override
    protected int doReadCount(ConditionBean cb) {
        return selectCount(downcast(cb));
    }

    // ===================================================================================
    //                                                                       Entity Select
    //                                                                       =============
    /**
     * Select the entity by the condition-bean. #beforejava8 <br />
     * <span style="color: #AD4747; font-size: 120%">The return might be null if no data, so you should have null check.</span> <br />
     * <span style="color: #AD4747; font-size: 120%">If the data always exists as your business rule, use selectEntityWithDeletedCheck().</span>
     * <pre>
     * SummaryProductCB cb = new SummaryProductCB();
     * cb.query().setFoo...(value);
     * SummaryProduct summaryProduct = summaryProductBhv.<span style="color: #DD4747">selectEntity</span>(cb);
     * if (summaryProduct != null) { <span style="color: #3F7E5E">// null check</span>
     *     ... = summaryProduct.get...();
     * } else {
     *     ...
     * }
     * </pre>
     * @param cb The condition-bean of SummaryProduct. (NotNull)
     * @return The entity selected by the condition. (NullAllowed: if no data, it returns null)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public SummaryProduct selectEntity(SummaryProductCB cb) {
        return doSelectEntity(cb, SummaryProduct.class);
    }

    protected <ENTITY extends SummaryProduct> ENTITY doSelectEntity(SummaryProductCB cb, Class<ENTITY> tp) {
        assertCBStateValid(cb); assertObjectNotNull("entityType", tp);
        return helpSelectEntityInternally(cb, tp, new InternalSelectEntityCallback<ENTITY, SummaryProductCB>() {
            public List<ENTITY> callbackSelectList(SummaryProductCB lcb, Class<ENTITY> ltp) { return doSelectList(lcb, ltp); } });
    }

    protected <ENTITY extends SummaryProduct> OptionalEntity<ENTITY> doSelectOptionalEntity(SummaryProductCB cb, Class<ENTITY> tp) {
        return createOptionalEntity(doSelectEntity(cb, tp), cb);
    }

    @Override
    protected Entity doReadEntity(ConditionBean cb) {
        return selectEntity(downcast(cb));
    }

    /**
     * Select the entity by the condition-bean with deleted check. <br />
     * <span style="color: #AD4747; font-size: 120%">If the data always exists as your business rule, this method is good.</span>
     * <pre>
     * SummaryProductCB cb = new SummaryProductCB();
     * cb.query().setFoo...(value);
     * SummaryProduct summaryProduct = summaryProductBhv.<span style="color: #DD4747">selectEntityWithDeletedCheck</span>(cb);
     * ... = summaryProduct.get...(); <span style="color: #3F7E5E">// the entity always be not null</span>
     * </pre>
     * @param cb The condition-bean of SummaryProduct. (NotNull)
     * @return The entity selected by the condition. (NotNull: if no data, throws exception)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public SummaryProduct selectEntityWithDeletedCheck(SummaryProductCB cb) {
        return doSelectEntityWithDeletedCheck(cb, SummaryProduct.class);
    }

    protected <ENTITY extends SummaryProduct> ENTITY doSelectEntityWithDeletedCheck(SummaryProductCB cb, Class<ENTITY> tp) {
        assertCBStateValid(cb); assertObjectNotNull("entityType", tp);
        return helpSelectEntityWithDeletedCheckInternally(cb, tp, new InternalSelectEntityWithDeletedCheckCallback<ENTITY, SummaryProductCB>() {
            public List<ENTITY> callbackSelectList(SummaryProductCB lcb, Class<ENTITY> ltp) { return doSelectList(lcb, ltp); } });
    }

    @Override
    protected Entity doReadEntityWithDeletedCheck(ConditionBean cb) {
        return selectEntityWithDeletedCheck(downcast(cb));
    }

    /**
     * Select the entity by the primary-key value.
     * @param productId : PK, INTEGER(10). (NotNull)
     * @return The entity selected by the PK. (NullAllowed: if no data, it returns null)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public SummaryProduct selectByPKValue(Integer productId) {
        return doSelectByPK(productId, SummaryProduct.class);
    }

    protected <ENTITY extends SummaryProduct> ENTITY doSelectByPK(Integer productId, Class<ENTITY> entityType) {
        return doSelectEntity(xprepareCBAsPK(productId), entityType);
    }

    protected <ENTITY extends SummaryProduct> OptionalEntity<ENTITY> doSelectOptionalByPK(Integer productId, Class<ENTITY> entityType) {
        return createOptionalEntity(doSelectByPK(productId, entityType), productId);
    }

    /**
     * Select the entity by the primary-key value with deleted check.
     * @param productId : PK, INTEGER(10). (NotNull)
     * @return The entity selected by the PK. (NotNull: if no data, throws exception)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public SummaryProduct selectByPKValueWithDeletedCheck(Integer productId) {
        return doSelectByPKWithDeletedCheck(productId, SummaryProduct.class);
    }

    protected <ENTITY extends SummaryProduct> ENTITY doSelectByPKWithDeletedCheck(Integer productId, Class<ENTITY> entityType) {
        return doSelectEntityWithDeletedCheck(xprepareCBAsPK(productId), entityType);
    }

    protected SummaryProductCB xprepareCBAsPK(Integer productId) {
        assertObjectNotNull("productId", productId);
        SummaryProductCB cb = newMyConditionBean(); cb.acceptPrimaryKey(productId);
        return cb;
    }

    /**
     * Select the entity by the unique-key value.
     * @param productHandleCode : UQ, VARCHAR(100). (NotNull)
     * @return The optional entity selected by the unique key. (NotNull: if no data, empty entity)
     * @exception EntityAlreadyDeletedException When get(), required() of return value is called and the value is null, which means entity has already been deleted (not found).
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public OptionalEntity<SummaryProduct> selectByUniqueOf(String productHandleCode) {
        return doSelectByUniqueOf(productHandleCode, SummaryProduct.class);
    }

    protected <ENTITY extends SummaryProduct> OptionalEntity<ENTITY> doSelectByUniqueOf(String productHandleCode, Class<ENTITY> entityType) {
        return createOptionalEntity(doSelectEntity(xprepareCBAsUniqueOf(productHandleCode), entityType), productHandleCode);
    }

    protected SummaryProductCB xprepareCBAsUniqueOf(String productHandleCode) {
        assertObjectNotNull("productHandleCode", productHandleCode);
        SummaryProductCB cb = newMyConditionBean(); cb.acceptUniqueOf(productHandleCode);
        return cb;
    }

    // ===================================================================================
    //                                                                         List Select
    //                                                                         ===========
    /**
     * Select the list as result bean.
     * <pre>
     * SummaryProductCB cb = new SummaryProductCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * ListResultBean&lt;SummaryProduct&gt; summaryProductList = summaryProductBhv.<span style="color: #DD4747">selectList</span>(cb);
     * for (SummaryProduct summaryProduct : summaryProductList) {
     *     ... = summaryProduct.get...();
     * }
     * </pre>
     * @param cb The condition-bean of SummaryProduct. (NotNull)
     * @return The result bean of selected list. (NotNull: if no data, returns empty list)
     * @exception DangerousResultSizeException When the result size is over the specified safety size.
     */
    public ListResultBean<SummaryProduct> selectList(SummaryProductCB cb) {
        return doSelectList(cb, SummaryProduct.class);
    }

    protected <ENTITY extends SummaryProduct> ListResultBean<ENTITY> doSelectList(SummaryProductCB cb, Class<ENTITY> tp) {
        assertCBStateValid(cb); assertObjectNotNull("entityType", tp);
        assertSpecifyDerivedReferrerEntityProperty(cb, tp);
        return helpSelectListInternally(cb, tp, new InternalSelectListCallback<ENTITY, SummaryProductCB>() {
            public List<ENTITY> callbackSelectList(SummaryProductCB lcb, Class<ENTITY> ltp) { return delegateSelectList(lcb, ltp); } });
    }

    @Override
    protected ListResultBean<? extends Entity> doReadList(ConditionBean cb) {
        return selectList(downcast(cb));
    }

    // ===================================================================================
    //                                                                         Page Select
    //                                                                         ===========
    /**
     * Select the page as result bean. <br />
     * (both count-select and paging-select are executed)
     * <pre>
     * SummaryProductCB cb = new SummaryProductCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * cb.<span style="color: #DD4747">paging</span>(20, 3); <span style="color: #3F7E5E">// 20 records per a page and current page number is 3</span>
     * PagingResultBean&lt;SummaryProduct&gt; page = summaryProductBhv.<span style="color: #DD4747">selectPage</span>(cb);
     * int allRecordCount = page.getAllRecordCount();
     * int allPageCount = page.getAllPageCount();
     * boolean isExistPrePage = page.isExistPrePage();
     * boolean isExistNextPage = page.isExistNextPage();
     * ...
     * for (SummaryProduct summaryProduct : page) {
     *     ... = summaryProduct.get...();
     * }
     * </pre>
     * @param cb The condition-bean of SummaryProduct. (NotNull)
     * @return The result bean of selected page. (NotNull: if no data, returns bean as empty list)
     * @exception DangerousResultSizeException When the result size is over the specified safety size.
     */
    public PagingResultBean<SummaryProduct> selectPage(SummaryProductCB cb) {
        return doSelectPage(cb, SummaryProduct.class);
    }

    protected <ENTITY extends SummaryProduct> PagingResultBean<ENTITY> doSelectPage(SummaryProductCB cb, Class<ENTITY> tp) {
        assertCBStateValid(cb); assertObjectNotNull("entityType", tp);
        return helpSelectPageInternally(cb, tp, new InternalSelectPageCallback<ENTITY, SummaryProductCB>() {
            public int callbackSelectCount(SummaryProductCB cb) { return doSelectCountPlainly(cb); }
            public List<ENTITY> callbackSelectList(SummaryProductCB cb, Class<ENTITY> tp) { return doSelectList(cb, tp); }
        });
    }

    @Override
    protected PagingResultBean<? extends Entity> doReadPage(ConditionBean cb) {
        return selectPage(downcast(cb));
    }

    // ===================================================================================
    //                                                                       Cursor Select
    //                                                                       =============
    /**
     * Select the cursor by the condition-bean.
     * <pre>
     * SummaryProductCB cb = new SummaryProductCB();
     * cb.query().setFoo...(value);
     * summaryProductBhv.<span style="color: #DD4747">selectCursor</span>(cb, new EntityRowHandler&lt;SummaryProduct&gt;() {
     *     public void handle(SummaryProduct entity) {
     *         ... = entity.getFoo...();
     *     }
     * });
     * </pre>
     * @param cb The condition-bean of SummaryProduct. (NotNull)
     * @param entityRowHandler The handler of entity row of SummaryProduct. (NotNull)
     */
    public void selectCursor(SummaryProductCB cb, EntityRowHandler<SummaryProduct> entityRowHandler) {
        doSelectCursor(cb, entityRowHandler, SummaryProduct.class);
    }

    protected <ENTITY extends SummaryProduct> void doSelectCursor(SummaryProductCB cb, EntityRowHandler<ENTITY> handler, Class<ENTITY> tp) {
        assertCBStateValid(cb); assertObjectNotNull("entityRowHandler", handler); assertObjectNotNull("entityType", tp);
        assertSpecifyDerivedReferrerEntityProperty(cb, tp);
        helpSelectCursorInternally(cb, handler, tp, new InternalSelectCursorCallback<ENTITY, SummaryProductCB>() {
            public void callbackSelectCursor(SummaryProductCB cb, EntityRowHandler<ENTITY> handler, Class<ENTITY> tp) { delegateSelectCursor(cb, handler, tp); }
            public List<ENTITY> callbackSelectList(SummaryProductCB cb, Class<ENTITY> tp) { return doSelectList(cb, tp); }
        });
    }

    // ===================================================================================
    //                                                                       Scalar Select
    //                                                                       =============
    /**
     * Select the scalar value derived by a function from uniquely-selected records. <br />
     * You should call a function method after this method called like as follows:
     * <pre>
     * summaryProductBhv.<span style="color: #DD4747">scalarSelect</span>(Date.class).max(new ScalarQuery() {
     *     public void query(SummaryProductCB cb) {
     *         cb.specify().<span style="color: #DD4747">columnFooDatetime()</span>; <span style="color: #3F7E5E">// required for a function</span>
     *         cb.query().setBarName_PrefixSearch("S");
     *     }
     * });
     * </pre>
     * @param <RESULT> The type of result.
     * @param resultType The type of result. (NotNull)
     * @return The scalar function object to specify function for scalar value. (NotNull)
     */
    public <RESULT> SLFunction<SummaryProductCB, RESULT> scalarSelect(Class<RESULT> resultType) {
        return doScalarSelect(resultType, newMyConditionBean());
    }

    protected <RESULT, CB extends SummaryProductCB> SLFunction<CB, RESULT> doScalarSelect(Class<RESULT> tp, CB cb) {
        assertObjectNotNull("resultType", tp); assertCBStateValid(cb);
        cb.xsetupForScalarSelect(); cb.getSqlClause().disableSelectIndex(); // for when you use union
        return createSLFunction(cb, tp);
    }

    protected <RESULT, CB extends SummaryProductCB> SLFunction<CB, RESULT> createSLFunction(CB cb, Class<RESULT> tp) {
        return new SLFunction<CB, RESULT>(cb, tp);
    }

    protected <RESULT> SLFunction<? extends ConditionBean, RESULT> doReadScalar(Class<RESULT> tp) {
        return doScalarSelect(tp, newMyConditionBean());
    }

    // ===================================================================================
    //                                                                            Sequence
    //                                                                            ========
    @Override
    protected Number doReadNextVal() {
        String msg = "This table is NOT related to sequence: " + getTableDbName();
        throw new UnsupportedOperationException(msg);
    }

    // ===================================================================================
    //                                                                       Load Referrer
    //                                                                       =============
    /**
     * Load referrer of purchaseList by the set-upper of referrer. <br />
     * (購入)PURCHASE by PRODUCT_ID, named 'purchaseList'.
     * <pre>
     * summaryProductBhv.<span style="color: #DD4747">loadPurchaseList</span>(summaryProductList, new ConditionBeanSetupper&lt;PurchaseCB&gt;() {
     *     public void setup(PurchaseCB cb) {
     *         cb.setupSelect...();
     *         cb.query().setFoo...(value);
     *         cb.query().addOrderBy_Bar...();
     *     }
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedList(referrerList -&gt {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * for (SummaryProduct summaryProduct : summaryProductList) {
     *     ... = summaryProduct.<span style="color: #DD4747">getPurchaseList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br />
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setProductId_InScope(pkList);
     * cb.query().addOrderBy_ProductId_Asc();
     * </pre>
     * @param summaryProductList The entity list of summaryProduct. (NotNull)
     * @param setupper The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoader<Purchase> loadPurchaseList(List<SummaryProduct> summaryProductList, ConditionBeanSetupper<PurchaseCB> setupper) {
        xassLRArg(summaryProductList, setupper);
        return doLoadPurchaseList(summaryProductList, new LoadReferrerOption<PurchaseCB, Purchase>().xinit(setupper));
    }

    /**
     * Load referrer of purchaseList by the set-upper of referrer. <br />
     * (購入)PURCHASE by PRODUCT_ID, named 'purchaseList'.
     * <pre>
     * summaryProductBhv.<span style="color: #DD4747">loadPurchaseList</span>(summaryProductList, new ConditionBeanSetupper&lt;PurchaseCB&gt;() {
     *     public void setup(PurchaseCB cb) {
     *         cb.setupSelect...();
     *         cb.query().setFoo...(value);
     *         cb.query().addOrderBy_Bar...();
     *     }
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedList(referrerList -&gt {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * ... = summaryProduct.<span style="color: #DD4747">getPurchaseList()</span>;
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br />
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setProductId_InScope(pkList);
     * cb.query().addOrderBy_ProductId_Asc();
     * </pre>
     * @param summaryProduct The entity of summaryProduct. (NotNull)
     * @param setupper The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoader<Purchase> loadPurchaseList(SummaryProduct summaryProduct, ConditionBeanSetupper<PurchaseCB> setupper) {
        xassLRArg(summaryProduct, setupper);
        return doLoadPurchaseList(xnewLRLs(summaryProduct), new LoadReferrerOption<PurchaseCB, Purchase>().xinit(setupper));
    }

    /**
     * {Refer to overload method that has an argument of the list of entity.} #beforejava8
     * @param summaryProduct The entity of summaryProduct. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoader<Purchase> loadPurchaseList(SummaryProduct summaryProduct, LoadReferrerOption<PurchaseCB, Purchase> loadReferrerOption) {
        xassLRArg(summaryProduct, loadReferrerOption);
        return loadPurchaseList(xnewLRLs(summaryProduct), loadReferrerOption);
    }

    /**
     * {Refer to overload method that has an argument of condition-bean setupper.} #beforejava8
     * @param summaryProductList The entity list of summaryProduct. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    @SuppressWarnings("unchecked")
    public NestedReferrerLoader<Purchase> loadPurchaseList(List<SummaryProduct> summaryProductList, LoadReferrerOption<PurchaseCB, Purchase> loadReferrerOption) {
        xassLRArg(summaryProductList, loadReferrerOption);
        if (summaryProductList.isEmpty()) { return (NestedReferrerLoader<Purchase>)EMPTY_LOADER; }
        return doLoadPurchaseList(summaryProductList, loadReferrerOption);
    }

    protected NestedReferrerLoader<Purchase> doLoadPurchaseList(List<SummaryProduct> summaryProductList, LoadReferrerOption<PurchaseCB, Purchase> option) {
        final PurchaseBhv referrerBhv = xgetBSFLR().select(PurchaseBhv.class);
        return helpLoadReferrerInternally(summaryProductList, option, new InternalLoadReferrerCallback<SummaryProduct, Integer, PurchaseCB, Purchase>() {
            public Integer getPKVal(SummaryProduct et)
            { return et.getProductId(); }
            public void setRfLs(SummaryProduct et, List<Purchase> ls)
            { et.setPurchaseList(ls); }
            public PurchaseCB newMyCB() { return referrerBhv.newMyConditionBean(); }
            public void qyFKIn(PurchaseCB cb, List<Integer> ls)
            { cb.query().setProductId_InScope(ls); }
            public void qyOdFKAsc(PurchaseCB cb) { cb.query().addOrderBy_ProductId_Asc(); }
            public void spFKCol(PurchaseCB cb) { cb.specify().columnProductId(); }
            public List<Purchase> selRfLs(PurchaseCB cb) { return referrerBhv.selectList(cb); }
            public Integer getFKVal(Purchase re) { return re.getProductId(); }
            public void setlcEt(Purchase re, SummaryProduct le)
            { re.setSummaryProduct(le); }
            public String getRfPrNm() { return "purchaseList"; }
        });
    }

    // ===================================================================================
    //                                                                   Pull out Relation
    //                                                                   =================
    /**
     * Pull out the list of foreign table 'ProductStatus'.
     * @param summaryProductList The list of summaryProduct. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<ProductStatus> pulloutProductStatus(List<SummaryProduct> summaryProductList) {
        return helpPulloutInternally(summaryProductList, new InternalPulloutCallback<SummaryProduct, ProductStatus>() {
            public ProductStatus getFr(SummaryProduct et)
            { return et.getProductStatus(); }
            public boolean hasRf() { return true; }
            public void setRfLs(ProductStatus et, List<SummaryProduct> ls)
            { et.setSummaryProductList(ls); }
        });
    }

    // ===================================================================================
    //                                                                      Extract Column
    //                                                                      ==============
    /**
     * Extract the value list of (single) primary key productId.
     * @param summaryProductList The list of summaryProduct. (NotNull, EmptyAllowed)
     * @return The list of the column value. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<Integer> extractProductIdList(List<SummaryProduct> summaryProductList) {
        return helpExtractListInternally(summaryProductList, new InternalExtractCallback<SummaryProduct, Integer>() {
            public Integer getCV(SummaryProduct et) { return et.getProductId(); }
        });
    }

    /**
     * Extract the value list of (single) unique key productHandleCode.
     * @param summaryProductList The list of summaryProduct. (NotNull, EmptyAllowed)
     * @return The list of the column value. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<String> extractProductHandleCodeList(List<SummaryProduct> summaryProductList) {
        return helpExtractListInternally(summaryProductList, new InternalExtractCallback<SummaryProduct, String>() {
            public String getCV(SummaryProduct et) { return et.getProductHandleCode(); }
        });
    }

    // ===================================================================================
    //                                                                       Entity Update
    //                                                                       =============
    /**
     * Insert the entity modified-only. (DefaultConstraintsEnabled)
     * <pre>
     * SummaryProduct summaryProduct = new SummaryProduct();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * summaryProduct.setFoo...(value);
     * summaryProduct.setBar...(value);
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//summaryProduct.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//summaryProduct.set...;</span>
     * summaryProductBhv.<span style="color: #DD4747">insert</span>(summaryProduct);
     * ... = summaryProduct.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * <p>While, when the entity is created by select, all columns are registered.</p>
     * @param summaryProduct The entity of insert target. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insert(SummaryProduct summaryProduct) {
        doInsert(summaryProduct, null);
    }

    protected void doInsert(SummaryProduct summaryProduct, InsertOption<SummaryProductCB> op) {
        assertObjectNotNull("summaryProduct", summaryProduct);
        prepareInsertOption(op);
        delegateInsert(summaryProduct, op);
    }

    protected void prepareInsertOption(InsertOption<SummaryProductCB> op) {
        if (op == null) { return; }
        assertInsertOptionStatus(op);
        if (op.hasSpecifiedInsertColumn()) {
            op.resolveInsertColumnSpecification(createCBForSpecifiedUpdate());
        }
    }

    @Override
    protected void doCreate(Entity et, InsertOption<? extends ConditionBean> op) {
        if (op == null) { insert(downcast(et)); }
        else { varyingInsert(downcast(et), downcast(op)); }
    }

    /**
     * Update the entity modified-only. (ZeroUpdateException, NonExclusiveControl)
     * <pre>
     * SummaryProduct summaryProduct = new SummaryProduct();
     * summaryProduct.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * summaryProduct.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//summaryProduct.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//summaryProduct.set...;</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of exclusive control column is required</span>
     * summaryProduct.<span style="color: #DD4747">setVersionNo</span>(value);
     * try {
     *     summaryProductBhv.<span style="color: #DD4747">update</span>(summaryProduct);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param summaryProduct The entity of update target. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnRequired)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void update(final SummaryProduct summaryProduct) {
        doUpdate(summaryProduct, null);
    }

    protected void doUpdate(SummaryProduct summaryProduct, final UpdateOption<SummaryProductCB> op) {
        assertObjectNotNull("summaryProduct", summaryProduct);
        prepareUpdateOption(op);
        helpUpdateInternally(summaryProduct, new InternalUpdateCallback<SummaryProduct>() {
            public int callbackDelegateUpdate(SummaryProduct et) { return delegateUpdate(et, op); } });
    }

    protected void prepareUpdateOption(UpdateOption<SummaryProductCB> op) {
        if (op == null) { return; }
        assertUpdateOptionStatus(op);
        if (op.hasSelfSpecification()) {
            op.resolveSelfSpecification(createCBForVaryingUpdate());
        }
        if (op.hasSpecifiedUpdateColumn()) {
            op.resolveUpdateColumnSpecification(createCBForSpecifiedUpdate());
        }
    }

    protected SummaryProductCB createCBForVaryingUpdate() {
        SummaryProductCB cb = newMyConditionBean();
        cb.xsetupForVaryingUpdate();
        return cb;
    }

    protected SummaryProductCB createCBForSpecifiedUpdate() {
        SummaryProductCB cb = newMyConditionBean();
        cb.xsetupForSpecifiedUpdate();
        return cb;
    }

    @Override
    protected void doModify(Entity et, UpdateOption<? extends ConditionBean> op) {
        if (op == null) { update(downcast(et)); }
        else { varyingUpdate(downcast(et), downcast(op)); }
    }

    @Override
    protected void doModifyNonstrict(Entity et, UpdateOption<? extends ConditionBean> op) {
        doModify(et, op);
    }

    /**
     * Insert or update the entity modified-only. (DefaultConstraintsEnabled, NonExclusiveControl) <br />
     * if (the entity has no PK) { insert() } else { update(), but no data, insert() } <br />
     * <p><span style="color: #DD4747; font-size: 120%">Attention, you cannot update by unique keys instead of PK.</span></p>
     * @param summaryProduct The entity of insert or update target. (NotNull)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insertOrUpdate(SummaryProduct summaryProduct) {
        doInesrtOrUpdate(summaryProduct, null, null);
    }

    protected void doInesrtOrUpdate(SummaryProduct summaryProduct, final InsertOption<SummaryProductCB> iop, final UpdateOption<SummaryProductCB> uop) {
        helpInsertOrUpdateInternally(summaryProduct, new InternalInsertOrUpdateCallback<SummaryProduct, SummaryProductCB>() {
            public void callbackInsert(SummaryProduct et) { doInsert(et, iop); }
            public void callbackUpdate(SummaryProduct et) { doUpdate(et, uop); }
            public SummaryProductCB callbackNewMyConditionBean() { return newMyConditionBean(); }
            public int callbackSelectCount(SummaryProductCB cb) { return selectCount(cb); }
        });
    }

    @Override
    protected void doCreateOrModify(Entity et, InsertOption<? extends ConditionBean> iop, UpdateOption<? extends ConditionBean> uop) {
        if (iop == null && uop == null) { insertOrUpdate(downcast(et)); }
        else {
            iop = iop != null ? iop : new InsertOption<SummaryProductCB>();
            uop = uop != null ? uop : new UpdateOption<SummaryProductCB>();
            varyingInsertOrUpdate(downcast(et), downcast(iop), downcast(uop));
        }
    }

    @Override
    protected void doCreateOrModifyNonstrict(Entity et, InsertOption<? extends ConditionBean> iop, UpdateOption<? extends ConditionBean> uop) {
        doCreateOrModify(et, iop, uop);
    }

    /**
     * Delete the entity. (ZeroUpdateException, NonExclusiveControl)
     * <pre>
     * SummaryProduct summaryProduct = new SummaryProduct();
     * summaryProduct.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of exclusive control column is required</span>
     * summaryProduct.<span style="color: #DD4747">setVersionNo</span>(value);
     * try {
     *     summaryProductBhv.<span style="color: #DD4747">delete</span>(summaryProduct);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param summaryProduct The entity of delete target. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnRequired)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     */
    public void delete(SummaryProduct summaryProduct) {
        doDelete(summaryProduct, null);
    }

    protected void doDelete(SummaryProduct summaryProduct, final DeleteOption<SummaryProductCB> op) {
        assertObjectNotNull("summaryProduct", summaryProduct);
        prepareDeleteOption(op);
        helpDeleteInternally(summaryProduct, new InternalDeleteCallback<SummaryProduct>() {
            public int callbackDelegateDelete(SummaryProduct et) { return delegateDelete(et, op); } });
    }

    protected void prepareDeleteOption(DeleteOption<SummaryProductCB> op) {
        if (op == null) { return; }
        assertDeleteOptionStatus(op);
    }

    @Override
    protected void doRemove(Entity et, DeleteOption<? extends ConditionBean> op) {
        if (op == null) { delete(downcast(et)); }
        else { varyingDelete(downcast(et), downcast(op)); }
    }

    @Override
    protected void doRemoveNonstrict(Entity et, DeleteOption<? extends ConditionBean> op) {
        doRemove(et, op);
    }

    // ===================================================================================
    //                                                                        Batch Update
    //                                                                        ============
    /**
     * Batch-insert the entity list modified-only of same-set columns. (DefaultConstraintsEnabled) <br />
     * This method uses executeBatch() of java.sql.PreparedStatement. <br />
     * <p><span style="color: #DD4747; font-size: 120%">The columns of least common multiple are registered like this:</span></p>
     * <pre>
     * for (... : ...) {
     *     SummaryProduct summaryProduct = new SummaryProduct();
     *     summaryProduct.setFooName("foo");
     *     if (...) {
     *         summaryProduct.setFooPrice(123);
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are registered</span>
     *     <span style="color: #3F7E5E">// FOO_PRICE not-called in any entities are registered as null without default value</span>
     *     <span style="color: #3F7E5E">// columns not-called in all entities are registered as null or default value</span>
     *     summaryProductList.add(summaryProduct);
     * }
     * summaryProductBhv.<span style="color: #DD4747">batchInsert</span>(summaryProductList);
     * </pre>
     * <p>While, when the entities are created by select, all columns are registered.</p>
     * <p>And if the table has an identity, entities after the process don't have incremented values.
     * (When you use the (normal) insert(), you can get the incremented value from your entity)</p>
     * @param summaryProductList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNullAllowed: when auto-increment)
     * @return The array of inserted count. (NotNull, EmptyAllowed)
     */
    public int[] batchInsert(List<SummaryProduct> summaryProductList) {
        InsertOption<SummaryProductCB> op = createInsertUpdateOption();
        return doBatchInsert(summaryProductList, op);
    }

    protected int[] doBatchInsert(List<SummaryProduct> summaryProductList, InsertOption<SummaryProductCB> op) {
        assertObjectNotNull("summaryProductList", summaryProductList);
        prepareBatchInsertOption(summaryProductList, op);
        return delegateBatchInsert(summaryProductList, op);
    }

    protected void prepareBatchInsertOption(List<SummaryProduct> summaryProductList, InsertOption<SummaryProductCB> op) {
        op.xallowInsertColumnModifiedPropertiesFragmented();
        op.xacceptInsertColumnModifiedPropertiesIfNeeds(summaryProductList);
        prepareInsertOption(op);
    }

    @Override
    protected int[] doLumpCreate(List<Entity> ls, InsertOption<? extends ConditionBean> op) {
        if (op == null) { return batchInsert(downcast(ls)); }
        else { return varyingBatchInsert(downcast(ls), downcast(op)); }
    }

    /**
     * Batch-update the entity list modified-only of same-set columns. (NonExclusiveControl) <br />
     * This method uses executeBatch() of java.sql.PreparedStatement. <br />
     * <span style="color: #DD4747; font-size: 120%">You should specify same-set columns to all entities like this:</span>
     * <pre>
     * for (... : ...) {
     *     SummaryProduct summaryProduct = new SummaryProduct();
     *     summaryProduct.setFooName("foo");
     *     if (...) {
     *         summaryProduct.setFooPrice(123);
     *     } else {
     *         summaryProduct.setFooPrice(null); <span style="color: #3F7E5E">// updated as null</span>
     *         <span style="color: #3F7E5E">//summaryProduct.setFooDate(...); // *not allowed, fragmented</span>
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are updated</span>
     *     <span style="color: #3F7E5E">// (others are not updated: their values are kept)</span>
     *     summaryProductList.add(summaryProduct);
     * }
     * summaryProductBhv.<span style="color: #DD4747">batchUpdate</span>(summaryProductList);
     * </pre>
     * @param summaryProductList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchUpdate(List<SummaryProduct> summaryProductList) {
        UpdateOption<SummaryProductCB> op = createPlainUpdateOption();
        return doBatchUpdate(summaryProductList, op);
    }

    protected int[] doBatchUpdate(List<SummaryProduct> summaryProductList, UpdateOption<SummaryProductCB> op) {
        assertObjectNotNull("summaryProductList", summaryProductList);
        prepareBatchUpdateOption(summaryProductList, op);
        return delegateBatchUpdate(summaryProductList, op);
    }

    protected void prepareBatchUpdateOption(List<SummaryProduct> summaryProductList, UpdateOption<SummaryProductCB> op) {
        op.xacceptUpdateColumnModifiedPropertiesIfNeeds(summaryProductList);
        prepareUpdateOption(op);
    }

    @Override
    protected int[] doLumpModify(List<Entity> ls, UpdateOption<? extends ConditionBean> op) {
        if (op == null) { return batchUpdate(downcast(ls)); }
        else { return varyingBatchUpdate(downcast(ls), downcast(op)); }
    }

    /**
     * Batch-update the entity list specified-only. (NonExclusiveControl) <br />
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * <pre>
     * <span style="color: #3F7E5E">// e.g. update two columns only</span>
     * summaryProductBhv.<span style="color: #DD4747">batchUpdate</span>(summaryProductList, new SpecifyQuery<SummaryProductCB>() {
     *     public void specify(SummaryProductCB cb) { <span style="color: #3F7E5E">// the two only updated</span>
     *         cb.specify().<span style="color: #DD4747">columnFooStatusCode()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     *         cb.specify().<span style="color: #DD4747">columnBarDate()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     *     }
     * });
     * <span style="color: #3F7E5E">// e.g. update every column in the table</span>
     * summaryProductBhv.<span style="color: #DD4747">batchUpdate</span>(summaryProductList, new SpecifyQuery<SummaryProductCB>() {
     *     public void specify(SummaryProductCB cb) { <span style="color: #3F7E5E">// all columns are updated</span>
     *         cb.specify().<span style="color: #DD4747">columnEveryColumn()</span>; <span style="color: #3F7E5E">// no check of modified properties</span>
     *     }
     * });
     * </pre>
     * <p>You can specify update columns used on set clause of update statement.
     * However you do not need to specify common columns for update
     * and an optimistic lock column because they are specified implicitly.</p>
     * <p>And you should specify columns that are modified in any entities (at least one entity).
     * But if you specify every column, it has no check.</p>
     * @param summaryProductList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param updateColumnSpec The specification of update columns. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchUpdate(List<SummaryProduct> summaryProductList, SpecifyQuery<SummaryProductCB> updateColumnSpec) {
        return doBatchUpdate(summaryProductList, createSpecifiedUpdateOption(updateColumnSpec));
    }

    @Override
    protected int[] doLumpModifyNonstrict(List<Entity> ls, UpdateOption<? extends ConditionBean> op) {
        return doLumpModify(ls, op);
    }

    /**
     * Batch-delete the entity list. (NonExclusiveControl) <br />
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * @param summaryProductList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchDelete(List<SummaryProduct> summaryProductList) {
        return doBatchDelete(summaryProductList, null);
    }

    protected int[] doBatchDelete(List<SummaryProduct> summaryProductList, DeleteOption<SummaryProductCB> op) {
        assertObjectNotNull("summaryProductList", summaryProductList);
        prepareDeleteOption(op);
        return delegateBatchDelete(summaryProductList, op);
    }

    @Override
    protected int[] doLumpRemove(List<Entity> ls, DeleteOption<? extends ConditionBean> op) {
        if (op == null) { return batchDelete(downcast(ls)); }
        else { return varyingBatchDelete(downcast(ls), downcast(op)); }
    }

    @Override
    protected int[] doLumpRemoveNonstrict(List<Entity> ls, DeleteOption<? extends ConditionBean> op) {
        return doLumpRemove(ls, op);
    }

    // ===================================================================================
    //                                                                        Query Update
    //                                                                        ============
    /**
     * Insert the several entities by query (modified-only for fixed value).
     * <pre>
     * summaryProductBhv.<span style="color: #DD4747">queryInsert</span>(new QueryInsertSetupper&lt;SummaryProduct, SummaryProductCB&gt;() {
     *     public ConditionBean setup(summaryProduct entity, SummaryProductCB intoCB) {
     *         FooCB cb = FooCB();
     *         cb.setupSelect_Bar();
     *
     *         <span style="color: #3F7E5E">// mapping</span>
     *         intoCB.specify().columnMyName().mappedFrom(cb.specify().columnFooName());
     *         intoCB.specify().columnMyCount().mappedFrom(cb.specify().columnFooCount());
     *         intoCB.specify().columnMyDate().mappedFrom(cb.specify().specifyBar().columnBarDate());
     *         entity.setMyFixedValue("foo"); <span style="color: #3F7E5E">// fixed value</span>
     *         <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     *         <span style="color: #3F7E5E">//entity.setRegisterUser(value);</span>
     *         <span style="color: #3F7E5E">//entity.set...;</span>
     *         <span style="color: #3F7E5E">// you don't need to set a value of exclusive control column</span>
     *         <span style="color: #3F7E5E">//entity.setVersionNo(value);</span>
     *
     *         return cb;
     *     }
     * });
     * </pre>
     * @param setupper The setup-per of query-insert. (NotNull)
     * @return The inserted count.
     */
    public int queryInsert(QueryInsertSetupper<SummaryProduct, SummaryProductCB> setupper) {
        return doQueryInsert(setupper, null);
    }

    protected int doQueryInsert(QueryInsertSetupper<SummaryProduct, SummaryProductCB> sp, InsertOption<SummaryProductCB> op) {
        assertObjectNotNull("setupper", sp);
        prepareInsertOption(op);
        SummaryProduct e = new SummaryProduct();
        SummaryProductCB cb = createCBForQueryInsert();
        return delegateQueryInsert(e, cb, sp.setup(e, cb), op);
    }

    protected SummaryProductCB createCBForQueryInsert() {
        SummaryProductCB cb = newMyConditionBean();
        cb.xsetupForQueryInsert();
        return cb;
    }

    @Override
    protected int doRangeCreate(QueryInsertSetupper<? extends Entity, ? extends ConditionBean> setupper, InsertOption<? extends ConditionBean> option) {
        if (option == null) { return queryInsert(downcast(setupper)); }
        else { return varyingQueryInsert(downcast(setupper), downcast(option)); }
    }

    /**
     * Update the several entities by query non-strictly modified-only. (NonExclusiveControl)
     * <pre>
     * SummaryProduct summaryProduct = new SummaryProduct();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//summaryProduct.setPK...(value);</span>
     * summaryProduct.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//summaryProduct.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//summaryProduct.set...;</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of exclusive control column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//summaryProduct.setVersionNo(value);</span>
     * SummaryProductCB cb = new SummaryProductCB();
     * cb.query().setFoo...(value);
     * summaryProductBhv.<span style="color: #DD4747">queryUpdate</span>(summaryProduct, cb);
     * </pre>
     * @param summaryProduct The entity that contains update values. (NotNull, PrimaryKeyNullAllowed)
     * @param cb The condition-bean of SummaryProduct. (NotNull)
     * @return The updated count.
     * @exception NonQueryUpdateNotAllowedException When the query has no condition.
     */
    public int queryUpdate(SummaryProduct summaryProduct, SummaryProductCB cb) {
        return doQueryUpdate(summaryProduct, cb, null);
    }

    protected int doQueryUpdate(SummaryProduct summaryProduct, SummaryProductCB cb, UpdateOption<SummaryProductCB> op) {
        assertObjectNotNull("summaryProduct", summaryProduct); assertCBStateValid(cb);
        prepareUpdateOption(op);
        return checkCountBeforeQueryUpdateIfNeeds(cb) ? delegateQueryUpdate(summaryProduct, cb, op) : 0;
    }

    @Override
    protected int doRangeModify(Entity et, ConditionBean cb, UpdateOption<? extends ConditionBean> op) {
        if (op == null) { return queryUpdate(downcast(et), (SummaryProductCB)cb); }
        else { return varyingQueryUpdate(downcast(et), (SummaryProductCB)cb, downcast(op)); }
    }

    /**
     * Delete the several entities by query. (NonExclusiveControl)
     * <pre>
     * SummaryProductCB cb = new SummaryProductCB();
     * cb.query().setFoo...(value);
     * summaryProductBhv.<span style="color: #DD4747">queryDelete</span>(summaryProduct, cb);
     * </pre>
     * @param cb The condition-bean of SummaryProduct. (NotNull)
     * @return The deleted count.
     * @exception NonQueryDeleteNotAllowedException When the query has no condition.
     */
    public int queryDelete(SummaryProductCB cb) {
        return doQueryDelete(cb, null);
    }

    protected int doQueryDelete(SummaryProductCB cb, DeleteOption<SummaryProductCB> op) {
        assertCBStateValid(cb);
        prepareDeleteOption(op);
        return checkCountBeforeQueryUpdateIfNeeds(cb) ? delegateQueryDelete(cb, op) : 0;
    }

    @Override
    protected int doRangeRemove(ConditionBean cb, DeleteOption<? extends ConditionBean> op) {
        if (op == null) { return queryDelete((SummaryProductCB)cb); }
        else { return varyingQueryDelete((SummaryProductCB)cb, downcast(op)); }
    }

    // ===================================================================================
    //                                                                      Varying Update
    //                                                                      ==============
    // -----------------------------------------------------
    //                                         Entity Update
    //                                         -------------
    /**
     * Insert the entity with varying requests. <br />
     * For example, disableCommonColumnAutoSetup(), disablePrimaryKeyIdentity(). <br />
     * Other specifications are same as insert(entity).
     * <pre>
     * SummaryProduct summaryProduct = new SummaryProduct();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * summaryProduct.setFoo...(value);
     * summaryProduct.setBar...(value);
     * InsertOption<SummaryProductCB> option = new InsertOption<SummaryProductCB>();
     * <span style="color: #3F7E5E">// you can insert by your values for common columns</span>
     * option.disableCommonColumnAutoSetup();
     * summaryProductBhv.<span style="color: #DD4747">varyingInsert</span>(summaryProduct, option);
     * ... = summaryProduct.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * @param summaryProduct The entity of insert target. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @param option The option of insert for varying requests. (NotNull)
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsert(SummaryProduct summaryProduct, InsertOption<SummaryProductCB> option) {
        assertInsertOptionNotNull(option);
        doInsert(summaryProduct, option);
    }

    /**
     * Update the entity with varying requests modified-only. (ZeroUpdateException, NonExclusiveControl) <br />
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification), disableCommonColumnAutoSetup(). <br />
     * Other specifications are same as update(entity).
     * <pre>
     * SummaryProduct summaryProduct = new SummaryProduct();
     * summaryProduct.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * summaryProduct.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of exclusive control column is required</span>
     * summaryProduct.<span style="color: #DD4747">setVersionNo</span>(value);
     * try {
     *     <span style="color: #3F7E5E">// you can update by self calculation values</span>
     *     UpdateOption&lt;SummaryProductCB&gt; option = new UpdateOption&lt;SummaryProductCB&gt;();
     *     option.self(new SpecifyQuery&lt;SummaryProductCB&gt;() {
     *         public void specify(SummaryProductCB cb) {
     *             cb.specify().<span style="color: #DD4747">columnXxxCount()</span>;
     *         }
     *     }).plus(1); <span style="color: #3F7E5E">// XXX_COUNT = XXX_COUNT + 1</span>
     *     summaryProductBhv.<span style="color: #DD4747">varyingUpdate</span>(summaryProduct, option);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param summaryProduct The entity of update target. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnRequired)
     * @param option The option of update for varying requests. (NotNull)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingUpdate(SummaryProduct summaryProduct, UpdateOption<SummaryProductCB> option) {
        assertUpdateOptionNotNull(option);
        doUpdate(summaryProduct, option);
    }

    /**
     * Insert or update the entity with varying requests. (ExclusiveControl: when update) <br />
     * Other specifications are same as insertOrUpdate(entity).
     * @param summaryProduct The entity of insert or update target. (NotNull)
     * @param insertOption The option of insert for varying requests. (NotNull)
     * @param updateOption The option of update for varying requests. (NotNull)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     * @exception EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsertOrUpdate(SummaryProduct summaryProduct, InsertOption<SummaryProductCB> insertOption, UpdateOption<SummaryProductCB> updateOption) {
        assertInsertOptionNotNull(insertOption); assertUpdateOptionNotNull(updateOption);
        doInesrtOrUpdate(summaryProduct, insertOption, updateOption);
    }

    /**
     * Delete the entity with varying requests. (ZeroUpdateException, NonExclusiveControl) <br />
     * Now a valid option does not exist. <br />
     * Other specifications are same as delete(entity).
     * @param summaryProduct The entity of delete target. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnRequired)
     * @param option The option of update for varying requests. (NotNull)
     * @exception EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @exception EntityDuplicatedException When the entity has been duplicated.
     */
    public void varyingDelete(SummaryProduct summaryProduct, DeleteOption<SummaryProductCB> option) {
        assertDeleteOptionNotNull(option);
        doDelete(summaryProduct, option);
    }

    // -----------------------------------------------------
    //                                          Batch Update
    //                                          ------------
    /**
     * Batch-insert the list with varying requests. <br />
     * For example, disableCommonColumnAutoSetup()
     * , disablePrimaryKeyIdentity(), limitBatchInsertLogging(). <br />
     * Other specifications are same as batchInsert(entityList).
     * @param summaryProductList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param option The option of insert for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchInsert(List<SummaryProduct> summaryProductList, InsertOption<SummaryProductCB> option) {
        assertInsertOptionNotNull(option);
        return doBatchInsert(summaryProductList, option);
    }

    /**
     * Batch-update the list with varying requests. <br />
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), limitBatchUpdateLogging(). <br />
     * Other specifications are same as batchUpdate(entityList).
     * @param summaryProductList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param option The option of update for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchUpdate(List<SummaryProduct> summaryProductList, UpdateOption<SummaryProductCB> option) {
        assertUpdateOptionNotNull(option);
        return doBatchUpdate(summaryProductList, option);
    }

    /**
     * Batch-delete the list with varying requests. <br />
     * For example, limitBatchDeleteLogging(). <br />
     * Other specifications are same as batchDelete(entityList).
     * @param summaryProductList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param option The option of delete for varying requests. (NotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchDelete(List<SummaryProduct> summaryProductList, DeleteOption<SummaryProductCB> option) {
        assertDeleteOptionNotNull(option);
        return doBatchDelete(summaryProductList, option);
    }

    // -----------------------------------------------------
    //                                          Query Update
    //                                          ------------
    /**
     * Insert the several entities by query with varying requests (modified-only for fixed value). <br />
     * For example, disableCommonColumnAutoSetup(), disablePrimaryKeyIdentity(). <br />
     * Other specifications are same as queryInsert(entity, setupper).
     * @param setupper The setup-per of query-insert. (NotNull)
     * @param option The option of insert for varying requests. (NotNull)
     * @return The inserted count.
     */
    public int varyingQueryInsert(QueryInsertSetupper<SummaryProduct, SummaryProductCB> setupper, InsertOption<SummaryProductCB> option) {
        assertInsertOptionNotNull(option);
        return doQueryInsert(setupper, option);
    }

    /**
     * Update the several entities by query with varying requests non-strictly modified-only. {NonExclusiveControl} <br />
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), allowNonQueryUpdate(). <br />
     * Other specifications are same as queryUpdate(entity, cb).
     * <pre>
     * <span style="color: #3F7E5E">// ex) you can update by self calculation values</span>
     * SummaryProduct summaryProduct = new SummaryProduct();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//summaryProduct.setPK...(value);</span>
     * summaryProduct.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of exclusive control column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//summaryProduct.setVersionNo(value);</span>
     * SummaryProductCB cb = new SummaryProductCB();
     * cb.query().setFoo...(value);
     * UpdateOption&lt;SummaryProductCB&gt; option = new UpdateOption&lt;SummaryProductCB&gt;();
     * option.self(new SpecifyQuery&lt;SummaryProductCB&gt;() {
     *     public void specify(SummaryProductCB cb) {
     *         cb.specify().<span style="color: #DD4747">columnFooCount()</span>;
     *     }
     * }).plus(1); <span style="color: #3F7E5E">// FOO_COUNT = FOO_COUNT + 1</span>
     * summaryProductBhv.<span style="color: #DD4747">varyingQueryUpdate</span>(summaryProduct, cb, option);
     * </pre>
     * @param summaryProduct The entity that contains update values. (NotNull) {PrimaryKeyNotRequired}
     * @param cb The condition-bean of SummaryProduct. (NotNull)
     * @param option The option of update for varying requests. (NotNull)
     * @return The updated count.
     * @exception NonQueryUpdateNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryUpdate(SummaryProduct summaryProduct, SummaryProductCB cb, UpdateOption<SummaryProductCB> option) {
        assertUpdateOptionNotNull(option);
        return doQueryUpdate(summaryProduct, cb, option);
    }

    /**
     * Delete the several entities by query with varying requests non-strictly. <br />
     * For example, allowNonQueryDelete(). <br />
     * Other specifications are same as batchUpdateNonstrict(entityList).
     * @param cb The condition-bean of SummaryProduct. (NotNull)
     * @param option The option of delete for varying requests. (NotNull)
     * @return The deleted count.
     * @exception NonQueryDeleteNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryDelete(SummaryProductCB cb, DeleteOption<SummaryProductCB> option) {
        assertDeleteOptionNotNull(option);
        return doQueryDelete(cb, option);
    }

    // ===================================================================================
    //                                                                          OutsideSql
    //                                                                          ==========
    /**
     * Prepare the basic executor of outside-SQL to execute it. <br />
     * The invoker of behavior command should be not null when you call this method.
     * <pre>
     * You can use the methods for outside-SQL are as follows:
     * {Basic}
     *   o selectList()
     *   o execute()
     *   o call()
     *
     * {Entity}
     *   o entityHandling().selectEntity()
     *   o entityHandling().selectEntityWithDeletedCheck()
     *
     * {Paging}
     *   o autoPaging().selectList()
     *   o autoPaging().selectPage()
     *   o manualPaging().selectList()
     *   o manualPaging().selectPage()
     *
     * {Cursor}
     *   o cursorHandling().selectCursor()
     *
     * {Option}
     *   o dynamicBinding().selectList()
     *   o removeBlockComment().selectList()
     *   o removeLineComment().selectList()
     *   o formatSql().selectList()
     * </pre>
     * @return The basic executor of outside-SQL. (NotNull)
     */
    public OutsideSqlBasicExecutor<SummaryProductBhv> outsideSql() {
        return doOutsideSql();
    }

    // ===================================================================================
    //                                                                     Delegate Method
    //                                                                     ===============
    // [Behavior Command]
    // -----------------------------------------------------
    //                                                Select
    //                                                ------
    protected int delegateSelectCountUniquely(SummaryProductCB cb) { return invoke(createSelectCountCBCommand(cb, true)); }
    protected int delegateSelectCountPlainly(SummaryProductCB cb) { return invoke(createSelectCountCBCommand(cb, false)); }
    protected <ENTITY extends SummaryProduct> void delegateSelectCursor(SummaryProductCB cb, EntityRowHandler<ENTITY> rh, Class<ENTITY> tp)
    { invoke(createSelectCursorCBCommand(cb, rh, tp)); }
    protected <ENTITY extends SummaryProduct> List<ENTITY> delegateSelectList(SummaryProductCB cb, Class<ENTITY> tp)
    { return invoke(createSelectListCBCommand(cb, tp)); }

    // -----------------------------------------------------
    //                                                Update
    //                                                ------
    protected int delegateInsert(SummaryProduct et, InsertOption<SummaryProductCB> op)
    { if (!processBeforeInsert(et, op)) { return 0; }
      return invoke(createInsertEntityCommand(et, op)); }
    protected int delegateUpdate(SummaryProduct et, UpdateOption<SummaryProductCB> op)
    { if (!processBeforeUpdate(et, op)) { return 0; }
      return delegateUpdateNonstrict(et, op); }
    protected int delegateUpdateNonstrict(SummaryProduct et, UpdateOption<SummaryProductCB> op)
    { if (!processBeforeUpdate(et, op)) { return 0; }
      return invoke(createUpdateNonstrictEntityCommand(et, op)); }
    protected int delegateDelete(SummaryProduct et, DeleteOption<SummaryProductCB> op)
    { if (!processBeforeDelete(et, op)) { return 0; }
      return delegateDeleteNonstrict(et, op); }
    protected int delegateDeleteNonstrict(SummaryProduct et, DeleteOption<SummaryProductCB> op)
    { if (!processBeforeDelete(et, op)) { return 0; }
      return invoke(createDeleteNonstrictEntityCommand(et, op)); }

    protected int[] delegateBatchInsert(List<SummaryProduct> ls, InsertOption<SummaryProductCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return invoke(createBatchInsertCommand(processBatchInternally(ls, op), op)); }
    protected int[] delegateBatchUpdate(List<SummaryProduct> ls, UpdateOption<SummaryProductCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return delegateBatchUpdateNonstrict(ls, op); }
    protected int[] delegateBatchUpdateNonstrict(List<SummaryProduct> ls, UpdateOption<SummaryProductCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return invoke(createBatchUpdateNonstrictCommand(processBatchInternally(ls, op, true), op)); }
    protected int[] delegateBatchDelete(List<SummaryProduct> ls, DeleteOption<SummaryProductCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return delegateBatchDeleteNonstrict(ls, op); }
    protected int[] delegateBatchDeleteNonstrict(List<SummaryProduct> ls, DeleteOption<SummaryProductCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return invoke(createBatchDeleteNonstrictCommand(processBatchInternally(ls, op, true), op)); }

    protected int delegateQueryInsert(SummaryProduct et, SummaryProductCB inCB, ConditionBean resCB, InsertOption<SummaryProductCB> op)
    { if (!processBeforeQueryInsert(et, inCB, resCB, op)) { return 0; } return invoke(createQueryInsertCBCommand(et, inCB, resCB, op));  }
    protected int delegateQueryUpdate(SummaryProduct et, SummaryProductCB cb, UpdateOption<SummaryProductCB> op)
    { if (!processBeforeQueryUpdate(et, cb, op)) { return 0; } return invoke(createQueryUpdateCBCommand(et, cb, op));  }
    protected int delegateQueryDelete(SummaryProductCB cb, DeleteOption<SummaryProductCB> op)
    { if (!processBeforeQueryDelete(cb, op)) { return 0; } return invoke(createQueryDeleteCBCommand(cb, op));  }

    // ===================================================================================
    //                                                                Optimistic Lock Info
    //                                                                ====================
    /**
     * {@inheritDoc}
     */
    @Override
    protected boolean hasVersionNoValue(Entity et) {
        return false;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected boolean hasUpdateDateValue(Entity et) {
        return false;
    }

    // ===================================================================================
    //                                                                     Downcast Helper
    //                                                                     ===============
    protected SummaryProduct downcast(Entity et) {
        return helpEntityDowncastInternally(et, SummaryProduct.class);
    }

    protected SummaryProductCB downcast(ConditionBean cb) {
        return helpConditionBeanDowncastInternally(cb, SummaryProductCB.class);
    }

    @SuppressWarnings("unchecked")
    protected List<SummaryProduct> downcast(List<? extends Entity> ls) {
        return (List<SummaryProduct>)ls;
    }

    @SuppressWarnings("unchecked")
    protected InsertOption<SummaryProductCB> downcast(InsertOption<? extends ConditionBean> op) {
        return (InsertOption<SummaryProductCB>)op;
    }

    @SuppressWarnings("unchecked")
    protected UpdateOption<SummaryProductCB> downcast(UpdateOption<? extends ConditionBean> op) {
        return (UpdateOption<SummaryProductCB>)op;
    }

    @SuppressWarnings("unchecked")
    protected DeleteOption<SummaryProductCB> downcast(DeleteOption<? extends ConditionBean> op) {
        return (DeleteOption<SummaryProductCB>)op;
    }

    @SuppressWarnings("unchecked")
    protected QueryInsertSetupper<SummaryProduct, SummaryProductCB> downcast(QueryInsertSetupper<? extends Entity, ? extends ConditionBean> sp) {
        return (QueryInsertSetupper<SummaryProduct, SummaryProductCB>)sp;
    }
}
