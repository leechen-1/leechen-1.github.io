package com.abc.dao;

import com.abc.beans.NewsLabel;

public interface INewsLabelDao {
	// 查询出指定栏目及其所有父辈栏目
	NewsLabel selectNewsLabelById(int id);
}



