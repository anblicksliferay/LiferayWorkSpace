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
 * This class is a wrapper for {@link AstraPdca_CompanyData}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see AstraPdca_CompanyData
 * @generated
 */
@ProviderType
public class AstraPdca_CompanyDataWrapper implements AstraPdca_CompanyData,
	ModelWrapper<AstraPdca_CompanyData> {
	public AstraPdca_CompanyDataWrapper(
		AstraPdca_CompanyData astraPdca_CompanyData) {
		_astraPdca_CompanyData = astraPdca_CompanyData;
	}

	@Override
	public Class<?> getModelClass() {
		return AstraPdca_CompanyData.class;
	}

	@Override
	public String getModelClassName() {
		return AstraPdca_CompanyData.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("companyId", getCompanyId());
		attributes.put("CompanyCode", getCompanyCode());
		attributes.put("CompanyName", getCompanyName());
		attributes.put("GroupName", getGroupName());
		attributes.put("DIC", getDIC());
		attributes.put("DICINITIAL", getDICINITIAL());
		attributes.put("LEFTUP", getLEFTUP());
		attributes.put("LEFTUPTITLE", getLEFTUPTITLE());
		attributes.put("LEFTUPCOMPANY", getLEFTUPCOMPANY());
		attributes.put("LEFTBOTTOM", getLEFTBOTTOM());
		attributes.put("LEFTBOTTOMTITLE", getLEFTBOTTOMTITLE());
		attributes.put("LEFTBOTTOMCOMPANY", getLEFTBOTTOMCOMPANY());
		attributes.put("MIDUP", getMIDUP());
		attributes.put("MIDUPTITLE", getMIDUPTITLE());
		attributes.put("MIDUPCOMPANY", getMIDUPCOMPANY());
		attributes.put("MIDBOTTOM", getMIDBOTTOM());
		attributes.put("MIDBOTTOMTITLE", getMIDBOTTOMTITLE());
		attributes.put("MIDBOTTOMCOMPANY", getMIDBOTTOMCOMPANY());
		attributes.put("RIGHTUP", getRIGHTUP());
		attributes.put("RIGHTUPTITLE", getRIGHTUPTITLE());
		attributes.put("RIGHTUPCOMPANY", getRIGHTUPCOMPANY());
		attributes.put("RIGHTBOTTOM", getRIGHTBOTTOM());
		attributes.put("RIGHTBOTTOMTITLE", getRIGHTBOTTOMTITLE());
		attributes.put("RIGHTBOTTOMCOMPANY", getRIGHTBOTTOMCOMPANY());
		attributes.put("ModuleId", getModuleId());
		attributes.put("YearId", getYearId());
		attributes.put("CheckFlag", getCheckFlag());
		attributes.put("SiteId", getSiteId());
		attributes.put("CreateDate", getCreateDate());
		attributes.put("CreatedBy", getCreatedBy());
		attributes.put("ModifiedDate", getModifiedDate());
		attributes.put("ModifiedBy", getModifiedBy());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long companyId = (Long)attributes.get("companyId");

		if (companyId != null) {
			setCompanyId(companyId);
		}

		String CompanyCode = (String)attributes.get("CompanyCode");

		if (CompanyCode != null) {
			setCompanyCode(CompanyCode);
		}

		String CompanyName = (String)attributes.get("CompanyName");

		if (CompanyName != null) {
			setCompanyName(CompanyName);
		}

		String GroupName = (String)attributes.get("GroupName");

		if (GroupName != null) {
			setGroupName(GroupName);
		}

		String DIC = (String)attributes.get("DIC");

		if (DIC != null) {
			setDIC(DIC);
		}

		String DICINITIAL = (String)attributes.get("DICINITIAL");

		if (DICINITIAL != null) {
			setDICINITIAL(DICINITIAL);
		}

		String LEFTUP = (String)attributes.get("LEFTUP");

		if (LEFTUP != null) {
			setLEFTUP(LEFTUP);
		}

		String LEFTUPTITLE = (String)attributes.get("LEFTUPTITLE");

		if (LEFTUPTITLE != null) {
			setLEFTUPTITLE(LEFTUPTITLE);
		}

		String LEFTUPCOMPANY = (String)attributes.get("LEFTUPCOMPANY");

		if (LEFTUPCOMPANY != null) {
			setLEFTUPCOMPANY(LEFTUPCOMPANY);
		}

		String LEFTBOTTOM = (String)attributes.get("LEFTBOTTOM");

		if (LEFTBOTTOM != null) {
			setLEFTBOTTOM(LEFTBOTTOM);
		}

		String LEFTBOTTOMTITLE = (String)attributes.get("LEFTBOTTOMTITLE");

		if (LEFTBOTTOMTITLE != null) {
			setLEFTBOTTOMTITLE(LEFTBOTTOMTITLE);
		}

		String LEFTBOTTOMCOMPANY = (String)attributes.get("LEFTBOTTOMCOMPANY");

		if (LEFTBOTTOMCOMPANY != null) {
			setLEFTBOTTOMCOMPANY(LEFTBOTTOMCOMPANY);
		}

		String MIDUP = (String)attributes.get("MIDUP");

		if (MIDUP != null) {
			setMIDUP(MIDUP);
		}

		String MIDUPTITLE = (String)attributes.get("MIDUPTITLE");

		if (MIDUPTITLE != null) {
			setMIDUPTITLE(MIDUPTITLE);
		}

		String MIDUPCOMPANY = (String)attributes.get("MIDUPCOMPANY");

		if (MIDUPCOMPANY != null) {
			setMIDUPCOMPANY(MIDUPCOMPANY);
		}

		String MIDBOTTOM = (String)attributes.get("MIDBOTTOM");

		if (MIDBOTTOM != null) {
			setMIDBOTTOM(MIDBOTTOM);
		}

		String MIDBOTTOMTITLE = (String)attributes.get("MIDBOTTOMTITLE");

		if (MIDBOTTOMTITLE != null) {
			setMIDBOTTOMTITLE(MIDBOTTOMTITLE);
		}

		String MIDBOTTOMCOMPANY = (String)attributes.get("MIDBOTTOMCOMPANY");

		if (MIDBOTTOMCOMPANY != null) {
			setMIDBOTTOMCOMPANY(MIDBOTTOMCOMPANY);
		}

		String RIGHTUP = (String)attributes.get("RIGHTUP");

		if (RIGHTUP != null) {
			setRIGHTUP(RIGHTUP);
		}

		String RIGHTUPTITLE = (String)attributes.get("RIGHTUPTITLE");

		if (RIGHTUPTITLE != null) {
			setRIGHTUPTITLE(RIGHTUPTITLE);
		}

		String RIGHTUPCOMPANY = (String)attributes.get("RIGHTUPCOMPANY");

		if (RIGHTUPCOMPANY != null) {
			setRIGHTUPCOMPANY(RIGHTUPCOMPANY);
		}

		String RIGHTBOTTOM = (String)attributes.get("RIGHTBOTTOM");

		if (RIGHTBOTTOM != null) {
			setRIGHTBOTTOM(RIGHTBOTTOM);
		}

		String RIGHTBOTTOMTITLE = (String)attributes.get("RIGHTBOTTOMTITLE");

		if (RIGHTBOTTOMTITLE != null) {
			setRIGHTBOTTOMTITLE(RIGHTBOTTOMTITLE);
		}

		String RIGHTBOTTOMCOMPANY = (String)attributes.get("RIGHTBOTTOMCOMPANY");

		if (RIGHTBOTTOMCOMPANY != null) {
			setRIGHTBOTTOMCOMPANY(RIGHTBOTTOMCOMPANY);
		}

		Long ModuleId = (Long)attributes.get("ModuleId");

		if (ModuleId != null) {
			setModuleId(ModuleId);
		}

		Long YearId = (Long)attributes.get("YearId");

		if (YearId != null) {
			setYearId(YearId);
		}

		String CheckFlag = (String)attributes.get("CheckFlag");

		if (CheckFlag != null) {
			setCheckFlag(CheckFlag);
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
	public AstraPdca_CompanyData toEscapedModel() {
		return new AstraPdca_CompanyDataWrapper(_astraPdca_CompanyData.toEscapedModel());
	}

	@Override
	public AstraPdca_CompanyData toUnescapedModel() {
		return new AstraPdca_CompanyDataWrapper(_astraPdca_CompanyData.toUnescapedModel());
	}

	@Override
	public boolean isCachedModel() {
		return _astraPdca_CompanyData.isCachedModel();
	}

	@Override
	public boolean isEscapedModel() {
		return _astraPdca_CompanyData.isEscapedModel();
	}

	@Override
	public boolean isNew() {
		return _astraPdca_CompanyData.isNew();
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return _astraPdca_CompanyData.getExpandoBridge();
	}

	@Override
	public com.liferay.portal.kernel.model.CacheModel<AstraPdca_CompanyData> toCacheModel() {
		return _astraPdca_CompanyData.toCacheModel();
	}

	@Override
	public int compareTo(AstraPdca_CompanyData astraPdca_CompanyData) {
		return _astraPdca_CompanyData.compareTo(astraPdca_CompanyData);
	}

	@Override
	public int hashCode() {
		return _astraPdca_CompanyData.hashCode();
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _astraPdca_CompanyData.getPrimaryKeyObj();
	}

	@Override
	public java.lang.Object clone() {
		return new AstraPdca_CompanyDataWrapper((AstraPdca_CompanyData)_astraPdca_CompanyData.clone());
	}

	/**
	* Returns the check flag of this astra pdca_ company data.
	*
	* @return the check flag of this astra pdca_ company data
	*/
	@Override
	public java.lang.String getCheckFlag() {
		return _astraPdca_CompanyData.getCheckFlag();
	}

	/**
	* Returns the company code of this astra pdca_ company data.
	*
	* @return the company code of this astra pdca_ company data
	*/
	@Override
	public java.lang.String getCompanyCode() {
		return _astraPdca_CompanyData.getCompanyCode();
	}

	/**
	* Returns the company name of this astra pdca_ company data.
	*
	* @return the company name of this astra pdca_ company data
	*/
	@Override
	public java.lang.String getCompanyName() {
		return _astraPdca_CompanyData.getCompanyName();
	}

	/**
	* Returns the created by of this astra pdca_ company data.
	*
	* @return the created by of this astra pdca_ company data
	*/
	@Override
	public java.lang.String getCreatedBy() {
		return _astraPdca_CompanyData.getCreatedBy();
	}

	/**
	* Returns the dic of this astra pdca_ company data.
	*
	* @return the dic of this astra pdca_ company data
	*/
	@Override
	public java.lang.String getDIC() {
		return _astraPdca_CompanyData.getDIC();
	}

	/**
	* Returns the dicinitial of this astra pdca_ company data.
	*
	* @return the dicinitial of this astra pdca_ company data
	*/
	@Override
	public java.lang.String getDICINITIAL() {
		return _astraPdca_CompanyData.getDICINITIAL();
	}

	/**
	* Returns the group name of this astra pdca_ company data.
	*
	* @return the group name of this astra pdca_ company data
	*/
	@Override
	public java.lang.String getGroupName() {
		return _astraPdca_CompanyData.getGroupName();
	}

	/**
	* Returns the leftbottom of this astra pdca_ company data.
	*
	* @return the leftbottom of this astra pdca_ company data
	*/
	@Override
	public java.lang.String getLEFTBOTTOM() {
		return _astraPdca_CompanyData.getLEFTBOTTOM();
	}

	/**
	* Returns the leftbottomcompany of this astra pdca_ company data.
	*
	* @return the leftbottomcompany of this astra pdca_ company data
	*/
	@Override
	public java.lang.String getLEFTBOTTOMCOMPANY() {
		return _astraPdca_CompanyData.getLEFTBOTTOMCOMPANY();
	}

	/**
	* Returns the leftbottomtitle of this astra pdca_ company data.
	*
	* @return the leftbottomtitle of this astra pdca_ company data
	*/
	@Override
	public java.lang.String getLEFTBOTTOMTITLE() {
		return _astraPdca_CompanyData.getLEFTBOTTOMTITLE();
	}

	/**
	* Returns the leftup of this astra pdca_ company data.
	*
	* @return the leftup of this astra pdca_ company data
	*/
	@Override
	public java.lang.String getLEFTUP() {
		return _astraPdca_CompanyData.getLEFTUP();
	}

	/**
	* Returns the leftupcompany of this astra pdca_ company data.
	*
	* @return the leftupcompany of this astra pdca_ company data
	*/
	@Override
	public java.lang.String getLEFTUPCOMPANY() {
		return _astraPdca_CompanyData.getLEFTUPCOMPANY();
	}

	/**
	* Returns the leftuptitle of this astra pdca_ company data.
	*
	* @return the leftuptitle of this astra pdca_ company data
	*/
	@Override
	public java.lang.String getLEFTUPTITLE() {
		return _astraPdca_CompanyData.getLEFTUPTITLE();
	}

	/**
	* Returns the midbottom of this astra pdca_ company data.
	*
	* @return the midbottom of this astra pdca_ company data
	*/
	@Override
	public java.lang.String getMIDBOTTOM() {
		return _astraPdca_CompanyData.getMIDBOTTOM();
	}

	/**
	* Returns the midbottomcompany of this astra pdca_ company data.
	*
	* @return the midbottomcompany of this astra pdca_ company data
	*/
	@Override
	public java.lang.String getMIDBOTTOMCOMPANY() {
		return _astraPdca_CompanyData.getMIDBOTTOMCOMPANY();
	}

	/**
	* Returns the midbottomtitle of this astra pdca_ company data.
	*
	* @return the midbottomtitle of this astra pdca_ company data
	*/
	@Override
	public java.lang.String getMIDBOTTOMTITLE() {
		return _astraPdca_CompanyData.getMIDBOTTOMTITLE();
	}

	/**
	* Returns the midup of this astra pdca_ company data.
	*
	* @return the midup of this astra pdca_ company data
	*/
	@Override
	public java.lang.String getMIDUP() {
		return _astraPdca_CompanyData.getMIDUP();
	}

	/**
	* Returns the midupcompany of this astra pdca_ company data.
	*
	* @return the midupcompany of this astra pdca_ company data
	*/
	@Override
	public java.lang.String getMIDUPCOMPANY() {
		return _astraPdca_CompanyData.getMIDUPCOMPANY();
	}

	/**
	* Returns the miduptitle of this astra pdca_ company data.
	*
	* @return the miduptitle of this astra pdca_ company data
	*/
	@Override
	public java.lang.String getMIDUPTITLE() {
		return _astraPdca_CompanyData.getMIDUPTITLE();
	}

	/**
	* Returns the modified by of this astra pdca_ company data.
	*
	* @return the modified by of this astra pdca_ company data
	*/
	@Override
	public java.lang.String getModifiedBy() {
		return _astraPdca_CompanyData.getModifiedBy();
	}

	/**
	* Returns the rightbottom of this astra pdca_ company data.
	*
	* @return the rightbottom of this astra pdca_ company data
	*/
	@Override
	public java.lang.String getRIGHTBOTTOM() {
		return _astraPdca_CompanyData.getRIGHTBOTTOM();
	}

	/**
	* Returns the rightbottomcompany of this astra pdca_ company data.
	*
	* @return the rightbottomcompany of this astra pdca_ company data
	*/
	@Override
	public java.lang.String getRIGHTBOTTOMCOMPANY() {
		return _astraPdca_CompanyData.getRIGHTBOTTOMCOMPANY();
	}

	/**
	* Returns the rightbottomtitle of this astra pdca_ company data.
	*
	* @return the rightbottomtitle of this astra pdca_ company data
	*/
	@Override
	public java.lang.String getRIGHTBOTTOMTITLE() {
		return _astraPdca_CompanyData.getRIGHTBOTTOMTITLE();
	}

	/**
	* Returns the rightup of this astra pdca_ company data.
	*
	* @return the rightup of this astra pdca_ company data
	*/
	@Override
	public java.lang.String getRIGHTUP() {
		return _astraPdca_CompanyData.getRIGHTUP();
	}

	/**
	* Returns the rightupcompany of this astra pdca_ company data.
	*
	* @return the rightupcompany of this astra pdca_ company data
	*/
	@Override
	public java.lang.String getRIGHTUPCOMPANY() {
		return _astraPdca_CompanyData.getRIGHTUPCOMPANY();
	}

	/**
	* Returns the rightuptitle of this astra pdca_ company data.
	*
	* @return the rightuptitle of this astra pdca_ company data
	*/
	@Override
	public java.lang.String getRIGHTUPTITLE() {
		return _astraPdca_CompanyData.getRIGHTUPTITLE();
	}

	@Override
	public java.lang.String toString() {
		return _astraPdca_CompanyData.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _astraPdca_CompanyData.toXmlString();
	}

	/**
	* Returns the create date of this astra pdca_ company data.
	*
	* @return the create date of this astra pdca_ company data
	*/
	@Override
	public Date getCreateDate() {
		return _astraPdca_CompanyData.getCreateDate();
	}

	/**
	* Returns the modified date of this astra pdca_ company data.
	*
	* @return the modified date of this astra pdca_ company data
	*/
	@Override
	public Date getModifiedDate() {
		return _astraPdca_CompanyData.getModifiedDate();
	}

	/**
	* Returns the company ID of this astra pdca_ company data.
	*
	* @return the company ID of this astra pdca_ company data
	*/
	@Override
	public long getCompanyId() {
		return _astraPdca_CompanyData.getCompanyId();
	}

	/**
	* Returns the module ID of this astra pdca_ company data.
	*
	* @return the module ID of this astra pdca_ company data
	*/
	@Override
	public long getModuleId() {
		return _astraPdca_CompanyData.getModuleId();
	}

	/**
	* Returns the primary key of this astra pdca_ company data.
	*
	* @return the primary key of this astra pdca_ company data
	*/
	@Override
	public long getPrimaryKey() {
		return _astraPdca_CompanyData.getPrimaryKey();
	}

	/**
	* Returns the site ID of this astra pdca_ company data.
	*
	* @return the site ID of this astra pdca_ company data
	*/
	@Override
	public long getSiteId() {
		return _astraPdca_CompanyData.getSiteId();
	}

	/**
	* Returns the year ID of this astra pdca_ company data.
	*
	* @return the year ID of this astra pdca_ company data
	*/
	@Override
	public long getYearId() {
		return _astraPdca_CompanyData.getYearId();
	}

	@Override
	public void persist() {
		_astraPdca_CompanyData.persist();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_astraPdca_CompanyData.setCachedModel(cachedModel);
	}

	/**
	* Sets the check flag of this astra pdca_ company data.
	*
	* @param CheckFlag the check flag of this astra pdca_ company data
	*/
	@Override
	public void setCheckFlag(java.lang.String CheckFlag) {
		_astraPdca_CompanyData.setCheckFlag(CheckFlag);
	}

	/**
	* Sets the company code of this astra pdca_ company data.
	*
	* @param CompanyCode the company code of this astra pdca_ company data
	*/
	@Override
	public void setCompanyCode(java.lang.String CompanyCode) {
		_astraPdca_CompanyData.setCompanyCode(CompanyCode);
	}

	/**
	* Sets the company ID of this astra pdca_ company data.
	*
	* @param companyId the company ID of this astra pdca_ company data
	*/
	@Override
	public void setCompanyId(long companyId) {
		_astraPdca_CompanyData.setCompanyId(companyId);
	}

	/**
	* Sets the company name of this astra pdca_ company data.
	*
	* @param CompanyName the company name of this astra pdca_ company data
	*/
	@Override
	public void setCompanyName(java.lang.String CompanyName) {
		_astraPdca_CompanyData.setCompanyName(CompanyName);
	}

	/**
	* Sets the create date of this astra pdca_ company data.
	*
	* @param CreateDate the create date of this astra pdca_ company data
	*/
	@Override
	public void setCreateDate(Date CreateDate) {
		_astraPdca_CompanyData.setCreateDate(CreateDate);
	}

	/**
	* Sets the created by of this astra pdca_ company data.
	*
	* @param CreatedBy the created by of this astra pdca_ company data
	*/
	@Override
	public void setCreatedBy(java.lang.String CreatedBy) {
		_astraPdca_CompanyData.setCreatedBy(CreatedBy);
	}

	/**
	* Sets the dic of this astra pdca_ company data.
	*
	* @param DIC the dic of this astra pdca_ company data
	*/
	@Override
	public void setDIC(java.lang.String DIC) {
		_astraPdca_CompanyData.setDIC(DIC);
	}

	/**
	* Sets the dicinitial of this astra pdca_ company data.
	*
	* @param DICINITIAL the dicinitial of this astra pdca_ company data
	*/
	@Override
	public void setDICINITIAL(java.lang.String DICINITIAL) {
		_astraPdca_CompanyData.setDICINITIAL(DICINITIAL);
	}

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge) {
		_astraPdca_CompanyData.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.kernel.model.BaseModel<?> baseModel) {
		_astraPdca_CompanyData.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		_astraPdca_CompanyData.setExpandoBridgeAttributes(serviceContext);
	}

	/**
	* Sets the group name of this astra pdca_ company data.
	*
	* @param GroupName the group name of this astra pdca_ company data
	*/
	@Override
	public void setGroupName(java.lang.String GroupName) {
		_astraPdca_CompanyData.setGroupName(GroupName);
	}

	/**
	* Sets the leftbottom of this astra pdca_ company data.
	*
	* @param LEFTBOTTOM the leftbottom of this astra pdca_ company data
	*/
	@Override
	public void setLEFTBOTTOM(java.lang.String LEFTBOTTOM) {
		_astraPdca_CompanyData.setLEFTBOTTOM(LEFTBOTTOM);
	}

	/**
	* Sets the leftbottomcompany of this astra pdca_ company data.
	*
	* @param LEFTBOTTOMCOMPANY the leftbottomcompany of this astra pdca_ company data
	*/
	@Override
	public void setLEFTBOTTOMCOMPANY(java.lang.String LEFTBOTTOMCOMPANY) {
		_astraPdca_CompanyData.setLEFTBOTTOMCOMPANY(LEFTBOTTOMCOMPANY);
	}

	/**
	* Sets the leftbottomtitle of this astra pdca_ company data.
	*
	* @param LEFTBOTTOMTITLE the leftbottomtitle of this astra pdca_ company data
	*/
	@Override
	public void setLEFTBOTTOMTITLE(java.lang.String LEFTBOTTOMTITLE) {
		_astraPdca_CompanyData.setLEFTBOTTOMTITLE(LEFTBOTTOMTITLE);
	}

	/**
	* Sets the leftup of this astra pdca_ company data.
	*
	* @param LEFTUP the leftup of this astra pdca_ company data
	*/
	@Override
	public void setLEFTUP(java.lang.String LEFTUP) {
		_astraPdca_CompanyData.setLEFTUP(LEFTUP);
	}

	/**
	* Sets the leftupcompany of this astra pdca_ company data.
	*
	* @param LEFTUPCOMPANY the leftupcompany of this astra pdca_ company data
	*/
	@Override
	public void setLEFTUPCOMPANY(java.lang.String LEFTUPCOMPANY) {
		_astraPdca_CompanyData.setLEFTUPCOMPANY(LEFTUPCOMPANY);
	}

	/**
	* Sets the leftuptitle of this astra pdca_ company data.
	*
	* @param LEFTUPTITLE the leftuptitle of this astra pdca_ company data
	*/
	@Override
	public void setLEFTUPTITLE(java.lang.String LEFTUPTITLE) {
		_astraPdca_CompanyData.setLEFTUPTITLE(LEFTUPTITLE);
	}

	/**
	* Sets the midbottom of this astra pdca_ company data.
	*
	* @param MIDBOTTOM the midbottom of this astra pdca_ company data
	*/
	@Override
	public void setMIDBOTTOM(java.lang.String MIDBOTTOM) {
		_astraPdca_CompanyData.setMIDBOTTOM(MIDBOTTOM);
	}

	/**
	* Sets the midbottomcompany of this astra pdca_ company data.
	*
	* @param MIDBOTTOMCOMPANY the midbottomcompany of this astra pdca_ company data
	*/
	@Override
	public void setMIDBOTTOMCOMPANY(java.lang.String MIDBOTTOMCOMPANY) {
		_astraPdca_CompanyData.setMIDBOTTOMCOMPANY(MIDBOTTOMCOMPANY);
	}

	/**
	* Sets the midbottomtitle of this astra pdca_ company data.
	*
	* @param MIDBOTTOMTITLE the midbottomtitle of this astra pdca_ company data
	*/
	@Override
	public void setMIDBOTTOMTITLE(java.lang.String MIDBOTTOMTITLE) {
		_astraPdca_CompanyData.setMIDBOTTOMTITLE(MIDBOTTOMTITLE);
	}

	/**
	* Sets the midup of this astra pdca_ company data.
	*
	* @param MIDUP the midup of this astra pdca_ company data
	*/
	@Override
	public void setMIDUP(java.lang.String MIDUP) {
		_astraPdca_CompanyData.setMIDUP(MIDUP);
	}

	/**
	* Sets the midupcompany of this astra pdca_ company data.
	*
	* @param MIDUPCOMPANY the midupcompany of this astra pdca_ company data
	*/
	@Override
	public void setMIDUPCOMPANY(java.lang.String MIDUPCOMPANY) {
		_astraPdca_CompanyData.setMIDUPCOMPANY(MIDUPCOMPANY);
	}

	/**
	* Sets the miduptitle of this astra pdca_ company data.
	*
	* @param MIDUPTITLE the miduptitle of this astra pdca_ company data
	*/
	@Override
	public void setMIDUPTITLE(java.lang.String MIDUPTITLE) {
		_astraPdca_CompanyData.setMIDUPTITLE(MIDUPTITLE);
	}

	/**
	* Sets the modified by of this astra pdca_ company data.
	*
	* @param ModifiedBy the modified by of this astra pdca_ company data
	*/
	@Override
	public void setModifiedBy(java.lang.String ModifiedBy) {
		_astraPdca_CompanyData.setModifiedBy(ModifiedBy);
	}

	/**
	* Sets the modified date of this astra pdca_ company data.
	*
	* @param ModifiedDate the modified date of this astra pdca_ company data
	*/
	@Override
	public void setModifiedDate(Date ModifiedDate) {
		_astraPdca_CompanyData.setModifiedDate(ModifiedDate);
	}

	/**
	* Sets the module ID of this astra pdca_ company data.
	*
	* @param ModuleId the module ID of this astra pdca_ company data
	*/
	@Override
	public void setModuleId(long ModuleId) {
		_astraPdca_CompanyData.setModuleId(ModuleId);
	}

	@Override
	public void setNew(boolean n) {
		_astraPdca_CompanyData.setNew(n);
	}

	/**
	* Sets the primary key of this astra pdca_ company data.
	*
	* @param primaryKey the primary key of this astra pdca_ company data
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_astraPdca_CompanyData.setPrimaryKey(primaryKey);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		_astraPdca_CompanyData.setPrimaryKeyObj(primaryKeyObj);
	}

	/**
	* Sets the rightbottom of this astra pdca_ company data.
	*
	* @param RIGHTBOTTOM the rightbottom of this astra pdca_ company data
	*/
	@Override
	public void setRIGHTBOTTOM(java.lang.String RIGHTBOTTOM) {
		_astraPdca_CompanyData.setRIGHTBOTTOM(RIGHTBOTTOM);
	}

	/**
	* Sets the rightbottomcompany of this astra pdca_ company data.
	*
	* @param RIGHTBOTTOMCOMPANY the rightbottomcompany of this astra pdca_ company data
	*/
	@Override
	public void setRIGHTBOTTOMCOMPANY(java.lang.String RIGHTBOTTOMCOMPANY) {
		_astraPdca_CompanyData.setRIGHTBOTTOMCOMPANY(RIGHTBOTTOMCOMPANY);
	}

	/**
	* Sets the rightbottomtitle of this astra pdca_ company data.
	*
	* @param RIGHTBOTTOMTITLE the rightbottomtitle of this astra pdca_ company data
	*/
	@Override
	public void setRIGHTBOTTOMTITLE(java.lang.String RIGHTBOTTOMTITLE) {
		_astraPdca_CompanyData.setRIGHTBOTTOMTITLE(RIGHTBOTTOMTITLE);
	}

	/**
	* Sets the rightup of this astra pdca_ company data.
	*
	* @param RIGHTUP the rightup of this astra pdca_ company data
	*/
	@Override
	public void setRIGHTUP(java.lang.String RIGHTUP) {
		_astraPdca_CompanyData.setRIGHTUP(RIGHTUP);
	}

	/**
	* Sets the rightupcompany of this astra pdca_ company data.
	*
	* @param RIGHTUPCOMPANY the rightupcompany of this astra pdca_ company data
	*/
	@Override
	public void setRIGHTUPCOMPANY(java.lang.String RIGHTUPCOMPANY) {
		_astraPdca_CompanyData.setRIGHTUPCOMPANY(RIGHTUPCOMPANY);
	}

	/**
	* Sets the rightuptitle of this astra pdca_ company data.
	*
	* @param RIGHTUPTITLE the rightuptitle of this astra pdca_ company data
	*/
	@Override
	public void setRIGHTUPTITLE(java.lang.String RIGHTUPTITLE) {
		_astraPdca_CompanyData.setRIGHTUPTITLE(RIGHTUPTITLE);
	}

	/**
	* Sets the site ID of this astra pdca_ company data.
	*
	* @param SiteId the site ID of this astra pdca_ company data
	*/
	@Override
	public void setSiteId(long SiteId) {
		_astraPdca_CompanyData.setSiteId(SiteId);
	}

	/**
	* Sets the year ID of this astra pdca_ company data.
	*
	* @param YearId the year ID of this astra pdca_ company data
	*/
	@Override
	public void setYearId(long YearId) {
		_astraPdca_CompanyData.setYearId(YearId);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof AstraPdca_CompanyDataWrapper)) {
			return false;
		}

		AstraPdca_CompanyDataWrapper astraPdca_CompanyDataWrapper = (AstraPdca_CompanyDataWrapper)obj;

		if (Objects.equals(_astraPdca_CompanyData,
					astraPdca_CompanyDataWrapper._astraPdca_CompanyData)) {
			return true;
		}

		return false;
	}

	@Override
	public AstraPdca_CompanyData getWrappedModel() {
		return _astraPdca_CompanyData;
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _astraPdca_CompanyData.isEntityCacheEnabled();
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _astraPdca_CompanyData.isFinderCacheEnabled();
	}

	@Override
	public void resetOriginalValues() {
		_astraPdca_CompanyData.resetOriginalValues();
	}

	private final AstraPdca_CompanyData _astraPdca_CompanyData;
}