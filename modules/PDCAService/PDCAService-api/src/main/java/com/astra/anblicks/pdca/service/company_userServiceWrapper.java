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

package com.astra.anblicks.pdca.service;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link company_userService}.
 *
 * @author Brian Wing Shun Chan
 * @see company_userService
 * @generated
 */
@ProviderType
public class company_userServiceWrapper implements company_userService,
	ServiceWrapper<company_userService> {
	public company_userServiceWrapper(company_userService company_userService) {
		_company_userService = company_userService;
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	@Override
	public java.lang.String getOSGiServiceIdentifier() {
		return _company_userService.getOSGiServiceIdentifier();
	}

	@Override
	public company_userService getWrappedService() {
		return _company_userService;
	}

	@Override
	public void setWrappedService(company_userService company_userService) {
		_company_userService = company_userService;
	}

	private company_userService _company_userService;
}