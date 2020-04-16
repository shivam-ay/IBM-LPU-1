package com.example.bean;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class ImageMapper implements RowMapper<Image>
{

	@Override
	public Image mapRow(ResultSet rs, int rowNum) throws SQLException 
	{
		Image img = new Image();
		img.setImageID(rs.getString(1));
		img.setImageURL(rs.getString(2));
		return img;
	}

}
