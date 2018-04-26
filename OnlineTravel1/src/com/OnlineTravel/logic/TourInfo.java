package com.OnlineTravel.logic;

import java.io.Serializable;

public class TourInfo implements Serializable{
		
		private String id;
		private String type;
		private String place;
		private String startDate;
		private String endDate;
		private String cost;
		private String passenger;
		public String getId() {
			return id;
		}
		public void setId(String id) {
			this.id = id;
		}
		public String getType() {
			return type;
		}
		public void setType(String type) {
			this.type = type;
		}
		public String getPlace() {
			return place;
		}
		public void setPlace(String place) {
			this.place = place;
		}
		public String getStartDate() {
			return startDate;
		}
		public void setStartDate(String startDate) {
			this.startDate = startDate;
		}
		public String getEndDate() {
			return endDate;
		}
		public void setEndDate(String endDate) {
			this.endDate = endDate;
		}
		public String getCost() {
			return cost;
		}
		public void setCost(String cost) {
			this.cost = cost;
		}
		public String getPassenger() {
			return passenger;
		}
		public void setPassenger(String passenger) {
			this.passenger = passenger;
		}		
}
