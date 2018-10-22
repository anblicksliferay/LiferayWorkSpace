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
 * This class is used by SOAP remote services, specifically {@link com.astra.anblicks.pdca.service.http.addkpi_ciServiceSoap}.
 *
 * @author Brian Wing Shun Chan
 * @see com.astra.anblicks.pdca.service.http.addkpi_ciServiceSoap
 * @generated
 */
@ProviderType
public class addkpi_ciSoap implements Serializable {
	public static addkpi_ciSoap toSoapModel(addkpi_ci model) {
		addkpi_ciSoap soapModel = new addkpi_ciSoap();

		soapModel.setUuid(model.getUuid());
		soapModel.setAddKpiId(model.getAddKpiId());
		soapModel.setCompanyId(model.getCompanyId());
		soapModel.setYear(model.getYear());
		soapModel.setStrategyType(model.getStrategyType());
		soapModel.setStrategy(model.getStrategy());
		soapModel.setTarget(model.getTarget());
		soapModel.setKpi(model.getKpi());
		soapModel.setUserId(model.getUserId());
		soapModel.setUserName(model.getUserName());
		soapModel.setCreateDate(model.getCreateDate());
		soapModel.setModifiedDate(model.getModifiedDate());

		return soapModel;
	}

	public static addkpi_ciSoap[] toSoapModels(addkpi_ci[] models) {
		addkpi_ciSoap[] soapModels = new addkpi_ciSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static addkpi_ciSoap[][] toSoapModels(addkpi_ci[][] models) {
		addkpi_ciSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new addkpi_ciSoap[models.length][models[0].length];
		}
		else {
			soapModels = new addkpi_ciSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static addkpi_ciSoap[] toSoapModels(List<addkpi_ci> models) {
		List<addkpi_ciSoap> soapModels = new ArrayList<addkpi_ciSoap>(models.size());

		for (addkpi_ci model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new addkpi_ciSoap[soapModels.size()]);
	}

	public addkpi_ciSoap() {
	}

	public long getPrimaryKey() {
		return _addKpiId;
	}

	public void setPrimaryKey(long pk) {
		setAddKpiId(pk);
	}

	public String getUuid() {
		return _uuid;
	}

	public void setUuid(String uuid) {
		_uuid = uuid;
	}

	public long getAddKpiId() {
		return _addKpiId;
	}

	public void setAddKpiId(long addKpiId) {
		_addKpiId = addKpiId;
	}

	public long getCompanyId() {
		return _companyId;
	}

	public void setCompanyId(long companyId) {
		_companyId = companyId;
	}

	public long getYear() {
		return _year;
	}

	public void setYear(long year) {
		_year = year;
	}

	public String getStrategyType() {
		return _strategyType;
	}

	public void setStrategyType(String strategyType) {
		_strategyType = strategyType;
	}

	public String getStrategy() {
		return _strategy;
	}

	public void setStrategy(String strategy) {
		_strategy = strategy;
	}

	public String getTarget() {
		return _target;
	}

	public void setTarget(String target) {
		_target = target;
	}

	public String getKpi() {
		return _kpi;
	}

	public void setKpi(String kpi) {
		_kpi = kpi;
	}

	public long getUserId() {
		return _userId;
	}

	public void setUserId(long userId) {
		_userId = userId;
	}

	public String getUserName() {
		return _userName;
	}

	public void setUserName(String userName) {
		_userName = userName;
	}

	public Date getCreateDate() {
		return _createDate;
	}

	public void setCreateDate(Date createDate) {
		_createDate = createDate;
	}

	public Date getModifiedDate() {
		return _modifiedDate;
	}

	public void setModifiedDate(Date modifiedDate) {
		_modifiedDate = modifiedDate;
	}

	private String _uuid;
	private long _addKpiId;
	private long _companyId;
	private long _year;
	private String _strategyType;
	private String _strategy;
	private String _target;
	private String _kpi;
	private long _userId;
	private String _userName;
	private Date _createDate;
	private Date _modifiedDate;
}