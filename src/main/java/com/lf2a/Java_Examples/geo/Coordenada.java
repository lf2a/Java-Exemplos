package com.lf2a.Java_Examples.geo;

import java.text.DecimalFormat;

public class Coordenada {

	private double latitude;
	private double longitude;

	/* construtores */
	
	public Coordenada(String lat, String lon) {
		this.latitude = dmsToDecimal(lat);
		this.longitude = dmsToDecimal(lon);
	}

	/**
	 * inserir coordenada no formato decimal
	 */
	public Coordenada(double lat, double lon) {
		this.latitude = lat;
		this.longitude = lon;
	}

	public Coordenada() {
	}

	/* fim construtores */

	/* utilidades */

	public double getLatitude() {
		return this.latitude;
	}

	public double getLongitude() {
		return this.longitude;
	}

	private double formatDecimal(String formatacao, double valor) {
		char[] temp = String.valueOf(new DecimalFormat(formatacao).format(valor)).toCharArray();
		for (int i = 0; i < temp.length; i++) {
			if (temp[i] == ',') {
				temp[i] = '.';
			}
		}
		return Double.parseDouble(String.copyValueOf(temp));
	}

	public static double kmToMetros(double km) {
		return km * 1000;
	}

	public static double metrosToKm(double mt) {
		return mt * 0.001;
	}

	public static double kmToMiles(double km) {
		return km * 0.62137;
	}

	public static double metrosToMiles(double mt) {
		return mt * 0.000621;
	}

	/* fim utilidades */

	private double dmsToDecimal(String c) {

		String value = "";
		double pri = 0.0;
		double seg = 0.0;
		double ter = 0.0;
		char ori = '\0'; // S, N, O, W
		double res = 0.0;

		char[] coo = c.toCharArray();

		for (int i = 0; i < coo.length; i++) {
			switch (coo[i]) {
			case '°':
				pri = Double.parseDouble(value);
				value = "";
				break;
			case '\'':
				seg = Double.parseDouble(value);
				value = "";
				break;
			case '\"':
				ter = Double.parseDouble(value);
				value = "";
				break;

			default:
				value += coo[i];
				break;
			}
			ori = coo[coo.length - 1];
		}

		res = (pri + (seg / 60) + (ter / 3600)); // convertendo para decimal

		if (ori == 'S' || ori == 'O') {
			res *= -1;
		}

		/* res = (ori == 'S' || ori == 'O') ? res * -1 : res * 1; */
		return formatDecimal("#0.00000", res);
	}

	public static double getDistancia(Coordenada c1, Coordenada c2) {

		double nRadius = 6371;

		double nDLat = Math.toRadians(c1.latitude - c2.latitude);
		double nDLon = Math.toRadians(c1.longitude - c2.longitude);

		c1.latitude = Math.toRadians(c1.latitude);
		c2.latitude = Math.toRadians(c2.latitude);

		double nA = Math.pow(Math.sin(nDLat / 2), 2)
				+ Math.cos(c1.latitude) * Math.cos(c2.latitude) * Math.pow(Math.sin(nDLon / 2), 2);

		double nC = 2 * Math.atan2(Math.sqrt(nA), Math.sqrt(1 - nA));
		double nD = nRadius * nC;

		return new Coordenada().formatDecimal("#0.000", nD);
	}
}
