package com.univ.alma.model.connecteur;

import com.univ.alma.metaModel.connecteurSimple.Glue;
import com.univ.alma.metaModel.connecteurSimple.RoleFourni;
import com.univ.alma.metaModel.connecteurSimple.RoleRequis;

/**
 * Created by imadhy on 07/12/15.
 */
public class GlueSQLQuery extends Glue {

    public GlueSQLQuery(RoleFourni rl, RoleRequis rq) {
        super(rl, rq);
    }
}
