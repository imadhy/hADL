package com.univ.alma;

import com.univ.alma.metaModel.composantSimple.*;
import com.univ.alma.metaModel.connecteurSimple.RoleFourni;
import com.univ.alma.metaModel.connecteurSimple.RoleRequis;
import com.univ.alma.metaModel.core.AttachmentFournis;
import com.univ.alma.metaModel.core.AttachmentRequis;
import com.univ.alma.model.client.Client;
import com.univ.alma.model.client.PortSendRequest;
import com.univ.alma.model.client.ServiceClient;
import com.univ.alma.model.connecteur.RPC;
import com.univ.alma.model.connecteur.RPCCalled;
import com.univ.alma.model.connecteur.RPCCaller;
import com.univ.alma.model.serveur.PortReceiveRequest;
import com.univ.alma.model.serveur.ServeurComposant;
import com.univ.alma.model.serveur.ServeurConfiguration;
import com.univ.alma.model.serveur.ServeurServices;
import com.univ.alma.model.serveur.connecteur.SecurityQueryCalled;
import com.univ.alma.model.serveur.connexionManager.ConnexionManager;
import com.univ.alma.model.serveur.database.DataBase;
import com.univ.alma.model.serveur.database.PortSecurityManager;
import com.univ.alma.model.serveur.database.ServicesDataBase;
import com.univ.alma.model.serveur.securityManager.SecurityManager;

/**
 * Created by imadhy on 07/12/15.
 */
public class App {

    public static void main(String[] args) {

        ServiceComposantSimpleRequis SCS = new ServiceComposantSimpleRequis("SCS");
        PortComposantSimpleRequis portRequis = new PortComposantSimpleRequis("port Requis", SCS);
        RoleRequis roleRequis = new RoleRequis("Role Fourni");

        AttachmentRequis attReq = new AttachmentRequis(portRequis, roleRequis);
        portRequis.send("Bonjour :D");

        /*
        System.out.println("Client");
        System.out.println("______");
        Client client = new Client("Mon Client");

        System.out.println("\n\n");

        System.out.println("Serveur Composant");
        System.out.println("_________________");
        ServeurComposant serveurComposant = new ServeurComposant("Mon Serveur Composant");

        System.out.println("\n\n");

        System.out.println("Serveur Configuration");
        System.out.println("_____________________");
        ServeurConfiguration serveurConfiguration = new ServeurConfiguration("Mon Serveur Configuration");

        System.out.println("\n\n");

        System.out.println("Connecteur");
        System.out.println("__________");
        RPC rpc = new RPC("Mon RPC");

        System.out.println("\n\n");

        System.out.println("Attachements");
        System.out.println("____________");
        ServiceClient serviceClient = new ServiceClient("Service Client");
        PortComposantSimpleFourni sendRequest = new PortSendRequest("Send Request", serviceClient);
        RoleFourni rpcCaller = new RPCCaller("RPC Caller");
        AttachmentFournis attachmentClientServeur = new AttachmentFournis(sendRequest, rpcCaller);

        System.out.println("\n");

        ServeurServices serviceServeur = new ServeurServices("Service Serveur");
        PortComposantSimpleRequis receiveRequest = new PortReceiveRequest("Receive Request", serviceServeur);
        RoleRequis rpcCalled = new RPCCalled("RPC Called");
        AttachmentRequis attachmentServeurClient = new AttachmentRequis(receiveRequest, rpcCalled);

        System.out.println("\n\n");

        System.out.println("Creation DataBase");
        System.out.println("_________________");
        DataBase composantDB = new DataBase("Data Base");

        System.out.println("\n\n");

        System.out.println("Creation Security Manager");
        System.out.println("_________________");
        SecurityManager composantSM = new SecurityManager("Security Manager");

        System.out.println("\n\n");

        System.out.println("Creation Connection Manager");
        System.out.println("_________________");
        ConnexionManager cnxManager = new ConnexionManager("Connection Manager");

        System.out.println("\n\n");

        System.out.println("Attachements Role Security Query Called et le Port Security Manager");
        System.out.println("____________");
        ServicesDataBase serviceDB = new ServicesDataBase("Service Data-Base");
        PortComposantSimpleRequis portSM = new PortSecurityManager("Security Manager", serviceDB);
        RoleRequis roleSQC = new SecurityQueryCalled("Security Query Called");
        AttachmentRequis attRSQndPSM = new AttachmentRequis(portSM, roleSQC);


        System.out.println("Attachements Role Security Query Called et le Port Security Manager");
        System.out.println("____________");
        ServicesDataBase serviceDB = new ServicesDataBase("Service Data-Base");
        PortComposantSimpleRequis portSM = new PortSecurityManager("Security Manager", serviceDB);
        RoleRequis roleSQC = new SecurityQueryCalled("Security Query Called");
        AttachmentRequis attRSQndPSM = new AttachmentRequis(portSM, roleSQC);
        */
    }
}
