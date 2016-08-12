package com.galbraith.authorsstudio.io;

/**
 *
 * @author Sean Galbraith
 */
public interface IFileConverterFactory {

    /**
     * Gets an IFileConverter object based on the enum value given.
     * 
     * @param conversionType A value representing the type of converter to return.
     * @return An IFileConverter object of the type specified by the FileConversionType.
     */
    IFileConverter getFileConverter(FileConversionType conversionType);
}
