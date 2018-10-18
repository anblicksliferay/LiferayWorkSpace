package com.astra.anblicks.pdca.dto;

public class CompanyDataByUserDto {
	
	private long userId;
	private long companyId;
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
	public CompanyDataByUserDto(long userId, long companyId, long year, long periodId, long moduleId, String flag) {
		super();
		this.userId = userId;
		this.companyId = companyId;
		this.year = year;
		this.periodId = periodId;
		this.moduleId = moduleId;
		this.flag = flag;
	}

	
	

}
