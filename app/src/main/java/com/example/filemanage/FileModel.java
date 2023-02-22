package com.example.filemanage;

import java.io.File;
import java.io.Serializable;

public class FileModel implements Serializable {
    private String name;
    private String icon;
    private File path;
    private FileModelType fileModelType;

    public FileModel(String name, String icon, File path) {
        this.name = name;
        this.icon = icon;
        this.path = path;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public File getPath() {
        return path;
    }

    public void setPath(File path) {
        this.path = path;
    }

    public FileModelType getFileModelType() {
        return fileModelType;
    }

    public void setFileModelType(FileModelType fileModelType) {
        this.fileModelType = fileModelType;
    }
}
