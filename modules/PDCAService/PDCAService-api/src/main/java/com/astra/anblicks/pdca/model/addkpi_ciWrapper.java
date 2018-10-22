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

import com.liferay.exportimport.kernel.lar.StagedModelType;

import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.service.ServiceContext;

import java.io.Serializable;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * <p>
 * This class is a wrapper for {@link addkpi_ci}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see addkpi_ci
 * @generated
 */
@ProviderType
public class addkpi_ciWrapper implements addkpi_ci, ModelWrapper<addkpi_ci> {
	public addkpi_ciWrapper(addkpi_ci addkpi_ci) {
		_addkpi_ci = addkpi_ci;
	}

	@Override
	public Class<?> getModelClass() {
		return addkpi_ci.class;
	}

	@Override
	public String getModelClassName() {
		return addkpi_ci.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("uuid", getUuid());
		attributes.put("addKpiId", getAddKpiId());
		attributes.put("companyId", getCompanyId());
		attributes.put("year", getYear());
		attributes.put("strategyType", getStrategyType());
		attributes.put("strategy", getStrategy());
		attributes.put("target", getTarget());
		attributes.put("kpi", getKpi());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		String uuid = (String)attributes.get("uuid");

		if (uuid != null) {
			setUuid(uuid);
		}

		Long addKpiId = (Long)attributes.get("addKpiId");

		if (addKpiId != null) {
			setAddKpiId(addKpiId);
		}

		Long companyId = (Long)attributes.get("companyId");

		if (companyId != null) {
			setCompanyId(companyId);
		}

		Long year = (Long)attributes.get("year");

		if (year != null) {
			setYear(year);
		}

		String strategyType = (String)attributes.get("strategyType");

		if (strategyType != null) {
			setStrategyType(strategyType);
		}

		String strategy = (String)attributes.get("strategy");

		if (strategy != null) {
			setStrategy(strategy);
		}

		String target = (String)attributes.get("target");

		if (target != null) {
			setTarget(target);
		}

		String kpi = (String)attributes.get("kpi");

		if (kpi != null) {
			setKpi(kpi);
		}

		Long userId = (Long)attributes.get("userId");

		if (userId != null) {
			setUserId(userId);
		}

		String userName = (String)attributes.get("userName");

		if (userName != null) {
			setUserName(userName);
		}

		Date createDate = (Date)attributes.get("createDate");

		if (createDate != null) {
			setCreateDate(createDate);
		}

		Date modifiedDate = (Date)attributes.get("modifiedDate");

		if (modifiedDate != null) {
			setModifiedDate(modifiedDate);
		}
	}

	@Override
	public boolean isCachedModel() {
		return _addkpi_ci.isCachedModel();
	}

	@Override
	public boolean isEscapedModel() {
		return _addkpi_ci.isEscapedModel();
	}

	@Override
	public boolean isNew() {
		return _addkpi_ci.isNew();
	}

	@Override
	public com.astra.anblicks.pdca.model.addkpi_ci toEscapedModel() {
		return new addkpi_ciWrapper(_addkpi_ci.toEscapedModel());
	}

	@Override
	public com.astra.anblicks.pdca.model.addkpi_ci toUnescapedModel() {
		return new addkpi_ciWrapper(_addkpi_ci.toUnescapedModel());
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return _addkpi_ci.getExpandoBridge();
	}

	@Override
	public com.liferay.portal.kernel.model.CacheModel<com.astra.anblicks.pdca.model.addkpi_ci> toCacheModel() {
		return _addkpi_ci.toCacheModel();
	}

	@Override
	public int compareTo(com.astra.anblicks.pdca.model.addkpi_ci addkpi_ci) {
		return _addkpi_ci.compareTo(addkpi_ci);
	}

	@Override
	public int hashCode() {
		return _addkpi_ci.hashCode();
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _addkpi_ci.getPrimaryKeyObj();
	}

	@Override
	public java.lang.Object clone() {
		return new addkpi_ciWrapper((addkpi_ci)_addkpi_ci.clone());
	}

