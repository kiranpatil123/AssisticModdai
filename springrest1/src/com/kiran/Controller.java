package com.kiran;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class Controller {
	
	/*@Autowired
	EmployeeService empservice;
*/
	@RequestMapping(value = "/welcome")
	// @ResponseBody
	public Employee getAllEmployee() {
		Employee emp = new Employee();
		emp.setEid(100);
		emp.setEname("Kiran"); 
		//empservice.getEmployee();
		return emp;

	}

	@RequestMapping(value = "/hello")
	public ModelAndView myMethod() {
		ModelAndView model = new ModelAndView("hello");
		return model;
	}
    @RequestMapping(value="/hai/{ename}",method=RequestMethod.PUT)
	public boolean putMethod(@PathVariable("ename") String ename,@RequestBody Employee emp) {
    	
    	System.out.println(emp.getEid());
    	System.out.println(emp.getEname());
		return true;

	}
    @RequestMapping(value="/employee",consumes=org.springframework.http.MediaType.APPLICATION_JSON_VALUE,method=RequestMethod.POST)
    public ResponseEntity<Boolean> postMethod(@RequestBody Employee emp){
    	System.out.println(emp.getEid());
    	System.out.println(emp.getEname());
    	
    	HttpHeaders headers=new HttpHeaders();
    	headers.add("kiran", "patil");
		//return new ResponseEntity<Boolean>(true, HttpStatus.NOT_FOUND);
    	return new ResponseEntity<Boolean>(true,headers,HttpStatus.CREATED);
    	
    }
    @RequestMapping(value="/kiran")
    public void getAllEmployee1(){
    	EmployeeServices emp=new EmployeeServices();
    	emp.getAllEmployee1();
    }

}
