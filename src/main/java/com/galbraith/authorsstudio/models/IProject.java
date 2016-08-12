package com.galbraith.authorsstudio.models;

import java.nio.file.Files;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Sean Galbraith
 */
public interface IProject {

    // Getter Methods
    String getTitle();
    String getImagePath();
    Files getProjectFile();
    Date getCreationDate();
    Date getProjectDeadline();
    IAuthor getAuthor();
    ArrayList<IChapter> getChaptersList();
    ArrayList<INote> getNotesList();
    
    // Setter Methods
    void setTitle(String title);
    void setImagePath(String path);
    void setProjectFile(Files projectFile);
    void setProjectDeadline(Date deadlineDate);
    void setAuthor(IAuthor author);
}
