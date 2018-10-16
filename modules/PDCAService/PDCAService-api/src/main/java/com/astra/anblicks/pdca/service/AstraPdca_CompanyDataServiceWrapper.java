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
 * Provides a wrapper for {@link AstraPdca_CompanyDataService}.
 *
 * @author Brian Wing Shun Chan
 * @see AstraPdca_CompanyDataService
 * @generated
 */
@ProviderType
public class AstraPdca_CompanyDataServiceWrapper
	implements AstraPdca_CompanyDataService,
		ServiceWrapper<AstraPdca_CompanyDataService> {
	public AstraPdca_CompanyDataServiceWrapper(
		AstraPdca_CompanyDataService astraPdca_CompanyDataService) {
		_astraPdca_CompanyDataService = astraPdca_CompanyDataService;
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	@Override
	public java.lang.String getOSGiServiceIdentifier() {
		return _astraPdca_CompanyDataService.getOSGiServiceIdentifier();
	}

	@Override
	public AstraPdca_CompanyDataService getWrappedService() {
		return _astraPdca_CompanyDataService;
	}

	@Override
	public void setWrappedService(
		AstraPdca_CompanyDataService astraPdca_CompanyDataService) {
		_astraPdca_CompanyDataService = astraPdca_CompanyDataService;
	}

	private AstraPdca_CompanyDataService _astraPdca_CompanyDataService;
}