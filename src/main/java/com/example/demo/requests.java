package com.example.demo;

import java.util.ArrayList;

import org.springframework.stereotype.Service;

@Service
public class requests implements requestService {

	public ArrayList<String[]> search(String r, String a) {
		String newArr[] = {r,a};
		ArrayList<String[]> list = new ArrayList<String[]>();
		list.add(newArr);
		return list;
	}

	public String delete() {
		// TODO Auto-generated method stub
		return null;
	}
	
}
