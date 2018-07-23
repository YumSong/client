package com.lames.client.validator;

import java.util.ArrayList;
import java.util.List;

public class PasswordValidator implements IValidator {
	private final String NOT_NULL="Password cannot be empty";

	public List<String> validate(String str) {
		// TODO Auto-generated method stub
		List<String> errMsgs=new ArrayList<String>();
		if("".equals(str)) {
			errMsgs.add(NOT_NULL);
		}
		return errMsgs;
	}

//	@Override
//	public List<String> validate(String str) {
//		// TODO Auto-generated method stub
//		List<String> errMsgs=new ArrayList<>();
//		if("".equals(str)) {
//			errMsgs.add(NOT_NULL);
//		}
//		return errMsgs;
//	}

}
