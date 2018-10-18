package vjezba;

public class Kalkulator {

		public double mnozenje(double a, double b) {
			
			return a * b;
		}
		public  double dijeljenje(double a, double b) {
			return a / b;
		}
		public  double korjenovanje(double broj) {
			return 0;
		}
			public  double kvadriranje(double broj1) {
				return 0;
			}

			public  double Oduzimanje(double broj1 , double broj2) {
				double razlika = broj1 -  broj2;
				System.out.println("Razlika dva broja je " + razlika);
				return razlika;
			}
			public  double Sabiranje (double broj1 , double broj2) {
				double zbir = broj1 + broj2;
				System.out.println("Zbir brojeva je " + zbir);
				
				return zbir ;
			}
}
