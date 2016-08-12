package com.galbraith.authorsstudio.models;

import java.util.ArrayList;

/**
 *
 * @author Sean Galbraith
 */
public interface IChapter {

    // Getter Methods
    int getIndex();
    String getTitle();
    String getSubtitle();
    String getContent();
    String getWordCount();
    IAuthor getAuthor();
    IProject getParentProject();
    ArrayList<INote> getChapterNotesList();
    
    // Setter Methods
    void setIndex(int index);
    void setTitle(String title);
    void setSubtitle(String subtitle);
    void setContent(String content);
    void setAuthor(IAuthor author);
    
    // Note Methods
    void addChapterNote(INote note);
    void editChapterNote(INote note);
    void deleteChapterNote(INote note);
    void deleteChapterNote(String noteTitle);
}
