package com.steveleejava.assembly;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.steveleejava.sample.dao.CommonDao;
@Controller
@RequestMapping("/TestMybatis")
public class MybatisTestController implements CommonDao{

	private SqlSession sqlsession;
	public MybatisTestController(SqlSession sqlsession) {
		this.sqlsession=sqlsession;
	}
	@Override
	public String testSql(String userIDparam) {
		return sqlsession.selectOne("testSql",userIDparam);
	}
	
	@GetMapping("/")
	public String useMybatis(HttpServletRequest request, HttpServletResponse response,Model model){
		String temp;
		temp=testSql("steve");
		model.addAttribute(temp);

		return "tiles.layout";
	}
	
}
