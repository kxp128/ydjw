package com.ehootu.core.util;

import java.io.PrintWriter;
import java.util.Enumeration;
import java.util.Properties;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.velocity.Template;
import org.apache.velocity.app.Velocity;
import org.apache.velocity.app.VelocityEngine;
import org.apache.velocity.exception.ParseErrorException;
import org.apache.velocity.exception.ResourceNotFoundException;
import org.apache.velocity.tools.Scope;
import org.apache.velocity.tools.ToolManager;
import org.apache.velocity.tools.view.ViewToolContext;

import com.jfinal.core.Const;
import com.jfinal.core.JFinal;
import com.jfinal.render.RenderException;

/**
 * JFinal 中使用 velocity 工具类
 * <p>Description: VelocityLayoutRender </p>
 * @author:  xutie
 * @created: 2017/5/17
 * @version: 1.0
 */

public class VelocityLayoutRender {
    private static final String contentType = "text/html; charset=" + Const.DEFAULT_ENCODING;
    private static final Properties properties = new Properties();
    private static VelocityEngine velocityEngine = new VelocityEngine();
    private static ToolManager tm = new ToolManager(true, true);
    private static boolean notInit = true;

    static {
        String webPath = JFinal.me().getServletContext().getRealPath("/");
        properties.setProperty(Velocity.FILE_RESOURCE_LOADER_PATH, webPath+"WEB-INF/views/wx/");
        properties.setProperty(Velocity.ENCODING_DEFAULT, Const.DEFAULT_ENCODING);
        properties.setProperty(Velocity.INPUT_ENCODING, Const.DEFAULT_ENCODING);
        properties.setProperty(Velocity.OUTPUT_ENCODING, Const.DEFAULT_ENCODING);
        properties.setProperty(Velocity.VM_LIBRARY_AUTORELOAD, "true");
        properties.setProperty(Velocity.DEFAULT_RUNTIME_PROPERTIES, webPath+ "velocity.properties");

        // 切记把tools.xml放到资源文件包下，也就是生成后会在classes文件夹下能看到
        ToolManager toolManager = new ToolManager(true, true);// 默认把官方带的所有工具类都加入进入
        toolManager.setVelocityEngine(velocityEngine);

        // 绑定工具类
        tm.setVelocityEngine(velocityEngine);
    }

    // 使用有工具类视图的上下文 （其实是VelocityContext的子类）
    public static ViewToolContext getViewToolContext(HttpServletRequest request, HttpServletResponse response) {
        ServletContext servletContext = request.getServletContext();
        ViewToolContext ctx = new ViewToolContext(velocityEngine, request, response, servletContext);
        if (tm.getToolboxFactory().hasTools(Scope.REQUEST)) {
            ctx.addToolbox(tm.getToolboxFactory().createToolbox(Scope.REQUEST));
        }
        if (tm.getToolboxFactory().hasTools(Scope.APPLICATION)) {
            ctx.addToolbox(tm.getToolboxFactory().createToolbox(Scope.APPLICATION));
        }
        if (tm.getToolboxFactory().hasTools(Scope.SESSION)) {
            ctx.addToolbox(tm.getToolboxFactory().createToolbox(Scope.SESSION));
        }
        return ctx;
    }

    // 生成模板并打印
    public static void render(String view, HttpServletRequest request, HttpServletResponse response) {
        if (notInit) {
            velocityEngine.init(properties);
            notInit = false;
        }

        PrintWriter writer = null;
        try {
            ViewToolContext context = getViewToolContext(request, response);
            for (Enumeration<String> attrs = request.getAttributeNames(); attrs.hasMoreElements();) {
                String attrName = attrs.nextElement();
                context.put(attrName, request.getAttribute(attrName));
            }
            Template template = velocityEngine.getTemplate(view);

            response.setContentType(contentType);
            writer = response.getWriter();

            template.merge(context, writer);
            writer.flush(); // flush and cleanup
        } catch (ResourceNotFoundException e) {
            throw new RenderException("Example : error : cannot find template " + view, e);
        } catch (ParseErrorException e) {
            throw new RenderException("Example : Syntax error in template " + view + ":" + e, e);
        } catch (Exception e) {
            throw new RenderException(e);
        } finally {
            if (writer != null)
                writer.close();
        }
    }
}