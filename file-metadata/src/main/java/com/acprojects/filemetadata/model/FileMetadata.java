package com.acprojects.filemetadata.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class FileMetadata {

    private String name;
    private String type;
    private String size;
    
}
