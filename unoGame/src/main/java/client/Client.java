package client;

import game.Message;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;
import static client.Client.sInput;
import game.*;

class Listen extends Thread {

    public void run() {
        while (Client.socket.isConnected()) {
            try {
                Message received = (Message) (sInput.readObject());
                switch (received.type) {
                    case RivalConnected:
                        String side = received.content.toString();
                        Game.myTurn = true;
                        Game.ThisGame.btn_send_message.setEnabled(true);
                        break;
                    case Name:
                        String name = received.content.toString();
                        Game.ThisGame.txt_rival_name.setText(name);
                        break;
                    case Disconnect:
                        break;
                    case Text:
                        Game.ThisGame.txt_receive.setText(received.content.toString());
                        break;
                    case Move:
                        Game.ThisGame.getCard(received.content.toString());
                        Game.ThisGame.jLabel1.setText("Senin sıran");
                        break;
                    
                }
            } catch (IOException | ClassNotFoundException ex) {
                Logger.getLogger(Client.class.getName()).log(Level.SEVERE, null, ex);
                break;
            }
        }
    }
}

public class Client {

    public static Socket socket;
    public static ObjectInputStream sInput;
    public static ObjectOutputStream sOutput;
    public static Listen listenMe;

    public static void Start(String ip, int port) {
        try {
            Client.socket = new Socket(ip, port);
            Client.Display("Connected to Server");
            Client.sInput = new ObjectInputStream(Client.socket.getInputStream());
            Client.sOutput = new ObjectOutputStream(Client.socket.getOutputStream());
            Client.listenMe = new Listen();
            Client.listenMe.start();

            Message msg = new Message(Message.Message_Type.Name);
            msg.content = Game.ThisGame.txt_name.getText();
            Client.Send(msg);
        } catch (IOException ex) {
            Logger.getLogger(Client.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static void Stop() {
        try {
            if (Client.socket != null) {
                Client.listenMe.stop();
                Client.socket.close();
                Client.sOutput.flush();
                Client.sOutput.close();
                Client.sInput.close();
            }
        } catch (IOException ex) {
            Logger.getLogger(Client.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static void Display(String msg) {
        System.out.println(msg);
    }

    public static void Send(Message msg) {
        try {
            Client.sOutput.writeObject(msg);
        } catch (IOException ex) {
            Logger.getLogger(Client.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
