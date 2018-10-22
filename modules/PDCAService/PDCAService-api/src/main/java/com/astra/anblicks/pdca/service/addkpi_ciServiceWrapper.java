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
 * Provides a wrapper for {@link addkpi_ciService}.
 *
 * @author Brian Wing Shun Chan
 * @see addkpi_ciService
 * @generated
 */
@ProviderType
public class addkpi_ciServiceWrapper implements addkpi_ciService,
	ServiceWrapper<addkpi_ciService> {
	public addkpi_ciServiceWrapper(addkpi_ciService addkpi_ciService) {
		_addkpi_ciService = addkpi_ciService;
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	@Override
	public java.lang.String getOSGiServiceIdentifier() {
		return _addkpi_ciService.getOSGiServiceIdentifier();
	}

	@Override
	public addkpi_ciService getWrappedService() {
		return _addkpi_ciService;
	}

	@Override
	public void setWrappedService(addkpi_ciService addkpi_ciService) {
		_addkpi_ciService = addkpi_ciService;
	}

	private addkpi_ciService _addkpi_ciService;
}