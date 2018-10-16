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
 * The extended model interface for the company_user service. Represents a row in the &quot;pdca_company_user&quot; database table, with each column mapped to a property of this class.
 *
 * @author Brian Wing Shun Chan
 * @see company_userModel
 * @see com.astra.anblicks.pdca.model.impl.company_userImpl
 * @see com.astra.anblicks.pdca.model.impl.company_userModelImpl
 * @generated
 */
@ImplementationClassName("com.astra.anblicks.pdca.model.impl.company_userImpl")
@ProviderType
public interface company_user extends company_userModel, PersistedModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this interface directly. Add methods to {@link com.astra.anblicks.pdca.model.impl.company_userImpl} and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */
	public static final Accessor<company_user, Long> COMPANY_USER__ID_ACCESSOR = new Accessor<company_user, Long>() {
			@Override
			public Long get(company_user company_user) {
				return company_user.getCompany_user_Id();
			}

			@Override
			public Class<Long> getAttributeClass() {
				return Long.class;
			}

			@Override
			public Class<company_user> getTypeClass() {
				return company_user.class;
			}
		};
}