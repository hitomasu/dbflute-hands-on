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
package org.dbflute.quickstage.dbflute.bsbhv.pmbean;

import java.util.*;

import org.seasar.dbflute.outsidesql.typed.*;
import org.seasar.dbflute.jdbc.*;
import org.seasar.dbflute.jdbc.ParameterUtil.ShortCharHandlingMode;
import org.seasar.dbflute.cbean.coption.LikeSearchOption;
import org.seasar.dbflute.util.DfCollectionUtil;
import org.seasar.dbflute.exception.*;
import org.seasar.dbflute.util.DfTypeUtil;
import org.dbflute.quickstage.dbflute.allcommon.*;
import org.dbflute.quickstage.dbflute.exbhv.*;

/**
 * The base class for typed parameter-bean of PurchaseSummaryMember. <br />
 * This is related to "<span style="color: #AD4747">selectPurchaseSummaryMember</span>" on MemberBhv.
 * @author DBFlute(AutoGenerator)
 */
public class BsPurchaseSummaryMemberPmb implements CursorHandlingPmb<MemberBhv, Void>, FetchBean {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** The parameter of memberStatusCode:cls(MemberStatus). */
    protected String _memberStatusCode;

    /** The parameter of formalizedDatetime. */
    protected java.sql.Timestamp _formalizedDatetime;

    /** The parameter of memberNameList:likeContain. */
    protected List<String> _memberNameList;

    /** The option of like-search for memberNameList. */
    protected LikeSearchOption _memberNameListInternalLikeSearchOption;

    /** The max size of safety result. */
    protected int _safetyMaxResultSize;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    /**
     * Constructor for the typed parameter-bean of PurchaseSummaryMember. <br />
     * This is related to "<span style="color: #AD4747">selectPurchaseSummaryMember</span>" on MemberBhv.
     */
    public BsPurchaseSummaryMemberPmb() {
    }

    // ===================================================================================
    //                                                                Typed Implementation
    //                                                                ====================
    /**
     * {@inheritDoc}
     */
    public String getOutsideSqlPath() {
        return "selectPurchaseSummaryMember";
    }

    /**
     * Get the type of an entity for result. (implementation)
     * @return The type instance of an entity, cursor handling. (NotNull)
     */
    public Class<Void> getEntityType() {
        return Void.class;
    }

    // ===================================================================================
    //                                                                       Safety Result
    //                                                                       =============
    /**
     * {@inheritDoc}
     */
    public void checkSafetyResult(int safetyMaxResultSize) {
        _safetyMaxResultSize = safetyMaxResultSize;
    }

    /**
     * {@inheritDoc}
     */
    public int getSafetyMaxResultSize() {
        return _safetyMaxResultSize;
    }

    // ===================================================================================
    //                                                                       Assist Helper
    //                                                                       =============
    protected String filterStringParameter(String value) {
        if (isEmptyStringParameterAllowed()) {
            return value;
        }
        return convertEmptyToNull(value);
    }

    protected boolean isEmptyStringParameterAllowed() {
	    return DBFluteConfig.getInstance().isEmptyStringParameterAllowed();
    }

    protected String convertEmptyToNull(String value) {
	    return ParameterUtil.convertEmptyToNull(value);
    }

    protected String handleShortChar(String propertyName, String value, Integer size) {
        ShortCharHandlingMode mode = getShortCharHandlingMode(propertyName, value, size);
        return ParameterUtil.handleShortChar(propertyName, value, size, mode);
    }

    protected ShortCharHandlingMode getShortCharHandlingMode(String propertyName, String value, Integer size) {
        return ShortCharHandlingMode.NONE;
    }

    @SuppressWarnings("unchecked")
    protected <ELEMENT> ArrayList<ELEMENT> newArrayList(ELEMENT... elements) {
        Object obj = DfCollectionUtil.newArrayList(elements);
        return (ArrayList<ELEMENT>)obj; // to avoid the warning between JDK6 and JDK7
    }

    @SuppressWarnings("unchecked")
    protected <NUMBER extends Number> NUMBER toNumber(Object obj, Class<NUMBER> type) {
        return (NUMBER)DfTypeUtil.toNumber(obj, type);
    }

