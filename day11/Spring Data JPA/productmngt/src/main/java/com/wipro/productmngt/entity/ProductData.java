package com.wipro.productmngt.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="product_data")
public class ProductData {
	
		@Id
		@GeneratedValue(strategy=GenerationType.IDENTITY)
		int id;
		
		@Column(name="product_name")
		String productName;
		
		@Column(name="product_make")
		String productMake;
		
		@Column(name="product_place")
		String productPlace;

		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public String getProductName() {
			return productName;
		}

		public void setProductName(String productName) {
			this.productName = productName;
		}

		public String getProductMake() {
			return productMake;
		}

		public void setProductMake(String productMake) {
			this.productMake = productMake;
		}

		public String getProductPlace() {
			return productPlace;
		}

		public void setProductPlace(String productPlace) {
			this.productPlace = productPlace;
		}

		@Override
		public String toString() {
			return "ProductData [id=" + id + ", productName=" + productName + ", productMake=" + productMake
					+ ", productPlace=" + productPlace + "]";
		}
		
		


}
