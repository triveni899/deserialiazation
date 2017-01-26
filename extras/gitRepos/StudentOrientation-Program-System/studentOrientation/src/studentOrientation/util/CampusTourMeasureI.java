package studentOrientation.util;


public interface CampusTourMeasureI {
	public double calcDuration(CampusTour ct);
	public double calcCost();
	public double calcCbFootprint(CampusTour ct);
	public double calcEffort(CampusTour ct);
}
