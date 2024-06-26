package com.javalec.springMVCBoard.command;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.ibatis.session.SqlSession;
import org.springframework.ui.Model;

import com.javalec.springMVCBoard.dao.IDao;
import com.javalec.springMVCBoard.dto.BDto;
import com.javalec.springMVCBoard.util.Constant;

public class BReplyViewCommand implements BCommand {

	@Override
	public void execute(Model model) {
		
		SqlSession sqlSession = Constant.sqlSession;
		
		Map<String, Object> map = model.asMap();
		HttpServletRequest request = (HttpServletRequest) map.get("request");
		String bId = request.getParameter("bId");
		
		IDao dao = sqlSession.getMapper(IDao.class);
		BDto dto = dao.reply_view(bId);
		
		model.addAttribute("reply_view", dto);
		
	}

}
