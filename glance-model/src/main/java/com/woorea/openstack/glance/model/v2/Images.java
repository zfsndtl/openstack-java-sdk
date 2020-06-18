package com.woorea.openstack.glance.model.v2;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;
import java.util.Iterator;
import java.util.List;

public class Images implements Iterable<Image>, Serializable {

	@JsonProperty("images")
	private List<Image> list;

	/**
	 * @return the list
	 */
	public List<Image> getList() {
		return list;
	}

	@Override
	public Iterator<Image> iterator() {
		return list.iterator();
	}
	
}