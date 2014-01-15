package com.platform.config;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.icesoft.faces.component.inputfile.FileInfo;

public class DynamicImageServlet extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3641274015118332086L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException

	{

	  try {

	   // Get image file.

	 
	   
	   File file = new File("e:/images/"+request.getParameter("file"));
	   
	   if (file.exists()){
	   
	   BufferedInputStream in = new BufferedInputStream(new FileInputStream(file.getPath()));

	    // Get image contents.
	    byte[] bytes = new byte[in.available()];

	   in.read(bytes);
	   in.close();

	   // Write image contents to response.
	   response.getOutputStream().write(bytes);
	   }else{
		   System.out.println("Brak pliku " +file.getName());
	   }

	} catch (IOException e) {

	e.printStackTrace();

	}

	}

	}
