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
 * This class is a wrapper for {@link ci_kpi}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see ci_kpi
 * @generated
 */
@ProviderType
public class ci_kpiWrapper implements ci_kpi, ModelWrapper<ci_kpi> {
	public ci_kpiWrapper(ci_kpi ci_kpi) {
		_ci_kpi = ci_kpi;
	}

	@Override
	public Class<?> getModelClass() {
		return ci_kpi.class;
	}

	@Override
	public String getModelClassName() {
		return ci_kpi.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("uuid", getUuid());
		attributes.put("ciKpiId", getCiKpiId());
		attributes.put("addKpiId", getAddKpiId());
		attributes.put("ciPeriodId", getCiPeriodId());
		attributes.put("targetYTD", getTargetYTD());
		attributes.put("problemIdentification", getProblemIdentification());
		attributes.put("proposedAction", getProposedAction());
		attributes.put("achivement", getAchivement());
		attributes.put("status", getStatus());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		String uuid = (String)attributes.get("uuid");

		if (uuid != null) {
			setUuid(uuid);
		}

		Long ciKpiId = (Long)attributes.get("ciKpiId");

		if (ciKpiId != null) {
			setCiKpiId(ciKpiId);
		}

		Long addKpiId = (Long)attributes.get("addKpiId");

		if (addKpiId != null) {
			setAddKpiId(addKpiId);
		}

		Long ciPeriodId = (Long)attributes.get("ciPeriodId");

		if (ciPeriodId != null) {
			setCiPeriodId(ciPeriodId);
		}

		String targetYTD = (String)attributes.get("targetYTD");

		if (targetYTD != null) {
			setTargetYTD(targetYTD);
		}

		String problemIdentification = (String)attributes.get(
				"problemIdentification");

		if (problemIdentification != null) {
			setProblemIdentification(problemIdentification);
		}

		String proposedAction = (String)attributes.get("proposedAction");

		if (proposedAction != null) {
			setProposedAction(proposedAction);
		}

		String achivement = (String)attributes.get("achivement");

		if (achivement != null) {
			setAchivement(achivement);
		}

		String status = (String)attributes.get("status");

		if (status != null) {
			setStatus(status);
		}
	}

	@Override
	public boolean isCachedModel() {
		return _ci_kpi.isCachedModel();
	}

	@Override
	public boolean isEscapedModel() {
		return _ci_kpi.isEscapedModel();
	}

	@Override
	public boolean isNew() {
		return _ci_kpi.isNew();
	}

	@Override
	public com.astra.anblicks.pdca.model.ci_kpi toEscapedModel() {
		return new ci_kpiWrapper(_ci_kpi.toEscapedModel());
	}

	@Override
	public com.astra.anblicks.pdca.model.ci_kpi toUnescapedModel() {
		return new ci_kpiWrapper(_ci_kpi.toUnescapedModel());
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return _ci_kpi.getExpandoBridge();
	}

	@Override
	public com.liferay.portal.kernel.model.CacheModel<com.astra.anblicks.pdca.model.ci_kpi> toCacheModel() {
		return _ci_kpi.toCacheModel();
	}

	@Override
	public int compareTo(com.astra.anblicks.pdca.model.ci_kpi ci_kpi) {
		return _ci_kpi.compareTo(ci_kpi);
	}

	@Override
	public int hashCode() {
		return _ci_kpi.hashCode();
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _ci_kpi.getPrimaryKeyObj();
	}

	@Override
	public java.lang.Object clone() {
		return new ci_kpiWrapper((ci_kpi)_ci_kpi.clone());
	}

	/**
	* Returns the achivement of this ci_kpi.
	*
	* @return the achivement of this ci_kpi
	*/
	@Override
	public java.lang.String getAchivement() {
		return _ci_kpi.getAchivement();
	}

	/**
	* Returns the problem identification of this ci_kpi.
	*
	* @return the problem identification of this ci_kpi
	*/
	@Override
	public java.lang.String getProblemIdentification() {
		return _ci_kpi.getProblemIdentification();
	}

	/**
	* Returns the proposed action of this ci_kpi.
	*
	* @return the proposed action of this ci_kpi
	*/
	@Override
	public java.lang.String getProposedAction() {
		return _ci_kpi.getProposedAction();
	}

	/**
	* Returns the status of this ci_kpi.
	*
	* @return the status of this ci_kpi
	*/
	@Override
	public java.lang.String getStatus() {
		return _ci_kpi.getStatus();
	}

	/**
	* Returns the target ytd of this ci_kpi.
	*
	* @return the target ytd of this ci_kpi
	*/
	@Override
	public java.lang.String getTargetYTD() {
		return _ci_kpi.getTargetYTD();
	}

	/**
	* Returns the uuid of this ci_kpi.
	*
	* @return the uuid of this ci_kpi
	*/
	@Override
	public java.lang.String getUuid() {
		return _ci_kpi.getUuid();
	}

