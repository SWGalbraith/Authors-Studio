package com.galbraith.authorsstudio.models;

import java.util.ArrayList;

/**
 *
 * @author Sean Galbraith
 */
public interface IAuthor {

    // Getter Methods
    String getName();
    String getAddress();
    String getEmailAddress();
    ArrayList<String> getContactNumbersList();
    ArrayList<IProject> getAssociatedProjectsList();
    
    // Setter Methods
    void setName(String name);
    void setAddress(String address);
    void setEmailAddress(String emailAddress);
    void setContactNumbersList(ArrayList<String> contactNumbersList);
}
