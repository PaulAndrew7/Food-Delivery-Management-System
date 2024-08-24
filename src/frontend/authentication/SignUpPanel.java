/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package frontend.authentication;
import main.App;
import java.sql.*;
import javax.swing.JOptionPane;
import tools.Tools;

public class SignUpPanel extends javax.swing.JPanel {

    App app;
    public SignUpPanel(App app) {
        initComponents();
        this.app = app;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        HeaderPanel = new javax.swing.JPanel();
        FormPanel = new javax.swing.JPanel();
        UsernameLabel = new javax.swing.JLabel();
        PasswordLabel = new javax.swing.JLabel();
        ConfirmPasswordLabel = new javax.swing.JLabel();
        PhoneLabel = new javax.swing.JLabel();
        EmailLabel = new javax.swing.JLabel();
        ButtonsPanel = new javax.swing.JPanel();
        signup_button = new javax.swing.JButton();
        back_button = new javax.swing.JButton();
        username_tf = new javax.swing.JTextField();
        phone_tf = new javax.swing.JTextField();
        email_tf = new javax.swing.JTextField();
        DoorLabel = new javax.swing.JLabel();
        StreetLabel = new javax.swing.JLabel();
        PincodeLabel = new javax.swing.JLabel();
        door_tf = new javax.swing.JTextField();
        street_tf = new javax.swing.JTextField();
        pincode_tf = new javax.swing.JTextField();
        password_tf = new javax.swing.JPasswordField();
        confirm_password_tf = new javax.swing.JPasswordField();
        SignUpLabel = new javax.swing.JLabel();

        HeaderPanel.setBackground(new java.awt.Color(255, 255, 255));
        HeaderPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(247, 247, 247), 3));

        javax.swing.GroupLayout HeaderPanelLayout = new javax.swing.GroupLayout(HeaderPanel);
        HeaderPanel.setLayout(HeaderPanelLayout);
        HeaderPanelLayout.setHorizontalGroup(
            HeaderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 419, Short.MAX_VALUE)
        );
        HeaderPanelLayout.setVerticalGroup(
            HeaderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 128, Short.MAX_VALUE)
        );

        UsernameLabel.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        UsernameLabel.setForeground(new java.awt.Color(94, 94, 94));
        UsernameLabel.setText("Username");

        PasswordLabel.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        PasswordLabel.setForeground(new java.awt.Color(94, 94, 94));
        PasswordLabel.setText("Password");

        ConfirmPasswordLabel.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        ConfirmPasswordLabel.setForeground(new java.awt.Color(94, 94, 94));
        ConfirmPasswordLabel.setText("Confirm Password");

        PhoneLabel.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        PhoneLabel.setForeground(new java.awt.Color(94, 94, 94));
        PhoneLabel.setText("Phone");

        EmailLabel.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        EmailLabel.setForeground(new java.awt.Color(94, 94, 94));
        EmailLabel.setText("Email Id");

        signup_button.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        signup_button.setText("Sign Up");
        signup_button.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        signup_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signup_buttonActionPerformed(evt);
            }
        });

        back_button.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        back_button.setText("Back");
        back_button.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        back_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                back_buttonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout ButtonsPanelLayout = new javax.swing.GroupLayout(ButtonsPanel);
        ButtonsPanel.setLayout(ButtonsPanelLayout);
        ButtonsPanelLayout.setHorizontalGroup(
            ButtonsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ButtonsPanelLayout.createSequentialGroup()
                .addContainerGap(37, Short.MAX_VALUE)
                .addComponent(back_button, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addComponent(signup_button, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45))
        );
        ButtonsPanelLayout.setVerticalGroup(
            ButtonsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ButtonsPanelLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(ButtonsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(signup_button, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(back_button, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(31, Short.MAX_VALUE))
        );

        username_tf.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        username_tf.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(50, 50, 50)));

        phone_tf.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        phone_tf.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(50, 50, 50)));

        email_tf.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        email_tf.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(50, 50, 50)));

        DoorLabel.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        DoorLabel.setForeground(new java.awt.Color(94, 94, 94));
        DoorLabel.setText("Door No");

        StreetLabel.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        StreetLabel.setForeground(new java.awt.Color(94, 94, 94));
        StreetLabel.setText("Street");

        PincodeLabel.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        PincodeLabel.setForeground(new java.awt.Color(94, 94, 94));
        PincodeLabel.setText("Pincode");

        door_tf.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        door_tf.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(50, 50, 50)));

        street_tf.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        street_tf.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(50, 50, 50)));

        pincode_tf.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        pincode_tf.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(50, 50, 50)));

        SignUpLabel.setBackground(new java.awt.Color(0, 0, 0));
        SignUpLabel.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        SignUpLabel.setText("SIGN UP");
        SignUpLabel.setAlignmentX(0.5F);

        javax.swing.GroupLayout FormPanelLayout = new javax.swing.GroupLayout(FormPanel);
        FormPanel.setLayout(FormPanelLayout);
        FormPanelLayout.setHorizontalGroup(
            FormPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FormPanelLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(FormPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(UsernameLabel)
                    .addComponent(ConfirmPasswordLabel)
                    .addComponent(PhoneLabel)
                    .addComponent(EmailLabel)
                    .addComponent(PasswordLabel)
                    .addComponent(DoorLabel)
                    .addComponent(StreetLabel)
                    .addComponent(PincodeLabel))
                .addGap(18, 18, 18)
                .addGroup(FormPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(username_tf, javax.swing.GroupLayout.DEFAULT_SIZE, 177, Short.MAX_VALUE)
                    .addComponent(phone_tf, javax.swing.GroupLayout.DEFAULT_SIZE, 177, Short.MAX_VALUE)
                    .addComponent(email_tf, javax.swing.GroupLayout.DEFAULT_SIZE, 177, Short.MAX_VALUE)
                    .addComponent(door_tf, javax.swing.GroupLayout.DEFAULT_SIZE, 177, Short.MAX_VALUE)
                    .addComponent(street_tf, javax.swing.GroupLayout.DEFAULT_SIZE, 177, Short.MAX_VALUE)
                    .addComponent(pincode_tf, javax.swing.GroupLayout.DEFAULT_SIZE, 177, Short.MAX_VALUE)
                    .addComponent(password_tf)
                    .addComponent(confirm_password_tf))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(ButtonsPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, FormPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(SignUpLabel)
                .addGap(128, 128, 128))
        );
        FormPanelLayout.setVerticalGroup(
            FormPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FormPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(SignUpLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(FormPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(UsernameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(username_tf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(FormPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(PasswordLabel)
                    .addComponent(password_tf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(FormPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ConfirmPasswordLabel)
                    .addComponent(confirm_password_tf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(FormPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(PhoneLabel)
                    .addComponent(phone_tf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(FormPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(FormPanelLayout.createSequentialGroup()
                        .addComponent(EmailLabel)
                        .addGap(18, 18, 18)
                        .addGroup(FormPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(DoorLabel)
                            .addComponent(door_tf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(email_tf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(FormPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(street_tf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(StreetLabel))
                .addGap(20, 20, 20)
                .addGroup(FormPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pincode_tf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PincodeLabel))
                .addGap(18, 18, 18)
                .addComponent(ButtonsPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(HeaderPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(FormPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(HeaderPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(FormPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void signup_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signup_buttonActionPerformed
        // TODO add your handling code here:
        
        try{
            // Check if username is empty
            String username = username_tf.getText();
            if(username.equals("")){
                JOptionPane.showMessageDialog(this, "Username cannot be empty");
                return;
            }
            
            // Check username availability
            String query = "SELECT count(*) FROM users WHERE username = ?";
            app.ps = app.con.prepareStatement(query);
            app.ps.setString(1, username_tf.getText());
            app.rs = app.ps.executeQuery();
            app.rs.next();
            if(app.rs.getInt(1) > 0){
                JOptionPane.showMessageDialog(this, "Username already taken");
                return;
            }
            
            // Check if password is empty
            String password = password_tf.getText();
            if(password.equals("")){
                JOptionPane.showMessageDialog(this, "Password cannot be empty");
                return;
            }
            // Check if passwords match
            else if(!password.equals(confirm_password_tf.getText())){
                JOptionPane.showMessageDialog(this, "Passwords do no match");
                return;
            }
            
            // Check if phone no is empty
            String phone_no = phone_tf.getText();
            if(!(phone_no.length() == 10)){
                JOptionPane.showMessageDialog(this, "Invalid phone no");
                return;
            }
            
            // Check if door no is empty
            String door_no = door_tf.getText();
            if(door_no.equals("")){
                JOptionPane.showMessageDialog(this, "Door no cannot be empty");
                return;
            }
            
            // Check if street is empty
            String street = street_tf.getText();
            if(street.equals("")){
                JOptionPane.showMessageDialog(this, "Street cannot be empty");
                return;
            }
            
            // Check if pincode is empty
            String pincode = pincode_tf.getText();
            if(!(pincode.length() == 6 && Tools.isNumeric(pincode))){
                JOptionPane.showMessageDialog(this, "Invalid Pincode");
                return;
            }
            
            // Calculate the new user id
            int new_user_id_int = 0;
            query = "SELECT user_id FROM users ORDER BY user_id DESC";
            app.ps = app.con.prepareStatement(query);
            app.rs = app.ps.executeQuery();
            if(app.rs.next()){
                String user_id_int = app.rs.getString(1).substring(1, 4);
                new_user_id_int = Integer.parseInt(user_id_int) + 1;
            }
            
            String new_user_id = "U";
            if(new_user_id_int < 10){
                    new_user_id += "00" + new_user_id_int;
            }
            else if(new_user_id_int < 100){
                new_user_id += "0" + new_user_id_int;
            }
            else{
                new_user_id += new_user_id_int;
            }
            
            try{
                // Insert into users
                query = "INSERT INTO users VALUES(?, ?, ?, ?, ?)";
                app.ps = app.con.prepareStatement(query);
                app.ps.setString(1, new_user_id);
                app.ps.setString(2, username);
                app.ps.setString(3, password);
                app.ps.setString(4, phone_no);
                app.ps.setString(5, email_tf.getText());

                int rows1 = app.ps.executeUpdate();
                
                
                query = "INSERT INTO user_address VALUES(?, ?, ?, ?)";
                app.ps = app.con.prepareStatement(query);
                app.ps.setString(1, new_user_id);
                app.ps.setString(2, door_no);
                app.ps.setString(3, street);
                app.ps.setString(4, pincode);
                
                int rows2 = app.ps.executeUpdate();
                if(rows1 > 0 && rows2 > 0){
                    JOptionPane.showMessageDialog(this, "New User Created");
                    app.switchPanel(new LoginPanel(app));
                }
                else{
                    JOptionPane.showMessageDialog(this, "Failed to create user");
                }
                
            }
            catch(SQLException ex){
                JOptionPane.showMessageDialog(this, "Failed to create user" + ex.getMessage());
            }
        }
        catch(SQLException ex){
            JOptionPane.showMessageDialog(this, "Cannot Execute query"+ex.getMessage());
        }
    }//GEN-LAST:event_signup_buttonActionPerformed

    private void back_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_back_buttonActionPerformed
        // TODO add your handling code here:
        app.switchPanel(new LoginPanel(app));
    }//GEN-LAST:event_back_buttonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel ButtonsPanel;
    private javax.swing.JLabel ConfirmPasswordLabel;
    private javax.swing.JLabel DoorLabel;
    private javax.swing.JLabel EmailLabel;
    private javax.swing.JPanel FormPanel;
    private javax.swing.JPanel HeaderPanel;
    private javax.swing.JLabel PasswordLabel;
    private javax.swing.JLabel PhoneLabel;
    private javax.swing.JLabel PincodeLabel;
    private javax.swing.JLabel SignUpLabel;
    private javax.swing.JLabel StreetLabel;
    private javax.swing.JLabel UsernameLabel;
    private javax.swing.JButton back_button;
    private javax.swing.JPasswordField confirm_password_tf;
    private javax.swing.JTextField door_tf;
    private javax.swing.JTextField email_tf;
    private javax.swing.JPasswordField password_tf;
    private javax.swing.JTextField phone_tf;
    private javax.swing.JTextField pincode_tf;
    private javax.swing.JButton signup_button;
    private javax.swing.JTextField street_tf;
    private javax.swing.JTextField username_tf;
    // End of variables declaration//GEN-END:variables
}
