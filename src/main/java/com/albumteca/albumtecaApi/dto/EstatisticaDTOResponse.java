package com.albumteca.albumtecaApi.dto;

public class EstatisticaDTOResponse {

	String ranking;

	public String getRanking() {
		return ranking;
	}

	public void setRanking(String ranking) {
		this.ranking = ranking;
	}
	
	public EstatisticaDTOResponse() {
		super();
	}

	public EstatisticaDTOResponse(String ranking) {
		super();
		this.ranking = ranking;
	}	
}