	/**
	* Returns the kpi of this addkpi_ci.
	*
	* @return the kpi of this addkpi_ci
	*/
	@Override
	public java.lang.String getKpi() {
		return _addkpi_ci.getKpi();
	}

	/**
	* Returns the strategy of this addkpi_ci.
	*
	* @return the strategy of this addkpi_ci
	*/
	@Override
	public java.lang.String getStrategy() {
		return _addkpi_ci.getStrategy();
	}

	/**
	* Returns the strategy type of this addkpi_ci.
	*
	* @return the strategy type of this addkpi_ci
	*/
	@Override
	public java.lang.String getStrategyType() {
		return _addkpi_ci.getStrategyType();
	}

	/**
	* Returns the target of this addkpi_ci.
	*
	* @return the target of this addkpi_ci
	*/
	@Override
	public java.lang.String getTarget() {
		return _addkpi_ci.getTarget();
	}

	/**
	* Returns the user name of this addkpi_ci.
	*
	* @return the user name of this addkpi_ci
	*/
	@Override
	public java.lang.String getUserName() {
		return _addkpi_ci.getUserName();
	}

	/**
	* Returns the user uuid of this addkpi_ci.
	*
	* @return the user uuid of this addkpi_ci
	*/
	@Override
	public java.lang.String getUserUuid() {
		return _addkpi_ci.getUserUuid();
	}

	/**
	* Returns the uuid of this addkpi_ci.
	*
	* @return the uuid of this addkpi_ci
	*/
	@Override
	public java.lang.String getUuid() {
		return _addkpi_ci.getUuid();
	}

	@Override
	public java.lang.String toString() {
		return _addkpi_ci.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _addkpi_ci.toXmlString();
	}

	/**
	* Returns the create date of this addkpi_ci.
	*
	* @return the create date of this addkpi_ci
	*/
	@Override
	public Date getCreateDate() {
		return _addkpi_ci.getCreateDate();
	}

	/**
	* Returns the modified date of this addkpi_ci.
	*
	* @return the modified date of this addkpi_ci
	*/
	@Override
	public Date getModifiedDate() {
		return _addkpi_ci.getModifiedDate();
	}

	/**
	* Returns the add kpi ID of this addkpi_ci.
	*
	* @return the add kpi ID of this addkpi_ci
	*/
	@Override
	public long getAddKpiId() {
		return _addkpi_ci.getAddKpiId();
	}

	/**
	* Returns the company ID of this addkpi_ci.
	*
	* @return the company ID of this addkpi_ci
	*/
	@Override
	public long getCompanyId() {
		return _addkpi_ci.getCompanyId();
	}

	/**
	* Returns the primary key of this addkpi_ci.
	*
	* @return the primary key of this addkpi_ci
	*/
	@Override
	public long getPrimaryKey() {
		return _addkpi_ci.getPrimaryKey();
	}

	/**
	* Returns the user ID of this addkpi_ci.
	*
	* @return the user ID of this addkpi_ci
	*/
	@Override
	public long getUserId() {
		return _addkpi_ci.getUserId();
	}

	/**
	* Returns the year of this addkpi_ci.
	*
	* @return the year of this addkpi_ci
	*/
	@Override
	public long getYear() {
		return _addkpi_ci.getYear();
	}

	@Override
	public void persist() {
		_addkpi_ci.persist();
	}

	/**
	* Sets the add kpi ID of this addkpi_ci.
	*
	* @param addKpiId the add kpi ID of this addkpi_ci
	*/
	@Override
	public void setAddKpiId(long addKpiId) {
		_addkpi_ci.setAddKpiId(addKpiId);
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_addkpi_ci.setCachedModel(cachedModel);
	}

	/**
	* Sets the company ID of this addkpi_ci.
	*
	* @param companyId the company ID of this addkpi_ci
	*/
	@Override
	public void setCompanyId(long companyId) {
		_addkpi_ci.setCompanyId(companyId);
	}

