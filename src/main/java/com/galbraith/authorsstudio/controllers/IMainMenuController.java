package com.galbraith.authorsstudio.controllers;

/**
 * An interface defining the public methods of Controller objects relating to 
 * the Main Menu View.
 * 
 * @author Sean Galbraith
 */
public interface IMainMenuController {

    /**
     * Opens a Project chosen in the Main Menu View.
     */
    void openProject();
    
    /**
     * Adds a new Project.
     */
    void addProject();
    
    /**
     * Edits an existing Project's details.
     */
    void editProject();
    
    /**
     * Deletes an existing Project's details.
     */
    void deleteProject();
    
    /**
     * Exits the application.
     */
    void exit();
}
