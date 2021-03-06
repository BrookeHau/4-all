package com.fourall.fourall;

import javax.annotation.Resource;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class IssuePopulator implements CommandLineRunner {
	@Resource
	IssueTypeRepository issueTypeRepo;

	// TODO Make this idempotent
	@Override
	public void run(String... args) throws Exception {
		issueTypeRepo.save(new IssueType("outdoor", "sidewalk", "Debris in Sidewalk", "Trash Collection"));
		issueTypeRepo.save(new IssueType("outdoor", "sidewalk", "Damaged Crosswalk", "Road Repair"));
		issueTypeRepo.save(new IssueType("outdoor", "sidewalk", "Missing Sidewalk", "City Planning"));
		issueTypeRepo.save(new IssueType("outdoor", "sidewalk", "Other", "City Planning"));
		issueTypeRepo.save(new IssueType("outdoor", "ramp", "Entrance not Accessable", "Code Enforcement"));
		issueTypeRepo.save(new IssueType("outdoor", "ramp", "Damaged", "Code Enforcement"));
		issueTypeRepo.save(new IssueType("outdoor", "ramp", "No Ramp", "Code Enforcement"));
		issueTypeRepo.save(new IssueType("outdoor", "ramp", "Other", "Code Enforcement"));
		issueTypeRepo.save(new IssueType("outdoor", "rail", "Missing Handrail", "Code Enforcement"));
		issueTypeRepo.save(new IssueType("outdoor", "rail", "Other", "Code Enforcement"));
		issueTypeRepo.save(new IssueType("outdoor", "rail", "Damaged", "Code Enforcement"));
		issueTypeRepo.save(new IssueType("outdoor", "curbs", "Other", "Code Enforcement"));
		issueTypeRepo.save(new IssueType("outdoor", "curbs", "Damaged", "Curb repair"));
		issueTypeRepo.save(new IssueType("outdoor", "curbs", "No Curb", "Code Enforcement"));
		issueTypeRepo.save(new IssueType("outdoor", "doors", "Damaged", "Code Enforcement"));
		issueTypeRepo.save(new IssueType("outdoor", "doors", "Missing Handle", "Code Enforcement"));
		issueTypeRepo.save(new IssueType("outdoor", "doors", "Handicap Switch", "Code Enforcement"));
		issueTypeRepo.save(new IssueType("outdoor", "doors", "Other", "Code Enforcement"));
		issueTypeRepo.save(new IssueType("indoor", "rail", "Missing", "Code Enforcement"));
		issueTypeRepo.save(new IssueType("indoor", "rail", "Other", "Code Enforcement"));
		issueTypeRepo.save(new IssueType("indoor", "rail", "Damaged", "Code Enforcement"));
		issueTypeRepo.save(new IssueType("indoor", "ramp", "Damaged", "Code Enforcement"));
		issueTypeRepo.save(new IssueType("indoor", "ramp", "Missing", "Code Enforcement"));
		issueTypeRepo.save(new IssueType("indoor", "ramp", "Other", "Code Enforcement"));



	}

}
