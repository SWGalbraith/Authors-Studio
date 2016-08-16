package com.galbraith.authorsstudio.controllers;

/**
 * An interface defining the public methods of Controller objects relating to 
 * Data Editor View.
 * 
 * @author Sean Galbraith
 */
public interface IDataEditorController {

    /**
     * Updates an existing Project's details.
     */
    void updateProject();
    
    /**
     * Cancels the edit operation.
     */
    void cancel();
    
    /**
     * Sets the Project image in the Data Editor View.
     */
    void setImage();
}
