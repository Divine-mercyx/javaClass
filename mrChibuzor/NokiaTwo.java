import java.util.Scanner;

public class NokiaTwo {
	public static void main(String... args) {
		Scanner input = new Scanner(System.in);
		mainMenu(input);

	}
	public static void mainMenu(Scanner input) {
		System.out.println("""
		Welcome to Nokia
		1. Phonebook
		2. Messages
		3. Chat
		4. Call register
		5. Tones
		6. Settings
		7. Call divert\n8. Games
		9. Calculator
		10. Reminders
		11. Clock
		12. Profiles
		13. SIM services
		14. Exit
		""");
		int choice = input.nextInt();
		switch (choice) {
			case 1: phonebookMenu(input); break;
			case 2: messageMenu(input); break;
			case 3: chatMenu(input); break;
			case 4: callRegister(input); break;
			case 5: tonesMenu(input); break;
			case 6: settingsMenu(input); break;
			case 7: callDivertMenu(input); break;
			case 8: gamesMenu(input); break;
			case 9: calculatorMenu(input); break;
			case 10: reminderMenu(input); break;
			case 11: clockMenu(input); break;
			case 12: profileMenu(input); break;
			case 13: simMenu(input); break;
			case 14: System.out.println("tun tun tuun tun ton. Bye..."); break;
			default: System.out.println("invalid input"); break;
		}
	}

	

	public static void phonebookMenu(Scanner input) {
		System.out.println("""
		\nPhonebook
		1. Search
		2. Service Nos
		3. Add name
		4. Erase
		5. Edit
		6. Assign tone
		7. Send b'card
		8. Options
		9. Speed dials
		10. Voice tags
		11. back
		""");
		int phonebookChoice = input.nextInt();
		switch (phonebookChoice) {
			case 1: System.out.println("search"); break;
			case 2: System.out.println("Service Nos"); break;
			case 3: System.out.println("Add name"); break;
			case 4: System.out.println("Erase"); break;
			case 5: System.out.println("Edit"); break;
			case 6: System.out.println("Assign tone"); break;
			case 7: System.out.println("Send b'card"); break;
			case 8: optionsPhonebook(input); break;
			case 9: System.out.println("Speed dials"); break;
			case 10: System.out.println("Voice tags"); break;
			case 11: mainMenu(input); break;
			default: System.out.println("invalid input"); break;
		}
	}

	public static void optionsPhonebook(Scanner input) {
		System.out.println("""
		\nOptions
		1. Type of view
		2. Memory status
		3. back
		""");
		int optionsMenu = input.nextInt();
		switch (optionsMenu) {
			case 1: System.out.println("Type of view"); break;
			case 2: System.out.println("Memory status"); break;
			case 3: phonebookMenu(input); break;
			default: System.out.println("invalid input"); break;
		}
	}




	public static void messageMenu(Scanner input) {
		System.out.println("""
		\nMessages
		1. Write messages
		2. Inbox
		3. Outbox
		4. Picture messages
		5. Templates
		6. Smileys
		7. Message settings
		8. Info Service
		9. Voice mail number
		10. Service command editor
		11. back
		""");
		int messageChoice = input.nextInt();
		switch (messageChoice) {
			case 1: System.out.println("Write messages"); break;
			case 2: System.out.println("Inbox"); break;
			case 3: System.out.println("Outbox"); break;
			case 4: System.out.println("Picture messages"); break;
			case 5: System.out.println("Templates"); break;
			case 6: System.out.println("Smileys"); break;
			case 7: messageSettings(input); break;
			case 8: System.out.println("Info service"); break;
			case 9: System.out.println("Voice mailbox number"); break;
			case 10: System.out.println("Service command editor"); break; 
			case 11: mainMenu(input); break;
			default: System.out.println("invalid input"); break;
		}
	}

	
	public static void messageSettings(Scanner input) {
		System.out.println("""
		\nMessage settings
		1. Set
		2. Common
		3. back
		""");
		int messageSettingsChoice = input.nextInt();
		switch (messageSettingsChoice) {
			case 1: setMenu(input); break;
			case 2: commonMenu(input); break;
			case 3: messageMenu(input); break;
			default: System.out.println("invalid input"); break;
		}
		
	}

	public static void setMenu(Scanner input) {
		System.out.println("""
		\nset
		1. Message centre Number
		2. Message sent as
		3. Message validity
		4. back	
		""");
		int setChoice = input.nextInt();
		switch (setChoice) {
			case 1: System.out.println("Message sentre Number"); break;
			case 2: System.out.println("Message sent as"); break;
			case 3: System.out.println("Message validity"); break;
			case 4: messageSettings(input); break;
			default: System.out.println("invalid input"); break;
		}
	}


	public static void commonMenu(Scanner input) {
		System.out.println("""
		\nCommon
		1. Delivery reports
		2. Reply via same centre
		3. Character support
		4. back
		""");
		int commonChoice = input.nextInt();
		switch (commonChoice) {
			case 1: System.out.println("Delivery reports"); break;
			case 2: System.out.println("Reply via same centre"); break;
			case 3: System.out.println("Character support"); break;
			case 4: messageSettings(input); break;
			default: System.out.println("invalid input"); break;
		}
	}


