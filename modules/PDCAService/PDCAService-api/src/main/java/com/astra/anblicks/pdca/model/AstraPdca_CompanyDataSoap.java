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

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link com.astra.anblicks.pdca.service.http.AstraPdca_CompanyDataServiceSoap}.
 *
 * @author Brian Wing Shun Chan
 * @see com.astra.anblicks.pdca.service.http.AstraPdca_CompanyDataServiceSoap
 * @generated
 */
@ProviderType
public class AstraPdca_CompanyDataSoap implements Serializable {
	public static AstraPdca_CompanyDataSoap toSoapModel(
		AstraPdca_CompanyData model) {
		AstraPdca_CompanyDataSoap soapModel = new AstraPdca_CompanyDataSoap();

		soapModel.setCompanyId(model.getCompanyId());
		soapModel.setCompanyCode(model.getCompanyCode());
		soapModel.setCompanyName(model.getCompanyName());
		soapModel.setGroupName(model.getGroupName());
		soapModel.setDIC(model.getDIC());
		soapModel.setDICINITIAL(model.getDICINITIAL());
		soapModel.setLEFTUP(model.getLEFTUP());
		soapModel.setLEFTUPTITLE(model.getLEFTUPTITLE());
		soapModel.setLEFTUPCOMPANY(model.getLEFTUPCOMPANY());
		soapModel.setLEFTBOTTOM(model.getLEFTBOTTOM());
		soapModel.setLEFTBOTTOMTITLE(model.getLEFTBOTTOMTITLE());
		soapModel.setLEFTBOTTOMCOMPANY(model.getLEFTBOTTOMCOMPANY());
		soapModel.setMIDUP(model.getMIDUP());
		soapModel.setMIDUPTITLE(model.getMIDUPTITLE());
		soapModel.setMIDUPCOMPANY(model.getMIDUPCOMPANY());
		soapModel.setMIDBOTTOM(model.getMIDBOTTOM());
		soapModel.setMIDBOTTOMTITLE(model.getMIDBOTTOMTITLE());
		soapModel.setMIDBOTTOMCOMPANY(model.getMIDBOTTOMCOMPANY());
		soapModel.setRIGHTUP(model.getRIGHTUP());
		soapModel.setRIGHTUPTITLE(model.getRIGHTUPTITLE());
		soapModel.setRIGHTUPCOMPANY(model.getRIGHTUPCOMPANY());
		soapModel.setRIGHTBOTTOM(model.getRIGHTBOTTOM());
		soapModel.setRIGHTBOTTOMTITLE(model.getRIGHTBOTTOMTITLE());
		soapModel.setRIGHTBOTTOMCOMPANY(model.getRIGHTBOTTOMCOMPANY());
		soapModel.setModuleId(model.getModuleId());
		soapModel.setYearId(model.getYearId());
		soapModel.setCheckFlag(model.getCheckFlag());
		soapModel.setSiteId(model.getSiteId());
		soapModel.setCreateDate(model.getCreateDate());
		soapModel.setCreatedBy(model.getCreatedBy());
		soapModel.setModifiedDate(model.getModifiedDate());
		soapModel.setModifiedBy(model.getModifiedBy());

		return soapModel;
	}

