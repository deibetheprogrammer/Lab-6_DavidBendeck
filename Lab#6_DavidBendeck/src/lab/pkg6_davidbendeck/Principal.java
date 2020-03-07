/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab.pkg6_davidbendeck;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

/**
 *
 * @author davidbendeck
 */
public class Principal extends javax.swing.JFrame {

    /**
     * Creates new form Principal
     */
    public Principal() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        D_Register = new javax.swing.JDialog();
        P_Register = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        DC_Birthday_Register = new com.toedter.calendar.JDateChooser();
        PF_Password_Register = new javax.swing.JPasswordField();
        TF_Nickname_Register = new javax.swing.JTextField();
        TF_Nombre_Register = new javax.swing.JTextField();
        B_Registrarse_Register = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        D_Chat = new javax.swing.JDialog();
        P_Chat = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TA_Mensajes_Chat = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        L_Usuarios_Chat = new javax.swing.JList<>();
        B_Send_Chat = new javax.swing.JButton();
        D_logIn = new javax.swing.JDialog();
        P_LogIn = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        TF_Nickname_LogIn = new javax.swing.JTextField();
        PF_Password_LogIn = new javax.swing.JPasswordField();
        B_LogIn_LogIn = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        B_LogIn = new javax.swing.JButton();
        B_Register = new javax.swing.JButton();
        B_Salir = new javax.swing.JButton();

        jLabel2.setText("Nombre");

        jLabel3.setText("Nickname");

        jLabel4.setText("Contraseña");

        jLabel5.setText("Fecha de nacimiento");

