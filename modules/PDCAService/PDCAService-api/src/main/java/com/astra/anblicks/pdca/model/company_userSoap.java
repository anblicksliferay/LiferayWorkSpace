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
 * This class is used by SOAP remote services, specifically {@link com.astra.anblicks.pdca.service.http.company_userServiceSoap}.
 *
 * @author Brian Wing Shun Chan
 * @see com.astra.anblicks.pdca.service.http.company_userServiceSoap
 * @generated
 */
@ProviderType
public class company_userSoap implements Serializable {
	public static company_userSoap toSoapModel(company_user model) {
		company_userSoap soapModel = new company_userSoap();

		soapModel.setCompany_user_Id(model.getCompany_user_Id());
		soapModel.setCompanyId(model.getCompanyId());
		soapModel.setPdca_userId(model.getPdca_userId());

		return soapModel;
	}

	public static company_userSoap[] toSoapModels(company_user[] models) {
		company_userSoap[] soapModels = new company_userSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static company_userSoap[][] toSoapModels(company_user[][] models) {
		company_userSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new company_userSoap[models.length][models[0].length];
		}
		else {
			soapModels = new company_userSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static company_userSoap[] toSoapModels(List<company_user> models) {
		List<company_userSoap> soapModels = new ArrayList<company_userSoap>(models.size());

		for (company_user model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new company_userSoap[soapModels.size()]);
	}

	public company_userSoap() {
	}

	public long getPrimaryKey() {
		return _company_user_Id;
	}

	public void setPrimaryKey(long pk) {
		setCompany_user_Id(pk);
	}

	public long getCompany_user_Id() {
		return _company_user_Id;
	}

	public void setCompany_user_Id(long company_user_Id) {
		_company_user_Id = company_user_Id;
	}

	public long getCompanyId() {
		return _companyId;
	}

	public void setCompanyId(long companyId) {
		_companyId = companyId;
	}

	public long getPdca_userId() {
		return _Pdca_userId;
	}

	public void setPdca_userId(long Pdca_userId) {
		_Pdca_userId = Pdca_userId;
	}

	private long _company_user_Id;
	private long _companyId;
	private long _Pdca_userId;
}