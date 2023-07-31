/**
 * 
 */
package com.javainuse.source;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.messaging.MessageChannel;

/**
 * @author Omkar
 */
public interface EmployeeRegistrationSink {
	@Input("employeeRegistrationInChannel")
	MessageChannel employeeRegistration();
}
