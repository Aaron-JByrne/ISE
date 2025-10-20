import java.util.Scanner;

public class CountyPopulation {
   public static void main(String[] args) {
      final int COUNTYCOUNT = 32;
      
      County Antrim = new County("Antrim", 618500);
      County Armagh = new County("Armagh", 210000);
      County Carlow = new County("Carlow", 56000);
      County Cavan = new County("Cavan", 78000);
      County Clare = new County("Clare", 118000);
      County Cork = new County("Cork", 542000);
      County Derry = new County("Derry", 247000);
      County Donegal = new County("Donegal", 163000);
      County Down = new County("Down", 531000);
      County Dublin = new County("Dublin", 1400000);
      County Fermanagh = new County("Fermanagh", 120000);
      County Galway = new County("Galway", 258000);
      County Kerry = new County("Kerry", 147000);
      County Kilkenny = new County("Kilkenny", 222000);
      County Laois = new County("Laois", 87000);
      County Leitrim = new County("Leitrim", 32000);
      County Limerick = new County("Limerick", 194000);
      County Longford = new County("Longford", 40000);
      County Louth = new County("Louth", 130000);
      County Mayo = new County("Mayo", 130000);
      County Meath = new County("Meath", 195000);
      County Monoghan = new County("Monoghan", 62000);
      County Offaly = new County("Offaly", 77000);
      County Roscommon = new County("Roscommon", 64000);
      County Sligo = new County("Sligo", 65000);
      County Tipperary = new County("Tipperary", 160000);
      County Tyrone = new County("Tyrone", 180000);
      County Waterford = new County("Waterford", 116000);
      County Westmeath = new County("Westmeath", 89000);
      County Wexford = new County("Wexford", 150000);
      County Wicklow = new County("Wicklow", 140000);
      
      County[] countyarr = {Antrim,Armagh,Carlow,Cavan,Clare,Cork,Derry,Donegal,Down,Dublin,Fermanagh,Galway,Kerry,Kilkenny,Laois,Leitrim,Limerick,Longford,Louth,Mayo,Meath,Monoghan,Offaly,Roscommon,Sligo,Tipperary,Tyrone,Waterford,Westmeath,Wexford,Wicklow};
      
      Scanner input = new Scanner(System.in);
      System.out.println("Enter a population number: ");
      int userPopulation = Integer.parseInt(input.nextLine());
      

      int mindifference = Math.abs(countyarr[0].getPop() - userPopulation);
      int currentdifference; 
      int indexOfMin = 0;
      County minCounty = countyarr[0]; 
      County x;  
      for (int i=1;i<COUNTYCOUNT-1;i++) {
         x = countyarr[i];
      
         System.out.println(minCounty.getName());
         System.out.printf("County: %s  Pop: %d  Difference: %d\n",x.getName(),x.getPop(), x.getPop()-userPopulation);
         currentdifference = Math.abs(x.getPop()-userPopulation);
         
        
         if (currentdifference < mindifference) {
            System.out.printf("min difference has changed from %d to %d\n", mindifference, currentdifference);
            mindifference = currentdifference;
            indexOfMin = i;
         }
         
         
         System.out.printf("min difference is %d\n",mindifference);
         //System.out.println();
         
      }
      System.out.printf("%s, %d\n", countyarr[indexOfMin].getName(),countyarr[indexOfMin].getPop());
   
   }
}

class County {
   private String name;
   private int population;
   
   County(String name, int population) {
      this.name = name;
      this.population = population;
   }
   
   public String getName(){
      return this.name;
   }
   public int getPop(){
      return this.population;
   }
   public void setName(String userInput){
      this.name = userInput;
   }
   public void setPop(int userInput){
      this.population = userInput;
   }


}