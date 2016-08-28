package com.galbraith.authorsstudio.views;

import java.util.List;

/**
 * An interface defining the public methods of any Data Editor Views.
 * 
 * @author Sean Galbraith
 */
public interface IDataEditorView {

    /**
     * Gets the title of the project displayed in the editor.
     * 
     * @return The title of the project in the editor.
     */
    String getProjectTitle();
    
    /**
     * Gets the path of the image displayed in the editor.
     * 
     * @return The path to the currently displayed image, or null if there is 
     * no image.
     */
    String getProjectImagePath();
    
    /**
     * Gets the name of the author in the editor window.
     * 
     * @return The name of the author in the editor.
     */
    String getAuthorName();
    
    /**
     * Gets the email address of the author in the editor window.
     * 
     * @return The email address of the author in the editor.
     */
    String getAuthorEmailAddress();
    
    /**
     * Gets the address of the author in the editor window.
     * 
     * @return The address of the author in the editor.
     */
    String getAuthorAddress();
    
    /**
     * Gets the list of contact numbers in the editor window.
     * 
     * @return The list of contact numbers in the editor.
     */
    List<String> getAuthorContactNumbersList();
    
    /**
     * Sets the title of the project to display.
     * 
     * @param title The project's title to display.
     */
    void setProjectTitle(String title);
    
    /**
     * Sets the project image to display.
     * 
     * @param path The path to the image to display.
     */
    void setProjectImage(String path);
    
    /**
     * Sets the name of the author to display.
     * 
     * @param name The author's name to display.
     */
    void setAuthorName(String name);
    
    /**
     * Sets the email address of the author to display.
     * 
     * @param emailAddress The author's email address to display.
     */
    void setAuthorEmailAddress(String emailAddress);
    
    /**
     * Sets the address of the author to display.
     * 
     * @param address The author's address to display.
     */
    void setAuthorAddress(String address);
    
    /**
     * Sets the list of contact numbers to display.
     * 
     * @param contactNumbersList A list of contact numbers to display.
     */
    void setAuthorContactNumbersList(List<String> contactNumbersList);
}
