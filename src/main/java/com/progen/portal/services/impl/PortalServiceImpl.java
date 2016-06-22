package com.progen.portal.services.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.progen.portal.beans.UserBean;
import com.progen.portal.dao.PortalDao;
import com.progen.portal.pojos.UserPojo;
import com.progen.portal.services.PortalService;

public class PortalServiceImpl implements PortalService{

	@Autowired
	private PortalDao portalDao;

	@Override
	public List<UserBean> getUserLIst() {
		List<UserBean> userBeanList = new ArrayList<UserBean>();
		List<UserPojo> userPojoList = portalDao.getUserList();
		for(UserPojo userPojo:userPojoList){
			UserBean userBean = new UserBean();
			userBean.setId(userPojo.getId());
			userBean.setUsername(userPojo.getUsername());
			userBean.setPassword(userPojo.getPassword());
			userBean.setEmail(userPojo.getEmail());
			userBeanList.add(userBean);
		}
		return userBeanList;
	}
}
