package com.galbraith.authorsstudio.io;

import com.galbraith.authorsstudio.models.IProject;
import java.nio.file.Files;

/**
 * An interface defining the public methods of FileConverter objects.
 *
 * @author Sean Galbraith
 */
public interface IFileConverter {

    /**
     * Converts the Information in the given project to a specific file format.
     * 
     * @param project The project to be converted.
     * @return A Files object representing the converted file.
     */
    Files convertProject(IProject project);
}
