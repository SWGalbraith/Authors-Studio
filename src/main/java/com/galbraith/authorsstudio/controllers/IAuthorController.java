package com.galbraith.authorsstudio.controllers;

/**
 * An interface defining the public methods of Controller objects relating to 
 * any views involving authors.
 * 
 * @author Sean Galbraith
 */
public interface IAuthorController {

    /**
     * Adds a new author's details.
     */
    void addAuthor();
    
    /**
     * Edits an existing author's details.
     */
    void editAuthor();
    
    /**
     * Deletes an author's details.
     */
    void deleteAuthor();
}
