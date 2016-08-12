package com.galbraith.authorsstudio.io;

/**
 *
 * @author Sean Galbraith
 */
public class FileConverterFactory implements IFileConverterFactory {

    // Private constructor to implement the Singleton Factory Pattern
    private FileConverterFactory() {}
    
    /**
     * Static method to return an instance of this singleton factory class.
     * 
     * @return A FileConverterFactory instance.
     */
    public static FileConverterFactory getInstance() {
        return new FileConverterFactory();
    }

    @Override
    public IFileConverter getFileConverter(FileConversionType conversionType) {
        
        IFileConverter fileConverter = null;
        
        switch (conversionType) {
            case Docx : 
                fileConverter = new DocxFileConverter();
                break;
            case Pages :
                fileConverter = new PagesFileConverter();
                break;
            case PDF : 
                fileConverter = new PdfFileConverter();
            default :
                break;
        }
        
        return fileConverter;
    }
    
}
