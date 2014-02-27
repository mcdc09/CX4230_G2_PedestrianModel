package edu.gatech.cx4230.projectone.backend.abstraction;

public class ExperimentResult {
	private double average;
	private double standardDeviation;
	private int[] scores;
	private long time;
	private long[] times;
	
	public ExperimentResult(double ave, double stDev, int[] scores, long time, long[] times) {
		this.average = ave;
		this.standardDeviation = stDev;
		this.scores = scores;
		this.time = time;
		this.times = times;
	}
	
	public String toString() {
		return "Trials: " + scores.length + "\tScores Average: " + average + "\tSt Dev: " + standardDeviation + "\tin " + time + " ms";
	}

	/**
	 * @return the average
	 */
	public double getAverage() {
		return average;
	}

	/**
	 * @param average the average to set
	 */
	public void setAverage(double average) {
		this.average = average;
	}

	/**
	 * @return the standardDeviation
	 */
	public double getStandardDeviation() {
		return standardDeviation;
	}

	/**
	 * @param standardDeviation the standardDeviation to set
	 */
	public void setStandardDeviation(double standardDeviation) {
		this.standardDeviation = standardDeviation;
	}

	/**
	 * @return the scores
	 */
	public int[] getScores() {
		return scores;
	}

	/**
	 * @param scores the scores to set
	 */
	public void setScores(int[] scores) {
		this.scores = scores;
	}

	/**
	 * @return the time
	 */
	public long getTime() {
		return time;
	}

	/**
	 * @param time the time to set
	 */
	public void setTime(long time) {
		this.time = time;
	}

	/**
	 * @return the times
	 */
	public long[] getTimes() {
		return times;
	}

	/**
	 * @param times the times to set
	 */
	public void setTimes(long[] times) {
		this.times = times;
	}

}
