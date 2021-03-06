package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class Controller {
	@PostMapping("/encrypt")
	@ResponseBody
	public EReturn getEncryptedData(@RequestBody EModel emodel) throws Exception {
		
		
		
		
	    return EncryptNewData.getFHIRDoc(emodel.getEncryptData(), emodel.getReceiverPublicKey(), emodel.getRandomReceiver());
	}
}
