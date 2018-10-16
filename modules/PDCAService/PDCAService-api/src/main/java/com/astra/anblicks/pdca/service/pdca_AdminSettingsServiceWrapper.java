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
 * Provides a wrapper for {@link pdca_AdminSettingsService}.
 *
 * @author Brian Wing Shun Chan
 * @see pdca_AdminSettingsService
 * @generated
 */
@ProviderType
public class pdca_AdminSettingsServiceWrapper
	implements pdca_AdminSettingsService,
		ServiceWrapper<pdca_AdminSettingsService> {
	public pdca_AdminSettingsServiceWrapper(
		pdca_AdminSettingsService pdca_AdminSettingsService) {
		_pdca_AdminSettingsService = pdca_AdminSettingsService;
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	@Override
	public java.lang.String getOSGiServiceIdentifier() {
		return _pdca_AdminSettingsService.getOSGiServiceIdentifier();
	}

	@Override
	public pdca_AdminSettingsService getWrappedService() {
		return _pdca_AdminSettingsService;
	}

	@Override
	public void setWrappedService(
		pdca_AdminSettingsService pdca_AdminSettingsService) {
		_pdca_AdminSettingsService = pdca_AdminSettingsService;
	}

	private pdca_AdminSettingsService _pdca_AdminSettingsService;
}