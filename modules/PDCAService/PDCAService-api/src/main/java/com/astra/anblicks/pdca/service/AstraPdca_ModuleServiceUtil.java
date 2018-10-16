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

import com.liferay.osgi.util.ServiceTrackerFactory;

import org.osgi.util.tracker.ServiceTracker;

/**
 * Provides the remote service utility for AstraPdca_Module. This utility wraps
 * {@link com.astra.anblicks.pdca.service.impl.AstraPdca_ModuleServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on a remote server. Methods of this service are expected to have security
 * checks based on the propagated JAAS credentials because this service can be
 * accessed remotely.
 *
 * @author Brian Wing Shun Chan
 * @see AstraPdca_ModuleService
 * @see com.astra.anblicks.pdca.service.base.AstraPdca_ModuleServiceBaseImpl
 * @see com.astra.anblicks.pdca.service.impl.AstraPdca_ModuleServiceImpl
 * @generated
 */
@ProviderType
public class AstraPdca_ModuleServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link com.astra.anblicks.pdca.service.impl.AstraPdca_ModuleServiceImpl} and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	public static java.lang.String getOSGiServiceIdentifier() {
		return getService().getOSGiServiceIdentifier();
	}

	public static AstraPdca_ModuleService getService() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<AstraPdca_ModuleService, AstraPdca_ModuleService> _serviceTracker =
		ServiceTrackerFactory.open(AstraPdca_ModuleService.class);
}