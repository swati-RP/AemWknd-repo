package com.adobe.aem.guides.wknd.core.models.impl;


import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.annotation.PostConstruct;
import org.apache.sling.api.resource.Resource;
import javax.inject.Named;

import org.apache.sling.api.SlingHttpServletRequest;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.ChildResource;
import org.apache.sling.models.annotations.injectorspecific.Self;
import org.apache.sling.models.annotations.injectorspecific.SlingObject;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;
import com.adobe.aem.guides.wknd.core.models.Myslider;
import org.apache.commons.lang3.StringUtils;

@Model(
     adaptables = { SlingHttpServletRequest.class },
     adapters = { Myslider.class }, 
     resourceType = {MysliderImpl.RESOURCE_TYPE },
     defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)

public class MysliderImpl implements Myslider{

    protected static final String RESOURCE_TYPE = "wknd/components/myslider";

    @Self
    private SlingHttpServletRequest request;

    @SlingObject
    Resource componentResource;

    @ChildResource
    @Named("feature")
    private Resource featureResource;

    private List<String> feature;

    @ValueMapValue
    private String image;
    

    @Override
        public boolean isEmpty() {

            return StringUtils.isBlank((CharSequence) feature);


    }

    @PostConstruct
    protected void init() {
        if (featureResource != null) {
            feature = new ArrayList<>();
            for (Resource child : featureResource.getChildren()) {
                feature.add(child.getValueMap().get("image", String.class));
                

            }
        }

    }

    @Override
    public List<String> getFeature() {
        return feature;
    }

    

    

    
}




    

