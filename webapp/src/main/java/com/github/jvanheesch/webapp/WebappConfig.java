package com.github.jvanheesch.webapp;

import com.github.jvanheesch.flyway.FlywayConfig;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Import(FlywayConfig.class)
@Configuration
public class WebappConfig {
}
