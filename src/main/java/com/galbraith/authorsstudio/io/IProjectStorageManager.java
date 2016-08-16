package com.galbraith.authorsstudio.io;

import com.galbraith.authorsstudio.models.IProject;
import java.nio.file.Files;
import java.util.ArrayList;

/**
 * An interface defining the public methods of ProjectStorageManager objects.
 *
 * @author Sean Galbraith
 */
public interface IProjectStorageManager {

    /**
     * Save the given Project's details in the Projects Storage File and the 
     * default projects folder.
     * 
     * @param project The project containing the details to save.
     */
    void saveProject(IProject project);
    
    /**
     * Save the given Project's details in the Projects Storage File and a 
     * user-specified location.
     * 
     * @param project The project containing the details to save.
     * @param filepath The filepath to save the project to.
     */
    void saveProject(IProject project, String filepath);
    
    /**
     * Deletes a specified project from the Projects Storage File and wherever it
     * is saved on the file system.
     * 
     * @param project The project to delete.
     */
    void deleteProject(IProject project);
    
    /**
     * Gets all the projects stored in the Projects Storage File.
     * 
     * @return A list of the stored projects.
     */
    ArrayList<IProject> getStoredProjectsList();
    
    /**
     * Get a project with a title matching the given title.
     * 
     * @param projectTitle The title of the project to return.
     * @return The found project. If no project matches the given title, will
     * return null.
     */
    IProject getProject(String projectTitle);
    
    /**
     * Determines whether or not a project with the given title is already stored
     * in the Projects Storage File.
     * 
     * @param projectTitle The project title to check for.
     * @return A boolean indicating whether or not a project already exists with
     * the given title.
     */
    boolean doesProjectAlreadyExist(String projectTitle);
    
    /**
     * Creates the Projects Storage File.
     */
    void createProjectsStorageFile();
    
    /**
     * Determines whether or not the Projects Storage File already exists or not.
     * 
     * @return A boolean indicating whether not the the Projects Storage File 
     * already exists.
     */
    boolean doesProjectsStorageFileAlreadyExist();
    
    /**
     * Imports project details from an external Projects Storage File.
     * 
     * @param projectStorageFile The Projects Storage File to import project 
     * details from.
     */
    void importProjectsFromStorageFile(Files projectStorageFile);
}
