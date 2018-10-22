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
 * The extended model interface for the addkpi_ci service. Represents a row in the &quot;addkpi_ci&quot; database table, with each column mapped to a property of this class.
 *
 * @author Brian Wing Shun Chan
 * @see addkpi_ciModel
 * @see com.astra.anblicks.pdca.model.impl.addkpi_ciImpl
 * @see com.astra.anblicks.pdca.model.impl.addkpi_ciModelImpl
 * @generated
 */
@ImplementationClassName("com.astra.anblicks.pdca.model.impl.addkpi_ciImpl")
@ProviderType
public interface addkpi_ci extends addkpi_ciModel, PersistedModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this interface directly. Add methods to {@link com.astra.anblicks.pdca.model.impl.addkpi_ciImpl} and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */
	public static final Accessor<addkpi_ci, Long> ADD_KPI_ID_ACCESSOR = new Accessor<addkpi_ci, Long>() {
			@Override
			public Long get(addkpi_ci addkpi_ci) {
				return addkpi_ci.getAddKpiId();
			}

			@Override
			public Class<Long> getAttributeClass() {
				return Long.class;
			}

			@Override
			public Class<addkpi_ci> getTypeClass() {
				return addkpi_ci.class;
			}
		};
}