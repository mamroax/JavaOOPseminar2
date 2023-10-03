public abstract class Actor implements ActorBehaviour{
    protected String name;
    protected boolean isMakeOrder = false;
    protected boolean isTakeOrder = false;

    public void setMakeOrder(){
        this.isMakeOrder = true;
    }
    public void setTakeOrder(){
        this.isTakeOrder = true;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isTakeOrder(){
        return this.isTakeOrder;
    }
    public boolean isMakeOrder(){
        return this.isMakeOrder;
    }
}
