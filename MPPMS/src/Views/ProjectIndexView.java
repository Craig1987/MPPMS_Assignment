package Views;

import Models.Project;
import Models.SetOfProjects;
import ca.odell.glazedlists.EventList;
import ca.odell.glazedlists.GlazedLists;
import ca.odell.glazedlists.gui.TableFormat;
import ca.odell.glazedlists.swing.DefaultEventTableModel;
import java.awt.event.ActionListener;

public class ProjectIndexView extends javax.swing.JFrame {

    public ProjectIndexView() {
        initComponents();
        this.setLocationRelativeTo(null);
    }
    
    public void setWelcomeMessage(String message) {
        this.welcomeLabel.setText(message);
    }
    
    public void setProjectsTableData(SetOfProjects projects) {
        String[] headers = new String[]{ "Title", "Creation date", "Manager", "Coordinator" };
        String[] properties = new String[]{ "Title", "CreationDate", "Manager", "Coordinator" };
        
        EventList projectsEventList = GlazedLists.eventList(projects);
        TableFormat projectsTableFormat = GlazedLists.tableFormat(Project.class, properties, headers);
        DefaultEventTableModel projectsTableModel = new DefaultEventTableModel(projectsEventList, projectsTableFormat);
        
        this.projectsTable.setModel(projectsTableModel);
    }
    
    public void addNewProjectButtonActionListener(ActionListener listener) {
        newProjectButton.addActionListener(listener);
    }
    
    public void addNewTaskButtonActionListener(ActionListener listener) {
        newTaskButton.addActionListener(listener);
    }
    
    public void addUserMenuLogOutActionListener(ActionListener listener) {
        userMenuLogOut.addActionListener(listener);
    }
    
    public void addApplicationMenuExitActionListener(ActionListener listener) {
        applicationMenuExit.addActionListener(listener);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        projectSplitPane = new javax.swing.JSplitPane();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        projectsTable = new javax.swing.JTable();
        projectToolbar = new javax.swing.JPanel();
        newProjectButton = new javax.swing.JButton();
        newTaskButton = new javax.swing.JButton();
        welcomeLabel = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        projectMenuBar = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        applicationMenuExit = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        userMenuLogOut = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("MPPMS - Projects");

        projectSplitPane.setBorder(null);
        projectSplitPane.setDividerLocation(300);

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 671, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 413, Short.MAX_VALUE)
                .addContainerGap())
        );

        projectSplitPane.setRightComponent(jPanel2);

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        projectsTable.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane3.setViewportView(projectsTable);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 276, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 413, Short.MAX_VALUE)
                .addContainerGap())
        );

        projectSplitPane.setLeftComponent(jPanel1);

        projectToolbar.setBackground(new java.awt.Color(220, 220, 220));
        projectToolbar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        newProjectButton.setText("New Project");

        newTaskButton.setText("New Task");

        javax.swing.GroupLayout projectToolbarLayout = new javax.swing.GroupLayout(projectToolbar);
        projectToolbar.setLayout(projectToolbarLayout);
        projectToolbarLayout.setHorizontalGroup(
            projectToolbarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(projectToolbarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(newProjectButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(newTaskButton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        projectToolbarLayout.setVerticalGroup(
            projectToolbarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, projectToolbarLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(projectToolbarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(newProjectButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(newTaskButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        welcomeLabel.setText("jLabel1");
        welcomeLabel.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLabel1.setText("Select a project or click the 'New project' button.");
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        projectMenuBar.setBackground(new java.awt.Color(204, 204, 255));
        projectMenuBar.setBorder(null);

        jMenu1.setText("Application");

        applicationMenuExit.setText("Exit");
        jMenu1.add(applicationMenuExit);

        projectMenuBar.add(jMenu1);

        jMenu2.setText("User");

        userMenuLogOut.setText("Log Out");
        jMenu2.add(userMenuLogOut);

        projectMenuBar.add(jMenu2);

        setJMenuBar(projectMenuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(projectSplitPane)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(projectToolbar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(welcomeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(welcomeLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel1)
                        .addGap(16, 16, 16))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(projectToolbar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(projectSplitPane, javax.swing.GroupLayout.PREFERRED_SIZE, 439, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem applicationMenuExit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JButton newProjectButton;
    private javax.swing.JButton newTaskButton;
    private javax.swing.JMenuBar projectMenuBar;
    private javax.swing.JSplitPane projectSplitPane;
    private javax.swing.JPanel projectToolbar;
    private javax.swing.JTable projectsTable;
    private javax.swing.JMenuItem userMenuLogOut;
    private javax.swing.JLabel welcomeLabel;
    // End of variables declaration//GEN-END:variables
}
