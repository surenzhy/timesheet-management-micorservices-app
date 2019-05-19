package com.timesheet.timesheet.visualize.service;

import com.timesheet.timesheet.visualize.model.Timesheet;

public interface TimesheetService extends GenericService<Timesheet>{

	Timesheet getTimeSheetByUserId();

}
