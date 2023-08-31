package com.adobe.aem.guides.wknd.core.models;

import java.util.List;

import com.adobe.aem.guides.wknd.core.models.dto.SlideData;

public interface Myheader {
    
    String getImage2();
    String getImage3();
    String getText1();
    String getSubtitle();
    boolean isEmpty();

    List<SlideData> getSlideData();
    //List<String> getFeature();



}
