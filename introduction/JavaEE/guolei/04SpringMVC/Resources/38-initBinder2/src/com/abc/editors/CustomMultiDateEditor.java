package com.abc.editors;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.regex.Pattern;

import org.springframework.beans.TypeMismatchException;
import org.springframework.beans.propertyeditors.PropertiesEditor;

public class CustomMultiDateEditor extends PropertiesEditor {
	
	// 完成类型转换
	@Override
	public void setAsText(String source) throws IllegalArgumentException {
		try {
			SimpleDateFormat sdf = this.getSimpleDateFormat(source);
			Date date = sdf.parse(source);
			// 将转换后的结果注入给调用者
			setValue(date);
		} catch (ParseException e) {
			e.printStackTrace();
		}
	}
	
	private SimpleDateFormat getSimpleDateFormat(String source) {
		SimpleDateFormat sdf = new SimpleDateFormat();
		if(Pattern.matches("^\\d{4}-\\d{2}-\\d{2}$", source)) {             // 2017-05-24
			sdf.applyPattern("yyyy-MM-dd");
		} else if(Pattern.matches("^\\d{4}/\\d{2}/\\d{2}$", source)) {      // 2017/05/24
			sdf.applyPattern("yyyy/MM/dd");
		} else if(Pattern.matches("^\\d{4}\\d{2}\\d{2}$", source)) {        // 20170524
			sdf.applyPattern("yyyyMMdd");
		} else {
			throw new TypeMismatchException("", Date.class);
		}
		return sdf;
	}

}
