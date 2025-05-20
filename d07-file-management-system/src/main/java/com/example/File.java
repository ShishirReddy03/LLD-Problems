package com.example;

public class File extends Item{

    private String content;
    public File(String name, Folder parent) {
        super(name, parent, true);
        content = "";
    }

    public String setContent(String content) {
        this.content = content;
        return content;
    }

    public String getContent() {
        return content;
    }

    public String addContent(String newContent) {
        this.content = this.content + newContent;
        return this.content;
    }
    
}
