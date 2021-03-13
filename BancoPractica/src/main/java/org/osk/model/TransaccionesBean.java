package org.osk.model;

public class TransaccionesBean {

	private int saldo;
	private int depositar;
	private int retirar;
	
	public int getSaldo() {
		return saldo;
	}

	public void setSaldo(int saldo) {
		this.saldo = saldo;
	}

	public int getDepositar() {
		return depositar;
	}

	public void setDepositar(int depositar) {
		this.depositar = depositar;
	}

	public int getRetirar() {
		return retirar;
	}

	public void setRetirar(int retirar) {
		this.retirar = retirar;
	}

	@Override
	public String toString() {
		return "TransaccionesBean [saldo=" + saldo + ", depositar=" + depositar + ", retirar=" + retirar + "]";
	}
	
	
}
