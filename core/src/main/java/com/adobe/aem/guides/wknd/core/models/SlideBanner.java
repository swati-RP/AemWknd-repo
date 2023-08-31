package com.adobe.aem.guides.wknd.core.models;

import java.util.List;

import com.adobe.aem.guides.wknd.core.models.dto.CTAsData;
import com.adobe.aem.guides.wknd.core.models.dto.SlideData;

public interface SlideBanner {

      public String getText();
      public String getDescription();
      public boolean isEmpty();

      List<SlideData> getSlideData();
      List<CTAsData>   getCtAsData();
}