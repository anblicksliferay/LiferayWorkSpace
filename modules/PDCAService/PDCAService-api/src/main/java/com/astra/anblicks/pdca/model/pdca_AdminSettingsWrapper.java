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

import com.liferay.expando.kernel.model.ExpandoBridge;

import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.service.ServiceContext;

import java.io.Serializable;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * <p>
 * This class is a wrapper for {@link pdca_AdminSettings}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see pdca_AdminSettings
 * @generated
 */
@ProviderType
public class pdca_AdminSettingsWrapper implements pdca_AdminSettings,
	ModelWrapper<pdca_AdminSettings> {
	public pdca_AdminSettingsWrapper(pdca_AdminSettings pdca_AdminSettings) {
		_pdca_AdminSettings = pdca_AdminSettings;
	}

	@Override
	public Class<?> getModelClass() {
		return pdca_AdminSettings.class;
	}

	@Override
	public String getModelClassName() {
		return pdca_AdminSettings.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("settings_Id", getSettings_Id());
		attributes.put("moduleId", getModuleId());
		attributes.put("year", getYear());
		attributes.put("companyId", getCompanyId());
		attributes.put("periodId", getPeriodId());
		attributes.put("SiteId", getSiteId());
		attributes.put("CreateDate", getCreateDate());
		attributes.put("CreatedBy", getCreatedBy());
		attributes.put("ModifiedDate", getModifiedDate());
		attributes.put("ModifiedBy", getModifiedBy());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long settings_Id = (Long)attributes.get("settings_Id");

		if (settings_Id != null) {
			setSettings_Id(settings_Id);
		}

		Long moduleId = (Long)attributes.get("moduleId");

		if (moduleId != null) {
			setModuleId(moduleId);
		}

		Long year = (Long)attributes.get("year");

		if (year != null) {
			setYear(year);
		}

		Long companyId = (Long)attributes.get("companyId");

		if (companyId != null) {
			setCompanyId(companyId);
		}

		Long periodId = (Long)attributes.get("periodId");

		if (periodId != null) {
			setPeriodId(periodId);
		}

		Long SiteId = (Long)attributes.get("SiteId");

		if (SiteId != null) {
			setSiteId(SiteId);
		}

		Date CreateDate = (Date)attributes.get("CreateDate");

		if (CreateDate != null) {
			setCreateDate(CreateDate);
		}

		String CreatedBy = (String)attributes.get("CreatedBy");

		if (CreatedBy != null) {
			setCreatedBy(CreatedBy);
		}

		Date ModifiedDate = (Date)attributes.get("ModifiedDate");

		if (ModifiedDate != null) {
			setModifiedDate(ModifiedDate);
		}

		String ModifiedBy = (String)attributes.get("ModifiedBy");

		if (ModifiedBy != null) {
			setModifiedBy(ModifiedBy);
		}
	}

	@Override
	public boolean isCachedModel() {
		return _pdca_AdminSettings.isCachedModel();
	}

	@Override
	public boolean isEscapedModel() {
		return _pdca_AdminSettings.isEscapedModel();
	}

	@Override
	public boolean isNew() {
		return _pdca_AdminSettings.isNew();
	}

	@Override
	public com.astra.anblicks.pdca.model.pdca_AdminSettings toEscapedModel() {
		return new pdca_AdminSettingsWrapper(_pdca_AdminSettings.toEscapedModel());
	}

	@Override
	public com.astra.anblicks.pdca.model.pdca_AdminSettings toUnescapedModel() {
		return new pdca_AdminSettingsWrapper(_pdca_AdminSettings.toUnescapedModel());
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return _pdca_AdminSettings.getExpandoBridge();
	}

	@Override
	public com.liferay.portal.kernel.model.CacheModel<com.astra.anblicks.pdca.model.pdca_AdminSettings> toCacheModel() {
		return _pdca_AdminSettings.toCacheModel();
	}

	@Override
	public int compareTo(
		com.astra.anblicks.pdca.model.pdca_AdminSettings pdca_AdminSettings) {
		return _pdca_AdminSettings.compareTo(pdca_AdminSettings);
	}

	@Override
	public int hashCode() {
		return _pdca_AdminSettings.hashCode();
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _pdca_AdminSettings.getPrimaryKeyObj();
	}

	@Override
	public java.lang.Object clone() {
		return new pdca_AdminSettingsWrapper((pdca_AdminSettings)_pdca_AdminSettings.clone());
	}

	/**
	* Returns the created by of this pdca_ admin settings.
	*
	* @return the created by of this pdca_ admin settings
	*/
	@Override
	public java.lang.String getCreatedBy() {
		return _pdca_AdminSettings.getCreatedBy();
	}

	/**
	* Returns the modified by of this pdca_ admin settings.
	*
	* @return the modified by of this pdca_ admin settings
	*/
	@Override
	public java.lang.String getModifiedBy() {
		return _pdca_AdminSettings.getModifiedBy();
	}

	@Override
	public java.lang.String toString() {
		return _pdca_AdminSettings.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _pdca_AdminSettings.toXmlString();
	}

	/**
	* Returns the create date of this pdca_ admin settings.
	*
	* @return the create date of this pdca_ admin settings
	*/
	@Override
	public Date getCreateDate() {
		return _pdca_AdminSettings.getCreateDate();
	}

	/**
	* Returns the modified date of this pdca_ admin settings.
	*
	* @return the modified date of this pdca_ admin settings
	*/
	@Override
	public Date getModifiedDate() {
		return _pdca_AdminSettings.getModifiedDate();
	}

	/**
	* Returns the company ID of this pdca_ admin settings.
	*
	* @return the company ID of this pdca_ admin settings
	*/
	@Override
	public long getCompanyId() {
		return _pdca_AdminSettings.getCompanyId();
	}

	/**
	* Returns the module ID of this pdca_ admin settings.
	*
	* @return the module ID of this pdca_ admin settings
	*/
	@Override
	public long getModuleId() {
		return _pdca_AdminSettings.getModuleId();
	}

	/**
	* Returns the period ID of this pdca_ admin settings.
	*
	* @return the period ID of this pdca_ admin settings
	*/
	@Override
	public long getPeriodId() {
		return _pdca_AdminSettings.getPeriodId();
	}

	/**
	* Returns the primary key of this pdca_ admin settings.
	*
	* @return the primary key of this pdca_ admin settings
	*/
	@Override
	public long getPrimaryKey() {
		return _pdca_AdminSettings.getPrimaryKey();
	}

	/**
	* Returns the settings_ ID of this pdca_ admin settings.
	*
	* @return the settings_ ID of this pdca_ admin settings
	*/
	@Override
	public long getSettings_Id() {
		return _pdca_AdminSettings.getSettings_Id();
	}

	/**
	* Returns the site ID of this pdca_ admin settings.
	*
	* @return the site ID of this pdca_ admin settings
	*/
	@Override
	public long getSiteId() {
		return _pdca_AdminSettings.getSiteId();
	}

	/**
	* Returns the year of this pdca_ admin settings.
	*
	* @return the year of this pdca_ admin settings
	*/
	@Override
	public long getYear() {
		return _pdca_AdminSettings.getYear();
	}

	@Override
	public void persist() {
		_pdca_AdminSettings.persist();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_pdca_AdminSettings.setCachedModel(cachedModel);
	}

	/**
	* Sets the company ID of this pdca_ admin settings.
	*
	* @param companyId the company ID of this pdca_ admin settings
	*/
	@Override
	public void setCompanyId(long companyId) {
		_pdca_AdminSettings.setCompanyId(companyId);
	}

	/**
	* Sets the create date of this pdca_ admin settings.
	*
	* @param CreateDate the create date of this pdca_ admin settings
	*/
	@Override
	public void setCreateDate(Date CreateDate) {
		_pdca_AdminSettings.setCreateDate(CreateDate);
	}

	/**
	* Sets the created by of this pdca_ admin settings.
	*
	* @param CreatedBy the created by of this pdca_ admin settings
	*/
	@Override
	public void setCreatedBy(java.lang.String CreatedBy) {
		_pdca_AdminSettings.setCreatedBy(CreatedBy);
	}

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge) {
		_pdca_AdminSettings.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.kernel.model.BaseModel<?> baseModel) {
		_pdca_AdminSettings.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		_pdca_AdminSettings.setExpandoBridgeAttributes(serviceContext);
	}

	/**
	* Sets the modified by of this pdca_ admin settings.
	*
	* @param ModifiedBy the modified by of this pdca_ admin settings
	*/
	@Override
	public void setModifiedBy(java.lang.String ModifiedBy) {
		_pdca_AdminSettings.setModifiedBy(ModifiedBy);
	}

	/**
	* Sets the modified date of this pdca_ admin settings.
	*
	* @param ModifiedDate the modified date of this pdca_ admin settings
	*/
	@Override
	public void setModifiedDate(Date ModifiedDate) {
		_pdca_AdminSettings.setModifiedDate(ModifiedDate);
	}

	/**
	* Sets the module ID of this pdca_ admin settings.
	*
	* @param moduleId the module ID of this pdca_ admin settings
	*/
	@Override
	public void setModuleId(long moduleId) {
		_pdca_AdminSettings.setModuleId(moduleId);
	}

	@Override
	public void setNew(boolean n) {
		_pdca_AdminSettings.setNew(n);
	}

	/**
	* Sets the period ID of this pdca_ admin settings.
	*
	* @param periodId the period ID of this pdca_ admin settings
	*/
	@Override
	public void setPeriodId(long periodId) {
		_pdca_AdminSettings.setPeriodId(periodId);
	}

	/**
	* Sets the primary key of this pdca_ admin settings.
	*
	* @param primaryKey the primary key of this pdca_ admin settings
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_pdca_AdminSettings.setPrimaryKey(primaryKey);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		_pdca_AdminSettings.setPrimaryKeyObj(primaryKeyObj);
	}

	/**
	* Sets the settings_ ID of this pdca_ admin settings.
	*
	* @param settings_Id the settings_ ID of this pdca_ admin settings
	*/
	@Override
	public void setSettings_Id(long settings_Id) {
		_pdca_AdminSettings.setSettings_Id(settings_Id);
	}

	/**
	* Sets the site ID of this pdca_ admin settings.
	*
	* @param SiteId the site ID of this pdca_ admin settings
	*/
	@Override
	public void setSiteId(long SiteId) {
		_pdca_AdminSettings.setSiteId(SiteId);
	}

	/**
	* Sets the year of this pdca_ admin settings.
	*
	* @param year the year of this pdca_ admin settings
	*/
	@Override
	public void setYear(long year) {
		_pdca_AdminSettings.setYear(year);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof pdca_AdminSettingsWrapper)) {
			return false;
		}

		pdca_AdminSettingsWrapper pdca_AdminSettingsWrapper = (pdca_AdminSettingsWrapper)obj;

		if (Objects.equals(_pdca_AdminSettings,
					pdca_AdminSettingsWrapper._pdca_AdminSettings)) {
			return true;
		}

		return false;
	}

	@Override
	public pdca_AdminSettings getWrappedModel() {
		return _pdca_AdminSettings;
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _pdca_AdminSettings.isEntityCacheEnabled();
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _pdca_AdminSettings.isFinderCacheEnabled();
	}

	@Override
	public void resetOriginalValues() {
		_pdca_AdminSettings.resetOriginalValues();
	}

	private final pdca_AdminSettings _pdca_AdminSettings;
}