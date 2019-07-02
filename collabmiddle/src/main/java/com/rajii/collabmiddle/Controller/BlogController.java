package com.rajii.collabmiddle.Controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import collabmiddleBackEnd.Model.Blogs;





@RestController
public class BlogController 
{
	 public BlogController()
	{
		System.out.println("Blog is loading");
	}
	@RequestMapping("/getBlogs")
	public List<Blogs> getBlogs()
	{
		Blogs blog1 = new Blogs();
		Blogs blog2 = new Blogs();
		
		blog1.setBlogname("Moto");
		blog1.setBlogtitle("products");
		blog1.setBlogowner("rajii");
		
		blog2.setBlogname("LED");
		blog2.setBlogtitle("TV");
		blog2.setBlogowner("Donald");
		
		List<Blogs> list= new ArrayList<Blogs>();
		
		list.add(blog1);
		list.add(blog2);
		
		return list;
			
	}
	@PostMapping("/addblog")
	public void addBlog(@RequestBody Blogs blogs)
	{
		  System.out.println(blogs.getBlogname());
		  System.out.println(blogs.getBlogtitle());
		  System.out.println(blogs.getBlogowner());
	}

}
