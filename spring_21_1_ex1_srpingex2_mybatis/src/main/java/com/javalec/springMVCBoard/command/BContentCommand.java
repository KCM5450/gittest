package com.javalec.springMVCBoard.command;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.ibatis.session.SqlSession;
import org.springframework.ui.Model;

import com.javalec.springMVCBoard.dao.BDao;
import com.javalec.springMVCBoard.dao.IDao;
import com.javalec.springMVCBoard.dto.BDto;
import com.javalec.springMVCBoard.util.Constant;

public class BContentCommand implements BCommand {

	@Override
	public void execute(Model model) {

		SqlSession sqlSession = Constant.sqlSession;

		Map<String, Object> map = model.asMap();
		HttpServletRequest request = (HttpServletRequest) map.get("request");
		String bId = request.getParameter("bId");
		
		IDao dao = sqlSession.getMapper(IDao.class);
		//BDto dto = dao.contentView(bId);
		
		dao.upHit(bId);
		model.addAttribute("content_view",dao.contentView(bId));
		
	}

}
