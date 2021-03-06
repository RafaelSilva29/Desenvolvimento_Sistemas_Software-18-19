
package Frontend;

import Backend.Business.ConfiguraFacil;
import Backend.Business.Employee;
import Backend.Business.InterfaceFrontend;
import Backend.Business.Order;
import Backend.Business.Seller;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.table.DefaultTableModel;

public class MenuAdmin extends javax.swing.JFrame {

    private InterfaceFrontend cf;
    private String username;
    
    /** Creates new form menuAdmin */
    public MenuAdmin() {
        initComponents();
    }
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        logoutbutton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        UserTable = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        orderTable = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        alert = new javax.swing.JLabel();
        addUser = new javax.swing.JButton();
        userField = new javax.swing.JLabel();
        ChangePass = new javax.swing.JButton();
        updateUserButton = new javax.swing.JButton();
        removeUserButton = new javax.swing.JButton();
        MenuComponentButton = new javax.swing.JButton();
        MenuPackageButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel1.setText("ConfiguraFacil");

        jLabel2.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        jLabel2.setText("AdminID:");

        logoutbutton.setText("Logout");
        logoutbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutbuttonActionPerformed(evt);
            }
        });

        UserTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Username", "Name", "Email", "Function"
            }
        ));
        jScrollPane1.setViewportView(UserTable);

        orderTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Date", "Price", "Status", "CarID"
            }
        ));
        jScrollPane2.setViewportView(orderTable);

        jLabel3.setText("Users");

        jLabel4.setText("Orders");

        addUser.setText("Add User");
        addUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addUserActionPerformed(evt);
            }
        });

        ChangePass.setText("Change Password");
        ChangePass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ChangePassActionPerformed(evt);
            }
        });

        updateUserButton.setText("Update User");
        updateUserButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateUserButtonActionPerformed(evt);
            }
        });

        removeUserButton.setText("Remove User");
        removeUserButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeUserButtonActionPerformed(evt);
            }
        });

        MenuComponentButton.setText("Menu Component");
        MenuComponentButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuComponentButtonActionPerformed(evt);
            }
        });

        MenuPackageButton.setText("Menu Package");
        MenuPackageButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuPackageButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(alert, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(68, 68, 68)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(userField, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(ChangePass, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(addUser, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(logoutbutton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(updateUserButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(removeUserButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(8, 8, 8))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(MenuPackageButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(MenuComponentButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 325, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(314, 314, 314)
                        .addComponent(jLabel3)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 307, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(150, 150, 150))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(alert, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(userField, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)))
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(addUser)
                        .addGap(2, 2, 2)
                        .addComponent(updateUserButton)
                        .addGap(3, 3, 3)
                        .addComponent(removeUserButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(MenuComponentButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(MenuPackageButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(ChangePass)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(logoutbutton))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 382, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(17, 17, 17))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void logoutbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutbuttonActionPerformed
        Login login = new Login();
        login.showLogin();
        this.hide();        
    }//GEN-LAST:event_logoutbuttonActionPerformed

    private void addUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addUserActionPerformed
        // TODO add your handling code here:
        //this.hide();
        AddUser adduser = new AddUser();
        adduser.showAddUser(this.username);
        this.hide();
    }//GEN-LAST:event_addUserActionPerformed

    private void ChangePassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ChangePassActionPerformed
         UpdatePasswordMenu upm = new UpdatePasswordMenu();
        try {
            upm.showMenuPass(this.username, "Admin");
            this.hide();
        } catch (Exception ex) {
            Logger.getLogger(MenuEmployee.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_ChangePassActionPerformed

    private void updateUserButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateUserButtonActionPerformed
       this.cf = new ConfiguraFacil();
       Error error = new Error();
       try{
           int row = UserTable.getSelectedRow();
           String username = UserTable.getModel().getValueAt(row, 0).toString();
           String function = UserTable.getModel().getValueAt(row, 3).toString();
       
            if(function.equals("Seller")){
                Seller seller = new Seller();
                seller = this.cf.getSeller(username);
                UpdateUser updateuser = new UpdateUser();
                updateuser.showUpdateUserSeller(seller, this.username);
                this.hide();

            } else if(function.equals("Employee")){
                Employee employee = new Employee();
                employee = this.cf.getEmployee(username);
                UpdateUser updateuser = new UpdateUser();
                updateuser.showUpdateUserEmployee(employee, this.username);
                this.hide();     
            }
       } catch(Exception e){
           error.showError("Please Select a User to Update!!");
       }
       
    }//GEN-LAST:event_updateUserButtonActionPerformed

    private void removeUserButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeUserButtonActionPerformed
        // TODO add your handling code here:
        this.cf = new ConfiguraFacil();
        Boolean done = false;
        Error error = new Error();
       
       try{
           int row = UserTable.getSelectedRow();
           String username = UserTable.getModel().getValueAt(row, 0).toString();
           String function = UserTable.getModel().getValueAt(row, 3).toString();
       
            if(function.equals("Seller")){
                done = this.cf.removeSeller(username);
                if (done == false){
                    error.showError("Impossible to remove Seller");
                }
                this.hide();
                showMenuAdmin(this.username);

            } else if(function.equals("Employee")){
                done = this.cf.removeEmployee(username);
                if (done == false){
                    error.showError("Impossible to remove Seller");
                }
                this.hide();
                showMenuAdmin(this.username);
            }
       } catch(Exception e){
           error.showError("Please select a User to Remove!!");
       }
    }//GEN-LAST:event_removeUserButtonActionPerformed

    private void MenuComponentButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuComponentButtonActionPerformed
        // TODO add your handling code here:
        MenuComponent menucomponent = new MenuComponent();
        try {
            menucomponent.showMenuComponent(username); 
            this.hide();   
        } catch (Exception ex) {
            Logger.getLogger(MenuAdmin.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_MenuComponentButtonActionPerformed

    private void MenuPackageButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuPackageButtonActionPerformed
        // TODO add your handling code here:
        MenuPackage menupackage = new MenuPackage();
        try {
            menupackage.showMenuPackage(username);
            this.hide();
        } catch (Exception ex) {
            Logger.getLogger(MenuAdmin.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_MenuPackageButtonActionPerformed

    private void fillTableOrders() throws Exception{
        this.cf = new ConfiguraFacil();   
        List<Order> orders = new ArrayList<Order>();

        DefaultTableModel ordertable = new DefaultTableModel(){     
        @Override
            public boolean isCellEditable(int row, int column) {
                return column==4;
            }
        };  
        
        orderTable.setModel(ordertable);
        ordertable.addColumn("Date");
        ordertable.addColumn("Price");
        ordertable.addColumn("Status");
        ordertable.addColumn("Description");
        ordertable.addColumn("CarID");
        
        orders.addAll(this.cf.getAllOrders());
        
        for(Order o : orders){
            ordertable.addRow(new Object[]{o.getDate(),o.getPrice(),o.getStatus(),o.getDescription(),o.getCarID()});
        }
    }
    
    
    
    private void fillTableUsers() throws Exception{
        this.cf = new ConfiguraFacil();   
        List<Seller> sellers = new ArrayList<Seller>();
        List<Employee> employees = new ArrayList<Employee>();

        DefaultTableModel usertable = new DefaultTableModel(){
            @Override
            public boolean isCellEditable(int row, int column) {
                return column==4;
            }
        };  
        
        UserTable.setModel(usertable);
        usertable.addColumn("Username");
        usertable.addColumn("Name");
        usertable.addColumn("Email");
        usertable.addColumn("Function");
        
        sellers.addAll(this.cf.getAllSellers());
        employees.addAll(this.cf.getAllEmployees());
        
        for(Seller s : sellers){
            usertable.addRow(new Object[]{s.getID(), s.getName(), s.getEmail(), "Seller"});
        }
        
        for(Employee e : employees){
            usertable.addRow(new Object[]{e.getUserID(), e.getName(), e.getEmail(), "Employee"});
        } 
    }
    
    public void showMenuAdmin(String username) throws Exception{ 
        fillTableOrders();
        fillTableUsers();
        this.userField.setText(username);
        this.username = username;
        this.setLocationRelativeTo(null); //center form in the screen
        this.setVisible(true);
        this.pack();
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ChangePass;
    private javax.swing.JButton MenuComponentButton;
    private javax.swing.JButton MenuPackageButton;
    private javax.swing.JTable UserTable;
    private javax.swing.JButton addUser;
    private javax.swing.JLabel alert;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton logoutbutton;
    private javax.swing.JTable orderTable;
    private javax.swing.JButton removeUserButton;
    private javax.swing.JButton updateUserButton;
    private javax.swing.JLabel userField;
    // End of variables declaration//GEN-END:variables

}
