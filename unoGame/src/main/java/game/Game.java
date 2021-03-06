package game;

import client.Client;
import java.awt.Color;
import java.awt.Image;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;

public final class Game extends javax.swing.JFrame {

    
    public static enum SIDE {
        BLACK, GRAY, WHITE
    };
   
    public static Game ThisGame;
    public static boolean myTurn;
    public static SIDE mySide = SIDE.GRAY, otherSide = SIDE.BLACK;
    
    JButton[] myCards;
    
    public ArrayList<Card> cards;
    public Card tempCard;
    public Color LIGHT_BLUE = new Color(51, 153, 255);
    public int rnd;
    @SuppressWarnings("LeakingThisInConstructor")
    public Game() {
        initComponents();
        initButtons();
        ThisGame = this;
    }

    public void initButtons() {
        cards = new ArrayList<Card>();
        jButton1.setBackground(Color.GRAY);
        jLabel1.setText("İlk oynanılacak kartı seçin");
        jButton9.setText("Kart Çek");
        jButton10.setText("Hazır");
        for (int i = 1; i <= 10; i++) {
            cards.add(new Card(i, 'y'));
            cards.add(new Card(i, 'm'));
            cards.add(new Card(i, 'k'));
            cards.add(new Card(i, 's'));
        }
        myCards = new JButton[]{
            jButton2, jButton3, jButton4, jButton5, jButton6, jButton7, jButton8
        };
        
        
        /*for (int i = 0; i < 7; i++) {
            rnd = (int) (Math.random() * cards.size());
            //myCards[i].setIcon(new javax.swing.ImageIcon(getClass().getResource("/game/images/" + cards.get(rnd).getImage() + ".PNG")));
            while (true) {
                if (cards.get(rnd) == null) {
                    rnd = (int) (Math.random() * cards.size());
                } else {
                    break;
                }
            }
            if (cards.get(rnd).color == 'm') {
                myCards[i].setBackground(LIGHT_BLUE);
            } else if (cards.get(rnd).color == 's') {
                myCards[i].setBackground(Color.yellow);
            } else if (cards.get(rnd).color == 'k') {
                myCards[i].setBackground(Color.red);
            } else {
                myCards[i].setBackground(Color.green);
            }
            myCards[i].setText("" + cards.get(rnd).sayi);
            
            

            cards.remove(rnd);
            
        }*/

    }

