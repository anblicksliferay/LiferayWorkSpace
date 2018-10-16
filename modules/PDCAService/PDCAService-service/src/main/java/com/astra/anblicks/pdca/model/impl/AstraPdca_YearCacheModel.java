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

import com.astra.anblicks.pdca.model.AstraPdca_Year;

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
 * The cache model class for representing AstraPdca_Year in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @see AstraPdca_Year
 * @generated
 */
@ProviderType
public class AstraPdca_YearCacheModel implements CacheModel<AstraPdca_Year>,
	Externalizable {
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof AstraPdca_YearCacheModel)) {
			return false;
		}

		AstraPdca_YearCacheModel astraPdca_YearCacheModel = (AstraPdca_YearCacheModel)obj;

		if (YearId == astraPdca_YearCacheModel.YearId) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, YearId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(17);

		sb.append("{YearId=");
		sb.append(YearId);
		sb.append(", YearId_Company=");
		sb.append(YearId_Company);
		sb.append(", Year=");
		sb.append(Year);
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
	public AstraPdca_Year toEntityModel() {
		AstraPdca_YearImpl astraPdca_YearImpl = new AstraPdca_YearImpl();

		astraPdca_YearImpl.setYearId(YearId);
		astraPdca_YearImpl.setYearId_Company(YearId_Company);
		astraPdca_YearImpl.setYear(Year);
		astraPdca_YearImpl.setSiteId(SiteId);

		if (CreateDate == Long.MIN_VALUE) {
			astraPdca_YearImpl.setCreateDate(null);
		}
		else {
			astraPdca_YearImpl.setCreateDate(new Date(CreateDate));
		}

		if (CreatedBy == null) {
			astraPdca_YearImpl.setCreatedBy(StringPool.BLANK);
		}
		else {
			astraPdca_YearImpl.setCreatedBy(CreatedBy);
		}

		if (ModifiedDate == Long.MIN_VALUE) {
			astraPdca_YearImpl.setModifiedDate(null);
		}
		else {
			astraPdca_YearImpl.setModifiedDate(new Date(ModifiedDate));
		}

		if (ModifiedBy == null) {
			astraPdca_YearImpl.setModifiedBy(StringPool.BLANK);
		}
		else {
			astraPdca_YearImpl.setModifiedBy(ModifiedBy);
		}

		astraPdca_YearImpl.resetOriginalValues();

		return astraPdca_YearImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		YearId = objectInput.readLong();

		YearId_Company = objectInput.readLong();

		Year = objectInput.readLong();

		SiteId = objectInput.readLong();
		CreateDate = objectInput.readLong();
		CreatedBy = objectInput.readUTF();
		ModifiedDate = objectInput.readLong();
		ModifiedBy = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(YearId);

		objectOutput.writeLong(YearId_Company);

		objectOutput.writeLong(Year);

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

	public long YearId;
	public long YearId_Company;
	public long Year;
	public long SiteId;
	public long CreateDate;
	public String CreatedBy;
	public long ModifiedDate;
	public String ModifiedBy;
}