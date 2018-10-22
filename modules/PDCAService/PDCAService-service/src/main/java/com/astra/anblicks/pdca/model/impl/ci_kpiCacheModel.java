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

import com.astra.anblicks.pdca.model.ci_kpi;

import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.portal.kernel.util.HashUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing ci_kpi in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @see ci_kpi
 * @generated
 */
@ProviderType
public class ci_kpiCacheModel implements CacheModel<ci_kpi>, Externalizable {
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof ci_kpiCacheModel)) {
			return false;
		}

		ci_kpiCacheModel ci_kpiCacheModel = (ci_kpiCacheModel)obj;

		if (ciKpiId == ci_kpiCacheModel.ciKpiId) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, ciKpiId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(19);

		sb.append("{uuid=");
		sb.append(uuid);
		sb.append(", ciKpiId=");
		sb.append(ciKpiId);
		sb.append(", addKpiId=");
		sb.append(addKpiId);
		sb.append(", ciPeriodId=");
		sb.append(ciPeriodId);
		sb.append(", targetYTD=");
		sb.append(targetYTD);
		sb.append(", problemIdentification=");
		sb.append(problemIdentification);
		sb.append(", proposedAction=");
		sb.append(proposedAction);
		sb.append(", achivement=");
		sb.append(achivement);
		sb.append(", status=");
		sb.append(status);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public ci_kpi toEntityModel() {
		ci_kpiImpl ci_kpiImpl = new ci_kpiImpl();

		if (uuid == null) {
			ci_kpiImpl.setUuid(StringPool.BLANK);
		}
		else {
			ci_kpiImpl.setUuid(uuid);
		}

		ci_kpiImpl.setCiKpiId(ciKpiId);
		ci_kpiImpl.setAddKpiId(addKpiId);
		ci_kpiImpl.setCiPeriodId(ciPeriodId);

		if (targetYTD == null) {
			ci_kpiImpl.setTargetYTD(StringPool.BLANK);
		}
		else {
			ci_kpiImpl.setTargetYTD(targetYTD);
		}

		if (problemIdentification == null) {
			ci_kpiImpl.setProblemIdentification(StringPool.BLANK);
		}
		else {
			ci_kpiImpl.setProblemIdentification(problemIdentification);
		}

		if (proposedAction == null) {
			ci_kpiImpl.setProposedAction(StringPool.BLANK);
		}
		else {
			ci_kpiImpl.setProposedAction(proposedAction);
		}

		if (achivement == null) {
			ci_kpiImpl.setAchivement(StringPool.BLANK);
		}
		else {
			ci_kpiImpl.setAchivement(achivement);
		}

		if (status == null) {
			ci_kpiImpl.setStatus(StringPool.BLANK);
		}
		else {
			ci_kpiImpl.setStatus(status);
		}

		ci_kpiImpl.resetOriginalValues();

		return ci_kpiImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		uuid = objectInput.readUTF();

		ciKpiId = objectInput.readLong();

		addKpiId = objectInput.readLong();

		ciPeriodId = objectInput.readLong();
		targetYTD = objectInput.readUTF();
		problemIdentification = objectInput.readUTF();
		proposedAction = objectInput.readUTF();
		achivement = objectInput.readUTF();
		status = objectInput.readUTF();
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

		objectOutput.writeLong(ciKpiId);

		objectOutput.writeLong(addKpiId);

		objectOutput.writeLong(ciPeriodId);

		if (targetYTD == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(targetYTD);
		}

		if (problemIdentification == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(problemIdentification);
		}

		if (proposedAction == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(proposedAction);
		}

		if (achivement == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(achivement);
		}

		if (status == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(status);
		}
	}

	public String uuid;
	public long ciKpiId;
	public long addKpiId;
	public long ciPeriodId;
	public String targetYTD;
	public String problemIdentification;
	public String proposedAction;
	public String achivement;
	public String status;
}