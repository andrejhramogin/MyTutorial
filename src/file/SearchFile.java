package file;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class SearchFile {
    public static void main(String[] args) {

        File rootFile = new File("/home/andrei");
        ArrayList<File> fileList = new ArrayList<>();
        String fileName = "Hi.java";

        searchFileByFileName(rootFile, fileList, fileName);

        for (File file : fileList){
            System.out.println(file.getAbsolutePath());
        }
    }

    //Поиск файлов по расширению.

    public static void searchFilesByFilenameExtension(File rootFile, List<File> fileList) {
        if (rootFile.isDirectory()) {
            System.out.println("Searching at: " + rootFile.getAbsolutePath());
            File[] directoryFiles = rootFile.listFiles();
            if (directoryFiles != null) {
                for (File file : directoryFiles) {
                    if (file.isDirectory()) {
                        searchFilesByFilenameExtension(file, fileList);
                    } else {
                        if (file.getName().toLowerCase().endsWith(".jpg")) {
                            fileList.add(file);
                        }
                    }
                }
            }
        }
    }

    // Поиск файлов по имени файла.
    public static void searchFileByFileName(File rootFile, List<File> fileList, String fileName){
        if(rootFile.isDirectory()){
            File[] directoryFiles = rootFile.listFiles();
            if(directoryFiles!=null){
                for(File file : directoryFiles){
                    if(file.isDirectory()){
                        searchFileByFileName(file, fileList, fileName);
                    }else{
                        if (file.getName().equalsIgnoreCase(fileName)){
                            fileList.add(file);
                        }
                    }
                }
            }
        }
    }
}