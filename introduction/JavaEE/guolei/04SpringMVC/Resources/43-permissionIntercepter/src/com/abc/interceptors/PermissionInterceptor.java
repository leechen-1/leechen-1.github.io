package com.abc.interceptors;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

public class PermissionInterceptor implements HandlerInterceptor {

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		// session对象的获取方式总结：
		// 1)若要向session中存放数据，一般情况下使用session.getSession()，其等价于session.getSession(true)，表示的意义为：
		//   当前请求若存在Session对象，则使用当前存在的Session；当前若不存在Session对象，则新建一个Session对象。
		// 2)若要从session中获取数据，一般情况下使用session.getSession(false)，表示的意义为：
		//   当前请求若存在Session对象，则从当前存在的Session中获取指定属性的值；当前若不存在Session对象，则要获取的指定数据肯定是没有的，
		//   所以，无需创建Session对象
		HttpSession session = request.getSession(false);
		if (session != null) {
			String user = (String) session.getAttribute("user");
			if("aynu".equals(user)) {
				return true;
			}
		}
		// 在请求转发与重定向均可使用的前提下，建议使用重定向。为了防止恶意刷新。
		response.sendRedirect(request.getContextPath() + "/message.jsp");
		return false;
	}

	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {
	}

	@Override
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex)
			throws Exception {
	}

}
