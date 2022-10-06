package Chapter09.Exercise9_6Folder;

public class StopWatch {
    private long startTime; 
	private long endTime;	

	StopWatch() {
		startTime = System.currentTimeMillis();
	}
	public void start() {
		startTime = System.currentTimeMillis();
	} 
	public void stop() {
		endTime = System.currentTimeMillis();
	}
	public long getElapsedTime() {
		return getEndTime() - getStratTime();
	}
	public long getStratTime() {
		return startTime;
	}
	public long getEndTime() {
		return endTime;
	}
}
