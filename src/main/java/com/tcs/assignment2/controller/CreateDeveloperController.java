package com.tcs.assignment2.controller;

import com.tcs.assignment2.model.DeveloperModel;
import com.tcs.assignment2.model.SkillsModel;
import com.tcs.assignment2.service.DeveloperService;
import com.tcs.assignment2.service.SkillService;
import org.ocpsoft.rewrite.annotation.Join;
import org.ocpsoft.rewrite.annotation.RequestAction;
import org.ocpsoft.rewrite.el.ELBeanName;
import org.ocpsoft.rewrite.faces.annotation.Deferred;
import org.ocpsoft.rewrite.faces.annotation.IgnorePostback;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import java.util.List;


@Scope(value = "session")
@Component(value = "createDeveloper")
@ELBeanName(value = "createDeveloper")
@Join(path = "/add_developer", to = "/developers/developer-form.jsf")
public class CreateDeveloperController {

	@Autowired
	private DeveloperService developerService;
	@Autowired
	private SkillService skillService;

	private DeveloperModel developerModel = new DeveloperModel();
	private List<SkillsModel> skillsModel ;


	public String addNewDeveloper() {
		boolean developerCreated = developerService.createNewDeveloper(developerModel);
		if(developerCreated == true) {
			return "/developers/developers-list.xhtml?faces-redirect=true";
		}
		return null;
	}

	public DeveloperModel getDeveloperModel(){
		return developerModel;
	}

	@Deferred
	@RequestAction
	@IgnorePostback
	public void getGeneralSkillsList() {
		skillsModel = skillService.getAllSkills();
	}


	public List<SkillsModel> getSkillsList() {
		return skillsModel;
	}

}
