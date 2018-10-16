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

import com.astra.anblicks.pdca.model.pdca_AdminSettings;

import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.portal.kernel.util.HashUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing pdca_AdminSettings in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @see pdca_AdminSettings
 * @generated
 */
@ProviderType
public class pdca_AdminSettingsCacheModel implements CacheModel<pdca_AdminSettings>,
	Externalizable {
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof pdca_AdminSettingsCacheModel)) {
			return false;
		}

		pdca_AdminSettingsCacheModel pdca_AdminSettingsCacheModel = (pdca_AdminSettingsCacheModel)obj;

		if (settings_Id == pdca_AdminSettingsCacheModel.settings_Id) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, settings_Id);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(21);

		sb.append("{settings_Id=");
		sb.append(settings_Id);
		sb.append(", moduleId=");
		sb.append(moduleId);
		sb.append(", year=");
		sb.append(year);
		sb.append(", companyId=");
		sb.append(companyId);
		sb.append(", periodId=");
		sb.append(periodId);
		sb.append(", SiteId=");
		sb.append(SiteId);
		sb.append(", CreateDate=");
		sb.append(CreateDate);
		sb.append(", CreatedBy=");
		sb.append(CreatedBy);
		sb.append(", ModifiedDate=");
		sb.append(ModifiedDate);
		sb.append(", ModifiedBy=");
		sb.append(ModifiedBy);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public pdca_AdminSettings toEntityModel() {
		pdca_AdminSettingsImpl pdca_AdminSettingsImpl = new pdca_AdminSettingsImpl();

		pdca_AdminSettingsImpl.setSettings_Id(settings_Id);
		pdca_AdminSettingsImpl.setModuleId(moduleId);
		pdca_AdminSettingsImpl.setYear(year);
		pdca_AdminSettingsImpl.setCompanyId(companyId);
		pdca_AdminSettingsImpl.setPeriodId(periodId);
		pdca_AdminSettingsImpl.setSiteId(SiteId);

		if (CreateDate == Long.MIN_VALUE) {
			pdca_AdminSettingsImpl.setCreateDate(null);
		}
		else {
			pdca_AdminSettingsImpl.setCreateDate(new Date(CreateDate));
		}

		if (CreatedBy == null) {
			pdca_AdminSettingsImpl.setCreatedBy(StringPool.BLANK);
		}
		else {
			pdca_AdminSettingsImpl.setCreatedBy(CreatedBy);
		}

		if (ModifiedDate == Long.MIN_VALUE) {
			pdca_AdminSettingsImpl.setModifiedDate(null);
		}
		else {
			pdca_AdminSettingsImpl.setModifiedDate(new Date(ModifiedDate));
		}

		if (ModifiedBy == null) {
			pdca_AdminSettingsImpl.setModifiedBy(StringPool.BLANK);
		}
		else {
			pdca_AdminSettingsImpl.setModifiedBy(ModifiedBy);
		}

		pdca_AdminSettingsImpl.resetOriginalValues();

		return pdca_AdminSettingsImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		settings_Id = objectInput.readLong();

		moduleId = objectInput.readLong();

		year = objectInput.readLong();

		companyId = objectInput.readLong();

		periodId = objectInput.readLong();

		SiteId = objectInput.readLong();
		CreateDate = objectInput.readLong();
		CreatedBy = objectInput.readUTF();
		ModifiedDate = objectInput.readLong();
		ModifiedBy = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(settings_Id);

		objectOutput.writeLong(moduleId);

		objectOutput.writeLong(year);

		objectOutput.writeLong(companyId);

		objectOutput.writeLong(periodId);

		objectOutput.writeLong(SiteId);
		objectOutput.writeLong(CreateDate);

		if (CreatedBy == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(CreatedBy);
		}

		objectOutput.writeLong(ModifiedDate);

		if (ModifiedBy == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(ModifiedBy);
		}
	}

	public long settings_Id;
	public long moduleId;
	public long year;
	public long companyId;
	public long periodId;
	public long SiteId;
	public long CreateDate;
	public String CreatedBy;
	public long ModifiedDate;
	public String ModifiedBy;
}