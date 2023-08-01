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
package org.apache.sling.scripting.sightly.apps.wknd.components.test;

import java.io.PrintWriter;
import java.util.Collection;
import javax.script.Bindings;

import org.apache.sling.scripting.sightly.render.RenderUnit;
import org.apache.sling.scripting.sightly.render.RenderContext;

public final class test__002e__html extends RenderUnit {

    @Override
    protected final void render(PrintWriter out,
                                Bindings bindings,
                                Bindings arguments,
                                RenderContext renderContext) {
// Main Template Body -----------------------------------------------------------------------------

Object _dynamic_properties = bindings.get("properties");
Object _dynamic_model = bindings.get("model");
out.write("<div");
{
    String var_attrcontent0 = ("cmp-test " + renderContext.getObjectModel().toString(renderContext.call("xss", ((org.apache.sling.scripting.sightly.compiler.expression.nodes.BinaryOperator.strictEq(renderContext.getObjectModel().resolveProperty(_dynamic_properties, "checkbox"), "true")) ? "trueClassName" : "falseClassName"), "attribute")));
    out.write(" class=\"");
    out.write(renderContext.getObjectModel().toString(var_attrcontent0));
    out.write("\"");
}
out.write(">\r\n    ");
{
    Object var_testvariable1 = renderContext.getObjectModel().resolveProperty(_dynamic_properties, "text");
    if (renderContext.getObjectModel().toBoolean(var_testvariable1)) {
        out.write("\r\n        <h1>This is a Test component</h1>\r\n        <div class=\"cmp-test__text\">");
        {
            Object var_2 = renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_dynamic_properties, "text"), "text");
            out.write(renderContext.getObjectModel().toString(var_2));
        }
        out.write("</div>\r\n        <a class=\"cmp-test__link\"");
        {
            Object var_attrvalue7 = renderContext.getObjectModel().resolveProperty(_dynamic_properties, "link");
            {
                Object var_attrcontent8 = renderContext.call("xss", var_attrvalue7, "uri");
                {
                    boolean var_shoulddisplayattr10 = (((null != var_attrcontent8) && (!"".equals(var_attrcontent8))) && ((!"".equals(var_attrvalue7)) && (!((Object)false).equals(var_attrvalue7))));
                    if (var_shoulddisplayattr10) {
                        out.write(" href");
                        {
                            boolean var_istrueattr9 = (var_attrvalue7.equals(true));
                            if (!var_istrueattr9) {
                                out.write("=\"");
                                out.write(renderContext.getObjectModel().toString(var_attrcontent8));
                                out.write("\"");
                            }
                        }
                    }
                }
            }
        }
        out.write(" alt=\"altText\"");
        {
            Object var_attrvalue_test_attribute3 = renderContext.getObjectModel().resolveProperty(_dynamic_properties, "linkColor");
            {
                Object var_attrvalueescaped_test_attribute4 = renderContext.call("xss", var_attrvalue_test_attribute3, "attribute", "test-attribute");
                {
                    boolean var_shoulddisplayattr_test_attribute6 = (((null != var_attrvalueescaped_test_attribute4) && (!"".equals(var_attrvalueescaped_test_attribute4))) && ((!"".equals(var_attrvalue_test_attribute3)) && (!((Object)false).equals(var_attrvalue_test_attribute3))));
                    if (var_shoulddisplayattr_test_attribute6) {
                        out.write(" test-attribute");
                        {
                            boolean var_istruevalue_test_attribute5 = (var_attrvalue_test_attribute3.equals(true));
                            if (!var_istruevalue_test_attribute5) {
                                out.write("=\"");
                                out.write(renderContext.getObjectModel().toString(var_attrvalueescaped_test_attribute4));
                                out.write("\"");
                            }
                        }
                    }
                }
            }
        }
        out.write(">");
        {
            Object var_11 = renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_dynamic_properties, "text"), "text");
            out.write(renderContext.getObjectModel().toString(var_11));
        }
        out.write("</a><br/>\r\n    ");
    }
}
out.write("\r\n    <img class=\"cmp-test__image\"");
{
    Object var_attrvalue12 = renderContext.getObjectModel().resolveProperty(_dynamic_properties, "image");
    {
        Object var_attrcontent13 = renderContext.call("xss", var_attrvalue12, "uri");
        {
            boolean var_shoulddisplayattr15 = (((null != var_attrcontent13) && (!"".equals(var_attrcontent13))) && ((!"".equals(var_attrvalue12)) && (!((Object)false).equals(var_attrvalue12))));
            if (var_shoulddisplayattr15) {
                out.write(" src");
                {
                    boolean var_istrueattr14 = (var_attrvalue12.equals(true));
                    if (!var_istrueattr14) {
                        out.write("=\"");
                        out.write(renderContext.getObjectModel().toString(var_attrcontent13));
                        out.write("\"");
                    }
                }
            }
        }
    }
}
out.write(" alt=\"Image\"/>\r\n    <div class=\"cmp-test__description\">");
{
    Object var_16 = renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_dynamic_properties, "longDescriptionText"), "html");
    out.write(renderContext.getObjectModel().toString(var_16));
}
out.write("</div>\r\n</div>\r\n\r\n");
{
    String var_17 = (((((((("<!-- <div class=\"cmp-helloworld\" data-cmp-is=\"helloworld\">\r\n    <h2 class=\"cmp-helloworld__title\">Hello World Component</h2>\r\n    <div class=\"cmp-helloworld__item\" data-sly-test=\"" + renderContext.getObjectModel().toString(renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_dynamic_properties, "text"), "comment"))) + "\">\r\n        <p class=\"cmp-helloworld__item-label\">Text property:</p>\r\n        <pre class=\"cmp-helloworld__item-output\" data-cmp-hook-helloworld=\"property\">") + renderContext.getObjectModel().toString(renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_dynamic_properties, "text"), "comment"))) + "</pre>\r\n    </div>\r\n    <div class=\"cmp-helloworld__item\" data-sly-use.model=\"com.adobe.aem.guides.wknd.core.models.HelloWorldModel\" data-sly-test=\"") + renderContext.getObjectModel().toString(renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_dynamic_model, "message"), "comment"))) + "\">\r\n        <p class=\"cmp-helloworld__item-label\">Model message:</p>\r\n        <pre class=\"cmp-helloworld__item-output\"data-cmp-hook-helloworld=\"model\">") + renderContext.getObjectModel().toString(renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_dynamic_model, "message"), "comment"))) + "</pre>\r\n    </div>\r\n</div> -->");
    out.write(renderContext.getObjectModel().toString(var_17));
}
out.write("\r\n");


// End Of Main Template Body ----------------------------------------------------------------------
    }



    {
//Sub-Templates Initialization --------------------------------------------------------------------



//End of Sub-Templates Initialization -------------------------------------------------------------
    }

}