	/**
	* Sets the create date of this addkpi_ci.
	*
	* @param createDate the create date of this addkpi_ci
	*/
	@Override
	public void setCreateDate(Date createDate) {
		_addkpi_ci.setCreateDate(createDate);
	}

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge) {
		_addkpi_ci.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.kernel.model.BaseModel<?> baseModel) {
		_addkpi_ci.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		_addkpi_ci.setExpandoBridgeAttributes(serviceContext);
	}

	/**
	* Sets the kpi of this addkpi_ci.
	*
	* @param kpi the kpi of this addkpi_ci
	*/
	@Override
	public void setKpi(java.lang.String kpi) {
		_addkpi_ci.setKpi(kpi);
	}

	/**
	* Sets the modified date of this addkpi_ci.
	*
	* @param modifiedDate the modified date of this addkpi_ci
	*/
	@Override
	public void setModifiedDate(Date modifiedDate) {
		_addkpi_ci.setModifiedDate(modifiedDate);
	}

	@Override
	public void setNew(boolean n) {
		_addkpi_ci.setNew(n);
	}

	/**
	* Sets the primary key of this addkpi_ci.
	*
	* @param primaryKey the primary key of this addkpi_ci
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_addkpi_ci.setPrimaryKey(primaryKey);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		_addkpi_ci.setPrimaryKeyObj(primaryKeyObj);
	}

	/**
	* Sets the strategy of this addkpi_ci.
	*
	* @param strategy the strategy of this addkpi_ci
	*/
	@Override
	public void setStrategy(java.lang.String strategy) {
		_addkpi_ci.setStrategy(strategy);
	}

	/**
	* Sets the strategy type of this addkpi_ci.
	*
	* @param strategyType the strategy type of this addkpi_ci
	*/
	@Override
	public void setStrategyType(java.lang.String strategyType) {
		_addkpi_ci.setStrategyType(strategyType);
	}

	/**
	* Sets the target of this addkpi_ci.
	*
	* @param target the target of this addkpi_ci
	*/
	@Override
	public void setTarget(java.lang.String target) {
		_addkpi_ci.setTarget(target);
	}

	/**
	* Sets the user ID of this addkpi_ci.
	*
	* @param userId the user ID of this addkpi_ci
	*/
	@Override
	public void setUserId(long userId) {
		_addkpi_ci.setUserId(userId);
	}

	/**
	* Sets the user name of this addkpi_ci.
	*
	* @param userName the user name of this addkpi_ci
	*/
	@Override
	public void setUserName(java.lang.String userName) {
		_addkpi_ci.setUserName(userName);
	}

	/**
	* Sets the user uuid of this addkpi_ci.
	*
	* @param userUuid the user uuid of this addkpi_ci
	*/
	@Override
	public void setUserUuid(java.lang.String userUuid) {
		_addkpi_ci.setUserUuid(userUuid);
	}

	/**
	* Sets the uuid of this addkpi_ci.
	*
	* @param uuid the uuid of this addkpi_ci
	*/
	@Override
	public void setUuid(java.lang.String uuid) {
		_addkpi_ci.setUuid(uuid);
	}

	/**
	* Sets the year of this addkpi_ci.
	*
	* @param year the year of this addkpi_ci
	*/
	@Override
	public void setYear(long year) {
		_addkpi_ci.setYear(year);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof addkpi_ciWrapper)) {
			return false;
		}

		addkpi_ciWrapper addkpi_ciWrapper = (addkpi_ciWrapper)obj;

		if (Objects.equals(_addkpi_ci, addkpi_ciWrapper._addkpi_ci)) {
			return true;
		}

		return false;
	}

	@Override
	public StagedModelType getStagedModelType() {
		return _addkpi_ci.getStagedModelType();
	}

	@Override
	public addkpi_ci getWrappedModel() {
		return _addkpi_ci;
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _addkpi_ci.isEntityCacheEnabled();
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _addkpi_ci.isFinderCacheEnabled();
	}

	@Override
	public void resetOriginalValues() {
		_addkpi_ci.resetOriginalValues();
	}

	private final addkpi_ci _addkpi_ci;
}