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
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link com.astra.anblicks.pdca.service.http.ci_kpiServiceSoap}.
 *
 * @author Brian Wing Shun Chan
 * @see com.astra.anblicks.pdca.service.http.ci_kpiServiceSoap
 * @generated
 */
@ProviderType
public class ci_kpiSoap implements Serializable {
	public static ci_kpiSoap toSoapModel(ci_kpi model) {
		ci_kpiSoap soapModel = new ci_kpiSoap();

		soapModel.setUuid(model.getUuid());
		soapModel.setCiKpiId(model.getCiKpiId());
		soapModel.setAddKpiId(model.getAddKpiId());
		soapModel.setCiPeriodId(model.getCiPeriodId());
		soapModel.setTargetYTD(model.getTargetYTD());
		soapModel.setProblemIdentification(model.getProblemIdentification());
		soapModel.setProposedAction(model.getProposedAction());
		soapModel.setAchivement(model.getAchivement());
		soapModel.setStatus(model.getStatus());

		return soapModel;
	}

	public static ci_kpiSoap[] toSoapModels(ci_kpi[] models) {
		ci_kpiSoap[] soapModels = new ci_kpiSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static ci_kpiSoap[][] toSoapModels(ci_kpi[][] models) {
		ci_kpiSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new ci_kpiSoap[models.length][models[0].length];
		}
		else {
			soapModels = new ci_kpiSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static ci_kpiSoap[] toSoapModels(List<ci_kpi> models) {
		List<ci_kpiSoap> soapModels = new ArrayList<ci_kpiSoap>(models.size());

		for (ci_kpi model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new ci_kpiSoap[soapModels.size()]);
	}

	public ci_kpiSoap() {
	}

	public long getPrimaryKey() {
		return _ciKpiId;
	}

	public void setPrimaryKey(long pk) {
		setCiKpiId(pk);
	}

	public String getUuid() {
		return _uuid;
	}

	public void setUuid(String uuid) {
		_uuid = uuid;
	}

	public long getCiKpiId() {
		return _ciKpiId;
	}

	public void setCiKpiId(long ciKpiId) {
		_ciKpiId = ciKpiId;
	}

	public long getAddKpiId() {
		return _addKpiId;
	}

	public void setAddKpiId(long addKpiId) {
		_addKpiId = addKpiId;
	}

	public long getCiPeriodId() {
		return _ciPeriodId;
	}

	public void setCiPeriodId(long ciPeriodId) {
		_ciPeriodId = ciPeriodId;
	}

	public String getTargetYTD() {
		return _targetYTD;
	}

	public void setTargetYTD(String targetYTD) {
		_targetYTD = targetYTD;
	}

	public String getProblemIdentification() {
		return _problemIdentification;
	}

	public void setProblemIdentification(String problemIdentification) {
		_problemIdentification = problemIdentification;
	}

	public String getProposedAction() {
		return _proposedAction;
	}

	public void setProposedAction(String proposedAction) {
		_proposedAction = proposedAction;
	}

	public String getAchivement() {
		return _achivement;
	}

	public void setAchivement(String achivement) {
		_achivement = achivement;
	}

	public String getStatus() {
		return _status;
	}

	public void setStatus(String status) {
		_status = status;
	}

	private String _uuid;
	private long _ciKpiId;
	private long _addKpiId;
	private long _ciPeriodId;
	private String _targetYTD;
	private String _problemIdentification;
	private String _proposedAction;
	private String _achivement;
	private String _status;
}