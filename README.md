# pragyacontent

public void resetDebitPin(BigInteger debitCardNumber) {
		
		Boolean debitCardResult1 = debitCardDetails.containsKey(debitCardNumber);

		if (debitCardResult1) {
			System.out.println("Enter your existing pin:");
			int pin = scanner.nextInt();

			System.out.println(debitCardDetails.get(debitCardNumber).getDebitCurrentPin());
			if (pin == debitCardDetails.get(debitCardNumber).getDebitCurrentPin()) {
				System.out.println("Enter your new pin:");
				int newPin = scanner.nextInt();
				bean=debitCardDetails.get(debitCardNumber);
				bean.setDebitCurrentPin(newPin);
				debitCardDetails.replace(debitCardNumber, bean);
				System.out.println("PIN UPDATED SUCCESSFULLY!");
			} else {
				System.out.println("YOU ENTERED A WRONG PIN");
			}
		} else {
			System.out.println("INVALID DEBIT CARD NUMBER");

		}

	}
	
