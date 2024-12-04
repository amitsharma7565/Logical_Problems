//Implement a class "Main". Write some methods and properties to it and find how one will use them in the main method by instantiating the class.


class Main{
    
    private int devAge;
    private String devName;
    
    Main(){
        
    }
    
    Main(int devAge, String devName){
        this.devAge= devAge;
        this.devName= devName;
    }
    
    // getter and setter also
    void setAge(int devAge){
        this.devAge=devAge;
    }
    
    int getAge(){
        return devAge;
    }
    
    void setName(String devName){
        this.devName= devName;
    }
    
    String getName(){
        return devName;
    }
    
    public void writeCode(){
        System.out.println(this.devName + " Write the code and age is " + devAge);
    }
    
    
    
    public static void main(String args[]){
        
        Main m = new Main(25, "Amit");
        //m.setAge(30);
        //m.setName("Sharma");
        m.writeCode();
        
    }
}