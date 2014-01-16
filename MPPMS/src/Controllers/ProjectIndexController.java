package Controllers;

import Models.Project;
import Models.User;
import Views.ProjectIndexView;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ProjectIndexController {
    ProjectIndexView view = new ProjectIndexView();
    
    private final User currentUser;
    
    public ProjectIndexController(User currentUser) {
        this.currentUser = currentUser;
        
        this.view.setWelcomeMessage("Welcome, " + currentUser.getName() + "!");
        this.view.setProjectsTableData(Project.getProjectsForUser(currentUser));
    }
    
    public void launch() {
        this.view.setVisible(true);
        
        this.view.addNewProjectButtonActionListener(new NewProjectButtonActionListener());
        this.view.addNewTaskButtonActionListener(new NewTaskButtonActionListener());
        this.view.addUserMenuLogOutActionListener(new UserMenuLogOutActionListener());
        this.view.addApplicationMenuExitActionListener(new ApplicationMenuExitActionListener());
    }
    
    class NewProjectButtonActionListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            // New Project Happens
        }
    }
    
    class NewTaskButtonActionListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            // New Task Happens
        }
    }
    
    class ApplicationMenuExitActionListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            System.exit(0);
        }
    }
    
    class UserMenuLogOutActionListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            System.out.println(e.getSource());
            view.dispose();
            for (Frame frame : Frame.getFrames()) {
                if (frame.getTitle().equals("MPPMS - Login")) {
                    frame.setState(Frame.NORMAL);
                }
            }
        }
    }
}
