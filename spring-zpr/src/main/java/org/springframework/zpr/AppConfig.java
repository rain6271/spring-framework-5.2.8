package org.springframework.zpr;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.PropertySource;


/**
 * TODO
 *
 * @author WangYu
 * @date 2023/11/29 16:23
 */
@PropertySource("classpath:spring.properties")
@ComponentScan("org.springframework.zpr.bean")
public class AppConfig {


}
