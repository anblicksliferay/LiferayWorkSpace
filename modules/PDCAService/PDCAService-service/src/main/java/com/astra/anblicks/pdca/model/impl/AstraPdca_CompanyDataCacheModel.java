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

import com.astra.anblicks.pdca.model.AstraPdca_CompanyData;

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
 * The cache model class for representing AstraPdca_CompanyData in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @see AstraPdca_CompanyData
 * @generated
 */
@ProviderType
public class AstraPdca_CompanyDataCacheModel implements CacheModel<AstraPdca_CompanyData>,
	Externalizable {
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof AstraPdca_CompanyDataCacheModel)) {
			return false;
		}

		AstraPdca_CompanyDataCacheModel astraPdca_CompanyDataCacheModel = (AstraPdca_CompanyDataCacheModel)obj;

		if (companyId == astraPdca_CompanyDataCacheModel.companyId) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, companyId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(65);

		sb.append("{companyId=");
		sb.append(companyId);
		sb.append(", CompanyCode=");
		sb.append(CompanyCode);
		sb.append(", CompanyName=");
		sb.append(CompanyName);
		sb.append(", GroupName=");
		sb.append(GroupName);
		sb.append(", DIC=");
		sb.append(DIC);
		sb.append(", DICINITIAL=");
		sb.append(DICINITIAL);
		sb.append(", LEFTUP=");
		sb.append(LEFTUP);
		sb.append(", LEFTUPTITLE=");
		sb.append(LEFTUPTITLE);
		sb.append(", LEFTUPCOMPANY=");
		sb.append(LEFTUPCOMPANY);
		sb.append(", LEFTBOTTOM=");
		sb.append(LEFTBOTTOM);
		sb.append(", LEFTBOTTOMTITLE=");
		sb.append(LEFTBOTTOMTITLE);
		sb.append(", LEFTBOTTOMCOMPANY=");
		sb.append(LEFTBOTTOMCOMPANY);
		sb.append(", MIDUP=");
		sb.append(MIDUP);
		sb.append(", MIDUPTITLE=");
		sb.append(MIDUPTITLE);
		sb.append(", MIDUPCOMPANY=");
		sb.append(MIDUPCOMPANY);
		sb.append(", MIDBOTTOM=");
		sb.append(MIDBOTTOM);
		sb.append(", MIDBOTTOMTITLE=");
		sb.append(MIDBOTTOMTITLE);
		sb.append(", MIDBOTTOMCOMPANY=");
		sb.append(MIDBOTTOMCOMPANY);
		sb.append(", RIGHTUP=");
		sb.append(RIGHTUP);
		sb.append(", RIGHTUPTITLE=");
		sb.append(RIGHTUPTITLE);
		sb.append(", RIGHTUPCOMPANY=");
		sb.append(RIGHTUPCOMPANY);
		sb.append(", RIGHTBOTTOM=");
		sb.append(RIGHTBOTTOM);
		sb.append(", RIGHTBOTTOMTITLE=");
		sb.append(RIGHTBOTTOMTITLE);
		sb.append(", RIGHTBOTTOMCOMPANY=");
		sb.append(RIGHTBOTTOMCOMPANY);
		sb.append(", ModuleId=");
		sb.append(ModuleId);
		sb.append(", YearId=");
		sb.append(YearId);
		sb.append(", CheckFlag=");
		sb.append(CheckFlag);
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
	public AstraPdca_CompanyData toEntityModel() {
		AstraPdca_CompanyDataImpl astraPdca_CompanyDataImpl = new AstraPdca_CompanyDataImpl();

		astraPdca_CompanyDataImpl.setCompanyId(companyId);

		if (CompanyCode == null) {
			astraPdca_CompanyDataImpl.setCompanyCode(StringPool.BLANK);
		}
		else {
			astraPdca_CompanyDataImpl.setCompanyCode(CompanyCode);
		}

		if (CompanyName == null) {
			astraPdca_CompanyDataImpl.setCompanyName(StringPool.BLANK);
		}
		else {
			astraPdca_CompanyDataImpl.setCompanyName(CompanyName);
		}

		if (GroupName == null) {
			astraPdca_CompanyDataImpl.setGroupName(StringPool.BLANK);
		}
		else {
			astraPdca_CompanyDataImpl.setGroupName(GroupName);
		}

		if (DIC == null) {
			astraPdca_CompanyDataImpl.setDIC(StringPool.BLANK);
		}
		else {
			astraPdca_CompanyDataImpl.setDIC(DIC);
		}

		if (DICINITIAL == null) {
			astraPdca_CompanyDataImpl.setDICINITIAL(StringPool.BLANK);
		}
		else {
			astraPdca_CompanyDataImpl.setDICINITIAL(DICINITIAL);
		}

		if (LEFTUP == null) {
			astraPdca_CompanyDataImpl.setLEFTUP(StringPool.BLANK);
		}
		else {
			astraPdca_CompanyDataImpl.setLEFTUP(LEFTUP);
		}

		if (LEFTUPTITLE == null) {
			astraPdca_CompanyDataImpl.setLEFTUPTITLE(StringPool.BLANK);
		}
		else {
			astraPdca_CompanyDataImpl.setLEFTUPTITLE(LEFTUPTITLE);
		}

		if (LEFTUPCOMPANY == null) {
			astraPdca_CompanyDataImpl.setLEFTUPCOMPANY(StringPool.BLANK);
		}
		else {
			astraPdca_CompanyDataImpl.setLEFTUPCOMPANY(LEFTUPCOMPANY);
		}

		if (LEFTBOTTOM == null) {
			astraPdca_CompanyDataImpl.setLEFTBOTTOM(StringPool.BLANK);
		}
		else {
			astraPdca_CompanyDataImpl.setLEFTBOTTOM(LEFTBOTTOM);
		}

		if (LEFTBOTTOMTITLE == null) {
			astraPdca_CompanyDataImpl.setLEFTBOTTOMTITLE(StringPool.BLANK);
		}
		else {
			astraPdca_CompanyDataImpl.setLEFTBOTTOMTITLE(LEFTBOTTOMTITLE);
		}

		if (LEFTBOTTOMCOMPANY == null) {
			astraPdca_CompanyDataImpl.setLEFTBOTTOMCOMPANY(StringPool.BLANK);
		}
		else {
			astraPdca_CompanyDataImpl.setLEFTBOTTOMCOMPANY(LEFTBOTTOMCOMPANY);
		}

		if (MIDUP == null) {
			astraPdca_CompanyDataImpl.setMIDUP(StringPool.BLANK);
		}
		else {
			astraPdca_CompanyDataImpl.setMIDUP(MIDUP);
		}

		if (MIDUPTITLE == null) {
			astraPdca_CompanyDataImpl.setMIDUPTITLE(StringPool.BLANK);
		}
		else {
			astraPdca_CompanyDataImpl.setMIDUPTITLE(MIDUPTITLE);
		}

		if (MIDUPCOMPANY == null) {
			astraPdca_CompanyDataImpl.setMIDUPCOMPANY(StringPool.BLANK);
		}
		else {
			astraPdca_CompanyDataImpl.setMIDUPCOMPANY(MIDUPCOMPANY);
		}

		if (MIDBOTTOM == null) {
			astraPdca_CompanyDataImpl.setMIDBOTTOM(StringPool.BLANK);
		}
		else {
			astraPdca_CompanyDataImpl.setMIDBOTTOM(MIDBOTTOM);
		}

		if (MIDBOTTOMTITLE == null) {
			astraPdca_CompanyDataImpl.setMIDBOTTOMTITLE(StringPool.BLANK);
		}
		else {
			astraPdca_CompanyDataImpl.setMIDBOTTOMTITLE(MIDBOTTOMTITLE);
		}

		if (MIDBOTTOMCOMPANY == null) {
			astraPdca_CompanyDataImpl.setMIDBOTTOMCOMPANY(StringPool.BLANK);
		}
		else {
			astraPdca_CompanyDataImpl.setMIDBOTTOMCOMPANY(MIDBOTTOMCOMPANY);
		}

		if (RIGHTUP == null) {
			astraPdca_CompanyDataImpl.setRIGHTUP(StringPool.BLANK);
		}
		else {
			astraPdca_CompanyDataImpl.setRIGHTUP(RIGHTUP);
		}

		if (RIGHTUPTITLE == null) {
			astraPdca_CompanyDataImpl.setRIGHTUPTITLE(StringPool.BLANK);
		}
		else {
			astraPdca_CompanyDataImpl.setRIGHTUPTITLE(RIGHTUPTITLE);
		}

		if (RIGHTUPCOMPANY == null) {
			astraPdca_CompanyDataImpl.setRIGHTUPCOMPANY(StringPool.BLANK);
		}
		else {
			astraPdca_CompanyDataImpl.setRIGHTUPCOMPANY(RIGHTUPCOMPANY);
		}

		if (RIGHTBOTTOM == null) {
			astraPdca_CompanyDataImpl.setRIGHTBOTTOM(StringPool.BLANK);
		}
		else {
			astraPdca_CompanyDataImpl.setRIGHTBOTTOM(RIGHTBOTTOM);
		}

		if (RIGHTBOTTOMTITLE == null) {
			astraPdca_CompanyDataImpl.setRIGHTBOTTOMTITLE(StringPool.BLANK);
		}
		else {
			astraPdca_CompanyDataImpl.setRIGHTBOTTOMTITLE(RIGHTBOTTOMTITLE);
		}

		if (RIGHTBOTTOMCOMPANY == null) {
			astraPdca_CompanyDataImpl.setRIGHTBOTTOMCOMPANY(StringPool.BLANK);
		}
		else {
			astraPdca_CompanyDataImpl.setRIGHTBOTTOMCOMPANY(RIGHTBOTTOMCOMPANY);
		}

		astraPdca_CompanyDataImpl.setModuleId(ModuleId);
		astraPdca_CompanyDataImpl.setYearId(YearId);

		if (CheckFlag == null) {
			astraPdca_CompanyDataImpl.setCheckFlag(StringPool.BLANK);
		}
		else {
			astraPdca_CompanyDataImpl.setCheckFlag(CheckFlag);
		}

		astraPdca_CompanyDataImpl.setSiteId(SiteId);

		if (CreateDate == Long.MIN_VALUE) {
			astraPdca_CompanyDataImpl.setCreateDate(null);
		}
		else {
			astraPdca_CompanyDataImpl.setCreateDate(new Date(CreateDate));
		}

		if (CreatedBy == null) {
			astraPdca_CompanyDataImpl.setCreatedBy(StringPool.BLANK);
		}
		else {
			astraPdca_CompanyDataImpl.setCreatedBy(CreatedBy);
		}

		if (ModifiedDate == Long.MIN_VALUE) {
			astraPdca_CompanyDataImpl.setModifiedDate(null);
		}
		else {
			astraPdca_CompanyDataImpl.setModifiedDate(new Date(ModifiedDate));
		}

		if (ModifiedBy == null) {
			astraPdca_CompanyDataImpl.setModifiedBy(StringPool.BLANK);
		}
		else {
			astraPdca_CompanyDataImpl.setModifiedBy(ModifiedBy);
		}

		astraPdca_CompanyDataImpl.resetOriginalValues();

		return astraPdca_CompanyDataImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		companyId = objectInput.readLong();
		CompanyCode = objectInput.readUTF();
		CompanyName = objectInput.readUTF();
		GroupName = objectInput.readUTF();
		DIC = objectInput.readUTF();
		DICINITIAL = objectInput.readUTF();
		LEFTUP = objectInput.readUTF();
		LEFTUPTITLE = objectInput.readUTF();
		LEFTUPCOMPANY = objectInput.readUTF();
		LEFTBOTTOM = objectInput.readUTF();
		LEFTBOTTOMTITLE = objectInput.readUTF();
		LEFTBOTTOMCOMPANY = objectInput.readUTF();
		MIDUP = objectInput.readUTF();
		MIDUPTITLE = objectInput.readUTF();
		MIDUPCOMPANY = objectInput.readUTF();
		MIDBOTTOM = objectInput.readUTF();
		MIDBOTTOMTITLE = objectInput.readUTF();
		MIDBOTTOMCOMPANY = objectInput.readUTF();
		RIGHTUP = objectInput.readUTF();
		RIGHTUPTITLE = objectInput.readUTF();
		RIGHTUPCOMPANY = objectInput.readUTF();
		RIGHTBOTTOM = objectInput.readUTF();
		RIGHTBOTTOMTITLE = objectInput.readUTF();
		RIGHTBOTTOMCOMPANY = objectInput.readUTF();

		ModuleId = objectInput.readLong();

		YearId = objectInput.readLong();
		CheckFlag = objectInput.readUTF();

		SiteId = objectInput.readLong();
		CreateDate = objectInput.readLong();
		CreatedBy = objectInput.readUTF();
		ModifiedDate = objectInput.readLong();
		ModifiedBy = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(companyId);

		if (CompanyCode == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(CompanyCode);
		}

		if (CompanyName == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(CompanyName);
		}

		if (GroupName == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(GroupName);
		}

		if (DIC == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(DIC);
		}

		if (DICINITIAL == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(DICINITIAL);
		}

		if (LEFTUP == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(LEFTUP);
		}

		if (LEFTUPTITLE == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(LEFTUPTITLE);
		}

		if (LEFTUPCOMPANY == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(LEFTUPCOMPANY);
		}

		if (LEFTBOTTOM == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(LEFTBOTTOM);
		}

		if (LEFTBOTTOMTITLE == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(LEFTBOTTOMTITLE);
		}

		if (LEFTBOTTOMCOMPANY == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(LEFTBOTTOMCOMPANY);
		}

		if (MIDUP == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(MIDUP);
		}

		if (MIDUPTITLE == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(MIDUPTITLE);
		}

		if (MIDUPCOMPANY == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(MIDUPCOMPANY);
		}

		if (MIDBOTTOM == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(MIDBOTTOM);
		}

		if (MIDBOTTOMTITLE == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(MIDBOTTOMTITLE);
		}

		if (MIDBOTTOMCOMPANY == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(MIDBOTTOMCOMPANY);
		}

		if (RIGHTUP == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(RIGHTUP);
		}

		if (RIGHTUPTITLE == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(RIGHTUPTITLE);
		}

		if (RIGHTUPCOMPANY == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(RIGHTUPCOMPANY);
		}

		if (RIGHTBOTTOM == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(RIGHTBOTTOM);
		}

		if (RIGHTBOTTOMTITLE == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(RIGHTBOTTOMTITLE);
		}

		if (RIGHTBOTTOMCOMPANY == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(RIGHTBOTTOMCOMPANY);
		}

		objectOutput.writeLong(ModuleId);

		objectOutput.writeLong(YearId);

		if (CheckFlag == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(CheckFlag);
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

	public long companyId;
	public String CompanyCode;
	public String CompanyName;
	public String GroupName;
	public String DIC;
	public String DICINITIAL;
	public String LEFTUP;
	public String LEFTUPTITLE;
	public String LEFTUPCOMPANY;
	public String LEFTBOTTOM;
	public String LEFTBOTTOMTITLE;
	public String LEFTBOTTOMCOMPANY;
	public String MIDUP;
	public String MIDUPTITLE;
	public String MIDUPCOMPANY;
	public String MIDBOTTOM;
	public String MIDBOTTOMTITLE;
	public String MIDBOTTOMCOMPANY;
	public String RIGHTUP;
	public String RIGHTUPTITLE;
	public String RIGHTUPCOMPANY;
	public String RIGHTBOTTOM;
	public String RIGHTBOTTOMTITLE;
	public String RIGHTBOTTOMCOMPANY;
	public long ModuleId;
	public long YearId;
	public String CheckFlag;
	public long SiteId;
	public long CreateDate;
	public String CreatedBy;
	public long ModifiedDate;
	public String ModifiedBy;
}