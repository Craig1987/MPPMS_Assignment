package Views;

import java.awt.event.ActionListener;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JList;
import javax.swing.ListModel;
import javax.swing.event.ListSelectionListener;

public class TaskDetailView extends javax.swing.JPanel {

    public TaskDetailView() {
        initComponents();
    }
    
    public void setEditMode(boolean editMode, boolean canEditTask) {
        saveButton.setVisible(editMode);
        discardButton.setVisible(editMode);
        editButton.setVisible(!editMode && canEditTask);
        textTaskTitle.setEnabled(editMode);
        cmboTaskType.setEnabled(editMode);
        cmboPriority.setEnabled(editMode);
        cmboStatus.setEnabled(editMode);
        textReport.setEnabled(editMode);
        editReportButton.setEnabled(editMode && !textReport.getText().equals("Blank report"));
        assignedToChoiceButton.setEnabled(editMode);
        assetChoiceButton.setEnabled(editMode);
    }
    
    public void setCanEditAsset(boolean canEdit) {
        assetViewButton.setEnabled(canEdit);
    }
    
    public void setIdLabelText(String text) {
        this.lblTaskID.setText(text);
    }
    
    public void setTitleText(String text) {
        this.textTaskTitle.setText(text);
    }
    
    public String getTaskTitle() {
        return this.textTaskTitle.getText().replace("'", "''");
    }
    
    public void setTaskType(Object[] items, Object selectedItem) {
        this.cmboTaskType.setModel(new DefaultComboBoxModel<>(items));
        this.cmboTaskType.setSelectedItem(selectedItem);
    }
    
    public Object getTaskType() {
        return this.cmboTaskType.getSelectedItem();
    }
    
    public void setStatus(Object[] items, Object selectedItem) {
        this.cmboStatus.setModel(new DefaultComboBoxModel<>(items));
        this.cmboStatus.setSelectedItem(selectedItem);
    }
    
    public Object getStatus() {
        return this.cmboStatus.getSelectedItem();
    }
    
    public void setPriority(Object[] items, Object selectedItem) {
        this.cmboPriority.setModel(new DefaultComboBoxModel<>(items));
        this.cmboPriority.setSelectedItem(selectedItem);
    }
    
    public Object getPriority() {
        return this.cmboPriority.getSelectedItem();
    }
    
    public void setReportText(String report) {
        this.textReport.setText(report);
    }
    
    public void setAssignedTo(Object[] users) {
        this.listAssignedTo.setListData(users);
    }
    
    public Object[] getAssignedTo() {
        return getItemsFromList(listAssignedTo);
    }
    
    public void setAssets(Object[] assets) {
        this.listAssets.setListData(assets);
    }
    
    public Object[] getAssets() {
        return getItemsFromList(listAssets);
    }
    
    public Object getSelectedAsset() {
        return this.listAssets.getSelectedValue();
    }
    
    public void addAssignedToChoiceActionListener(ActionListener listener) {
        this.assignedToChoiceButton.addActionListener(listener);
    }
    
    public void addAssetChoiceActionListener(ActionListener listener) {
        this.assetChoiceButton.addActionListener(listener);
    }
    
    public void addAssetEditActionListener(ActionListener listener) {
        this.assetViewButton.addActionListener(listener);
    }
    
    public void addEditButtonActionListener(ActionListener listener) {
        editButton.addActionListener(listener);
    }
    
    public void addSaveButtonActionListener(ActionListener listener) {
        saveButton.addActionListener(listener);
    }
    
    public void addDiscardButtonActionListener(ActionListener listener) {
        discardButton.addActionListener(listener);
    }
    
    public void addEditReportActionListener(ActionListener listener) {
        this.editReportButton.addActionListener(listener);
    }
    
    public void addAssetViewButtonActionListener(ActionListener listener) {
        this.assetViewButton.addActionListener(listener);
    }
    
    public void addAssetsListSelectionListener(ListSelectionListener listener) {
        this.listAssets.getSelectionModel().addListSelectionListener(listener);
    }
    
