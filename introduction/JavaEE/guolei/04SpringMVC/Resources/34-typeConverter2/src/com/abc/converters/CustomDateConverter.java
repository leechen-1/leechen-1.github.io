package com.abc.converters;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.regex.Pattern;

import org.springframework.core.convert.converter.Converter;

// 自定义日期类型转换器
public class CustomDateConverter implements Converter<String, Date> {

	@Override
	public Date convert(String source) {
		try {
			if(source != null && !source.equals("")) {
				SimpleDateFormat sdf = getSimpleDateFormat(source);
				return sdf.parse(source);
			}
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return null;
	}

	private SimpleDateFormat getSimpleDateFormat(String source) {
		SimpleDateFormat sdf = new SimpleDateFormat();
		if(Pattern.matches("^\\d{4}-\\d{2}-\\d{2}$", source)) {             // 2017-05-24
			sdf.applyPattern("yyyy-MM-dd");
		} else if(Pattern.matches("^\\d{4}/\\d{2}/\\d{2}$", source)) {      // 2017/05/24
			sdf.applyPattern("yyyy/MM/dd");
		} else if(Pattern.matches("^\\d{4}\\d{2}\\d{2}$", source)) {        // 20170524
			sdf.applyPattern("yyyyMMdd");
		}
		return sdf;
	}

}
