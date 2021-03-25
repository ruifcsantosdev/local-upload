package com.ruifcsantosdev.localupload;

import com.ruifcsantosdev.localupload.services.FileUploadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LocalUploadApplication implements CommandLineRunner {

    @Autowired
    private FileUploadService fileUploadService;


    public static void main(String[] args) {
        SpringApplication.run(LocalUploadApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        this.fileUploadService.initializeDir();
    }
}
