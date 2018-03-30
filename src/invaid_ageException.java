
class invaild_ageException extends Exception{

    public invaild_ageException() {
        System.out.println("Age is less than 18 Exception Occured");
    }  
        public invaild_ageException(String xy) {
        System.out.println(xy+ " Exception");
    } 
}