    protected Boolean toBoolean(Object obj) {
        return DfTypeUtil.toBoolean(obj);
    }

    protected Date toUtilDate(Date date) {
        return DfTypeUtil.toDate(date); // if sub class, re-create as pure date
    }

    protected String formatUtilDate(Date date) {
        String pattern = "yyyy-MM-dd";
        return DfTypeUtil.toString(date, pattern);
    }

    protected String formatByteArray(byte[] bytes) {
        return "byte[" + (bytes != null ? String.valueOf(bytes.length) : "null") + "]";
    }

    protected void assertLikeSearchOptionValid(String name, LikeSearchOption option) {
        if (option == null) {
            String msg = "The like-search option is required!";
            throw new RequiredOptionNotFoundException(msg);
        }
        if (option.isSplit()) {
            String msg = "The split of like-search is NOT available on parameter-bean.";
            msg = msg + " Don't use splitByXxx(): " + option;
            throw new IllegalOutsideSqlOperationException(msg);
        }
    }

    // ===================================================================================
    //                                                                      Basic Override
    //                                                                      ==============
    /**
     * @return The display string of all parameters. (NotNull)
     */
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append(DfTypeUtil.toClassTitle(this)).append(":");
        sb.append(xbuildColumnString());
        return sb.toString();
    }
    private String xbuildColumnString() {
        final String c = ", ";
        final StringBuilder sb = new StringBuilder();
        sb.append(c).append(_memberStatusCode);
        sb.append(c).append(_formalizedDatetime);
        sb.append(c).append(_memberNameList);
        if (sb.length() > 0) { sb.delete(0, c.length()); }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] memberStatusCode:cls(MemberStatus) <br />
     * @return The value of memberStatusCode. (Nullable, NotEmptyString(when String): if empty string, returns null)
     */
    public String getMemberStatusCode() {
        return filterStringParameter(_memberStatusCode);
    }

    /**
     * [set as 正式会員] memberStatusCode:cls(MemberStatus) <br />
     * 正式な会員としてサイトサービスが利用可能
     */
    public void setMemberStatusCode_正式会員() {
        _memberStatusCode = CDef.MemberStatus.正式会員.code();
    }

    /**
     * [set as 退会会員] memberStatusCode:cls(MemberStatus) <br />
     * 退会が確定した会員でサイトサービスはダメ
     */
    public void setMemberStatusCode_退会会員() {
        _memberStatusCode = CDef.MemberStatus.退会会員.code();
    }

    /**
     * [set as 仮会員] memberStatusCode:cls(MemberStatus) <br />
     * 入会直後のステータスで一部のサイトサービスが利用可能
     */
    public void setMemberStatusCode_仮会員() {
        _memberStatusCode = CDef.MemberStatus.仮会員.code();
    }

    /**
     * [get] formalizedDatetime <br />
     * @return The value of formalizedDatetime. (Nullable, NotEmptyString(when String): if empty string, returns null)
     */
    public java.sql.Timestamp getFormalizedDatetime() {
        return _formalizedDatetime;
    }

    /**
     * [set] formalizedDatetime <br />
     * @param formalizedDatetime The value of formalizedDatetime. (NullAllowed)
     */
    public void setFormalizedDatetime(java.sql.Timestamp formalizedDatetime) {
        _formalizedDatetime = formalizedDatetime;
    }

    /**
     * [get] memberNameList:likeContain <br />
     * @return The value of memberNameList. (Nullable, NotEmptyString(when String): if empty string, returns null)
     */
    public List<String> getMemberNameList() {
        return _memberNameList;
    }

    /**
     * [set as containSearch] memberNameList:likeContain <br />
     * @param memberNameList The value of memberNameList. (NullAllowed)
     */
    public void setMemberNameList_ContainSearch(List<String> memberNameList) {
        _memberNameList = memberNameList;
        _memberNameListInternalLikeSearchOption = new LikeSearchOption().likeContain();
    }

    /**
     * Get the internal option of likeSearch for memberNameList. {Internal Method: Don't invoke this}
     * @return The internal option of likeSearch for memberNameList. (NullAllowed)
     */
    public LikeSearchOption getMemberNameListInternalLikeSearchOption() {
        return _memberNameListInternalLikeSearchOption;
    }

}
