package com.camtest.backend.testapi.controller;


import javax.servlet.http.HttpServletResponse;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


/**
 * Class AllControllers
 */
@RestController
@RequestMapping("/api/v1/jaxrsclient")
public class AllControllers
{

    @GetMapping("/users")
    @ResponseBody
    @CrossOrigin(origins = "https://gentle-coast-02a43f403.2.azurestaticapps.net")
    public String getUsers(HttpServletResponse response)
    {
        response.setContentType("application/json");

        String usersJson =
            "[{\"name\" : \"sesi\", \"email\" :\"sesi@amadeus.com\"},{\"name\" : \"rekha\", \"email\" :\"rekha@amadeus.com\"},{\"name\" : \"sesirekha\", \"email\" :\"sesirekha@amadeus.com\"}]";

        return usersJson;
    }
    
    @GetMapping("/systems")
    @ResponseBody
    @CrossOrigin(origins = "https://gentle-coast-02a43f403.2.azurestaticapps.net")
    public String getSystems(HttpServletResponse response)
    {
        response.setContentType("application/json");

        String systems = 
        		"[{\"corporate_id\":\"874568\",\"corporatecode\":\"TestSystem\",\"parent_id\":\"852567\"},{\"corporate_id\":\"877768\",\"corporatecode\":\"First\",\"parent_id\":\"852567\"},{\"corporate_id\":\"8775868\",\"corporatecode\":\"Bangalore\",\"parent_id\":\"8528567\"},{\"corporate_id\":\"8774868\",\"corporatecode\":\"QASystem\",\"parent_id\":\"8528567\"},{\"corporate_id\":\"8854868\",\"corporatecode\":\"Hotel\",\"parent_id\":\"8528567\"},{\"corporate_id\":\"8854868\",\"corporatecode\":\"Air\",\"parent_id\":\"8528567\"}]";

        return systems;
    }


}
