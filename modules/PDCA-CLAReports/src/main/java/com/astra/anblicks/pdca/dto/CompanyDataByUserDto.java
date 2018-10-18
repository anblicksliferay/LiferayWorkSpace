package com.astra.anblicks.pdca.dto;

public class CompanyDataByUserDto {
	
	private long userId;
	private long companyId;
	private long settings_Id;
	private long year;
	private long periodId;
	private long moduleId;
	private String flag;
	
	public CompanyDataByUserDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	public long getUserId() {
		return userId;
	}
	public void setUserId(long userId) {
		this.userId = userId;
	}
	public long getCompanyId() {
		return companyId;
	}
	public void setCompanyId(long companyId) {
		this.companyId = companyId;
	}
	public long getYear() {
		return year;
	}
	public void setYear(long year) {
		this.year = year;
	}
	public long getPeriodId() {
		return periodId;
	}
	public void setPeriodId(long periodId) {
		this.periodId = periodId;
	}
	public long getModuleId() {
		return moduleId;
	}
	public void setModuleId(long moduleId) {
		this.moduleId = moduleId;
	}
	public String getFlag() {
		return flag;
	}
	public void setFlag(String flag) {
		this.flag = flag;
	}
	public CompanyDataByUserDto(long userId, long companyId,long setting_Id, long year, long periodId, long moduleId, String flag) {
		super();
		this.userId = userId;
		this.companyId = companyId;
		this.settings_Id=setting_Id;
		this.year = year;
		this.periodId = periodId;
		this.moduleId = moduleId;
		this.flag = flag;
	}
	public long getSettings_Id() {
		return settings_Id;
	}
	public void setSettings_Id(long settings_Id) {
		this.settings_Id = settings_Id;
	}
	@Override
	public String toString() {
		return "CompanyDataByUserDto [userId=" + userId + ", companyId=" + companyId + ", settings_Id=" + settings_Id
				+ ", year=" + year + ", periodId=" + periodId + ", moduleId=" + moduleId + ", flag=" + flag + "]";
	}

	
	

}
