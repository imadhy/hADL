package com.univ.alma.metaModel.connecteurSimple;

import com.univ.alma.metaModel.core.Message;

import java.util.Observable;
import java.util.Observer;

/**
 * Created by imadhy on 07/12/15.
 */
public class Glue implements Observer {

    private RoleFourni roleFourni;
    private RoleRequis roleRequis;

    public Glue(RoleRequis roleRequis, RoleFourni roleFourni){
        this.roleFourni = roleFourni;
        this.roleRequis = roleRequis;

        this.roleFourni.addObserver(this);
        this.roleRequis.addObserver(this);
    }

    @Override
    public void update(Observable o, Object arg) {
        Message message = (Message) arg;

        if(o instanceof RoleFourni) {
            System.out.println("\nUpdate | Glue: " + this.getClass().getSimpleName() + " | message = " + message + "\n");
            this.roleRequis.send(message);
        }
    }
}
