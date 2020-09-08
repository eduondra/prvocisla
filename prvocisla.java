class prvocisla {
   
    public static void main (String[] args) {		
      
       int x = 0;
       int number = 0;

       String prvocisla = "";

       for (x = 1; x <= 100; x++)         
       { 		  	  
          int counter=0; 	  
          for(number =x; number>=1; number--) {
             
            if(x%number==0)
	     {
 		counter = counter + 1;
	     }
	  }
	  if (counter ==2) {
        prvocisla = prvocisla + x + " ";
	  }	
       }	
       
       System.out.println("prvocisla od 1-100");
       System.out.println(prvocisla);
   }
}