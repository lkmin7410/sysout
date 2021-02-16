package com.mvc.web.controller.admin;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Collection;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

import com.jdbc.app.entity.Notice;
import com.mvc.web.service.NoticeService;
@MultipartConfig(
//		location="/tmp", //파일이 어디에 저장이 될 건지 지정
		fileSizeThreshold = 1024*1024, //데이터 단위는 byte, 1kb *1kb = 1m
		maxFileSize = 1024*1024*50, //최대 업로드 가능 용량 
		maxRequestSize = 1024*1024*50*5 //전체 요청에 대한 파일 용량
		)


@WebServlet("/admin/board/notice/reg")
public class regController extends HttpServlet{

		@Override
		protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
		
		req.getRequestDispatcher("/WEB-INF/view/admin/board/notice/reg.jsp").forward(req, resp);
			
		}
		
		@Override
		protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
			req.setCharacterEncoding("UTF-8");
			String title = req.getParameter("title");
			String content = req.getParameter("content");
			String open = req.getParameter("open");
			boolean pub = Boolean.parseBoolean(open);
			
			Collection<Part>parts= req.getParts();
			StringBuilder builder = new StringBuilder();
			
			for(Part p : parts) {
				if(!p.getName().equals("file") || p.getSize()==0) continue;
				
				Part filePart = p;
				
			String fileName = p.getSubmittedFileName();
			builder.append(fileName);
			builder.append(",");
				
			InputStream fis = p.getInputStream();
			String realPath = req.getServletContext().getRealPath("/upload"); //파일 업로드 할 경로 지정
			System.out.println("realpath :"+ realPath);
			
			String filePath = realPath + File.separator + fileName;
			
			File fl = new File(realPath);
			if(!fl.exists())
				fl.mkdirs();
			
			FileOutputStream fos = new FileOutputStream(filePath);
			
			byte[] buf = new byte[1024];
			int size = 0;
			
			while((size= fis.read(buf))!=-1)
				fos.write(buf,0,size);
			
			fos.close();
			fis.close();
			}
			
			builder.delete(builder.length()-1, builder.length());
			
			System.out.println("빌더:"+builder.toString());
			
			int result = 0;
			Notice nt = new Notice();
			
			nt.setTitle(title);
			nt.setContent(content);
			nt.setWriterID("이경민");
			nt.setFiles(builder.toString());
			nt.setPub(pub);
			
			NoticeService ns = new NoticeService();
			result = ns.insertNotice(nt);
			resp.setContentType("text/html;charset=UTF-8");
			resp.sendRedirect("list");
	
//			PrintWriter out = resp.getWriter();
//			out.printf("title: "+ title+" ");
//			out.printf("content: "+ content+" ");
//			out.printf("open: "+ open+" ");
			
		}
}
