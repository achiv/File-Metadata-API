package com.acprojects.filemetadata.service;

import com.acprojects.filemetadata.model.FileMetadata;

import org.springframework.web.multipart.MultipartFile;

public interface FileMetadataService {

    public FileMetadata upload(MultipartFile upfile);
    
}
