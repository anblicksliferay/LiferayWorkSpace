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
 * This class is a wrapper for {@link AstraPdca_Module}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see AstraPdca_Module
 * @generated
 */
@ProviderType
public class AstraPdca_ModuleWrapper implements AstraPdca_Module,
	ModelWrapper<AstraPdca_Module> {
	public AstraPdca_ModuleWrapper(AstraPdca_Module astraPdca_Module) {
		_astraPdca_Module = astraPdca_Module;
	}

	@Override
	public Class<?> getModelClass() {
		return AstraPdca_Module.class;
	}

	@Override
	public String getModelClassName() {
		return AstraPdca_Module.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("ModuleId", getModuleId());
		attributes.put("ModuleId_Company", getModuleId_Company());
		attributes.put("ModuleName", getModuleName());
		attributes.put("checkUncheckFlag", getCheckUncheckFlag());
		attributes.put("SiteId", getSiteId());
		attributes.put("CreateDate", getCreateDate());
		attributes.put("CreatedBy", getCreatedBy());
		attributes.put("ModifiedDate", getModifiedDate());
		attributes.put("ModifiedBy", getModifiedBy());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long ModuleId = (Long)attributes.get("ModuleId");

		if (ModuleId != null) {
			setModuleId(ModuleId);
		}

		Long ModuleId_Company = (Long)attributes.get("ModuleId_Company");

		if (ModuleId_Company != null) {
			setModuleId_Company(ModuleId_Company);
		}

		String ModuleName = (String)attributes.get("ModuleName");

		if (ModuleName != null) {
			setModuleName(ModuleName);
		}

		String checkUncheckFlag = (String)attributes.get("checkUncheckFlag");

		if (checkUncheckFlag != null) {
			setCheckUncheckFlag(checkUncheckFlag);
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
	public AstraPdca_Module toEscapedModel() {
		return new AstraPdca_ModuleWrapper(_astraPdca_Module.toEscapedModel());
	}

	@Override
	public AstraPdca_Module toUnescapedModel() {
		return new AstraPdca_ModuleWrapper(_astraPdca_Module.toUnescapedModel());
	}

	@Override
	public boolean isCachedModel() {
		return _astraPdca_Module.isCachedModel();
	}

	@Override
	public boolean isEscapedModel() {
		return _astraPdca_Module.isEscapedModel();
	}

	@Override
	public boolean isNew() {
		return _astraPdca_Module.isNew();
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return _astraPdca_Module.getExpandoBridge();
	}

	@Override
	public com.liferay.portal.kernel.model.CacheModel<AstraPdca_Module> toCacheModel() {
		return _astraPdca_Module.toCacheModel();
	}

	@Override
	public int compareTo(AstraPdca_Module astraPdca_Module) {
		return _astraPdca_Module.compareTo(astraPdca_Module);
	}

	@Override
	public int hashCode() {
		return _astraPdca_Module.hashCode();
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _astraPdca_Module.getPrimaryKeyObj();
	}

	@Override
	public java.lang.Object clone() {
		return new AstraPdca_ModuleWrapper((AstraPdca_Module)_astraPdca_Module.clone());
	}

	/**
	* Returns the check uncheck flag of this astra pdca_ module.
	*
	* @return the check uncheck flag of this astra pdca_ module
	*/
	@Override
	public java.lang.String getCheckUncheckFlag() {
		return _astraPdca_Module.getCheckUncheckFlag();
	}

	/**
	* Returns the created by of this astra pdca_ module.
	*
	* @return the created by of this astra pdca_ module
	*/
	@Override
	public java.lang.String getCreatedBy() {
		return _astraPdca_Module.getCreatedBy();
	}

	/**
	* Returns the modified by of this astra pdca_ module.
	*
	* @return the modified by of this astra pdca_ module
	*/
	@Override
	public java.lang.String getModifiedBy() {
		return _astraPdca_Module.getModifiedBy();
	}

	/**
	* Returns the module name of this astra pdca_ module.
	*
	* @return the module name of this astra pdca_ module
	*/
	@Override
	public java.lang.String getModuleName() {
		return _astraPdca_Module.getModuleName();
	}

	@Override
	public java.lang.String toString() {
		return _astraPdca_Module.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _astraPdca_Module.toXmlString();
	}

	/**
	* Returns the create date of this astra pdca_ module.
	*
	* @return the create date of this astra pdca_ module
	*/
	@Override
	public Date getCreateDate() {
		return _astraPdca_Module.getCreateDate();
	}

	/**
	* Returns the modified date of this astra pdca_ module.
	*
	* @return the modified date of this astra pdca_ module
	*/
	@Override
	public Date getModifiedDate() {
		return _astraPdca_Module.getModifiedDate();
	}

	/**
	* Returns the module ID of this astra pdca_ module.
	*
	* @return the module ID of this astra pdca_ module
	*/
	@Override
	public long getModuleId() {
		return _astraPdca_Module.getModuleId();
	}

	/**
	* Returns the module id_ company of this astra pdca_ module.
	*
	* @return the module id_ company of this astra pdca_ module
	*/
	@Override
	public long getModuleId_Company() {
		return _astraPdca_Module.getModuleId_Company();
	}

	/**
	* Returns the primary key of this astra pdca_ module.
	*
	* @return the primary key of this astra pdca_ module
	*/
	@Override
	public long getPrimaryKey() {
		return _astraPdca_Module.getPrimaryKey();
	}

	/**
	* Returns the site ID of this astra pdca_ module.
	*
	* @return the site ID of this astra pdca_ module
	*/
	@Override
	public long getSiteId() {
		return _astraPdca_Module.getSiteId();
	}

	@Override
	public void persist() {
		_astraPdca_Module.persist();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_astraPdca_Module.setCachedModel(cachedModel);
	}

	/**
	* Sets the check uncheck flag of this astra pdca_ module.
	*
	* @param checkUncheckFlag the check uncheck flag of this astra pdca_ module
	*/
	@Override
	public void setCheckUncheckFlag(java.lang.String checkUncheckFlag) {
		_astraPdca_Module.setCheckUncheckFlag(checkUncheckFlag);
	}

	/**
	* Sets the create date of this astra pdca_ module.
	*
	* @param CreateDate the create date of this astra pdca_ module
	*/
	@Override
	public void setCreateDate(Date CreateDate) {
		_astraPdca_Module.setCreateDate(CreateDate);
	}

	/**
	* Sets the created by of this astra pdca_ module.
	*
	* @param CreatedBy the created by of this astra pdca_ module
	*/
	@Override
	public void setCreatedBy(java.lang.String CreatedBy) {
		_astraPdca_Module.setCreatedBy(CreatedBy);
	}

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge) {
		_astraPdca_Module.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.kernel.model.BaseModel<?> baseModel) {
		_astraPdca_Module.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		_astraPdca_Module.setExpandoBridgeAttributes(serviceContext);
	}

	/**
	* Sets the modified by of this astra pdca_ module.
	*
	* @param ModifiedBy the modified by of this astra pdca_ module
	*/
	@Override
	public void setModifiedBy(java.lang.String ModifiedBy) {
		_astraPdca_Module.setModifiedBy(ModifiedBy);
	}

	/**
	* Sets the modified date of this astra pdca_ module.
	*
	* @param ModifiedDate the modified date of this astra pdca_ module
	*/
	@Override
	public void setModifiedDate(Date ModifiedDate) {
		_astraPdca_Module.setModifiedDate(ModifiedDate);
	}

	/**
	* Sets the module ID of this astra pdca_ module.
	*
	* @param ModuleId the module ID of this astra pdca_ module
	*/
	@Override
	public void setModuleId(long ModuleId) {
		_astraPdca_Module.setModuleId(ModuleId);
	}

	/**
	* Sets the module id_ company of this astra pdca_ module.
	*
	* @param ModuleId_Company the module id_ company of this astra pdca_ module
	*/
	@Override
	public void setModuleId_Company(long ModuleId_Company) {
		_astraPdca_Module.setModuleId_Company(ModuleId_Company);
	}

	/**
	* Sets the module name of this astra pdca_ module.
	*
	* @param ModuleName the module name of this astra pdca_ module
	*/
	@Override
	public void setModuleName(java.lang.String ModuleName) {
		_astraPdca_Module.setModuleName(ModuleName);
	}

	@Override
	public void setNew(boolean n) {
		_astraPdca_Module.setNew(n);
	}

	/**
	* Sets the primary key of this astra pdca_ module.
	*
	* @param primaryKey the primary key of this astra pdca_ module
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_astraPdca_Module.setPrimaryKey(primaryKey);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		_astraPdca_Module.setPrimaryKeyObj(primaryKeyObj);
	}

	/**
	* Sets the site ID of this astra pdca_ module.
	*
	* @param SiteId the site ID of this astra pdca_ module
	*/
	@Override
	public void setSiteId(long SiteId) {
		_astraPdca_Module.setSiteId(SiteId);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof AstraPdca_ModuleWrapper)) {
			return false;
		}

		AstraPdca_ModuleWrapper astraPdca_ModuleWrapper = (AstraPdca_ModuleWrapper)obj;

		if (Objects.equals(_astraPdca_Module,
					astraPdca_ModuleWrapper._astraPdca_Module)) {
			return true;
		}

		return false;
	}

	@Override
	public AstraPdca_Module getWrappedModel() {
		return _astraPdca_Module;
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _astraPdca_Module.isEntityCacheEnabled();
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _astraPdca_Module.isFinderCacheEnabled();
	}

	@Override
	public void resetOriginalValues() {
		_astraPdca_Module.resetOriginalValues();
	}

	private final AstraPdca_Module _astraPdca_Module;
}