package controller;

import model.User;
import model.UserDao;
import br.com.caelum.vraptor.Path;
import br.com.caelum.vraptor.Resource;
import br.com.caelum.vraptor.Result;
import br.com.caelum.vraptor.Validator;

@Resource
public class UserController {
	private final Result result;
	private final UserDao dao;
	
	public UserController(Result result, UserDao dao) {
		this.result = result;
		this.dao = dao;
	}
	
	@Path("/usuarios/cadastrar/")
	public void userForm() {
		return;
	}
	
	@Path("/usuarios/salvar/")
	public void save(User user) {
		dao.save(user);
		result.redirectTo(IndexController.class).index();
	}
	
	
	
}