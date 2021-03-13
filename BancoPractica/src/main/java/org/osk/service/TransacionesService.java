package org.osk.service;


import org.osk.model.TransaccionesBean;

public class TransacionesService {

	
	public void deposito(TransaccionesBean bean) {
		
		TransaccionesBean transc = new TransaccionesBean();
		
		if(bean.getDepositar() <= 0) {
			System.out.println("No puedes deposistar numero negativos");
		}else if(bean.getDepositar() <= bean.getSaldo()) {
			transc.setSaldo(bean.getDepositar() + bean.getSaldo());
		}
		
		
	}
	
	public void retiros(TransaccionesBean bean) {
	
		TransaccionesBean transc = new TransaccionesBean();
		
		if(bean.getDepositar() <= 0) {
			System.out.println("No puedes deposistar numero negativos");
		}else if(bean.getRetirar() <= bean.getSaldo()) {
			transc.setSaldo(bean.getDepositar() - bean.getSaldo());
		}else {
			System.out.println("No cuenta con el saldo suficiente");
		}
		
	}
	
}
