package com.abc.aop05;

public class SomeServiceImpl implements ISomeService {

	@Override
	public boolean checkUser(String username, String password) throws UserException {
		if(!"rjxy".equals(username)) {
			throw new UsernameException("用户名有误！");
		}
		if(!"111".equals(password)) {
			throw new PasswordException("密码有误！");
		}
		// int i = 3 / 0;
		return true;
	}


}
