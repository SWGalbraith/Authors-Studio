package com.galbraith.authorsstudio.models;

/**
 * An interface defining the methods of Note objects.
 * 
 * @author Sean Galbraith
 */
public interface INote {

    /**
     * Gets the title of this note.
     * 
     * @return The title of the note.
     */
    String getTitle();
    
    /**
     * Gets the content of this note.
     * 
     * @return The content of the note.
     */
    String getContent();
    
    /**
     * Gets the Project that this note is a member of.
     * 
     * @return An object representing the parent Project.
     */
    IProject getParentProject();
    
    /**
     * Gets the Chapter, if any, that this note is a member of.
     * 
     * @return An object representing the parent Chapter if there is one, 
     * and null if not.
     */
    IChapter getParentChapter();
    
    /**
     * Sets the title of this note.
     * 
     * @param title The title of the note.
     */
    void setTitle(String title);
    
    /**
     * Sets the content of this note.
     * 
     * @param content The content of the note.
     */
    void setContent(String content);
}
