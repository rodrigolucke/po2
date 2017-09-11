/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package batalhanaval.Eventos;

/**
 *
 * @author rodrigolucke
 */
import batalhanaval.Estado;
import java.io.Serializable;
import java.rmi.Remote;
import java.rmi.RemoteException;


public interface MessageListener extends Serializable, Remote {

	public void message(Estado msg) throws RemoteException;

}