	public static AstraPdca_CompanyDataSoap[] toSoapModels(
		AstraPdca_CompanyData[] models) {
		AstraPdca_CompanyDataSoap[] soapModels = new AstraPdca_CompanyDataSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static AstraPdca_CompanyDataSoap[][] toSoapModels(
		AstraPdca_CompanyData[][] models) {
		AstraPdca_CompanyDataSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new AstraPdca_CompanyDataSoap[models.length][models[0].length];
		}
		else {
			soapModels = new AstraPdca_CompanyDataSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static AstraPdca_CompanyDataSoap[] toSoapModels(
		List<AstraPdca_CompanyData> models) {
		List<AstraPdca_CompanyDataSoap> soapModels = new ArrayList<AstraPdca_CompanyDataSoap>(models.size());

		for (AstraPdca_CompanyData model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new AstraPdca_CompanyDataSoap[soapModels.size()]);
	}

	public AstraPdca_CompanyDataSoap() {
	}

	public long getPrimaryKey() {
		return _companyId;
	}

	public void setPrimaryKey(long pk) {
		setCompanyId(pk);
	}

	public long getCompanyId() {
		return _companyId;
	}

	public void setCompanyId(long companyId) {
		_companyId = companyId;
	}

	public String getCompanyCode() {
		return _CompanyCode;
	}

	public void setCompanyCode(String CompanyCode) {
		_CompanyCode = CompanyCode;
	}

	public String getCompanyName() {
		return _CompanyName;
	}

	public void setCompanyName(String CompanyName) {
		_CompanyName = CompanyName;
	}

	public String getGroupName() {
		return _GroupName;
	}

	public void setGroupName(String GroupName) {
		_GroupName = GroupName;
	}

	public String getDIC() {
		return _DIC;
	}

	public void setDIC(String DIC) {
		_DIC = DIC;
	}

	public String getDICINITIAL() {
		return _DICINITIAL;
	}

	public void setDICINITIAL(String DICINITIAL) {
		_DICINITIAL = DICINITIAL;
	}

	public String getLEFTUP() {
		return _LEFTUP;
	}

	public void setLEFTUP(String LEFTUP) {
		_LEFTUP = LEFTUP;
	}

	public String getLEFTUPTITLE() {
		return _LEFTUPTITLE;
	}

	public void setLEFTUPTITLE(String LEFTUPTITLE) {
		_LEFTUPTITLE = LEFTUPTITLE;
	}

	public String getLEFTUPCOMPANY() {
		return _LEFTUPCOMPANY;
	}

	public void setLEFTUPCOMPANY(String LEFTUPCOMPANY) {
		_LEFTUPCOMPANY = LEFTUPCOMPANY;
	}

	public String getLEFTBOTTOM() {
		return _LEFTBOTTOM;
	}

	public void setLEFTBOTTOM(String LEFTBOTTOM) {
		_LEFTBOTTOM = LEFTBOTTOM;
	}

	public String getLEFTBOTTOMTITLE() {
		return _LEFTBOTTOMTITLE;
	}

	public void setLEFTBOTTOMTITLE(String LEFTBOTTOMTITLE) {
		_LEFTBOTTOMTITLE = LEFTBOTTOMTITLE;
	}

	public String getLEFTBOTTOMCOMPANY() {
		return _LEFTBOTTOMCOMPANY;
	}

	public void setLEFTBOTTOMCOMPANY(String LEFTBOTTOMCOMPANY) {
		_LEFTBOTTOMCOMPANY = LEFTBOTTOMCOMPANY;
	}

	public String getMIDUP() {
		return _MIDUP;
	}

	public void setMIDUP(String MIDUP) {
		_MIDUP = MIDUP;
	}

	public String getMIDUPTITLE() {
		return _MIDUPTITLE;
	}

	public void setMIDUPTITLE(String MIDUPTITLE) {
		_MIDUPTITLE = MIDUPTITLE;
	}

	public String getMIDUPCOMPANY() {
		return _MIDUPCOMPANY;
	}

	public void setMIDUPCOMPANY(String MIDUPCOMPANY) {
		_MIDUPCOMPANY = MIDUPCOMPANY;
	}

	public String getMIDBOTTOM() {
		return _MIDBOTTOM;
	}

	public void setMIDBOTTOM(String MIDBOTTOM) {
		_MIDBOTTOM = MIDBOTTOM;
	}

	public String getMIDBOTTOMTITLE() {
		return _MIDBOTTOMTITLE;
	}

	public void setMIDBOTTOMTITLE(String MIDBOTTOMTITLE) {
		_MIDBOTTOMTITLE = MIDBOTTOMTITLE;
	}

	public String getMIDBOTTOMCOMPANY() {
		return _MIDBOTTOMCOMPANY;
	}

	public void setMIDBOTTOMCOMPANY(String MIDBOTTOMCOMPANY) {
		_MIDBOTTOMCOMPANY = MIDBOTTOMCOMPANY;
	}

	public String getRIGHTUP() {
		return _RIGHTUP;
	}

	public void setRIGHTUP(String RIGHTUP) {
		_RIGHTUP = RIGHTUP;
	}

	public String getRIGHTUPTITLE() {
		return _RIGHTUPTITLE;
	}

	public void setRIGHTUPTITLE(String RIGHTUPTITLE) {
		_RIGHTUPTITLE = RIGHTUPTITLE;
	}

	public String getRIGHTUPCOMPANY() {
		return _RIGHTUPCOMPANY;
	}

	public void setRIGHTUPCOMPANY(String RIGHTUPCOMPANY) {
		_RIGHTUPCOMPANY = RIGHTUPCOMPANY;
	}

	public String getRIGHTBOTTOM() {
		return _RIGHTBOTTOM;
	}

	public void setRIGHTBOTTOM(String RIGHTBOTTOM) {
		_RIGHTBOTTOM = RIGHTBOTTOM;
	}

	public String getRIGHTBOTTOMTITLE() {
		return _RIGHTBOTTOMTITLE;
	}

	public void setRIGHTBOTTOMTITLE(String RIGHTBOTTOMTITLE) {
		_RIGHTBOTTOMTITLE = RIGHTBOTTOMTITLE;
	}

	public String getRIGHTBOTTOMCOMPANY() {
		return _RIGHTBOTTOMCOMPANY;
	}

	public void setRIGHTBOTTOMCOMPANY(String RIGHTBOTTOMCOMPANY) {
		_RIGHTBOTTOMCOMPANY = RIGHTBOTTOMCOMPANY;
	}

	public long getModuleId() {
		return _ModuleId;
	}

	public void setModuleId(long ModuleId) {
		_ModuleId = ModuleId;
	}

	public long getYearId() {
		return _YearId;
	}

	public void setYearId(long YearId) {
		_YearId = YearId;
	}

	public String getCheckFlag() {
		return _CheckFlag;
	}

	public void setCheckFlag(String CheckFlag) {
		_CheckFlag = CheckFlag;
	}

	public long getSiteId() {
		return _SiteId;
	}

	public void setSiteId(long SiteId) {
		_SiteId = SiteId;
	}

	public Date getCreateDate() {
		return _CreateDate;
	}

	public void setCreateDate(Date CreateDate) {
		_CreateDate = CreateDate;
	}

	public String getCreatedBy() {
		return _CreatedBy;
	}

	public void setCreatedBy(String CreatedBy) {
		_CreatedBy = CreatedBy;
	}

	public Date getModifiedDate() {
		return _ModifiedDate;
	}

	public void setModifiedDate(Date ModifiedDate) {
		_ModifiedDate = ModifiedDate;
	}

	public String getModifiedBy() {
		return _ModifiedBy;
	}

	public void setModifiedBy(String ModifiedBy) {
		_ModifiedBy = ModifiedBy;
	}

	private long _companyId;
	private String _CompanyCode;
	private String _CompanyName;
	private String _GroupName;
	private String _DIC;
	private String _DICINITIAL;
	private String _LEFTUP;
	private String _LEFTUPTITLE;
	private String _LEFTUPCOMPANY;
	private String _LEFTBOTTOM;
	private String _LEFTBOTTOMTITLE;
	private String _LEFTBOTTOMCOMPANY;
	private String _MIDUP;
	private String _MIDUPTITLE;
	private String _MIDUPCOMPANY;
	private String _MIDBOTTOM;
	private String _MIDBOTTOMTITLE;
	private String _MIDBOTTOMCOMPANY;
	private String _RIGHTUP;
	private String _RIGHTUPTITLE;
	private String _RIGHTUPCOMPANY;
	private String _RIGHTBOTTOM;
	private String _RIGHTBOTTOMTITLE;
	private String _RIGHTBOTTOMCOMPANY;
	private long _ModuleId;
	private long _YearId;
	private String _CheckFlag;
	private long _SiteId;
	private Date _CreateDate;
	private String _CreatedBy;
	private Date _ModifiedDate;
	private String _ModifiedBy;
}