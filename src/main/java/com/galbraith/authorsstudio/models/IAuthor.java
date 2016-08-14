package com.galbraith.authorsstudio.models;

import java.util.ArrayList;

/**
 * An interface defining the methods of Author objects.
 * 
 * @author Sean Galbraith
 */
public interface IAuthor {

    /**
     * Gets the stored name of the author.
     * 
     * @return The name of the author.
     */
    String getName();
    
    /**
     * Gets the stored address of the author.
     * 
     * @return An object containing the address details of the author.
     */
    IAddress getAddress();
    
    /**
     * Gets the stored email address of the author.
     * 
     * @return The email address of the author.
     */
    String getEmailAddress();
    
    /**
     * Gets a list of the author's stored contact numbers.
     * 
     * @return A list of contact numbers.
     */
    ArrayList<String> getContactNumbersList();
    
    /**
     * Gets a list of projects associated with this author.
     * 
     * @return A list of project objects containing details of this author's projects.
     */
    ArrayList<IProject> getAssociatedProjectsList();
    
    /**
     * Sets the name of this author.
     * 
     * @param name The name of the author.
     */
    void setName(String name);
    
    /**
     * Sets the address of this author.
     * 
     * @param address An object containing details of this author's address.
     */
    void setAddress(IAddress address);
    
    /**
     * Sets the email address of this author.
     * 
     * @param emailAddress The email address of the author.
     */
    void setEmailAddress(String emailAddress);
    
    /**
     * Sets a list of contact numbers for this author.
     * 
     * @param contactNumbersList A list containing the author's contact numbers.
     */
    void setContactNumbersList(ArrayList<String> contactNumbersList);
}
