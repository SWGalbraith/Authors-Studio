package com.galbraith.authorsstudio.views;

import java.util.List;

/**
 * An interface defining the public methods of any Project Editor Views.
 * 
 * @author Sean Galbraith
 */
public interface IProjectEditorView {

    /**
     * Gets the title of the current project.
     * 
     * @return The title of the current project.
     */
    String getProjectTitle();
    
    /**
     * Gets the path of the current project image.
     * 
     * @return The path of the currently selected project image.
     */
    String getProjectImagePath();
    
    /**
     * Gets the name of the author of the current project.
     * 
     * @return 
     */
    String getAuthor();
    
    /**
     * Gets the title of the currently selected chapter.
     * 
     * @return The title of the selected chapter.
     */
    String getSelectedChapterTitle();
    
    /**
     * Gets the subtitle of the currently selected chapter.
     * 
     * @return The subtitle of the selected chapter.
     */
    String getSelectedChapterSubtitle();
    
    /**
     * Gets the text content of the currently selected chapter.
     * 
     * @return The content of the selected chapter.
     */
    String getSelectedChapterContent();
    
    /**
     * Gets the title of the currently selected note.
     * 
     * @return The title of the selected note.
     */
    String getSelectedNoteTitle();
    
    /**
     * Gets the text content of the currently selected note.
     * 
     * @return The content of the selected note.
     */
    String getSelectedNoteContent();
    
    /**
     * Sets the title of the current project.
     * 
     * @param title The title to give to the current project.
     */
    void setProjectTitle(String title);
    
    /**
     * Sets the visible image for the current project.
     * 
     * @param path The path of the image to display.
     */
    void setProjectImage(String path);
    
    /**
     * Sets the visible name of the author for the current project.
     * 
     * @param authorName The author name to display the name of.
     */
    void setAuthorName(String authorName);
    
    /**
     * Sets the list of visible chapter names for the current project.
     * 
     * @param chaptersList The list of chapter names to display names of.
     */
    void setChapterNamesList(List<String> chaptersList);
    
    /**
     * Sets the list of visible note titles for the current project.
     * 
     * @param notesList The list of note titles to display at project level.
     */
    void setNotesList(List<String> notesList);
    
    /**
     * Sets the list of visible note titles for the current chapter.
     * 
     * @param notesList The list of note titles to display at chapter level.
     */
    void setChapterNotesList(List<String> notesList);
    
    /**
     * Sets the title of the selected chapter.
     * 
     * @param title The title to give to the selected chapter.
     */
    void setSelectedChapterTitle(String title);
    
    /**
     * Sets the subtitle of the selected chapter.
     * 
     * @param subtitle The subtitle to give to the selected chapter.
     */
    void setSelectedChapterSubtitle(String subtitle);
    
    /**
     * Sets the content of the selected chapter.
     * 
     * @param content The text content of the selected chapter.
     */
    void setSelectedChapterContent(String content);
    
    /**
     * Sets the title of the selected note.
     * 
     * @param title The title to give to the selected note.
     */
    void setSelectedNoteTitle(String title);
    
    /**
     * Sets the content in the selected note.
     * 
     * @param content The text content to set in the selected note.
     */
    void setSelectedNoteContent(String content);
    
    /**
     * Shows the Projects Sidebar to the user.
     */
    void showProjectSidebar();
    
    /**
     * Hides the Projects Sidebar from the user.
     */
    void hideProjectSidebar();
    
    /**
     * Shows the Note Editor to the user.
     */
    void showNoteEditor();
    
    /**
     * Shows the Chapter Editor to the user.
     */
    void showChapterEditor();
    
    /**
     * Hides all input editors from the user.
     */
    void hideInputWindow();
}
