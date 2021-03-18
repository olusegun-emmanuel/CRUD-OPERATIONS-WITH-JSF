package com.tcs.assignment2.service;

import com.tcs.assignment2.entity.DeveloperEntity;
import com.tcs.assignment2.model.DeveloperModel;
import com.tcs.assignment2.repository.DevelopersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class DeveloperService {

    @Autowired
    DevelopersRepository developersRepository;

    public List<DeveloperModel> getAllDevelopers() {
        List<DeveloperModel> allDevelopers = new ArrayList<DeveloperModel>();
        List<DeveloperEntity> developersEntity = developersRepository.findAll();
        for(DeveloperEntity singleDeveloper: developersEntity ) {
            DeveloperModel developer =  mapEntityToModel(singleDeveloper);
            allDevelopers.add(developer);
        }
        return allDevelopers;
    }


    public boolean createNewDeveloper(DeveloperModel developersModel){
        DeveloperEntity entityToMap = new DeveloperEntity();
        DeveloperEntity developerEntity = developersRepository.save((mapModelToEntity(entityToMap, developersModel)));
        if(null != developerEntity.toString())
            return true;

        return false;
    }

	public DeveloperModel getSingleDeveloper(Long id) {
		DeveloperEntity developersEntity = developersRepository.findOne(id);
		DeveloperModel developer =  mapEntityToModel(developersEntity);
		return developer;
	}

   public boolean updateDeveloper(DeveloperModel developersModel, Long id){
	   DeveloperEntity entityToMap = new DeveloperEntity();
        DeveloperEntity developerEntity = developersRepository.save((mapModelToEntity(entityToMap, developersModel)));
        if(null != developerEntity.toString())
            return true;
        return false;
    }


    private DeveloperModel mapEntityToModel(DeveloperEntity developersEntity){
        DeveloperModel developersModel = new DeveloperModel();
        developersModel.setId(developersEntity.getId());
        developersModel.setName(developersEntity.getName());
        developersModel.setEmail(developersEntity.getEmail());
        developersModel.setSkills(developersEntity.getSkills());
        return developersModel;
    }

   private DeveloperEntity mapModelToEntity(DeveloperEntity entityToMap, DeveloperModel developersModel){
        DeveloperEntity developersEntity = new DeveloperEntity();
        developersEntity.setId(developersModel.getId());
        developersEntity.setName(developersModel.getName());
        developersEntity.setEmail(developersModel.getEmail());
        developersEntity.setSkills(developersModel.getSkills());
        return developersEntity;
    }

}
