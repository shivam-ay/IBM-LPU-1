package com.example.demo;

import java.util.UUID;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.example.bean.Image;
import com.example.config.MyAppConfig;
import com.example.dao.ImageDao;
import com.example.dao.ImageDaoImpl;

public class App 
{
    public static void main( String[] args )
    {
    	AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(MyAppConfig.class);
        Image image=context.getBean("image",Image.class);
        image.setImageID(UUID.randomUUID().toString());
        image.setImageURL("demo url");
        ImageDao img = context.getBean("imagedaoimpl",ImageDaoImpl.class);
        img.createImage(image);
    }
}
