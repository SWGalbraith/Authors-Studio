package com.galbraith.authorsstudio.views;

import java.util.ArrayList;

/**
 * An interface defining the public methods of any Data Editor Views.
 * 
 * @author Sean Galbraith
 */
public interface IDataEditorView {

    // Getter Methods
    String getProjectTitle();
    String getProjectImagePath();
    String getAuthorName();
    String getAuthorEmail();
    String getAuthorAddress();
    ArrayList<String> getAuthorContactNumbersList();
    
    // Setter Methods
    void setProjectTitle(String title);
    void setProjectImage(String path);
    void setAuthorName(String name);
    void setAuthorEmail(String emailAddress);
    void setAuthorAddress(String address);
    void setAuthorContactNumbersList(ArrayList<String> contactNumbersList);
}