	public static void chatMenu(Scanner input) {
		System.out.println("""
		\nChat
		1. back
		""");
		int chatChoice = input.nextInt();
		switch (chatChoice) {
			case 1: mainMenu(input);
			default: System.out.println("invalid input"); break;
		}
	}


	public static void callRegister(Scanner input) {
		System.out.println("""
		\nCall Register
		1. Missed call
		2. Recieved calls
		3. Dialled numbers
		4. Erase recent call list
		5. Show call duration
		6. Show call costs
		7. Call cost settings
		8. prepaid credit
		9. back
		""");
		int callChoice = input.nextInt();
		switch (callChoice) {
			case 1: System.out.println("Missed call"); break;
			case 2: System.out.println("Recieved calls"); break;
			case 3: System.out.println("Dialled numbers"); break;
			case 4: System.out.println("Erase recent call list"); break;
			case 5: showCallMenu(input); break;
			case 6: showCallCostMenu(input); break;
			case 7: callCostSettingsMenu(input); break;
			case 8: System.out.println("Prepaid credit"); break;
			case 9: mainMenu(input); break;
			default: System.out.println("invalid input"); break;
		}
	}


	public static void showCallMenu(Scanner input) {
		System.out.println("""
		\nShow call duration
		1. Last Call duration
		2. All calls duration
		3. Recieved calls' duration
		4. Dialled calls' duration
		5. Clear timers
		6. back
		""");
		int showCallChoice = input.nextInt();
		switch (showCallChoice) {
			case 1: System.out.println("Last Call duration"); break;
			case 2: System.out.println("All calls duration"); break;
			case 3: System.out.println("Recieved calls' duration"); break;
			case 4: System.out.println("Dialled calls' duration"); break;
			case 5: System.out.println("Clear timers"); break;
			case 6: callRegister(input); break;
			default: System.out.println("invalid input"); break;
		}
	}


	public static void showCallCostMenu(Scanner input) {
		System.out.println("""
		\nShow call cost
		1. Last call cost
		2. All calls' cost
		3. Clear counters
		4. back
		""");
		int showCallCostChoice = input.nextInt();
		switch (showCallCostChoice) {
			case 1: System.out.println("Last Call cost"); break;
			case 2: System.out.println("All calls cost"); break;
			case 3: System.out.println("Clear counters"); break;
			case 4: callRegister(input); break;
			default: System.out.println("invalid input"); break;
		}
	}



	public static void callCostSettingsMenu(Scanner input) {
		System.out.println("""
		\nCall cost settings
		1. Call cost limit
		2. Show costs in
		3. back
		""");
		int callCostSettingsChoice = input.nextInt();
		switch (callCostSettingsChoice) {
			case 1: System.out.println("Call cost limit"); break;
			case 2: System.out.println("Show costs in"); break;
			case 3: callRegister(input); break;
			default: System.out.println("invalid input"); break;
		}
	}

	public static void prepaidCreditMenu(Scanner input) {
		System.out.println("""
		\nPrepaid credit
		1. back
		""");
		int prepaidBack = input.nextInt();
		switch (prepaidBack) {
			case 1: callRegister(input); break;
			default: System.out.println("invalid input"); break;
		}
	}



	public static void tonesMenu(Scanner input) {
		System.out.println("""
		\nTones
		1. Ringing tone
		2. Ringing volume
		3. Incoming call alert
		4. Composer
		5. Message alert tone	
		6. Keypad tones
		7. Warning and game tones
		8. Vibrating alert
		9. Screen saver
		10. back
		""");
		int tonesChoice = input.nextInt();
		switch (tonesChoice) {
			case 1: System.out.println("Ringing tone"); break;
			case 2: System.out.println("Ringing volume"); break;
			case 3: System.out.println("Incoming call alert"); break;
			case 4: System.out.println("Composer"); break;
			case 5: System.out.println("Message alert tone"); break;
			case 6: System.out.println("Keypad tones"); break;
			case 7: System.out.println("Warning and games tone"); break;
			case 8: System.out.println("Vibrating alert"); break;
			case 9: System.out.println("Screen saver"); break;
			case 10: mainMenu(input); break;
			default: System.out.println("invalid input"); break;
		}
	}

	
	public static void settingsMenu(Scanner input) {
		System.out.println("""
		\nSettings
		1. Call settings
		2. Phone settings
		3. Security settings
		4. Restore factory settings
		5. back
		""");
		int settingsChoice = input.nextInt();
		switch (settingsChoice) {
			case 1: callSettingsMenu(input); break;
			case 2: phoneSettingsMenu(input); break;
			case 3: securitySettingsMenu(input); break;
			case 4: restoreFactoryMenu(input); break;
			case 5: mainMenu(input); break;
		}
	}


