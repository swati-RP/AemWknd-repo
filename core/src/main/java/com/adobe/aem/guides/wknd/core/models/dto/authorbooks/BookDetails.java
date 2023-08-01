package com.adobe.aem.guides.wknd.core.models.dto.authorbooks;

public class BookDetails {

    private String bookName;
    private String subjectName;
    private String published;

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }
    public String getBookName() {
        return bookName;
    }
    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName;
    }
    public String getSubjectName() {
        return subjectName;
    }
    public void setPublished(String published) {
        this.published = published;
    }
    public String getPublished() {
        return published;
    }


    
}
