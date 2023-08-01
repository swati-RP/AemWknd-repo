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
package org.apache.sling.scripting.sightly.apps.wknd.components.authorbooks;

import java.io.PrintWriter;
import java.util.Collection;
import javax.script.Bindings;

import org.apache.sling.scripting.sightly.render.RenderUnit;
import org.apache.sling.scripting.sightly.render.RenderContext;

public final class authorbooks__002e__html extends RenderUnit {

    @Override
    protected final void render(PrintWriter out,
                                Bindings bindings,
                                Bindings arguments,
                                RenderContext renderContext) {
// Main Template Body -----------------------------------------------------------------------------

Object _global_books = null;
Collection var_collectionvar0_list_coerced$ = null;
Collection var_collectionvar11_list_coerced$ = null;
_global_books = renderContext.call("use", com.adobe.aem.guides.wknd.core.models.AuthorBooks.class.getName(), obj());
out.write("<div>\r\n============Author Detail=============\r\n    ");
{
    Object var_collectionvar0 = renderContext.getObjectModel().resolveProperty(_global_books, "authorsCollections");
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
                            out.write("<div>");
                            if (var_collectionvar0_list_coerced$ == null) {
                                var_collectionvar0_list_coerced$ = renderContext.getObjectModel().toCollection(var_collectionvar0);
                            }
                            long var_index7 = 0;
                            for (Object author : var_collectionvar0_list_coerced$) {
                                {
                                    boolean var_traversal9 = (((var_index7 >= 0) && (var_index7 <= var_end5)) && true);
                                    if (var_traversal9) {
                                        out.write("\r\n\r\n        <h3>Author Name : <b>");
                                        {
                                            Object var_10 = renderContext.call("xss", renderContext.getObjectModel().resolveProperty(author, "authorName"), "text");
                                            out.write(renderContext.getObjectModel().toString(var_10));
                                        }
                                        out.write("</b></h3>\r\n\r\n        ==============Book Detail===============\r\n        ");
                                        {
                                            Object var_collectionvar11 = renderContext.getObjectModel().resolveProperty(author, "bookDetails");
                                            {
                                                long var_size12 = ((var_collectionvar11_list_coerced$ == null ? (var_collectionvar11_list_coerced$ = renderContext.getObjectModel().toCollection(var_collectionvar11)) : var_collectionvar11_list_coerced$).size());
                                                {
                                                    boolean var_notempty13 = (var_size12 > 0);
                                                    if (var_notempty13) {
                                                        {
                                                            long var_end16 = var_size12;
                                                            {
                                                                boolean var_validstartstepend17 = (((0 < var_size12) && true) && (var_end16 > 0));
                                                                if (var_validstartstepend17) {
                                                                    out.write("<div>");
                                                                    if (var_collectionvar11_list_coerced$ == null) {
                                                                        var_collectionvar11_list_coerced$ = renderContext.getObjectModel().toCollection(var_collectionvar11);
                                                                    }
                                                                    long var_index18 = 0;
                                                                    for (Object bookdetail : var_collectionvar11_list_coerced$) {
                                                                        {
                                                                            boolean var_traversal20 = (((var_index18 >= 0) && (var_index18 <= var_end16)) && true);
                                                                            if (var_traversal20) {
                                                                                out.write("\r\n            <p>");
                                                                                {
                                                                                    String var_21 = ("Book Name : " + renderContext.getObjectModel().toString(renderContext.call("xss", renderContext.getObjectModel().resolveProperty(bookdetail, "bookName"), "text")));
                                                                                    out.write(renderContext.getObjectModel().toString(var_21));
                                                                                }
                                                                                out.write("</p>\r\n            <p>");
                                                                                {
                                                                                    String var_22 = ("Subject Name : " + renderContext.getObjectModel().toString(renderContext.call("xss", renderContext.getObjectModel().resolveProperty(bookdetail, "subjectName"), "text")));
                                                                                    out.write(renderContext.getObjectModel().toString(var_22));
                                                                                }
                                                                                out.write("</p>\r\n            <p>");
                                                                                {
                                                                                    String var_23 = ("published at : " + renderContext.getObjectModel().toString(renderContext.call("xss", renderContext.getObjectModel().resolveProperty(bookdetail, "published"), "text")));
                                                                                    out.write(renderContext.getObjectModel().toString(var_23));
                                                                                }
                                                                                out.write("</p>\r\n        ");
                                                                            }
                                                                        }
                                                                        var_index18++;
                                                                    }
                                                                    out.write("</div>");
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                            var_collectionvar11_list_coerced$ = null;
                                        }
                                        out.write("\r\n    ");
                                    }
                                }
                                var_index7++;
                            }
                            out.write("</div>");
                        }
                    }
                }
            }
        }
    }
    var_collectionvar0_list_coerced$ = null;
}
out.write("\r\n</div>\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n");


// End Of Main Template Body ----------------------------------------------------------------------
    }



    {
//Sub-Templates Initialization --------------------------------------------------------------------



//End of Sub-Templates Initialization -------------------------------------------------------------
    }

}

