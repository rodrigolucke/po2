package server;

/**
 * Esta classe possui propriedades de um cliente.
 * É usada pela classe Server.
 */

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.Socket;
import java.util.Scanner;

public class ClientesConectadosNoServer {

    public int id; // o id do cliente
    public Socket socket; // o socket
    public DataInputStream in; // canal de entrada
    public DataOutputStream out; // canal de saida
    boolean naRodada;
    

    public ClientesConectadosNoServer(int id, Socket socket) {
        this.id = id;
        this.socket = socket;
        this.naRodada = false;
        try {
            in = new DataInputStream(socket.getInputStream());
            out = new DataOutputStream(socket.getOutputStream());
        } catch (Exception e) {
        }
    }
    
    
    
}
