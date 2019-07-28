package com.lf2a.Java_Examples.geo;

public class TestCoordenada {
	public static void test1() {

		// res: Distância: 511.297 metros
		// site: http://nacionais2017.fpcolumbofilia.pt/Distancia

		System.out.println("test1");
		Coordenada c1 = new Coordenada(-23.6821604, -46.8754859);
		System.out.printf("latitude: %f\nlongitude: %f\n", c1.getLatitude(), c1.getLongitude());

		Coordenada c2 = new Coordenada(-19.9027026, -44.0340902);
		System.out.printf("latitude: %f\nlongitude: %f\n", c2.getLatitude(), c2.getLongitude());

		System.out.printf("metros: %.2f", Coordenada.kmToMetros(Coordenada.getDistancia(c1, c2)));
		System.out.println("\n");
	}

	public static void test2() {

		// res: Distância: 333.198 metros
		// site: http://nacionais2017.fpcolumbofilia.pt/Distancia

		System.out.println("test2");
		Coordenada c1 = new Coordenada(-23.6821604, -46.8754859);
		System.out.printf("latitude: %f\nlongitude: %f\n", c1.getLatitude(), c1.getLongitude());

		Coordenada c2 = new Coordenada(-22.913885, -43.7261828);
		System.out.printf("latitude: %f\nlongitude: %f\n", c2.getLatitude(), c2.getLongitude());

		System.out.printf("milhas: %.2f", Coordenada.kmToMiles(Coordenada.getDistancia(c1, c2)));
		System.out.println("\n");
	}

	public static void test3() {

		// res: Distância: 2374.463 metros
		// site: http://nacionais2017.fpcolumbofilia.pt/Distancia

		System.out.println("test3");
		Coordenada c1 = new Coordenada(-23.6821604, -46.8754859);
		System.out.printf("latitude: %f\nlongitude: %f\n", c1.getLatitude(), c1.getLongitude());

		Coordenada c2 = new Coordenada(-3.7900979, -38.5889879);
		System.out.printf("latitude: %f\nlongitude: %f\n", c2.getLatitude(), c2.getLongitude());

		System.out.printf("km: %.2f", Coordenada.getDistancia(c1, c2));
		System.out.println("\n");
	}

	public static void test4() {

		// res: Distância: 2487.481 metros
		// site: http://nacionais2017.fpcolumbofilia.pt/Distancia

		System.out.println("test4");
		Coordenada c1 = new Coordenada(-23.6821604, -46.8754859);
		System.out.printf("latitude: %f\nlongitude: %f\n", c1.getLatitude(), c1.getLongitude());

		Coordenada c2 = new Coordenada(-1.2729905, -48.7404717);
		System.out.printf("latitude: %f\nlongitude: %f\n", c2.getLatitude(), c2.getLongitude());

		System.out.printf("km: %.2f", Coordenada.getDistancia(c1, c2));
		System.out.println("\n");
	}

	public static void test5() {

		// res: Distância: 921 metros
		// site: http://nacionais2017.fpcolumbofilia.pt/Distancia

		System.out.println("test4");
		Coordenada c1 = new Coordenada(-12.9813346, -38.4653612);
		System.out.printf("latitude: %f\nlongitude: %f\n", c1.getLatitude(), c1.getLongitude());

		Coordenada c2 = new Coordenada(-12.9741491, -38.4696483);
		System.out.printf("latitude: %f\nlongitude: %f\n", c2.getLatitude(), c2.getLongitude());

		System.out.printf("metros: %.2f", Coordenada.kmToMetros(Coordenada.getDistancia(c1, c2)));
		System.out.println("\n");
	}

	public static void main(String[] args) {
		TestCoordenada.test1();
		TestCoordenada.test2();
		TestCoordenada.test3();
		TestCoordenada.test4();
		TestCoordenada.test5();
	}
}
