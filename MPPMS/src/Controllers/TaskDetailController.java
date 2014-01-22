package Controllers;

import Models.Asset;
import Models.SetOfAssets;
import Models.SetOfComponents;
import Models.SetOfTasks;
import Models.SetOfUsers;
import Models.Task;
import Models.User;
import Views.TaskDetailView;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Collection;
import javax.swing.DefaultComboBoxModel;

public class TaskDetailController {
    private final TaskDetailView view;
    
    private Task task;
    private boolean isNew;
    
    private ModelChoiceController modelChoiceController;
    
    public TaskDetailController(TaskDetailView view, Task task) {
        this.view = view;
        this.task = task;
        this.isNew = this.task.getId() < 1;
    }
    
    public void initialise() {
        refreshView();
        
        this.view.setEditMode(this.isNew);
        
        this.view.addAssignedToChoiceActionListener(new AssignedToChoiceActionListener());
        this.view.addAssetChoiceActionListener(new AssetChoiceActionListener());
        this.view.addAssetEditActionListener(new AssetEditActionListener());
        this.view.addSaveButtonActionListener(new SaveButtonActionListener());
        this.view.addEditButtonActionListener(new EditButtonActionListener());
        if (!this.isNew) {
            this.view.addDiscardButtonActionListener(new DiscardButtonActionListener());
        }
    }
    
    private void refreshView() {
        view.setIdLabelText("ID: " + task.getId());
        view.setTitleText(task.getTitle());
        view.setStatus(Task.Status.values(), task.getStatus());
        view.setPriority(Task.Priority.values(), task.getPriority());
        view.setReportText((task.getReport().getId() < 1 ? "Blank report" : task.getReport().toString()));
        view.setAssignedTo(task.getAssignedTo().toArray());
        view.setAssets(task.getAssets().toArray());
    }
    
    class SaveButtonActionListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            view.setEditMode(false);
            isNew = false;
        }        
    }
    
    class DiscardButtonActionListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            view.setEditMode(false);
            refreshView();
        }        
    }
    
    class EditButtonActionListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {   
            view.setEditMode(true);
        }        
    }
    
    class AssignedToChoiceActionListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent ae) {
            modelChoiceController = new ModelChoiceController(User.getAllUsers(), task.getAssignedTo());
            modelChoiceController.addSaveButtonActionListener(new ModelChoiceAssignedToSaveActionListener());
            modelChoiceController.launch();
        }        
    }
    
    class AssetChoiceActionListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent ae) {
            modelChoiceController = new ModelChoiceController(Asset.getAllAssets(), task.getAssets());
            modelChoiceController.addSaveButtonActionListener(new ModelChoiceAssetsSaveActionListener());
            modelChoiceController.launch();
        }
    }
    
    class AssetEditActionListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent ae) {
            
        }
    }
    
    class ModelChoiceAssignedToSaveActionListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent ae) {
            SetOfUsers users = new SetOfUsers();
            users.addAll((Collection)modelChoiceController.getChosenModels());                    
            modelChoiceController.closeView();                    
            task.setAssignedTo(users);
            view.setAssignedTo(users.toArray());
        }        
    }
    
    class ModelChoiceAssetsSaveActionListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent ae) {
            SetOfAssets assets = new SetOfAssets();
            assets.addAll((Collection)modelChoiceController.getChosenModels());                    
            modelChoiceController.closeView();                    
            task.setAssets(assets);
            view.setAssets(assets.toArray());
        }        
    }
}
