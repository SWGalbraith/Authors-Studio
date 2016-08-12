package com.galbraith.authorsstudio.views;

import com.galbraith.authorsstudio.models.IProject;
import java.util.ArrayList;

/**
 *
 * @author Sean Galbraith
 */
public interface IMainMenuView {

    String getSelectedProjectName();
    void setProjectsList(ArrayList<IProject> projectsList);
    String getFilepathFromDialog();
}
