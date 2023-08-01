package com.adobe.aem.guides.wknd.core.models.dto.authorbooks;

import java.util.List;

public class AuthorsCollection {
    private String authorName;

    List<BookDetails> bookDetails; 

    

    public List<BookDetails> getBookDetails() {
        return bookDetails;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }
    public String getAuthorName() {
        return authorName;
    }
}
