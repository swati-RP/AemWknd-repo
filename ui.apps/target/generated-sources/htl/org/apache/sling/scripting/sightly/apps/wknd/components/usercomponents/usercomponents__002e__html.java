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
package org.apache.sling.scripting.sightly.apps.wknd.components.usercomponents;

import java.io.PrintWriter;
import java.util.Collection;
import javax.script.Bindings;

import org.apache.sling.scripting.sightly.render.RenderUnit;
import org.apache.sling.scripting.sightly.render.RenderContext;

public final class usercomponents__002e__html extends RenderUnit {

    @Override
    protected final void render(PrintWriter out,
                                Bindings bindings,
                                Bindings arguments,
                                RenderContext renderContext) {
// Main Template Body -----------------------------------------------------------------------------

Object _dynamic_properties = bindings.get("properties");
out.write("<h2 class=\"cmp-note_firstname\">");
{
    Object var_0 = renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_dynamic_properties, "firstName"), "text");
    out.write(renderContext.getObjectModel().toString(var_0));
}
out.write("</h2>\r\n<h2 class=\"cmp-note_lastname\">");
{
    Object var_1 = renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_dynamic_properties, "lastName"), "text");
    out.write(renderContext.getObjectModel().toString(var_1));
}
out.write("</h2>\r\n<h2 class=\"cmp-note_gender\">");
{
    Object var_2 = renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_dynamic_properties, "gender"), "text");
    out.write(renderContext.getObjectModel().toString(var_2));
}
out.write("</h2>\r\n\r\n\r\n<h2 class=\"cmp-byline__country\">");
{
    Object var_3 = renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_dynamic_properties, "country"), "text");
    out.write(renderContext.getObjectModel().toString(var_3));
}
out.write("</h2>");


// End Of Main Template Body ----------------------------------------------------------------------
    }



    {
//Sub-Templates Initialization --------------------------------------------------------------------



//End of Sub-Templates Initialization -------------------------------------------------------------
    }

}

