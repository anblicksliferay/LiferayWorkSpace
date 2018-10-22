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

package com.astra.anblicks.pdca.model.impl;

import aQute.bnd.annotation.ProviderType;

import com.astra.anblicks.pdca.model.addkpi_ci;

import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.portal.kernel.util.HashUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing addkpi_ci in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @see addkpi_ci
 * @generated
 */
@ProviderType
public class addkpi_ciCacheModel implements CacheModel<addkpi_ci>,
	Externalizable {
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof addkpi_ciCacheModel)) {
			return false;
		}

		addkpi_ciCacheModel addkpi_ciCacheModel = (addkpi_ciCacheModel)obj;

		if (addKpiId == addkpi_ciCacheModel.addKpiId) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, addKpiId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(25);

		sb.append("{uuid=");
		sb.append(uuid);
		sb.append(", addKpiId=");
		sb.append(addKpiId);
		sb.append(", companyId=");
		sb.append(companyId);
		sb.append(", year=");
		sb.append(year);
		sb.append(", strategyType=");
		sb.append(strategyType);
		sb.append(", strategy=");
		sb.append(strategy);
		sb.append(", target=");
		sb.append(target);
		sb.append(", kpi=");
		sb.append(kpi);
		sb.append(", userId=");
		sb.append(userId);
		sb.append(", userName=");
		sb.append(userName);
		sb.append(", createDate=");
		sb.append(createDate);
		sb.append(", modifiedDate=");
		sb.append(modifiedDate);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public addkpi_ci toEntityModel() {
		addkpi_ciImpl addkpi_ciImpl = new addkpi_ciImpl();

		if (uuid == null) {
			addkpi_ciImpl.setUuid(StringPool.BLANK);
		}
		else {
			addkpi_ciImpl.setUuid(uuid);
		}

		addkpi_ciImpl.setAddKpiId(addKpiId);
		addkpi_ciImpl.setCompanyId(companyId);
		addkpi_ciImpl.setYear(year);

		if (strategyType == null) {
			addkpi_ciImpl.setStrategyType(StringPool.BLANK);
		}
		else {
			addkpi_ciImpl.setStrategyType(strategyType);
		}

		if (strategy == null) {
			addkpi_ciImpl.setStrategy(StringPool.BLANK);
		}
		else {
			addkpi_ciImpl.setStrategy(strategy);
		}

		if (target == null) {
			addkpi_ciImpl.setTarget(StringPool.BLANK);
		}
		else {
			addkpi_ciImpl.setTarget(target);
		}

		if (kpi == null) {
			addkpi_ciImpl.setKpi(StringPool.BLANK);
		}
		else {
			addkpi_ciImpl.setKpi(kpi);
		}

		addkpi_ciImpl.setUserId(userId);

		if (userName == null) {
			addkpi_ciImpl.setUserName(StringPool.BLANK);
		}
		else {
			addkpi_ciImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			addkpi_ciImpl.setCreateDate(null);
		}
		else {
			addkpi_ciImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			addkpi_ciImpl.setModifiedDate(null);
		}
		else {
			addkpi_ciImpl.setModifiedDate(new Date(modifiedDate));
		}

		addkpi_ciImpl.resetOriginalValues();

		return addkpi_ciImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		uuid = objectInput.readUTF();

		addKpiId = objectInput.readLong();

		companyId = objectInput.readLong();

		year = objectInput.readLong();
		strategyType = objectInput.readUTF();
		strategy = objectInput.readUTF();
		target = objectInput.readUTF();
		kpi = objectInput.readUTF();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		if (uuid == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(uuid);
		}

		objectOutput.writeLong(addKpiId);

		objectOutput.writeLong(companyId);

		objectOutput.writeLong(year);

		if (strategyType == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(strategyType);
		}

		if (strategy == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(strategy);
		}

		if (target == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(target);
		}

		if (kpi == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(kpi);
		}

		objectOutput.writeLong(userId);

		if (userName == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(userName);
		}

		objectOutput.writeLong(createDate);
		objectOutput.writeLong(modifiedDate);
	}

	public String uuid;
	public long addKpiId;
	public long companyId;
	public long year;
	public String strategyType;
	public String strategy;
	public String target;
	public String kpi;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
}