package org.genia.links.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@ComponentScan(basePackages = {"org.genia.links"})
@Import({DataBaseConfig.class})
public class ApplicationConfig {
}
