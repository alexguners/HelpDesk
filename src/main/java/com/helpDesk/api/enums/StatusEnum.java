package com.helpDesk.api.enums;

public enum StatusEnum {
	NEW,
	RESOLVED,
	ASSIGNED,
	APPROVED,
	DISAPPROVED,
	CLOSED;
	
	public static StatusEnum getStatus(String status) {
		
		switch(status) {
			case "NEW": return NEW;
			case "RESOLVED": return RESOLVED;
			case "ASSIGNED": return ASSIGNED;
			case "APPROVED": return APPROVED;
			case "DISAPPROVED": return DISAPPROVED;
			case "CLOSED": return CLOSED;
			default : return NEW;
		}
	}
}
