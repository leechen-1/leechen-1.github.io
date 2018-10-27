package com.abc.dao;

import java.util.List;

import com.abc.beans.NewsLabel;

public interface INewsLabelDao {
	// 查询出指定栏目的所有子孙栏目
	List<NewsLabel> selectChildrenByParent(int pid);
}



