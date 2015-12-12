package com.univ.alma.model.client;

import com.univ.alma.metaModel.composantSimple.PortComposantSimpleFourni;
import com.univ.alma.metaModel.composantSimple.ServiceComposantSimpleFourni;

/**
 * Created by imadhy on 07/12/15.
 */
public class PortSendRequest extends PortComposantSimpleFourni {

    public PortSendRequest(String nom, ServiceComposantSimpleFourni S) {
        super(nom, S);
    }
}
