package Assignment_1;

public class Position {
	private static byte positionId;

	private EnumPosition positionName;
	public static byte getPositionId() {
		return positionId;
	}
	public void setPositionId(byte positionId) {
		this.positionId = positionId;
	}
	@Override
	public String toString() {
		return "Position [positionId=" + positionId + ", positionName=" + positionName + "]";
	}
	public Position(byte positionId, EnumPosition positionName) {
		super();
		this.positionId = positionId;
		this.positionName = positionName;
	}

	
}
