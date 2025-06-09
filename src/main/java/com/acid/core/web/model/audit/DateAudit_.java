package com.acid.core.web.model.audit;

import com.acid.core.web.constants.DeleteFlag;
import jakarta.persistence.metamodel.SingularAttribute;
import jakarta.persistence.metamodel.StaticMetamodel;

@StaticMetamodel(DateAudit.class)
public class DateAudit_ {

    public static SingularAttribute<DateAudit, DeleteFlag> deleteFlag;

}
