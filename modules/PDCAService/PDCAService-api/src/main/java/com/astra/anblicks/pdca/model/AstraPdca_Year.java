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
 * The extended model interface for the AstraPdca_Year service. Represents a row in the &quot;pdca_AstraPdca_Year&quot; database table, with each column mapped to a property of this class.
 *
 * @author Brian Wing Shun Chan
 * @see AstraPdca_YearModel
 * @see com.astra.anblicks.pdca.model.impl.AstraPdca_YearImpl
 * @see com.astra.anblicks.pdca.model.impl.AstraPdca_YearModelImpl
 * @generated
 */
@ImplementationClassName("com.astra.anblicks.pdca.model.impl.AstraPdca_YearImpl")
@ProviderType
public interface AstraPdca_Year extends AstraPdca_YearModel, PersistedModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this interface directly. Add methods to {@link com.astra.anblicks.pdca.model.impl.AstraPdca_YearImpl} and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */
	public static final Accessor<AstraPdca_Year, Long> YEAR_ID_ACCESSOR = new Accessor<AstraPdca_Year, Long>() {
			@Override
			public Long get(AstraPdca_Year astraPdca_Year) {
				return astraPdca_Year.getYearId();
			}

			@Override
			public Class<Long> getAttributeClass() {
				return Long.class;
			}

			@Override
			public Class<AstraPdca_Year> getTypeClass() {
				return AstraPdca_Year.class;
			}
		};
}