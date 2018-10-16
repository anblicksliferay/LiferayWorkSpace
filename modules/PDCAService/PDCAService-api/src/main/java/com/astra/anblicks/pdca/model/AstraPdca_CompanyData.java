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

package com.astra.anblicks.pdca.model;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.annotation.ImplementationClassName;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.util.Accessor;

/**
 * The extended model interface for the AstraPdca_CompanyData service. Represents a row in the &quot;pdca_AstraPdca_CompanyData&quot; database table, with each column mapped to a property of this class.
 *
 * @author Brian Wing Shun Chan
 * @see AstraPdca_CompanyDataModel
 * @see com.astra.anblicks.pdca.model.impl.AstraPdca_CompanyDataImpl
 * @see com.astra.anblicks.pdca.model.impl.AstraPdca_CompanyDataModelImpl
 * @generated
 */
@ImplementationClassName("com.astra.anblicks.pdca.model.impl.AstraPdca_CompanyDataImpl")
@ProviderType
public interface AstraPdca_CompanyData extends AstraPdca_CompanyDataModel,
	PersistedModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this interface directly. Add methods to {@link com.astra.anblicks.pdca.model.impl.AstraPdca_CompanyDataImpl} and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */
	public static final Accessor<AstraPdca_CompanyData, Long> COMPANY_ID_ACCESSOR =
		new Accessor<AstraPdca_CompanyData, Long>() {
			@Override
			public Long get(AstraPdca_CompanyData astraPdca_CompanyData) {
				return astraPdca_CompanyData.getCompanyId();
			}

			@Override
			public Class<Long> getAttributeClass() {
				return Long.class;
			}

			@Override
			public Class<AstraPdca_CompanyData> getTypeClass() {
				return AstraPdca_CompanyData.class;
			}
		};
}