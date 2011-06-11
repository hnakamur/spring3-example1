package example1.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import example1.dao.AdminDAO;
import example1.domain.Admin;

@Controller
@RequestMapping(value="/hello")
public class HelloController {
	@Autowired
	private AdminDAO adminDAO;
	
	public void setAdminDAO(AdminDAO adminDAO) {
		this.adminDAO = adminDAO;
	}


	@RequestMapping(method=RequestMethod.GET)
	public String doGet() {
		List<Admin> admins = adminDAO.selectAdmin();
		return "hello";
	}
}
