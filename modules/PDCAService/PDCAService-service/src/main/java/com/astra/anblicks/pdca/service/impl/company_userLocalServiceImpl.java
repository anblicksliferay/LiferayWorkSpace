/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.astra.anblicks.pdca.service.impl;

import com.astra.anblicks.pdca.exception.NoSuchcompany_userException;
import com.astra.anblicks.pdca.model.company_user;
import com.astra.anblicks.pdca.service.base.company_userLocalServiceBaseImpl;

import java.util.List;

/**
 * The implementation of the company_user local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link com.astra.anblicks.pdca.service.company_userLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see company_userLocalServiceBaseImpl
 * @see com.astra.anblicks.pdca.service.company_userLocalServiceUtil
 */
public class company_userLocalServiceImpl
	extends company_userLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this class directly. Always use {@link com.astra.anblicks.pdca.service.company_userLocalServiceUtil} to access the company_user local service.
	 */
	
	/*public  java.util.List<com.ys.hmawfm.wfms.services.model.WFMS_Position> findByrefPosId(
	java.lang.String refPosId)
	throws com.liferay.portal.kernel.exception.SystemException {
	return wfms_PositionPersistence.findByrefPosId(refPosId);
}*/

/*public List<> getUserList(Long companyId) throws com.liferay.portal.kernel.exception.SystemException{

return astraPdca_C*/
	
	/*public List<company_user> getUserListByCompanyId(long companyId) throws com.liferay.portal.kernel.exception.SystemException, NoSuchcompany_userException {
		
		return  (List<company_user>) company_userPersistence.findBygetByUserId(companyId);
	}*/
	
public List<company_user> getUserListByCompanyId(long companyId) throws com.liferay.portal.kernel.exception.SystemException, NoSuchcompany_userException {
		
	
		return  (List<company_user>) company_userPersistence.findBygetByUserList(companyId);
	}
}