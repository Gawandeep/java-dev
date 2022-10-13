package com.designPatterns.buider;

public class Computer {

	private String ram;
	private String hdd;
	
	//optional
	private boolean isBluetoothEnabled;
	private boolean isGrapicCardEnabled;
	
	@Override
	public String toString() {
		return "Computer [ram=" + ram + ", hdd=" + hdd + ", isBluetoothEnabled=" + isBluetoothEnabled
				+ ", isGrapicCardEnabled=" + isGrapicCardEnabled + "]";
	}
	
	public String getRam() {
		return ram;
	}
	public String getHdd() {
		return hdd;
	}
	public boolean isBluetoothEnabled() {
		return isBluetoothEnabled;
	}
	public boolean isGrapicCardEnabled() {
		return isGrapicCardEnabled;
	}
	private Computer(ComputerBuilder builder) {
		super();
		this.ram = builder.ram;
		this.hdd = builder.hdd;
		this.isBluetoothEnabled = builder.isBluetoothEnabled;
		this.isGrapicCardEnabled = builder.isGrapicCardEnabled;
	}
	
	public static class ComputerBuilder{
		private String ram;
		private String hdd;
		
		//optional
		private boolean isBluetoothEnabled;
		private boolean isGrapicCardEnabled;
		
		public ComputerBuilder(String ram, String hdd) {
			this.ram = ram;
			this.hdd = hdd;
		}

		public ComputerBuilder setBluetoothEnabled(boolean isBluetoothEnabled) {
			this.isBluetoothEnabled = isBluetoothEnabled;
			return this;
		}

		public ComputerBuilder setGrapicCardEnabled(boolean isGrapicCardEnabled) {
			this.isGrapicCardEnabled = isGrapicCardEnabled;
			return this;
		}
		
		public Computer build() {
			return new Computer(this);
		}
		
		
	}
	
}
