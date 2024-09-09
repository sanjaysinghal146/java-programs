public class PraticCons2 {
    int modelyear;
    String modelName;

    public PraticCons2(int year ,String name) {
        modelyear = year;
        modelName = name;
    }    
        public static void main(String args[]){
          PraticCons2 pcons2= new PraticCons2(2006,"sanjay");
          System.out.println(pcons2.modelyear+" "+pcons2.modelName);
        }
    }

