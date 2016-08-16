package com.galbraith.authorsstudio.controllers;

/**
 * An interface defining the public methods of Controller objects relating to 
 * the Project Editor View.
 * 
 * @author Sean Galbraith
 */
public interface IProjectEditorController {

    /**
     * Saves the details of the currently open Project.
     */
    void saveProject();
    
    /**
     * Closes the open Project and exits the Project Editor View.
     */
    void closeProject();
}
