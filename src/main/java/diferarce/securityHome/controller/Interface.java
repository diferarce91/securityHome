package diferarce.securityHome.controller;

import jssc.SerialPortException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import diferarce.securityHome.domain.MicroControllerHandler;


@Controller
@RequestMapping("/led")
public class Interface {
	
	@Autowired
	MicroControllerHandler deviceHandler;
	
	@RequestMapping("/on")
	@ResponseBody
	public String changeState(@RequestParam(required=true)String command ){
		
		try {
			System.out.println(command);
			deviceHandler.sendData(command,"device1");			
		} catch (SerialPortException e) {			
			e.printStackTrace();
		}		
		
		return "Bien";
	}
	
	@RequestMapping("/init")
	@ResponseBody
	public String init(){
		
		return "INIT";
	}
		
}

