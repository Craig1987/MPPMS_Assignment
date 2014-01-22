package Views;

import Models.Report;
import Models.SetOfComments;
import javax.swing.ImageIcon;

public class ReportDetailView extends javax.swing.JFrame {
    
    public ReportDetailView() {
        initComponents();
        this.setIconImage(new ImageIcon(getClass().getResource("/resources/icon.png")).getImage());
    }
    
    public Report getSelectedComment() {
        if (this.listComments.getSelectedIndex()< 0) {
            return null;
        }
        return (Report)(listComments.getSelectedValue());
    }
    
    public void setListOfComments(Object[] comments) {
        this.listComments.setListData(comments);
    }
    
    public void setIdLabelText(String text) {
        this.lblReportID.setText(text);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        reportSplitPane = new javax.swing.JSplitPane();
        commentListPanel = new javax.swing.JPanel();
        lblComments = new javax.swing.JLabel();
        lblReportID = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        listComments = new javax.swing.JList();
        editCommentPanel = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        reportSplitPane.setDividerLocation(270);

        lblComments.setText("Comments");

        lblReportID.setText("ID:");

        listComments.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(listComments);

        javax.swing.GroupLayout commentListPanelLayout = new javax.swing.GroupLayout(commentListPanel);
        commentListPanel.setLayout(commentListPanelLayout);
        commentListPanelLayout.setHorizontalGroup(
            commentListPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(commentListPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(commentListPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(commentListPanelLayout.createSequentialGroup()
                        .addComponent(lblComments)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 184, Short.MAX_VALUE)
                        .addComponent(lblReportID)))
                .addContainerGap())
        );
        commentListPanelLayout.setVerticalGroup(
            commentListPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(commentListPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(commentListPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblComments)
                    .addComponent(lblReportID))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 292, Short.MAX_VALUE)
                .addContainerGap())
        );

        reportSplitPane.setLeftComponent(commentListPanel);

        javax.swing.GroupLayout editCommentPanelLayout = new javax.swing.GroupLayout(editCommentPanel);
        editCommentPanel.setLayout(editCommentPanelLayout);
        editCommentPanelLayout.setHorizontalGroup(
            editCommentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 424, Short.MAX_VALUE)
        );
        editCommentPanelLayout.setVerticalGroup(
            editCommentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 339, Short.MAX_VALUE)
        );

        reportSplitPane.setRightComponent(editCommentPanel);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(reportSplitPane)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(reportSplitPane)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel commentListPanel;
    private javax.swing.JPanel editCommentPanel;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblComments;
    private javax.swing.JLabel lblReportID;
    private javax.swing.JList listComments;
    private javax.swing.JSplitPane reportSplitPane;
    // End of variables declaration//GEN-END:variables
}
