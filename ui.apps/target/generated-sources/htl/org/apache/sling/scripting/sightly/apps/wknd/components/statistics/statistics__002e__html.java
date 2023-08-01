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
package org.apache.sling.scripting.sightly.apps.wknd.components.statistics;

import java.io.PrintWriter;
import java.util.Collection;
import javax.script.Bindings;

import org.apache.sling.scripting.sightly.render.RenderUnit;
import org.apache.sling.scripting.sightly.render.RenderContext;

public final class statistics__002e__html extends RenderUnit {

    @Override
    protected final void render(PrintWriter out,
                                Bindings bindings,
                                Bindings arguments,
                                RenderContext renderContext) {
// Main Template Body -----------------------------------------------------------------------------

Object _global_placeholdertemplate = null;
Object _dynamic_properties = bindings.get("properties");
Collection var_collectionvar0_list_coerced$ = null;
_global_placeholdertemplate = renderContext.call("use", "core/wcm/components/commons/v1/templates.html", obj());
out.write("\r\n\r\n\r\n<div class=\"cmp-statistics\">\r\n      <img class=\"cmp-statistic__bgimage\" src=\"https://images.unsplash.com/photo-1680153527310-1a70b47af6e9?crop=entropy&cs=tinysrgb&fit=crop&fm=jpg&h=452&ixid=MnwxfDB8MXxyYW5kb218MHx8fHx8fHx8MTY4MDUwNTg2OA&ixlib=rb-4.0.3&q=80&w=576\" alt=\"\"/>\r\n      <!-- <ul class=\"cmp-statistics__content\">\r\n            <li class=\"cmp-statistics__content__inactive\">\r\n               <span class=\"cmp-statistics__value\">XX</span>\r\n               <div class=\"cmp-statistics__details\">\r\n                  <span>of alliances with large digital partners</span>\r\n               </div>\r\n            </li>\r\n            <li class=\"cmp-statistics__content__inactive\">\r\n               <span class=\"cmp-statistics__value\">500</span>\r\n               <div class=\"cmp-statistics__details\"> +\r\n                  <span>team members globally</span>\r\n               </div>\r\n            </li>\r\n            <li class=\"cmp-statistics__content__inactive\">\r\n               <span class=\"cmp-statistics__value\">XX</span>\r\n               <div class=\"cmp-statistics__details\"> %\r\n                  <span> year over year growth</span>\r\n               </div>\r\n            </li>\r\n      </ul> -->\r\n\r\n      <ul class=\"cmp-statistics__content\">\r\n         ");
{
    Object var_collectionvar0 = renderContext.getObjectModel().resolveProperty(_dynamic_properties, "contentDetail");
    {
        long var_size1 = ((var_collectionvar0_list_coerced$ == null ? (var_collectionvar0_list_coerced$ = renderContext.getObjectModel().toCollection(var_collectionvar0)) : var_collectionvar0_list_coerced$).size());
        {
            boolean var_notempty2 = (var_size1 > 0);
            if (var_notempty2) {
                {
                    long var_end5 = var_size1;
                    {
                        boolean var_validstartstepend6 = (((0 < var_size1) && true) && (var_end5 > 0));
                        if (var_validstartstepend6) {
                            if (var_collectionvar0_list_coerced$ == null) {
                                var_collectionvar0_list_coerced$ = renderContext.getObjectModel().toCollection(var_collectionvar0);
                            }
                            long var_index7 = 0;
                            for (Object contentdetail : var_collectionvar0_list_coerced$) {
                                {
                                    boolean var_traversal9 = (((var_index7 >= 0) && (var_index7 <= var_end5)) && true);
                                    if (var_traversal9) {
                                        out.write("<li class=\"cmp-statistics__content__inactive\">\r\n            <span class=\"cmp-statistics__value\">");
                                        {
                                            String var_10 = (" Text : " + renderContext.getObjectModel().toString(renderContext.call("xss", renderContext.getObjectModel().resolveProperty(contentdetail, "value"), "text")));
                                            out.write(renderContext.getObjectModel().toString(var_10));
                                        }
                                        out.write("</span>\r\n            <div class=\"cmp-statistics__details\">\r\n               <span>");
                                        {
                                            Object var_11 = renderContext.call("xss", renderContext.getObjectModel().resolveProperty(contentdetail, "text"), "text");
                                            out.write(renderContext.getObjectModel().toString(var_11));
                                        }
                                        out.write("</span>\r\n            </div>\r\n         </li>\n");
                                    }
                                }
                                var_index7++;
                            }
                        }
                    }
                }
            }
        }
    }
    var_collectionvar0_list_coerced$ = null;
}
out.write("\r\n         <li class=\"cmp-statistics__content__inactive\">\r\n            <span class=\"cmp-statistics__value\">500</span>\r\n            <div class=\"cmp-statistics__details\"> +\r\n               <span>team members globally</span>\r\n            </div>\r\n         </li>\r\n         <li class=\"cmp-statistics__content__inactive\">\r\n            <span class=\"cmp-statistics__value\">XX</span>\r\n            <div class=\"cmp-statistics__details\"> %\r\n               <span> year over year growth</span>\r\n            </div>\r\n         </li>\r\n   </ul>\r\n\r\n\r\n      \r\n </div>\r\n\r\n  \r\n\r\n   \r\n   \r\n");


// End Of Main Template Body ----------------------------------------------------------------------
    }



    {
//Sub-Templates Initialization --------------------------------------------------------------------



//End of Sub-Templates Initialization -------------------------------------------------------------
    }

}

