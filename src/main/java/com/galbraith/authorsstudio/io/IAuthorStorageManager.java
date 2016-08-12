package com.galbraith.authorsstudio.io;

import com.galbraith.authorsstudio.models.IAuthor;
import java.nio.file.Files;
import java.util.ArrayList;

/**
 *
 * @author Sean Galbraith
 */
public interface IAuthorStorageManager {

    /**
     * Adds a new Author and their details to the Authors Storage File.
     * 
     * @param author 
     */
    void addAuthor(IAuthor author);
    
    /**
     * Updates an existing Author's entry in the Authors Storage File.
     * 
     * @param author 
     */
    void updateAuthor(IAuthor author);
    
    /**
     * Deletes an existing Author's entry from the Authors Storage File.
     * 
     * @param author 
     */
    void deleteAuthor(IAuthor author);
    
    /**
     * Creates the Authors Storage File.
     */
    void createAuthorsStorageFile();
    
    /**
     * Checks whether or not the Authors Storage File already exists.
     * 
     * @return Boolean indicating whether or not the Authors Storage File exists.
     */
    boolean doesAuthorsStorageFileExist();
    
    /**
     * Gets a list of all Authors stored in the Authors Storage File.
     * 
     * @return A List of Authors.
     */
    ArrayList<IAuthor> getStoredAuthorsList();
    
    /**
     * Imports Author details to the main Authors Storage File from an external 
     * Authors Storage File.
     * 
     * @param authorsStorageFile The external Authors Storage File to import from.
     */
    void importAuthorsFromStorageFile(Files authorsStorageFile);
}
