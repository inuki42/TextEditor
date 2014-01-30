/*
 * Graphical User Interface for Customer Information Submission
 * Olympic Pride Project
 * GUI Developed by Scott Young on Jan 25, 2014
 * Intro to Programming for Business
 * "We pledge that we have complied with the AIC in this work."
 * - AR / BB / BN / SY
 */
package texteditor;

import static java.awt.image.ImageObserver.WIDTH;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;

/**
 *
 * @author Scott Young
 */
public class GUI extends javax.swing.JFrame {

	/**
	 * Creates new form GUI
	 */
    private String first_name;
    private String last_name;
    private String address1;
    private String address2;
    private String city;
    private String State;
    private String zip;
    private String phone;
    private String email;
    private String clear_output_container = "";
    private String header = "First Name,Last Name,Address,Address2,"
            + "City,State,Zip Code,Phone Number,EMail Address\n";
    private boolean error_flag = false;
    private boolean toggle_header = false;
    private Customer cst;
    

	public GUI() {
		initComponents();
                cst = new Customer();
	}

	/**
	 * This method is called from within the constructor to initialize the form.
	 * WARNING: Do NOT modify this code. The content of this method is always
	 * regenerated by the Form Editor.
	 */
	@SuppressWarnings("unchecked")
   // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
   private void initComponents() {

      TopColorBarBlue = new javax.swing.JToolBar();
      TopColorBarYellow = new javax.swing.JToolBar();
      TopColorBarBlack = new javax.swing.JToolBar();
      TopColorBarGreen = new javax.swing.JToolBar();
      TopColorBarRed = new javax.swing.JToolBar();
      BottomColorBarBlue = new javax.swing.JToolBar();
      BottomColorBarYellow = new javax.swing.JToolBar();
      BottomColorBarBlack = new javax.swing.JToolBar();
      BottomColorBarGreen = new javax.swing.JToolBar();
      BottomColorBarRed = new javax.swing.JToolBar();
      OlympicPride = new javax.swing.JLabel();
      CustInfoForm = new javax.swing.JLabel();
      ReqFieldInstruct = new javax.swing.JLabel();
      FirstName = new javax.swing.JLabel();
      FirstNameField = new javax.swing.JTextField();
      LastName = new javax.swing.JLabel();
      LastNameField = new javax.swing.JTextField();
      AddressLine1 = new javax.swing.JLabel();
      Address1Field = new javax.swing.JTextField();
      AddressLine2 = new javax.swing.JLabel();
      Address2Field = new javax.swing.JTextField();
      City = new javax.swing.JLabel();
      CityField = new javax.swing.JTextField();
      StateLabel = new javax.swing.JLabel();
      StateDropDown = new javax.swing.JComboBox();
      ZipCode = new javax.swing.JLabel();
      ZipCodeField = new javax.swing.JFormattedTextField();
      PhoneNumber = new javax.swing.JLabel();
      PhoneNumberField = new javax.swing.JFormattedTextField();
      EmailAddress = new javax.swing.JLabel();
      EmailAddressField = new javax.swing.JTextField();
      FileOutput = new javax.swing.JLabel();
      AddHeaderRow = new javax.swing.JButton();
      NewFile = new javax.swing.JButton();
      OpenFile = new javax.swing.JButton();
      SaveRecord = new javax.swing.JButton();
      SaveFile = new javax.swing.JButton();
      Exit = new javax.swing.JButton();
      jScrollPane1 = new javax.swing.JScrollPane();
      FileOutputArea = new javax.swing.JTextArea();

      setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
      setTitle("Olympic Pride Customer Entry Form");

      TopColorBarBlue.setBackground(new java.awt.Color(51, 102, 255));
      TopColorBarBlue.setRollover(true);

      TopColorBarYellow.setBackground(new java.awt.Color(255, 255, 0));
      TopColorBarYellow.setRollover(true);

      TopColorBarBlack.setBackground(new java.awt.Color(0, 0, 0));
      TopColorBarBlack.setRollover(true);

      TopColorBarGreen.setBackground(new java.awt.Color(0, 153, 51));
      TopColorBarGreen.setRollover(true);

      TopColorBarRed.setBackground(new java.awt.Color(255, 0, 0));
      TopColorBarRed.setRollover(true);

      BottomColorBarBlue.setBackground(new java.awt.Color(51, 102, 255));
      BottomColorBarBlue.setRollover(true);

      BottomColorBarYellow.setBackground(new java.awt.Color(255, 255, 0));
      BottomColorBarYellow.setRollover(true);

      BottomColorBarBlack.setBackground(new java.awt.Color(0, 0, 0));
      BottomColorBarBlack.setRollover(true);

      BottomColorBarGreen.setBackground(new java.awt.Color(0, 153, 51));
      BottomColorBarGreen.setRollover(true);

      BottomColorBarRed.setBackground(new java.awt.Color(255, 0, 0));
      BottomColorBarRed.setRollover(true);

      OlympicPride.setFont(new java.awt.Font("Gill Sans", 1, 48)); // NOI18N
      OlympicPride.setText("Olympic Pride");

      CustInfoForm.setFont(new java.awt.Font("Gill Sans", 1, 28)); // NOI18N
      CustInfoForm.setText("Customer Information Form");

      ReqFieldInstruct.setFont(new java.awt.Font("Lucida Grande", 2, 10)); // NOI18N
      ReqFieldInstruct.setForeground(new java.awt.Color(255, 0, 51));
      ReqFieldInstruct.setText("* indicates required field");

      FirstName.setText("First Name *");

      FirstNameField.setNextFocusableComponent(LastNameField);

      LastName.setText("Last Name *");

      LastNameField.setNextFocusableComponent(Address1Field);

      AddressLine1.setText("Address 1 *");

      Address1Field.setNextFocusableComponent(Address2Field);

      AddressLine2.setForeground(new java.awt.Color(51, 51, 255));
      AddressLine2.setText("Address 2");

      Address2Field.setNextFocusableComponent(CityField);

      City.setText("City *");

      CityField.setNextFocusableComponent(StateDropDown);

      StateLabel.setText("State *");

      StateDropDown.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select", "Alabama", "Alaska", "Arizona", "Arkansas", "California", "Colorado", "Connecticut", "Delaware", "Florida", "Georgia", "Hawaii", "Idaho", "Illinois", "Indiana", "Iowa", "Kansas", "Kentucky", "Louisiana", "Maine", "Maryland", "Massachusetts", "Michigan", "Minnesota", "Mississippi", "Missouri", "Montana", "Nebraska", "Nevada", "New Hampshire", "New Jersey", "New Mexico", "New York", "North Carolina", "North Dakota", "Ohio", "Oklahoma", "Oregon", "Pennsylvania", "Rhode Island", "South Carolina", "South Dakota", "Tennessee", "Texas", "Utah", "Vermont", "Virginia", "Washington", "Washington D.C.", "West Virginia", "Wisconsin", "Wyoming" }));
      StateDropDown.setNextFocusableComponent(ZipCodeField);
      StateDropDown.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            StateDropDownActionPerformed(evt);
         }
      });

      ZipCode.setText("Zip Code *");

      try {
         ZipCodeField.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#####")));
      } catch (java.text.ParseException ex) {
         ex.printStackTrace();
      }
      ZipCodeField.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            ZipCodeFieldActionPerformed(evt);
         }
      });

      PhoneNumber.setForeground(new java.awt.Color(51, 51, 255));
      PhoneNumber.setText("Phone Number");

      try {
         PhoneNumberField.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(###) ###-####")));
      } catch (java.text.ParseException ex) {
         ex.printStackTrace();
      }

      EmailAddress.setText("Email Address *");

      EmailAddressField.setNextFocusableComponent(SaveRecord);

      FileOutput.setFont(new java.awt.Font("Gill Sans", 1, 18)); // NOI18N
      FileOutput.setText("File Output");

      AddHeaderRow.setText("Add Header Row");
      AddHeaderRow.setNextFocusableComponent(SaveFile);
      AddHeaderRow.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            AddHeaderRowActionPerformed(evt);
         }
      });

      NewFile.setText("New File");
      NewFile.setNextFocusableComponent(FirstNameField);

      OpenFile.setText("Open File");
      OpenFile.setNextFocusableComponent(FirstNameField);

      SaveRecord.setText("Save Record");
      SaveRecord.setNextFocusableComponent(FirstNameField);
      SaveRecord.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            SaveRecordActionPerformed(evt);
         }
      });

      SaveFile.setText("Save File");

      Exit.setText("Exit");
      Exit.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            ExitActionPerformed(evt);
         }
      });

      FileOutputArea.setColumns(20);
      FileOutputArea.setRows(5);
      jScrollPane1.setViewportView(FileOutputArea);

      javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
      getContentPane().setLayout(layout);
      layout.setHorizontalGroup(
         layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(layout.createSequentialGroup()
            .addContainerGap()
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
               .addGroup(layout.createSequentialGroup()
                  .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                     .addComponent(jScrollPane1)
                     .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(BottomColorBarBlue, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BottomColorBarYellow, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BottomColorBarBlack, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BottomColorBarGreen, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)))
                  .addGap(3, 3, 3)
                  .addComponent(BottomColorBarRed, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                  .addGap(0, 11, Short.MAX_VALUE))
               .addGroup(layout.createSequentialGroup()
                  .addGap(721, 721, 721)
                  .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                     .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                           .addComponent(NewFile)
                           .addComponent(OpenFile)
                           .addComponent(SaveRecord))
                        .addGap(0, 0, Short.MAX_VALUE))
                     .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                           .addComponent(SaveFile)
                           .addComponent(Exit))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
               .addGroup(layout.createSequentialGroup()
                  .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                     .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                           .addComponent(ReqFieldInstruct, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                           .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                              .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                 .addComponent(City, javax.swing.GroupLayout.Alignment.LEADING)
                                 .addComponent(OlympicPride, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 425, javax.swing.GroupLayout.PREFERRED_SIZE))
                              .addGap(0, 0, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(CustInfoForm)
                        .addGap(35, 35, 35))
                     .addGroup(layout.createSequentialGroup()
                        .addComponent(TopColorBarBlue, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TopColorBarYellow, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TopColorBarBlack, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TopColorBarGreen, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TopColorBarRed, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE))
                     .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                           .addGroup(layout.createSequentialGroup()
                              .addGap(2, 2, 2)
                              .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                 .addComponent(FirstName)
                                 .addComponent(LastName)))
                           .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                              .addGroup(layout.createSequentialGroup()
                                 .addComponent(FileOutput)
                                 .addGap(414, 414, 414)
                                 .addComponent(AddHeaderRow))
                              .addGroup(layout.createSequentialGroup()
                                 .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(EmailAddress)
                                    .addComponent(AddressLine1)
                                    .addComponent(AddressLine2)
                                    .addComponent(StateLabel))
                                 .addGap(14, 14, 14)
                                 .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Address1Field, javax.swing.GroupLayout.PREFERRED_SIZE, 499, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                       .addComponent(LastNameField, javax.swing.GroupLayout.Alignment.LEADING)
                                       .addComponent(FirstNameField, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 315, Short.MAX_VALUE))
                                    .addComponent(Address2Field, javax.swing.GroupLayout.PREFERRED_SIZE, 499, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(CityField, javax.swing.GroupLayout.PREFERRED_SIZE, 315, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                       .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                          .addComponent(StateDropDown, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                          .addGap(26, 26, 26)
                                          .addComponent(ZipCode)
                                          .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                          .addComponent(ZipCodeField, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                          .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                          .addComponent(PhoneNumber)
                                          .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                          .addComponent(PhoneNumberField, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                                       .addComponent(EmailAddressField, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 497, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                 .addGap(66, 66, 66))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                  .addContainerGap())))
      );
      layout.setVerticalGroup(
         layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(layout.createSequentialGroup()
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
               .addComponent(TopColorBarRed, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
               .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                  .addComponent(TopColorBarGreen, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                  .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                     .addComponent(TopColorBarYellow, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 15, Short.MAX_VALUE)
                     .addComponent(TopColorBarBlue, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
               .addComponent(TopColorBarBlack, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
               .addGroup(layout.createSequentialGroup()
                  .addGap(12, 12, 12)
                  .addComponent(OlympicPride, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                  .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                  .addComponent(ReqFieldInstruct))
               .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                  .addGap(18, 18, 18)
                  .addComponent(CustInfoForm)))
            .addGap(18, 18, 18)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
               .addComponent(FirstName)
               .addComponent(NewFile)
               .addComponent(FirstNameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGap(4, 4, 4)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
               .addComponent(LastName)
               .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                  .addComponent(LastNameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                  .addComponent(OpenFile)))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
               .addComponent(AddressLine1)
               .addComponent(Address1Field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
               .addComponent(SaveRecord))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
               .addComponent(AddressLine2)
               .addComponent(Address2Field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
               .addComponent(City)
               .addComponent(CityField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
               .addComponent(PhoneNumberField, javax.swing.GroupLayout.Alignment.TRAILING)
               .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                  .addComponent(ZipCode, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                  .addComponent(StateLabel)
                  .addComponent(StateDropDown, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                  .addComponent(ZipCodeField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
               .addComponent(PhoneNumber, javax.swing.GroupLayout.Alignment.TRAILING))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
               .addComponent(EmailAddressField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
               .addComponent(EmailAddress))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
               .addComponent(FileOutput)
               .addComponent(AddHeaderRow))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
               .addGroup(layout.createSequentialGroup()
                  .addGap(0, 79, Short.MAX_VALUE)
                  .addComponent(SaveFile)
                  .addGap(18, 18, 18)
                  .addComponent(Exit)
                  .addGap(35, 35, 35))
               .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 178, Short.MAX_VALUE))
            .addGap(18, 18, 18)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
               .addComponent(BottomColorBarGreen, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 15, Short.MAX_VALUE)
               .addComponent(BottomColorBarBlack, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
               .addComponent(BottomColorBarYellow, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
               .addComponent(BottomColorBarBlue, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
               .addComponent(BottomColorBarRed, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
      );

      pack();
   }// </editor-fold>//GEN-END:initComponents

    private void SaveRecordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SaveRecordActionPerformed
        
        // The following statements check whether or not GUI fields are
        // empty.  If they are, msg box will be displayed and focus
        // will be set on missing field 
        
        error_flag = false;
        
        try
        {
            cst.setFName(FirstNameField.getText());
            
            if(cst.getFName().isEmpty() == true)
            {
                error_flag = true;
                throw Exception ("EmptyFirstNameField");
                            
            }     // end if first name

         
               }       // end try first name
        
        catch (Exception EmptyFirstNameField)
        {
            JOptionPane.showMessageDialog(rootPane, "First Name missing", "First Name", WIDTH);
            FirstNameField.requestFocus();
                 
        }   //end catch first name

                
        try
        {
            cst.setLName(LastNameField.getText());
            
            if(cst.getLName().isEmpty() == true)
            {
                error_flag = true;
                throw Exception (last_name);
                            
            }       // end if last name

         }       // end try last name
        
        catch (Exception last_name)
        {
            JOptionPane.showMessageDialog(rootPane, "Last Name missing", "Last Name", WIDTH);
            LastNameField.requestFocus();
            
        }   //end catch last name
               
        try
        {
            cst.setAddress(Address1Field.getText());
            
            if(cst.getAddress().isEmpty() == true)
            {
                error_flag = true;
                throw Exception (address1);
            
            }       // end if address1

         }       // end try address1
        
        catch (Exception address1)
        {
            JOptionPane.showMessageDialog(rootPane, "Address missing", "Address", WIDTH);
            Address1Field.requestFocus();

        }   // end catch address1
        
        cst.setAddress2(Address2Field.getText());
                
        try
        {
            cst.setCity(CityField.getText());
            
            if(cst.getCity().isEmpty() == true)
            {
                error_flag = true;
                throw Exception (city);
            }       // end if city

         }       // end try city
                
         catch (Exception city)
         {
             JOptionPane.showMessageDialog(rootPane, "City missing", "City", WIDTH);
             CityField.requestFocus();
         
         }   // end catch city
        
        
        try
        {
            if (StateDropDown.getSelectedItem() == "Select")
            {
                cst.setState((String)(StateDropDown.getSelectedItem()));     
                throw Exception (State);
            }
          
         }       // end try state
                
         catch (Exception State)
         {
             JOptionPane.showMessageDialog(rootPane, "State missing", "State", WIDTH);                          
         
         }   // end catch state
        
         try
         {
             cst.setEmail(EmailAddressField.getText());
             
             if(cst.getEmail().isEmpty() == true)
             {
                 error_flag = true;
                 throw Exception ("EMail");
             }

          }       // end try email
                
                      
         catch (Exception EMail)
         {
             JOptionPane.showMessageDialog(rootPane, "EMail missing", "EMail Address", WIDTH);
             EmailAddressField.requestFocus();
         
         }   //end catch email
                  
         try
         {
             cst.setZip(ZipCodeField.getText());
             
             if(ZipCodeField.getText().length() != 5)
             {
                 ZipCodeField.setText("");
                 error_flag = true;
                 throw Exception (zip);
             }      // end if zip
                        
          }       // end try zip
                    
         catch (Exception zip) 
         {
             JOptionPane.showMessageDialog(rootPane, "Zip Code 5 digits", "Zip Code", WIDTH);
             error_flag = true;
             ZipCodeField.requestFocus();
          
         }      // end catch zip
         
         try
         {
             if(PhoneNumberField.getText().length() < 10)
             {
                 PhoneNumberField.setText("");
                 error_flag = true;
                 throw Exception (phone);
             }
				 else
					 cst.setPhone(PhoneNumberField.getText());
                        
          }      // end try phone nbr
         
         catch (Exception phone) 
         {
             JOptionPane.showMessageDialog(rootPane, "Phone Numbere 10 digits", "Phone Number", WIDTH);
             error_flag = true;
             PhoneNumberField.requestFocus();
         }      // end catch phone nbr
                
//      Clear all fields
         
         if(error_flag == false)
         {
             clear_output_container = FileOutputArea.getText() + cst.print();
             FirstNameField.setText("");
             LastNameField.setText("");
             Address1Field.setText("");
             Address2Field.setText("");
             CityField.setText("");
             StateDropDown.setSelectedIndex(0);
             ZipCodeField.setText("");
             PhoneNumberField.setText("");
             EmailAddressField.setText("");
             FirstNameField.requestFocus();
             
             // Header line
             
             if(toggle_header == true)
             {
                 FileOutputArea.setText(header);
                 FileOutputArea.append(clear_output_container);
             }      // end if
        
             else 
             {
                 FileOutputArea.setText(clear_output_container);
             }      // end else
         }  // end if
         
         
         else 
         {
                //FileOutputArea.setText("");
         }
        
         cst.ClearFields();
    
    
    
    
    



    }//GEN-LAST:event_SaveRecordActionPerformed

    private void StateDropDownActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_StateDropDownActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_StateDropDownActionPerformed

    private void ExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitActionPerformed

        System.exit(0);        // TODO add your handling code here:
    }//GEN-LAST:event_ExitActionPerformed

    private void ZipCodeFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ZipCodeFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ZipCodeFieldActionPerformed

    private void AddHeaderRowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddHeaderRowActionPerformed
        
       // Add or remove header line
        
        if(toggle_header == false)
            toggle_header = true;
        else
            toggle_header = false;
        
        FileOutputArea.setText("");
        if(toggle_header == true)
        {
            FileOutputArea.setText(header);
            FileOutputArea.append(clear_output_container);
        }
        else
        {
            FileOutputArea.setText(clear_output_container);
        }
        
    }//GEN-LAST:event_AddHeaderRowActionPerformed

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
			java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (InstantiationException ex) {
			java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (IllegalAccessException ex) {
			java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (javax.swing.UnsupportedLookAndFeelException ex) {
			java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		}
		//</editor-fold>

		/* Create and display the form */
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new GUI().setVisible(true);
			}
		});
	}

   // Variables declaration - do not modify//GEN-BEGIN:variables
   private javax.swing.JButton AddHeaderRow;
   private javax.swing.JTextField Address1Field;
   private javax.swing.JTextField Address2Field;
   private javax.swing.JLabel AddressLine1;
   private javax.swing.JLabel AddressLine2;
   private javax.swing.JToolBar BottomColorBarBlack;
   private javax.swing.JToolBar BottomColorBarBlue;
   private javax.swing.JToolBar BottomColorBarGreen;
   private javax.swing.JToolBar BottomColorBarRed;
   private javax.swing.JToolBar BottomColorBarYellow;
   private javax.swing.JLabel City;
   private javax.swing.JTextField CityField;
   private javax.swing.JLabel CustInfoForm;
   private javax.swing.JLabel EmailAddress;
   private javax.swing.JTextField EmailAddressField;
   private javax.swing.JButton Exit;
   private javax.swing.JLabel FileOutput;
   private javax.swing.JTextArea FileOutputArea;
   private javax.swing.JLabel FirstName;
   private javax.swing.JTextField FirstNameField;
   private javax.swing.JLabel LastName;
   private javax.swing.JTextField LastNameField;
   private javax.swing.JButton NewFile;
   private javax.swing.JLabel OlympicPride;
   private javax.swing.JButton OpenFile;
   private javax.swing.JLabel PhoneNumber;
   private javax.swing.JFormattedTextField PhoneNumberField;
   private javax.swing.JLabel ReqFieldInstruct;
   private javax.swing.JButton SaveFile;
   private javax.swing.JButton SaveRecord;
   private javax.swing.JComboBox StateDropDown;
   private javax.swing.JLabel StateLabel;
   private javax.swing.JToolBar TopColorBarBlack;
   private javax.swing.JToolBar TopColorBarBlue;
   private javax.swing.JToolBar TopColorBarGreen;
   private javax.swing.JToolBar TopColorBarRed;
   private javax.swing.JToolBar TopColorBarYellow;
   private javax.swing.JLabel ZipCode;
   private javax.swing.JFormattedTextField ZipCodeField;
   private javax.swing.JScrollPane jScrollPane1;
   // End of variables declaration//GEN-END:variables

    private Exception Exception(String emptyFirstNameField) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private Exception Exception(JComboBox StateDropDown) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
  
}
