package com.mx.acquisitions.ms.ax.acquisitions;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
@ComponentScan(basePackages = {"com.mx.acquisitions.ms.ax.acquisitions"})
public class MsAxAcquisitionsApplication {

	public static void main(String[] args) {
		SpringApplication.run(MsAxAcquisitionsApplication.class, args);
	}

}
