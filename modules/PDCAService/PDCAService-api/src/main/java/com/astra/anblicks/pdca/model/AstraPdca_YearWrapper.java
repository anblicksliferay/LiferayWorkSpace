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
 * This class is a wrapper for {@link AstraPdca_Year}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see AstraPdca_Year
 * @generated
 */
@ProviderType
public class AstraPdca_YearWrapper implements AstraPdca_Year,
	ModelWrapper<AstraPdca_Year> {
	public AstraPdca_YearWrapper(AstraPdca_Year astraPdca_Year) {
		_astraPdca_Year = astraPdca_Year;
	}

	@Override
	public Class<?> getModelClass() {
		return AstraPdca_Year.class;
	}

	@Override
	public String getModelClassName() {
		return AstraPdca_Year.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("YearId", getYearId());
		attributes.put("YearId_Company", getYearId_Company());
		attributes.put("Year", getYear());
		attributes.put("SiteId", getSiteId());
		attributes.put("CreateDate", getCreateDate());
		attributes.put("CreatedBy", getCreatedBy());
		attributes.put("ModifiedDate", getModifiedDate());
		attributes.put("ModifiedBy", getModifiedBy());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long YearId = (Long)attributes.get("YearId");

		if (YearId != null) {
			setYearId(YearId);
		}

		Long YearId_Company = (Long)attributes.get("YearId_Company");

		if (YearId_Company != null) {
			setYearId_Company(YearId_Company);
		}

		Long Year = (Long)attributes.get("Year");

		if (Year != null) {
			setYear(Year);
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
	public AstraPdca_Year toEscapedModel() {
		return new AstraPdca_YearWrapper(_astraPdca_Year.toEscapedModel());
	}

	@Override
	public AstraPdca_Year toUnescapedModel() {
		return new AstraPdca_YearWrapper(_astraPdca_Year.toUnescapedModel());
	}

	@Override
	public boolean isCachedModel() {
		return _astraPdca_Year.isCachedModel();
	}

	@Override
	public boolean isEscapedModel() {
		return _astraPdca_Year.isEscapedModel();
	}

	@Override
	public boolean isNew() {
		return _astraPdca_Year.isNew();
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return _astraPdca_Year.getExpandoBridge();
	}

	@Override
	public com.liferay.portal.kernel.model.CacheModel<AstraPdca_Year> toCacheModel() {
		return _astraPdca_Year.toCacheModel();
	}

	@Override
	public int compareTo(AstraPdca_Year astraPdca_Year) {
		return _astraPdca_Year.compareTo(astraPdca_Year);
	}

	@Override
	public int hashCode() {
		return _astraPdca_Year.hashCode();
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _astraPdca_Year.getPrimaryKeyObj();
	}

	@Override
	public java.lang.Object clone() {
		return new AstraPdca_YearWrapper((AstraPdca_Year)_astraPdca_Year.clone());
	}

	/**
	* Returns the created by of this astra pdca_ year.
	*
	* @return the created by of this astra pdca_ year
	*/
	@Override
	public java.lang.String getCreatedBy() {
		return _astraPdca_Year.getCreatedBy();
	}

	/**
	* Returns the modified by of this astra pdca_ year.
	*
	* @return the modified by of this astra pdca_ year
	*/
	@Override
	public java.lang.String getModifiedBy() {
		return _astraPdca_Year.getModifiedBy();
	}

	@Override
	public java.lang.String toString() {
		return _astraPdca_Year.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _astraPdca_Year.toXmlString();
	}

	/**
	* Returns the create date of this astra pdca_ year.
	*
	* @return the create date of this astra pdca_ year
	*/
	@Override
	public Date getCreateDate() {
		return _astraPdca_Year.getCreateDate();
	}

	/**
	* Returns the modified date of this astra pdca_ year.
	*
	* @return the modified date of this astra pdca_ year
	*/
	@Override
	public Date getModifiedDate() {
		return _astraPdca_Year.getModifiedDate();
	}

	/**
	* Returns the primary key of this astra pdca_ year.
	*
	* @return the primary key of this astra pdca_ year
	*/
	@Override
	public long getPrimaryKey() {
		return _astraPdca_Year.getPrimaryKey();
	}

	/**
	* Returns the site ID of this astra pdca_ year.
	*
	* @return the site ID of this astra pdca_ year
	*/
	@Override
	public long getSiteId() {
		return _astraPdca_Year.getSiteId();
	}

	/**
	* Returns the year of this astra pdca_ year.
	*
	* @return the year of this astra pdca_ year
	*/
	@Override
	public long getYear() {
		return _astraPdca_Year.getYear();
	}

	/**
	* Returns the year ID of this astra pdca_ year.
	*
	* @return the year ID of this astra pdca_ year
	*/
	@Override
	public long getYearId() {
		return _astraPdca_Year.getYearId();
	}

	/**
	* Returns the year id_ company of this astra pdca_ year.
	*
	* @return the year id_ company of this astra pdca_ year
	*/
	@Override
	public long getYearId_Company() {
		return _astraPdca_Year.getYearId_Company();
	}

	@Override
	public void persist() {
		_astraPdca_Year.persist();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_astraPdca_Year.setCachedModel(cachedModel);
	}

	/**
	* Sets the create date of this astra pdca_ year.
	*
	* @param CreateDate the create date of this astra pdca_ year
	*/
	@Override
	public void setCreateDate(Date CreateDate) {
		_astraPdca_Year.setCreateDate(CreateDate);
	}

	/**
	* Sets the created by of this astra pdca_ year.
	*
	* @param CreatedBy the created by of this astra pdca_ year
	*/
	@Override
	public void setCreatedBy(java.lang.String CreatedBy) {
		_astraPdca_Year.setCreatedBy(CreatedBy);
	}

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge) {
		_astraPdca_Year.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.kernel.model.BaseModel<?> baseModel) {
		_astraPdca_Year.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		_astraPdca_Year.setExpandoBridgeAttributes(serviceContext);
	}

	/**
	* Sets the modified by of this astra pdca_ year.
	*
	* @param ModifiedBy the modified by of this astra pdca_ year
	*/
	@Override
	public void setModifiedBy(java.lang.String ModifiedBy) {
		_astraPdca_Year.setModifiedBy(ModifiedBy);
	}

	/**
	* Sets the modified date of this astra pdca_ year.
	*
	* @param ModifiedDate the modified date of this astra pdca_ year
	*/
	@Override
	public void setModifiedDate(Date ModifiedDate) {
		_astraPdca_Year.setModifiedDate(ModifiedDate);
	}

	@Override
	public void setNew(boolean n) {
		_astraPdca_Year.setNew(n);
	}

	/**
	* Sets the primary key of this astra pdca_ year.
	*
	* @param primaryKey the primary key of this astra pdca_ year
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_astraPdca_Year.setPrimaryKey(primaryKey);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		_astraPdca_Year.setPrimaryKeyObj(primaryKeyObj);
	}

	/**
	* Sets the site ID of this astra pdca_ year.
	*
	* @param SiteId the site ID of this astra pdca_ year
	*/
	@Override
	public void setSiteId(long SiteId) {
		_astraPdca_Year.setSiteId(SiteId);
	}

	/**
	* Sets the year of this astra pdca_ year.
	*
	* @param Year the year of this astra pdca_ year
	*/
	@Override
	public void setYear(long Year) {
		_astraPdca_Year.setYear(Year);
	}

	/**
	* Sets the year ID of this astra pdca_ year.
	*
	* @param YearId the year ID of this astra pdca_ year
	*/
	@Override
	public void setYearId(long YearId) {
		_astraPdca_Year.setYearId(YearId);
	}

	/**
	* Sets the year id_ company of this astra pdca_ year.
	*
	* @param YearId_Company the year id_ company of this astra pdca_ year
	*/
	@Override
	public void setYearId_Company(long YearId_Company) {
		_astraPdca_Year.setYearId_Company(YearId_Company);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof AstraPdca_YearWrapper)) {
			return false;
		}

		AstraPdca_YearWrapper astraPdca_YearWrapper = (AstraPdca_YearWrapper)obj;

		if (Objects.equals(_astraPdca_Year,
					astraPdca_YearWrapper._astraPdca_Year)) {
			return true;
		}

		return false;
	}

	@Override
	public AstraPdca_Year getWrappedModel() {
		return _astraPdca_Year;
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _astraPdca_Year.isEntityCacheEnabled();
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _astraPdca_Year.isFinderCacheEnabled();
	}

	@Override
	public void resetOriginalValues() {
		_astraPdca_Year.resetOriginalValues();
	}

	private final AstraPdca_Year _astraPdca_Year;
}