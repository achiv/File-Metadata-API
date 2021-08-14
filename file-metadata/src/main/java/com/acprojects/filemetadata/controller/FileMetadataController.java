package com.acprojects.filemetadata.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.acprojects.filemetadata.model.FileMetadata;
import com.acprojects.filemetadata.service.FileMetadataService;


@RestController
public class FileMetadataController {

    @Autowired
    private FileMetadataService fileMetadataService;

    @PostMapping("/upload")
    public FileMetadata uploadFile(@RequestParam("upfile") MultipartFile upfile) {
        return fileMetadataService.upload(upfile);
    }
    
}
