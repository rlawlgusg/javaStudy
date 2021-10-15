//하늘을 날아다니는 새
class Bird{
	protected String name;
	protected String color;
	protected boolean wing;

	public Bird(){}
	public Bird(String name, String color, boolean wing){
		this.name = name;
		this.color = color;
		this.wing = wing;
	}
	public void setName(String name){
		this.name = name;
	}
	public String getName(){
		return name;
	}
	public void setColor(String color){
		this.color = color;
	}
	public String getColor(){
		return color;
	}
	public void setWing(boolean wing){
		this.wing = wing;
	}
	public Boolean getWing(){
		return wing;
	}
	public void fly(){
		if(wing == true){
			System.out.printf("%s색 %s가(이) 훨훨\n",color,name);
		}else{
			System.out.printf("%s색 %s가(이) 날 수 없어요\n",color,name);
		}
	}


}


class BirdTest 
{
	public static void main(String[] args) 
	{
		Bird b1 = new Bird("참새","노란",true);
		Bird b2 = new Bird("비둘기","검은",false);
		
		b1.fly();
		b2.fly();
	}
}
