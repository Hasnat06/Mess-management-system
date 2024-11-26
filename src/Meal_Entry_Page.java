
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author Fahim MuntasirAkib
 */
public class Meal_Entry_Page extends javax.swing.JFrame {

    /**
     * Creates new form Meal_Entry_Page
     */
    public Meal_Entry_Page() {
        initComponents();
        showMealEntryTable();
    }

    
    
    private void showMealEntryTable(){
        String columnNames[]={ "Name","1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16","17","18","19","20","21","22","23","24","25","26","27","28","29","30","31","Total"};
        
        DefaultTableModel memberModel= new DefaultTableModel(columnNames,0);
        String query= "select *from meal_entry";
        try{
           
        ResultSet rs = DBUTILS.queryExecute(query);
        while(rs.next()){
            String Name=rs.getString("name");
            String a=rs.getString("a");
            String b=rs.getString("b");
            String c=rs.getString("c");
            String d=rs.getString("d");
            String e=rs.getString("e");
            String f=rs.getString("f");
            String g=rs.getString("g");
            String h=rs.getString("h");
            String i=rs.getString("i");
            String j=rs.getString("j");
            String k=rs.getString("k");
            String l=rs.getString("l");
            String m=rs.getString("m");
            String n=rs.getString("n");
            String o=rs.getString("o");
            String p=rs.getString("p");
            String q=rs.getString("q");
            String r=rs.getString("r");
            String s=rs.getString("s");
            String t=rs.getString("t");
            String u=rs.getString("u");
            String v=rs.getString("v");
            String w=rs.getString("w");
            String x=rs.getString("x");
            String y=rs.getString("y");
            String z=rs.getString("z");
            String a1=rs.getString("aa");
            String a2=rs.getString("bb");
            String a3=rs.getString("cc");
            String a4=rs.getString("dd");
            String a5=rs.getString("ee");
            String a6=rs.getString("total");
            
            
            
            
            
            
            String data[]={Name,a, b, c, d, e, f, g, h, i, j, k, l, m, n, o, p, q, r, s, t, u, v, w, x, y, z,a1,a2,a3,a4,a5,a6};
            memberModel.addRow(data);

        }
        meal_entry_table.setModel(memberModel);
        }catch(Exception e){}
    }
    
    
    
    
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        date_me = new javax.swing.JTextField();
        name_me = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        breakfast_me = new javax.swing.JTextField();
        lunch_me = new javax.swing.JTextField();
        dinner_me = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        meal_entry_table = new javax.swing.JTable();
        enter_button = new javax.swing.JButton();
        dash_button = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(25, 111, 61));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        date_me.setBackground(new java.awt.Color(25, 111, 61));
        date_me.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        date_me.setForeground(new java.awt.Color(255, 255, 255));
        date_me.setBorder(null);
        date_me.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                date_meActionPerformed(evt);
            }
        });
        jPanel1.add(date_me, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 180, 170, -1));

        name_me.setBackground(new java.awt.Color(25, 111, 61));
        name_me.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        name_me.setForeground(new java.awt.Color(255, 255, 255));
        name_me.setBorder(null);
        jPanel1.add(name_me, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 230, 170, -1));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Jokerman", 1, 36)); // NOI18N
        jLabel1.setText("MEAL ENTRY");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 10, -1, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 930, 70));

        breakfast_me.setBackground(new java.awt.Color(25, 111, 61));
        breakfast_me.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        breakfast_me.setForeground(new java.awt.Color(255, 255, 255));
        breakfast_me.setBorder(null);
        jPanel1.add(breakfast_me, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 280, 170, -1));

        lunch_me.setBackground(new java.awt.Color(25, 111, 61));
        lunch_me.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lunch_me.setForeground(new java.awt.Color(255, 255, 255));
        lunch_me.setBorder(null);
        jPanel1.add(lunch_me, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 330, 170, -1));

        dinner_me.setBackground(new java.awt.Color(25, 111, 61));
        dinner_me.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        dinner_me.setForeground(new java.awt.Color(255, 255, 255));
        dinner_me.setBorder(null);
        jPanel1.add(dinner_me, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 380, 170, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("DATE");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 160, -1, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("NAME");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 210, -1, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("BREAKFAST");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 260, -1, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("LUNCH");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 310, -1, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("DINNER");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 360, -1, -1));

        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
        jScrollPane1.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

        meal_entry_table.setFont(new java.awt.Font("Maiandra GD", 1, 18)); // NOI18N
        meal_entry_table.setForeground(new java.awt.Color(51, 0, 51));
        meal_entry_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        meal_entry_table.setAutoResizeMode(0);
        meal_entry_table.setRowHeight(30);
        jScrollPane1.setViewportView(meal_entry_table);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, 590, 420));

        enter_button.setBackground(new java.awt.Color(102, 0, 0));
        enter_button.setFont(new java.awt.Font("Maiandra GD", 1, 18)); // NOI18N
        enter_button.setForeground(new java.awt.Color(255, 255, 102));
        enter_button.setText("ENTER");
        enter_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enter_buttonActionPerformed(evt);
            }
        });
        jPanel1.add(enter_button, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 420, 170, 40));

        dash_button.setBackground(new java.awt.Color(25, 111, 61));
        dash_button.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        dash_button.setIcon(new javax.swing.ImageIcon("C:\\Users\\Fahim MuntasirAkib\\OneDrive\\Documents\\NetBeansProjects\\Mess Management System\\Image\\icons8-dashboard-43letest.png")); // NOI18N
        dash_button.setBorder(null);
        dash_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dash_buttonActionPerformed(evt);
            }
        });
        jPanel1.add(dash_button, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 530, -1, 40));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("____________________________________");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 380, -1, 40));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("____________________________________");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 180, -1, 40));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("____________________________________");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 230, -1, 40));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("____________________________________");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 280, -1, 40));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("____________________________________");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 330, -1, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 592, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void date_meActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_date_meActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_date_meActionPerformed

    private void enter_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enter_buttonActionPerformed
        String date =date_me.getText();
        String name =name_me.getText();
        String bf   =breakfast_me.getText();
        String ln   =lunch_me.getText();
        String dn   =dinner_me.getText();
        int b=0;
        int l=0;
        int d=0;
        
        if(date.length()!=0 && name.length()!=0&&(bf.length()!=0||ln.length()!=0||dn.length()!=0)){
            
             b= Integer.parseInt(bf);
             l= Integer.parseInt(ln);
             d= Integer.parseInt(dn);
             int tm=(b+l+d);
             String total_meal=String.valueOf(tm);
             
             //System.out.println(total_meal);
             
             
            
             if("1".equals(date)){
           String query="UPDATE meal_entry SET a = '"+total_meal+"'WHERE name='"+name+"'";
            try{
            int rs=DBUTILS.queryUpdate(query);
                       System.out.println("2");

            JOptionPane.showMessageDialog(this,"Update Successful.");
             showMealEntryTable();
        }catch(Exception e){
            e.printStackTrace();
        }        
        }
        if("2".equals(date)){
                
           String query="UPDATE meal_entry SET b = '"+total_meal+"'WHERE name='"+name+"'";
           
            try{
            int rs=DBUTILS.queryUpdate(query);
             

            JOptionPane.showMessageDialog(this,"Update Successful.");
             showMealEntryTable();
        }catch(Exception e){
            e.printStackTrace();
        }        
        }     
         if("3".equals(date)){
                 
           String query="UPDATE meal_entry SET c = '"+total_meal+"'WHERE name='"+name+"'";
           
            try{
            int rs=DBUTILS.queryUpdate(query);
                     
            JOptionPane.showMessageDialog(this,"Update Successful.");
             showMealEntryTable();
        }catch(Exception e){
            e.printStackTrace();
        }        
        }    
             
         if("4".equals(date)){
               
           String query="UPDATE meal_entry SET d = '"+total_meal+"'WHERE name='"+name+"'";
           
            try{
            int rs=DBUTILS.queryUpdate(query);
                     
            JOptionPane.showMessageDialog(this,"Update Successful.");
             showMealEntryTable();
        }catch(Exception e){
            e.printStackTrace();
        }        
        }    
             
        if("5".equals(date)){
               
           String query="UPDATE meal_entry SET e = '"+total_meal+"'WHERE name='"+name+"'";
           
            try{
            int rs=DBUTILS.queryUpdate(query);
                      
            JOptionPane.showMessageDialog(this,"Update Successful.");
             showMealEntryTable();
        }catch(Exception e){
            e.printStackTrace();
        }        
        }     
             
        if("6".equals(date)){
                
           String query="UPDATE meal_entry SET f = '"+total_meal+"'WHERE name='"+name+"'";
           
            try{
            int rs=DBUTILS.queryUpdate(query);
                     
            JOptionPane.showMessageDialog(this,"Update Successful.");
             showMealEntryTable();
        }catch(Exception e){
            e.printStackTrace();
        }        
        }     
             
        if("7".equals(date)){
              
           String query="UPDATE meal_entry SET g = '"+total_meal+"'WHERE name='"+name+"'";
           
            try{
            int rs=DBUTILS.queryUpdate(query);
                      
            JOptionPane.showMessageDialog(this,"Update Successful.");
             showMealEntryTable();
        }catch(Exception e){
            e.printStackTrace();
        }        
        }     
         if("8".equals(date)){
               
           String query="UPDATE meal_entry SET h = '"+total_meal+"'WHERE name='"+name+"'";
           
            try{
            int rs=DBUTILS.queryUpdate(query);
                     
            JOptionPane.showMessageDialog(this,"Update Successful.");
             showMealEntryTable();
        }catch(Exception e){
            e.printStackTrace();
        }        
        }
         if("9".equals(date)){
              
           String query="UPDATE meal_entry SET i = '"+total_meal+"'WHERE name='"+name+"'";
           
            try{
            int rs=DBUTILS.queryUpdate(query);
                    
            JOptionPane.showMessageDialog(this,"Update Successful.");
             showMealEntryTable();
        }catch(Exception e){
            e.printStackTrace();
        }        
        }
         if("10".equals(date)){
                
          String query="UPDATE meal_entry SET j = '"+total_meal+"'WHERE name='"+name+"'";
           
            try{
            int rs=DBUTILS.queryUpdate(query);
                      

            JOptionPane.showMessageDialog(this,"Update Successful.");
             showMealEntryTable();
        }catch(Exception e){
            e.printStackTrace();
        }        
        }
         if("11".equals(date)){
               
           String query="UPDATE meal_entry SET k = '"+total_meal+"'WHERE name='"+name+"'";
           
            try{
            int rs=DBUTILS.queryUpdate(query);
                  
            JOptionPane.showMessageDialog(this,"Update Successful.");
             showMealEntryTable();
        }catch(Exception e){
            e.printStackTrace();
        }        
        }
         if("12".equals(date)){
                
           String query="UPDATE meal_entry SET l = '"+total_meal+"'WHERE name='"+name+"'";
           
            try{
            int rs=DBUTILS.queryUpdate(query);
                    
            JOptionPane.showMessageDialog(this,"Update Successful.");
             showMealEntryTable();
        }catch(Exception e){
            e.printStackTrace();
        }        
        }
         if("13".equals(date)){
               
           String query="UPDATE meal_entry SET m = '"+total_meal+"'WHERE name='"+name+"'";
           
            try{
            int rs=DBUTILS.queryUpdate(query);
                 
            JOptionPane.showMessageDialog(this,"Update Successful.");
             showMealEntryTable();
        }catch(Exception e){
            e.printStackTrace();
        }        
        }
         if("14".equals(date)){
              
           String query="UPDATE meal_entry SET n = '"+total_meal+"'WHERE name='"+name+"'";
           
            try{
            int rs=DBUTILS.queryUpdate(query);
                   

            JOptionPane.showMessageDialog(this,"Update Successful.");
             showMealEntryTable();
        }catch(Exception e){
            e.printStackTrace();
        }        
        }
         if("15".equals(date)){
               
           String query="UPDATE meal_entry SET o = '"+total_meal+"'WHERE name='"+name+"'";
           
            try{
            int rs=DBUTILS.queryUpdate(query);
                     
            JOptionPane.showMessageDialog(this,"Update Successful.");
             showMealEntryTable();
        }catch(Exception e){
            e.printStackTrace();
        }        
        }
         if("16".equals(date)){
                
           String query="UPDATE meal_entry SET p = '"+total_meal+"'WHERE name='"+name+"'";
           
            try{
            int rs=DBUTILS.queryUpdate(query);
                  
            JOptionPane.showMessageDialog(this,"Update Successful.");
             showMealEntryTable();
        }catch(Exception e){
            e.printStackTrace();
        }        
        }
         if("17".equals(date)){
                
           String query="UPDATE meal_entry SET q = '"+total_meal+"'WHERE name='"+name+"'";
           
            try{
            int rs=DBUTILS.queryUpdate(query);
                     

            JOptionPane.showMessageDialog(this,"Update Successful.");
             showMealEntryTable();
        }catch(Exception e){
            e.printStackTrace();
        }        
        }
         if("18".equals(date)){
                 
           String query="UPDATE meal_entry SET r = '"+total_meal+"'WHERE name='"+name+"'";
           
            try{
            int rs=DBUTILS.queryUpdate(query);
                      

            JOptionPane.showMessageDialog(this,"Update Successful.");
             showMealEntryTable();
        }catch(Exception e){
            e.printStackTrace();
        }        
        }
         if("19".equals(date)){
                 
           String query="UPDATE meal_entry SET s = '"+total_meal+"'WHERE name='"+name+"'";
           
            try{
            int rs=DBUTILS.queryUpdate(query);
                       

            JOptionPane.showMessageDialog(this,"Update Successful.");
             showMealEntryTable();
        }catch(Exception e){
            e.printStackTrace();
        }        
        }
         if("20".equals(date)){
                
           String query="UPDATE meal_entry SET t = '"+total_meal+"'WHERE name='"+name+"'";
           
            try{
            int rs=DBUTILS.queryUpdate(query);
                     

            JOptionPane.showMessageDialog(this,"Update Successful.");
             showMealEntryTable();
        }catch(Exception e){
            e.printStackTrace();
        }        
        }
         if("21".equals(date)){
                
           String query="UPDATE meal_entry SET u = '"+total_meal+"'WHERE name='"+name+"'";
           
            try{
            int rs=DBUTILS.queryUpdate(query);
                     

            JOptionPane.showMessageDialog(this,"Update Successful.");
             showMealEntryTable();
        }catch(Exception e){
            e.printStackTrace();
        }        
        }if("22".equals(date)){
                 
           String query="UPDATE meal_entry SET v = '"+total_meal+"'WHERE name='"+name+"'";
           
            try{
            int rs=DBUTILS.queryUpdate(query);
                      

            JOptionPane.showMessageDialog(this,"Update Successful.");
             showMealEntryTable();
        }catch(Exception e){
            e.printStackTrace();
        }        
        }
        if("23".equals(date)){
                
           String query="UPDATE meal_entry SET w = '"+total_meal+"'WHERE name='"+name+"'";
           
            try{
            int rs=DBUTILS.queryUpdate(query);
                      

            JOptionPane.showMessageDialog(this,"Update Successful.");
             showMealEntryTable();
        }catch(Exception e){
            e.printStackTrace();
        }        
        }
        if("24".equals(date)){
                
           String query="UPDATE meal_entry SET x = '"+total_meal+"'WHERE name='"+name+"'";
           
            try{
            int rs=DBUTILS.queryUpdate(query);
                      

            JOptionPane.showMessageDialog(this,"Update Successful.");
             showMealEntryTable();
        }catch(Exception e){
            e.printStackTrace();
        }        
        }if("25".equals(date)){
               
           String query="UPDATE meal_entry SET y = '"+total_meal+"'WHERE name='"+name+"'";
           
            try{
            int rs=DBUTILS.queryUpdate(query);
                      

            JOptionPane.showMessageDialog(this,"Update Successful.");
             showMealEntryTable();
        }catch(Exception e){
            e.printStackTrace();
        }        
        }if("26".equals(date)){
                
           String query="UPDATE meal_entry SET z = '"+total_meal+"'WHERE name='"+name+"'";
           
            try{
            int rs=DBUTILS.queryUpdate(query);
                     

            JOptionPane.showMessageDialog(this,"Update Successful.");
             showMealEntryTable();
        }catch(Exception e){
            e.printStackTrace();
        }        
        }if("27".equals(date)){
                
           String query="UPDATE meal_entry SET aa = '"+total_meal+"'WHERE name='"+name+"'";
           
            try{
            int rs=DBUTILS.queryUpdate(query);
                      

            JOptionPane.showMessageDialog(this,"Update Successful.");
             showMealEntryTable();
        }catch(Exception e){
            e.printStackTrace();
        }        
        }if("28".equals(date)){
                
           String query="UPDATE meal_entry SET bb = '"+total_meal+"'WHERE name='"+name+"'";
           
            try{
            int rs=DBUTILS.queryUpdate(query);
                      

            JOptionPane.showMessageDialog(this,"Update Successful.");
             showMealEntryTable();
        }catch(Exception e){
            e.printStackTrace();
        }        
        }if("29".equals(date)){
               
           String query="UPDATE meal_entry SET cc = '"+total_meal+"'WHERE name='"+name+"'";
           
            try{
            int rs=DBUTILS.queryUpdate(query);
                     

            JOptionPane.showMessageDialog(this,"Update Successful.");
             showMealEntryTable();
        }catch(Exception e){
            e.printStackTrace();
        }        
        }if("30".equals(date)){
                
           String query="UPDATE meal_entry SET dd = '"+total_meal+"'WHERE name='"+name+"'";
           
            try{
            int rs=DBUTILS.queryUpdate(query);
                    

            JOptionPane.showMessageDialog(this,"Update Successful.");
             showMealEntryTable();
        }catch(Exception e){
            e.printStackTrace();
        }        
        }
        if("31".equals(date)){
               
           String query="UPDATE meal_entry SET ee = '"+total_meal+"'WHERE name='"+name+"'";
           
            try{
            int rs=DBUTILS.queryUpdate(query);
           
            JOptionPane.showMessageDialog(this,"Update Successful.");
             showMealEntryTable();
        }catch(Exception e){
            e.printStackTrace();
        }        
        }
        
        
        
        
        
        
         
             
       // showMealEntryTable();
        }
        
    }//GEN-LAST:event_enter_buttonActionPerformed

    private void dash_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dash_buttonActionPerformed
                 this.setVisible(false);
             new DashBoard().setVisible(true);
    }//GEN-LAST:event_dash_buttonActionPerformed

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
            java.util.logging.Logger.getLogger(Meal_Entry_Page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Meal_Entry_Page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Meal_Entry_Page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Meal_Entry_Page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Meal_Entry_Page().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField breakfast_me;
    private javax.swing.JButton dash_button;
    private javax.swing.JTextField date_me;
    private javax.swing.JTextField dinner_me;
    private javax.swing.JButton enter_button;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField lunch_me;
    private javax.swing.JTable meal_entry_table;
    private javax.swing.JTextField name_me;
    // End of variables declaration//GEN-END:variables
}