	public static void callSettingsMenu(Scanner input) {
		System.out.println("""
		\nCall settings
		1. Automatic redial
		2. Speed dialling
		3. Call waiting options
		4. Own number sending
		5. Phone line in use
		6. Automatic answer
		7. back
		""");
		int callSettingsChoice = input.nextInt();
		switch (callSettingsChoice) {
			case 1: System.out.println("Automatic redial"); break;
			case 2: System.out.println("Speed dialling"); break;
			case 3: System.out.println("Call waiting options"); break;
			case 4: System.out.println("Own number sending"); break;
			case 5: System.out.println("Phone line in use"); break;
			case 6: System.out.println("Automatic answer"); break;
			case 7: settingsMenu(input); break;
			default: System.out.println("invalid input"); break;
		}
	}


	public static void phoneSettingsMenu(Scanner input) {
		System.out.println("""
		\nPhone settings
		1. Language
		2. Cell info display
		3. Welcome note
		4. Network selection
		5. Lights
		6. Confirm SIM service actions
		7. back
		""");
		int phoneSettingsChoice = input.nextInt();
		switch (phoneSettingsChoice) {
			case 1: System.out.println("Language"); break;
			case 2: System.out.println("Cell info display"); break;
			case 3: System.out.println("Welcome note"); break;
			case 4: System.out.println("Network selection"); break;
			case 5: System.out.println("Lights"); break;
			case 6: System.out.println("Confirm SIM service actions"); break;
			case 7: settingsMenu(input); break;
			default: System.out.println("invalid input"); break;

		}
	}

	
	public static void securitySettingsMenu(Scanner input) {
		System.out.println("""
		\nSecurity settings
		1. PIN code request
		2. Call barring service
		3. Closed user group
		4. Phone security
		5. Change access codes
		6. back
		""");
		int securitySettingsMenu = input.nextInt();
		switch (securitySettingsMenu) {
			case 1: System.out.println("PIN code request"); break;
			case 2: System.out.println("Call barring service"); break;
			case 3: System.out.println("Closed user group"); break;
			case 4: System.out.println("Phone security"); break;
			case 5: System.out.println("Change access codes"); break;
			case 6: settingsMenu(input); break;
			default: System.out.println("invalid input"); break;
		}
	}


	public static void restoreFactoryMenu(Scanner input) {
		System.out.println("""
		\nRestore factory settings
		1. back
		""");
		int restoreFactoryChoice = input.nextInt();
		switch (restoreFactoryChoice) {
			case 1: settingsMenu(input); break;
			default: System.out.println("invalid input"); break;
		}
	}


	public static void callDivertMenu(Scanner input) {
		System.out.println("""
		\nCall divert
		1. back
		""");
		int callDivertChoice = input.nextInt();
		switch (callDivertChoice) {
			case 1: mainMenu(input); break;
			default: System.out.println("invalid input"); break;
		}

	}


	public static void gamesMenu(Scanner input) {
		System.out.println("""
		\nGames
		1. back
		""");
		int callDivertChoice = input.nextInt();
		switch (callDivertChoice) {
			case 1: mainMenu(input); break;
			default: System.out.println("invalid input"); break;
		}

	}

	public static void calculatorMenu(Scanner input) {
		System.out.println("""
		\nCalculator
		1. back
		""");
		int calculatorChoice = input.nextInt();
		switch (calculatorChoice) {
			case 1: mainMenu(input); break;
			default: System.out.println("invalid input"); break;
		}

	}


	public static void reminderMenu(Scanner input) {
		System.out.println("""
		\nReminders
		1. back
		""");
		int reminderChoice = input.nextInt();
		switch (reminderChoice) {
			case 1: mainMenu(input); break;
			default: System.out.println("invalid input"); break;
		}

	}


	public static void clockMenu(Scanner input) {
		System.out.println("""
		\nClock
		1. Alarm clock
		2. Clock settings
		3. Date setting
		4. Stop watch
		5. Countdown timer
		6. Auto update of date and time
		7. back
		""");
		int clockChoice = input.nextInt();
		switch (clockChoice) {
			case 1: System.out.println("Alarm clock"); break;
			case 2: System.out.println("Clock settings"); break;
			case 3: System.out.println("Date setting"); break;
			case 4: System.out.println("Stop watch"); break;
			case 5: System.out.println("Countdown timer"); break;
			case 6: System.out.println("Auto update of date and time"); break;
			case 7: mainMenu(input); break;
			default: System.out.println("invalid input"); break;
		}
	}



	public static void profileMenu(Scanner input) {
		System.out.println("""
		\nProfiles
		1. back
		""");
		int profileChoice = input.nextInt();
		switch (profileChoice) {
			case 1: mainMenu(input); break;
			default: System.out.println("invalid input"); break;
		}

	}



	public static void simMenu(Scanner input) {
		System.out.println("""
		\nSIM services
		1. back
		""");
		int simChoice = input.nextInt();
		switch (simChoice) {
			case 1: mainMenu(input); break;
			default: System.out.println("invalid input"); break;
		}

	}



	
}





