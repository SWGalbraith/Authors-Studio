package com.galbraith.authorsstudio.views;

/**
 * An interface defining the public methods of all views in the Author's Studio.
 * 
 * @author Sean Galbraith
 */
public interface IAuthorsStudioView {

    /**
     * Displays a pop-up message to the user.
     * 
     * @param message The message to display.
     */
    void showMessage(String message);
    
    /**
     * Opens the Data Editor View.
     * 
     * @param editorType The type of Data Editor to open.
     * @param actionType The type of action to be taken by the Data Editor.
     */
    void showDataEditor(EditorType editorType, EditorActionType actionType);
    
    /**
     * Prompts the user to confirm an action using a pup-up window.
     * 
     * @param message The message to display to the user when confirming an action.
     * @return A boolean indicating whether the user wants to proceed or not.
     */
    boolean doesUserWantToProceed(String message);
}
