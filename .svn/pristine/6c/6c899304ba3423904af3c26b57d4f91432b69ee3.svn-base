package com.ehootu.core.feature.keygen;

import com.ehootu.core.util.AES;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanInitializationException;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.config.PropertyPlaceholderConfigurer;

import java.util.Properties;

/**
 *  JDBC 加密
 * <p>Description: EncryptablePropertyPlaceholderConfigurer </p>
 * @author:  xutie
 * @created: 2017/4/18
 * @version: 1.0
 */
public class EncryptablePropertyPlaceholderConfigurer extends PropertyPlaceholderConfigurer {
    /******************************JDBC***************************************/
    private static final String JDBC_AES_KEY = "IcAvgpSJxzqcKnyx";

    /**数据库类型**/
    private static final String JDBC_DATASOURCE_URL_KEY = "jdbc.url";

    private static final String JDBC_DATASOURCE_USERNAME_KEY = "jdbc.username";

    private static final String JDBC_DATASOURCE_PASSWORD_KEY = "jdbc.password";

    /******************************JDBC相关END***************************************/

    protected void processProperties(ConfigurableListableBeanFactory beanFactory, Properties props)
            throws BeansException {
        try {
            String username = props.getProperty(JDBC_DATASOURCE_USERNAME_KEY);
            if (username != null) {
                props.setProperty(JDBC_DATASOURCE_USERNAME_KEY, AES.Decrypt(username, JDBC_AES_KEY));
            }

            String password = props.getProperty(JDBC_DATASOURCE_PASSWORD_KEY);
            if (password != null) {
                props.setProperty(JDBC_DATASOURCE_PASSWORD_KEY, AES.Decrypt(password, JDBC_AES_KEY));
            }

            String url = props.getProperty(JDBC_DATASOURCE_URL_KEY);
            if (url != null) {
                props.setProperty(JDBC_DATASOURCE_URL_KEY, AES.Decrypt(url, JDBC_AES_KEY));
            }

            super.processProperties(beanFactory, props);
        } catch (Exception e) {
            e.printStackTrace();
            throw new BeanInitializationException(e.getMessage());
        }
    }
}