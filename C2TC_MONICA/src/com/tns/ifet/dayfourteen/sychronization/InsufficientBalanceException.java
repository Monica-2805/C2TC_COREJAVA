package com.tns.ifet.dayfourteen.sychronization;

	public class InsufficientBalanceException extends Exception {

		/**
		 * 
		 */
		private static final long serialVersionUID = 1L;

		public InsufficientBalanceException() {
			super("Insufficient balance in your account");
		}

		public InsufficientBalanceException(String message) {
			super(message);
		}
}
