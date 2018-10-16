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

import com.astra.anblicks.pdca.model.AstraPdca_Module;

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
 * The cache model class for representing AstraPdca_Module in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @see AstraPdca_Module
 * @generated
 */
@ProviderType
public class AstraPdca_ModuleCacheModel implements CacheModel<AstraPdca_Module>,
	Externalizable {
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof AstraPdca_ModuleCacheModel)) {
			return false;
		}

		AstraPdca_ModuleCacheModel astraPdca_ModuleCacheModel = (AstraPdca_ModuleCacheModel)obj;

		if (ModuleId == astraPdca_ModuleCacheModel.ModuleId) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, ModuleId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(19);

		sb.append("{ModuleId=");
		sb.append(ModuleId);
		sb.append(", ModuleId_Company=");
		sb.append(ModuleId_Company);
		sb.append(", ModuleName=");
		sb.append(ModuleName);
		sb.append(", checkUncheckFlag=");
		sb.append(checkUncheckFlag);
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
	public AstraPdca_Module toEntityModel() {
		AstraPdca_ModuleImpl astraPdca_ModuleImpl = new AstraPdca_ModuleImpl();

		astraPdca_ModuleImpl.setModuleId(ModuleId);
		astraPdca_ModuleImpl.setModuleId_Company(ModuleId_Company);

		if (ModuleName == null) {
			astraPdca_ModuleImpl.setModuleName(StringPool.BLANK);
		}
		else {
			astraPdca_ModuleImpl.setModuleName(ModuleName);
		}

		if (checkUncheckFlag == null) {
			astraPdca_ModuleImpl.setCheckUncheckFlag(StringPool.BLANK);
		}
		else {
			astraPdca_ModuleImpl.setCheckUncheckFlag(checkUncheckFlag);
		}

		astraPdca_ModuleImpl.setSiteId(SiteId);

		if (CreateDate == Long.MIN_VALUE) {
			astraPdca_ModuleImpl.setCreateDate(null);
		}
		else {
			astraPdca_ModuleImpl.setCreateDate(new Date(CreateDate));
		}

		if (CreatedBy == null) {
			astraPdca_ModuleImpl.setCreatedBy(StringPool.BLANK);
		}
		else {
			astraPdca_ModuleImpl.setCreatedBy(CreatedBy);
		}

		if (ModifiedDate == Long.MIN_VALUE) {
			astraPdca_ModuleImpl.setModifiedDate(null);
		}
		else {
			astraPdca_ModuleImpl.setModifiedDate(new Date(ModifiedDate));
		}

		if (ModifiedBy == null) {
			astraPdca_ModuleImpl.setModifiedBy(StringPool.BLANK);
		}
		else {
			astraPdca_ModuleImpl.setModifiedBy(ModifiedBy);
		}

		astraPdca_ModuleImpl.resetOriginalValues();

		return astraPdca_ModuleImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		ModuleId = objectInput.readLong();

		ModuleId_Company = objectInput.readLong();
		ModuleName = objectInput.readUTF();
		checkUncheckFlag = objectInput.readUTF();

		SiteId = objectInput.readLong();
		CreateDate = objectInput.readLong();
		CreatedBy = objectInput.readUTF();
		ModifiedDate = objectInput.readLong();
		ModifiedBy = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(ModuleId);

		objectOutput.writeLong(ModuleId_Company);

		if (ModuleName == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(ModuleName);
		}

		if (checkUncheckFlag == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(checkUncheckFlag);
		}

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

	public long ModuleId;
	public long ModuleId_Company;
	public String ModuleName;
	public String checkUncheckFlag;
	public long SiteId;
	public long CreateDate;
	public String CreatedBy;
	public long ModifiedDate;
	public String ModifiedBy;
}