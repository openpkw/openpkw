package org.openpkw.repositories.configuration;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

/**
 * @author Tomasz Łabuz on 2015-07-17.
 */
@Configuration
@EnableJpaRepositories("org.openpkw.repositories")
public class JpaConfiguration {
}
