package com.galbraith.authorsstudio.models;

/**
 *
 * @author Sean Galbraith
 */
public interface INote {

    // Getter Methods
    String getTitle();
    String getContent();
    IProject getParentProject();
    IChapter getParentChapter();
    
    // Setter Methods
    void setTitle(String title);
    void setContent(String content);
}
