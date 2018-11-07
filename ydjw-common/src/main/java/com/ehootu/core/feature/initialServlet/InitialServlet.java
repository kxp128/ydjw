package com.ehootu.core.feature.initialServlet;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Spring启动完成后执行初始化操作
 * 预读某些实体的Key-Value，放入map，方便以后使用
 * @author
 * @version
 *
 */
@Component("initialServlet")
public class InitialServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;
    private final static Logger log = LoggerFactory.getLogger(InitialServlet.class);

    @Override
    public void init(ServletConfig config) throws ServletException {

        StringBuilder sb = new StringBuilder();
        sb.append("\r\n======================================================================\r\n");
        sb.append("\r\n          项目启动中...        - Powered By 成都精彩宏途科技信息有限公司\r\n");
        sb.append("\r\n======================================================================\r\n");
        log.info(sb.toString());
        System.out.println(sb.toString());
    }

    /**
     * @see HttpServlet#HttpServlet()
     */
    public InitialServlet() {
        super();
    }

    /**
     * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
     */
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    /**
     * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
     */
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    }

}
