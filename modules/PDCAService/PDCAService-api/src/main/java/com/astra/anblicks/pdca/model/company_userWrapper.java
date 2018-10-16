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

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * <p>
 * This class is a wrapper for {@link company_user}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see company_user
 * @generated
 */
@ProviderType
public class company_userWrapper implements company_user,
	ModelWrapper<company_user> {
	public company_userWrapper(company_user company_user) {
		_company_user = company_user;
	}

	@Override
	public Class<?> getModelClass() {
		return company_user.class;
	}

	@Override
	public String getModelClassName() {
		return company_user.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("company_user_Id", getCompany_user_Id());
		attributes.put("companyId", getCompanyId());
		attributes.put("Pdca_userId", getPdca_userId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long company_user_Id = (Long)attributes.get("company_user_Id");

		if (company_user_Id != null) {
			setCompany_user_Id(company_user_Id);
		}

		Long companyId = (Long)attributes.get("companyId");

		if (companyId != null) {
			setCompanyId(companyId);
		}

		Long Pdca_userId = (Long)attributes.get("Pdca_userId");

		if (Pdca_userId != null) {
			setPdca_userId(Pdca_userId);
		}
	}

	@Override
	public boolean isCachedModel() {
		return _company_user.isCachedModel();
	}

	@Override
	public boolean isEscapedModel() {
		return _company_user.isEscapedModel();
	}

	@Override
	public boolean isNew() {
		return _company_user.isNew();
	}

	@Override
	public com.astra.anblicks.pdca.model.company_user toEscapedModel() {
		return new company_userWrapper(_company_user.toEscapedModel());
	}

	@Override
	public com.astra.anblicks.pdca.model.company_user toUnescapedModel() {
		return new company_userWrapper(_company_user.toUnescapedModel());
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return _company_user.getExpandoBridge();
	}

	@Override
	public com.liferay.portal.kernel.model.CacheModel<com.astra.anblicks.pdca.model.company_user> toCacheModel() {
		return _company_user.toCacheModel();
	}

	@Override
	public int compareTo(
		com.astra.anblicks.pdca.model.company_user company_user) {
		return _company_user.compareTo(company_user);
	}

	@Override
	public int hashCode() {
		return _company_user.hashCode();
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _company_user.getPrimaryKeyObj();
	}

	@Override
	public java.lang.Object clone() {
		return new company_userWrapper((company_user)_company_user.clone());
	}

	@Override
	public java.lang.String toString() {
		return _company_user.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _company_user.toXmlString();
	}

	/**
	* Returns the company ID of this company_user.
	*
	* @return the company ID of this company_user
	*/
	@Override
	public long getCompanyId() {
		return _company_user.getCompanyId();
	}

	/**
	* Returns the company_user_ ID of this company_user.
	*
	* @return the company_user_ ID of this company_user
	*/
	@Override
	public long getCompany_user_Id() {
		return _company_user.getCompany_user_Id();
	}

	/**
	* Returns the pdca_user ID of this company_user.
	*
	* @return the pdca_user ID of this company_user
	*/
	@Override
	public long getPdca_userId() {
		return _company_user.getPdca_userId();
	}

	/**
	* Returns the primary key of this company_user.
	*
	* @return the primary key of this company_user
	*/
	@Override
	public long getPrimaryKey() {
		return _company_user.getPrimaryKey();
	}

	@Override
	public void persist() {
		_company_user.persist();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_company_user.setCachedModel(cachedModel);
	}

	/**
	* Sets the company ID of this company_user.
	*
	* @param companyId the company ID of this company_user
	*/
	@Override
	public void setCompanyId(long companyId) {
		_company_user.setCompanyId(companyId);
	}

	/**
	* Sets the company_user_ ID of this company_user.
	*
	* @param company_user_Id the company_user_ ID of this company_user
	*/
	@Override
	public void setCompany_user_Id(long company_user_Id) {
		_company_user.setCompany_user_Id(company_user_Id);
	}

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge) {
		_company_user.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.kernel.model.BaseModel<?> baseModel) {
		_company_user.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		_company_user.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public void setNew(boolean n) {
		_company_user.setNew(n);
	}

	/**
	* Sets the pdca_user ID of this company_user.
	*
	* @param Pdca_userId the pdca_user ID of this company_user
	*/
	@Override
	public void setPdca_userId(long Pdca_userId) {
		_company_user.setPdca_userId(Pdca_userId);
	}

	/**
	* Sets the primary key of this company_user.
	*
	* @param primaryKey the primary key of this company_user
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_company_user.setPrimaryKey(primaryKey);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		_company_user.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof company_userWrapper)) {
			return false;
		}

		company_userWrapper company_userWrapper = (company_userWrapper)obj;

		if (Objects.equals(_company_user, company_userWrapper._company_user)) {
			return true;
		}

		return false;
	}

	@Override
	public company_user getWrappedModel() {
		return _company_user;
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _company_user.isEntityCacheEnabled();
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _company_user.isFinderCacheEnabled();
	}

	@Override
	public void resetOriginalValues() {
		_company_user.resetOriginalValues();
	}

	private final company_user _company_user;
}