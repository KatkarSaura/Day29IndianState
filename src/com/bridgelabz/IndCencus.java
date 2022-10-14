package com.bridgelabz;

import com.opencsv.bean.CsvBindByName;

public class IndiaCensusCSV {

	    public IndiaCensusCSV(){}

	    @CsvBindByName
	    public String state;

	    @CsvBindByName(column = "Population", required = true)
	    public int population;

	    @CsvBindByName(column = "AreaInSqKm", required = true)
	    public int areaInAqKm;

	    @CsvBindByName(column = "DensityPerSqKm", required = true)
	    public int densityPerSqKm;


	    @Override
	    public String toString() {
	        return "IndiaCensusCSV{" +
	                "state='" + state + '\'' +
	                ", population=" + population +
	                ", areaInAqKm=" + areaInAqKm +
	                ", densityPerSqKm=" + densityPerSqKm +
	                '}';
	    }
	}
	
		@CsvBindByName(column = "State")
		private String state;

		@CsvBindByName(column = "Population")
		private int population;

		@CsvBindByName(column = "AreaInSqKm")
		private int areaInSqKm;

		@CsvBindByName(column = "DensityPerSQKm")
		private int densityPerSQKm;

		@Override
		public String toString() {
			return "IndiaCensusCSV{" + "state='" + state + '\'' + ", population=" + population + ", areaInSqKm="
					+ areaInSqKm + ", densityPerSQKm=" + densityPerSQKm + '}';
		}
	}

