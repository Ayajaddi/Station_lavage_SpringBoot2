package com.gestion.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.gestion.Repository.AgentRepository;
import com.gestion.models.AuthenticationRequest;
import com.gestion.models.AuthenticationResponse;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api")
public class AgentController {
	@Autowired
	private AgentRepository  agentRepository ;


	@PostMapping("/auth")
		private ResponseEntity<?> authenticateClient(@RequestBody AuthenticationRequest authenticationRequest)
	{
		String username= authenticationRequest. getLogin();
		String password= authenticationRequest.getPassword();
		
		
		
		
		return ResponseEntity.ok(new AuthenticationResponse("successful subscribtion for client " +username));
	}
}




	 /* public String login(@ModelAtrtibute("agent")Agent agent){
		Agent oauthAgent=agentMetierImpl.login(agent.getLogin(),agent.getPassword());
		 System.out.print(oauthAgent);
		 if(Objects.nonNull(oauthAgent)){
			 return "redirect:/";
		 }
		 
		 else{
			 return "redirect:/login";
		 }
	 }
	 */