    public void Reset() {
        if (Client.socket != null) {
            if (Client.socket.isConnected()) {
                Client.Stop();
            }
        }
        btn_connect.setEnabled(true);
        txt_name.setEnabled(true);
        btn_send_message.setEnabled(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings({"unchecked", "Convert2Lambda"})
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        txt_name = new javax.swing.JTextField();
        btn_connect = new javax.swing.JButton();
        pnl_gamer1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        txt_receive = new java.awt.TextArea();
        btn_send_message = new javax.swing.JButton();
        txt_rival_name = new javax.swing.JTextField();
        txt_send = new java.awt.TextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txt_name.setText("Name");
        txt_name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_nameActionPerformed(evt);
            }
        });
        getContentPane().add(txt_name, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 470, 210, 40));

        btn_connect.setText("Connect");
        btn_connect.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_connectActionPerformed(evt);
            }
        });
        getContentPane().add(btn_connect, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 470, 140, 40));

        pnl_gamer1.setBackground(new java.awt.Color(0, 102, 102));
        pnl_gamer1.setForeground(new java.awt.Color(51, 255, 0));
        pnl_gamer1.setMinimumSize(new java.awt.Dimension(250, 250));
        pnl_gamer1.setPreferredSize(new java.awt.Dimension(250, 250));
        pnl_gamer1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton1.setText("jButton1");
        pnl_gamer1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 40, 150, 220));

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton2.setText("jButton2");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        pnl_gamer1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, 75, 60));

        jButton3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton3.setText("jButton3");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        pnl_gamer1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 60, 75, 60));

        jButton4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton4.setText("jButton4");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        pnl_gamer1.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 60, 75, 60));

        jButton5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton5.setText("jButton5");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        pnl_gamer1.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, 75, 60));

        jButton6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton6.setText("jButton6");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        pnl_gamer1.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 130, 75, 60));

        jButton7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton7.setText("jButton7");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        pnl_gamer1.add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 130, 75, 60));

        jButton8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton8.setText("jButton8");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        pnl_gamer1.add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 200, 75, 60));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 0));
        jLabel1.setText("jLabel1");
        pnl_gamer1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 230, 220, 30));

        jButton9.setText("jButton9");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        pnl_gamer1.add(jButton9, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 80, -1, -1));

        jButton10.setText("jButton10");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });
        pnl_gamer1.add(jButton10, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 130, -1, -1));

        getContentPane().add(pnl_gamer1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 680, 290));
        getContentPane().add(txt_receive, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 320, 210, 140));
        txt_receive.getAccessibleContext().setAccessibleName("");

        btn_send_message.setText("Send");
        btn_send_message.setEnabled(false);
        btn_send_message.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_send_messageActionPerformed(evt);
            }
        });
        getContentPane().add(btn_send_message, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 370, 140, 40));

        txt_rival_name.setEditable(false);
        txt_rival_name.setText("Rival");
        txt_rival_name.setEnabled(false);
        getContentPane().add(txt_rival_name, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 470, 210, 40));
        getContentPane().add(txt_send, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 320, 210, 140));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_connectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_connectActionPerformed
        Client.Start("127.0.0.1", 2000);
        btn_connect.setEnabled(false);
        txt_name.setEnabled(false);
        btn_send_message.setEnabled(false);
              
        
    }//GEN-LAST:event_btn_connectActionPerformed

    private void btn_send_messageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_send_messageActionPerformed
        Message msg = new Message(Message.Message_Type.Text);
        msg.content = txt_send.getText();
        Client.Send(msg);
        txt_send.setText("");
    }//GEN-LAST:event_btn_send_messageActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        Client.Stop();
    }//GEN-LAST:event_formWindowClosing

    private void txt_nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_nameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_nameActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        //if(myTurn){
        if (jButton1.getBackground() == Color.GRAY) {
            jButton1.setBackground(jButton5.getBackground());
            jButton1.setText(jButton5.getText());
            
            jButton5.setEnabled(false);
        } else {
            int sayi1 = Integer.parseInt(jButton1.getText());
            int sayi2 = Integer.parseInt(jButton5.getText());
            if (sayi1 == sayi2 || jButton1.getBackground() == jButton5.getBackground()) {
                jButton1.setBackground(jButton5.getBackground());
                jButton1.setText(jButton5.getText());
                jLabel1.setText("Bu kart oynandı.");
                
                jButton5.setEnabled(false);
            } else {
                jLabel1.setText("Bu kart oynanamaz");
            }
        }

        Color color;
        char renk;
        color=jButton8.getBackground();
        int sayi=Integer.parseInt(jButton8.getText());
        if(LIGHT_BLUE == color){
          renk ='m'; 
        }else if(Color.yellow == color){
           renk ='s';
        }else if(Color.red == color){
           renk ='k';
        }else{
           renk = 'y';
        }
            String cd=""+renk+sayi;
            int index =cards.indexOf(cd); 
            
        sendCard(index);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        //if(myTurn){
        if (jButton1.getBackground() == Color.GRAY) {
            jButton1.setBackground(jButton3.getBackground());
            jButton1.setText(jButton3.getText());
            jButton3.setEnabled(false);
        } else {
            int sayi1 = Integer.parseInt(jButton1.getText());
            int sayi2 = Integer.parseInt(jButton3.getText());
            if (sayi1 == sayi2 || jButton1.getBackground() == jButton3.getBackground()) {
                jButton1.setBackground(jButton3.getBackground());
                jButton1.setText(jButton3.getText());
                jLabel1.setText("Bu kart oynandı.");
                jButton3.setEnabled(false);
            } else {
                jLabel1.setText("Bu kart oynanamaz");
            }
        }

        Color color;
        char renk;
        color=jButton8.getBackground();
        int sayi=Integer.parseInt(jButton8.getText());
        if(LIGHT_BLUE == color){
          renk ='m'; 
        }else if(Color.yellow == color){
           renk ='s';
        }else if(Color.red == color){
           renk ='k';
        }else{
           renk = 'y';
        }
            String cd=""+renk+sayi;
            int index =cards.indexOf(cd); 
            
        sendCard(index);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        //if(myTurn){
        if (jButton1.getBackground() == Color.GRAY) {
            jButton1.setBackground(jButton2.getBackground());
            jButton1.setText(jButton2.getText());
            
            jButton2.setEnabled(false);
        } else {
            if (jButton1.getText() == jButton2.getText() || jButton1.getBackground() == jButton2.getBackground()) {
                jButton1.setBackground(jButton2.getBackground());
                jButton1.setText(jButton2.getText());
                jLabel1.setText("Bu kart oynandı.");
                
                jButton2.setEnabled(false);
            } else {
                jLabel1.setText("Bu kart oynanamaz.");
            }
        }
 
        Color color;
        char renk;
        color=jButton8.getBackground();
        int sayi=Integer.parseInt(jButton8.getText());
        if(LIGHT_BLUE == color){
          renk ='m'; 
        }else if(Color.yellow == color){
           renk ='s';
        }else if(Color.red == color){
           renk ='k';
        }else{
           renk = 'y';
        }
            String cd=""+renk+sayi;
            int index =cards.indexOf(cd); 
            
        sendCard(index);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        //if(myTurn){
        if (jButton1.getBackground() == Color.GRAY) {
            jButton1.setBackground(jButton4.getBackground());
            jButton1.setText(jButton4.getText());
            
            jButton4.setEnabled(false);
        } else {
            int sayi1 = Integer.parseInt(jButton1.getText());
            int sayi2 = Integer.parseInt(jButton4.getText());
            if (sayi1 == sayi2 || jButton1.getBackground() == jButton4.getBackground()) {
                jButton1.setBackground(jButton4.getBackground());
                jButton1.setText(jButton4.getText());
                jLabel1.setText("Bu kart oynandı.");
               
                jButton4.setEnabled(false);
            } else {
                jLabel1.setText("Bu kart oynanamaz");
            }
        }

        Color color;
        char renk;
        color=jButton8.getBackground();
        int sayi=Integer.parseInt(jButton8.getText());
        if(LIGHT_BLUE == color){
          renk ='m'; 
        }else if(Color.yellow == color){
           renk ='s';
        }else if(Color.red == color){
           renk ='k';
        }else{
           renk = 'y';
        }
            String cd=""+renk+sayi;
            int index =cards.indexOf(cd); 
            
        sendCard(index);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        //if(myTurn){
        if (jButton1.getBackground() == Color.GRAY) {
            jButton1.setBackground(jButton6.getBackground());
            jButton1.setText(jButton6.getText());
            
            jButton6.setEnabled(false);
        } else {
            int sayi1 = Integer.parseInt(jButton1.getText());
            int sayi2 = Integer.parseInt(jButton6.getText());
            if (sayi1 == sayi2 || jButton1.getBackground() == jButton6.getBackground()) {
                jButton1.setBackground(jButton6.getBackground());
                jButton1.setText(jButton6.getText());
                jLabel1.setText("Bu kart oynandı.");
                
                jButton6.setEnabled(false);
            } else {
                jLabel1.setText("Bu kart oynanamaz");
            }
        }

        Color color;
        char renk;
        color=jButton8.getBackground();
        int sayi=Integer.parseInt(jButton8.getText());
        if(LIGHT_BLUE == color){
          renk ='m'; 
        }else if(Color.yellow == color){
           renk ='s';
        }else if(Color.red == color){
           renk ='k';
        }else{
           renk = 'y';
        }
            String cd=""+renk+sayi;
            int index =cards.indexOf(cd); 
            
        sendCard(index);
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
        //if(myTurn){
        if (jButton1.getBackground() == Color.GRAY) {
            jButton1.setBackground(jButton7.getBackground());
            jButton1.setText(jButton7.getText());
            
            jButton7.setEnabled(false);
        } else {
            int sayi1 = Integer.parseInt(jButton1.getText());
            int sayi2 = Integer.parseInt(jButton7.getText());
            if (sayi1 == sayi2 || jButton1.getBackground() == jButton7.getBackground()) {
                jButton1.setBackground(jButton7.getBackground());
                jButton1.setText(jButton7.getText());
                jLabel1.setText("Bu kart oynandı.");
                
                jButton7.setEnabled(false);
            } else {
                jLabel1.setText("Bu kart oynanamaz");
            }
        }

        Color color;
        char renk;
        color=jButton8.getBackground();
        int sayi=Integer.parseInt(jButton8.getText());
        if(LIGHT_BLUE == color){
          renk ='m'; 
        }else if(Color.yellow == color){
           renk ='s';
        }else if(Color.red == color){
           renk ='k';
        }else{
           renk = 'y';
        }
            String cd=""+renk+sayi;
            int index =cards.indexOf(cd); 
            
        sendCard(index);
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        // TODO add your handling code here:
        //if(myTurn){
        if (jButton1.getBackground() == Color.GRAY) {
            jButton1.setBackground(jButton8.getBackground());
            jButton1.setText(jButton8.getText());
            
            jButton8.setEnabled(false);
        } else {
            int sayi1 = Integer.parseInt(jButton1.getText());
            int sayi2 = Integer.parseInt(jButton8.getText());
            if (sayi1 == sayi2 || jButton1.getBackground() == jButton8.getBackground()) {
                jButton1.setBackground(jButton8.getBackground());
                jButton1.setText(jButton8.getText());
                jLabel1.setText("Bu kart oynandı.");
                
                jButton8.setEnabled(false);
            } else {
                jLabel1.setText("Bu kart oynanamaz");
            }
            
        }
        
        Color color;
        char renk;
        color=jButton8.getBackground();
        int sayi=Integer.parseInt(jButton8.getText());
        if(LIGHT_BLUE == color){
          renk ='m'; 
        }else if(Color.yellow == color){
           renk ='s';
        }else if(Color.red == color){
           renk ='k';
        }else{
           renk = 'y';
        }
            String cd=""+renk+sayi;
            int index =cards.indexOf(cd); 
            
        sendCard(index);
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        // TODO add your handling code here:
        
        for (int i = 0; i < 7; i++) {
            if(myCards[i].isEnabled()){
             
            }else{
            
            tempCard = kartCek();
            
             myCards[i].setText(""+tempCard.sayi);
             
                switch (tempCard.color) {
                    case 'm':
                        myCards[i].setBackground(LIGHT_BLUE);
                        break;
                    case 's':
                        myCards[i].setBackground(Color.yellow);
                        break;
                    case 'k':
                        myCards[i].setBackground(Color.red);
                        break;
                    default:
                        myCards[i].setBackground(Color.green);
                        break;
            
            }
            myCards[i].setEnabled(true);
            cards.remove(tempCard);
            break;
            }
            
            
            
        }
        
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        
        //if(myTurn){
        for (int i = 0; i < 7; i++) {
            rnd = (int) (Math.random() * cards.size());
            //myCards[i].setIcon(new javax.swing.ImageIcon(getClass().getResource("/game/images/" + cards.get(rnd).getImage() + ".PNG")));
            while (true) {
                if (cards.get(rnd) == null) {
                    rnd = (int) (Math.random() * cards.size());
                } else {
                    break;
                }
            }
            if (cards.get(rnd).color == 'm') {
                myCards[i].setBackground(LIGHT_BLUE);
            } else if (cards.get(rnd).color == 's') {
                myCards[i].setBackground(Color.yellow);
            } else if (cards.get(rnd).color == 'k') {
                myCards[i].setBackground(Color.red);
            } else {
                myCards[i].setBackground(Color.green);
            }
            myCards[i].setText("" + cards.get(rnd).sayi);
            
            
            sendCard(rnd);
            cards.remove(rnd);
            
        }        
        
       jButton10.setEnabled(false);
    }//GEN-LAST:event_jButton10ActionPerformed

    public Card kartCek() {
        
        rnd = (int) (Math.random() * cards.size());
        while (true) {
            if (cards.get(rnd) == null) {
                rnd = (int) (Math.random() * cards.size());
            } else {
                break;
            }
        }
        
        return cards.get(rnd);
    }

    public void getCard(String message) {
        int rnd = Integer.parseInt(message);
        myTurn=true;
        cards.remove(rnd);
    }
     private void sendCard(int rnd) {
        // After a move is played, sends the move to the opponent
        Message msg = new Message(Message.Message_Type.Move);
        msg.content =""+rnd;
        Client.Send(msg);
        myTurn=false;
        Game.ThisGame.txt_send.setText("Opponent TURN");
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Game.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Game().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btn_connect;
    public javax.swing.JButton btn_send_message;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    public javax.swing.JLabel jLabel1;
    private javax.swing.JPanel pnl_gamer1;
    public javax.swing.JTextField txt_name;
    public java.awt.TextArea txt_receive;
    public javax.swing.JTextField txt_rival_name;
    public java.awt.TextArea txt_send;
    // End of variables declaration//GEN-END:variables

}
