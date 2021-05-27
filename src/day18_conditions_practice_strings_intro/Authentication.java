package day18_conditions_practice_strings_intro;

public class Authentication {
    public static void main(String[] args) {
        int last4SSN = 4520;
        int pinCode = 1254;
        int expLast4SSN = 4520;
        int expPinCode = 1254;
        if (last4SSN == expLast4SSN && pinCode == expPinCode) {
            System.out.println("Authentication successful");
        }else {
            System.out.println("Authentication unsuccesful");
            if (last4SSN != expLast4SSN) {
                System.out.println("Last 4 SSN number is incorrect");
            }
            if (pinCode != expPinCode) {
                    System.out.println("Pin code is incorrect");
                }
            }
        }
    }


