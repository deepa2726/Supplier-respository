package com.cg.service;

import java.util.ArrayList;
import java.util.List;

import com.cg.dao.SupplierDao;
import com.cg.entity.Supplier;

public class SupplierService implements SupplierDao {
	
List<Supplier> supplierList=new ArrayList<>();

	
	public String addSupplier(Supplier supplier) {
	supplierList.add(supplier);
    return"Supplier added successfully";
	}


	public List<Supplier> getSupplierList() {
	return supplierList;
	}
	

}
