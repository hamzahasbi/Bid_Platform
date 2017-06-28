package com.Bid_Platform.controller;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileItemFactory;
import org.apache.commons.fileupload.FileUploadException;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;

import com.Bid_Platform.model.Data_base_utils;
import com.Bid_Platform.model.Owner;
import com.Bid_Platform.model.Produit;

@WebServlet("/addProduct")
public class AddProduct extends HttpServlet {
  protected void doGet(HttpServletRequest request, HttpServletResponse response)
             throws ServletException, IOException {
	
	  	String serie=(String) request.getParameter("serie");
	  	System.out.println(serie);
	  	double prix=Double.parseDouble(request.getParameter("prix"));
	  	String categorie=request.getParameter("select");
        String email=request.getParameter("owner_email");
        String description=request.getParameter("description");
        String nom=request.getParameter("nom");
        boolean isMultipart = ServletFileUpload.isMultipartContent(request);
         if (isMultipart) {
        	 System.out.println("test");
          // Create a factory for disk-based file items
          FileItemFactory factory = new DiskFileItemFactory();

          // Create a new file upload handler
          ServletFileUpload upload = new ServletFileUpload(factory);
  
             try {
              // Parse the request
              List /* FileItem */ items = upload.parseRequest(request);
                 Iterator iterator = items.iterator();
                 while (iterator.hasNext()) {
                     FileItem item = (FileItem) iterator.next();
                     if (!item.isFormField()) {
                         String fileName = item.getName();  
                         String root = getServletContext().getRealPath("/");
                         System.out.println("hada root "+ root);
                         File path = new File(root);
                         if (!path.exists()) {
                             boolean status = path.mkdirs();
                         }
  
                         File uploadedFile =  new File("F:\\Web\\Bid_Platform\\WebContent\\ressources" + File.separator+serie + ".jpg");
                         System.out.println(path+"->"+fileName);
                         System.out.println("hade file "+ uploadedFile.getAbsolutePath());
                         item.write(uploadedFile);
                     }
                 }
             } catch (FileUploadException e) {
                 e.printStackTrace();
             } catch (Exception e) {
                 e.printStackTrace();
             }
             String photo=serie+".jpg";
             HttpSession session=request.getSession();
             Produit produit=new Produit(serie,nom,description,photo,"neuf",(Owner)session.getAttribute("current"),prix,categorie,1);
             produit.insert();
         }
     }

}
