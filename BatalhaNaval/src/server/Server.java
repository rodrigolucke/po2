/**
 * Classe que representa o servidor de aplicação do jogo SocketWar.
 */
package server;

import static cliente.References.socket;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Server {

    public static int counter = 0; // contador de conexoes
    private ArrayList<ClientesConectadosNoServer> clientesConectadosNoServer = new ArrayList<ClientesConectadosNoServer>(); // array de objetos classe ClientesConectadosNoServer, que possui as propriedades de um cliente
    
    public Server() {
        ServerSocket server;
        DataInputStream in; 

        System.out.println("ServerSocket inicializado na porta 5000.");
        
        try {
            server = new ServerSocket(5000); 
            while (true) { // loop infinito
                if(counter < 2){ // limita quantidade de conexoes
                    Socket socket = server.accept(); // aceita conexao, apartir daqui o codigo continua se a conexao foi efetuada
                    // \/ \/ \/ \/
                   ClientesConectadosNoServer auxClientesConectadosNoServer = new ClientesConectadosNoServer(counter, socket); // cria objeto da classe ClientesConectadosNoServer pro cliente que se conectou
                  
                    System.out.println(" *** Player " + counter + " se conectou.");
                     counter++; // incrementa contador de clientes
                    this.clientesConectadosNoServer.add(auxClientesConectadosNoServer); // adiciona ao ArrayList
                    new Thread(new Server.EscutaCliente(auxClientesConectadosNoServer)).start(); // cria uma thread da classe EscutaCliente e starta
                    
                    if(counter >1){ // se o numero de jogadores atual for 2
                        System.out.println("Servidor cheio. Nenhum cliente a mais poderá se conectar;\n----------------------");
                        encaminharParaTodos("start"); // manda ambos startarem o jogo
                    }
                }
            }
        } catch (Exception ex) {
        }
        
    }                                    
    
    /**
     * Método que encaminha para todos os clientes determinada mensagem
     * @param texto 
     */
    private void encaminharParaTodos(String texto){
        try {
            for(ClientesConectadosNoServer clienteCOnectado : clientesConectadosNoServer){
                clienteCOnectado.out.writeUTF(texto);
            }
        } catch (Exception e) {
        }
    }
    
    /**
     * Classe EscutaCliente. Cada cliente tera uma thread executando aqui.
     * Essa classe ouve a mensagem dos clientes, e envia apenas para o outro cliente(adversario).
     */
    private class EscutaCliente implements Runnable {

        ClientesConectadosNoServer clienteConectado;

        public EscutaCliente(ClientesConectadosNoServer clienteConectado) {
            this.clienteConectado = clienteConectado;
        }

        /**
         * Sobrescrevendo metodo run
         */
        @Override
        public void run() {
            String s = "";
            Scanner leitor;
           
           // leitor =  new Scanner((Readable) this.clienteConectado.out);
            try {
                while (true) {
                     s = clienteConectado.in.readUTF(); // le a mensagem que vem do buffer
                     String tipoMsg =s.substring(0,1);
                     
                    //se for um tiro dado por um player no outro
                    if(!((tipoMsg.equals("e")) || (tipoMsg.equals("c")))){
                        if(clienteConectado.id == 0){ // se o cliente desta thread for o 0
                            clientesConectadosNoServer.get(1).out.writeUTF(1+s); // envia a mensagem para o 1
                              System.out.println("p0 disparou em p1 "+s);
                            // clientesConectadosNoServer.get(0).out.writeUTF("false");
                            // clientesConectadosNoServer.get(1).out.writeUTF("true");
                        } else { // se nao, o cliente é o 1
                           System.out.println("p1 disparou em p0 "+s);;
                           clientesConectadosNoServer.get(0).out.writeUTF(0+s); // envia mensagem para o 0
                           // clientesConectadosNoServer.get(0).out.writeUTF("true");
                            //clientesConectadosNoServer.get(1).out.writeUTF("false");
                        }
                   
                    }else{//se for o retorno de um acerto ou erro de um plauer para o outro
                       
                        if(clienteConectado.id == 0){ // se o cliente desta thread for o 0
                            //peimeiro o que envia depois o que recebe
                            clientesConectadosNoServer.get(1).out.writeUTF(s); // envia a mensagem para o 1
                              System.out.println("p0 respondeu para p1 "+s);
                            // clientesConectadosNoServer.get(0).out.writeUTF("false");
                            // clientesConectadosNoServer.get(1).out.writeUTF("true");
                        } else { // se nao, o cliente é o 1
                           System.out.println("p1 respondeu para p0 "+s);;
                           clientesConectadosNoServer.get(0).out.writeUTF(s); // envia mensagem para o 0
                           // clientesConectadosNoServer.get(0).out.writeUTF("true");
                            //clientesConectadosNoServer.get(1).out.writeUTF("false");
                        }
                    }
                    // DEBUG  System.out.println("id " + np.id + " :" + s);
                }
            } catch (Exception ex) {
            }
        }
    }
    
    /*
    public static void main(String args[]) {
        new Server(); // metodo main chama o construtor da classe Server
    }
        */   
}
