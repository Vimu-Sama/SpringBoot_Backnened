package com.springrest.springrest.Services;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.springrest.springrest.controller.entities.load;

@Service
public class LoadServiceImpl implements loadservice {

	List<load> list;
	public LoadServiceImpl()
	{
		list= new ArrayList<>();
		list.add(new load("Alwar", 1, 29, "Delhi", "box", "Canter", 5,100,"Yo! wassup", "05-08-2021"));
		
	}
	@Override
	public List<load> getloads() {
		
		return list;
	}
	
	@Override
	public load getLoad(long cid) {
		
		load l = null;
		for(load lol:list)
		{
			if(lol.getloadid()== cid)
			{
				l= lol;
				break;
			}
		}
		
		return l;
	}
	@Override
	public load postload(load led) {
		list.add(led);
		return led;
	}
	@Override
	public load updateload(load led) {
		load temp=null;
		long p= led.getloadid();
		for(load lol:list)
		{
			if(lol.getloadid()==led.getloadid())
			{
				lol.setDate(led.getDate());
				lol.setNoOfTrucks(led.getNoOfTrucks());
				lol.setProductType(led.getProductType());
				lol.setLoadingPoint(led.getLoadingPoint());
				lol.setUnloadingPoint(led.getUnloadingPoint());
				lol.setTruckType(led.getTruckType());
				lol.setWeight(led.getWeight());
				temp= lol;
				break;
			}
		}
		return temp;
	}
	@Override
	public void deleteload(long cid) {
		list= this.list.stream().filter(e->e.getloadid()!=cid).collect(Collectors.toList());
		
	}

}
