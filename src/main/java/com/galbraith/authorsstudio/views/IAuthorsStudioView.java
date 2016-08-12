package com.galbraith.authorsstudio.views;

/**
 *
 * @author Sean Galbraith
 */
public interface IAuthorsStudioView {

    void showMessage(String message);
    void showDataEditor(EditorType editorType, EditorActionType actionType);
    boolean confirmUserAction();
}