	@Override
	public java.lang.String toString() {
		return _ci_kpi.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _ci_kpi.toXmlString();
	}

	/**
	* Returns the add kpi ID of this ci_kpi.
	*
	* @return the add kpi ID of this ci_kpi
	*/
	@Override
	public long getAddKpiId() {
		return _ci_kpi.getAddKpiId();
	}

	/**
	* Returns the ci kpi ID of this ci_kpi.
	*
	* @return the ci kpi ID of this ci_kpi
	*/
	@Override
	public long getCiKpiId() {
		return _ci_kpi.getCiKpiId();
	}

	/**
	* Returns the ci period ID of this ci_kpi.
	*
	* @return the ci period ID of this ci_kpi
	*/
	@Override
	public long getCiPeriodId() {
		return _ci_kpi.getCiPeriodId();
	}

	/**
	* Returns the primary key of this ci_kpi.
	*
	* @return the primary key of this ci_kpi
	*/
	@Override
	public long getPrimaryKey() {
		return _ci_kpi.getPrimaryKey();
	}

	@Override
	public void persist() {
		_ci_kpi.persist();
	}

	/**
	* Sets the achivement of this ci_kpi.
	*
	* @param achivement the achivement of this ci_kpi
	*/
	@Override
	public void setAchivement(java.lang.String achivement) {
		_ci_kpi.setAchivement(achivement);
	}

	/**
	* Sets the add kpi ID of this ci_kpi.
	*
	* @param addKpiId the add kpi ID of this ci_kpi
	*/
	@Override
	public void setAddKpiId(long addKpiId) {
		_ci_kpi.setAddKpiId(addKpiId);
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_ci_kpi.setCachedModel(cachedModel);
	}

	/**
	* Sets the ci kpi ID of this ci_kpi.
	*
	* @param ciKpiId the ci kpi ID of this ci_kpi
	*/
	@Override
	public void setCiKpiId(long ciKpiId) {
		_ci_kpi.setCiKpiId(ciKpiId);
	}

	/**
	* Sets the ci period ID of this ci_kpi.
	*
	* @param ciPeriodId the ci period ID of this ci_kpi
	*/
	@Override
	public void setCiPeriodId(long ciPeriodId) {
		_ci_kpi.setCiPeriodId(ciPeriodId);
	}

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge) {
		_ci_kpi.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.kernel.model.BaseModel<?> baseModel) {
		_ci_kpi.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		_ci_kpi.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public void setNew(boolean n) {
		_ci_kpi.setNew(n);
	}

	/**
	* Sets the primary key of this ci_kpi.
	*
	* @param primaryKey the primary key of this ci_kpi
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_ci_kpi.setPrimaryKey(primaryKey);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		_ci_kpi.setPrimaryKeyObj(primaryKeyObj);
	}

	/**
	* Sets the problem identification of this ci_kpi.
	*
	* @param problemIdentification the problem identification of this ci_kpi
	*/
	@Override
	public void setProblemIdentification(java.lang.String problemIdentification) {
		_ci_kpi.setProblemIdentification(problemIdentification);
	}

	/**
	* Sets the proposed action of this ci_kpi.
	*
	* @param proposedAction the proposed action of this ci_kpi
	*/
	@Override
	public void setProposedAction(java.lang.String proposedAction) {
		_ci_kpi.setProposedAction(proposedAction);
	}

	/**
	* Sets the status of this ci_kpi.
	*
	* @param status the status of this ci_kpi
	*/
	@Override
	public void setStatus(java.lang.String status) {
		_ci_kpi.setStatus(status);
	}

	/**
	* Sets the target ytd of this ci_kpi.
	*
	* @param targetYTD the target ytd of this ci_kpi
	*/
	@Override
	public void setTargetYTD(java.lang.String targetYTD) {
		_ci_kpi.setTargetYTD(targetYTD);
	}

	/**
	* Sets the uuid of this ci_kpi.
	*
	* @param uuid the uuid of this ci_kpi
	*/
	@Override
	public void setUuid(java.lang.String uuid) {
		_ci_kpi.setUuid(uuid);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof ci_kpiWrapper)) {
			return false;
		}

		ci_kpiWrapper ci_kpiWrapper = (ci_kpiWrapper)obj;

		if (Objects.equals(_ci_kpi, ci_kpiWrapper._ci_kpi)) {
			return true;
		}

		return false;
	}

	@Override
	public ci_kpi getWrappedModel() {
		return _ci_kpi;
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _ci_kpi.isEntityCacheEnabled();
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _ci_kpi.isFinderCacheEnabled();
	}

	@Override
	public void resetOriginalValues() {
		_ci_kpi.resetOriginalValues();
	}

	private final ci_kpi _ci_kpi;
}