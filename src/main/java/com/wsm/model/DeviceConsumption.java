package com.wsm.model;
// Generated May 21, 2016 9:39:06 PM by Hibernate Tools 5.1.0.Alpha1

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * DeviceConsumption generated by hbm2java
 */
@Entity
@Table(name = "device_consumption", catalog = "watermeter")
public class DeviceConsumption implements java.io.Serializable {

	private int oid;
	private ComplexDeviceInstance complexDeviceInstance;
	private SimpleDeviceInstance simpleDeviceInstance;
	private Date startDate;
	private Date endDate;
	private BigDecimal deviceConsumption;

	public DeviceConsumption() {
	}

	public DeviceConsumption(int oid) {
		this.oid = oid;
	}

	public DeviceConsumption(int oid, ComplexDeviceInstance complexDeviceInstance,
			SimpleDeviceInstance simpleDeviceInstance, Date startDate, Date endDate, BigDecimal deviceConsumption) {
		this.oid = oid;
		this.complexDeviceInstance = complexDeviceInstance;
		this.simpleDeviceInstance = simpleDeviceInstance;
		this.startDate = startDate;
		this.endDate = endDate;
		this.deviceConsumption = deviceConsumption;
	}

	@Id

	@Column(name = "oid", unique = true, nullable = false)
	public int getOid() {
		return this.oid;
	}

	public void setOid(int oid) {
		this.oid = oid;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "complex_device_instance_oid")
	public ComplexDeviceInstance getComplexDeviceInstance() {
		return this.complexDeviceInstance;
	}

	public void setComplexDeviceInstance(ComplexDeviceInstance complexDeviceInstance) {
		this.complexDeviceInstance = complexDeviceInstance;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "simple_device_instance_oid")
	public SimpleDeviceInstance getSimpleDeviceInstance() {
		return this.simpleDeviceInstance;
	}

	public void setSimpleDeviceInstance(SimpleDeviceInstance simpleDeviceInstance) {
		this.simpleDeviceInstance = simpleDeviceInstance;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "start_date", length = 19)
	public Date getStartDate() {
		return this.startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "end_date", length = 19)
	public Date getEndDate() {
		return this.endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	@Column(name = "device_consumption")
	public BigDecimal getDeviceConsumption() {
		return this.deviceConsumption;
	}

	public void setDeviceConsumption(BigDecimal deviceConsumption) {
		this.deviceConsumption = deviceConsumption;
	}

}
