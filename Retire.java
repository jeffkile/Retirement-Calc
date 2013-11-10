class Retire {

  public static void main(String[] args) {
    double cash = 150000;
    double principal = 250000;
    double interest = 0.04;
    double deductions = 18000;
    double inflation = 0.02;
    int years = 0;


    System.out.println("Starting with $" + principal +" in stocks");
    System.out.println("Accruing " + interest * 100 + "% annually");
    System.out.println("And $" + cash + " in cash");
    System.out.println("Minus " + inflation * 100 + "% for inflation");
    System.out.println("Deducting $" + deductions + " annually after interest and inflation");

    double total = 0;
    while (principal > 0) {

      principal = principal + principal * interest;
      principal = principal - principal * inflation; 
      cash = cash - cash * inflation; 

      if(cash > 0) {
        if (deductions > cash) {
          principal = principal - deductions + cash;
          cash = 0;
        }
        else {
          cash = cash - deductions;
        }
      }
      else {
        principal = principal - deductions;
      }

      
      total = cash + principal;
      years ++;

      if(principal > 0) {
        System.out.println("Year " + years + " cash " + cash + " principal " + principal );
      }

    }


  }

}
