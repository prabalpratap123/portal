package com.progen.portal.dao.rdbms;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import com.progen.portal.dao.PortalDao;
import com.progen.portal.pojos.UserPojo;

public class PortalDaoRdbms implements PortalDao{

	@Autowired
	private SessionFactory sessionFactory;

	public PortalDaoRdbms() {
		
	}
	
	public PortalDaoRdbms(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@Override
	@Transactional
	public List<UserPojo> getUserList() {
		@SuppressWarnings("unchecked")
		List<UserPojo> listUser = (List<UserPojo>) sessionFactory.getCurrentSession()
				.createCriteria(UserPojo.class)
				.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY).list();

		return listUser;
	}

	

}
