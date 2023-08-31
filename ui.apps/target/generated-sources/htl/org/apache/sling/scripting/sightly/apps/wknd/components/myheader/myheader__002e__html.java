/*******************************************************************************
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 ******************************************************************************/
package org.apache.sling.scripting.sightly.apps.wknd.components.myheader;

import java.io.PrintWriter;
import java.util.Collection;
import javax.script.Bindings;

import org.apache.sling.scripting.sightly.render.RenderUnit;
import org.apache.sling.scripting.sightly.render.RenderContext;

public final class myheader__002e__html extends RenderUnit {

    @Override
    protected final void render(PrintWriter out,
                                Bindings bindings,
                                Bindings arguments,
                                RenderContext renderContext) {
// Main Template Body -----------------------------------------------------------------------------

Object _global_model = null;
Object _global_templates = null;
Collection var_collectionvar5_list_coerced$ = null;
out.write("\r\n");
_global_model = renderContext.call("use", com.adobe.aem.guides.wknd.core.models.Myheader.class.getName(), obj());
_global_templates = renderContext.call("use", "core/wcm/components/commons/v1/templates.html", obj());
out.write("<div class=\"cmp-slidebanner\">\r\n\r\n  ");
{
    boolean var_testvariable0 = (!renderContext.getObjectModel().toBoolean(renderContext.getObjectModel().resolveProperty(_global_model, "empty")));
    if (var_testvariable0) {
        out.write("\r\n\r\n  <div class=\"cmp-myheader\">\r\n \r\n  <div class=\"cmp-myheader-content-1\">\r\n\r\n  <div class=\"cmp-myheader-image-1\">\r\n  <img");
        {
            Object var_attrvalue1 = renderContext.getObjectModel().resolveProperty(_global_model, "image2");
            {
                Object var_attrcontent2 = renderContext.call("xss", var_attrvalue1, "uri");
                {
                    boolean var_shoulddisplayattr4 = (((null != var_attrcontent2) && (!"".equals(var_attrcontent2))) && ((!"".equals(var_attrvalue1)) && (!((Object)false).equals(var_attrvalue1))));
                    if (var_shoulddisplayattr4) {
                        out.write(" src");
                        {
                            boolean var_istrueattr3 = (var_attrvalue1.equals(true));
                            if (!var_istrueattr3) {
                                out.write("=\"");
                                out.write(renderContext.getObjectModel().toString(var_attrcontent2));
                                out.write("\"");
                            }
                        }
                    }
                }
            }
        }
        out.write(" alt=\"Image\"/>\r\n\r\n</div>\r\n\r\n\r\n  </div>\r\n  \r\n  <div class=\"cmp-slidebanner__container\">\r\n\r\n  <section class=\"cmp-slidebanner__container__left\"></section>\r\n\r\n  <!-- slider  -->\r\n\r\n  <section class=\"cmp-slidebanner__container__slider\">\r\n\r\n      <div class=\"swiper\">\r\n          ");
        {
            Object var_collectionvar5 = renderContext.getObjectModel().resolveProperty(_global_model, "slideData");
            {
                long var_size6 = ((var_collectionvar5_list_coerced$ == null ? (var_collectionvar5_list_coerced$ = renderContext.getObjectModel().toCollection(var_collectionvar5)) : var_collectionvar5_list_coerced$).size());
                {
                    boolean var_notempty7 = (var_size6 > 0);
                    if (var_notempty7) {
                        {
                            long var_end10 = var_size6;
                            {
                                boolean var_validstartstepend11 = (((0 < var_size6) && true) && (var_end10 > 0));
                                if (var_validstartstepend11) {
                                    out.write("<div class=\"swiper-wrapper\">");
                                    if (var_collectionvar5_list_coerced$ == null) {
                                        var_collectionvar5_list_coerced$ = renderContext.getObjectModel().toCollection(var_collectionvar5);
                                    }
                                    long var_index12 = 0;
                                    for (Object item : var_collectionvar5_list_coerced$) {
                                        {
                                            boolean var_traversal14 = (((var_index12 >= 0) && (var_index12 <= var_end10)) && true);
                                            if (var_traversal14) {
                                                out.write("\r\n              <div class=\"swiper-slide\">\r\n                  <img");
                                                {
                                                    Object var_attrvalue15 = renderContext.getObjectModel().resolveProperty(item, "image");
                                                    {
                                                        Object var_attrcontent16 = renderContext.call("xss", var_attrvalue15, "uri");
                                                        {
                                                            boolean var_shoulddisplayattr18 = (((null != var_attrcontent16) && (!"".equals(var_attrcontent16))) && ((!"".equals(var_attrvalue15)) && (!((Object)false).equals(var_attrvalue15))));
                                                            if (var_shoulddisplayattr18) {
                                                                out.write(" src");
                                                                {
                                                                    boolean var_istrueattr17 = (var_attrvalue15.equals(true));
                                                                    if (!var_istrueattr17) {
                                                                        out.write("=\"");
                                                                        out.write(renderContext.getObjectModel().toString(var_attrcontent16));
                                                                        out.write("\"");
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                                out.write(" alt=\"images\"/>\r\n                  <p class=\"slide-text\">");
                                                {
                                                    String var_19 = ((" " + renderContext.getObjectModel().toString(renderContext.call("xss", renderContext.getObjectModel().resolveProperty(item, "imageText"), "text"))) + " ");
                                                    out.write(renderContext.getObjectModel().toString(var_19));
                                                }
                                                out.write("</p>\r\n              </div>\r\n          ");
                                            }
                                        }
                                        var_index12++;
                                    }
                                    out.write("</div>");
                                }
                            }
                        }
                    }
                }
            }
            var_collectionvar5_list_coerced$ = null;
        }
        out.write("\r\n\r\n          <div class=\"swiper-button-prev\"></div>\r\n          <div class=\"swiper-button-next\"></div>\r\n\r\n          <div class=\"swiper-pagination swiper-pagination-clickable\"></div>\r\n      </div>\r\n\r\n  </section>\r\n\r\n  </div>\r\n</div>\r\n\r\n   <div class=\"cmp-myheader-content-3\">\r\n\r\n\r\n\r\n  </div>\r\n\r\n  ");
    }
}
out.write("</div>  </div>\r\n\r\n  \r\n\r\n\r\n  \r\n\r\n  \r\n");
{
    Object var_templatevar20 = renderContext.getObjectModel().resolveProperty(_global_templates, "placeholder");
    {
        Object var_templateoptions21_field$_isempty = renderContext.getObjectModel().resolveProperty(_global_model, "empty");
        {
            java.util.Map var_templateoptions21 = obj().with("isEmpty", var_templateoptions21_field$_isempty);
            callUnit(out, renderContext, var_templatevar20, var_templateoptions21);
        }
    }
}
out.write("\r\n\r\n");


// End Of Main Template Body ----------------------------------------------------------------------
    }



    {
//Sub-Templates Initialization --------------------------------------------------------------------



//End of Sub-Templates Initialization -------------------------------------------------------------
    }

}