        B_Registrarse_Register.setText("Registrarse");
        B_Registrarse_Register.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                B_Registrarse_RegisterMouseClicked(evt);
            }
        });
        B_Registrarse_Register.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B_Registrarse_RegisterActionPerformed(evt);
            }
        });

        jLabel6.setText("Registrarse");

        javax.swing.GroupLayout P_RegisterLayout = new javax.swing.GroupLayout(P_Register);
        P_Register.setLayout(P_RegisterLayout);
        P_RegisterLayout.setHorizontalGroup(
            P_RegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, P_RegisterLayout.createSequentialGroup()
                .addContainerGap(275, Short.MAX_VALUE)
                .addComponent(B_Registrarse_Register)
                .addGap(287, 287, 287))
            .addGroup(P_RegisterLayout.createSequentialGroup()
                .addGroup(P_RegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(P_RegisterLayout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addGroup(P_RegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2))
                        .addGap(42, 42, 42)
                        .addGroup(P_RegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(DC_Birthday_Register, javax.swing.GroupLayout.DEFAULT_SIZE, 172, Short.MAX_VALUE)
                            .addComponent(PF_Password_Register)
                            .addComponent(TF_Nickname_Register)
                            .addComponent(TF_Nombre_Register)))
                    .addGroup(P_RegisterLayout.createSequentialGroup()
                        .addGap(293, 293, 293)
                        .addComponent(jLabel6)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        P_RegisterLayout.setVerticalGroup(
            P_RegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(P_RegisterLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel6)
                .addGap(74, 74, 74)
                .addGroup(P_RegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(TF_Nombre_Register, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(P_RegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(TF_Nickname_Register, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addGroup(P_RegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(P_RegisterLayout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(46, 46, 46)
                        .addGroup(P_RegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(DC_Birthday_Register, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(PF_Password_Register, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                .addComponent(B_Registrarse_Register)
                .addGap(75, 75, 75))
        );

        javax.swing.GroupLayout D_RegisterLayout = new javax.swing.GroupLayout(D_Register.getContentPane());
        D_Register.getContentPane().setLayout(D_RegisterLayout);
        D_RegisterLayout.setHorizontalGroup(
            D_RegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, D_RegisterLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(P_Register, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        D_RegisterLayout.setVerticalGroup(
            D_RegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(D_RegisterLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(P_Register, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        TA_Mensajes_Chat.setColumns(20);
        TA_Mensajes_Chat.setRows(5);
        jScrollPane1.setViewportView(TA_Mensajes_Chat);

        L_Usuarios_Chat.setModel(new DefaultListModel()
        );
        jScrollPane2.setViewportView(L_Usuarios_Chat);

        B_Send_Chat.setText("send");
        B_Send_Chat.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                B_Send_ChatMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout P_ChatLayout = new javax.swing.GroupLayout(P_Chat);
        P_Chat.setLayout(P_ChatLayout);
        P_ChatLayout.setHorizontalGroup(
            P_ChatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(P_ChatLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 483, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 142, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(115, 115, 115))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, P_ChatLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(B_Send_Chat, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(140, 140, 140))
        );
        P_ChatLayout.setVerticalGroup(
            P_ChatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(P_ChatLayout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(P_ChatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 293, Short.MAX_VALUE))
                .addGap(52, 52, 52)
                .addComponent(B_Send_Chat, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(65, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout D_ChatLayout = new javax.swing.GroupLayout(D_Chat.getContentPane());
        D_Chat.getContentPane().setLayout(D_ChatLayout);
        D_ChatLayout.setHorizontalGroup(
            D_ChatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, D_ChatLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(P_Chat, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        D_ChatLayout.setVerticalGroup(
            D_ChatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, D_ChatLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(P_Chat, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jLabel7.setText("Log In");

        jLabel8.setText("Nickname");

        jLabel9.setText("Password");

        B_LogIn_LogIn.setText("Log In");
        B_LogIn_LogIn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                B_LogIn_LogInMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout P_LogInLayout = new javax.swing.GroupLayout(P_LogIn);
        P_LogIn.setLayout(P_LogInLayout);
        P_LogInLayout.setHorizontalGroup(
            P_LogInLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(P_LogInLayout.createSequentialGroup()
                .addGroup(P_LogInLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(P_LogInLayout.createSequentialGroup()
                        .addGap(271, 271, 271)
                        .addComponent(jLabel7))
                    .addGroup(P_LogInLayout.createSequentialGroup()
                        .addGap(72, 72, 72)
                        .addGroup(P_LogInLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9))
                        .addGap(79, 79, 79)
                        .addGroup(P_LogInLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(TF_Nickname_LogIn, javax.swing.GroupLayout.DEFAULT_SIZE, 178, Short.MAX_VALUE)
                            .addComponent(PF_Password_LogIn)))
                    .addGroup(P_LogInLayout.createSequentialGroup()
                        .addGap(260, 260, 260)
                        .addComponent(B_LogIn_LogIn)))
                .addContainerGap(204, Short.MAX_VALUE))
        );
        P_LogInLayout.setVerticalGroup(
            P_LogInLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(P_LogInLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jLabel7)
                .addGap(105, 105, 105)
                .addGroup(P_LogInLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(TF_Nickname_LogIn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(52, 52, 52)
                .addGroup(P_LogInLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel9)
                    .addComponent(PF_Password_LogIn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(64, 64, 64)
                .addComponent(B_LogIn_LogIn)
                .addContainerGap(88, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout D_logInLayout = new javax.swing.GroupLayout(D_logIn.getContentPane());
        D_logIn.getContentPane().setLayout(D_logInLayout);
        D_logInLayout.setHorizontalGroup(
            D_logInLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, D_logInLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(P_LogIn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        D_logInLayout.setVerticalGroup(
            D_logInLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, D_logInLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(P_LogIn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Inicio");

        B_LogIn.setText("Iniciar sesión");

        B_Register.setText("Registrarse");
        B_Register.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                B_RegisterMouseClicked(evt);
            }
        });

        B_Salir.setText("Salir");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(B_LogIn)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(267, 267, 267)
                                .addComponent(B_Register, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(302, 302, 302)
                                .addComponent(jLabel1))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(298, 298, 298)
                        .addComponent(B_Salir)))
                .addContainerGap(283, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addComponent(jLabel1)
                .addGap(105, 105, 105)
                .addComponent(B_LogIn)
                .addGap(68, 68, 68)
                .addComponent(B_Register)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 66, Short.MAX_VALUE)
                .addComponent(B_Salir)
                .addGap(65, 65, 65))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void B_RegisterMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_B_RegisterMouseClicked
        // TODO add your handling code here:
        
        D_Register.pack();
        D_Register.setModal(true);
        D_Register.setVisible(true);
        
    }//GEN-LAST:event_B_RegisterMouseClicked

    private void B_Registrarse_RegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B_Registrarse_RegisterActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_B_Registrarse_RegisterActionPerformed

    private void B_Registrarse_RegisterMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_B_Registrarse_RegisterMouseClicked
        // TODO add your handling code here:
        
        String nombre = TF_Nombre_Register.getText();
        String nickname = TF_Nickname_Register.getText();
        String password = PF_Password_Register.getText();
        Date birthday = DC_Birthday_Register.getDate();
        
        Date current = new Date();
        
        if (current.getYear() - birthday.getYear() <= 13) {
            usuarios.add(new Usuario(nombre, nickname, password, birthday));
            guardarUsuarios(usuarios);
            D_logIn.pack();
            D_logIn.setModal(true);
            D_logIn.setVisible(true);
            
            D_Register.setVisible(false);
        } else {
            JOptionPane.showMessageDialog(this, "Debes tener mas de 13 años para poder registrarte");
            D_Register.setVisible(false);
        }
        
    }//GEN-LAST:event_B_Registrarse_RegisterMouseClicked

    private void B_LogIn_LogInMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_B_LogIn_LogInMouseClicked
        // TODO add your handling code here:
        
        boolean pass = false;
        
        for (Usuario usuario : usuarios) {
            if (TF_Nickname_LogIn.getText().equals(usuario.getNickname())) {
                if (PF_Password_LogIn.getText().equals(usuario.getPassword())) {
                    usuarioActual = usuario;
                    
                    //Agregar usuarios a la lista de usuarios
                    DefaultListModel modeloUsuarios = new DefaultListModel();
                    
                    for (Usuario usuario1 : usuarios) {
                        modeloUsuarios.addElement(usuario1);
                    }
                    
                    D_Chat.pack();
                    D_Chat.setModal(true);
                    D_Chat.setVisible(true);
                    
                    pass = true;
                    D_logIn.setVisible(false);
                    break;
                }
            }
        }
        
        if (!pass) {
            JOptionPane.showConfirmDialog(this, "Usuario o contraseña incorrecto(s)");
        }
    }//GEN-LAST:event_B_LogIn_LogInMouseClicked

    private void B_Send_ChatMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_B_Send_ChatMouseClicked
        // TODO add your handling code here:
        
        String easyCypher = "easyCypher: ";
        
        String mensaje = TA_Mensajes_Chat.getText();
        
        String temporal = mensaje.replace(" ", "");
        
        String nombre = JOptionPane.showInputDialog(this, "Elija un nombre para su archivo de texto");
        
        char last = temporal.charAt(temporal.length()-1);
        
        if ("1".equals(last)) {
            mensaje = TA_Mensajes_Chat.getText();
            mensaje = mensaje.replace("1", "");
            String newM = "";
            newM += usuarioActual.getNickname() + ":" + " " + mensaje + "\n";
            newM += easyCypher + cifrado1(mensaje);
            TA_Mensajes_Chat.setText(newM);
            guardarMensaje(newM, nombre);
        }
        
        else if ("2".equals(last)) {
            mensaje = TA_Mensajes_Chat.getText();
            mensaje = mensaje.replace("2", "");
            String newM = "";
            newM += usuarioActual.getNickname() + ":" + " " + mensaje + "\n";
            newM += easyCypher + cifrado2(mensaje);
            TA_Mensajes_Chat.setText(newM);
            guardarMensaje(newM, nombre);
        }
        
        else if ("3".equals(last)) {
            mensaje = TA_Mensajes_Chat.getText();
            mensaje = mensaje.replace("3", "");
            String newM = "";
            newM += usuarioActual.getNickname() + ":" + " " + mensaje + "\n";
            newM += easyCypher + cifrado3(mensaje);
            TA_Mensajes_Chat.setText(newM);
            guardarMensaje(newM, nombre);
        }
    }//GEN-LAST:event_B_Send_ChatMouseClicked

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
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        //Lectura de Usuarios
        leerUsuarios(usuarios);
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton B_LogIn;
    private javax.swing.JButton B_LogIn_LogIn;
    private javax.swing.JButton B_Register;
    private javax.swing.JButton B_Registrarse_Register;
    private javax.swing.JButton B_Salir;
    private javax.swing.JButton B_Send_Chat;
    private com.toedter.calendar.JDateChooser DC_Birthday_Register;
    private javax.swing.JDialog D_Chat;
    private javax.swing.JDialog D_Register;
    private javax.swing.JDialog D_logIn;
    private javax.swing.JList<String> L_Usuarios_Chat;
    private javax.swing.JPasswordField PF_Password_LogIn;
    private javax.swing.JPasswordField PF_Password_Register;
    private javax.swing.JPanel P_Chat;
    private javax.swing.JPanel P_LogIn;
    private javax.swing.JPanel P_Register;
    private javax.swing.JTextArea TA_Mensajes_Chat;
    private javax.swing.JTextField TF_Nickname_LogIn;
    private javax.swing.JTextField TF_Nickname_Register;
    private javax.swing.JTextField TF_Nombre_Register;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
    
    public static ArrayList<Usuario> usuarios = new ArrayList<>();
    
    public static Usuario usuarioActual;
    
    public static int guardarMensaje(String mensaje, String nombre) {
        int count = 0;
        String path = nombre.concat(".txt");
        try (FileWriter fw = new FileWriter(path)) {
            String sp = ";";
            mensaje = mensaje + sp;
            fw.write(mensaje);
            count++;
        } catch (FileNotFoundException ex) {
            System.out.println(ex);
        } catch (IOException ex) {
            System.out.println(ex);
        }
        return count;
    }
    
    public static int guardarUsuarios(ArrayList<Usuario> usuarios) {
        int count = 0;
        try (FileWriter fw = new FileWriter("Users.txt")) {
            for (Usuario usuario : usuarios) {
                String sp = ";";
                String linea = usuario.getNombre()+ sp + usuario.getNickname() + sp + usuario.getPassword() + sp + usuario.getBirthday() + "\n";
                fw.write(linea);
                count++;
            }
        } catch (FileNotFoundException ex) {
            System.out.println(ex);
        } catch (IOException ex) {
            System.out.println(ex);
        }
        return count;
    }
    
        public static int leerUsuarios(ArrayList<Usuario> usuarios) {
        int count = 0;
        try(BufferedReader br = new BufferedReader(new FileReader("Clientes.txt"))) {
            String line;
            String[] tokens;
            SimpleDateFormat time = new SimpleDateFormat("EEE MMM dd HH:mm:ss zzz yyyy");
            while ((line = br.readLine()) != null) {                
                tokens = line.split(";");
                Date birthday = time.parse(tokens[3]);
                usuarios.add(new Usuario(tokens[0], tokens[1], tokens[2], birthday));
                count++;
            }
        } catch (FileNotFoundException ex) {
            System.out.println(ex);
        } catch (IOException ex) {
            System.out.println(ex);
        } catch (ParseException ex) {
            System.out.println(ex);
        }
        return count;
    }
        
    public static String cifrado1 (String mensaje) {
        mensaje = mensaje.toLowerCase();
        String[] tokens = mensaje.split(" ");
        String token,first,rest,word,message = "";
        
        String vocales = "aeiou";
        
        for (int i = 0; i < tokens.length; i++) {
            token = tokens[i];
            int index = 0;
            char[] characters = token.toCharArray();
            
            for (int j = 0; j < characters.length; j++) {
                char character = characters[j];
                if (vocales.indexOf(character) != -1) {
                    index = vocales.indexOf(character);
                }
            }
            
            if (token.length() <= 3) {
                word = token.concat("way");
                message += word + " ";
            }
            
            else {
                first = token.substring(0, index + 1);
                rest = token.substring(index);
                word = rest + first + "ay";
                message += word + " ";
            }
        }
        
        return message;
    }
    
    public static String cifrado2 (String mensaje) {
        String[] tokens = mensaje.split(" ");
        String token,message = "";
        
        for (int i = 0; i < tokens.length; i++) {
            char[] characters = tokens[i].toCharArray();
            for (int j = 0; j < characters.length; j++) {
                String piece = "";
                int ascii = (int) characters[j];
                piece += ascii;
                message += piece + " ";
            }
        }
        return message;
    }
    
    public static String cifrado3 (String mensaje) {
        mensaje = mensaje.toLowerCase();
        String[] tokens = mensaje.split(" ");
        String token,message = "";
        
        int index = 0;
        
        String half1 = "abcdefghijklm";
        String half2 = "zyxwvutsrqpon";
        //nopqrstuvwxyz
        
        for (int i = 0; i < tokens.length; i++) {
            String word = "";
            token = tokens[i];
            char[] characters = token.toCharArray();
            for (int j = 0; j < characters.length; j++) {
                char character = characters[j];
                if (half1.indexOf(character) != -1) {
                    index = half1.indexOf(character);
                    characters[j] = half2.charAt(index);
                    word += characters[j];
                } else {
                    index = half2.indexOf(character);
                    characters[j] = half1.charAt(index);
                    word += characters[j];
                }
            }
            message += word;
        }
        
        return mensaje;
    }
}
