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
package org.dbflute.quickstage.dbflute.bsentity.customize;

import java.io.Serializable;
import java.util.List;
import java.util.ArrayList;
import java.util.Set;
import java.util.Date;

import org.seasar.dbflute.dbmeta.DBMeta;
import org.seasar.dbflute.Entity;
import org.dbflute.quickstage.dbflute.allcommon.CDef;
import org.dbflute.quickstage.dbflute.exentity.customize.*;

/**
 * The entity of OptionMember. <br />
 * <pre>
 * [primary-key]
 *     
 * 
 * [column]
 *     MEMBER_ID, MEMBER_NAME, BIRTHDATE, FORMALIZED_DATETIME, MEMBER_STATUS_CODE, MEMBER_STATUS_NAME, STATUS_DISPLAY_ORDER, DUMMY_FLG, DUMMY_NOFLG
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
 *     
 * 
 * [referrer table]
 *     
 * 
 * [foreign property]
 *     
 * 
 * [referrer property]
 *     
 * 
 * [get/set template]
 * /= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
 * Integer memberId = entity.getMemberId();
 * String memberName = entity.getMemberName();
 * java.util.Date birthdate = entity.getBirthdate();
 * java.sql.Timestamp formalizedDatetime = entity.getFormalizedDatetime();
 * String memberStatusCode = entity.getMemberStatusCode();
 * String memberStatusName = entity.getMemberStatusName();
 * Integer statusDisplayOrder = entity.getStatusDisplayOrder();
 * Integer dummyFlg = entity.getDummyFlg();
 * Integer dummyNoflg = entity.getDummyNoflg();
 * entity.setMemberId(memberId);
 * entity.setMemberName(memberName);
 * entity.setBirthdate(birthdate);
 * entity.setFormalizedDatetime(formalizedDatetime);
 * entity.setMemberStatusCode(memberStatusCode);
 * entity.setMemberStatusName(memberStatusName);
 * entity.setStatusDisplayOrder(statusDisplayOrder);
 * entity.setDummyFlg(dummyFlg);
 * entity.setDummyNoflg(dummyNoflg);
 * = = = = = = = = = =/
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsOptionMember implements Entity, Serializable, Cloneable {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** Serial version UID. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    // -----------------------------------------------------
    //                                                Column
    //                                                ------
    /** (会員ID)MEMBER_ID: {INTEGER(10), refers to MEMBER.MEMBER_ID} */
    protected Integer _memberId;

    /** (会員名称)MEMBER_NAME: {VARCHAR(200), refers to MEMBER.MEMBER_NAME} */
    protected String _memberName;

    /** (生年月日)BIRTHDATE: {DATE(8), refers to MEMBER.BIRTHDATE} */
    protected java.util.Date _birthdate;

    /** (正式会員日時)FORMALIZED_DATETIME: {TIMESTAMP(23, 10), refers to MEMBER.FORMALIZED_DATETIME} */
    protected java.sql.Timestamp _formalizedDatetime;

    /** (会員ステータスコード)MEMBER_STATUS_CODE: {CHAR(3), refers to MEMBER.MEMBER_STATUS_CODE, classification=MemberStatus} */
    protected String _memberStatusCode;

    /** (会員ステータス名称)MEMBER_STATUS_NAME: {VARCHAR(50), refers to MEMBER_STATUS.MEMBER_STATUS_NAME} */
    protected String _memberStatusName;

    /** (表示順)STATUS_DISPLAY_ORDER: {INTEGER(10), refers to MEMBER_STATUS.DISPLAY_ORDER} */
    protected Integer _statusDisplayOrder;

    /** DUMMY_FLG: {INTEGER(10), classification=Flg} */
    protected Integer _dummyFlg;

    /** DUMMY_NOFLG: {INTEGER(10)} */
    protected Integer _dummyNoflg;

    // -----------------------------------------------------
    //                                              Internal
    //                                              --------
    /** The unique-driven properties for this entity. (NotNull) */
    protected final EntityUniqueDrivenProperties __uniqueDrivenProperties = newUniqueDrivenProperties();

    /** The modified properties for this entity. (NotNull) */
    protected final EntityModifiedProperties __modifiedProperties = newModifiedProperties();

    /** Is the entity created by DBFlute select process? */
    protected boolean __createdBySelect;

    // ===================================================================================
    //                                                                          Table Name
    //                                                                          ==========
    /**
     * {@inheritDoc}
     */
    public String getTableDbName() {
        return "OptionMember";
    }

    /**
     * {@inheritDoc}
     */
    public String getTablePropertyName() { // according to Java Beans rule
        return "optionMember";
    }

    // ===================================================================================
    //                                                                              DBMeta
    //                                                                              ======
    /**
     * {@inheritDoc}
     */
    public DBMeta getDBMeta() {
        return org.dbflute.quickstage.dbflute.bsentity.customize.dbmeta.OptionMemberDbm.getInstance();
    }

    // ===================================================================================
    //                                                                         Primary Key
    //                                                                         ===========
    /**
     * {@inheritDoc}
     */
    public boolean hasPrimaryKeyValue() {
        return false;
    }

    /**
     * {@inheritDoc}
     */
    public Set<String> myuniqueDrivenProperties() {
        return __uniqueDrivenProperties.getPropertyNames();
    }

    protected EntityUniqueDrivenProperties newUniqueDrivenProperties() {
        return new EntityUniqueDrivenProperties();
    }

    // ===================================================================================
    //                                                             Classification Property
    //                                                             =======================
    /**
     * Get the value of memberStatusCode as the classification of MemberStatus. <br />
     * (会員ステータスコード)MEMBER_STATUS_CODE: {CHAR(3), refers to MEMBER.MEMBER_STATUS_CODE, classification=MemberStatus} <br />
     * 入会から退会までの会員のステータスを示す
     * <p>It's treated as case insensitive and if the code value is null, it returns null.</p>
     * @return The instance of classification definition (as ENUM type). (NullAllowed: when the column value is null)
     */
    public CDef.MemberStatus getMemberStatusCodeAsMemberStatus() {
        return CDef.MemberStatus.codeOf(getMemberStatusCode());
    }

    /**
     * Set the value of memberStatusCode as the classification of MemberStatus. <br />
     * (会員ステータスコード)MEMBER_STATUS_CODE: {CHAR(3), refers to MEMBER.MEMBER_STATUS_CODE, classification=MemberStatus} <br />
     * 入会から退会までの会員のステータスを示す
     * @param cdef The instance of classification definition (as ENUM type). (NullAllowed: if null, null value is set to the column)
     */
    public void setMemberStatusCodeAsMemberStatus(CDef.MemberStatus cdef) {
        setMemberStatusCode(cdef != null ? cdef.code() : null);
    }

    /**
     * Get the value of dummyFlg as the classification of Flg. <br />
     * DUMMY_FLG: {INTEGER(10), classification=Flg} <br />
     * 二つに一つ、フラグを示す
     * <p>It's treated as case insensitive and if the code value is null, it returns null.</p>
     * @return The instance of classification definition (as ENUM type). (NullAllowed: when the column value is null)
     */
    public CDef.Flg getDummyFlgAsFlg() {
        return CDef.Flg.codeOf(getDummyFlg());
    }

    /**
     * Set the value of dummyFlg as the classification of Flg. <br />
     * DUMMY_FLG: {INTEGER(10), classification=Flg} <br />
     * 二つに一つ、フラグを示す
     * @param cdef The instance of classification definition (as ENUM type). (NullAllowed: if null, null value is set to the column)
     */
    public void setDummyFlgAsFlg(CDef.Flg cdef) {
        setDummyFlg(cdef != null ? FunCustodial.toNumber(cdef.code(), Integer.class) : null);
    }

    /**
     * Set the value of dummyFlg as boolean. <br />
     * DUMMY_FLG: {INTEGER(10), classification=Flg} <br />
     * 二つに一つ、フラグを示す
     * @param determination The determination, true or false. (NullAllowed: if null, null value is set to the column)
     */
    public void setDummyFlgAsBoolean(Boolean determination) {
        setDummyFlgAsFlg(CDef.Flg.codeOf(determination));
    }

    // ===================================================================================
    //                                                              Classification Setting
    //                                                              ======================
    /**
     * Set the value of memberStatusCode as 正式会員 (FML). <br />
     * 正式会員: 正式な会員としてサイトサービスが利用可能
     */
    public void setMemberStatusCode_正式会員() {
        setMemberStatusCodeAsMemberStatus(CDef.MemberStatus.正式会員);
    }

    /**
     * Set the value of memberStatusCode as 退会会員 (WDL). <br />
     * 退会会員: 退会が確定した会員でサイトサービスはダメ
     */
    public void setMemberStatusCode_退会会員() {
        setMemberStatusCodeAsMemberStatus(CDef.MemberStatus.退会会員);
    }

    /**
     * Set the value of memberStatusCode as 仮会員 (PRV). <br />
     * 仮会員: 入会直後のステータスで一部のサイトサービスが利用可能
     */
    public void setMemberStatusCode_仮会員() {
        setMemberStatusCodeAsMemberStatus(CDef.MemberStatus.仮会員);
    }

    /**
     * Set the value of dummyFlg as True (1). <br />
     * はい: 有効を示す
     */
    public void setDummyFlg_True() {
        setDummyFlgAsFlg(CDef.Flg.True);
    }

    /**
     * Set the value of dummyFlg as False (0). <br />
     * いいえ: 無効を示す
     */
    public void setDummyFlg_False() {
        setDummyFlgAsFlg(CDef.Flg.False);
    }

    // ===================================================================================
    //                                                        Classification Determination
    //                                                        ============================
    /**
     * Is the value of memberStatusCode 正式会員? <br />
     * 正式会員: 正式な会員としてサイトサービスが利用可能
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isMemberStatusCode正式会員() {
        CDef.MemberStatus cdef = getMemberStatusCodeAsMemberStatus();
        return cdef != null ? cdef.equals(CDef.MemberStatus.正式会員) : false;
    }

    /**
     * Is the value of memberStatusCode 退会会員? <br />
     * 退会会員: 退会が確定した会員でサイトサービスはダメ
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isMemberStatusCode退会会員() {
        CDef.MemberStatus cdef = getMemberStatusCodeAsMemberStatus();
        return cdef != null ? cdef.equals(CDef.MemberStatus.退会会員) : false;
    }

    /**
     * Is the value of memberStatusCode 仮会員? <br />
     * 仮会員: 入会直後のステータスで一部のサイトサービスが利用可能
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isMemberStatusCode仮会員() {
        CDef.MemberStatus cdef = getMemberStatusCodeAsMemberStatus();
        return cdef != null ? cdef.equals(CDef.MemberStatus.仮会員) : false;
    }

    /**
     * サービスが利用できる会員 <br />
     * The group elements:[正式会員, 仮会員]
     * @return The determination, true or false.
     */
    public boolean isMemberStatusCode_ServiceAvailable() {
        CDef.MemberStatus cdef = getMemberStatusCodeAsMemberStatus();
        return cdef != null && cdef.isServiceAvailable();
    }

    /**
     * Is the value of dummyFlg True? <br />
     * はい: 有効を示す
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isDummyFlgTrue() {
        CDef.Flg cdef = getDummyFlgAsFlg();
        return cdef != null ? cdef.equals(CDef.Flg.True) : false;
    }

    /**
     * Is the value of dummyFlg False? <br />
     * いいえ: 無効を示す
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isDummyFlgFalse() {
        CDef.Flg cdef = getDummyFlgAsFlg();
        return cdef != null ? cdef.equals(CDef.Flg.False) : false;
    }

    // ===================================================================================
    //                                                           Classification Name/Alias
    //                                                           =========================
    /**
     * Get the value of the column 'dummyFlg' as classification name.
     * @return The string of classification name. (NullAllowed: when the column value is null)
     */
    public String getDummyFlgName() {
        CDef.Flg cdef = getDummyFlgAsFlg();
        return cdef != null ? cdef.name() : null;
    }

    /**
     * Get the value of the column 'dummyFlg' as classification alias.
     * @return The string of classification alias. (NullAllowed: when the column value is null)
     */
    public String getDummyFlgAlias() {
        CDef.Flg cdef = getDummyFlgAsFlg();
        return cdef != null ? cdef.alias() : null;
    }

    // ===================================================================================
    //                                                                    Foreign Property
    //                                                                    ================
    // ===================================================================================
    //                                                                   Referrer Property
    //                                                                   =================
    protected <ELEMENT> List<ELEMENT> newReferrerList() {
        return new ArrayList<ELEMENT>();
    }

    // ===================================================================================
    //                                                                 Modified Properties
    //                                                                 ===================
    /**
     * {@inheritDoc}
     */
    public Set<String> modifiedProperties() {
        return __modifiedProperties.getPropertyNames();
    }

    /**
     * {@inheritDoc}
     */
    public void clearModifiedInfo() {
        __modifiedProperties.clear();
    }

    /**
     * {@inheritDoc}
     */
    public boolean hasModification() {
        return !__modifiedProperties.isEmpty();
    }

    protected EntityModifiedProperties newModifiedProperties() {
        return new EntityModifiedProperties();
    }

    // ===================================================================================
    //                                                                     Birthplace Mark
    //                                                                     ===============
    /**
     * {@inheritDoc}
     */
    public void markAsSelect() {
        __createdBySelect = true;
    }

    /**
     * {@inheritDoc}
     */
    public boolean createdBySelect() {
        return __createdBySelect;
    }

    // ===================================================================================
    //                                                                      Basic Override
    //                                                                      ==============
    /**
     * Determine the object is equal with this. <br />
     * If primary-keys or columns of the other are same as this one, returns true.
     * @param obj The object as other entity. (NullAllowed: if null, returns false fixedly)
     * @return Comparing result.
     */
    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof BsOptionMember)) { return false; }
        BsOptionMember other = (BsOptionMember)obj;
        if (!xSV(getMemberId(), other.getMemberId())) { return false; }
        if (!xSV(getMemberName(), other.getMemberName())) { return false; }
        if (!xSV(getBirthdate(), other.getBirthdate())) { return false; }
        if (!xSV(getFormalizedDatetime(), other.getFormalizedDatetime())) { return false; }
        if (!xSV(getMemberStatusCode(), other.getMemberStatusCode())) { return false; }
        if (!xSV(getMemberStatusName(), other.getMemberStatusName())) { return false; }
        if (!xSV(getStatusDisplayOrder(), other.getStatusDisplayOrder())) { return false; }
        if (!xSV(getDummyFlg(), other.getDummyFlg())) { return false; }
        if (!xSV(getDummyNoflg(), other.getDummyNoflg())) { return false; }
        return true;
    }
    protected boolean xSV(Object v1, Object v2) {
        return FunCustodial.isSameValue(v1, v2);
    }

    /**
     * Calculate the hash-code from primary-keys or columns.
     * @return The hash-code from primary-key or columns.
     */
    public int hashCode() {
        int hs = 17;
        hs = xCH(hs, getTableDbName());
        hs = xCH(hs, getMemberId());
        hs = xCH(hs, getMemberName());
        hs = xCH(hs, getBirthdate());
        hs = xCH(hs, getFormalizedDatetime());
        hs = xCH(hs, getMemberStatusCode());
        hs = xCH(hs, getMemberStatusName());
        hs = xCH(hs, getStatusDisplayOrder());
        hs = xCH(hs, getDummyFlg());
        hs = xCH(hs, getDummyNoflg());
        return hs;
    }
    protected int xCH(int hs, Object vl) {
        return FunCustodial.calculateHashcode(hs, vl);
    }

    /**
     * {@inheritDoc}
     */
    public int instanceHash() {
        return super.hashCode();
    }

    /**
     * Convert to display string of entity's data. (no relation data)
     * @return The display string of all columns and relation existences. (NotNull)
     */
    public String toString() {
        return buildDisplayString(FunCustodial.toClassTitle(this), true, true);
    }

    /**
     * {@inheritDoc}
     */
    public String toStringWithRelation() {
        StringBuilder sb = new StringBuilder();
        sb.append(toString());
        return sb.toString();
    }

    /**
     * {@inheritDoc}
     */
    public String buildDisplayString(String name, boolean column, boolean relation) {
        StringBuilder sb = new StringBuilder();
        if (name != null) { sb.append(name).append(column || relation ? ":" : ""); }
        if (column) { sb.append(buildColumnString()); }
        if (relation) { sb.append(buildRelationString()); }
        sb.append("@").append(Integer.toHexString(hashCode()));
        return sb.toString();
    }
    protected String buildColumnString() {
        StringBuilder sb = new StringBuilder();
        String dm = ", ";
        sb.append(dm).append(getMemberId());
        sb.append(dm).append(getMemberName());
        sb.append(dm).append(xfUD(getBirthdate()));
        sb.append(dm).append(getFormalizedDatetime());
        sb.append(dm).append(getMemberStatusCode());
        sb.append(dm).append(getMemberStatusName());
        sb.append(dm).append(getStatusDisplayOrder());
        sb.append(dm).append(getDummyFlg());
        sb.append(dm).append(getDummyNoflg());
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length());
        }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }
    protected String xfUD(Date date) { // formatUtilDate()
        return FunCustodial.toString(date, xgDP());
    }
    protected String xgDP() { // getDatePattern
        return "yyyy-MM-dd";
    }
    protected String buildRelationString() {
        return "";
    }

    /**
     * Clone entity instance using super.clone(). (shallow copy) 
     * @return The cloned instance of this entity. (NotNull)
     */
    public OptionMember clone() {
        try {
            return (OptionMember)super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Failed to clone the entity: " + toString(), e);
        }
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] (会員ID)MEMBER_ID: {INTEGER(10), refers to MEMBER.MEMBER_ID} <br />
     * 連番として自動採番される。会員IDだけに限らず採番方法はDBMS次第。
     * @return The value of the column 'MEMBER_ID'. (NullAllowed even if selected: for no constraint)
     */
    public Integer getMemberId() {
        return _memberId;
    }

    /**
     * [set] (会員ID)MEMBER_ID: {INTEGER(10), refers to MEMBER.MEMBER_ID} <br />
     * 連番として自動採番される。会員IDだけに限らず採番方法はDBMS次第。
     * @param memberId The value of the column 'MEMBER_ID'. (NullAllowed: null update allowed for no constraint)
     */
    public void setMemberId(Integer memberId) {
        __modifiedProperties.addPropertyName("memberId");
        this._memberId = memberId;
    }

    /**
     * [get] (会員名称)MEMBER_NAME: {VARCHAR(200), refers to MEMBER.MEMBER_NAME} <br />
     * 会員のフルネームの名称。<br />
     * 苗字と名前を分けて管理することが多いが、ここでは単純にひとまとめ。
     * @return The value of the column 'MEMBER_NAME'. (NullAllowed even if selected: for no constraint)
     */
    public String getMemberName() {
        return convertEmptyToNull(_memberName);
    }

    /**
     * [set] (会員名称)MEMBER_NAME: {VARCHAR(200), refers to MEMBER.MEMBER_NAME} <br />
     * 会員のフルネームの名称。<br />
     * 苗字と名前を分けて管理することが多いが、ここでは単純にひとまとめ。
     * @param memberName The value of the column 'MEMBER_NAME'. (NullAllowed: null update allowed for no constraint)
     */
    public void setMemberName(String memberName) {
        __modifiedProperties.addPropertyName("memberName");
        this._memberName = memberName;
    }

    /**
     * [get] (生年月日)BIRTHDATE: {DATE(8), refers to MEMBER.BIRTHDATE} <br />
     * 必須項目ではないので、このデータがない会員もいる。<br />
     * // select column comment here (no as)
     * @return The value of the column 'BIRTHDATE'. (NullAllowed even if selected: for no constraint)
     */
    public java.util.Date getBirthdate() {
        return _birthdate;
    }

    /**
     * [set] (生年月日)BIRTHDATE: {DATE(8), refers to MEMBER.BIRTHDATE} <br />
     * 必須項目ではないので、このデータがない会員もいる。<br />
     * // select column comment here (no as)
     * @param birthdate The value of the column 'BIRTHDATE'. (NullAllowed: null update allowed for no constraint)
     */
    public void setBirthdate(java.util.Date birthdate) {
        __modifiedProperties.addPropertyName("birthdate");
        this._birthdate = birthdate;
    }

    /**
     * [get] (正式会員日時)FORMALIZED_DATETIME: {TIMESTAMP(23, 10), refers to MEMBER.FORMALIZED_DATETIME} <br />
     * 会員が正式に確定した(正式会員になった)日時。<br />
     * 一度確定したらもう二度と更新されないはずだ！<br />
     * // select column comment here (using as)
     * @return The value of the column 'FORMALIZED_DATETIME'. (NullAllowed even if selected: for no constraint)
     */
    public java.sql.Timestamp getFormalizedDatetime() {
        return _formalizedDatetime;
    }

    /**
     * [set] (正式会員日時)FORMALIZED_DATETIME: {TIMESTAMP(23, 10), refers to MEMBER.FORMALIZED_DATETIME} <br />
     * 会員が正式に確定した(正式会員になった)日時。<br />
     * 一度確定したらもう二度と更新されないはずだ！<br />
     * // select column comment here (using as)
     * @param formalizedDatetime The value of the column 'FORMALIZED_DATETIME'. (NullAllowed: null update allowed for no constraint)
     */
    public void setFormalizedDatetime(java.sql.Timestamp formalizedDatetime) {
        __modifiedProperties.addPropertyName("formalizedDatetime");
        this._formalizedDatetime = formalizedDatetime;
    }

    /**
     * [get] (会員ステータスコード)MEMBER_STATUS_CODE: {CHAR(3), refers to MEMBER.MEMBER_STATUS_CODE, classification=MemberStatus} <br />
     * 会員ステータスを参照するコード。<br />
     * ステータスが変わるたびに、このカラムが更新される。
     * @return The value of the column 'MEMBER_STATUS_CODE'. (NullAllowed even if selected: for no constraint)
     */
    public String getMemberStatusCode() {
        return convertEmptyToNull(_memberStatusCode);
    }

    /**
     * [set] (会員ステータスコード)MEMBER_STATUS_CODE: {CHAR(3), refers to MEMBER.MEMBER_STATUS_CODE, classification=MemberStatus} <br />
     * 会員ステータスを参照するコード。<br />
     * ステータスが変わるたびに、このカラムが更新される。
     * @param memberStatusCode The value of the column 'MEMBER_STATUS_CODE'. (NullAllowed: null update allowed for no constraint)
     */
    protected void setMemberStatusCode(String memberStatusCode) {
        __modifiedProperties.addPropertyName("memberStatusCode");
        this._memberStatusCode = memberStatusCode;
    }

    /**
     * [get] (会員ステータス名称)MEMBER_STATUS_NAME: {VARCHAR(50), refers to MEMBER_STATUS.MEMBER_STATUS_NAME} <br />
     * 表示用の名称。<br />
     * 国際化対応するときはもっと色々考える必要があるかと...ということで英語名カラムがないので、そのまま区分値メソッド名の一部としても利用される。
     * @return The value of the column 'MEMBER_STATUS_NAME'. (NullAllowed even if selected: for no constraint)
     */
    public String getMemberStatusName() {
        return convertEmptyToNull(_memberStatusName);
    }

    /**
     * [set] (会員ステータス名称)MEMBER_STATUS_NAME: {VARCHAR(50), refers to MEMBER_STATUS.MEMBER_STATUS_NAME} <br />
     * 表示用の名称。<br />
     * 国際化対応するときはもっと色々考える必要があるかと...ということで英語名カラムがないので、そのまま区分値メソッド名の一部としても利用される。
     * @param memberStatusName The value of the column 'MEMBER_STATUS_NAME'. (NullAllowed: null update allowed for no constraint)
     */
    public void setMemberStatusName(String memberStatusName) {
        __modifiedProperties.addPropertyName("memberStatusName");
        this._memberStatusName = memberStatusName;
    }

    /**
     * [get] (表示順)STATUS_DISPLAY_ORDER: {INTEGER(10), refers to MEMBER_STATUS.DISPLAY_ORDER} <br />
     * UI上のステータスの表示順を示すNO。<br />
     * 並べるときは、このカラムに対して昇順のソート条件にする。
     * @return The value of the column 'STATUS_DISPLAY_ORDER'. (NullAllowed even if selected: for no constraint)
     */
    public Integer getStatusDisplayOrder() {
        return _statusDisplayOrder;
    }

    /**
     * [set] (表示順)STATUS_DISPLAY_ORDER: {INTEGER(10), refers to MEMBER_STATUS.DISPLAY_ORDER} <br />
     * UI上のステータスの表示順を示すNO。<br />
     * 並べるときは、このカラムに対して昇順のソート条件にする。
     * @param statusDisplayOrder The value of the column 'STATUS_DISPLAY_ORDER'. (NullAllowed: null update allowed for no constraint)
     */
    public void setStatusDisplayOrder(Integer statusDisplayOrder) {
        __modifiedProperties.addPropertyName("statusDisplayOrder");
        this._statusDisplayOrder = statusDisplayOrder;
    }

    /**
     * [get] DUMMY_FLG: {INTEGER(10), classification=Flg} <br />
     * @return The value of the column 'DUMMY_FLG'. (NullAllowed even if selected: for no constraint)
     */
    public Integer getDummyFlg() {
        return _dummyFlg;
    }

    /**
     * [set] DUMMY_FLG: {INTEGER(10), classification=Flg} <br />
     * @param dummyFlg The value of the column 'DUMMY_FLG'. (NullAllowed: null update allowed for no constraint)
     */
    protected void setDummyFlg(Integer dummyFlg) {
        checkImplicitSet("DUMMY_FLG", CDef.DefMeta.Flg, dummyFlg);
        __modifiedProperties.addPropertyName("dummyFlg");
        this._dummyFlg = dummyFlg;
    }

    /**
     * [get] DUMMY_NOFLG: {INTEGER(10)} <br />
     * @return The value of the column 'DUMMY_NOFLG'. (NullAllowed even if selected: for no constraint)
     */
    public Integer getDummyNoflg() {
        return _dummyNoflg;
    }

    /**
     * [set] DUMMY_NOFLG: {INTEGER(10)} <br />
     * @param dummyNoflg The value of the column 'DUMMY_NOFLG'. (NullAllowed: null update allowed for no constraint)
     */
    public void setDummyNoflg(Integer dummyNoflg) {
        __modifiedProperties.addPropertyName("dummyNoflg");
        this._dummyNoflg = dummyNoflg;
    }

    protected String convertEmptyToNull(String value) {
        return FunCustodial.convertEmptyToNull(value);
    }

    protected void checkImplicitSet(String columnDbName, CDef.DefMeta meta, Object value) {
        FunCustodial.checkImplicitSet(this, columnDbName, meta, value);
    }
}
