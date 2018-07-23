package com.lames.client.validator;

import java.util.ArrayList;
import java.util.List;

public class UsernameValidator implements IValidator {
	private final String NOT_NULL="Username cannot be empty";

	
	public List<String> validate(String str) {
		// TODO Auto-generated method stub
		List<String> errMsg=new ArrayList<String>();
		if("".equals(str)) {
			errMsg.add(NOT_NULL);
		}
		return errMsg;
	}
	

}
