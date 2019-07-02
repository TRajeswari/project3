package com.rajii.collabmiddle.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController
{
public HomeController()
{
	System.out.println("home is loading");
}
@RequestMapping("/testing")
public String test()
{
	return "hello";
}
}
