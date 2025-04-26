// Declare the package where this class belongs
package com.sample;

// Import necessary Spring Web annotations
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMethod;

// Mark this class as a REST controller, so Spring knows to handle HTTP requests here
@RestController
public class SampleController {

    // Handles GET requests to the root path "/"
    @RequestMapping(value="/", method=RequestMethod.GET)
    public String home() {
        return new String("Fine");
    }

    // Handles GET requests to "/{seviceid}" (path variable for service ID)
    @RequestMapping(value="/{seviceid}", method=RequestMethod.GET)
    public String pingPath1() {
        return new String(original:"OK");
    }

    // Handles GET requests to "/{seviceid}/{pathvar1}"
    @RequestMapping(value="/{seviceid}/{pathvar1}", method=RequestMethod.GET)
    public String pingPath2() {
        return new String(original:"OK");
    }

    // Handles GET requests to "/{seviceid}/{pathvar1}/{pathvar2}"
    @RequestMapping(value="/{seviceid}/{pathvar1}/{pathvar2}", method=RequestMethod.GET)
    public String pingPath3() {
        return new String(original:"OK");
    }
    
    @RequestMapping(value="/hello", method=RequestMethod.GET)
    public String hello() {
        return "Hello World!";
    }
}
