package PracticesDemo;

 class Singleton {
    private static Singleton dbObject;
    private Singleton(){

    }
    public static Singleton getInstance(){
        //Create Object if not already created
        if(dbObject==null){
            dbObject=new Singleton();
        }
        return dbObject;
    }

     public static <Signleton> Signleton getInstatnce() {

         return null;
     }

     public void getConnectiom(){
        System.out.println("You Are Now Connected ");
    }
}
