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
 * Provides a wrapper for {@link AstraPdca_YearService}.
 *
 * @author Brian Wing Shun Chan
 * @see AstraPdca_YearService
 * @generated
 */
@ProviderType
public class AstraPdca_YearServiceWrapper implements AstraPdca_YearService,
	ServiceWrapper<AstraPdca_YearService> {
	public AstraPdca_YearServiceWrapper(
		AstraPdca_YearService astraPdca_YearService) {
		_astraPdca_YearService = astraPdca_YearService;
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	@Override
	public java.lang.String getOSGiServiceIdentifier() {
		return _astraPdca_YearService.getOSGiServiceIdentifier();
	}

	@Override
	public AstraPdca_YearService getWrappedService() {
		return _astraPdca_YearService;
	}

	@Override
	public void setWrappedService(AstraPdca_YearService astraPdca_YearService) {
		_astraPdca_YearService = astraPdca_YearService;
	}

	private AstraPdca_YearService _astraPdca_YearService;
}