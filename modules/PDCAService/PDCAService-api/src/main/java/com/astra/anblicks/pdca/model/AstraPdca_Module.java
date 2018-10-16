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
 * The extended model interface for the AstraPdca_Module service. Represents a row in the &quot;pdca_AstraPdca_Module&quot; database table, with each column mapped to a property of this class.
 *
 * @author Brian Wing Shun Chan
 * @see AstraPdca_ModuleModel
 * @see com.astra.anblicks.pdca.model.impl.AstraPdca_ModuleImpl
 * @see com.astra.anblicks.pdca.model.impl.AstraPdca_ModuleModelImpl
 * @generated
 */
@ImplementationClassName("com.astra.anblicks.pdca.model.impl.AstraPdca_ModuleImpl")
@ProviderType
public interface AstraPdca_Module extends AstraPdca_ModuleModel, PersistedModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this interface directly. Add methods to {@link com.astra.anblicks.pdca.model.impl.AstraPdca_ModuleImpl} and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */
	public static final Accessor<AstraPdca_Module, Long> MODULE_ID_ACCESSOR = new Accessor<AstraPdca_Module, Long>() {
			@Override
			public Long get(AstraPdca_Module astraPdca_Module) {
				return astraPdca_Module.getModuleId();
			}

			@Override
			public Class<Long> getAttributeClass() {
				return Long.class;
			}

			@Override
			public Class<AstraPdca_Module> getTypeClass() {
				return AstraPdca_Module.class;
			}
		};
}