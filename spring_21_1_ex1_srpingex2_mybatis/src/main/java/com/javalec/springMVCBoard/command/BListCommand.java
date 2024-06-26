package com.javalec.springMVCBoard.command;

import org.apache.ibatis.session.SqlSession;
import org.springframework.ui.Model;

import com.javalec.springMVCBoard.dao.IDao;
import com.javalec.springMVCBoard.util.Constant;

public class BListCommand implements BCommand {

	SqlSession sqlSession = Constant.sqlSession;

	@Override
	public void execute(Model model) {

		IDao dao = sqlSession.getMapper(IDao.class);
		// ArrayList<BDto> dtos = dao.list();
		model.addAttribute("list", dao.list());

	}

}