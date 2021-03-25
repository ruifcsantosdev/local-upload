package com.ruifcsantosdev.localupload.services;

import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

@Service
public class FileUploadService {

    public void initializeDir() {
        try {
            Files.createDirectory(Paths.get("uploads"));
        } catch (IOException ex) {
            ex.getMessage();
        }
    }

    public void saveFile(MultipartFile file) {
        try {
            final Path saveFile = Paths.get("uploads").resolve(file.getOriginalFilename());
            Files.copy(file.getInputStream(), saveFile);
        } catch (Exception ex) {
            ex.getMessage();
        }
    }
}
