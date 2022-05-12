package academy.mindswap.advancedjava.streams11

import java.io.*;
import java.nio.file.Files;
import java.nio.file.InvalidPathException;
import java.nio.file.Path;

public class DirectoryAnalyser {

    private BufferedReader bufferedReader;


    public static void main(String[] args) {
        DirectoryAnalyser directoryAnalyser = new DirectoryAnalyser();

        //directoryAnalyser.listAndWriteFilesFromDirectory();
        directoryAnalyser.searchFileInDirectory();
    }

    public DirectoryAnalyser() {
        this.bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    }


    public String askUserInput(String message) {
        System.out.println(message);
        try {
            return bufferedReader.readLine();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }


    public void searchFileInDirectory() {
        String directory = askUserInput("Please chose a directory to list");
        if (!checkDirectoryExists(directory)) {
            System.out.println("Directory does not exist");
            searchFileInDirectory();
            return;
        }
        String fileToSearch = askUserInput("Please choose a filename to search");
        String[] files = listFilesFromDirectory(directory, fileToSearch);
        saveListToFile(files, "./filter.txt");

    }

    public void listAndWriteFilesFromDirectory() {
        String directory = askUserInput("Please chose a directory to list");
        if (!checkDirectoryExists(directory)) {
            System.out.println("Directory does not exist");
            listAndWriteFilesFromDirectory();
            return;
        }
        String file = "";
        while (!isPathValid(directory.concat("/").concat(file)) || file.equals("")) {
            file = askUserInput("Please choose a filename to store the result");
        }
        saveListToFile(listFilesFromDirectory(directory), directory.concat("/").concat(file));

    }

    public String[] listFilesFromDirectory(String directoryPath) {
        if (!isPathValid(directoryPath)) {
            return null;
        }
        return new File(directoryPath).list(); //representaçao da diretoria que Returns an array of strings naming the files
    }

    public String[] listFilesFromDirectory(String directoryPath, String filterBy) {
        if (!isPathValid(directoryPath)) {
            return null;
        }

        return new File(directoryPath).list(new FilenameFilter() {
            @Override
            public boolean accept(File dir, String name) {
                return name.toLowerCase().contains(filterBy.toLowerCase());
            }
        }); //representaçao da diretoria que Returns an array of strings naming the files
    }

    private void saveListToFile(String[] list, String path) {
        try {
            BufferedWriter fileWriter = new BufferedWriter(new FileWriter(path));
            for (String listedFile : list) {
                fileWriter.write(listedFile);
                fileWriter.newLine();
            }
            fileWriter.close();
            System.out.println("Your file is at  " + path);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private boolean isPathValid(String path) {
        try {
            Path of = Path.of(path);
            return true;
        } catch (InvalidPathException e) {
            return false;
        }
    }

    private boolean checkDirectoryExists(String directory) {
        try {
            Path of = Path.of(directory);
            return Files.exists(of) && Files.isDirectory(of);
        } catch (InvalidPathException e) {
            return false;
        }
    }
}

