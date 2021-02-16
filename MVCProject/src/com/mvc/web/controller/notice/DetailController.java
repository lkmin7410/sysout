package com.mvc.web.controller.notice;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jdbc.app.entity.Notice;
import com.jdbc.app.entity.NoticeComment;
import com.mvc.web.service.NoticeService;

@WebServlet("/notice/detail")
public class DetailController extends HttpServlet{
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		int id = Integer.parseInt(req.getParameter("id"));
		NoticeService ns = new NoticeService();
		ns.countNoticeHit(id); //hit 카운트
		Notice nt = ns.getNoticeDetail(id); //페이지 호출
		
		NoticeComment nc = new NoticeComment();
		req.setAttribute("nt", nt);
		int comCount=0;
		comCount = ns.getNoticeCommentCount(id);
		
		if(comCount !=0) {
			List<NoticeComment> list = ns.getCommentList(id);
			req.setAttribute("comList", list);
		}
		System.out.println("count: "+comCount);
		req.setAttribute("count", comCount);
		req.getRequestDispatcher("/WEB-INF/view/notice/detail.jsp").forward(req, resp);
		
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		req.setCharacterEncoding("UTF-8"); //한글깨짐 수정 코드
		resp.setContentType("text/html; charset=UTF-8");
		
		String comment = req.getParameter("comment");
		String pid = req.getParameter("pageID");
		int pageID = Integer.parseInt(pid);
		
		String writerID= req.getParameter("writerID");
		int result = 0;
		NoticeService ns = new NoticeService();
		NoticeComment nc = new NoticeComment();
		
		nc.setMid(pageID);
		nc.setComment(comment);
		nc.setWriterID(writerID);
		
		result = ns.insertNoticeComment(nc);
		
		System.out.println("comment : "+comment);
		
		resp.sendRedirect("detail?id="+pid);
		
	}
}
