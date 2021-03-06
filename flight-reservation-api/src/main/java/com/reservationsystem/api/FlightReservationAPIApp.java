/**
 * @author Nitinkumar Gove
 * @version 1.0
 */
package com.reservationsystem.api;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication   // annotate the class to indicate spring boot application
public class FlightReservationAPIApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/**
		 * Calling run method does following important things - 
		 * 1. Scan the class path 
		 * 2. Start tomcat server
		 * 3. Start Spring application context
		 * 4. Set up default configuration
		 */
		SpringApplication.run(FlightReservationAPIApp.class, args);

	}

}
