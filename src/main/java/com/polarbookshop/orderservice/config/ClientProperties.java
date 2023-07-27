/**
 * 
 */
package com.polarbookshop.orderservice.config;

import java.net.URI;
import javax.validation.constraints.NotNull;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @author Gbenga
 *
 */
@ConfigurationProperties(prefix = "polar")
public record ClientProperties (

	@NotNull
	URI catalogServiceUri

){}

