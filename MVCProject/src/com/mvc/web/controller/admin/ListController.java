package com.mvc.web.controller.admin;

import java.io.IOException;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.jdbc.app.entity.Notice;
import com.mvc.web.service.NoticeService;

@WebServlet("/admin/board/notice/list") //4
public class ListController extends HttpServlet{
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String[]openIds = req.getParameterValues("open");
		String[]delIds = req.getParameterValues("del");
		String cmd = req.getParameter("cmd");
		System.out.println("cmd :" +cmd);
		
		switch(cmd) {
		case "OpenAll" :
//				for(String s : openIds) {
//					System.out.println("open: "+s);
//				}
			break;
			
		case "DelAll" :
//			for(String s : delIds) {
//				System.out.println("del: "+s);
//			}
			int ids[]= new int[delIds.length];
			for(int i = 0; i<ids.length;i++) {
				ids[i]=Integer.parseInt(delIds[i]);
			}
			NoticeService ns = new NoticeService();
			int result = ns.deleteNoticeAll(ids);
			break;
		}
		
		resp.sendRedirect("list");
	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		NoticeService ns = new NoticeService();
		//파라미터 받기
		String page_ = req.getParameter("p");
		String filed_ =req.getParameter("f");
		String query_ =req.getParameter("q");
		
		//매개변수 초기화
		int page =1;
		String filed = "title";
		String query = "";
		
		//null값 보완 및 매개변수 입력
		if(page_ != null && !page_.equals("")) {
			page = Integer.parseInt(page_);
		}
		
		if(filed_ != null && !filed_.equals("")) {
			filed = filed_;
		}
		if(query_ != null && !query_.equals("")) {
			query = query_;
		}
		System.out.println("페이지:"+page);
		System.out.println("찾고자하는 컬럼:"+filed);
		System.out.println("검색어"+query);
		
		
		
		List<Notice>list = ns.getNoticeList(page,filed,query); 
		
		int count = 0;
		count = ns.getNoticeCount(filed,query);
		
		req.setAttribute("noticeList", list); // list보내기
		req.setAttribute("count", count); //조회 된 목록 갯수
		req.getRequestDispatcher("/WEB-INF/view/admin/board/notice/list.jsp").forward(req, resp); //req에 저장한 값을 저 주소로 보내준다. 3
		
	}
}
