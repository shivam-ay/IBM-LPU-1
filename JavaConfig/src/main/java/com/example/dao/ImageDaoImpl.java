package com.example.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.example.bean.Image;

@Repository("imagedaoimpl")
public class ImageDaoImpl implements ImageDao
{
	private JdbcTemplate jdbcTemplate;
	@Autowired
	public ImageDaoImpl(JdbcTemplate jdbcTemplate)
	{
		this.jdbcTemplate = jdbcTemplate;
	}
	@Override
	public void createImage(Image image)
	{
		String sql = "insert into images(imageid,imageurl) values('"+image.getImageID()+""
										+"',"+"'"+image.getImageURL()+"'"+")";
		jdbcTemplate.update(sql);
		System.out.println("created");
	}
	
}
