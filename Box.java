class Box{
	private double height;
	private double width;
	private double length;
	private boolean empty;
	
	public Box(double height,double width, double length){
		this.height=height;
		this.width=width;
		this.length=length;
	}
	
	public Box(){
	}
	
	public void be(){
		empty = true;
	}
	public void beNot(){
		empty = false;
		}
	public double getHeight(){
		return height;
		}
	public double getWidth(){
		return width;
		}
	public double getLength(){
		return length;
		}
	
	public void setHeight(double height){
		this.height=height;
		}
	public void setWidth(double width){
		this.width = width;
		}
	public void setLength(double length){
		this.length=length;
		}
	
	
}