package frontend.authentication;

import java.sql.*;
import javax.swing.*;
import main.App;
import frontend.homepage.HomePagePanel;
public class LoginPanel extends javax.swing.JPanel {
    App app;
    public LoginPanel(App app) {
        this.app = app;
        initComponents();   
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        HeaderPanel = new javax.swing.JPanel();
        FormPanel = new javax.swing.JPanel();
        UsernamePanel = new javax.swing.JPanel();
        username_tf = new javax.swing.JTextField();
        UsernameLabel = new javax.swing.JLabel();
        PasswordPanel = new javax.swing.JPanel();
        PasswordLabel = new javax.swing.JLabel();
        password_tf = new javax.swing.JPasswordField();
        ButtonsPanel = new javax.swing.JPanel();
        login_button = new javax.swing.JButton();
        new_user_button = new javax.swing.JButton();
        LoginLabel = new javax.swing.JLabel();

        HeaderPanel.setBackground(new java.awt.Color(255, 255, 255));
        HeaderPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(247, 247, 247), 3));

        javax.swing.GroupLayout HeaderPanelLayout = new javax.swing.GroupLayout(HeaderPanel);
        HeaderPanel.setLayout(HeaderPanelLayout);
        HeaderPanelLayout.setHorizontalGroup(
            HeaderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 394, Short.MAX_VALUE)
        );
        HeaderPanelLayout.setVerticalGroup(
            HeaderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 125, Short.MAX_VALUE)
        );

        username_tf.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        username_tf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                username_tfActionPerformed(evt);
            }
        });

        UsernameLabel.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        UsernameLabel.setForeground(new java.awt.Color(94, 94, 94));
        UsernameLabel.setText("Username");

        javax.swing.GroupLayout UsernamePanelLayout = new javax.swing.GroupLayout(UsernamePanel);
        UsernamePanel.setLayout(UsernamePanelLayout);
        UsernamePanelLayout.setHorizontalGroup(
            UsernamePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, UsernamePanelLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(UsernameLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 122, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(username_tf, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35))
        );
        UsernamePanelLayout.setVerticalGroup(
            UsernamePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, UsernamePanelLayout.createSequentialGroup()
                .addContainerGap(15, Short.MAX_VALUE)
                .addGroup(UsernamePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(username_tf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(UsernameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16))
        );

        PasswordLabel.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        PasswordLabel.setForeground(new java.awt.Color(94, 94, 94));
        PasswordLabel.setText("Password");

        password_tf.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        javax.swing.GroupLayout PasswordPanelLayout = new javax.swing.GroupLayout(PasswordPanel);
        PasswordPanel.setLayout(PasswordPanelLayout);
        PasswordPanelLayout.setHorizontalGroup(
            PasswordPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PasswordPanelLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(PasswordLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 122, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(password_tf, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36))
        );
        PasswordPanelLayout.setVerticalGroup(
            PasswordPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PasswordPanelLayout.createSequentialGroup()
                .addContainerGap(15, Short.MAX_VALUE)
                .addGroup(PasswordPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(PasswordLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(password_tf, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16))
        );

        login_button.setBackground(new java.awt.Color(242, 242, 242));
        login_button.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        login_button.setText("Login");
        login_button.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        login_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                login_buttonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout ButtonsPanelLayout = new javax.swing.GroupLayout(ButtonsPanel);
        ButtonsPanel.setLayout(ButtonsPanelLayout);
        ButtonsPanelLayout.setHorizontalGroup(
            ButtonsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ButtonsPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(login_button, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(86, 86, 86))
        );
        ButtonsPanelLayout.setVerticalGroup(
            ButtonsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ButtonsPanelLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(login_button, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(26, Short.MAX_VALUE))
        );

        new_user_button.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        new_user_button.setForeground(new java.awt.Color(39, 39, 39));
        new_user_button.setText("New User?");
        new_user_button.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        new_user_button.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        new_user_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                new_user_buttonActionPerformed(evt);
            }
        });

        LoginLabel.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        LoginLabel.setText("LOGIN");
        LoginLabel.setAlignmentX(0.5F);

        javax.swing.GroupLayout FormPanelLayout = new javax.swing.GroupLayout(FormPanel);
        FormPanel.setLayout(FormPanelLayout);
        FormPanelLayout.setHorizontalGroup(
            FormPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(UsernamePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(PasswordPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(ButtonsPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(FormPanelLayout.createSequentialGroup()
                .addGroup(FormPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(FormPanelLayout.createSequentialGroup()
                        .addGap(143, 143, 143)
                        .addComponent(new_user_button, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(FormPanelLayout.createSequentialGroup()
                        .addGap(144, 144, 144)
                        .addComponent(LoginLabel)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        FormPanelLayout.setVerticalGroup(
            FormPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FormPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(LoginLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(UsernamePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PasswordPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ButtonsPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(new_user_button)
                .addContainerGap(46, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(HeaderPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(FormPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(HeaderPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(FormPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void username_tfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_username_tfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_username_tfActionPerformed

    private void login_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_login_buttonActionPerformed
        // TODO add your handling code here:
        String username = username_tf.getText();
        String password = password_tf.getText();
        String query = "SELECT user_id, username, password FROM users WHERE username = ?";
        try{
            app.ps = app.con.prepareStatement(query);
            app.ps.setString(1, username);
            app.rs = app.ps.executeQuery();
            
            // Valid username
            if(app.rs.next()){
                // Valid Password
                if(app.rs.getString(3).equals(password)){
                    app.current_user_id = app.rs.getString(1);
                    app.switchPanel(new HomePagePanel(app));
                }
                else{
                    JOptionPane.showMessageDialog(this, "Invalid Password");
                }
            }
            else{
                JOptionPane.showMessageDialog(this, "Username not available");
            }
        }
        catch(SQLException ex){
            JOptionPane.showMessageDialog(this, "Could not execute statement"+ex);
        }
        
        
    }//GEN-LAST:event_login_buttonActionPerformed

    private void new_user_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_new_user_buttonActionPerformed
        // TODO add your handling code here:
        app.switchPanel(new SignUpPanel(app));
    }//GEN-LAST:event_new_user_buttonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel ButtonsPanel;
    private javax.swing.JPanel FormPanel;
    private javax.swing.JPanel HeaderPanel;
    private javax.swing.JLabel LoginLabel;
    private javax.swing.JLabel PasswordLabel;
    private javax.swing.JPanel PasswordPanel;
    private javax.swing.JLabel UsernameLabel;
    private javax.swing.JPanel UsernamePanel;
    private javax.swing.JButton login_button;
    private javax.swing.JButton new_user_button;
    private javax.swing.JPasswordField password_tf;
    private javax.swing.JTextField username_tf;
    // End of variables declaration//GEN-END:variables
}
