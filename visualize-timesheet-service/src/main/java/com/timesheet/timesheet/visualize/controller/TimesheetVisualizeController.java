package com.timesheet.timesheet.visualize.controller;

import javax.ws.rs.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.timesheet.timesheet.visualize.model.Timesheet;
import com.timesheet.timesheet.visualize.service.TimesheetService;

@RestController
@RequestMapping("/timesheets")
public class TimesheetVisualizeController {

		@Autowired
		private TimesheetService timesheetService;
		
		@RequestMapping
	    public Timesheet getByUserId(@PathParam("userId") String userId) {
			return timesheetService.getTimeSheetByUserId();
	    }

}