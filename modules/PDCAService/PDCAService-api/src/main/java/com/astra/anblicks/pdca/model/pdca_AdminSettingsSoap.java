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
 * This class is used by SOAP remote services, specifically {@link com.astra.anblicks.pdca.service.http.pdca_AdminSettingsServiceSoap}.
 *
 * @author Brian Wing Shun Chan
 * @see com.astra.anblicks.pdca.service.http.pdca_AdminSettingsServiceSoap
 * @generated
 */
@ProviderType
public class pdca_AdminSettingsSoap implements Serializable {
	public static pdca_AdminSettingsSoap toSoapModel(pdca_AdminSettings model) {
		pdca_AdminSettingsSoap soapModel = new pdca_AdminSettingsSoap();

		soapModel.setSettings_Id(model.getSettings_Id());
		soapModel.setModuleId(model.getModuleId());
		soapModel.setYear(model.getYear());
		soapModel.setCompanyId(model.getCompanyId());
		soapModel.setPeriodId(model.getPeriodId());
		soapModel.setSiteId(model.getSiteId());
		soapModel.setCreateDate(model.getCreateDate());
		soapModel.setCreatedBy(model.getCreatedBy());
		soapModel.setModifiedDate(model.getModifiedDate());
		soapModel.setModifiedBy(model.getModifiedBy());

		return soapModel;
	}

	public static pdca_AdminSettingsSoap[] toSoapModels(
		pdca_AdminSettings[] models) {
		pdca_AdminSettingsSoap[] soapModels = new pdca_AdminSettingsSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static pdca_AdminSettingsSoap[][] toSoapModels(
		pdca_AdminSettings[][] models) {
		pdca_AdminSettingsSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new pdca_AdminSettingsSoap[models.length][models[0].length];
		}
		else {
			soapModels = new pdca_AdminSettingsSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static pdca_AdminSettingsSoap[] toSoapModels(
		List<pdca_AdminSettings> models) {
		List<pdca_AdminSettingsSoap> soapModels = new ArrayList<pdca_AdminSettingsSoap>(models.size());

		for (pdca_AdminSettings model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new pdca_AdminSettingsSoap[soapModels.size()]);
	}

	public pdca_AdminSettingsSoap() {
	}

	public long getPrimaryKey() {
		return _settings_Id;
	}

	public void setPrimaryKey(long pk) {
		setSettings_Id(pk);
	}

	public long getSettings_Id() {
		return _settings_Id;
	}

	public void setSettings_Id(long settings_Id) {
		_settings_Id = settings_Id;
	}

	public long getModuleId() {
		return _moduleId;
	}

	public void setModuleId(long moduleId) {
		_moduleId = moduleId;
	}

	public long getYear() {
		return _year;
	}

	public void setYear(long year) {
		_year = year;
	}

	public long getCompanyId() {
		return _companyId;
	}

	public void setCompanyId(long companyId) {
		_companyId = companyId;
	}

	public long getPeriodId() {
		return _periodId;
	}

	public void setPeriodId(long periodId) {
		_periodId = periodId;
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

	private long _settings_Id;
	private long _moduleId;
	private long _year;
	private long _companyId;
	private long _periodId;
	private long _SiteId;
	private Date _CreateDate;
	private String _CreatedBy;
	private Date _ModifiedDate;
	private String _ModifiedBy;
}