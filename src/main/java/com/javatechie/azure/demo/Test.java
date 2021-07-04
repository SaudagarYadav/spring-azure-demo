package com.javatechie.azure.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.azure.data.appconfiguration.ConfigurationClient;
import com.azure.data.appconfiguration.ConfigurationClientBuilder;
import com.azure.data.appconfiguration.models.ConfigurationSetting;


@RestController()
public class Test {

	private ConfigurationClient configurationClient;

	@GetMapping("/deploy")
	public String test() {
		return "Finally deployed";
	}
	
	@GetMapping("/map")
	public String test1() {
		
		configurationClient = new ConfigurationClientBuilder()
			    .connectionString("Endpoint=https://testappfeature.azconfig.io;Id=rf3B-l0-s0:WwOhYCrWi9tVxih6c4+A;Secret=OjTFPEt+54FgTTv8oLk2eJ+qCn6Z/Gb9Tgx2Fhd62Dw=")
			    .buildClient();
		return configurationClient.getConfigurationSetting("certification", "").getValue();
		
	}
	
	
	
}
