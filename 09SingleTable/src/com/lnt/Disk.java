package com.lnt;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

@Entity
@Table(name="Disk")
@DiscriminatorColumn(name="diskType")
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
@DiscriminatorValue(value="d")
public class Disk {
	@Id
	private int diskId;
	private String description;
	
	public Disk() {
		// TODO Auto-generated constructor stub
	}

	public Disk(int diskId, String description) {
		super();
		this.diskId = diskId;
		this.description = description;
	}

	public int getDiskId() {
		return diskId;
	}

	public void setDiskId(int diskId) {
		this.diskId = diskId;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public String toString() {
		return "Disk [diskId=" + diskId + ", description=" + description + "]";
	}
	
	
}
