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
package org.apache.sling.scripting.sightly.apps.wknd.components.SlideBanner;

import java.io.PrintWriter;
import java.util.Collection;
import javax.script.Bindings;

import org.apache.sling.scripting.sightly.render.RenderUnit;
import org.apache.sling.scripting.sightly.render.RenderContext;

public final class SlideBanner__002e__html extends RenderUnit {

    @Override
    protected final void render(PrintWriter out,
                                Bindings bindings,
                                Bindings arguments,
                                RenderContext renderContext) {
// Main Template Body -----------------------------------------------------------------------------

Object _global_model = null;
Object _global_templates = null;
Collection var_collectionvar7_list_coerced$ = null;
Collection var_collectionvar24_list_coerced$ = null;
out.write("\r\n    ");
_global_model = renderContext.call("use", com.adobe.aem.guides.wknd.core.models.SlideBanner.class.getName(), obj());
_global_templates = renderContext.call("use", "core/wcm/components/commons/v1/templates.html", obj());
out.write("<div class=\"cmp-slidebanner\">\r\n\r\n        ");
{
    boolean var_testvariable0 = (!renderContext.getObjectModel().toBoolean(renderContext.getObjectModel().resolveProperty(_global_model, "isEmpty")));
    if (var_testvariable0) {
        out.write("\r\n\r\n            <div class=\"cmp-slidebanner__container\">\r\n\r\n                <section class=\"cmp-slidebanner__container__left\"></section>\r\n\r\n                <!-- Right Side Content -->\r\n\r\n                <section class=\"cmp-slidebanner__container__right\">\r\n                    <h1 class=\"cmp-slidebanner__container__right--title\"");
        {
            Object var_attrvalue1 = renderContext.getObjectModel().resolveProperty(_global_model, "text");
            {
                Object var_attrcontent2 = renderContext.call("xss", var_attrvalue1, "attribute");
                {
                    boolean var_shoulddisplayattr4 = (((null != var_attrcontent2) && (!"".equals(var_attrcontent2))) && ((!"".equals(var_attrvalue1)) && (!((Object)false).equals(var_attrvalue1))));
                    if (var_shoulddisplayattr4) {
                        out.write(" cmp-slidebanner-title");
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
        out.write(">");
        {
            String var_5 = ((" " + renderContext.getObjectModel().toString(renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_global_model, "text"), "text"))) + " ");
            out.write(renderContext.getObjectModel().toString(var_5));
        }
        out.write("</h1>\r\n                    <div class=\"cmp-slidebanner__container__right--description\">");
        {
            String var_6 = ((" " + renderContext.getObjectModel().toString(renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_global_model, "description"), "html"))) + "\r\n                    ");
            out.write(renderContext.getObjectModel().toString(var_6));
        }
        out.write("</div>\r\n\r\n                    ");
        {
            Object var_collectionvar7 = renderContext.getObjectModel().resolveProperty(_global_model, "ctAsData");
            {
                long var_size8 = ((var_collectionvar7_list_coerced$ == null ? (var_collectionvar7_list_coerced$ = renderContext.getObjectModel().toCollection(var_collectionvar7)) : var_collectionvar7_list_coerced$).size());
                {
                    boolean var_notempty9 = (var_size8 > 0);
                    if (var_notempty9) {
                        {
                            long var_end12 = var_size8;
                            {
                                boolean var_validstartstepend13 = (((0 < var_size8) && true) && (var_end12 > 0));
                                if (var_validstartstepend13) {
                                    out.write("<div class=\"cmp-slidebanner__container__right__btn\">");
                                    if (var_collectionvar7_list_coerced$ == null) {
                                        var_collectionvar7_list_coerced$ = renderContext.getObjectModel().toCollection(var_collectionvar7);
                                    }
                                    long var_index14 = 0;
                                    for (Object item : var_collectionvar7_list_coerced$) {
                                        {
                                            boolean itemlist_field$_last = (var_index14 == (renderContext.getObjectModel().toNumber(org.apache.sling.scripting.sightly.compiler.expression.nodes.BinaryOperator.SUB.eval(var_size8, 1)).longValue()));
                                            {
                                                boolean var_traversal16 = (((var_index14 >= 0) && (var_index14 <= var_end12)) && true);
                                                if (var_traversal16) {
                                                    out.write("\r\n                        <a");
                                                    {
                                                        String var_attrcontent17 = ("cmp-slidebanner--contactBtn " + renderContext.getObjectModel().toString(renderContext.call("xss", (itemlist_field$_last ? "lastBtn" : ""), "attribute")));
                                                        out.write(" class=\"");
                                                        out.write(renderContext.getObjectModel().toString(var_attrcontent17));
                                                        out.write("\"");
                                                    }
                                                    {
                                                        String var_attrcontent18 = (renderContext.getObjectModel().toString(renderContext.call("xss", renderContext.getObjectModel().resolveProperty(item, "linkUrl"), "uri")) + ".html");
                                                        out.write(" href=\"");
                                                        out.write(renderContext.getObjectModel().toString(var_attrcontent18));
                                                        out.write("\"");
                                                    }
                                                    {
                                                        String var_attrvalue19 = (renderContext.getObjectModel().toBoolean(renderContext.getObjectModel().resolveProperty(item, "target")) ? "_blank" : "_self");
                                                        {
                                                            Object var_attrcontent20 = renderContext.call("xss", var_attrvalue19, "attribute");
                                                            {
                                                                boolean var_shoulddisplayattr22 = (((null != var_attrcontent20) && (!"".equals(var_attrcontent20))) && ((!"".equals(var_attrvalue19)) && (!((Object)false).equals(var_attrvalue19))));
                                                                if (var_shoulddisplayattr22) {
                                                                    out.write(" target");
                                                                    {
                                                                        boolean var_istrueattr21 = (var_attrvalue19.equals(true));
                                                                        if (!var_istrueattr21) {
                                                                            out.write("=\"");
                                                                            out.write(renderContext.getObjectModel().toString(var_attrcontent20));
                                                                            out.write("\"");
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                    out.write(">");
                                                    {
                                                        String var_23 = ((" " + renderContext.getObjectModel().toString(renderContext.call("xss", renderContext.getObjectModel().resolveProperty(item, "linkText"), "text"))) + " ");
                                                        out.write(renderContext.getObjectModel().toString(var_23));
                                                    }
                                                    out.write("</a>\r\n                    ");
                                                }
                                            }
                                        }
                                        var_index14++;
                                    }
                                    out.write("</div>");
                                }
                            }
                        }
                    }
                }
            }
            var_collectionvar7_list_coerced$ = null;
        }
        out.write("\r\n                </section>\r\n\r\n                <!-- slider  -->\r\n\r\n                <section class=\"cmp-slidebanner__container__slider\">\r\n\r\n                    <div class=\"swiper\">\r\n                        ");
        {
            Object var_collectionvar24 = renderContext.getObjectModel().resolveProperty(_global_model, "slideData");
            {
                long var_size25 = ((var_collectionvar24_list_coerced$ == null ? (var_collectionvar24_list_coerced$ = renderContext.getObjectModel().toCollection(var_collectionvar24)) : var_collectionvar24_list_coerced$).size());
                {
                    boolean var_notempty26 = (var_size25 > 0);
                    if (var_notempty26) {
                        {
                            long var_end29 = var_size25;
                            {
                                boolean var_validstartstepend30 = (((0 < var_size25) && true) && (var_end29 > 0));
                                if (var_validstartstepend30) {
                                    out.write("<div class=\"swiper-wrapper\">");
                                    if (var_collectionvar24_list_coerced$ == null) {
                                        var_collectionvar24_list_coerced$ = renderContext.getObjectModel().toCollection(var_collectionvar24);
                                    }
                                    long var_index31 = 0;
                                    for (Object item : var_collectionvar24_list_coerced$) {
                                        {
                                            boolean var_traversal33 = (((var_index31 >= 0) && (var_index31 <= var_end29)) && true);
                                            if (var_traversal33) {
                                                out.write("\r\n                            <div class=\"swiper-slide\">\r\n                                <img");
                                                {
                                                    Object var_attrvalue34 = renderContext.getObjectModel().resolveProperty(item, "image");
                                                    {
                                                        Object var_attrcontent35 = renderContext.call("xss", var_attrvalue34, "uri");
                                                        {
                                                            boolean var_shoulddisplayattr37 = (((null != var_attrcontent35) && (!"".equals(var_attrcontent35))) && ((!"".equals(var_attrvalue34)) && (!((Object)false).equals(var_attrvalue34))));
                                                            if (var_shoulddisplayattr37) {
                                                                out.write(" src");
                                                                {
                                                                    boolean var_istrueattr36 = (var_attrvalue34.equals(true));
                                                                    if (!var_istrueattr36) {
                                                                        out.write("=\"");
                                                                        out.write(renderContext.getObjectModel().toString(var_attrcontent35));
                                                                        out.write("\"");
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                                out.write(" alt=\"images\"/>\r\n                                <p class=\"slide-text\">");
                                                {
                                                    String var_38 = ((" " + renderContext.getObjectModel().toString(renderContext.call("xss", renderContext.getObjectModel().resolveProperty(item, "imageText"), "text"))) + " ");
                                                    out.write(renderContext.getObjectModel().toString(var_38));
                                                }
                                                out.write("</p>\r\n                            </div>\r\n                        ");
                                            }
                                        }
                                        var_index31++;
                                    }
                                    out.write("</div>");
                                }
                            }
                        }
                    }
                }
            }
            var_collectionvar24_list_coerced$ = null;
        }
        out.write("\r\n\r\n                        <div class=\"swiper-button-prev\"></div>\r\n                        <div class=\"swiper-button-next\"></div>\r\n\r\n                        <div class=\"swiper-pagination swiper-pagination-clickable\"></div>\r\n                    </div>\r\n\r\n                </section>\r\n                <div class=\"horizontal-line\"></div>\r\n                <div class=\"horizontal-title\"></div>\r\n            </div>\r\n\r\n        ");
    }
}
out.write("\r\n    </div>\r\n\r\n\r\n");
{
    Object var_templatevar39 = renderContext.getObjectModel().resolveProperty(_global_templates, "placeholder");
    {
        Object var_templateoptions40_field$_isempty = renderContext.getObjectModel().resolveProperty(_global_model, "isEmpty");
        {
            java.util.Map var_templateoptions40 = obj().with("isEmpty", var_templateoptions40_field$_isempty);
            callUnit(out, renderContext, var_templatevar39, var_templateoptions40);
        }
    }
}


// End Of Main Template Body ----------------------------------------------------------------------
    }



    {
//Sub-Templates Initialization --------------------------------------------------------------------



//End of Sub-Templates Initialization -------------------------------------------------------------
    }

}

