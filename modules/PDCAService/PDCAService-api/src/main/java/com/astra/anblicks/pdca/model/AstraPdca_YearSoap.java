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
 * This class is used by SOAP remote services, specifically {@link com.astra.anblicks.pdca.service.http.AstraPdca_YearServiceSoap}.
 *
 * @author Brian Wing Shun Chan
 * @see com.astra.anblicks.pdca.service.http.AstraPdca_YearServiceSoap
 * @generated
 */
@ProviderType
public class AstraPdca_YearSoap implements Serializable {
	public static AstraPdca_YearSoap toSoapModel(AstraPdca_Year model) {
		AstraPdca_YearSoap soapModel = new AstraPdca_YearSoap();

		soapModel.setYearId(model.getYearId());
		soapModel.setYearId_Company(model.getYearId_Company());
		soapModel.setYear(model.getYear());
		soapModel.setSiteId(model.getSiteId());
		soapModel.setCreateDate(model.getCreateDate());
		soapModel.setCreatedBy(model.getCreatedBy());
		soapModel.setModifiedDate(model.getModifiedDate());
		soapModel.setModifiedBy(model.getModifiedBy());

		return soapModel;
	}

	public static AstraPdca_YearSoap[] toSoapModels(AstraPdca_Year[] models) {
		AstraPdca_YearSoap[] soapModels = new AstraPdca_YearSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static AstraPdca_YearSoap[][] toSoapModels(AstraPdca_Year[][] models) {
		AstraPdca_YearSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new AstraPdca_YearSoap[models.length][models[0].length];
		}
		else {
			soapModels = new AstraPdca_YearSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static AstraPdca_YearSoap[] toSoapModels(List<AstraPdca_Year> models) {
		List<AstraPdca_YearSoap> soapModels = new ArrayList<AstraPdca_YearSoap>(models.size());

		for (AstraPdca_Year model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new AstraPdca_YearSoap[soapModels.size()]);
	}

	public AstraPdca_YearSoap() {
	}

	public long getPrimaryKey() {
		return _YearId;
	}

	public void setPrimaryKey(long pk) {
		setYearId(pk);
	}

	public long getYearId() {
		return _YearId;
	}

	public void setYearId(long YearId) {
		_YearId = YearId;
	}

	public long getYearId_Company() {
		return _YearId_Company;
	}

	public void setYearId_Company(long YearId_Company) {
		_YearId_Company = YearId_Company;
	}

	public long getYear() {
		return _Year;
	}

	public void setYear(long Year) {
		_Year = Year;
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

	private long _YearId;
	private long _YearId_Company;
	private long _Year;
	private long _SiteId;
	private Date _CreateDate;
	private String _CreatedBy;
	private Date _ModifiedDate;
	private String _ModifiedBy;
}