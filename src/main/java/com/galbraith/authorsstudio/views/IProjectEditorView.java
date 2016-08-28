package com.galbraith.authorsstudio.views;

import com.galbraith.authorsstudio.models.IChapter;
import com.galbraith.authorsstudio.models.INote;
import java.util.ArrayList;

/**
 * An interface defining the public methods of any Project Editor Views.
 * 
 * @author Sean Galbraith
 */
public interface IProjectEditorView {

    // Getter Methods
    String getProjectTitle();
    String getProjectImagePath();
    String getAuthorName();
    String getSelectedChapterTitle();
    String getSelectedChapterSubtitle();
    String getSelectedChapterContent();
    String getSelectedNoteTitle();
    String getSelectedNoteContent();
    
    // Setter Methods
    void setProjectTitle(String title);
    void setProjectImage(String path);
    void setAuthorName(String authorName);
    void setChapterNamesList(ArrayList<IChapter> chaptersList);
    void setNotesList(ArrayList<INote> notesList);
    void setChapterNotesList(ArrayList<INote> notesList);
    void setSelectedChapterTitle(String title);
    void setSelectedChapterSubtitle(String subtitle);
    void setSelectedChapterContent(String content);
    void setSelectedNoteTitle(String title);
    void setSelectedNoteContent(String content);
    
    /**
     * Shows the Projects Sidebar to the user.
     */
    void showProjectSiderbar();
    
    /**
     * Hides the Projects Sidebar from the user.
     */
    void hideProjectSidebar();
}