    private Object[] getItemsFromList(JList list) {
        ListModel model = list.getModel();
        Object[] items = new Object[model.getSize()];

        for(int i = 0; i < model.getSize(); i++) {
             items[i] =  model.getElementAt(i);
        }
        
        return items;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        editReportButton = new javax.swing.JButton();
        lblReport = new javax.swing.JLabel();
        cmboStatus = new javax.swing.JComboBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        listAssignedTo = new javax.swing.JList();
        lblTaskID = new javax.swing.JLabel();
        lblTaskDetails = new javax.swing.JLabel();
        lblStatus = new javax.swing.JLabel();
        cmboPriority = new javax.swing.JComboBox();
        lblPriority = new javax.swing.JLabel();
        textTaskTitle = new javax.swing.JTextField();
        lblTaskTitle = new javax.swing.JLabel();
        assignedToChoiceButton = new javax.swing.JButton();
        lblAssignedTo = new javax.swing.JLabel();
        textReport = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        discardButton = new javax.swing.JButton();
        saveButton = new javax.swing.JButton();
        editButton = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        listAssets = new javax.swing.JList();
        lblAssets = new javax.swing.JLabel();
        assetChoiceButton = new javax.swing.JButton();
        assetViewButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        cmboTaskType = new javax.swing.JComboBox();

        editReportButton.setText("Edit report");

        lblReport.setText("Report:");

        cmboStatus.setFocusable(false);

        listAssignedTo.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        listAssignedTo.setFocusable(false);
        jScrollPane1.setViewportView(listAssignedTo);

        lblTaskID.setText("ID:");

        lblTaskDetails.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblTaskDetails.setText("Task Details");

        lblStatus.setText("Status:");

        cmboPriority.setFocusable(false);

        lblPriority.setText("Priority:");

        lblTaskTitle.setText("Title:");

        assignedToChoiceButton.setText("Add / Remove");

        lblAssignedTo.setText("Assigned to:");

        textReport.setEditable(false);

        discardButton.setText("Discard changes");

        saveButton.setText("Save");

        editButton.setText("Edit");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(discardButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(saveButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(editButton))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(discardButton)
                .addComponent(saveButton)
                .addComponent(editButton))
        );

        listAssets.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane2.setViewportView(listAssets);

        lblAssets.setText("Assets:");

        assetChoiceButton.setText("Add / Remove");

        assetViewButton.setText("View");

        jLabel1.setText("Type:");

        cmboTaskType.setFocusable(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblTaskDetails)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 6, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblTaskID, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblTaskTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(textTaskTitle))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblStatus)
                        .addGap(26, 26, 26)
                        .addComponent(cmboStatus, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblPriority)
                            .addComponent(lblReport))
                        .addGap(23, 23, 23)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(textReport)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(editReportButton, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(cmboPriority, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 201, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(assignedToChoiceButton)
                        .addGap(1, 1, 1))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(assetViewButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(assetChoiceButton, javax.swing.GroupLayout.Alignment.TRAILING)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblAssignedTo)
                            .addComponent(lblAssets))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(33, 33, 33)
                        .addComponent(cmboTaskType, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblTaskDetails)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addComponent(lblTaskID)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTaskTitle)
                    .addComponent(textTaskTitle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(cmboTaskType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmboStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblStatus))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPriority)
                    .addComponent(cmboPriority, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblReport)
                    .addComponent(editReportButton, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textReport, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblAssignedTo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(assignedToChoiceButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblAssets)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(assetChoiceButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(assetViewButton))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton assetChoiceButton;
    private javax.swing.JButton assetViewButton;
    private javax.swing.JButton assignedToChoiceButton;
    private javax.swing.JComboBox cmboPriority;
    private javax.swing.JComboBox cmboStatus;
    private javax.swing.JComboBox cmboTaskType;
    private javax.swing.JButton discardButton;
    private javax.swing.JButton editButton;
    private javax.swing.JButton editReportButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblAssets;
    private javax.swing.JLabel lblAssignedTo;
    private javax.swing.JLabel lblPriority;
    private javax.swing.JLabel lblReport;
    private javax.swing.JLabel lblStatus;
    private javax.swing.JLabel lblTaskDetails;
    private javax.swing.JLabel lblTaskID;
    private javax.swing.JLabel lblTaskTitle;
    private javax.swing.JList listAssets;
    private javax.swing.JList listAssignedTo;
    private javax.swing.JButton saveButton;
    private javax.swing.JTextField textReport;
    private javax.swing.JTextField textTaskTitle;
    // End of variables declaration//GEN-END:variables
}
