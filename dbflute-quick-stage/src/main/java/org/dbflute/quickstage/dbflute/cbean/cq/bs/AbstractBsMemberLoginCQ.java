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
package org.dbflute.quickstage.dbflute.cbean.cq.bs;

import java.util.*;

import org.seasar.dbflute.cbean.*;
import org.seasar.dbflute.cbean.chelper.*;
import org.seasar.dbflute.cbean.ckey.*;
import org.seasar.dbflute.cbean.coption.*;
import org.seasar.dbflute.cbean.cvalue.ConditionValue;
import org.seasar.dbflute.cbean.sqlclause.SqlClause;
import org.seasar.dbflute.dbmeta.DBMetaProvider;
import org.dbflute.quickstage.dbflute.allcommon.*;
import org.dbflute.quickstage.dbflute.cbean.*;
import org.dbflute.quickstage.dbflute.cbean.cq.*;

/**
 * The abstract condition-query of MEMBER_LOGIN.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsMemberLoginCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsMemberLoginCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                     DBMeta Provider
    //                                                                     ===============
    @Override
    protected DBMetaProvider xgetDBMetaProvider() {
        return DBMetaInstanceHandler.getProvider();
    }

    // ===================================================================================
    //                                                                          Table Name
    //                                                                          ==========
    public String getTableDbName() {
        return "MEMBER_LOGIN";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br />
     * (会員ログインID)MEMBER_LOGIN_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param memberLoginId The value of memberLoginId as equal. (NullAllowed: if null, no condition)
     */
    public void setMemberLoginId_Equal(Long memberLoginId) {
        doSetMemberLoginId_Equal(memberLoginId);
    }

    protected void doSetMemberLoginId_Equal(Long memberLoginId) {
        regMemberLoginId(CK_EQ, memberLoginId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br />
     * (会員ログインID)MEMBER_LOGIN_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param memberLoginId The value of memberLoginId as notEqual. (NullAllowed: if null, no condition)
     */
    public void setMemberLoginId_NotEqual(Long memberLoginId) {
        doSetMemberLoginId_NotEqual(memberLoginId);
    }

    protected void doSetMemberLoginId_NotEqual(Long memberLoginId) {
        regMemberLoginId(CK_NES, memberLoginId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br />
     * (会員ログインID)MEMBER_LOGIN_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param memberLoginId The value of memberLoginId as greaterThan. (NullAllowed: if null, no condition)
     */
    public void setMemberLoginId_GreaterThan(Long memberLoginId) {
        regMemberLoginId(CK_GT, memberLoginId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br />
     * (会員ログインID)MEMBER_LOGIN_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param memberLoginId The value of memberLoginId as lessThan. (NullAllowed: if null, no condition)
     */
    public void setMemberLoginId_LessThan(Long memberLoginId) {
        regMemberLoginId(CK_LT, memberLoginId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * (会員ログインID)MEMBER_LOGIN_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param memberLoginId The value of memberLoginId as greaterEqual. (NullAllowed: if null, no condition)
     */
    public void setMemberLoginId_GreaterEqual(Long memberLoginId) {
        regMemberLoginId(CK_GE, memberLoginId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * (会員ログインID)MEMBER_LOGIN_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param memberLoginId The value of memberLoginId as lessEqual. (NullAllowed: if null, no condition)
     */
    public void setMemberLoginId_LessEqual(Long memberLoginId) {
        regMemberLoginId(CK_LE, memberLoginId);
    }

    /**
     * RangeOf with various options. (versatile) <br />
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br />
     * And NullIgnored, OnlyOnceRegistered. <br />
     * (会員ログインID)MEMBER_LOGIN_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param minNumber The min number of memberLoginId. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of memberLoginId. (NullAllowed: if null, no to-condition)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setMemberLoginId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, getCValueMemberLoginId(), "MEMBER_LOGIN_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * (会員ログインID)MEMBER_LOGIN_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param memberLoginIdList The collection of memberLoginId as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setMemberLoginId_InScope(Collection<Long> memberLoginIdList) {
        doSetMemberLoginId_InScope(memberLoginIdList);
    }

    protected void doSetMemberLoginId_InScope(Collection<Long> memberLoginIdList) {
        regINS(CK_INS, cTL(memberLoginIdList), getCValueMemberLoginId(), "MEMBER_LOGIN_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * (会員ログインID)MEMBER_LOGIN_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param memberLoginIdList The collection of memberLoginId as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setMemberLoginId_NotInScope(Collection<Long> memberLoginIdList) {
        doSetMemberLoginId_NotInScope(memberLoginIdList);
    }

    protected void doSetMemberLoginId_NotInScope(Collection<Long> memberLoginIdList) {
        regINS(CK_NINS, cTL(memberLoginIdList), getCValueMemberLoginId(), "MEMBER_LOGIN_ID");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br />
     * (会員ログインID)MEMBER_LOGIN_ID: {PK, ID, NotNull, BIGINT(19)}
     */
    public void setMemberLoginId_IsNull() { regMemberLoginId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br />
     * (会員ログインID)MEMBER_LOGIN_ID: {PK, ID, NotNull, BIGINT(19)}
     */
    public void setMemberLoginId_IsNotNull() { regMemberLoginId(CK_ISNN, DOBJ); }

    protected void regMemberLoginId(ConditionKey ky, Object vl) { regQ(ky, vl, getCValueMemberLoginId(), "MEMBER_LOGIN_ID"); }
    protected abstract ConditionValue getCValueMemberLoginId();
    
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br />
     * (会員ID)MEMBER_ID: {UQ+, IX, NotNull, INTEGER(10), FK to MEMBER}
     * @param memberId The value of memberId as equal. (NullAllowed: if null, no condition)
     */
    public void setMemberId_Equal(Integer memberId) {
        doSetMemberId_Equal(memberId);
    }

    protected void doSetMemberId_Equal(Integer memberId) {
        regMemberId(CK_EQ, memberId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br />
     * (会員ID)MEMBER_ID: {UQ+, IX, NotNull, INTEGER(10), FK to MEMBER}
     * @param memberId The value of memberId as notEqual. (NullAllowed: if null, no condition)
     */
    public void setMemberId_NotEqual(Integer memberId) {
        doSetMemberId_NotEqual(memberId);
    }

    protected void doSetMemberId_NotEqual(Integer memberId) {
        regMemberId(CK_NES, memberId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br />
     * (会員ID)MEMBER_ID: {UQ+, IX, NotNull, INTEGER(10), FK to MEMBER}
     * @param memberId The value of memberId as greaterThan. (NullAllowed: if null, no condition)
     */
    public void setMemberId_GreaterThan(Integer memberId) {
        regMemberId(CK_GT, memberId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br />
     * (会員ID)MEMBER_ID: {UQ+, IX, NotNull, INTEGER(10), FK to MEMBER}
     * @param memberId The value of memberId as lessThan. (NullAllowed: if null, no condition)
     */
    public void setMemberId_LessThan(Integer memberId) {
        regMemberId(CK_LT, memberId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * (会員ID)MEMBER_ID: {UQ+, IX, NotNull, INTEGER(10), FK to MEMBER}
     * @param memberId The value of memberId as greaterEqual. (NullAllowed: if null, no condition)
     */
    public void setMemberId_GreaterEqual(Integer memberId) {
        regMemberId(CK_GE, memberId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * (会員ID)MEMBER_ID: {UQ+, IX, NotNull, INTEGER(10), FK to MEMBER}
     * @param memberId The value of memberId as lessEqual. (NullAllowed: if null, no condition)
     */
    public void setMemberId_LessEqual(Integer memberId) {
        regMemberId(CK_LE, memberId);
    }

    /**
     * RangeOf with various options. (versatile) <br />
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br />
     * And NullIgnored, OnlyOnceRegistered. <br />
     * (会員ID)MEMBER_ID: {UQ+, IX, NotNull, INTEGER(10), FK to MEMBER}
     * @param minNumber The min number of memberId. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of memberId. (NullAllowed: if null, no to-condition)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setMemberId_RangeOf(Integer minNumber, Integer maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, getCValueMemberId(), "MEMBER_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * (会員ID)MEMBER_ID: {UQ+, IX, NotNull, INTEGER(10), FK to MEMBER}
     * @param memberIdList The collection of memberId as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setMemberId_InScope(Collection<Integer> memberIdList) {
        doSetMemberId_InScope(memberIdList);
    }

    protected void doSetMemberId_InScope(Collection<Integer> memberIdList) {
        regINS(CK_INS, cTL(memberIdList), getCValueMemberId(), "MEMBER_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * (会員ID)MEMBER_ID: {UQ+, IX, NotNull, INTEGER(10), FK to MEMBER}
     * @param memberIdList The collection of memberId as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setMemberId_NotInScope(Collection<Integer> memberIdList) {
        doSetMemberId_NotInScope(memberIdList);
    }

    protected void doSetMemberId_NotInScope(Collection<Integer> memberIdList) {
        regINS(CK_NINS, cTL(memberIdList), getCValueMemberId(), "MEMBER_ID");
    }

    /**
     * Set up InScopeRelation (sub-query). <br />
     * {in (select MEMBER_ID from MEMBER where ...)} <br />
     * (会員)MEMBER by my MEMBER_ID, named 'member'.
     * @param subQuery The sub-query of Member for 'in-scope'. (NotNull)
     */
    public void inScopeMember(SubQuery<MemberCB> subQuery) {
        assertObjectNotNull("subQuery", subQuery);
        MemberCB cb = new MemberCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subQuery.query(cb); } finally { unlock(); }
        String pp = keepMemberId_InScopeRelation_Member(cb.query());
        registerInScopeRelation(cb.query(), "MEMBER_ID", "MEMBER_ID", pp, "member");
    }
    public abstract String keepMemberId_InScopeRelation_Member(MemberCQ sq);

    /**
     * Set up NotInScopeRelation (sub-query). <br />
     * {not in (select MEMBER_ID from MEMBER where ...)} <br />
     * (会員)MEMBER by my MEMBER_ID, named 'member'.
     * @param subQuery The sub-query of Member for 'not in-scope'. (NotNull)
     */
    public void notInScopeMember(SubQuery<MemberCB> subQuery) {
        assertObjectNotNull("subQuery", subQuery);
        MemberCB cb = new MemberCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subQuery.query(cb); } finally { unlock(); }
        String pp = keepMemberId_NotInScopeRelation_Member(cb.query());
        registerNotInScopeRelation(cb.query(), "MEMBER_ID", "MEMBER_ID", pp, "member");
    }
    public abstract String keepMemberId_NotInScopeRelation_Member(MemberCQ sq);

    protected void regMemberId(ConditionKey ky, Object vl) { regQ(ky, vl, getCValueMemberId(), "MEMBER_ID"); }
    protected abstract ConditionValue getCValueMemberId();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br />
     * (ログイン日時)LOGIN_DATETIME: {+UQ, IX, NotNull, TIMESTAMP(23, 10)}
     * @param loginDatetime The value of loginDatetime as equal. (NullAllowed: if null, no condition)
     */
    public void setLoginDatetime_Equal(java.sql.Timestamp loginDatetime) {
        regLoginDatetime(CK_EQ,  loginDatetime);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br />
     * (ログイン日時)LOGIN_DATETIME: {+UQ, IX, NotNull, TIMESTAMP(23, 10)}
     * @param loginDatetime The value of loginDatetime as greaterThan. (NullAllowed: if null, no condition)
     */
    public void setLoginDatetime_GreaterThan(java.sql.Timestamp loginDatetime) {
        regLoginDatetime(CK_GT,  loginDatetime);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br />
     * (ログイン日時)LOGIN_DATETIME: {+UQ, IX, NotNull, TIMESTAMP(23, 10)}
     * @param loginDatetime The value of loginDatetime as lessThan. (NullAllowed: if null, no condition)
     */
    public void setLoginDatetime_LessThan(java.sql.Timestamp loginDatetime) {
        regLoginDatetime(CK_LT,  loginDatetime);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * (ログイン日時)LOGIN_DATETIME: {+UQ, IX, NotNull, TIMESTAMP(23, 10)}
     * @param loginDatetime The value of loginDatetime as greaterEqual. (NullAllowed: if null, no condition)
     */
    public void setLoginDatetime_GreaterEqual(java.sql.Timestamp loginDatetime) {
        regLoginDatetime(CK_GE,  loginDatetime);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * (ログイン日時)LOGIN_DATETIME: {+UQ, IX, NotNull, TIMESTAMP(23, 10)}
     * @param loginDatetime The value of loginDatetime as lessEqual. (NullAllowed: if null, no condition)
     */
    public void setLoginDatetime_LessEqual(java.sql.Timestamp loginDatetime) {
        regLoginDatetime(CK_LE, loginDatetime);
    }

    /**
     * FromTo with various options. (versatile) {(default) fromDatetime &lt;= column &lt;= toDatetime} <br />
     * And NullIgnored, OnlyOnceRegistered. <br />
     * (ログイン日時)LOGIN_DATETIME: {+UQ, IX, NotNull, TIMESTAMP(23, 10)}
     * <pre>e.g. setLoginDatetime_FromTo(fromDate, toDate, new <span style="color: #DD4747">FromToOption</span>().compareAsDate());</pre>
     * @param fromDatetime The from-datetime(yyyy/MM/dd HH:mm:ss.SSS) of loginDatetime. (NullAllowed: if null, no from-condition)
     * @param toDatetime The to-datetime(yyyy/MM/dd HH:mm:ss.SSS) of loginDatetime. (NullAllowed: if null, no to-condition)
     * @param fromToOption The option of from-to. (NotNull)
     */
    public void setLoginDatetime_FromTo(Date fromDatetime, Date toDatetime, FromToOption fromToOption) {
        regFTQ((fromDatetime != null ? new java.sql.Timestamp(fromDatetime.getTime()) : null), (toDatetime != null ? new java.sql.Timestamp(toDatetime.getTime()) : null), getCValueLoginDatetime(), "LOGIN_DATETIME", fromToOption);
    }

    /**
     * DateFromTo. (Date means yyyy/MM/dd) {fromDate &lt;= column &lt; toDate + 1 day} <br />
     * And NullIgnored, OnlyOnceRegistered. <br />
     * (ログイン日時)LOGIN_DATETIME: {+UQ, IX, NotNull, TIMESTAMP(23, 10)}
     * <pre>
     * e.g. from:{2007/04/10 08:24:53} to:{2007/04/16 14:36:29}
     *  column &gt;= '2007/04/10 00:00:00' and column <span style="color: #DD4747">&lt; '2007/04/17 00:00:00'</span>
     * </pre>
     * @param fromDate The from-date(yyyy/MM/dd) of loginDatetime. (NullAllowed: if null, no from-condition)
     * @param toDate The to-date(yyyy/MM/dd) of loginDatetime. (NullAllowed: if null, no to-condition)
     */
    public void setLoginDatetime_DateFromTo(Date fromDate, Date toDate) {
        setLoginDatetime_FromTo(fromDate, toDate, new FromToOption().compareAsDate());
    }

    protected void regLoginDatetime(ConditionKey ky, Object vl) { regQ(ky, vl, getCValueLoginDatetime(), "LOGIN_DATETIME"); }
    protected abstract ConditionValue getCValueLoginDatetime();
    
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br />
     * (モバイルログインフラグ)MOBILE_LOGIN_FLG: {NotNull, INTEGER(10), classification=Flg}
     * @param mobileLoginFlg The value of mobileLoginFlg as equal. (NullAllowed: if null, no condition)
     */
    protected void setMobileLoginFlg_Equal(Integer mobileLoginFlg) {
        doSetMobileLoginFlg_Equal(mobileLoginFlg);
    }

    /**
     * Equal(=). As Flg. And NullIgnored, OnlyOnceRegistered. <br />
     * (モバイルログインフラグ)MOBILE_LOGIN_FLG: {NotNull, INTEGER(10), classification=Flg} <br />
     * 二つに一つ、フラグを示す
     * @param cdef The instance of classification definition (as ENUM type). (NullAllowed: if null, no condition)
     */
    public void setMobileLoginFlg_Equal_AsFlg(CDef.Flg cdef) {
        doSetMobileLoginFlg_Equal(cTNum(cdef != null ? cdef.code() : null, Integer.class));
    }

    /**
     * Equal(=). As boolean for Flg. <br />
     * (モバイルログインフラグ)MOBILE_LOGIN_FLG: {NotNull, INTEGER(10), classification=Flg} <br />
     * 二つに一つ、フラグを示す
     * @param determination The determination, true or false. (NullAllowed: if null, no condition)
     */
    public void setMobileLoginFlg_Equal_AsBoolean(Boolean determination) {
        setMobileLoginFlg_Equal_AsFlg(CDef.Flg.codeOf(determination));
    }

    /**
     * Equal(=). As True (1). And NullIgnored, OnlyOnceRegistered. <br />
     * はい: 有効を示す
     */
    public void setMobileLoginFlg_Equal_True() {
        setMobileLoginFlg_Equal_AsFlg(CDef.Flg.True);
    }

    /**
     * Equal(=). As False (0). And NullIgnored, OnlyOnceRegistered. <br />
     * いいえ: 無効を示す
     */
    public void setMobileLoginFlg_Equal_False() {
        setMobileLoginFlg_Equal_AsFlg(CDef.Flg.False);
    }

    protected void doSetMobileLoginFlg_Equal(Integer mobileLoginFlg) {
        regMobileLoginFlg(CK_EQ, mobileLoginFlg);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br />
     * (モバイルログインフラグ)MOBILE_LOGIN_FLG: {NotNull, INTEGER(10), classification=Flg}
     * @param mobileLoginFlg The value of mobileLoginFlg as notEqual. (NullAllowed: if null, no condition)
     */
    protected void setMobileLoginFlg_NotEqual(Integer mobileLoginFlg) {
        doSetMobileLoginFlg_NotEqual(mobileLoginFlg);
    }

    /**
     * NotEqual(&lt;&gt;). As Flg. And NullIgnored, OnlyOnceRegistered. <br />
     * (モバイルログインフラグ)MOBILE_LOGIN_FLG: {NotNull, INTEGER(10), classification=Flg} <br />
     * 二つに一つ、フラグを示す
     * @param cdef The instance of classification definition (as ENUM type). (NullAllowed: if null, no condition)
     */
    public void setMobileLoginFlg_NotEqual_AsFlg(CDef.Flg cdef) {
        doSetMobileLoginFlg_NotEqual(cTNum(cdef != null ? cdef.code() : null, Integer.class));
    }

    /**
     * NotEqual(&lt;&gt;). As True (1). And NullIgnored, OnlyOnceRegistered. <br />
     * はい: 有効を示す
     */
    public void setMobileLoginFlg_NotEqual_True() {
        setMobileLoginFlg_NotEqual_AsFlg(CDef.Flg.True);
    }

    /**
     * NotEqual(&lt;&gt;). As False (0). And NullIgnored, OnlyOnceRegistered. <br />
     * いいえ: 無効を示す
     */
    public void setMobileLoginFlg_NotEqual_False() {
        setMobileLoginFlg_NotEqual_AsFlg(CDef.Flg.False);
    }

    protected void doSetMobileLoginFlg_NotEqual(Integer mobileLoginFlg) {
        regMobileLoginFlg(CK_NES, mobileLoginFlg);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * (モバイルログインフラグ)MOBILE_LOGIN_FLG: {NotNull, INTEGER(10), classification=Flg}
     * @param mobileLoginFlgList The collection of mobileLoginFlg as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setMobileLoginFlg_InScope(Collection<Integer> mobileLoginFlgList) {
        doSetMobileLoginFlg_InScope(mobileLoginFlgList);
    }

    /**
     * InScope {in (1, 2)}. As Flg. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * (モバイルログインフラグ)MOBILE_LOGIN_FLG: {NotNull, INTEGER(10), classification=Flg} <br />
     * 二つに一つ、フラグを示す
     * @param cdefList The list of classification definition (as ENUM type). (NullAllowed: if null (or empty), no condition)
     */
    public void setMobileLoginFlg_InScope_AsFlg(Collection<CDef.Flg> cdefList) {
        doSetMobileLoginFlg_InScope(cTNumL(cdefList, Integer.class));
    }

    protected void doSetMobileLoginFlg_InScope(Collection<Integer> mobileLoginFlgList) {
        regINS(CK_INS, cTL(mobileLoginFlgList), getCValueMobileLoginFlg(), "MOBILE_LOGIN_FLG");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * (モバイルログインフラグ)MOBILE_LOGIN_FLG: {NotNull, INTEGER(10), classification=Flg}
     * @param mobileLoginFlgList The collection of mobileLoginFlg as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setMobileLoginFlg_NotInScope(Collection<Integer> mobileLoginFlgList) {
        doSetMobileLoginFlg_NotInScope(mobileLoginFlgList);
    }

    /**
     * NotInScope {not in (1, 2)}. As Flg. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * (モバイルログインフラグ)MOBILE_LOGIN_FLG: {NotNull, INTEGER(10), classification=Flg} <br />
     * 二つに一つ、フラグを示す
     * @param cdefList The list of classification definition (as ENUM type). (NullAllowed: if null (or empty), no condition)
     */
    public void setMobileLoginFlg_NotInScope_AsFlg(Collection<CDef.Flg> cdefList) {
        doSetMobileLoginFlg_NotInScope(cTNumL(cdefList, Integer.class));
    }

    protected void doSetMobileLoginFlg_NotInScope(Collection<Integer> mobileLoginFlgList) {
        regINS(CK_NINS, cTL(mobileLoginFlgList), getCValueMobileLoginFlg(), "MOBILE_LOGIN_FLG");
    }

    protected void regMobileLoginFlg(ConditionKey ky, Object vl) { regQ(ky, vl, getCValueMobileLoginFlg(), "MOBILE_LOGIN_FLG"); }
    protected abstract ConditionValue getCValueMobileLoginFlg();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * (ログイン時会員ステータスコード)LOGIN_MEMBER_STATUS_CODE: {IX, NotNull, CHAR(3), FK to MEMBER_STATUS, classification=MemberStatus}
     * @param loginMemberStatusCode The value of loginMemberStatusCode as equal. (NullAllowed: if null (or empty), no condition)
     */
    protected void setLoginMemberStatusCode_Equal(String loginMemberStatusCode) {
        doSetLoginMemberStatusCode_Equal(fRES(loginMemberStatusCode));
    }

    /**
     * Equal(=). As MemberStatus. And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * (ログイン時会員ステータスコード)LOGIN_MEMBER_STATUS_CODE: {IX, NotNull, CHAR(3), FK to MEMBER_STATUS, classification=MemberStatus} <br />
     * 入会から退会までの会員のステータスを示す
     * @param cdef The instance of classification definition (as ENUM type). (NullAllowed: if null, no condition)
     */
    public void setLoginMemberStatusCode_Equal_AsMemberStatus(CDef.MemberStatus cdef) {
        doSetLoginMemberStatusCode_Equal(cdef != null ? cdef.code() : null);
    }

    /**
     * Equal(=). As 正式会員 (FML). And OnlyOnceRegistered. <br />
     * 正式会員: 正式な会員としてサイトサービスが利用可能
     */
    public void setLoginMemberStatusCode_Equal_正式会員() {
        setLoginMemberStatusCode_Equal_AsMemberStatus(CDef.MemberStatus.正式会員);
    }

    /**
     * Equal(=). As 退会会員 (WDL). And OnlyOnceRegistered. <br />
     * 退会会員: 退会が確定した会員でサイトサービスはダメ
     */
    public void setLoginMemberStatusCode_Equal_退会会員() {
        setLoginMemberStatusCode_Equal_AsMemberStatus(CDef.MemberStatus.退会会員);
    }

    /**
     * Equal(=). As 仮会員 (PRV). And OnlyOnceRegistered. <br />
     * 仮会員: 入会直後のステータスで一部のサイトサービスが利用可能
     */
    public void setLoginMemberStatusCode_Equal_仮会員() {
        setLoginMemberStatusCode_Equal_AsMemberStatus(CDef.MemberStatus.仮会員);
    }

    protected void doSetLoginMemberStatusCode_Equal(String loginMemberStatusCode) {
        regLoginMemberStatusCode(CK_EQ, loginMemberStatusCode);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * (ログイン時会員ステータスコード)LOGIN_MEMBER_STATUS_CODE: {IX, NotNull, CHAR(3), FK to MEMBER_STATUS, classification=MemberStatus}
     * @param loginMemberStatusCode The value of loginMemberStatusCode as notEqual. (NullAllowed: if null (or empty), no condition)
     */
    protected void setLoginMemberStatusCode_NotEqual(String loginMemberStatusCode) {
        doSetLoginMemberStatusCode_NotEqual(fRES(loginMemberStatusCode));
    }

    /**
     * NotEqual(&lt;&gt;). As MemberStatus. And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * (ログイン時会員ステータスコード)LOGIN_MEMBER_STATUS_CODE: {IX, NotNull, CHAR(3), FK to MEMBER_STATUS, classification=MemberStatus} <br />
     * 入会から退会までの会員のステータスを示す
     * @param cdef The instance of classification definition (as ENUM type). (NullAllowed: if null, no condition)
     */
    public void setLoginMemberStatusCode_NotEqual_AsMemberStatus(CDef.MemberStatus cdef) {
        doSetLoginMemberStatusCode_NotEqual(cdef != null ? cdef.code() : null);
    }

    /**
     * NotEqual(&lt;&gt;). As 正式会員 (FML). And OnlyOnceRegistered. <br />
     * 正式会員: 正式な会員としてサイトサービスが利用可能
     */
    public void setLoginMemberStatusCode_NotEqual_正式会員() {
        setLoginMemberStatusCode_NotEqual_AsMemberStatus(CDef.MemberStatus.正式会員);
    }

    /**
     * NotEqual(&lt;&gt;). As 退会会員 (WDL). And OnlyOnceRegistered. <br />
     * 退会会員: 退会が確定した会員でサイトサービスはダメ
     */
    public void setLoginMemberStatusCode_NotEqual_退会会員() {
        setLoginMemberStatusCode_NotEqual_AsMemberStatus(CDef.MemberStatus.退会会員);
    }

    /**
     * NotEqual(&lt;&gt;). As 仮会員 (PRV). And OnlyOnceRegistered. <br />
     * 仮会員: 入会直後のステータスで一部のサイトサービスが利用可能
     */
    public void setLoginMemberStatusCode_NotEqual_仮会員() {
        setLoginMemberStatusCode_NotEqual_AsMemberStatus(CDef.MemberStatus.仮会員);
    }

    protected void doSetLoginMemberStatusCode_NotEqual(String loginMemberStatusCode) {
        regLoginMemberStatusCode(CK_NES, loginMemberStatusCode);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * (ログイン時会員ステータスコード)LOGIN_MEMBER_STATUS_CODE: {IX, NotNull, CHAR(3), FK to MEMBER_STATUS, classification=MemberStatus}
     * @param loginMemberStatusCodeList The collection of loginMemberStatusCode as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setLoginMemberStatusCode_InScope(Collection<String> loginMemberStatusCodeList) {
        doSetLoginMemberStatusCode_InScope(loginMemberStatusCodeList);
    }

    /**
     * InScope {in ('a', 'b')}. As MemberStatus. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * (ログイン時会員ステータスコード)LOGIN_MEMBER_STATUS_CODE: {IX, NotNull, CHAR(3), FK to MEMBER_STATUS, classification=MemberStatus} <br />
     * 入会から退会までの会員のステータスを示す
     * @param cdefList The list of classification definition (as ENUM type). (NullAllowed: if null (or empty), no condition)
     */
    public void setLoginMemberStatusCode_InScope_AsMemberStatus(Collection<CDef.MemberStatus> cdefList) {
        doSetLoginMemberStatusCode_InScope(cTStrL(cdefList));
    }

    /**
     * InScope {in ('a', 'b')}. As MemberStatus. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * 入会から退会までの会員のステータスを示す <br />
     * サービスが利用できる会員 <br />
     * The group elements:[正式会員, 仮会員]
     */
    public void setLoginMemberStatusCode_InScope_ServiceAvailable() {
        setLoginMemberStatusCode_InScope_AsMemberStatus(CDef.MemberStatus.listOfServiceAvailable());
    }

    public void doSetLoginMemberStatusCode_InScope(Collection<String> loginMemberStatusCodeList) {
        regINS(CK_INS, cTL(loginMemberStatusCodeList), getCValueLoginMemberStatusCode(), "LOGIN_MEMBER_STATUS_CODE");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * (ログイン時会員ステータスコード)LOGIN_MEMBER_STATUS_CODE: {IX, NotNull, CHAR(3), FK to MEMBER_STATUS, classification=MemberStatus}
     * @param loginMemberStatusCodeList The collection of loginMemberStatusCode as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setLoginMemberStatusCode_NotInScope(Collection<String> loginMemberStatusCodeList) {
        doSetLoginMemberStatusCode_NotInScope(loginMemberStatusCodeList);
    }

    /**
     * NotInScope {not in ('a', 'b')}. As MemberStatus. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * (ログイン時会員ステータスコード)LOGIN_MEMBER_STATUS_CODE: {IX, NotNull, CHAR(3), FK to MEMBER_STATUS, classification=MemberStatus} <br />
     * 入会から退会までの会員のステータスを示す
     * @param cdefList The list of classification definition (as ENUM type). (NullAllowed: if null (or empty), no condition)
     */
    public void setLoginMemberStatusCode_NotInScope_AsMemberStatus(Collection<CDef.MemberStatus> cdefList) {
        doSetLoginMemberStatusCode_NotInScope(cTStrL(cdefList));
    }

    public void doSetLoginMemberStatusCode_NotInScope(Collection<String> loginMemberStatusCodeList) {
        regINS(CK_NINS, cTL(loginMemberStatusCodeList), getCValueLoginMemberStatusCode(), "LOGIN_MEMBER_STATUS_CODE");
    }

    /**
     * Set up InScopeRelation (sub-query). <br />
     * {in (select LOGIN_MEMBER_STATUS_CODE from MEMBER_STATUS where ...)} <br />
     * (会員ステータス)MEMBER_STATUS by my LOGIN_MEMBER_STATUS_CODE, named 'memberStatus'.
     * @param subQuery The sub-query of MemberStatus for 'in-scope'. (NotNull)
     */
    public void inScopeMemberStatus(SubQuery<MemberStatusCB> subQuery) {
        assertObjectNotNull("subQuery", subQuery);
        MemberStatusCB cb = new MemberStatusCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subQuery.query(cb); } finally { unlock(); }
        String pp = keepLoginMemberStatusCode_InScopeRelation_MemberStatus(cb.query());
        registerInScopeRelation(cb.query(), "LOGIN_MEMBER_STATUS_CODE", "MEMBER_STATUS_CODE", pp, "memberStatus");
    }
    public abstract String keepLoginMemberStatusCode_InScopeRelation_MemberStatus(MemberStatusCQ sq);

    /**
     * Set up NotInScopeRelation (sub-query). <br />
     * {not in (select LOGIN_MEMBER_STATUS_CODE from MEMBER_STATUS where ...)} <br />
     * (会員ステータス)MEMBER_STATUS by my LOGIN_MEMBER_STATUS_CODE, named 'memberStatus'.
     * @param subQuery The sub-query of MemberStatus for 'not in-scope'. (NotNull)
     */
    public void notInScopeMemberStatus(SubQuery<MemberStatusCB> subQuery) {
        assertObjectNotNull("subQuery", subQuery);
        MemberStatusCB cb = new MemberStatusCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subQuery.query(cb); } finally { unlock(); }
        String pp = keepLoginMemberStatusCode_NotInScopeRelation_MemberStatus(cb.query());
        registerNotInScopeRelation(cb.query(), "LOGIN_MEMBER_STATUS_CODE", "MEMBER_STATUS_CODE", pp, "memberStatus");
    }
    public abstract String keepLoginMemberStatusCode_NotInScopeRelation_MemberStatus(MemberStatusCQ sq);

    protected void regLoginMemberStatusCode(ConditionKey ky, Object vl) { regQ(ky, vl, getCValueLoginMemberStatusCode(), "LOGIN_MEMBER_STATUS_CODE"); }
    protected abstract ConditionValue getCValueLoginMemberStatusCode();

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    /**
     * Prepare ScalarCondition as equal. <br />
     * {where FOO = (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #DD4747">scalar_Equal()</span>.max(new SubQuery&lt;MemberLoginCB&gt;() {
     *     public void query(MemberLoginCB subCB) {
     *         subCB.specify().setXxx... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setYyy...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<MemberLoginCB> scalar_Equal() {
        return xcreateSSQFunction(CK_EQ.getOperand(), MemberLoginCB.class);
    }

    /**
     * Prepare ScalarCondition as equal. <br />
     * {where FOO &lt;&gt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #DD4747">scalar_NotEqual()</span>.max(new SubQuery&lt;MemberLoginCB&gt;() {
     *     public void query(MemberLoginCB subCB) {
     *         subCB.specify().setXxx... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setYyy...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<MemberLoginCB> scalar_NotEqual() {
        return xcreateSSQFunction(CK_NES.getOperand(), MemberLoginCB.class);
    }

    /**
     * Prepare ScalarCondition as greaterThan. <br />
     * {where FOO &gt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #DD4747">scalar_GreaterThan()</span>.max(new SubQuery&lt;MemberLoginCB&gt;() {
     *     public void query(MemberLoginCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<MemberLoginCB> scalar_GreaterThan() {
        return xcreateSSQFunction(CK_GT.getOperand(), MemberLoginCB.class);
    }

    /**
     * Prepare ScalarCondition as lessThan. <br />
     * {where FOO &lt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #DD4747">scalar_LessThan()</span>.max(new SubQuery&lt;MemberLoginCB&gt;() {
     *     public void query(MemberLoginCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<MemberLoginCB> scalar_LessThan() {
        return xcreateSSQFunction(CK_LT.getOperand(), MemberLoginCB.class);
    }

    /**
     * Prepare ScalarCondition as greaterEqual. <br />
     * {where FOO &gt;= (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #DD4747">scalar_GreaterEqual()</span>.max(new SubQuery&lt;MemberLoginCB&gt;() {
     *     public void query(MemberLoginCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<MemberLoginCB> scalar_GreaterEqual() {
        return xcreateSSQFunction(CK_GE.getOperand(), MemberLoginCB.class);
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br />
     * {where FOO &lt;= (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #DD4747">scalar_LessEqual()</span>.max(new SubQuery&lt;MemberLoginCB&gt;() {
     *     public void query(MemberLoginCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<MemberLoginCB> scalar_LessEqual() {
        return xcreateSSQFunction(CK_LE.getOperand(), MemberLoginCB.class);
    }

    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xscalarCondition(String fn, SubQuery<CB> sq, String rd, HpSSQOption<CB> op) {
        assertObjectNotNull("subQuery", sq);
        MemberLoginCB cb = xcreateScalarConditionCB(); sq.query((CB)cb);
        String pp = keepScalarCondition(cb.query()); // for saving query-value
        op.setPartitionByCBean((CB)xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, op);
    }
    public abstract String keepScalarCondition(MemberLoginCQ sq);

    protected MemberLoginCB xcreateScalarConditionCB() {
        MemberLoginCB cb = newMyCB(); cb.xsetupForScalarCondition(this); return cb;
    }

    protected MemberLoginCB xcreateScalarConditionPartitionByCB() {
        MemberLoginCB cb = newMyCB(); cb.xsetupForScalarConditionPartitionBy(this); return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String fn, SubQuery<MemberLoginCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        MemberLoginCB cb = new MemberLoginCB(); cb.xsetupForDerivedReferrer(this);
        try { lock(); sq.query(cb); } finally { unlock(); }
        String pp = keepSpecifyMyselfDerived(cb.query());
        String pk = "MEMBER_LOGIN_ID";
        registerSpecifyMyselfDerived(fn, cb.query(), pk, pk, pp, "myselfDerived", al, op);
    }
    public abstract String keepSpecifyMyselfDerived(MemberLoginCQ sq);

    /**
     * Prepare for (Query)MyselfDerived (correlated sub-query).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<MemberLoginCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived(MemberLoginCB.class);
    }
    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xqderiveMyselfDerived(String fn, SubQuery<CB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        MemberLoginCB cb = new MemberLoginCB(); cb.xsetupForDerivedReferrer(this); sq.query((CB)cb);
        String pk = "MEMBER_LOGIN_ID";
        String sqpp = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String prpp = keepQueryMyselfDerivedParameter(vl);
        registerQueryMyselfDerived(fn, cb.query(), pk, pk, sqpp, "myselfDerived", rd, vl, prpp, op);
    }
    public abstract String keepQueryMyselfDerived(MemberLoginCQ sq);
    public abstract String keepQueryMyselfDerivedParameter(Object vl);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (correlated sub-query).
     * @param subQuery The implementation of sub-query. (NotNull)
     */
    public void myselfExists(SubQuery<MemberLoginCB> subQuery) {
        assertObjectNotNull("subQuery", subQuery);
        MemberLoginCB cb = new MemberLoginCB(); cb.xsetupForMyselfExists(this);
        try { lock(); subQuery.query(cb); } finally { unlock(); }
        String pp = keepMyselfExists(cb.query());
        registerMyselfExists(cb.query(), pp);
    }
    public abstract String keepMyselfExists(MemberLoginCQ sq);

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    /**
     * Prepare for MyselfInScope (sub-query).
     * @param subQuery The implementation of sub-query. (NotNull)
     */
    public void myselfInScope(SubQuery<MemberLoginCB> subQuery) {
        assertObjectNotNull("subQuery", subQuery);
        MemberLoginCB cb = new MemberLoginCB(); cb.xsetupForMyselfInScope(this);
        try { lock(); subQuery.query(cb); } finally { unlock(); }
        String pp = keepMyselfInScope(cb.query());
        registerMyselfInScope(cb.query(), pp);
    }
    public abstract String keepMyselfInScope(MemberLoginCQ sq);

    // ===================================================================================
    //                                                                          Compatible
    //                                                                          ==========
    /**
     * Order along the list of manual values. #beforejava8 <br />
     * This function with Union is unsupported! <br />
     * The order values are bound (treated as bind parameter).
     * <pre>
     * MemberCB cb = new MemberCB();
     * List&lt;CDef.MemberStatus&gt; orderValueList = new ArrayList&lt;CDef.MemberStatus&gt;();
     * orderValueList.add(CDef.MemberStatus.Withdrawal);
     * orderValueList.add(CDef.MemberStatus.Formalized);
     * orderValueList.add(CDef.MemberStatus.Provisional);
     * cb.query().addOrderBy_MemberStatusCode_Asc().<span style="color: #DD4747">withManualOrder(orderValueList)</span>;
     * <span style="color: #3F7E5E">// order by </span>
     * <span style="color: #3F7E5E">//   case</span>
     * <span style="color: #3F7E5E">//     when MEMBER_STATUS_CODE = 'WDL' then 0</span>
     * <span style="color: #3F7E5E">//     when MEMBER_STATUS_CODE = 'FML' then 1</span>
     * <span style="color: #3F7E5E">//     when MEMBER_STATUS_CODE = 'PRV' then 2</span>
     * <span style="color: #3F7E5E">//     else 3</span>
     * <span style="color: #3F7E5E">//   end asc, ...</span>
     * </pre>
     * @param orderValueList The list of order values for manual ordering. (NotNull)
     */
    public void withManualOrder(List<? extends Object> orderValueList) { // is user public!
        assertObjectNotNull("withManualOrder(orderValueList)", orderValueList);
        final ManualOrderBean manualOrderBean = new ManualOrderBean();
        manualOrderBean.acceptOrderValueList(orderValueList);
        withManualOrder(manualOrderBean);
    }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    protected MemberLoginCB newMyCB() {
        return new MemberLoginCB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabCQ() { return MemberLoginCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSSQS() { return HpSSQSetupper.class.getName(); }
}
