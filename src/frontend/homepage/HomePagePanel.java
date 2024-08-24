package frontend.homepage;

import main.App;
import frontend.authentication.LoginPanel;
import frontend.order_ui.*;
import frontend.myorders.*;
public class HomePagePanel extends javax.swing.JPanel {

    App app;
    public HomePagePanel(App app) {
        initComponents();
        this.app = app;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ButtonPanel = new javax.swing.JPanel();
        MyOrdersButton = new javax.swing.JButton();
        PlaceOrderButton = new javax.swing.JButton();
        ProfileButton = new javax.swing.JButton();
        LogoutButton = new javax.swing.JButton();
        HeaderPanel = new javax.swing.JPanel();
        HomePageLabel = new javax.swing.JLabel();

        MyOrdersButton.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        MyOrdersButton.setText("My Orders");
        MyOrdersButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MyOrdersButtonActionPerformed(evt);
            }
        });

        PlaceOrderButton.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        PlaceOrderButton.setForeground(new java.awt.Color(0, 51, 51));
        PlaceOrderButton.setText("Place Order");
        PlaceOrderButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PlaceOrderButtonActionPerformed(evt);
            }
        });

        ProfileButton.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        ProfileButton.setText("Profile");
        ProfileButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ProfileButtonActionPerformed(evt);
            }
        });

        LogoutButton.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        LogoutButton.setText("Logout");
        LogoutButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LogoutButtonActionPerformed(evt);
            }
        });

        HeaderPanel.setBackground(new java.awt.Color(255, 255, 255));

        HomePageLabel.setBackground(new java.awt.Color(238, 103, 35));
        HomePageLabel.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        HomePageLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        HomePageLabel.setText("Home Page");
        HomePageLabel.setMaximumSize(new java.awt.Dimension(110, 48));
        HomePageLabel.setMinimumSize(new java.awt.Dimension(110, 48));
        HomePageLabel.setPreferredSize(new java.awt.Dimension(110, 48));

        javax.swing.GroupLayout HeaderPanelLayout = new javax.swing.GroupLayout(HeaderPanel);
        HeaderPanel.setLayout(HeaderPanelLayout);
        HeaderPanelLayout.setHorizontalGroup(
            HeaderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HeaderPanelLayout.createSequentialGroup()
                .addGap(109, 109, 109)
                .addComponent(HomePageLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(104, Short.MAX_VALUE))
        );
        HeaderPanelLayout.setVerticalGroup(
            HeaderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HeaderPanelLayout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(HomePageLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(45, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout ButtonPanelLayout = new javax.swing.GroupLayout(ButtonPanel);
        ButtonPanel.setLayout(ButtonPanelLayout);
        ButtonPanelLayout.setHorizontalGroup(
            ButtonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ButtonPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(ButtonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ButtonPanelLayout.createSequentialGroup()
                        .addComponent(ProfileButton, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(LogoutButton, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(ButtonPanelLayout.createSequentialGroup()
                        .addComponent(MyOrdersButton, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(PlaceOrderButton, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(HeaderPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        ButtonPanelLayout.setVerticalGroup(
            ButtonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ButtonPanelLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(HeaderPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(ButtonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(MyOrdersButton, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PlaceOrderButton, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(ButtonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LogoutButton, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ProfileButton, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(53, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ButtonPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(152, Short.MAX_VALUE)
                .addComponent(ButtonPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void PlaceOrderButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PlaceOrderButtonActionPerformed
        // TODO add your handling code here:
        app.switchPanel(new SearchRestaurantPanel(app));
    }//GEN-LAST:event_PlaceOrderButtonActionPerformed

    private void MyOrdersButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MyOrdersButtonActionPerformed
        // TODO add your handling code here:
        app.switchPanel(new MyOrdersPanel(app));
    }//GEN-LAST:event_MyOrdersButtonActionPerformed

    private void LogoutButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LogoutButtonActionPerformed
        // TODO add your handling code here:
        app.current_user_id = null;
        app.switchPanel(new LoginPanel(app));
    }//GEN-LAST:event_LogoutButtonActionPerformed

    private void ProfileButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ProfileButtonActionPerformed
        // TODO add your handling code here:
        app.switchPanel(new ProfilePagePanel(app));
    }//GEN-LAST:event_ProfileButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel ButtonPanel;
    private javax.swing.JPanel HeaderPanel;
    private javax.swing.JLabel HomePageLabel;
    private javax.swing.JButton LogoutButton;
    private javax.swing.JButton MyOrdersButton;
    private javax.swing.JButton PlaceOrderButton;
    private javax.swing.JButton ProfileButton;
    // End of variables declaration//GEN-END:variables
}
