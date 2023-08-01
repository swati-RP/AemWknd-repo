package com.adobe.aem.guides.wknd.core.models;

import java.util.List;

import com.adobe.aem.guides.wknd.core.models.dto.authorbooks.AuthorsCollection;

public interface AuthorBooks {

    List<AuthorsCollection> getAuthorsCollection();
    
}
