import java.util.Scanner;

public class Nokia {
	public static void main(String... args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Nokia\n\n1. Phonebook\n2. Messages\n3. Chat\n4. Call register\n5. Tones\n6. Settings\n7. Call divert\n8. Games\n9. Calculator\n10. Reminders\n11. Clock\n12. Profiles\n13. SIM services");
		int choice = input.nextInt();
		System.out.println();
		
		switch (choice) {
			case 1: 
				System.out.println("Phonebook\n\n1. Search\n2. Service Nos\n3. Add name\n4. Erase\n5. Edit\n6. Assign tone\n7. Send b'card\n8. Options\n9. Speed dials\n10. Voice tags");
				int phonebookChoice = input.nextInt();
				System.out.println();

				switch (phonebookChoice) {
					case 8: System.out.println("Options\n\n1. Type of view\n2. Memory status");
						int optionsChoice = input.nextInt();
						switch (optionsChoice) {
							case 1: System.out.println("Type of view"); break;
							case 2: System.out.println("Memory status"); break;
							default:
								System.out.println("invalid input");
						}
						break;
					default: 
						System.out.println("invalid input");
						break;
				}
				break;



			case 2:
				System.out.println("Messages\n\n1. Write messages\n2. Inbox\n3. Outbox\n4. Picture messages\n5. Templates\n6. Smileys\n7. Message settings\n8. Info Service\n9. Voice mail number\n10. Service command editor");
				int messagesChoice = input.nextInt();
				switch (messagesChoice) {
					case 7:
						System.out.println("Message settings\n\n1. Set 1\n2. Common");
						int messageSettingsChoice = input.nextInt();
						switch (messageSettingsChoice) {
							case 1: System.out.println("set 1\n\n1. Message centre Number\n2. Message sent as\n3. Message validity");
								break;
							case 2: System.out.println("Common\n\n1. Delivery reports\n2. Reply via same centre\n3. Character support");
								break;
							default: System.out.println("invalid input");
						}
						break;
				}
				break;




			case 3:
				System.out.println("Chat");
				break;
			case 4:
				System.out.println("Call Register\n\n1. Missed call\n2. Recieved calls\n3. Dialled numbers\n4. Erase recent call list\n5. Show call duration\n6. Show call costs\n7. Call cost settings\n8. prepaid credit");
				int callRegisterChoice = input.nextInt();
				switch (callRegisterChoice) {
					case 5: System.out.println("Show call duration\n\n1. Last Call duration\n2. All calls duration\n3. Recieved calls' duration\n4. Dialled calls' duration\n5. Clear timers");
					break;
					case 6: System.out.println("Show call cost\n\n1. Last call cost\n2. All calls' cost\n3. Clear counters");
					break;
					case 7: System.out.println("Call cost settings\n\n1. Call cost limit\n2. Show costs in");
					break;
					case 8: System.out.println("Prepaid credit");
					break;
					default: System.out.println("invalid input");
				}
				break;
			case 5:
				System.out.println("Tones\n\n1. Ringing tone\n2. Ringing volume\n3. Incoming call alert\n4. Composer\n5. Message alert tone\n6. Keypad tones\n7. Warning and game ones\n8. Vibrating alert\n9. Screen saver");
				break;
			case 6:
				System.out.println("Settings\n\n1. Call settings\n2. Phone settings\n3. Security settings\n4. Restore factory settings");
				int settingsChoice = input.nextInt();
				switch (settingsChoice) {
					case 1: System.out.println("Call settings\n\n1. Automatic redial\n2. Speed dialling\n3. Call waiting options\n4. Own number sending\n5. Phone line in use\n6. Automatic answer");
						break;
					case 2: System.out.println("Phone settings\n\n1. Language\n2. Cell info display\n3. Welcome note\n4. Network selection\n5. Lights\n6. Confirm SIM service actions");
						break;
					case 3: System.out.println("Security settings\n\n1. PIN code request\n3. Call barring service\n4. Closed user group\n5. Phone security\n6. Change access codes");
						break;
					case 4: System.out.println("Restore factory settings");
						break;
					default: System.out.println("invalid input");
				}
				break;
			case 7:
				System.out.println("Call divert");
				break;
			case 8:
				System.out.println("Games");
				break;
			case 9:
				System.out.println("Calculator");
				break;
			case 10:
				System.out.println("Reminders");
				break;
			case 11:
				System.out.println("Clock\n\n1. Alarm clock\n2. Clock settings\n3. Date setting\n4. Stop watch\n5. Countdown timer\n6. Auto update of date and time");
				break;
			case 12:
				System.out.println("Profiles");
				break;
			case 13:
				System.out.println("Sim services");
				break;
			default:
				System.out.println("invalid choice");
				break;
		}
	}
}