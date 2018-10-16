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

package com.astra.anblicks.pdca.model.impl;

import aQute.bnd.annotation.ProviderType;

import com.astra.anblicks.pdca.model.company_user;

import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.portal.kernel.util.HashUtil;
import com.liferay.portal.kernel.util.StringBundler;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing company_user in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @see company_user
 * @generated
 */
@ProviderType
public class company_userCacheModel implements CacheModel<company_user>,
	Externalizable {
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof company_userCacheModel)) {
			return false;
		}

		company_userCacheModel company_userCacheModel = (company_userCacheModel)obj;

		if (company_user_Id == company_userCacheModel.company_user_Id) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, company_user_Id);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(7);

		sb.append("{company_user_Id=");
		sb.append(company_user_Id);
		sb.append(", companyId=");
		sb.append(companyId);
		sb.append(", Pdca_userId=");
		sb.append(Pdca_userId);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public company_user toEntityModel() {
		company_userImpl company_userImpl = new company_userImpl();

		company_userImpl.setCompany_user_Id(company_user_Id);
		company_userImpl.setCompanyId(companyId);
		company_userImpl.setPdca_userId(Pdca_userId);

		company_userImpl.resetOriginalValues();

		return company_userImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		company_user_Id = objectInput.readLong();

		companyId = objectInput.readLong();

		Pdca_userId = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(company_user_Id);

		objectOutput.writeLong(companyId);

		objectOutput.writeLong(Pdca_userId);
	}

	public long company_user_Id;
	public long companyId;
	public long Pdca_userId;
}