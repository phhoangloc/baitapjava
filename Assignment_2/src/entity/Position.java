package entity;

public class Position {
	private byte positionId;

	private EnumPosition positionName;

	public byte getPositionId() {
		return positionId;
	}

	public void setPositionId(byte positionId) {
		this.positionId = positionId;
	}

	public EnumPosition getPositionName() {
		return positionName;
	}

	public void setPositionName(EnumPosition positionName) {
		this.positionName = positionName;
	}

	@Override
	public String toString() {
		return "Position [positionName=" + positionName + "]";
	}

	public Position(byte positionId,EnumPosition positionName) {
		super();
		this.positionId = positionId;
		this.positionName = positionName;
	}
	
	
	
}
