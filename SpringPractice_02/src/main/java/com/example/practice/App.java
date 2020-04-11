package com.example.practice;

import com.example.dao.PersonInfoDao;
import com.example.dao.PersonInfoDaoImpl;


public class App 
{
	private static PersonInfoDao dao = new PersonInfoDaoImpl();
    public static void main( String[] args )
    {
    	dao.getPersonInfo();
    }
}
