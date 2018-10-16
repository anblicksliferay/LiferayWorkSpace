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
 * The extended model interface for the pdca_AdminSettings service. Represents a row in the &quot;pdca_pdca_AdminSettings&quot; database table, with each column mapped to a property of this class.
 *
 * @author Brian Wing Shun Chan
 * @see pdca_AdminSettingsModel
 * @see com.astra.anblicks.pdca.model.impl.pdca_AdminSettingsImpl
 * @see com.astra.anblicks.pdca.model.impl.pdca_AdminSettingsModelImpl
 * @generated
 */
@ImplementationClassName("com.astra.anblicks.pdca.model.impl.pdca_AdminSettingsImpl")
@ProviderType
public interface pdca_AdminSettings extends pdca_AdminSettingsModel,
	PersistedModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this interface directly. Add methods to {@link com.astra.anblicks.pdca.model.impl.pdca_AdminSettingsImpl} and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */
	public static final Accessor<pdca_AdminSettings, Long> SETTINGS__ID_ACCESSOR =
		new Accessor<pdca_AdminSettings, Long>() {
			@Override
			public Long get(pdca_AdminSettings pdca_AdminSettings) {
				return pdca_AdminSettings.getSettings_Id();
			}

			@Override
			public Class<Long> getAttributeClass() {
				return Long.class;
			}

			@Override
			public Class<pdca_AdminSettings> getTypeClass() {
				return pdca_AdminSettings.class;
			}
		};
}