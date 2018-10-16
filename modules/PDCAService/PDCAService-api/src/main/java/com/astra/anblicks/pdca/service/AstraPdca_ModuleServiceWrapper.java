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
 * Provides a wrapper for {@link AstraPdca_ModuleService}.
 *
 * @author Brian Wing Shun Chan
 * @see AstraPdca_ModuleService
 * @generated
 */
@ProviderType
public class AstraPdca_ModuleServiceWrapper implements AstraPdca_ModuleService,
	ServiceWrapper<AstraPdca_ModuleService> {
	public AstraPdca_ModuleServiceWrapper(
		AstraPdca_ModuleService astraPdca_ModuleService) {
		_astraPdca_ModuleService = astraPdca_ModuleService;
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	@Override
	public java.lang.String getOSGiServiceIdentifier() {
		return _astraPdca_ModuleService.getOSGiServiceIdentifier();
	}

	@Override
	public AstraPdca_ModuleService getWrappedService() {
		return _astraPdca_ModuleService;
	}

	@Override
	public void setWrappedService(
		AstraPdca_ModuleService astraPdca_ModuleService) {
		_astraPdca_ModuleService = astraPdca_ModuleService;
	}

	private AstraPdca_ModuleService _astraPdca_ModuleService;
}