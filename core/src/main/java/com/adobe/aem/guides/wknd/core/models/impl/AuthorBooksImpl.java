package com.adobe.aem.guides.wknd.core.models.impl;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.annotation.PostConstruct;

import org.apache.sling.api.SlingHttpServletRequest;
import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.SlingObject;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;

import com.adobe.aem.guides.wknd.core.models.AuthorBooks;
import com.adobe.aem.guides.wknd.core.models.dto.authorbooks.AuthorsCollection;
import com.adobe.aem.guides.wknd.core.models.dto.authorbooks.BookDetails;

@Model(adaptables = SlingHttpServletRequest.class,
       adapters = AuthorBooks.class,
       defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL,
       resourceType = AuthorBooksImpl.RSOURCE_TYPE
         )
public class AuthorBooksImpl implements AuthorBooks{

    protected static final String RSOURCE_TYPE = "wknd/components/authorbooks";

    @SlingObject
    Resource componentResource;

    @ValueMapValue
    List<AuthorsCollection> authorsCollections;

    @PostConstruct
    void init(){

        authorsCollections = new ArrayList<>();

        Resource res = componentResource.getChild("authorsCollections");

        if (null != res && res.hasChildren()) {

            Iterator<Resource> detail = res.listChildren();

            while (detail.hasNext()) {
                Resource author = detail.next();

                AuthorsCollection  authors = new AuthorsCollection();
                
                 authors.setAuthorName(author.getValueMap().get("authorName", String.class));

                // Resource bookres = res.getChild("bookDetails");

                // if (null != bookres && bookres.hasChildren()) {
                        
                //     Iterator<Resource> bdetail = bookres.listChildren();

                //     while (bdetail.hasNext()) {
                //         Resource books = bdetail.next();

                //         BookDetails booksdetail = new BookDetails();

                //         booksdetail.setBookName(books.getValueMap().get("bookName", String.class));
                //         booksdetail.setSubjectName(books.getValueMap().get("subjectName", String.class));
                //         booksdetail.setPublished(books.getValueMap().get("published", String.class));

                //     }

                // }

                authorsCollections.add(authors);
            }
        }

    }

    @Override
    public List<AuthorsCollection> getAuthorsCollection() {
        
        return authorsCollections;
    }
    
}
