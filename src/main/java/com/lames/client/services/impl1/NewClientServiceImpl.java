package com.lames.client.services.impl1;

import com.lames.client.dao.IClientDao;
import com.lames.client.dao.impl1.NewClientDaoImpl;
import com.lames.client.model1.NewClientEntity;
import com.lames.client.services.IClientService;

public class NewClientServiceImpl implements IClientService {
	private IClientDao clientDao;
	
	

	public NewClientServiceImpl() {
		clientDao=new NewClientDaoImpl();
	}

	public NewClientEntity login(String name, String password){
		NewClientEntity client=clientDao.find(name, password);
		if(client==null) {
			return null;
		}else {
			return client;
		}
		
	}

	public NewClientEntity checkName(NewClientEntity c) {
		return clientDao.findByName(c.getName());
	}
	
	public NewClientEntity register(NewClientEntity c) {
//		if(clientDao.findByName(c.getName())!=null) {
//			return null;
//		}
		NewClientEntity client1=clientDao.persist(c);
		if(client1==null) {
			return null;
		}else {
			return client1;
		}

	}

	public NewClientEntity loginByClient(NewClientEntity c) {
		// TODO Auto-generated method stub
		NewClientEntity client2=clientDao.findByClient(c);
		if(client2==null) {
			return null;
		}else {
			return client2;
		}
		
	}

}
