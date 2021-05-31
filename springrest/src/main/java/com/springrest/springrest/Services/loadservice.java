package com.springrest.springrest.Services;

import java.util.List;

import com.springrest.springrest.controller.entities.load;

public interface loadservice {
	
	public List<load> getloads();
	public load getLoad(long cid);
	public load postload(load led);
	public load updateload(load led);
	public void deleteload(long cid);
}
