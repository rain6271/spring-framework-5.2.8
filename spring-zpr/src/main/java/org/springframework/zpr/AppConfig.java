package org.springframework.zpr;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.PropertySource;
import org.springframework.zpr.bean.AwareBean;
import org.springframework.zpr.bean.ImportAwareBean;


/**
 * TODO
 *
 * @author WangYu
 * @date 2023/11/29 16:23
 */
@ComponentScan("org.springframework.zpr.bean")
@Import(ImportAwareBean.class)
public class AppConfig {


}
