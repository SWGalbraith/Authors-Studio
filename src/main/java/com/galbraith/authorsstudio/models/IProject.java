package com.galbraith.authorsstudio.models;

import java.nio.file.Files;
import java.util.ArrayList;
import java.util.Date;

/**
 * An interface defining the methods of Project objects.
 * 
 * @author Sean Galbraith
 */
public interface IProject {

    /**
     * Gets the title of this Project.
     * 
     * @return The title of the Project.
     */
    String getTitle();
    
    /**
     * Gets the path to this Project's cover image.
     * 
     * @return The path to the cover image.
     */
    String getImagePath();
    
    /**
     * Gets a Files object representing this Project's content file.
     * 
     * @return A Files object representing the disk content of the project.
     */
    Files getProjectFile();
    
    /**
     * Gets the creation date of this Project.
     * 
     * @return A Date object with details of the Project's creation date.
     */
    Date getCreationDate();
    
    /**
     * Gets the deadline date for completion of this Project, if there is one.
     * 
     * @return The deadline date of the Project, or null if there isn't one.
     */
    Date getProjectDeadline();
    
    /**
     * Gets the author of this project.
     * 
     * @return An object representing all the details of the author of the Project.
     */
    IAuthor getAuthor();
    
    /**
     * Gets a list of chapters contained within this Project.
     * 
     * @return A List of objects representing the details of chapters, 
     * or null if there aren't any yet.
     */
    ArrayList<IChapter> getChaptersList();
    
    /**
     * Gets a list of notes contained within this Project.
     * 
     * @return A List of objects representing the details of notes, 
     * or null if there aren't any yet.
     */
    ArrayList<INote> getNotesList();
    
    /**
     * Sets the title of this Project.
     * 
     * @param title The title of the Project.
     */
    void setTitle(String title);
    
    /**
     * Sets the path to the cover image of this Project.
     * 
     * @param path The path of the cover image.
     */
    void setImagePath(String path);
    
    /**
     * Sets the file on disk containing saved details for this Project.
     * 
     * @param projectFile The file containing saved Project details.
     */
    void setProjectFile(Files projectFile);
    
    /**
     * Sets the deadline date for completion of this Project.
     * 
     * @param deadlineDate The date targeted for completion of the Project.
     */
    void setProjectDeadline(Date deadlineDate);
    
    /**
     * Sets the author of this Project.
     * 
     * @param author The author of the Project.
     */
    void setAuthor(IAuthor author);
}
