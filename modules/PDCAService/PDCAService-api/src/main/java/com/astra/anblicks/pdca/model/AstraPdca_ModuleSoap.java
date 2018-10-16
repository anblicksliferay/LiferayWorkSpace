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
 * This class is used by SOAP remote services, specifically {@link com.astra.anblicks.pdca.service.http.AstraPdca_ModuleServiceSoap}.
 *
 * @author Brian Wing Shun Chan
 * @see com.astra.anblicks.pdca.service.http.AstraPdca_ModuleServiceSoap
 * @generated
 */
@ProviderType
public class AstraPdca_ModuleSoap implements Serializable {
	public static AstraPdca_ModuleSoap toSoapModel(AstraPdca_Module model) {
		AstraPdca_ModuleSoap soapModel = new AstraPdca_ModuleSoap();

		soapModel.setModuleId(model.getModuleId());
		soapModel.setModuleId_Company(model.getModuleId_Company());
		soapModel.setModuleName(model.getModuleName());
		soapModel.setCheckUncheckFlag(model.getCheckUncheckFlag());
		soapModel.setSiteId(model.getSiteId());
		soapModel.setCreateDate(model.getCreateDate());
		soapModel.setCreatedBy(model.getCreatedBy());
		soapModel.setModifiedDate(model.getModifiedDate());
		soapModel.setModifiedBy(model.getModifiedBy());

		return soapModel;
	}

	public static AstraPdca_ModuleSoap[] toSoapModels(AstraPdca_Module[] models) {
		AstraPdca_ModuleSoap[] soapModels = new AstraPdca_ModuleSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static AstraPdca_ModuleSoap[][] toSoapModels(
		AstraPdca_Module[][] models) {
		AstraPdca_ModuleSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new AstraPdca_ModuleSoap[models.length][models[0].length];
		}
		else {
			soapModels = new AstraPdca_ModuleSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static AstraPdca_ModuleSoap[] toSoapModels(
		List<AstraPdca_Module> models) {
		List<AstraPdca_ModuleSoap> soapModels = new ArrayList<AstraPdca_ModuleSoap>(models.size());

		for (AstraPdca_Module model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new AstraPdca_ModuleSoap[soapModels.size()]);
	}

	public AstraPdca_ModuleSoap() {
	}

	public long getPrimaryKey() {
		return _ModuleId;
	}

	public void setPrimaryKey(long pk) {
		setModuleId(pk);
	}

	public long getModuleId() {
		return _ModuleId;
	}

	public void setModuleId(long ModuleId) {
		_ModuleId = ModuleId;
	}

	public long getModuleId_Company() {
		return _ModuleId_Company;
	}

	public void setModuleId_Company(long ModuleId_Company) {
		_ModuleId_Company = ModuleId_Company;
	}

	public String getModuleName() {
		return _ModuleName;
	}

	public void setModuleName(String ModuleName) {
		_ModuleName = ModuleName;
	}

	public String getCheckUncheckFlag() {
		return _checkUncheckFlag;
	}

	public void setCheckUncheckFlag(String checkUncheckFlag) {
		_checkUncheckFlag = checkUncheckFlag;
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

	private long _ModuleId;
	private long _ModuleId_Company;
	private String _ModuleName;
	private String _checkUncheckFlag;
	private long _SiteId;
	private Date _CreateDate;
	private String _CreatedBy;
	private Date _ModifiedDate;
	private String _ModifiedBy;
}