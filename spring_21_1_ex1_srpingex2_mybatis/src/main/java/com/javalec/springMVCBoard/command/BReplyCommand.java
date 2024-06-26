package com.javalec.springMVCBoard.command;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.ibatis.session.SqlSession;
import org.springframework.ui.Model;

import com.javalec.springMVCBoard.dao.IDao;
import com.javalec.springMVCBoard.util.Constant;

public class BReplyCommand implements BCommand {

	@Override
	public void execute(Model model) {
		SqlSession sqlSession = Constant.sqlSession;

		Map<String, Object> map = model.asMap();
		HttpServletRequest request = (HttpServletRequest) map.get("request");
		
		
		String bId = request.getParameter("bId");
		String bName = request.getParameter("bName");
		String bTitle = request.getParameter("bTitle");
		String bContent = request.getParameter("bContent");
		String bGroup = request.getParameter("bGroup");
		String bStep = request.getParameter("bStep");
		String bIndent = request.getParameter("bIndent");

		
		IDao dao = sqlSession.getMapper(IDao.class);
		dao.reply(bId, bName, bTitle, bContent, bGroup, bStep, bIndent);
		
	}

}
