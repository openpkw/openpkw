package org.openpkw.repositories.configuration;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

/**
 * @author Tomasz Łabuz on 2015-07-17.
 */
@Configuration
@EnableJpaRepositories(
        basePackages = {"org.openpkw.repositories"},
        entityManagerFactoryRef = "emf")
public class JpaConfiguration {
}
