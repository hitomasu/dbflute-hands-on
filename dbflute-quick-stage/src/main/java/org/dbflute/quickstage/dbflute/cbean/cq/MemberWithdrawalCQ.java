/*
 * Copyright(c) DBFlute TestCo.,TestLtd. All Rights Reserved.
 */
package org.dbflute.quickstage.dbflute.cbean.cq;

import org.dbflute.quickstage.dbflute.cbean.cq.bs.BsMemberWithdrawalCQ;
import org.seasar.dbflute.cbean.ConditionQuery;
import org.seasar.dbflute.cbean.sqlclause.SqlClause;


/**
 * The condition-query of MEMBER_WITHDRAWAL.
 * <p>
 * You can implement your original methods here.
 * This class is NOT overrided when re-generating.
 * </p>
 * @author DBFlute(AutoGenerator)
 */
public class MemberWithdrawalCQ extends BsMemberWithdrawalCQ {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    /**
     * Constructor.
     * @param childQuery Child query as abstract class. (Nullable: If null, this is base instance.)
     * @param sqlClause SQL clause instance. (NotNull)
     * @param aliasName My alias name. (NotNull)
     * @param nestLevel Nest level.
     */
    public MemberWithdrawalCQ(ConditionQuery childQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(childQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                      Arrange Method
    //                                                                      ==============
    // You can make original arrange query methods here.
    // public void arranegeXxx() {
    //     ...
    // }
}
