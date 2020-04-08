package br.com.controleos.util;

public class GeraTabela {

	public static void main(String[] args) {

		HibernateUtil.getSessionFactory();
		HibernateUtil.getSessionFactory().close();
	}

}
