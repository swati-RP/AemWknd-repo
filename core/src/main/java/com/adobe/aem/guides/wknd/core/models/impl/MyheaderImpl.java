package com.adobe.aem.guides.wknd.core.models.impl;


import java.util.ArrayList;
import java.util.List;

import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.SlingObject;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.adobe.aem.guides.wknd.core.models.dto.SlideData;
import com.adobe.aem.guides.wknd.core.models.Myheader;


import javax.annotation.PostConstruct;
import org.apache.sling.api.resource.Resource;


import java.util.Iterator;

import org.apache.sling.api.SlingHttpServletRequest;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.injectorspecific.ChildResource;
import org.apache.sling.models.annotations.injectorspecific.Self;
import org.apache.commons.lang3.StringUtils;

@Model(
     adaptables = { SlingHttpServletRequest.class },
     adapters = { Myheader.class }, 
     resourceType = {MyheaderImpl.RESOURCE_TYPE },
     defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)

public class MyheaderImpl implements Myheader{

    private static final Logger LOG = LoggerFactory.getLogger(MyheaderImpl.class);

    protected static final String RESOURCE_TYPE = "wknd/components/myheader";

    @Self
    private SlingHttpServletRequest request;

    @SlingObject
    Resource componentResource;


    ////////////////////////////////////////////////

    @ValueMapValue
    private String image2;

    @ValueMapValue
    private String image3;

    @ValueMapValue
    private String text1;

    @ValueMapValue
    private String subtitle;

    @ValueMapValue
    private String image;

    ///////////////////////////////////////////////

    
    @Override
    public String getImage2() {
    return image2;    
    }

    @Override
    public String getImage3() {
    return image3;    
    }

    @Override
    public String getText1() {
    return text1;    

    }

     @Override
    public String getSubtitle() {
    return subtitle;
    }

   //////////////////////////////////////////////////////

    @Override
        public boolean isEmpty() {

            return  StringUtils.isBlank(image2)

                    && StringUtils.isBlank(text1) 
                    && StringUtils.isBlank(subtitle)
                    && StringUtils.isBlank((CharSequence) slide);
    }


    ////////////////////////////////////////////////////

     @Override
      public List<SlideData> getSlideData() {
            return slide;
      }

    @ChildResource
    List<SlideData> slide;

    @PostConstruct
    public void init()
    {
         slide =new  ArrayList<>();

         Resource comResource;
         Resource resSlide = componentResource.getChild("slide");

         if(null!=resSlide && resSlide.hasChildren())
         {
               Iterator<Resource> cards = resSlide.listChildren();
               while(cards.hasNext())
               {
                     Resource card = cards.next();
                     SlideData slideData = new SlideData();
                     slideData.setImage(card.getValueMap().get("image", String.class));
                     slideData.setImageText(card.getValueMap().get("imageText", String.class));
                     slide.add(slideData);
               }
         }

}
}