package com.galbraith.authorsstudio.models;

import java.util.ArrayList;

/**
 * An interface defining the methods of Chapter objects.
 * 
 * @author Sean Galbraith
 */
public interface IChapter {

    /**
     * Gets the index number of this chapter.
     * 
     * @return The index number of the chapter.
     */
    int getIndex();
    
    /**
     * Gets the title of this chapter.
     * 
     * @return The title of the chapter.
     */
    String getTitle();
    
    /**
     * Gets the subtitle of this chapter.
     * 
     * @return The subtitle of the chapter.
     */
    String getSubtitle();
    
    /**
     * Gets the content of this chapter.
     * 
     * @return The content of the chapter.
     */
    String getContent();
    
    /**
     * Gets the current word count of this chapter's content.
     * 
     * @return The number of words in the chapter's content.
     */
    String getWordCount();
    
    /**
     * Gets the author of this chapter.
     * 
     * @return An object representing the details of the chapter's author.
     */
    IAuthor getAuthor();
    
    /**
     * Gets the Project that this chapter is part of.
     * 
     * @return An object representing the details of the parent Project.
     */
    IProject getParentProject();
    
    /**
     * Gets a list of notes associated with this chapter.
     * 
     * @return A list of objects containing details of notes associated with 
     * this chapter.
     */
    ArrayList<INote> getChapterNotesList();
    
    /**
     * Sets the index number of this chapter.
     * 
     * @param index The index number of the chapter.
     */
    void setIndex(int index);
    
    /**
     * Sets the title of this chapter.
     * 
     * @param title The title of the chapter.
     */
    void setTitle(String title);
    
    /**
     * Sets the subtitle of this chapter.
     * 
     * @param subtitle The subtitle of the chapter.
     */
    void setSubtitle(String subtitle);
    
    /**
     * Sets the content of this chapter.
     * 
     * @param content The content of the chapter.
     */
    void setContent(String content);
    
    /**
     * Adds a new note to this chapter.
     * 
     * @param note The new note to add.
     */
    void addChapterNote(INote note);
    
    /**
     * Edits an existing note associated with this chapter.
     * 
     * @param note The edited note.
     */
    void editChapterNote(INote note);
    
    /**
     * Deletes an existing note associated with this chapter.
     * 
     * @param note The note to delete.
     */
    void deleteChapterNote(INote note);
    
    /**
     * Deletes an existing note associated with this chapter.
     * 
     * @param noteTitle The title of the note to delete.
     */
    void deleteChapterNote(String noteTitle);
}
