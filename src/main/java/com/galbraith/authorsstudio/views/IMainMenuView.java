package com.galbraith.authorsstudio.views;

import com.galbraith.authorsstudio.models.IProject;
import java.util.ArrayList;

/**
 * An interface defining the public methods of any Main Menu Views.
 * 
 * @author Sean Galbraith
 */
public interface IMainMenuView {

    /**
     * Gets the name of the currently selected Project.
     * 
     * @return The name of the selected Project, or null if none are selected.
     */
    String getSelectedProjectName();
    
    /**
     * Sets the list of Projects that is displayed on-screen.
     * 
     * @param projectsList The list of Projects to display.
     */
    void setProjectsList(ArrayList<IProject> projectsList);
    
    /**
     * Gets a filepath from the user using a pop-up dialog.
     * 
     * @return The filepath entered by the user, or null if they cancelled the operation.
     */
    String getFilepathFromDialog();
}
