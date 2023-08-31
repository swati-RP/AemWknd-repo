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
package org.apache.sling.scripting.sightly.apps.wknd.components.myslider;

import java.io.PrintWriter;
import java.util.Collection;
import javax.script.Bindings;

import org.apache.sling.scripting.sightly.render.RenderUnit;
import org.apache.sling.scripting.sightly.render.RenderContext;

public final class myslider__002e__html extends RenderUnit {

    @Override
    protected final void render(PrintWriter out,
                                Bindings bindings,
                                Bindings arguments,
                                RenderContext renderContext) {
// Main Template Body -----------------------------------------------------------------------------

Object _global_model = null;
Object _global_templates = null;
Collection var_collectionvar1_list_coerced$ = null;
_global_model = renderContext.call("use", com.adobe.aem.guides.wknd.core.models.Myslider.class.getName(), obj());
_global_templates = renderContext.call("use", "core/wcm/components/commons/v1/templates.html", obj());
out.write("\r\n\r\n  ");
{
    boolean var_testvariable0 = (!renderContext.getObjectModel().toBoolean(renderContext.getObjectModel().resolveProperty(_global_model, "empty")));
    if (var_testvariable0) {
        out.write("\r\n\r\n  <div class=\"cmp-myslider\">\r\n \r\n  <div class=\"cmp-myslider-content\">\r\n\r\n  <div class=\"slider\">\r\n  <div class=\"slide\">\r\n\r\n\r\n");
        {
            Object var_collectionvar1 = renderContext.getObjectModel().resolveProperty(_global_model, "feature");
            {
                long var_size2 = ((var_collectionvar1_list_coerced$ == null ? (var_collectionvar1_list_coerced$ = renderContext.getObjectModel().toCollection(var_collectionvar1)) : var_collectionvar1_list_coerced$).size());
                {
                    boolean var_notempty3 = (var_size2 > 0);
                    if (var_notempty3) {
                        {
                            long var_end6 = var_size2;
                            {
                                boolean var_validstartstepend7 = (((0 < var_size2) && true) && (var_end6 > 0));
                                if (var_validstartstepend7) {
                                    if (var_collectionvar1_list_coerced$ == null) {
                                        var_collectionvar1_list_coerced$ = renderContext.getObjectModel().toCollection(var_collectionvar1);
                                    }
                                    long var_index8 = 0;
                                    for (Object feature : var_collectionvar1_list_coerced$) {
                                        {
                                            boolean var_traversal10 = (((var_index8 >= 0) && (var_index8 <= var_end6)) && true);
                                            if (var_traversal10) {
                                                out.write("\r\n\r\n<img");
                                                {
                                                    Object var_attrvalue11 = feature;
                                                    {
                                                        Object var_attrcontent12 = renderContext.call("xss", var_attrvalue11, "uri");
                                                        {
                                                            boolean var_shoulddisplayattr14 = (((null != var_attrcontent12) && (!"".equals(var_attrcontent12))) && ((!"".equals(var_attrvalue11)) && (!((Object)false).equals(var_attrvalue11))));
                                                            if (var_shoulddisplayattr14) {
                                                                out.write(" src");
                                                                {
                                                                    boolean var_istrueattr13 = (var_attrvalue11.equals(true));
                                                                    if (!var_istrueattr13) {
                                                                        out.write("=\"");
                                                                        out.write(renderContext.getObjectModel().toString(var_attrcontent12));
                                                                        out.write("\"");
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                                out.write(" alt=\"image\"/>\r\n\r\n");
                                            }
                                        }
                                        var_index8++;
                                    }
                                }
                            }
                        }
                    }
                }
            }
            var_collectionvar1_list_coerced$ = null;
        }
        out.write("\r\n\r\n\r\n\r\n</div>\r\n\r\n\r\n<button onclick=\"prevSlide()\">\r\nPrev\r\n</button>\r\n<button onclick=\"nextSlide()\">\r\nNext\r\n</button>\r\n\r\n  </div>\r\n  \r\n\r\n  </div>\r\n  ");
    }
}
out.write("\r\n\r\n  \r\n");
{
    Object var_templatevar15 = renderContext.getObjectModel().resolveProperty(_global_templates, "placeholder");
    {
        Object var_templateoptions16_field$_isempty = renderContext.getObjectModel().resolveProperty(_global_model, "empty");
        {
            java.util.Map var_templateoptions16 = obj().with("isEmpty", var_templateoptions16_field$_isempty);
            callUnit(out, renderContext, var_templatevar15, var_templateoptions16);
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

