package com.acprojects.filemetadata.service;

import com.acprojects.filemetadata.model.FileMetadata;

import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

@Service
public class FileMetadataServiceImpl implements FileMetadataService {

    @Override
    public FileMetadata upload(MultipartFile upfile) {
        String name=upfile.getOriginalFilename();
        String type=upfile.getContentType();
        String size=Long.toString(upfile.getSize());

        return new FileMetadata(name, type, size);
    }
    
}
